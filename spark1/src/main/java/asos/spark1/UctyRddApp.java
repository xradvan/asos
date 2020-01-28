package asos.spark1;

import java.util.ArrayList;
import java.util.List;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class UctyRddApp {

    public static void main(String[] args) {
        
        List<Ucet> ucty = new ArrayList<>();
        ucty.add(new Ucet("U001", 100));
        ucty.add(new Ucet("U002", 200));
        ucty.add(new Ucet("U003", 300));
        ucty.add(new Ucet("U004", 400));

        SparkConf conf = new SparkConf().setAppName("spark-ucet-app");
        if (conf.get("spark.master", null) == null) {
            conf.setMaster("local[2]");
        }
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<Ucet> rdd = sc.parallelize(ucty);         
        // sem vkladat zdojove riadky z prezentacie

        
        
        // 
        sc.stop();
        sc.close();
    }

}
