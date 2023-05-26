package org.example;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class TotalByCityReducer extends Reducer<Text, DoubleWritable, Text, DoubleWritable> {

    private DoubleWritable TotalY = new DoubleWritable();

    public void reduce(Text key, Iterable<DoubleWritable> values, Context context) throws IOException, InterruptedException, IOException {
        double sum = 0;

        // Calculer le total des ventes pour la ville donnée
        for (DoubleWritable value : values) {
            sum += value.get();
        }

        TotalY.set(sum);
        context.write(key, TotalY);
    }

}
