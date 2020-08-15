package com.weds.api.filter;

import com.alibaba.fastjson.JSONObject;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component("authControllerFilter")
@Order(Ordered.LOWEST_PRECEDENCE)
public class AuthControllerFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request1, ServletResponse response1, FilterChain chain) throws IOException,
            ServletException {
        Object jwtData = request1.getAttribute("jwtData");
        if (jwtData != null) {
            JSONObject json = JSONObject.parseObject(jwtData.toString());
            request1.setAttribute("loginUserId",json.get("loginUserId"));
        }
        chain.doFilter(request1, response1);
    }

    public void init(FilterConfig arg0) throws ServletException {
    }
}
