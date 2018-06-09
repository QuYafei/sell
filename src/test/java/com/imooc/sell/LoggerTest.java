package com.imooc.sell;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest1.class);

    @Test
    public void test1(){
        String name = "imooc";
        String passowrd = "1234";
        logger.info("name:"+name+",password"+passowrd);
        logger.info("name:{},password{}",name,passowrd);
        logger.debug("debug...");
        logger.info("info...");
        logger.error("error...");
    }
}


