package com.example.aop;

import com.example.aop.dao.AccountDAO;
import com.example.aop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        accountDAO.addAccount(new User("tom", "jakistam"), true, false);
        membershipDAO.addAccount();

        accountDAO.getServiceCode();
        accountDAO.setServiceCode("code");

        System.out.println("xxxx");
        context.close();
    }
}
