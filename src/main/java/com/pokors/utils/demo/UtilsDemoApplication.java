package com.pokors.utils.demo;

import javax.xml.bind.JAXB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.ComplexRestriction;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.ComplexType;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.SimpleRestriction;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.SimpleRestrictionModel;

@SpringBootApplication
public class UtilsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UtilsDemoApplication.class, args);
    }
}
