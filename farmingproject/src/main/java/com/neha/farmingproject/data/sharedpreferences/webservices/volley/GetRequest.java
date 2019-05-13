package com.neha.farmingproject.data.sharedpreferences.webservices.volley;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;



public class GetRequest extends StringRequest {

    public GetRequest(int method, String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(method, url, listener, errorListener);
    }
}