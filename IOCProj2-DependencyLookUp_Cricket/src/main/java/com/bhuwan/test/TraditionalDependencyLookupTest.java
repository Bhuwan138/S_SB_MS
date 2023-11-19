package com.bhuwan.test;

import com.bhuwan.beans.Cricketer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TraditionalDependencyLookupTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhuwan/cfgs/applicationContexts.xml");
        System.out.println("TranditionalDependencyLookupTest.main()  :: 1st IOC container creation ");
        //get target spring bean class object
        Cricketer cricketer=ctx.getBean("cktr",Cricketer.class);
        //invoke method b.methods
        cricketer.fielding();
        cricketer.bowling();
        cricketer.batting();

        //close container
        ctx.close();
    }
}
