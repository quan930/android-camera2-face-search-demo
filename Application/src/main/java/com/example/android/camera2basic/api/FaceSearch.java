package com.example.android.camera2basic.api;

import com.example.android.camera2basic.pojo.FaceSearchAPI;
import com.example.android.camera2basic.util.Base64Util;
import com.example.android.camera2basic.util.GsonUtils;
import com.example.android.camera2basic.util.HttpUtil;

import java.util.HashMap;
import java.util.Map;

public class FaceSearch {
    public static FaceSearchAPI search(String accessToken,String imgStr) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/multi-search";
        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", imgStr);
            map.put("image_type", "BASE64");
            map.put("group_id_list", "test");
            map.put("max_face_num",10);

            String param = GsonUtils.toJson(map);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。

            String result = HttpUtil.post(url, accessToken, "application/json", param);
//            System.out.println(result);
            FaceSearchAPI faceSearchAPI = GsonUtils.fromJson(result, FaceSearchAPI.class);
//            System.out.println(faceSearchAPI);
            return faceSearchAPI;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
