package com.sky.jvmtruning.controller;

import com.sky.jvmtruning.entity.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * OOM案例
 */
@RestController()
public class MemoryTestController {
    /**
     * 案例1：模拟线上环境OOM
     *
     * JVM参数：
     * -XX:MetaspaceSize=64m -XX:+HeapDumpOnOutOfMemoryError
     * -XX:HeapDumpPath=D:\\heap\\heapdump.hprof -Xms200M -Xmx200M
     * -Xlog:gc*=info:file=D:\\log\\gc.log:time,uptime
     */
    @GetMapping("/add")
    public void add() {
        System.out.println("*******************");
        ArrayList<People> list = new ArrayList<>();
        while (true) {
            list.add(new People());
        }
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}
