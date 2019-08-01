package DynamicProxy;

class TestImpl implements Test{

    @Override
    public void hello(String msg) {
        System.out.println(msg);
    }
    
}