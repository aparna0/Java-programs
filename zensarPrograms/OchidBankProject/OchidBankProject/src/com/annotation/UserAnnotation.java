package com.annotation;
import java.lang.annotation.*;

@Target(ElementType.METHOD)      //for signup method

@Retention(RetentionPolicy.RUNTIME)

public @interface UserAnnotation{
	String name();
	int no();
}