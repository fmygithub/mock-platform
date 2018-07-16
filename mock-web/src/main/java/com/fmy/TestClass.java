package com.fmy;

import com.alibaba.fastjson.JSON;
import com.fmy.domain.JSONNode;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: fengmengyang
 * @date: 2018/5/13 23:01.
 */
public class TestClass {
    public static void main(String[] args) {
        String a = "{\n" +
                "\"address\":{\n" +
                "\"provinceId\":1,\n" +
                "\"cityId\":72,\n" +
                "\"countyId\":2799,\n" +
                "\"townId\":0\n" +
                "},\n" +
                "\"payType\":[\n" +
                "4\n" +
                "],\n" +
                "\"skuList\":[\n" +
                "{\n" +
                "\"skuId\":1592372,\n" +
                "\"num\":1,\n" +
                "\"unitPrice\":139.8,\n" +
                "\"width\":1,\n" +
                "\"height\":1,\n" +
                "\"length\":1,\n" +
                "\"weight\":1.65,\n" +
                "\"volumn\":1.55,\n" +
                "\"venderType\":3,\n" +
                "\"factoryShip\":0,\n" +
                "\"yuShouNoWay\":0,\n" +
                "\"storeProperty\":0,\n" +
                "\"dcId\":6,\n" +
                "\"dcIdDely\":6,\n" +
                "\"stockId\":10,\n" +
                "\"stockType\":0,\n" +
                "\"stockStatus\":33,\n" +
                "\"venderId\":0,\n" +
                "\"isSamGoods\":0,\n" +
                "\"isOverSeaPurchase\":0,\n" +
                "\"tempId\":\"-1\",\n" +
                "\"shipType\":0,\n" +
                "\"skuMark\":0,\n" +
                "\"vsId\":-1,\n" +
                "\"isVs\":-1,\n" +
                "\"stockW\":0,\n" +
                "\"goodsType\":0\n" +
                "}\n" +
                "],\n" +
                "\"pin\":\"tianshanguyue\",\n" +
                "\"source\":\"test\",\n" +
                "\"subFlowId\":0,\n" +
                "\"calendarType\":\"0001\",\n" +
                "\"channel\":1,\n" +
                "\"dateStr\":\"2018-5-12\",\n" +
                "\"timeRange\":\"09:00-19:00\",\n" +
                "\"sendpay\":{\n" +
                "\"1\":2,\n" +
                "\"30\":2,\n" +
                "\"35\":4\n" +
                "},\n" +
                "\"batchId\":1,\n" +
                "\"validateParams\":{\n" +
                "\"\":{\n" +
                "\"dateStr\":\"2018-5-12\",\n" +
                "\"timeRange\":\"09:00-19:00\",\n" +
                "\"sendpay\":{\n" +
                "\"1\":2,\n" +
                "\"30\":2,\n" +
                "\"35\":4\n" +
                "},\n" +
                "\"batchId\":1\n" +
                "}\n" +
                "},\n" +
                "\"userLevel\":60,\n" +
                "\"flagInfo\":\"00000000000000000000000000000000000000000000003000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\"\n" +
                "}";
        Map<String, Object> a1 = JSON.parseObject(a, Map.class);
        for (Map.Entry<String, Object> entry : a1.entrySet()) {
            Object value = parse(entry.getValue());
        }
    }

    private static JSONNode parse(Object obj) {
        JSONNode node = new JSONNode();

        if (obj instanceof Map) {
            node.setType(2);
        } else if (obj instanceof List) {
            node.setType(1);
        } else {
            node.setValue(obj);
            node.setType(0);
        }

//        System.out.println(a1.get("address") instanceof Map);
//        System.out.println(a1.get("payType") instanceof List);
//        System.out.println(a1.get("skuList") instanceof List);
        return node;
    }

}
