package com.fmy.controller;

import com.alibaba.fastjson.JSON;
import com.fmy.domain.TestCase;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.annotation.ServletSecurity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: fengmengyang
 * @date: 2018/4/29 15:43.
 */
@RestController
@RequestMapping("/testCase")
public class TestCaseController {

    @GetMapping("/view.do")
    public ModelAndView view() {
        ModelAndView modelAndView = new ModelAndView("/testCase/view");
        return modelAndView;
    }

    @GetMapping("/viewList.do")
    public ModelAndView viewTestCaseList() {
        ModelAndView modelAndView = new ModelAndView("testCase/viewList");
        // 查询数据库
        List<TestCase> testCaseList = new ArrayList<>();
        TestCase testCase = new TestCase();
        testCase.setId(1);
        testCase.setName("测试用例");
//        testCase.set("fmy-group");
        testCase.setDesc("this is 测试用例");
        testCase.setCreateUser("fmy");
        testCase.setCreateTime(new Date());
        testCase.setUpdateUser("fmy-update");
        testCase.setUpdateTime(new Date());
        testCase.setAlias("kom-core-service");
        testCase.setInterfaceName("com.jd.kom.core.service.OrderMainService");
        testCase.setRequestParams("{FADFADFAFD}");

        testCaseList.add(testCase);
        modelAndView.addObject("result", testCaseList);
        return modelAndView;
    }

    @PostMapping("/showParams.do")
    public ModelAndView showParams(@RequestParam("id") int id, @RequestParam("type") String type) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("type", type);
        // 查询数据库
        TestCase testCase = new TestCase();
        testCase.setRequestParams(clearString("{\n" +
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
                "}"));
        testCase.setResponseParams(clearString("{\n" +
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
                "}"));
        modelAndView.addObject("testCase", testCase);

        if ("requestParams".equals(type) || "responseParams".equals(type)) {
            modelAndView.setViewName("testCase/showParams");
        } else if ("execute".equals(type)) {
            modelAndView.setViewName("testCase/executeView");
        }
        return modelAndView;
    }

    private void stringToJson(String arr) {
//        JSON.parse()
    }

    private String clearString(String str) {
        Pattern p = Pattern.compile("\\s*|\t|\r|\n");
        Matcher m = p.matcher(str);
        String a = m.replaceAll("");
        return a;
    }
}
