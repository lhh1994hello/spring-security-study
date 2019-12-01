package com.imooc.security.demo.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by lhh on 2019/12/1 18:45
 *
 * @Description:
 */
public class TimeFilter implements Filter {
    @Override
    public void destroy() {
        System.out.println("time filter destroy");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println();
        System.out.println("time filter init");
    }
}
