package Factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import componente.OperacionesCadenaImpl;
import componente.OperacionesCadenas;
import componente.OperacionesNumeros;
import componente.OperacionesNumerosImpl;

public final class OperacionesFactory {

	private static Map<Class<?>, Class<?>> servicios = new HashMap<>();
	
	public static void registrar(Class<?> in, Class<?> impl) {
		servicios.put(in, impl);
	}
	
	private static Object crearProxy(Object target) {
		
		Object proxy = Proxy.newProxyInstance(OperacionesFactory.
				class.getClassLoader(), target.getClass().getInterfaces(),
				new ImpresionInvocationHandler(target));
		return proxy;
	}
	
	public static <T> T crear(Class<?> in) {
		
		Class<?> impl = servicios.get(in);
		Constructor<?> ctor = impl.getDeclaredConstructors()[0];
		Object target = null;
		
		try {
			target = ctor.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Object proxy = crearProxy(target);
		
		return (T) in.cast(proxy);
	}
	public static <T> T crearNumeros(Class<T> clase) {
		OperacionesNumeros target = new OperacionesNumerosImpl();
		Object proxy = crearProxy(target);
		return clase.cast(proxy);
	}
	
	public static <T> T crearCadenas(Class<T> clase) {
		OperacionesCadenas target = new OperacionesCadenaImpl();
		Object proxy = crearProxy(target);
		return clase.cast(proxy);
	}
}