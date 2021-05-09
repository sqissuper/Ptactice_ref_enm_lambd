package text_0509;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * ClassName:TestLambda2
 * Package:text_0509
 * Description:
 *
 * @Author:HP
 * @date:2021/5/9 17:31
 */
public class TestLambda2 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "bit");
        map.put(3, "hello");
        map.put(4, "lambda");
        map.forEach(new BiConsumer<Integer, String>(){
            @Override
            public void accept(Integer k, String v){
                System.out.println(k + "=" + v);
            }
        });
        System.out.println("=======================");
        map.forEach((Integer k,String v)->{
            System.out.println(k + "=" + v);
        });
        System.out.println("=======================");
        map.forEach((k,v)-> System.out.println(k + "=" + v));
    }
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(20);
//        list.add(10);
//        list.add(30);
//        list.add(50);
//
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        list.sort((Integer o1,Integer o2)->{return o1.compareTo(o2);});
//        list.sort((o1,o2)->o1.compareTo(o2));
//        list.forEach(a-> System.out.println(a));
//
//
////        list.forEach((String s)->{
////            System.out.println(s);
////        });
////        System.out.println("===================");
////        list.forEach(s-> System.out.println(s));
//    }
}
