package com.youyou.web.comm;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class ResultModel extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public ResultModel() {
        put("code", HttpServletResponse.SC_OK);
    }

    @Override
    public ResultModel put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public static ResultModel error() {
        return error(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }

    public static ResultModel error(String msg) {
        return error(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static ResultModel error(int code, String msg) {
        ResultModel r = new ResultModel();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static ResultModel ok(String msg) {
        ResultModel r = new ResultModel();
        r.put("msg", msg);
        return r;
    }

    public static ResultModel ok(Map<String, Object> map) {
        ResultModel r = new ResultModel();
        r.putAll(map);
        return r;
    }

    public static ResultModel ok() {
        return new ResultModel();
    }
}
