package com.example.aop.dao;

import com.example.aop.User;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    private String serviceCode;

    public String addAccount(User user, boolean temp1, Boolean temp2) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
        return "ble";
    }


    public String getServiceCode() {
        System.out.println(getClass() + ": getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
