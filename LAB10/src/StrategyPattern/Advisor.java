package StrategyPattern;

public interface Advisor {

	boolean hasItem();

	Firework recommend(Customer customer);

}
