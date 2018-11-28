package org.westos;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
* 作业
    网络
		实现一个socket聊天室（二选一）
		爬虫（二选一）
		https://tieba.baidu.com/p/2256306796?red_tag=1781367364 贴吧地址

		URL 返回的是html网页
		<img 任意 src="地址"

		List<> list = 记录所有地址

*/
public class 爬虫 {
    public static void main(String[] args) throws IOException {
        HttpURLConnection url =(HttpURLConnection)new URL("https://tieba.baidu.com/p/2256306796?red_tag=1781367364").openConnection();
        InputStream in = url.getInputStream();
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = null;
//      BufferedWriter writer = new BufferedWriter(new FileWriter("a.txt"));
        StringBuffer sb = new StringBuffer();
        while((line=bufferedReader.readLine())!=null){
            sb.append(line,0,line.length());
            sb.append('\n');
//          writer.write(line,0,line.length());
//          writer.write('\n');
        }
        in.close();
        reader.close();
        bufferedReader.close();
       // writer.close();


        String regx1 = "<img.*src=(.*?)[^>]*?>";
        String regx2 = "[a-zA-z]+://[^\\s]*";    //http:\"?(.*?)(\"|>|\\s+)   [a-zA-z]+://[^\s]*
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        Pattern pattern1 = Pattern.compile(regx1);
        Matcher matcher1 = pattern1.matcher(sb);
        while(matcher1.find()){
            list1.add(matcher1.group());
        }

//        for (String s : list1) {
//            System.out.println(s);
//        }
        System.out.println("-----------------------------------------");

        for (String s : list1) {
            Pattern pattern2 = Pattern.compile(regx2);
            Matcher matcher2 = pattern2.matcher(s);
            while(matcher2.find()){
                list2.add(matcher2.group());
            }
        }

        for (String s : list2) {
            System.out.println(s);
        }

    }
}
