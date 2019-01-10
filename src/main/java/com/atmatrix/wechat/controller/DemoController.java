package com.atmatrix.wechat.controller;

import com.atmatrix.wechat.application.dto.WechatMsgDto;
import com.atmatrix.wechat.common.annotation.CustomerLog;
import com.atmatrix.wechat.common.utils.AliyunOSSClientUtil;
import com.atmatrix.wechat.common.utils.HashUtil;
import com.atmatrix.wechat.common.utils.http.WebUtil;
import com.google.gson.Gson;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/msg/api/v1")
public class DemoController {


    @CustomerLog(value = "Demo消息接口")
    @ApiOperation(value = "消息接收接口", notes = "接收消息内容")
    @RequestMapping(value = "/send", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> SendMessage(@RequestBody WechatMsgDto wechatMsgDto) {
        try {

            Gson gson = new Gson();
            String requestData = gson.toJson(wechatMsgDto);
            return WebUtil.success("接收消息成功");
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("MQ Send Failed :{0}", e));
            return WebUtil.error("消息接收失败");
        }

    }

    @ApiOperation(value = "上传图片接口", notes = "接收图片")
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> uploadImage(@RequestParam("file") MultipartFile multipartFile) {

        if (multipartFile.isEmpty()) {
            return WebUtil.error("上传文件为空");
        }
        try {
            byte[] bytes = multipartFile.getBytes();
            String hash = HashUtil.hash(bytes);
            log.info(MessageFormat.format("hash :{0}", hash));
            InputStream inputStream = multipartFile.getInputStream();
            String fileName = multipartFile.getOriginalFilename();
            Long fileSize = multipartFile.getSize();
            String hashImageName = AliyunOSSClientUtil.uploadInputStreamToOSS(hash, inputStream, fileName, fileSize);
            return WebUtil.result(hashImageName);
        } catch (Exception e) {
            e.printStackTrace();
            return WebUtil.error(e.getMessage());
        }

    }
}
