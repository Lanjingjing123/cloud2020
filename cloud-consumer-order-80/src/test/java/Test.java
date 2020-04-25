import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lanjingjing
 * @description
 * @date 2020/4/14
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mxy");
        list.add("StringUtils");
        list.add("join");
        String join = StringUtils.join(list,"-");//传入String类型的List集合，使用"-"号拼接
        System.out.println(join);

        String[] s = new String[]{"Yuan","Mxy"};//传入String类型的数组，使用"-"号拼接
//        String join2 = StringUtils.join(s,"-");
//        System.out.println(join2);

        String s1 = StringUtils.joinWith("-", s);
        System.out.println(s1);
    }
}
