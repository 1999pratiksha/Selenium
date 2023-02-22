package Project_Mav;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Assertconditions {
  @Test(priority=0)
  public void yogesh() {
	  AssertJUnit.assertEquals("tushar","tushar1");
	  System.out.println("this is the first case");
  }
  @Test(priority=1,dependsOnMethods = "yogesh",alwaysRun = true)
  public void pratiksha() {
	  System.out.println("this is the second case");
  }
  @Test(priority=2)
  public void meghna() {
	  System.out.println("this is the Third case");
  }
  @Test(priority=3)
  public void Prashant() {
	  System.out.println("this is the Fourth case");
  }
}
