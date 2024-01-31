package com.example.validationdemo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    public String value() default "CPU";

    public String message() default "must start with CPU";

    public Class<?>[] groups() default {};

    public Class<? extends Payload> [] payload() default {};
}
