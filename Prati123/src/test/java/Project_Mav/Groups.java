package Project_Mav;

import org.testng.annotations.Test;

public class Groups {
  @Test(groups="smoke",priority=0)
  public void testcase1() {
	  System.out.println("this is my first smoke test");
  }
  @Test(groups="regression",priority=1)
  public void testcase2() {
	  System.out.println("this is my first regression test");
  }
  @Test(groups="smoke",priority=2)
  public void testcase3() {
	  System.out.println("this is my first smoke test");
  }
  
}
