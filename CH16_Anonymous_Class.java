package Advanced_java;
interface rx {
    public void goal();
    public void sports();
}
interface bike{
    void fzx();
    void ronin();
}
//class R implements rx{
//    @Override
//    public void goal() {
//        System.out.println("goal");
//    }
//    @Override
//    public void sports() {
//        System.out.println("Football");
//    }
//}
public class CH16_Anonymous_Class {
    public static void main(String[] args) {
//Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at the same time.
// They are like local classes except that they do not have a name. Use them if you need to use a local class only once.
//        R r = new R();
//        r.sports();
//        r.goal();
        rx z = new rx() {
            @Override
            public void goal() {
                System.out.println("Focus on your goals");
            }
            @Override
            public void sports() {
                System.out.println("Football");
            }
        };
        z.goal();
        z.sports();
        bike br = new bike() {
            @Override
            public void fzx() {
                System.out.println("FZX is a good tourer retro bike");
            }
            @Override
            public void ronin() {
                System.out.println("TVS Ronin is Best Retro Bike in segment");
            }
        };
        br.fzx();
        br.ronin();
    }
}
