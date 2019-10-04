package com.example.android.camera2basic.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FaceSearchAPI {
    @SerializedName("error_code")
    private Integer errorCode;
    @SerializedName("error_msg")
    private String errorMsg;
    @SerializedName("log_id")
    private Long logId;
    @SerializedName("timestamp")
    private Long timestamp;
    @SerializedName("cached")
    private Integer cached;
    @SerializedName("result")
    private Result result;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getCached() {
        return cached;
    }

    public void setCached(Integer cached) {
        this.cached = cached;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "FaceSearchAPI{" +
                "errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                ", logId=" + logId +
                ", timestamp=" + timestamp +
                ", cached=" + cached +
                ", result=" + result +
                '}';
    }

    public class Result {
        @SerializedName("face_num")
        private Integer num;//人脸数量
        @SerializedName("face_list")
        private List<Face> faceList;

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }

        public List<Face> getFaceList() {
            return faceList;
        }

        public void setFaceList(List<Face> faceList) {
            this.faceList = faceList;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "num=" + num +
                    ", faceList=" + faceList +
                    '}';
        }
    }
    public class Face{
        @SerializedName("face_token")
        private String token;//人脸唯一标识
        @SerializedName("location")
        private Location location;//位置
        @SerializedName("user_list")
        private List<User> userList;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public List<User> getUserList() {
            return userList;
        }

        public void setUserList(List<User> userList) {
            this.userList = userList;
        }

        @Override
        public String toString() {
            return "Face{" +
                    "token='" + token + '\'' +
                    ", location=" + location +
                    ", userList=" + userList +
                    '}';
        }
    }
    public class User{
        //        "group_id":"test","user_id":"4","user_info":"","score":95.693115234375}
        @SerializedName("group_id")
        private String groupId;
        @SerializedName("user_id")
        private String id;
        @SerializedName("user_info")
        private String info;
        @SerializedName("score")
        private Double score;//相识程度

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public Double getScore() {
            return score;
        }

        public void setScore(Double score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "User{" +
                    "groupId='" + groupId + '\'' +
                    ", id='" + id + '\'' +
                    ", info='" + info + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
    public class Location{
        private Double left;//人脸区域离左边界的距离
        private Double top;//人脸区域离上边界的距离
        private Double width;//人脸区域的宽度
        private Double height;//人脸区域的高度
        private Integer rotation;//旋转角度

        public Double getLeft() {
            return left;
        }

        public void setLeft(Double left) {
            this.left = left;
        }

        public Double getTop() {
            return top;
        }

        public void setTop(Double top) {
            this.top = top;
        }

        public Double getWidth() {
            return width;
        }

        public void setWidth(Double width) {
            this.width = width;
        }

        public Double getHeight() {
            return height;
        }

        public void setHeight(Double height) {
            this.height = height;
        }

        public Integer getRotation() {
            return rotation;
        }

        public void setRotation(Integer rotation) {
            this.rotation = rotation;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "left=" + left +
                    ", top=" + top +
                    ", width=" + width +
                    ", height=" + height +
                    ", rotation=" + rotation +
                    '}';
        }
    }
}

