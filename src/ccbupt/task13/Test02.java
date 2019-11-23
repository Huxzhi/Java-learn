package ccbupt.task13;

/**
 * 2.（20分）在项目src文件夹下，新建一个包名为“data”，将文件“rating.txt”粘贴到该包中，
 * 编写程序，实现读取”rating.txt”文件中的商品信息，输出平均分最高的前10项商品id和每项商品的平均分，
 * 流行度最高的前10项商品id和每项商品被评论的次数，并将这些数据写入到data包下名为”result.txt的文件夹中”。
 * 注：受欢迎是指被评论的次数越多，流行度越高。
 *
 * @author Huxzhi
 * @date 2019/11/21
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Test02 {

    public static void main(String[] args) throws IOException {

        File file = new File("src/ccbupt/task13/data/ratings.txt");
        Scanner input = new Scanner(file);
        System.out.println(input.nextLine());
        Map<Long, Ratings> map = new HashMap<>();

        /*userId movieId rating timestamp*/
        while (input.hasNext()) {
            String line = input.nextLine();
            String[] items = line.split(" ");
            if (map.containsKey(Long.parseLong(items[1]))) {
                Ratings ratingtemp = map.get(Long.parseLong(items[1]));
                Ratings ratings = new Ratings(ratingtemp.ratings + Double.parseDouble(items[2]), ratingtemp.num + 1);
                map.put(Long.parseLong(items[1]), ratings);
            } else {
                Ratings ratings = new Ratings(Double.parseDouble(items[2]), 1);
                map.put(Long.parseLong(items[1]), ratings);
            }
        }

        input.close();
        Map<Long, Double> rateMap = new HashMap<>();
        for (Map.Entry<Long, Ratings> entry : map.entrySet()) {
            long movieId = entry.getKey();
            Ratings ratings = entry.getValue();
            double ave = ratings.ratings / (double) ratings.num;
            rateMap.put(movieId, ave);
        }


        List<Map.Entry<Long, Double>> entrys = new ArrayList<>(rateMap.entrySet());
//2：调用Collections.sort(list,comparator)方法把Entry-list排序
        Collections.sort(entrys, new Comparator<Map.Entry<Long, Double>>() {
            @Override
            public int compare(Map.Entry<Long, Double> o1, Map.Entry<Long, Double> o2) {
                if (o1.getValue() - o2.getValue() > 0) {
                    return -1;
                }
                if (o1.getValue() - o2.getValue() < 0) {
                    return 1;
                }
                return 0;
            }
        });
        //3：遍历排好序的Entry-list，可得到按顺序输出的结果
        //前十个
        System.out.println("平均评价前十");
        for (Map.Entry<Long, Double> entry : entrys.subList(0, 10)) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        //所有
        System.out.println("\n\n所有\n\n");
        for (Map.Entry<Long, Double> longDoubleEntry : rateMap.entrySet()) {
            System.out.println(longDoubleEntry.getKey() + ":" + longDoubleEntry.getValue());
        }


        // 写到文件中
        String path = "src/ccbupt/task13/data/result.txt";
        file = new File(path);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        FileWriter fw = new FileWriter(file, false);
        // true表示追加

        List<Map.Entry<Long, Ratings>> ratingsEntry = new ArrayList<>(map.entrySet());
        Collections.sort(ratingsEntry, new Comparator<Map.Entry<Long, Ratings>>() {
            @Override
            public int compare(Map.Entry<Long, Ratings> o1, Map.Entry<Long, Ratings> o2) {
                return o2.getValue().num - o1.getValue().num;
            }
        });
        fw.write("前十\n");
        for (Map.Entry<Long, Ratings> longRatingsEntry : ratingsEntry.subList(0, 10)) {
            fw.write(longRatingsEntry.getKey() + " : " + longRatingsEntry.getValue().num + "\n");
        }
        fw.write("所有\n");

        for (Map.Entry<Long, Ratings> entry : map.entrySet()) {
            fw.write(entry.getKey() + " : " + entry.getValue().num + "\n");
        }

    }
//2：调用Collections.sort(list,comparator)方法把Entry-list排序


    static class Ratings {
        double ratings;
        int num;

        public Ratings(double ratings, int num) {
            this.ratings = ratings;
            this.num = num;
        }

        @Override
        public String toString() {
            return "Ratings{" +
                    "ratings=" + ratings +
                    ", num=" + num +
                    '}';
        }
    }
}
