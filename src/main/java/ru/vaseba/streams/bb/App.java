package ru.vaseba.streams.bb;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.function.*;

public class App {

    public static void main(String[] args) {

        Operation <Integer> sum = (Integer val1, Integer val2) -> val1 + val2;
        System.out.println(sum.oper(5, 5));

        Operation<Double> sumD = (Double val1, Double val2) -> val1 + val2;
        System.out.println(sumD.oper(5.0, 6.2));

        Predicate<Integer> isNull = val -> val == 0;
        System.out.println(isNull.test(9));

        Consumer<Double> print = System.out::println;
        print.accept(8.9);

        Function<Integer, Double> convert = val -> Double.valueOf(val);
        System.out.println(convert.apply(8));

//        Supplier<String> read = () -> {
//            Scanner in = new Scanner(System.in);
//            return in.nextLine();
//        };
//        String str = read.get();
//        System.out.println(str);

        UnaryOperator<Double> sqrt = val -> Math.sqrt(val);
        System.out.println(sqrt.apply(16.0));

        BinaryOperator<Double> summ = (val1, val2) -> val1 + val2;
        System.out.println(summ.apply(9.0, 20.0));


      }
}
