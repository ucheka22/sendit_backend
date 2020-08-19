package com.myapp.sendit.interfaces;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ResetPasswordValidator.class)
@Documented
public @interface ResetPasswordMatches {

	String message() default "Password don't match";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
