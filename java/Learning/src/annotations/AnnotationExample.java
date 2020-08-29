package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int value();
}

public class AnnotationExample {
	
	@MyAnno(str = "Ravinder", value = 100) 
	public static void myMeth() {
		AnnotationExample obj = new AnnotationExample();
		
		try {
			Method m = obj.getClass().getMethod("myMeth");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " " + anno.value());
			
		} catch (NoSuchMethodException e) {
			System.out.println("Method not found");
		}
	}
	
	public static void main(String args[]) {
		myMeth();
	}
}
