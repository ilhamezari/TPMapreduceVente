package org.example;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class TotalByCityMapper extends Mapper<LongWritable, Text, Text, DoubleWritable> {

    private Text city = new Text();
    private DoubleWritable Total = new DoubleWritable();
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] tokens = value.toString().split(" ");
            String year = tokens[0];
            String cityT = tokens[1];
            double saleTotal = Double.parseDouble(tokens[3]);

            // Filtrer les ventes pour une année donnée
        String targetYear = "2023";
        if (year.startsWith(targetYear)) {
                city.set(cityT);
                Total.set(saleTotal);
                context.write(city,Total);
            }



}}
