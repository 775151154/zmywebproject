package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.b_迭代子模式;

/**
 * 顾名思义，迭代器模式就是顺序访问聚集中的对象，一般来说，集合中非常常见，如果对集合类比较熟悉的话，
 * 理解本模式会十分轻松。这句话包含两层意思：一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问。
 *
 * @Author Leo
 * @Date 20:38 2018/2/2
 **/
public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        System.out.println(collection.size());
        System.out.println(collection.iterator().hasNext());
        System.out.println(collection.iterator().next());
        System.out.println(collection.iterator().next());
        System.out.println(collection.iterator().pervious());
    }
}