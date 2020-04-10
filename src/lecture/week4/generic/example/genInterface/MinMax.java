package lecture.week4.generic.example.genInterface;

interface MinMax<T extends Comparable<T>> {
  T min(); 
  T max(); 
} 