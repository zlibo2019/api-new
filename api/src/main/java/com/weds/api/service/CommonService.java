package com.weds.api.service;


import com.weds.core.base.BaseService;
import com.weds.core.utils.ImageUtils;
import com.weds.api.constant.ScmParams;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import java.io.*;


/**
 * @Author sxm
 * @Description
 * @Date 2018-12-13
 */
@Service
public class CommonService extends BaseService {
    @Resource
    private ScmParams scmParams;

    public void makeFctFile(long userSerial) {
        if ("1".equals(scmParams.getFaceType())) {
            try {
                String photoPath = scmParams.getRootPath() + File.separator
                        + scmParams.getFacePath() + File.separator + userSerial / 1000 + File.separator + userSerial + ".jpg";
                ImageUtils.makeFct(photoPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            // //执行cmd命令生成fct文件
            // String commandStr = scmParams.getToolPath() + File.separator + "make_photo_face.exe " + scmParams.getRootPath() + File.separator
            //         + scmParams.getFacePath() + File.separator + userSerial / 1000 + File.separator + userSerial + ".jpg";
            // RunUtils.run(commandStr);
        }
    }

    public void makeFctFile(String photoPath) {
        if ("1".equals(scmParams.getFaceType())) {
            //执行cmd命令生成fct文件
            try {
                ImageUtils.makeFct(photoPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            // String commandStr = scmParams.getToolPath() + File.separator + "make_photo_face.exe " + photoPath;
            // RunUtils.run(commandStr);
        }
    }

//    public boolean checkRight(String param) {
//        if (param == null || "0".equals(weiXinParams.getMode())) {
//            return true;
//        }
//        try {
//            String strInfo = RSACoder.decryptByPublicKey(Coder.decryptBASE64(param), settingParams.getPubKey());
//            String[] infos = strInfo.split("#");
//            if (infos.length > 1) {
//                long temp = Long.parseLong(infos[0]) + Long.parseLong(infos[1]);
//                return System.currentTimeMillis() <= temp;
//            } else {
//                return false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    public void exportExcel(List<RptColEntity> colList, List<? extends ExportRptEntity> entityList,
//                            String title, HttpServletResponse response) {
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            JSONArray dataList = JSONArray.parseArray(mapper.writeValueAsString(entityList));
//            ExcelUtils excelUtils = new ExcelUtils();
//            excelUtils.createWorkBook();
//
//            // 标题
//            int cols = getAllColNums(colList);
//            if (StringUtils.isBlank(title)) {
//                excelUtils.createWorkSheet("Export");
//            } else {
//                excelUtils.createWorkSheet(title);
//                excelUtils.mergeCells(0, 0, cols - 1, 0);
//                Font font = excelUtils.createFont();
//                font.setFontHeightInPoints((short) 15);
//                excelUtils.addText(0, 0, title, excelUtils.createCellStyle(1, 1, font));
//            }
//
//            // 表头
//            int maxNum = getMaxRowNum(colList);
//            setRptColumn(excelUtils, colList, maxNum, 1, 0);
//
//            // 数据
//            int rowidx = maxNum + 1;
//            List<RptColEntity> fmtColList = getFmtColList(colList);
//            for (int i = 0; i < dataList.size(); i++) {
//                JSONObject jsonObject = dataList.getJSONObject(i);
//                for (int j = 0; j < fmtColList.size(); j++) {
//                    String prop = fmtColList.get(j).getProp();
//                    excelUtils.addText(j, rowidx + i, getProp(prop, jsonObject),
//                            createCellStyle(excelUtils, fmtColList.get(j).getAlign()));
//                }
//            }
//
//            for (int i = 0; i < colList.size(); i++) {
//                if (!StringUtils.isBlank(colList.get(i).getWidth())) {
//                    int width = Integer.parseInt(colList.get(i).getWidth().replace("px", "")) * 1214 / 10000;
//                    excelUtils.setColWidth(i, width);
//                } else {
//                    excelUtils.setColWidth(i, -1);
//                }
//            }
//
//            String path = settingParams.getTempDir() + File.separator + "excel" + File.separator;
//            File dir = new File(path);
//            if (!dir.exists() || dir.isFile()) {
//                dir.mkdirs();
//            }
//            String fileName = (StringUtils.isBlank(title) ? "" : (title + "_")) + StringUtils.getUUID() + ".xlsx";
//            String filePath = path + fileName;
//            excelUtils.getExcelFile(filePath);
//
//            OutputStream outputStream = response.getOutputStream();
//            IOUtils.copy(new FileInputStream(filePath), outputStream);
//            outputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            response.setContentType("text/html;charset=UTF-8");
//            PrintWriter pw;
//            try {
//                pw = response.getWriter();
//                // |导出失败
//                pw.write("601");
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            }
//        }
//    }
//
//    private int setRptColumn(ExcelUtils excelUtils, List<RptColEntity> colList, int maxNum, int rowNum, int colNum) throws Exception {
//        int temp1 = 0;
//        int temp2 = 0;
//        for (int i = 0; i < colList.size(); i++) {
//            int tempCol = i + colNum + temp2;
//            int tempRow = rowNum;
//            List<RptColEntity> list = colList.get(i).getChild();
//            if (list != null && list.size() > 0) {
//                if (temp2 > 0) {
//                    tempCol = tempCol - 1;
//                }
//                temp2 = setRptColumn(excelUtils, list, maxNum, tempRow + 1, tempCol);
//                excelUtils.mergeCells(tempCol, tempRow, tempCol + temp2 - 1, tempRow);
//                excelUtils.addText(tempCol, tempRow, colList.get(i).getLabel(),
//                        createCellStyle(excelUtils, colList.get(i).getHeaderAlign()));
//                for (int j = 0; j < temp2 - 1; j++) {
//                    excelUtils.addText(tempCol + j + 1, tempRow, null, excelUtils.createCellStyle(1));
//                }
//            } else {
//                if (maxNum > rowNum) {
//                    excelUtils.mergeCells(tempCol, rowNum, tempCol, maxNum);
//                    for (int j = 0; j < maxNum - rowNum; j++) {
//                        excelUtils.addText(tempCol, rowNum + j + 1, null, excelUtils.createCellStyle(1));
//                    }
//                }
//                excelUtils.addText(tempCol, rowNum, colList.get(i).getLabel(),
//                        createCellStyle(excelUtils, colList.get(i).getHeaderAlign()));
//                temp1++;
//            }
//        }
//        return temp1 + temp2;
//    }
//
//    private int getMaxRowNum(List<RptColEntity> colList) {
//        int num = 0;
//        for (RptColEntity rptColEntity : colList) {
//            List<RptColEntity> list = rptColEntity.getChild();
//            num = Math.max(num, 1);
//            if (list != null && list.size() > 0) {
//                num = num + getMaxRowNum(list);
//            }
//        }
//        return num;
//    }
//
//    private List<RptColEntity> getFmtColList(List<RptColEntity> colList) {
//        List<RptColEntity> fmtColList = new ArrayList<>();
//        for (RptColEntity rptColEntity : colList) {
//            List<RptColEntity> list = rptColEntity.getChild();
//            if (list != null && list.size() > 0) {
//                fmtColList.addAll(getFmtColList(list));
//            } else {
//                fmtColList.add(rptColEntity);
//            }
//        }
//        return fmtColList;
//    }
//
//    private int getAllColNums(List<RptColEntity> colList) {
//        int num = 0;
//        for (RptColEntity rptColEntity : colList) {
//            List<RptColEntity> list = rptColEntity.getChild();
//            if (list != null && list.size() > 0) {
//                num = num + getAllColNums(list);
//            } else {
//                num++;
//            }
//        }
//        return num;
//    }
//
//    private Object getProp(String prop, JSONObject jsonObject) {
//        Object obj = null;
//        if (!StringUtils.isBlank(prop)) {
//            String[] props = prop.split("\\.");
//            for (String str : props) {
//                Object temp = jsonObject.get(str);
//                if (temp instanceof JSONObject) {
//                    jsonObject = (JSONObject) temp;
//                } else {
//                    obj = jsonObject.getString(str);
//                }
//            }
//        }
//        return obj;
//    }
//
//    private CellStyle createCellStyle(ExcelUtils excelUtils, String align) {
//        if (StringUtils.isBlank(align)) {
//            align = "center";
//        }
//
//        CellStyle cellStyle;
//        switch (align.toLowerCase()) {
//            case "left":
//                cellStyle = excelUtils.createCellStyle(1, 0);
//                break;
//            case "right":
//                cellStyle = excelUtils.createCellStyle(1, 2);
//                break;
//            default:
//                cellStyle = excelUtils.createCellStyle(1, 1);
//                break;
//        }
//        return cellStyle;
//    }
}

