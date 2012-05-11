package se.rl.pong.impl;

import se.rl.pong.api.PongService;

public class PongImpl implements PongService {
	
	private final String response;
	
	public PongImpl(String response) {
		this.response = response;
	}

	@Override
	public String bounceBack(String s) {
		return s + ", " + response;
	}

}
