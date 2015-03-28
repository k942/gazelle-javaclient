package io.gazelle.policies;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public enum WhatcdRequestPolicy implements Policy {
	INSTANCE;

	private static final Logger LOGGER = Logger.getLogger(WhatcdRequestPolicy.class);

	private static final int MAX_REQUEST = 5;
	private static final long TIME_LIMIT = TimeUnit.SECONDS.toMillis(10);

	private volatile static long timeLastReset = 0;
	private volatile static int nbRequestInTimeLimit = 0;

	private WhatcdRequestPolicy() {

	}

	private boolean isRequestLimited() {
		long timeNow = System.currentTimeMillis();
		long durationSinceLastReset = timeNow - timeLastReset;
		if (durationSinceLastReset > TIME_LIMIT) {
			timeLastReset = timeNow;
			nbRequestInTimeLimit = 0;
		}
		return nbRequestInTimeLimit >= MAX_REQUEST;
	}

	public void enforce() {
		while (isRequestLimited()) {
			try {
				LOGGER.trace("Refrain from making more than five (5) requests every ten (10) seconds. "
						+ "Sleeping a while (500ms), to enforce this rule.");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		nbRequestInTimeLimit++;
	}

}
