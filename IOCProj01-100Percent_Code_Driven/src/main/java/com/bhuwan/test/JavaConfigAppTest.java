package com.bhuwan.test;

import com.bhuwan.beans.WishMessageGenerator;
import com.bhuwan.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigAppTest {
    public static void main(String[] args) {
        // create IOC Container
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // get target class object
        WishMessageGenerator wishMessageGenerator = annotationConfigApplicationContext.getBean("wmg",WishMessageGenerator.class);
        // invoke business method
        System.out.println(wishMessageGenerator.generateWishMessage("Bhuwan"));

        // close container
        annotationConfigApplicationContext.close();
    }
}
