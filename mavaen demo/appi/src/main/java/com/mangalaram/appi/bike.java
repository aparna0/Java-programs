package com.mangalaram.appi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class bike implements Vehicle{

	public void drive() {
		System.out.println("bike ridding");
	}
}
