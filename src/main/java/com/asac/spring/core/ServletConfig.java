//package com.asac.spring.core;
//
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//public class ServletConfig implements WebMvcConfigurer {
//
//    private static final String[] CLASSPATH_PATH_PATTERNS = {"swagger-ui.html","/webjars/**"};
//    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {"classpath:/META-INF/resources","classpath:/META-INF/resources/webjars/"};
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//       // WebMvcConfigurer.super.addResourceHandlers(registry);
//        registry.addResourceHandler(CLASSPATH_PATH_PATTERNS).addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
//
//    }
//
//    // ROOT "/" 진입시 /swagger-ui.html 쪽으로 리다이렉트 처리
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        //WebMvcConfigurer.super.addViewControllers(registry);
//        registry.addViewController("/").setViewName("redirect:/swagger-ui.html");
//    }
//}
