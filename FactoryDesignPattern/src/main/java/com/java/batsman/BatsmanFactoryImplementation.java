package com.java.batsman;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.batsman.constants.BatsmanTypeConstants;
import com.java.batsman.impl.Dhoni;
import com.java.batsman.impl.Raina;
import com.java.batsman.impl.Sachin;
import com.java.batsman.impl.YuvrajSingh;

@Service
public class BatsmanFactoryImplementation {

	@Autowired
	private Dhoni msd;
	@Autowired
	private Sachin sachin;
	@Autowired
	private YuvrajSingh Yuvi;
	@Autowired
	private Raina sr;

	private static final Map<String, Batsman> handler = new HashMap<String, Batsman>();

	@PostConstruct
	private Map<String, Batsman> getObject() {
		handler.put(BatsmanTypeConstants.Dhoni,msd);
		handler.put(BatsmanTypeConstants.Raina, sr);
		handler.put(BatsmanTypeConstants.Sachin, sachin);
		handler.put(BatsmanTypeConstants.YuvrajSingh, Yuvi);
		return handler;
	}

	public static Batsman createInstance(String batsman) throws Exception {
		return Optional.ofNullable(handler.get(batsman)).orElseThrow(() -> new IllegalArgumentException("Invalid Batsman"));
	}

}
