package lecture.week4.generic.example.hierarchy.override;

class Gen<T> {
  T ob; // declare an object of type T  
    
  // Pass the constructor a reference to   
  // an object of type T.  
  Gen(T o) {  
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    System.out.print("Gen's getob(): " ); 
    return ob;  
  }  
} 