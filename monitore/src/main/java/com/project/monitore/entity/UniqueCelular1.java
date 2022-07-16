package com.project.monitore.entity;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.project.monitore.repository.UniqueCelular1Validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UniqueCelular1Validator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueCelular1 {
    String message() default "Celular já registrado anteriormente";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
