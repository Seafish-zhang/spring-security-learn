package com.colin.filter;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * created with IntelliJ IDEA.
 * author: zhy
 * date: 2018/3/28 0028
 * time: 下午 14:52
 * description:
 */
public class BeforeLoginInFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("receive servletRequest :" + servletRequest.getRemoteHost());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
