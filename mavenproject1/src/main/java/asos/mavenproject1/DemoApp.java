/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.mavenproject1;

import java.util.Arrays;
import java.util.Map;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

/**
 *
 * @author vsa
 */
public class DemoApp {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("mame").setMaster("local[2]");
        JavaSparkContext c = new JavaSparkContext(conf);

        JavaPairRDD<String, String> slova = c.wholeTextFiles("src/main/resources");
        
        Map<String, Long> s = slova.flatMapValues(x -> Arrays.asList(x.split("\\s+"))).countByKey();
        System.out.println("###" + s);
        
        c.stop();
        c.close();
    }
}
