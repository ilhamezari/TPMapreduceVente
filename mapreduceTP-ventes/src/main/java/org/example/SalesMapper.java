package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
/*
public class SalesMapper extends Mapper<LongWritable, Text, Text, DoubleWritable> {
    private Text city = new Text();
    private DoubleWritable saleValue = new DoubleWritable();


    @Override
    protected void setup(Context context) throws IOException, InterruptedException {
        Configuration conf = context.getConfiguration();

    }

    @Override
    protected void map(LongWritable key, Text value,Context context) throws IOException, InterruptedException {


       String[] line = value.toString().split(" ");
        String cityValue = line[1];
        double saleValue = Double.parseDouble(line[3]);
        city.set(cityValue);
        context.write(new Text(city), new DoubleWritable(saleValue));

    }

}
*/