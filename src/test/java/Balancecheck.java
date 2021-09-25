import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Balancecheck {

	private ACCOUNTS objtest;
	@Before
	public void object()
	{
		objtest=new ACCOUNTS();
	}
	@Test
	public void test() {
	
		int EXPECTED=500;
		int acc=97;
		int val=objtest.checkbalance(acc);
		Assert.assertEquals(EXPECTED, val);
	//	fail("Not yet implemented");
	}
	@Test
	public void test1() {
	
		double expected=8.0;
		int acc=97;
		double val;
		Customer obj=new Customer();
		 val=obj.interest();
		 
		Assert.assertEquals(expected,val);
	}
	@Test
	public void test2() {
	
		double EXPECTED=0;
		int acc=97;
		double val=objtest.zakaat(acc);
		Assert.assertEquals(EXPECTED, val);
	}
	@Test
	public void test3() {
		
		boolean EXPECTED=true;
		int acc=97;
		boolean val=objtest.transferamount(acc,95,50);
		Assert.assertEquals(EXPECTED, val);
	}
	@Test
	public void test4() {
		
		int EXPECTED=550;
		int acc=97;
		int val=objtest.makedeposit(acc,50);
		Assert.assertEquals(EXPECTED, val);
	}
	@Test
	public void test5() {
		
		int EXPECTED=450;
		int acc=97;
		int val=objtest.swithdrawal(acc,50);
		Assert.assertEquals(EXPECTED, val);
	}
	@Test
	public void test6() {
		
		int EXPECTED=450;
		int acc=97;
		int val=objtest.swithdrawal(acc,50);
		Assert.assertEquals(EXPECTED, val);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testNullname()
	{
		objtest.setname(null);
	}

	@Test(expected=IllegalArgumentException.class)
		public void testNameshort()
		{
			objtest.setname("K");
		}
	@Test(expected=IllegalArgumentException.class)
	public void testNameLong()
	{
		objtest.setname("Muhammad Abu Bakar Hussain Khalid raza");
	}
	

}

