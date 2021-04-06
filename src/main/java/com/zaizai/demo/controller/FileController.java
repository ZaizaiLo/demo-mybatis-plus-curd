package com.zaizai.demo.controller;

import com.zaizai.demo.common.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author luojiyuan
 * @date 2021-04-06 10:02
 */
@Slf4j
@RestController
@RequestMapping("file")
public class FileController {

    @PostMapping("upload")
    public ResultModel<Void> fileTest() {
        log.info("调用成功");
        return ResultModel.successMessage("1");
    }

}
