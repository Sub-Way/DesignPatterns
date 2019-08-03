package StrategyPattern;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class Customer {
	private Advisor advisor;

	int BIG_SPENDER_DOLLARS;

	public boolean isRegistered() {
		return false;
	}

	public double spendingSince(Date date) {
		return 10.0;
	}

	private Advisor getAdvisor() {
		if (advisor == null) {
			if (PromotionAdvisor.singleton.hasItem()) {
				advisor = PromotionAdvisor.singleton;
			} else if (isRegistered()) {
				advisor = GroupAdvisor.singleton;
			} else if (isBigSpender()) {
				advisor = ItemAdvisor.singleton;
			} else {
				advisor = RandomAdvisor.singleton;
			}
		}

		return advisor;
	}

	public Firework getRecommended() {
		return getAdvisor().recommend(this);
	}

	private boolean isBigSpender() {
		return false;
	}

	public static void main(String[] args) throws Exception {
		new Customer().getRecommended();
	}
}
