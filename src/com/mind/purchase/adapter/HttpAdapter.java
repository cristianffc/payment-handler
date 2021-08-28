package com.mind.purchase.adapter;

import java.util.Map;

public interface HttpAdapter {

    void post(String url, Map<String, Object> data);
}
