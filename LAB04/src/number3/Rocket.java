/* 2013112015 ������*/

package number3;

//Rocket class�� ���ǰ� ���� �ӽ������� ���� Rocket
class Rocket {
 private String name;
 private double price;
 private double apogee;

 Rocket(String n, double p, double a) {
    this.name = n;
    this.price = p;
    this.apogee = a;
 }

 public String getName() {
    return this.name;
 }

 public double getPrice() {
    return this.price;
 }

 public double getApogge() {
    return this.apogee;
 }

}