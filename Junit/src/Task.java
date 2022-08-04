import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task {
	int a,b,c;
	int sum=0;
	
@Before
public void BT() {
	a=10;
	b=20;
	c=a+b;

Assert.assertEquals(29,c);
}
@Test
public void Test() {
	System.out.println("My name is Anant");
	
}

@After
public void AT() {
	System.out.println("I am in Colombo ");
}
}
