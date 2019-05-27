package org.jeecg.modules.demo.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/5/27 16:09
 * @Version 1.0
 * @Description
 **/
@RestController
@RequestMapping("/test/fyb")
@Slf4j
public class fyb {
    /**
     * hello world
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/hello")
    public Result<String> hello() {
        Result<String> result = new Result<String>();
        result.setResult("Hello World!");
        result.setSuccess(true);
        return result;
    }
}
