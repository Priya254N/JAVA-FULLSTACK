package day4;

abstract class Animal {
    
    public abstract void sound();
     public static void main(String[] args) {
         Animal l = new Lion();
         l.sound(); 
         Animal tiger = new Tiger();
         tiger.sound(); 
     }
 }
