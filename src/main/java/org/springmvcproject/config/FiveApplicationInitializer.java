package org.sprinmvcproject.config;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class FiveApplicationInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        //XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
        //webApplicationContext.setConfigLocation("classpath:frontController-servlet.xml");

        AnnotationConfigWebApplicationContext webApplicationContext1 = new AnnotationConfigWebApplicationContext();
        webApplicationContext1.register(ApplicationConfig.class);

         //Creating a dispatcher servlet object
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext1);
//
        // Registering Dispatcher Servlet with Servlet
        // Context
        ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("kiranBhavya", dispatcherServlet);

        // Setting load on startup
        myCustomDispatcherServlet.setLoadOnStartup(1);

        // Adding mapping url
        myCustomDispatcherServlet.addMapping("/*");

    }
}
