package Advanced_java;
import java.util.ArrayList;

class Mygeneric<T1,T2>{ //Here T is a type which means it can act as any datatype (str,int,char...)
    int value;
    private T1 t1;
    private T2 t2;
    Mygeneric(int v,T1 t1,T2 t2) {
        value = v;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
public class CH16_Generics {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList<>();
        ar.add(1);
//        ar.add("Raj");
        ar.add(21);
//        ar.add("Ram");
//        int a = (int) ar.get(1);
//        System.out.println(a);
//        System.out.println(ar);
        Mygeneric<String,Integer> xr = new Mygeneric<>(21,"Raj",7);
        System.out.println(xr.getT1());
        System.out.println(xr.getValue());
        System.out.println(xr.getT2());

    }
}
