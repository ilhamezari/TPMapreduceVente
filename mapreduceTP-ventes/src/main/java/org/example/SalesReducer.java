package org.example;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
/*
public class SalesReducer extends Reducer<Text, DoubleWritable, Text, DoubleWritable> {
    private DoubleWritable totalSales = new DoubleWritable();
    @Override
    protected void reduce(Text key, Iterable<DoubleWritable> values, Context context) throws IOException, InterruptedException {
        double sum = 0;

        for (DoubleWritable value : values) {
            sum += value.get();
        }
        totalSales.set(sum);
        context.write(key, totalSales);
    }
}
*/