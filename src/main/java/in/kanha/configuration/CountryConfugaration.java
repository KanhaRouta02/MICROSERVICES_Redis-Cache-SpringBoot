package in.kanha.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import in.kanha.binding.Country;

@Configuration
public class CountryConfugaration {

	@Bean
	public JedisConnectionFactory jedisConn() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
//		factory.setClientName(null);
//		factory.setPort(0);
		return factory;
	}
	
	@Bean
	public RedisTemplate<String, Country> redisTemplate(){
		RedisTemplate<String , Country> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConn());
		return redisTemplate;
	}
}
