package org.tys.jspiders.jms.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.tys.jspiders.jms.entity.Gender;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GenderAnnotation {

	Gender[] gender() default{} ;
}
