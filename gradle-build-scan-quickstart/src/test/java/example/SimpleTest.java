package example;

import org.junit.Test;
import java.lang.reflect.*;

import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void testReflection() {
		try{
			Class c=Class.forName("example.Simple");  
			Simple obj = (Simple)c.newInstance();
			int result=obj.add(2,2);
			assertEquals(4,result);
		 }catch(Exception ex){
			ex.printStackTrace();
		 }
    }

}
