package TemplatePattern;

public class Main {
	public static void main(String []args){
		CaffeineBeberage coffee = new Coffee();
		CaffeineBeberage tea = new Tea();

		coffee.prepareRecipe();
		tea.prepareRecipe();
	}

}