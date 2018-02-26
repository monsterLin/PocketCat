package com.monsterlin.PocketCat.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author : monsterLin
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @blog : https://monsterlin.com/
 * @desc : 过滤器规则
 * @date : 2017/12/3
 */
public class PcFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //得到ServletRequest对象
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        //获取请求的URI
        System.out.println("[O(∩_∩)O==>> MyFilter->Url  ]" + request.getRequestURI());
        //执行过滤器
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
