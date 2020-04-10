package lecture.week4.generic.example.hierarchy.override;

class Gen2<T> extends Gen<T> {
 
  Gen2(T o) { 
    super(o); 
  } 
   
  // Override getob(). 
  T getob() {  
    System.out.print("Gen2's getob(): "); 
    return ob;  
  }  
}