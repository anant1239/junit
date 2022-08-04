import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class junit {
	int marks[]= {10,20,30,50};
	int sum=0, average;
	


@Before
public void BT() {
for(int i=0;i<4;i++)
{
	sum+=marks[i];
	average=sum/4;
}	
}
//Add an assert which should fail



@Test
public void testcase1()
{
	Assert.assertEquals(110,sum);
	Assert.assertEquals(27, average);
}
//Add a syso which wil say that I am anant
@After
public void AT() {
	System.out.println(sum);
	System.out.println(average);
	
	//I am at present in colombo
}
}
