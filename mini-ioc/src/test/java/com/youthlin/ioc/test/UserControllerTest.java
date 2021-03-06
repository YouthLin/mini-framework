package com.youthlin.ioc.test;

import com.youthlin.ioc.context.Context;
import com.youthlin.ioc.test.service.IUserService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 创建: youthlin.chen
 * 时间: 2017-12-05 23:30
 */
@Scan("com.youthlin.ioc")
@RunWith(MiniRunner.class)
public class UserControllerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserControllerTest.class);
    @Resource
    private IUserService userService;
    @Resource
    private Context context;
    @Resource
    private Map<String, IUserService> userServiceMap;

    @BeforeClass
    public static void beforeClass() {
        LOGGER.info("before class");
    }

    @Before
    public void before() {
        LOGGER.info("before {}", userServiceMap);
    }

    @Test
    public void test1() {
        LOGGER.info("{}", context.getBean(UserControllerTest.class) == this);
        System.out.println(userService.sayHello(1));
    }

    @Test
    @Ignore
    public void test2() {
        LOGGER.info("{}", context.getBean(UserControllerTest.class) == this);
        System.out.println(userService.sayHello(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEx() {
        LOGGER.info("exception...");
        throw new IllegalArgumentException();
    }

    @After
    public void after() {
        LOGGER.info("after");
    }

    @AfterClass
    public static void afterClass() {
        LOGGER.info("after class");
    }
}
