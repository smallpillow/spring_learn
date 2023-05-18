package com.sun.imports;

import com.sun.beans.OtherBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(ComponentScan.class.getName());
        annotationAttributes.forEach((attrName, attrValue)->{
            System.out.println(attrName+"==="+attrValue);
        });
        // importingClassMetadata 当前对象使用Import注解的类上的其他注解
        return new String[]{OtherBean.class.getName()};
    }
}
