package top.codingdong.java.lang;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ClassName IterableForeach
 * @Description 迭代器
 * @Author Dong
 * @Date 2020/7/4 10:13
 */
public class IterableLearn {

    /**
     * 1.8 forEach
     *
     * @return void
     * @author Dong
     * @data 2020/7/4 10:36
     */
    @Test
    public void testForEach() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // Consumer是函数式接口：有且只有一个抽象方法的接口
        list.forEach(new Consumer<Integer>() {
            // accept 接收的是单个参数 是泛型参数 ，且不返回值
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        // lambda
        list.forEach(integer -> System.out.println(integer));
        // 方法引用（method reference）
        list.forEach(System.out::println);
    }
}
