package top.codingdong.java.lang;

/**
 * @ClassName FunctionalInterfaceLearn
 * @Description 函数式接口
 * @Author Dong
 * @Date 2020/7/4 10:34
 */
@FunctionalInterface
public interface FunctionalInterfaceLearn {
    /**
     * 1. 如果一个接口中有且只有一个抽象方法，那么该接口就是函数式接口。
     * 2. 如果一个接口声明了@FunctionalInterface注解，那么编译器就会按照函数式接口的定义来要求该接口，若不满足则会报错。
     * <p>
     * 函数式接口定义：函数式接口有且只有一个抽象方法（重写Object类的方法不算在数量内），可以使用lambda，方法引用，构造方法引用
     */
    void testFunctionalInterface();

    /**
     * 重写Object的方法不会算在函数式方法的方法数量内
     *
     * @return java.lang.String
     * @author Dong
     * @data 2020/7/4 9:39
     */
    @Override
    String toString();
}
