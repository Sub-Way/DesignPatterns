package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class DynamicInvocationHandler implements InvocationHandler {
    private Object obj;

    public DynamicInvocationHandler(Object obj) {
        this.obj = obj;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke method name : " + method.getName() + ", args : " + args[0]);
        // 여기에 필요한 기능을 구현할수 있음.
        Object result = method.invoke(obj, args);
        return result;
    }

}
