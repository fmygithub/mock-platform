package com.fmy.domain;

/**
 * @description:
 * @author: fengmengyang
 * @date: 2018/5/14 8:09.
 */
public class JSONNode {

    private String key;
    private Object value;

    /**
     * 0 : string 或 基本数据类型
     * 1 : 数组
     * 2 ： map
     */
    private int type;

    public JSONNode() {}

    public JSONNode(String key, Object value, int type) {
        this.key = key;
        this.value = value;
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
