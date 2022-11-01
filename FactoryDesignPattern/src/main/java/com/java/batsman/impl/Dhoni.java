package com.java.batsman.impl;

import org.springframework.stereotype.Component;

import com.java.batsman.Batsman;


@Component
public class Dhoni implements Batsman{

	@Override
	public String specification() {
		return "M.S.Dhoni Scored 10599 runs in ODI";
	}

}
