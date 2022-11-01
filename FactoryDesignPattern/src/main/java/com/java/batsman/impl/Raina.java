package com.java.batsman.impl;

import org.springframework.stereotype.Component;

import com.java.batsman.Batsman;

@Component
public class Raina implements Batsman {

	@Override
	public String specification() {
		return "Raina Scored 5615 runs in ODI";
	}

}
