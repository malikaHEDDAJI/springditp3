package com.example.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
/*
@Component("dao")
@Profile("api")
public class DaoApi implements IDao {
    @Override
    public double getValue() {
        System.out.println("Version api");
        return 220.0;
    }
}

 */

@Component("daoApi")
@Profile("api")
public class DaoApi implements IDao {
    @Override public double getValue(){ return 220.0; }
}