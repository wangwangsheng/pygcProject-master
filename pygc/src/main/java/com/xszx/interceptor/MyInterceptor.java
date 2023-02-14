package com.xszx.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Learning makes me happy.
 * @date 2023/2/9 10:59
 */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("拦截器");
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser!=null){
            return true;
        }
        response.sendRedirect("/jsp/error.jsp");
        return false;
    }
}
