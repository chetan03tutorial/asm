package com.nataraj.lib.runner.asm;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.annotation.Annotation;


public class ConfigSelector implements ImportSelector{

    public ConfigSelector(){
        System.out.println("Initializing CONFIG_SELECTOR");
    }

    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        AnnotationAttributes attr = AnnotationAttributes.fromMap(annotationMetadata.
                getAnnotationAttributes(AppConfig.class.getName(),false));
        String[] configClazzes = attr.getStringArray("value");
        return configClazzes;
    }
}
