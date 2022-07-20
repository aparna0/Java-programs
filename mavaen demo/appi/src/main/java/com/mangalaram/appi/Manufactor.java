package com.mangalaram.appi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manufactor {

	@Autowired
	Vehicle v;
	public void dis() {
		v.drive();
	}
}
