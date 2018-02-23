package com.leo.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class Test {
	public static void main(String[] args) {
        fk();
//        yx();
    }

    public static void fk() {
        String url = "http://localhost:9001/spsupport/rest/services/cls2EasService/cancelSheet";
        Map<String,String> map = new HashMap<String,String>();
        map.put("crId", "41401");
        map.put("reason", "用户缴费");
        Map a = new RestTemplate().postForObject(url, map, Map.class);
        System.out.println(a);
    }

    public static void yx() {
        String url1 = "http://localhost:9001/spsupport/rest/services/busiService/getMpedIndexById";
        Map paramMap = new HashMap();
        paramMap.put("tmnlId", "1");  // 终端类型
        paramMap.put("type", "1"); // 终端类型
        paramMap.put("shard_no", "41401"); //分库字段"
        String a = new RestTemplate().postForObject(url1, paramMap, String.class);
        System.out.println(a);
    }
}
