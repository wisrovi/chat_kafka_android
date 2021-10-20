package com.wisrovi.chatkafka;

import androidx.appcompat.app.AppCompatActivity;


import java.util.Properties;
import android.os.Bundle;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

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
        //props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());
        //props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);

        /*String mensaje_send = "hola mundo";
        String topic = "message";

        ProducerRecord<String, String> data = new ProducerRecord<String, String>(topic, 0, null, mensaje_send);
        producer.send(data);

        producer.close();*/

    }
}