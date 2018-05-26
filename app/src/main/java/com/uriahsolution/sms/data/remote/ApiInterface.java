package com.uriahsolution.sms.data.remote;


import com.uriahsolution.sms.data.model.Login;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {


    @POST("check_mobile_exist.php?")
    @FormUrlEncoded
    Call<Login> checkLogin(@Field("mobile") String number);

   /* @POST("notificationslider/notification_api.php")
    Observable<AlertResponse> getAlerts();*/


}


