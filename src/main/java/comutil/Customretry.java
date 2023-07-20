package comutil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Customretry implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation,Class testclass, Method testmethod,Constructor tesconstructor ) {
		
	annotation.setRetryAnalyzer(Moreretry.class);
	}

}
