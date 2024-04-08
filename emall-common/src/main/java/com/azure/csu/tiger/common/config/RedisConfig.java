package com.azure.csu.tiger.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
//    @Value("${spring.redis.host}")
//    private String host;
//    @Value("${spring.redis.port}")
//    private int port;
//    @Value("${spring.redis.password}")
//    private String password;
//    @Value("${spring.redis.min-idle}")
//    private int minIdle;
//    @Value("${spring.redis.max-idle}")
//    private int maxIdle;
//    @Value("${spring.redis.max-wait}")
//    private int maxWait;
//    @Value("${spring.redis.max-active}")
//    private int maxActive;
//    @Value("${spring.redis.connect-timeout}")
//    private int connectTimeout;
//
//    public String getHost() {
//        return host;
//    }
//
//    public void setHost(String host) {
//        this.host = host;
//    }
//
//    public Integer getPort() {
//        return port;
//    }
//
//    public void setPort(Integer port) {
//        this.port = port;
//    }
//
//    @Bean
//    public JedisPoolConfig jedisPoolConfig() {
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxIdle(maxIdle);
//        jedisPoolConfig.setMaxWait(Duration.ofMillis(maxWait));
//
//        return jedisPoolConfig;
//    }
//
//    @Bean
//    public JedisConnectionFactory redisConnectionFactory(JedisPoolConfig jedisPoolConfig) {
//
//        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration(host, port);
//        return new JedisConnectionFactory(config);
//    }
//
    @Bean
    public JedisConnectionFactory redisConnectionFactory() {
        return new JedisConnectionFactory();
    }

    @Bean
    RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory) {

        RedisTemplate<String, String> template = new RedisTemplate<>();
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new StringRedisSerializer());
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }

}
