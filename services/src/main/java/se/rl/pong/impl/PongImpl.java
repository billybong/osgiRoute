package se.rl.pong.impl;

import se.rl.pong.api.PongService;

public class PongImpl implements PongService {
	
	private final String response;
	
	public PongImpl(String response) {
		this.response = response;
	}

	@Override
	public String bounceBack(String request) {
		return String.format("%s , %s", request, response);
	}
}
