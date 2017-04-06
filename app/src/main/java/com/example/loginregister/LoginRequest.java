package com.example.loginregister;

/**
 * Created by Soham  Mankad on 06-04-2017.
 */

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest{

    private static final String Login_Request_URL = "Your URL";   //COPY URL
    private Map<String, String> params;

    public  LoginRequest( String email, String password, Response.Listener<String> listener){
        super(Request.Method.POST, Login_Request_URL, listener, null);
        params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
    }
    @Override
    public Map<String, String> getParams(){
        return  params;
    }

}
