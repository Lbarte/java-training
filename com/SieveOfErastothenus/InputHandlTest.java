package sieve;

public class InputHandlTest {
    public void getLimitTest() throws Exception{
      System.out.println("input 10");
      InputHandl inp = new InputHandl();
      
      if (inp.getLimit()==10) {
        System.out.println("good, passed");
      } else {
        System.out.println("waisted");
      }
    }
}
