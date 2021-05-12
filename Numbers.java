package sinkShipGame;

public class Numbers {
   void randomNumber() {
     int x = 2, elx, countOne=0, countZero=0;
     for (int i = 0; i < 1000; i++) {
       //elx = (int)((Math.random() * (x*100))/100);
       elx = (int) (Math.random()*x);
       if (elx == 1) {
         countOne++;
       } else {
         countZero++;
       }
       System.out.println("elx/"+elx);
       System.out.println((Math.random() * x));
     }
     
     System.out.println();
     System.out.println("one:"+countOne);
     System.out.println("zero:"+countZero);
     
     
   }
}
