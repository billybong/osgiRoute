package se.rl.services.impl;

import org.apache.log4j.Logger;

import se.rl.services.api.PaymentService;

public class PaymentConductor implements PaymentService {

	private static Logger LOG = Logger.getLogger(PaymentConductor.class);
	
	public void conductPayment(double amount, String account) {
		LOG.info("Conducting payment for: " + account);
	}

}
