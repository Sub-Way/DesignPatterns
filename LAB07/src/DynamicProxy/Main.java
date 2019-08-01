package DynamicProxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {

        // create proxy
        Test proxyInstance = (Test) Proxy.newProxyInstance(Main.class.getClassLoader(),
                new Class[] { Test.class }, new DynamicInvocationHandler(new TestImpl()));
        
        // proxy test
        proxyInstance.hello("hi 1");
      
    }
}