package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class TotalByCityDriver {

    public  static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {

        Configuration conf = new Configuration();

        // Créer un objet Job
        Job job2 = Job.getInstance(conf, "Total Sales by City");

        job2.setJarByClass(TotalByCityDriver.class);

        // Spécifier la classe du Mapper
        job2.setMapperClass(TotalByCityMapper.class);

        // Spécifier la classe du Reducer
        job2.setReducerClass(TotalByCityReducer.class);

        // Spécifier les types de clés et de valeurs de sortie du Reducer
        job2.setOutputKeyClass(Text.class);
        job2.setOutputValueClass(DoubleWritable.class);

        // Spécifier les chemins d'entrée et de sortie
        FileInputFormat.addInputPath(job2, new Path(args[0]));
        FileOutputFormat.setOutputPath(job2, new Path(args[1]));

        // Lancer le job et attendre sa fin
        job2.waitForCompletion(true);
    }


}
