package com.fmy.jsfRequest;

import java.util.List;

/**
 * @description:
 * @author: fengmengyang
 * @date: 2018/4/30 22:53.
 */
public class TestRequest {
    private String id;
    private String source;
    private String operatorName;
    private List<String> soNoList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public List<String> getSoNoList() {
        return soNoList;
    }

    public void setSoNoList(List<String> soNoList) {
        this.soNoList = soNoList;
    }
}
