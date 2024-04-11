package com.azure.csu.tiger.common.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

@Data
@Configuration
public class RedisConfig {
    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.port}")
    private int port;
    @Value("${spring.redis.password}")
    private String password;
    @Value("${spring.redis.jedis.pool.min-idle}")
    private int minIdle;
    @Value("${spring.redis.jedis.pool.max-idle}")
    private int maxIdle;
    @Value("${spring.redis.jedis.pool.max-wait}")
    private int maxWait;
    @Value("${spring.redis.jedis.pool.max-active}")
    private int maxActive;
    @Value("${spring.redis.connect-timeout}")
    private int connectTimeout;

//    @Bean
//    public JedisConnectionFactory redisConnectionFactory() {
//        return new JedisConnectionFactory();
//    }

    @Bean
    JedisConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration(host, port);
        config.setPassword(password);

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // Specify the maximum number of connections based on your business needs. This value cannot exceed the maximum number of connections supported by the Tair instance.
        jedisPoolConfig.setMaxTotal(30);
        // Specify the maximum number of idle connections based on your business needs. This value cannot exceed the maximum number of connections supported by the Tair instance.
        jedisPoolConfig.setMaxIdle(20);
        // Disable testOn[Borrow|Return] to prevent additional PING commands from being generated.
        jedisPoolConfig.setTestOnBorrow(false);
        jedisPoolConfig.setTestOnReturn(false);

        JedisClientConfiguration jedisClientConfiguration = JedisClientConfiguration.builder().usePooling().poolConfig(
                jedisPoolConfig).build();

        return new JedisConnectionFactory(config, jedisClientConfiguration);
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
