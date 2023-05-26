package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
public class SalesCountDriver {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "Totales des ventes par ville");
        job.setJarByClass(SalesCountDriver.class);
        //classe qui contient les methodes map & reduce
        job.setMapperClass(SalesMapper.class);
        job.setReducerClass(SalesReducer.class);
        //type de sortie de map
        //job.setMapOutputKeyClass(Text.class);
        //job.setMapOutputValueClass(DoubleWritable.class);
        //Type de sortie reduce
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(DoubleWritable.class);

        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job,new Path(args[1]));

       // System.exit(job.waitForCompletion(true)? 0:1);
        //job.waitForCompletion(true);

    }
}*/