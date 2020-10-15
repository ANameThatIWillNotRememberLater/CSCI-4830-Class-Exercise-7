package q2.form_template_method1.refactored;

public class q2_A {
   public static void main(String[] args) {
      System.out.println("After");
      System.out.println("m1:" + (new q2_A().m1(0, 3)));
      System.out.println("m2:" + (new q2_A().m2(0, 3)));
   }

   int m1(int min, int max) {
      return new M1().common(min, max);
   }

   int m2(int min, int max) {
      return new M2().common(min, max);
   }
}

abstract class Template {
   int common(int min, int max) {
      int sum = 0;
      // TODO: Replace the FOR statement below with your answer.
      // Replace? Or fill for statement? Will use for statement.
      //   If that is a problem, please let me know and I will make 
      //   another submission.
      for (int i = min; i <= max; i++) {
    	  sum += apply(i);
      }
      return sum;
   }

   abstract int apply(int i);
}

class M1 extends Template {

   @Override
   int apply(int i) {
      return i;
   }
}

class M2 extends Template {

   @Override
   int apply(int i) {
      return i * i;
   }
}
