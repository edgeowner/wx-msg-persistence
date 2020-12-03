package com.atmatrix.wechat.middleware;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.poi.excel.BigExcelWriter;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.atmatrix.wechat.middleware.resource.ExternalUserDto;
import com.atmatrix.wechat.middleware.result.ExternalUserDetailRespDto;
import com.atmatrix.wechat.middleware.result.Utf8ResponseHandler;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class middleware {

    public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;

    }

        /**
         * 写文件
         *
         * @param newStr
         *            新内容
         * @throws IOException
         */
        public static boolean writeTxtFile(String newStr) throws IOException {
            // 先读取原有文件内容，然后进行写入操作
            boolean flag = false;
            String filein = newStr + "\r\n";
            String temp = "";

            FileInputStream fis = null;
            InputStreamReader isr = null;
            BufferedReader br = null;

            FileOutputStream fos = null;
            PrintWriter pw = null;
            try {
                // 文件路径
                String path = "E:\\Opensource-projects\\wx-msg-persistence\\src\\main\\java\\com\\atmatrix\\wechat\\middleware\\unionid.txt";
                File file = new File(path);
                // 将文件读入输入流
                fis = new FileInputStream(file);
                isr = new InputStreamReader(fis);
                br = new BufferedReader(isr);
                StringBuffer buf = new StringBuffer();

                // 保存该文件原有的内容
                for (int j = 1; (temp = br.readLine()) != null; j++) {
                    buf = buf.append(temp);
                    // System.getProperty("line.separator")
                    // 行与行之间的分隔符 相当于“\n”
                    buf = buf.append(System.getProperty("line.separator"));
                }
                buf.append(filein);

                fos = new FileOutputStream(file);
                pw = new PrintWriter(fos);
                pw.write(buf.toString().toCharArray());
                pw.flush();
                flag = true;
            } catch (IOException e1) {
                // TODO 自动生成 catch 块
                throw e1;
            } finally {
                if (pw != null) {
                    pw.close();
                }
                if (fos != null) {
                    fos.close();
                }
                if (br != null) {
                    br.close();
                }
                if (isr != null) {
                    isr.close();
                }
                if (fis != null) {
                    fis.close();
                }
            }
            return flag;
        }

    public static void main(String[] args) throws IOException {
//        FileReader fr=new FileReader("E:\\Opensource-projects\\wx-msg-persistence\\src\\main\\java\\com\\atmatrix\\wechat\\middleware\\follower_sc-20200502.json");
        FileReader fr=new FileReader("E:\\Opensource-projects\\wx-msg-persistence\\src\\main\\java\\com\\atmatrix\\wechat\\middleware\\follower_external_user_sc.json");
        FileReader frExUserId = new FileReader("E:\\Opensource-projects\\wx-msg-persistence\\src\\main\\java\\com\\atmatrix\\wechat\\middleware\\NotIn.txt");
        FileReader frExUserInfo = new FileReader("E:\\Opensource-projects\\wx-msg-persistence\\src\\main\\java\\com\\atmatrix\\wechat\\middleware\\user.json");
        BufferedReader br = new BufferedReader(fr);
        BufferedReader brExUserId=new BufferedReader(frExUserId);
        BufferedReader brExUserInfo=new BufferedReader(frExUserInfo);
        String line1="";
        String line2="";
        String line3="";
        int count = 0;
        int exUserCount = 0;
        int exUserInCount = 0;
        int exUserInfoCount = 0;
        Map<String, String> externalUserIdMapUnionId = Maps.newHashMap();
        while ((line3 = brExUserInfo.readLine()) != null) {
            exUserInfoCount++;
            ExternalUserDto externalUserDto = new Gson().fromJson(line3, ExternalUserDto.class);
            externalUserIdMapUnionId.put(externalUserDto.getUserId(), externalUserDto.getUnionid());
        }

        List<String> exUserIds = Lists.newArrayList();
        while ((line2=brExUserId.readLine())!=null) {
            exUserIds.add(replaceBlank(line2));
            exUserCount++;
        }
        List<FollowerExternalUserScDto> list_1 = Lists.newArrayList();
        while ((line1=br.readLine())!=null) {
            count++;
            FollowerExternalUserScDto followerExternalUserScDto = new Gson().fromJson(line1, FollowerExternalUserScDto.class);
            if(exUserIds.contains(followerExternalUserScDto.getExternalUserId())){
                exUserIds.contains(followerExternalUserScDto.getExternalUserId());
                exUserInCount++;
            }
            if (!StringUtils.isEmpty(followerExternalUserScDto.getAppCode())
                    && "SZQYWX004".equals(followerExternalUserScDto.getAppCode())
//                    && "1".equals(followerExternalUserScDto.getSzStatus())
                    && !exUserIds.contains(followerExternalUserScDto.getExternalUserId()
            )) {
//                System.out.println(line1);
                list_1.add(followerExternalUserScDto);
            }
        }
        log.info("\n【count=[{}]】", count);
        log.info("\n【exUserCount=[{}]】", exUserCount);
        log.info("\n【exUserInCount=[{}]】", exUserInCount);
        log.info("\n【exUserInfoCount=[{}]】", exUserInfoCount);
        log.info("\n【size=[{}]】", list_1.size());
        br.close();
        fr.close();


        // 1、准备文件
        List<WxReportDto> rows = CollUtil.newArrayList();
        String unionIds = "";
        Set<String> filter = new HashSet<>();
        for (FollowerExternalUserScDto temp : list_1) {
            WxReportDto wxReportDto = new WxReportDto();
            wxReportDto.setAppCode("SZQYWX004");
            wxReportDto.setUserName(temp.getUserName());
            wxReportDto.setExternalUserId(temp.getExternalUserId());
//            String httpResultUrl = String.format(httpUrl, token, temp.getExternalUserId());
//            HttpGet httpGet = new HttpGet(httpResultUrl);
//            CloseableHttpResponse response = requestHttp.execute(httpGet);
//            String responseContent = Utf8ResponseHandler.INSTANCE.handleResponse(response);
//            ExternalUserDetailRespDto respDto = new Gson().fromJson(responseContent, ExternalUserDetailRespDto.class);
//            wxReportDto.setWxId(respDto.getExternal_contact().getUnionid());
            wxReportDto.setWxId(externalUserIdMapUnionId.get(temp.getExternalUserId()));
            wxReportDto.setRecipient(temp.getRecipient());
            wxReportDto.setRecipientId(temp.getFollowerId());
            if (!StringUtils.isEmpty(wxReportDto.getWxId())
                    &&!filter.contains(wxReportDto.getWxId())) {
                filter.add(wxReportDto.getWxId());
            }
            rows.add(wxReportDto);
        }
        log.info("filter-size：{}", filter.size());
        String filterLine = "";
        String filterPath = "E:\\Opensource-projects\\wx-msg-persistence\\src\\main\\java\\com\\atmatrix\\wechat\\middleware\\filter.txt";

        Set<String> filterIds = Sets.newHashSet();
        FileReader filterUnionReader = new FileReader(filterPath);
        BufferedReader brFilter = new BufferedReader(filterUnionReader);

        int filterCount = 0;
        while ((filterLine = brFilter.readLine()) != null) {
            filterIds.add(replaceBlank(filterLine));
            filterCount++;
        }
        log.info("\n【filterCount=[{}]】", filterCount);

        List<WxReportDto> filterResult = Lists.newArrayList();
        for (int i = 0; i < rows.size(); i++) {
            WxReportDto wxReportDto = rows.get(i);
            if (filterIds.contains(wxReportDto.getWxId())) {
                filterResult.add(wxReportDto);
            }
        }


        List<List<WxReportDto>> partition = Lists.partition(filterResult, 30000);
        for (int i = 0; i < partition.size(); i++) {
            String path = "E:\\Opensource-projects\\wx-msg-persistence\\src\\main\\java\\com\\atmatrix\\wechat\\middleware\\follower_external_user_sc_%s.xlsx";
            String finalPath = String.format(path, i);
            ExcelWriter writer = ExcelUtil.getWriter(finalPath);
            writer.addHeaderAlias("userName", "微信昵称");
            writer.addHeaderAlias("wxId", "微信ID");
            writer.addHeaderAlias("externalUserId", "微信外部联系人ID");
            writer.addHeaderAlias("recipient", "小管家名称");
            writer.addHeaderAlias("recipientId", "小管家ID");
            writer.write(partition.get(i));
            writer.close();
            if (i > 5) {
                break;
            }
        }





    }
}
