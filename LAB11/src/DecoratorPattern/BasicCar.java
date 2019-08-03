/* 2013112015 ÀÓÁø¼· */

package DecoratorPattern;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}