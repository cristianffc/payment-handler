package com.mind.purchase.adapter;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import static java.lang.System.out;

public class JavaHttpAdapter implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            URL urlApi = new URL(url);
            URLConnection connection = urlApi.openConnection();
            connection.connect();
        } catch (Exception e) {
            out.println("Fail to send HTTP request");
        }

    }
}
