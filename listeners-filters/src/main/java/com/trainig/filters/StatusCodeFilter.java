package com.trainig.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class StatusCodeFilter
 */
@WebFilter("/*")
public class StatusCodeFilter implements Filter {

    /**
     * Default constructor. 
     */
    public StatusCodeFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		HttpServletRequest req = (HttpServletRequest)request;
		System.out.println(req.getRequestURI());
		System.out.println(req.getRemoteHost().toString());
		
		if(req.getAttribute("user")==null) {
			
		req.setAttribute("user", "guest");
		}
		System.out.println("user:="+req.getAttribute("user"));
		chain.doFilter(request, response);
		
		HttpServletResponse resp = (HttpServletResponse)response;
		
		resp.setStatus(200);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
