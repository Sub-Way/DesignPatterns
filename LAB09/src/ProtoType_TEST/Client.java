package ProtoType_TEST;
/* 2013112015 ¿”¡¯º∑ */

public class Client {

	public static void main(String[] args) {

		String TEST = "TEST";
		
		MessageBox underbox =  new MessageBox("_");
		MessageBox starbox =  new MessageBox("*");

		PrototypeService service = new PrototypeService();
		
		service.register("underbox", underbox);
		service.register("starbox", starbox);

		Product p1 = service.create("underbox");
		System.out.println(p1.use(TEST));
		Product p2 = service.create("starbox");
		System.out.println(p2.use(TEST));

	} 
}