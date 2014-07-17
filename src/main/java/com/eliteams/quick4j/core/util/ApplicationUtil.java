package com.eliteams.quick4j.core.util;

import java.util.UUID;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * 程序工具类，提供大量的便捷方法
 * 
 * @author StarZou
 * @since 2014年5月10日 下午10:22:27
 **/
public class ApplicationUtil {

    /**
     * 产生一个36个字符的UUID
     * 
     * @return UUID
     */
    public static String randomUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * md5加密
     */
    public static String md5Hex(String value) {
        return DigestUtils.md5Hex(value);
    }

    /**
     * sha1加密
     */
    public static String sha1Hex(String value) {
        return DigestUtils.sha1Hex(value);
    }

    /**
     * sha256加密
     */
    public static String sha256Hex(String value) {
        return DigestUtils.sha256Hex(value);
    }

}
