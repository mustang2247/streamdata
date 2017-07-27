package com.mybitop.kafka.client;


import com.mybitop.kafka.conf.ConfigureAPI;
import com.mybitop.kafka.kafka.JConsumer;
import com.mybitop.kafka.kafka.JProducer;

/**
 * kafka client
 */
public class KafkaClient {

    public static void main(String[] args) {
        JProducer pro = new JProducer(ConfigureAPI.KafkaProperties.TOPIC);
        pro.start();

        JConsumer con = new JConsumer(ConfigureAPI.KafkaProperties.TOPIC);
        con.start();
    }

}
