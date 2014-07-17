package com.eliteams.quick4j.core.feature.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Spring测试支持，编写测试类时，继承该类
 * 
 * @author StarZou
 * @since 2014年5月18日 下午2:28:58
 **/
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public class TestSupport extends AbstractJUnit4SpringContextTests {

}
