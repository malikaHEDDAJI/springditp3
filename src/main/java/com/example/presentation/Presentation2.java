package com.example.presentation;

import com.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*
@Configuration
@ComponentScan(basePackages = {"com.example.dao", "com.example.metier"})
public class Presentation2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Presentation2.class);

        IMetier metier = context.getBean(IMetier.class);

        System.out.println("Résultat = " + metier.calcul());
    }
}

 */

/*
@Configuration
@ComponentScan(basePackages = {"com.example.dao", "com.example.metier"})
public class Presentation2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(Presentation2.class);
        context.refresh();

        IMetier metier = context.getBean(IMetier.class);

        System.out.println("Résultat = " + metier.calcul());
    }
}

 */
@Configuration
@ComponentScan(basePackages = {"com.example.dao","com.example.metier","com.example.config"})
public class Presentation2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        // Choix 1 (profils) : décommenter un profil pour tester
        // ctx.getEnvironment().setActiveProfiles("dev");   // -> DaoImpl2 (150) => 300
        // ctx.getEnvironment().setActiveProfiles("prod");  // -> DaoImpl  (100) => 200
        // ctx.getEnvironment().setActiveProfiles("file");  // -> DaoFile  (180) => 360
        // ctx.getEnvironment().setActiveProfiles("api");   // -> DaoApi   (220) => 440

        // Choix 2 (propriété externe) : laisser les profils vides,
        // PropertyDrivenConfig créera un bean "dao" selon app.properties

        ctx.register(Presentation2.class);
        ctx.refresh();

        IMetier metier = ctx.getBean(IMetier.class);
        System.out.println("Résultat = " + metier.calcul());
        ctx.close();
    }
}