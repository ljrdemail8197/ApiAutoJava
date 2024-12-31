package com.course.code;


import org.apache.hc.client5.http.classic.methods.HttpGet;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class MyHttpClient {
    @Test
    public void test1() {
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        try {
            CloseableHttpResponse response = httpClient.execute(get);
            result=EntityUtils.toString(response.getEntity());
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
