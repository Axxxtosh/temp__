package com.uriahsolution.sms.data.remote;



import com.uriahsolution.sms.data.model.Response;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {


    @POST("notificationslider/notification_api.php")
    @FormUrlEncoded
    Call<Response> checkLogin(@Field("mobile") String number);



}


