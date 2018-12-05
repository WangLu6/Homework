package org.westos.day20;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Heroes {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.lines(Paths.get("heroes.txt"), Charset.forName("utf-8")).collect(Collectors.toList());

        List <Hero> list = lines.stream().map ( str -> str.split ( "\t" ) ).map ( array ->
                new Hero ( Integer.parseInt ( array[0] ),
                        array[1], array[2], array[3],
                        Integer.parseInt ( array[4] ),
                        Integer.parseInt ( array[5] ),
                        Integer.parseInt ( array[6] )
                ) ).collect ( Collectors.toList () );

        // 1. 找到武将中武力前三的hero对象, 提示流也可以排序
        // 2. 按出生地分组
        // 3. 找出寿命前三的武将
        // 4. 女性寿命最高的
        // 5. 找出武力排名前三  100, 99, 97 97 ==> 4个人 吕布", "张飞", "关羽", "马超

        System.out.println("-----------------------------------1---------------------------------------");
        list.stream().sorted((a,b)->(b.getPower()-a.getPower())).limit(3).forEach(s-> System.out.println(s));

        System.out.println("------------------------------------2--------------------------------------");
        list.stream().collect(Collectors.groupingBy((a->a.getLoc()))).forEach((a,b)-> System.out.println(a+"--"+b));

        System.out.println("-----------------------------------3---------------------------------------");
        list.stream().sorted((a,b)->(b.getDeath()-b.getBirth()-a.getDeath()-a.getBirth())).limit(3).forEach(s-> System.out.println(s));

        System.out.println("------------------------------------4--------------------------------------");
        list.stream().filter(a->a.getSex()!="男").sorted((a,b)->(b.getDeath()-b.getBirth()-a.getDeath()-a.getBirth())).limit(1).forEach(a-> System.out.println(a));

        System.out.println("------------------------------------5--------------------------------------");
        List<Integer> power = list.stream().sorted((a, b) -> b.getPower() - a.getPower()).map(s -> s.getPower()).distinct().limit(3).collect(Collectors.toList());
        power.stream().forEach( a->  list.stream().filter(s-> s.getPower()==a).forEach(s-> System.out.println(s))  );

    }
}
