import java.util.ArrayList;
import java.util.List;

public class Task {
    public static class Triplet <T1, T2, T3> {
       public T1 t1;
       public T2 t2;
       public T3 t3;

       public Triplet(T1 t1, T2 t2, T3 t3) {
           this.t1 = t1;
           this.t2 = t2;
           this.t3 = t3;
       }
    }
    public static String result;

    public static void main(String[] args){
        Calculator c = new Calculator();
        List<Triplet<Double,Double,String>> t = new ArrayList<>();
        t.add(new Triplet<>(3.4,5.2,"+"));
        t.add(new Triplet<>(2.3,1.23,"-"));
        t.add(new Triplet<>(2.0, 0.0, "/"));
        t.add(new Triplet<>(56.0, 28.0, "/"));
        t.add(new Triplet<>(4.5, 5.4, "*"));

        t.forEach(item -> result += "\n" + c.compute(item.t1, item.t2, item.t3));
        System.out.println(result);
    }
}