package com.example.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public String addAccount() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
        return "ble";
    }
}
