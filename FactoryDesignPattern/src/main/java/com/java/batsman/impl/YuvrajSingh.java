package com.java.batsman.impl;

import org.springframework.stereotype.Component;

import com.java.batsman.Batsman;

@Component
public class YuvrajSingh implements Batsman {

	@Override
	public String specification() {
		return "Yuvraj Singh scored 8609 runs in ODI";
	}

}
