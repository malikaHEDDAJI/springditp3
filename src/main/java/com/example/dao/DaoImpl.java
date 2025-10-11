package com.example.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/*
@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        return 100.0;
    }
}

 */
/*
@Component("dao")
@Profile("prod")
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        System.out.println("Version de production");
        return 100.0;
    }
}

 */

// dao/DaoImpl.java (100.0, profil prod)

@Component("dao")
@Profile("prod")
public class DaoImpl implements IDao {
    @Override public double getValue(){ return 100.0; }
}

