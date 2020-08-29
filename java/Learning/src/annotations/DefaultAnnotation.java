package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyDefaultAnno {
	String str() default "Testing";
	int value() default 900;
}

public class DefaultAnnotation {
	
	@MyDefaultAnno
	public static void myMeth() {
		DefaultAnnotation obj = new DefaultAnnotation();
		
		try {
			Method m = obj.getClass().getMethod("myMeth");
			
			MyDefaultAnno anno = m.getAnnotation(MyDefaultAnno.class);
			System.out.println(anno.str() + " " + anno.value());
		} catch (NoSuchMethodException e) {
			System.out.println("Metod not found");
		}
	}
	
	public static void main(String args[]) {
		myMeth();
	}
}
