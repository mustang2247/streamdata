package com.mybitop.kafka.conf;

/**
 * 配置文件
 */
public class ConfigureAPI {

    public interface KafkaProperties {
        /**
         * zookeeper
         */
        public final static String ZK = "localhost:2181,localhost:2182,localhost:2183";
        public final static String GROUP_ID = "test-group";
        public final static String TOPIC = "test2";
        public final static String BROKER_LIST = "localhost:9092";
        public final static int BUFFER_SIZE = 64 * 1024;
        public final static int TIMEOUT = 20000;
        public final static int INTERVAL = 10000;
    }

}