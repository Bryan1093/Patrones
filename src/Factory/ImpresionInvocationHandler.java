package Factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ImpresionInvocationHandler implements InvocationHandler{

	Object target;
	
	
	public ImpresionInvocationHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.printf("---- invocando %s(%s): ", method.getName(), Arrays.toString(args));
		
		long inicio = System.nanoTime();
		Object res = method.invoke(target, args);
		long tiempo = System.nanoTime() - inicio;
		System.out.printf("tiempo %.3f ms\n ",tiempo/1000.0f);
		return res;
	}
}
//parametros variables son, cuando no se de antemano cuantos parametrso son