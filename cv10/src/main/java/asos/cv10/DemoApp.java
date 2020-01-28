/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.cv10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.spark_project.guava.collect.Lists;
import scala.Tuple2;

/**
 *
 * @author vsa
 */
public class DemoApp {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("demoapp").setMaster("local[2]");
        JavaSparkContext sc = new JavaSparkContext(conf);
        
//        JavaRDD<String> rs = sc.textFile("src/main/resources/data.txt")
//                .flatMap(w->Arrays.asList(w.split(" ")).iterator())
//                .filter(w->!w.isEmpty())
//                .filter(w->StringUtils.isAlphanumeric(w))
//                .map(w->w.toLowerCase());
        
//        JavaPairRDD<String, Integer> t = rs.mapToPair(s -> new Tuple2(s, 1));
//        JavaPairRDD<String, Integer> t2 = t.reduceByKey((x,y) -> x + y);
//        Tuple2<String, Integer> t3 = t2.reduce((a, b) -> {if (a._2 > b._2) return a; else return b; });

//        JavaPairRDD<String, String> files = sc.wholeTextFiles("src/main/resources")
//                                              .flatMapValues(s -> Lists.newArrayList(s.split("\\s+")))
//                                              .filter(u->u._2.matches("\\w+"));
//        
//        Map<String, Long> m = files.distinct().countByKey();
//        System.out.println(m);
//        
//        Map<String, Long> m = files.distinct().mapToPair(u->new Tuple2(u._2, u._1))
//                        .countByKey();
//        System.out.println(m);

            
        JavaRDD<String> s = sc.textFile("src/main/resources")
          .flatMap(x -> Arrays.asList(x.split("\\s+")).iterator());
        
        System.out.println(s.reduce((a,b) -> a.length() > b.length() ? a : b));
        
        sc.stop();
        sc.close();
    }
}
