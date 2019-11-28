package bjpowernode.chapter05.homework.p5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 把下面的数据定义一个集合保存起来
 * [{"time"："2018-08-2309：58：40"，
 * "ftime"："2018-08-23 09：58：40"，
 * "context"："华伟家园东门头房快递服务中心妈妈驿站已发出自提短信，请上门自提，联系电话17662528999"，
 * "1ocation"：null}，
 * {"time"："2018-08-23 09：57：40"，
 * "ftime"："2018-08-23 09：57：40"，
 * “context”："快件已到达华伟家园东门头房快递服务中心妈妈驿站，联系电话17662528999"，
 * "1ocation"：null}，
 * ]
 *
 * @author Huxzhi
 * @date 2019/11/25
 */
public class Test {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("time", "2018-08-23 09：58：40");
        map.put("ftime", "2018-08-23 09：58：40");
        map.put("context", "伟家园东门头房快递服务中心妈妈驿站已发出自提短信，请上门自提，联系电话17662528999");
        map.put("1ocation", null);
        list.add(map);

        map = new HashMap<>();
        map.put("time", "2018-08-23 09：57：40");
        map.put("ftime", "2018-08-23 09：57：40");
        map.put("context", "快件已到达华伟家园东门头房快递服务中心妈妈驿站，联系电话17662528999");
        map.put("1ocation", null);
        list.add(map);

        System.out.println(list);
    }
}
