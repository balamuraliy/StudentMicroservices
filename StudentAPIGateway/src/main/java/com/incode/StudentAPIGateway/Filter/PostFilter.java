//package com.incode.StudentAPIGateway.Filter;
//
//import javax.servlet.http.HttpServletResponse;
//
//import org.slf4j.Logger;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//
//public class PostFilter extends ZuulFilter {
//	
//	private static Logger log = org.slf4j.LoggerFactory.getLogger(PostFilter.class);
//
//	@Override
//	public boolean shouldFilter() {
//		return true;
//	}
//
//	@Override
//	public Object run() throws ZuulException {
//		HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
//		log.info("ErrorFilter: " + String.format("response status is %d", response.getStatus()));
//		return null;
//	}
//
//	@Override
//	public String filterType() {
//		return "Post";
//	}
//
//	@Override
//	public int filterOrder() {
//		return 3;
//	}
//
//}
