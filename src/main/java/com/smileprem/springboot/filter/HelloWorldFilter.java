package com.smileprem.springboot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldFilter implements Filter {


  @Override
  public void destroy() {
    // TODO Auto-generated method stub
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
    System.out.println("Hello World Filter - START");
    chain.doFilter(servletRequest, servletResponse);
    System.err.println("After chain.doFilter()");
    System.out.println("Hello World Filter - CONTINUES");
    System.out.println("Post processing logic, usually on response");
    System.out.println("Hello World Filter - END");
  }

  @Override
  public void init(FilterConfig arg0) throws ServletException {
    // TODO Auto-generated method stub

  }

}
