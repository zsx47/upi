package net.thisisz.upi.common.messaging;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisProvider implements ServiceProvider {

    public JedisPool pool;

    public RedisProvider() {
        pool = new JedisPool(new JedisPoolConfig(), "localhost", 6379, 10000);
    }

    @Override
    public void sendMessage(PackagedMessage message) {

    }

}
