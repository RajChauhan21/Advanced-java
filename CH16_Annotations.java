package Advanced_java;
@FunctionalInterface // func. interface is a interface which has only one abstract method
 interface sum {
   public void goal();
//   public void hole();
}
class A{
    public void Fr(int a){
        System.out.println("1st method from class Object_Oriented_programming" + a);
    }
}
class B extends A{
    @Override
    public void Fr(int a){
        System.out.println("1st method from class Object_Oriented_programming " + a);
    }
    @Deprecated
    public void dep(){
        System.out.println(21);
    }
}
public class CH16_Annotations {
    public static void main(String[] args) {
        @SuppressWarnings("Deprecation")

        B b = new B();
        b.Fr(21);
        b.dep();
    }


}
