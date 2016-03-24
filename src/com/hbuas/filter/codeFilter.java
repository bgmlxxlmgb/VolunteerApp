package com.hbuas.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dell on 2016/2/24.
 */
@WebFilter(filterName = "codeFilter")
public class codeFilter implements Filter {
    protected FilterConfig filterConfig;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String charset = this.filterConfig.getInitParameter("charset");
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;
        if(charset.equals("utf-8")){
            request.setCharacterEncoding(charset);
            response.setCharacterEncoding(charset);
        }
        else{
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        this.filterConfig = config;
    }

}
