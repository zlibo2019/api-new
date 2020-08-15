package com.weds.api.util;

import com.weds.core.utils.StringUtils;
import com.weds.core.utils.coder.Coder;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.ImageObserver;
import java.awt.image.Kernel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.commons.io.IOUtils;

public class ImageUtils {
    public ImageUtils() {
    }

    public static String byteToFile(byte[] bytes, String fileName, String type, String path, String root) throws Exception {
        if (StringUtils.isBlank(fileName)) {
            fileName = Coder.md5Hex(bytes).toUpperCase();
        }

        if (StringUtils.isBlank(root)) {
            root = ".";
        }

        String fullPath;
        if (!StringUtils.isBlank(path)) {
            fullPath = root + File.separator + path + File.separator;
        } else {
            fullPath = root + File.separator;
        }

        File dir = new File(fullPath);
        if (!dir.isDirectory() || !dir.exists()) {
            dir.mkdirs();
        }

        String filePath = fullPath + fileName + "." + type;
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            file.deleteOnExit();
        }

        FileOutputStream fos = new FileOutputStream(file);
        IOUtils.write(bytes, fos);
        fos.close();
        return filePath;
    }

    public static String byteToFile(byte[] bytes, String fileName, String type, String path) throws Exception {
        return byteToFile(bytes, fileName, type, path, (String)null);
    }

    public static String byteToFile(byte[] bytes, String type, String path) throws Exception {
        return byteToFile(bytes, (String)null, type, path, (String)null);
    }

    public static String base64ToFile(String img, String fileName, String type, String path, String root) throws Exception {
        if (img.startsWith("data:image")) {
            img = img.substring(img.indexOf("base64") + 7);
        }

        byte[] bytes = Coder.decryptBASE64(img);
        return byteToFile(bytes, fileName, type, path, root);
    }

    public static String base64ToFile(String img, String fileName, String type, String path) throws Exception {
        return base64ToFile(img, fileName, type, path, (String)null);
    }

    public static String base64ToFile(String img, String type, String path) throws Exception {
        return base64ToFile(img, (String)null, type, path, (String)null);
    }

    public static String fileToBase64(String path) throws Exception {
        File file = new File(path);
        if (!file.isDirectory() && file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            byte[] bytes = IOUtils.toByteArray(fis);
            fis.close();
            return Coder.encryptBASE64(bytes);
        } else {
            return null;
        }
    }

    public static String imgToBase64(String path) throws Exception {
        String fmt = "data:image/%s;base64,%s";
        File file = new File(path);
        if (!file.isDirectory() && file.exists()) {
            String type = path.substring(path.lastIndexOf(".") + 1).toLowerCase();
            String base64 = fileToBase64(path);
            return String.format(fmt, type, base64);
        } else {
            return null;
        }
    }

    public static String byteToImageScale(byte[] bytes, String fileName, String type, String path, String root, int minLen) throws Exception {
        if (StringUtils.isBlank(fileName)) {
            fileName = Coder.md5Hex(bytes).toUpperCase();
        }

        if (StringUtils.isBlank(root)) {
            root = ".";
        }

        String fullPath;
        if (!StringUtils.isBlank(path)) {
            fullPath = root + File.separator + path + File.separator;
        } else {
            fullPath = root + File.separator;
        }

        File dir = new File(fullPath);
        if (!dir.isDirectory() || !dir.exists()) {
            dir.mkdirs();
        }

        String filePath = fullPath + fileName + "." + type;
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            file.deleteOnExit();
        }

        if (minLen <= 0) {
            throw new IllegalArgumentException();
        } else {
            Image resizedImage = null;
            ImageIcon ii = new ImageIcon(bytes);
            Image i = ii.getImage();
            int iWidth = i.getWidth((ImageObserver)null);
            int iHeight = i.getHeight((ImageObserver)null);
            int maxTemp = Math.max(iHeight, iWidth);
            if (maxTemp > minLen) {
                if (iWidth > iHeight) {
                    resizedImage = i.getScaledInstance(minLen, minLen * iHeight / iWidth, 4);
                } else {
                    resizedImage = i.getScaledInstance(minLen * iWidth / iHeight, minLen, 4);
                }
            } else {
                resizedImage = i.getScaledInstance(iWidth, iHeight, 4);
            }

            Image temp = (new ImageIcon(resizedImage)).getImage();
            BufferedImage bufferedImage = new BufferedImage(temp.getWidth((ImageObserver)null), temp.getHeight((ImageObserver)null), 1);
            Graphics g = bufferedImage.createGraphics();
            g.setColor(Color.white);
            g.fillRect(0, 0, temp.getWidth((ImageObserver)null), temp.getHeight((ImageObserver)null));
            g.drawImage(temp, 0, 0, (ImageObserver)null);
            g.dispose();
            float softenFactor = 0.05F;
            float[] softenArray = new float[]{0.0F, softenFactor, 0.0F, softenFactor, 1.0F - softenFactor * 4.0F, softenFactor, 0.0F, softenFactor, 0.0F};
            Kernel kernel = new Kernel(3, 3, softenArray);
            ConvolveOp cOp = new ConvolveOp(kernel, 1, (RenderingHints)null);
            bufferedImage = cOp.filter(bufferedImage, (BufferedImage)null);
            OutputStream out = new FileOutputStream(file);
            ImageIO.write(bufferedImage, type, out);
            out.close();
            return filePath;
        }
    }

    public static String byteToImageScale(byte[] bytes, String type, String path, String root, int minLen) throws Exception {
        return byteToImageScale(bytes, (String)null, type, path, root, minLen);
    }

    public static void makeFct(String inFile) throws IOException {
        int[] head = new int[]{1, 39, 81, 116, 1, 0, 0, 0, 0, 0, 0, 0};
        File file = new File(inFile);
        String path = file.getParent();
        String name = file.getName();
        String fctName;
        if (name.contains("_")) {
            fctName = name.substring(0, name.indexOf("_")) + ".fct";
        } else {
            fctName = name.substring(0, name.indexOf(".")) + ".fct";
        }

        String outFile = path + File.separator + fctName;
        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = new FileOutputStream(outFile);
        long len = file.length();
        head[8] = (int)(len % 256L);
        head[9] = (int)(len / 256L % 256L);
        head[10] = (int)(len / 256L / 256L % 256L);
        head[11] = (int)(len / 256L / 256L / 256L % 256L);
        int[] var11 = head;
        int byteRead = head.length;

        for(int var13 = 0; var13 < byteRead; ++var13) {
            int i = var11[var13];
            outputStream.write(i);
        }

        byte[] buffer = new byte[1024];

        while((byteRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, byteRead);
        }

        outputStream.flush();
        inputStream.close();
        outputStream.close();
    }

    public static void markImgMark(String watermarkUrl, String source, String output) throws IOException {
        File file = new File(source);
        Image img = ImageIO.read(file);
        int width = img.getWidth((ImageObserver)null);
        int height = img.getHeight((ImageObserver)null);
        BufferedImage bi = new BufferedImage(width, height, 1);
        Graphics2D g = bi.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img.getScaledInstance(width, height, 4), 0, 0, (ImageObserver)null);
        ImageIcon imgIcon = new ImageIcon(watermarkUrl);
        Image con = imgIcon.getImage();
        float clarity = 0.6F;
        g.setComposite(AlphaComposite.getInstance(10, clarity));
        g.drawImage(con, 10, 10, (ImageObserver)null);
        g.setComposite(AlphaComposite.getInstance(3));
        g.dispose();
        File sf = new File(output);
        ImageIO.write(bi, "jpg", sf);
        System.out.println("添加图片水印成功");
    }

    public static void addWatermark(String sourceImg, String targetImg, String watermark, Color fontColor, Font font, Color bgColor) throws IOException {
        File srcImgFile = new File(sourceImg);
        Image srcImg = ImageIO.read(srcImgFile);
        int srcImgWidth = srcImg.getWidth((ImageObserver)null);
        int srcImgHeight = srcImg.getHeight((ImageObserver)null);
        BufferedImage bufImg = new BufferedImage(srcImgWidth, srcImgHeight, 1);
        Graphics2D g = bufImg.createGraphics();
        g.drawImage(srcImg, 0, 0, srcImgWidth, srcImgHeight, (ImageObserver)null);
        g.setComposite(AlphaComposite.getInstance(10, 0.6F));
        g.setFont(font);
        int fontHeight = g.getFontMetrics(g.getFont()).getHeight();
        int ascent = g.getFontMetrics(g.getFont()).getAscent();
        g.setColor(bgColor);
        int maxLine = watermark.split("\n").length;
        g.fillRect(0, srcImgHeight - maxLine * fontHeight + 2, srcImgWidth, maxLine * fontHeight);
        g.setColor(fontColor);
        drawString(g, watermark, (float)fontHeight, (float)srcImgWidth, maxLine, 0.0F, (float)(srcImgHeight - maxLine * fontHeight + ascent));
        g.dispose();
        FileOutputStream outImgStream = new FileOutputStream(targetImg);
        ImageIO.write(bufImg, "jpg", outImgStream);
        System.out.println("添加水印完成");
        outImgStream.flush();
        outImgStream.close();
    }

    public static void addWatermark(String sourceImg, String targetImg, String watermark) throws IOException {
        Font font = new Font((String)null, 1, 20);
        addWatermark(sourceImg, targetImg, watermark, Color.BLACK, font, Color.WHITE);
    }

    private static void drawString(Graphics2D g, String text, float lineHeight, float maxWidth, int maxLine, float left, float top, boolean trim, boolean lineIndent) {
        if (text != null && text.length() != 0) {
            if (trim) {
                text = text.replaceAll("\\n+", "\n").trim();
            }

            if (lineIndent) {
                text = "　　" + text.replaceAll("\\n", "\n　　");
            }

            drawString(g, text, lineHeight, maxWidth, maxLine, left, top);
        }
    }

    private static void drawString(Graphics2D g, String text, float lineHeight, float maxWidth, int maxLine, float left, float top) {
        if (text != null && text.length() != 0) {
            FontMetrics fm = g.getFontMetrics();
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < text.length(); ++i) {
                char c = text.charAt(i);
                sb.append(c);
                int stringWidth = fm.stringWidth(sb.toString());
                if (c == '\n' || (float)stringWidth > maxWidth) {
                    if (c == '\n') {
                        ++i;
                    }

                    if (maxLine > 1) {
                        g.drawString(text.substring(0, i), left, top);
                        drawString(g, text.substring(i), lineHeight, maxWidth, maxLine - 1, left, top + lineHeight);
                    } else {
                        g.drawString(text.substring(0, i - 1) + "…", left, top);
                    }

                    return;
                }
            }

            g.drawString(text, left, top);
        }
    }
}
