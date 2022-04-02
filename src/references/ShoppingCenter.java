package references;

public class ShoppingCenter {
public void method1(Product p1,int a) {
	a=20;
	p1.name="iphone";
	method2(p1,a);
}
public void method2(Product p2,int b) {
	b=30;
	p2.name="samsung";
	p2=new Product();
	method3(p2,b);
}
public void method3(Product p3,int c) {
	c=30;
	p3.name="moto";
}
}
