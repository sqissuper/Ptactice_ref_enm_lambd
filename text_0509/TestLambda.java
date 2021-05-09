package text_0509;

/**
 * ClassName:TestLambda
 * Package:text_0509
 * Description:
 *
 * @Author:HP
 * @date:2021/5/9 17:04
 */

//无返回值无参数
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}
//无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}
//无返回值多个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}

//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}

//有返回值一个参数
@FunctionalInterface
interface OneParameterReturn {
    int test(int a);
}

//有返回值多参数
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a,int b);
}
public class TestLambda {
    public static void main(String[] args) {
        //有返回值无参数
        NoParameterReturn noParameterReturn = ()->{
            return 10;
        };
        //简写
        NoParameterReturn noParameterReturn2 = ()->10;
        System.out.println(noParameterReturn.test());
        System.out.println(noParameterReturn2.test());

        //有返回值一个参数
        OneParameterReturn oneParameterReturn = (int a)->{
            return a;
        };
        //简写
        OneParameterReturn oneParameterReturn1 = a->a;
        System.out.println(oneParameterReturn.test(20));
        System.out.println(oneParameterReturn1.test(20));

        //有返回值多参数
        MoreParameterReturn moreParameterReturn = (int a,int b)->{
            return a+b;
        };
        //简写
        MoreParameterReturn moreParameterReturn1 = (a,b)->a+b;
        System.out.println(moreParameterReturn.test(10, 20));
        System.out.println(moreParameterReturn1.test(10, 20));
    }
//    public static void main(String[] args) {
//        NoParameterNoReturn noParameterNoReturn = ()->{
//            System.out.println("无参数无返回值");
//        };
//        noParameterNoReturn.test();
//
//        OneParameterNoReturn oneParameterNoReturn = (int a)->{
//            System.out.println("无参数一个返回值："+ a);
//        };
//        oneParameterNoReturn.test(10);
//
//        MoreParameterNoReturn moreParameterNoReturn = (int a,int b)->{
//            System.out.println("无返回值多个参数："+a+" "+b);
//        };
//        moreParameterNoReturn.test(20,30);
//    }
}
