package lecture.week4.generic.example.hierarchy.twoParams;

class HierDemo {
  public static void main(String args[]) {  
    
    // Create a Gen2 object for String and Integer. 
    Gen2<String, Integer> x = 
      new Gen2<String, Integer>("Value is: ", 99);  
 
    System.out.print(x.getob()); 
    System.out.println(x.getob2()); 
  }  
}