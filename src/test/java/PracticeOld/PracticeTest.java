package PracticeOld;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticeTest {
	SoftAssert asert=new SoftAssert();
@Test
public void Test1(){
	Reporter.log("a--->pTest1",true);
	Reporter.log("b--->pTest1",true);
	asert.assertEquals("abc", "abv");
	Reporter.log("c--->pTest1",true);
	Reporter.log("d--->pTest1",true);
	
}
@Test
public void Test2(){
	Reporter.log("a--->pTest1",true);
	Reporter.log("b--->pTest1",true);
	Reporter.log("c--->pTest1",true);
	asert.assertEquals("abc", "abc");
	Reporter.log("d--->pTest1",true);
	
}
@Test
public void Test3(){
	Reporter.log("a--->pTest1",true);
	asert.assertEquals("abc", "abc");
	Reporter.log("b--->pTest1",true);
	Reporter.log("c--->pTest1",true);
	asert.assertEquals("abc", "abd");
	Reporter.log("d--->pTest1",true);
	asert.assertEquals("abc", "abv");
	asert.assertAll();
}

	


}
