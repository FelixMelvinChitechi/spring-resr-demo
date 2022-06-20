package com.luv2code.springdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//previous class created
		return new Class[] {DemoAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		//map to the root path
		return new String[] {"/"};
	}

}
