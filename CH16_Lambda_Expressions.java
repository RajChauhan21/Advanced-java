package Advanced_java;
interface bob{
    void name(int a);
}
interface car{
    void carbody(int r);
}
//class oggy implements bob{
//    @Override
//    public void name() {
//        System.out.println("My name is bob");
//    }
//}
public class CH16_Lambda_Expressions {
    public static void main(String[] args) {
//        oggy cr = new oggy();
//        cr.name();
        //Lambda exp can be only used on functional interfaces i.e - interface should have only 1 abs method
      bob sr = (a)->{
          System.out.println("I am Bob" + a);
      };
      sr.name(21);


       car cr = (r)->{
           System.out.println("Swift is a hatch-Back type car" + r);
       };
       cr.carbody(7);








    }

}
