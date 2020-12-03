package com.atmatrix.wechat.middleware;

import cn.hutool.core.collection.CollUtil;
import com.atmatrix.wechat.middleware.resource.ExternalUserDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class middleware2 {

    public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;

    }


    public static void main(String[] args) throws IOException {
//        FileReader fr=new FileReader("E:\\Opensource-projects\\wx-msg-persistence\\src\\main\\java\\com\\atmatrix\\wechat\\middleware\\follower_sc-20200502.json");
        FileReader frExUserInfo = new FileReader("E:\\Opensource-projects\\wx-msg-persistence\\src\\main\\java\\com\\atmatrix\\wechat\\middleware\\user.json");
        BufferedReader brExUserInfo=new BufferedReader(frExUserInfo);
        String line3="";
        int exUserInfoCount = 0;
        Set<String> filter = new HashSet<>();
        Map<String, String> externalUserIdMapUnionId = Maps.newHashMap();
        String unionIds = "";
        while ((line3 = brExUserInfo.readLine()) != null) {
            exUserInfoCount++;
            ExternalUserDto externalUserDto = new Gson().fromJson(line3, ExternalUserDto.class);
            externalUserIdMapUnionId.put(externalUserDto.getUserId(), externalUserDto.getUnionid());
            if (!StringUtils.isEmpty(externalUserDto.getUnionid())
                    &&!filter.contains(externalUserDto.getUnionid())) {
                filter.add(externalUserDto.getUnionid());
                System.out.println(externalUserDto.getUnionid());
                unionIds = unionIds.concat(externalUserDto.getUnionid()).concat("\n");
            }
        }
        BufferedWriter out = new BufferedWriter(new FileWriter("E:\\Opensource-projects\\wx-msg-persistence\\src\\main\\java\\com\\atmatrix\\wechat\\middleware\\unionid.txt"));
        out.write(unionIds);
        out.close();
        System.out.println("文件创建成功！");
        System.out.println(filter.size());








    }
}
