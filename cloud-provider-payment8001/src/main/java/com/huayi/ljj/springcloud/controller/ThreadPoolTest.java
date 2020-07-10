package com.huayi.ljj.springcloud.controller;

import com.huayi.ljj.springcloud.component.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 *
 * @author ljj
 * description:
 * path: cloud2020-com.huayi.ljj.springcloud.controller-ThreadPoolTest
 * date: 2020/7/10 15:14
 */
@RestController
@Slf4j
public class ThreadPoolTest {

    @Resource
    private TaskExecutor taskExecutor;
    @Autowired
    private RedisUtil redisUtil;
    @GetMapping(value = "/threadTest")
    public String  thredTest() throws Exception {

        for (int i=0;i<10;i++) {
            System.out.println("开始执行线程池任务,编号:"+i);
            taskExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("正在执行run()方法,线程名称:" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        System.out.println("run()方法执行完成,线程名称:" + Thread.currentThread().getName());
                    }
                }
            });
        }


        redisUtil.set("key","value");
        return "正在返回数据信息";


    }
    @GetMapping(value = "/redisTest")
    public String  redisTest() throws Exception {

        redisUtil.set("a","10");
        return "塞进redis";


    }


}
