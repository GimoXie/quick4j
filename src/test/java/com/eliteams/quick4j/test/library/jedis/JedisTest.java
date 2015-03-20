package com.eliteams.quick4j.test.library.jedis;

import com.eliteams.quick4j.core.feature.test.TestSupport;
import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * JedisTest : 测试 jedis 功能
 *
 * @author StarZou
 * @since 2015-03-20 10:32
 */
public class JedisTest extends TestSupport {

    public int port = 6379;
    public String host = "127.0.0.1";
    public Jedis jedis = new Jedis(host, port);


    @Test
    public void testSet() {
        jedis.set("appID", System.currentTimeMillis() + "");
    }

    @Test
    public void testGet() {
        System.out.printf(jedis.get("appID"));
    }
}
