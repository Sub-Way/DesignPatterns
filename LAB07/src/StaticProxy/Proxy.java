package StaticProxy;

class Proxy implements Subject{

	Subject subject;
	
	@Override
	public String action() {
		// TODO Auto-generated method stub
		System.out.println("Proxy ȣ��");
		
		subject = new RealSubject();
		return subject.action();
	}

}