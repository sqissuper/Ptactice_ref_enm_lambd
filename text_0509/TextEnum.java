package text_0509;

/**
 * ClassName:TextDemo
 * Package:text_0509
 * Description:
 *
 * @Author:HP
 * @date:2021/5/9 16:21
 */
public enum TextEnum {
    RED("red",1),GREEN("green",2),BLACK("black",3),WHITE("white",4);

    public String name;
    public int ordinal;

    TextEnum(String name,int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

//    public static void main(String[] args) {
//        TextEnum[] testEnum = TextEnum.values();
//        for (int i = 0; i < testEnum.length; i++) {
//            System.out.println(testEnum[i] + " " + testEnum[i].ordinal());
//        }
//        System.out.println("=========================");
//        System.out.println(TextEnum.valueOf("GREEN"));
//    }
//    public static void main(String[] args) {
//        TextEnum te = TextEnum.BLACK;
//        switch (te) {
//            case RED:
//                System.out.println("red");
//                break;
//            case BLACK:
//                System.out.println("black");
//                break;
//            case WHITE:
//                System.out.println("WHITE");
//                break;
//            case GREEN:
//                System.out.println("black");
//                break;
//            default:
//                break;
//        }
//    }
}
