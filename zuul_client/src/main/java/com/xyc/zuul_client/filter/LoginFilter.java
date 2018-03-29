package com.xyc.zuul_client.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.set("isSuccess", true);
        ctx.setSendZuulResponse(true);
        ctx.setResponseBody("{\"ok\":\"no\"}");
        ctx.getResponse().setContentType("application/json; charset=utf-8");
        return null;
    }
}