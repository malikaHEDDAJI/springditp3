package com.example.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
/*
@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        return 150.0;
    }
}

 */
/*
@Component("dao2")
@Profile("dev")
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        System.out.println("Version de développement");
        return 150.0;
    }
}

 */
// dao/DaoImpl2.java (150.0, profil dev)

@Primary
@Component("dao2")
@Profile("dev")
public class DaoImpl2 implements IDao {
    @Override public double getValue(){ return 150.0; }
}