package com.java.batsman.impl;

import org.springframework.stereotype.Component;

import com.java.batsman.Batsman;

@Component
public class Sachin implements Batsman{

	@Override
	public String specification() {
		return "1Sachin scored 8426 runs in ODI";
	}
}
