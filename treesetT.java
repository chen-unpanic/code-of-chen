package xx097;

import java.util.Iterator;
import java.util.TreeSet;

public class treesetT {
    public static void main(String[] args) {
        /*
        集合存储的是引用类型数据  TreeSet<int> ts = new TreeSet<int>(); 中int为基本类型,因此要存整数用
        int的包装类类型，既     TreeSet<Integer> ts = new TreeSet<>();  ,其他基本类型也用对应的包装类
        */
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);  //直接给个2也是可以的，jdk5后实现自动装箱
        ts.add(55);
        ts.add(231);
        ts.add(3211);
        ts.add(2313);
        for(Integer iter: ts){          //增强for也要用Integer类型  后接变量名
            System.out.println(iter);
        }
        /*
        2
        55
        231
        2313
        3211
        自然排序，即按照从小到大的顺序排列输出
        */
    }
}
