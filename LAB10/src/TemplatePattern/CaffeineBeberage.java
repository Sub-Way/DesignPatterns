/* 2013112015 ¿”¡¯º∑ */

package TemplatePattern;

public abstract class CaffeineBeberage {
     
    public CaffeineBeberage() {
    }
     
    private void boilWater() {
        System.out.println("Boiling water");
    }
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
     
    protected abstract void steepOrbrew();
    protected abstract void addSomething();
 
    public void prepareRecipe() {
    	boilWater();
    	pourInCup();
    	steepOrbrew();
    	addSomething();
    }
 
}