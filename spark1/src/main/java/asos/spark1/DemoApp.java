/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.spark1;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
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
        SparkConf conf = new SparkConf().setAppName("demo").setMaster("local[2]");
        JavaSparkContext sc = new JavaSparkContext(conf);
        
        List<Ucet> ls = new ArrayList<>();
        ls.add(new Ucet("01", 1.0));
        ls.add(new Ucet("02", 1.0));
        ls.add(new Ucet("03", 1.0));
        
        
        JavaRDD<Ucet> rdd = sc.parallelize(ls);
        final double sadzba = 0.1;
        rdd = rdd.map(u -> {u.pripocitajUrok(sadzba); return u;});
        rdd = rdd.map(u -> {u.pripocitajUrok(sadzba); return u;});
        rdd = rdd.map(u -> {u.pripocitajUrok(sadzba); return u;});
        List<Ucet> ucty2= rdd.collect();
        
        System.out.println("##########################");
        
        double suma = rdd.map(u -> u.getStav()*0.1).reduce((a,b) -> a+b);
        
        
        System.out.println("##########################");
        
        sc.stop();
        sc.close();
    }
}
