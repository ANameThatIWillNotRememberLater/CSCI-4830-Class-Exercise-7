package q1.extract_method.refactored;

import java.util.List;

public class q1_A {
   Node m1(List<Node> nodes, String p) {
	  extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	  extractedMethod(edgeList, p);
      // other implementation
      return null;
   }

   // ? extractedMethod(?) {}
   
   // Used Extract Method Typeparameterize Refactoring instead of 
   //   Extract Method Refactoring. If this is an issue, please let
   //   me know and I will make a new submission.
   private <T extends ContainingString> void extractedMethod(List<T> list, String p) {
	   for (T item : list) {
		   if ((item.contains(p))) {
			   System.out.println(item);
		   }
	   }
	   // Other common implementation
   }
}

interface ContainingString {
	public abstract boolean contains(String p);
}

class Node implements ContainingString {
   String name;

   @Override
   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge implements ContainingString {
   String name;

   @Override
   public boolean contains(String p) {
       return name.contains(p);
   }
}