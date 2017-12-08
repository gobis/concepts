package Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



/* IMP NOTE
Method declarations must not have 
any parameters or a throws clause. Return types are restricted to primitives,
String, Class, enums, annotations, and arrays of the preceding types.*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //on class level
@interface MyAnnotation{  
int value() ;
int newvalue() default 0 ;
}  



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //on class level
 @interface TesterInfo {

	public enum Priority {
	   LOW, MEDIUM, HIGH
	}

	Priority priority() default Priority.MEDIUM;
	
	String[] tags() default "";
	
	String createdBy() default "Mkyong";
	
	String lastModified() default "03/01/2014";

}




public class CustomAnnotation {
	
	@MyAnnotation(value = 10)
	public void sayHello(){System.out.println("hello annotation");}  

}
