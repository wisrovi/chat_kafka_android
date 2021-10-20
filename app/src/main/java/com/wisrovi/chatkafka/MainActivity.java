package com.wisrovi.chatkafka;

import androidx.appcompat.app.AppCompatActivity;


import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import android.os.Bundle;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String server = "192.168.0.6:9092";
        String mensaje_send = "hola mundo";
        String topic = "message";

        Properties propiedadesKafka = new Properties();
        propiedadesKafka.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, server);
        propiedadesKafka.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        propiedadesKafka.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        propiedadesKafka.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        propiedadesKafka.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "test");

        KafkaConsumer<String,String> consumer = new KafkaConsumer<String, String>(propiedadesKafka);

        //consumer.subscribe(Arrays.asList(topic));

        /*while(true){
            ConsumerRecords<String,String> records=consumer.poll(Duration.ofMillis(100));
            for(ConsumerRecord<String,String> record: records){
                System.out.println("Key: "+ record.key() + ", Value:" +record.value());
            }
        }*/
    }
}