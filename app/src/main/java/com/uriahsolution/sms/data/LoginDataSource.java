package com.uriahsolution.sms.data;


import android.support.annotation.NonNull;

public interface LoginDataSource {


    interface getLoginCallback{

        void onSucess();
        void onError();
    }

    void getLogin(String mobile,@NonNull getLoginCallback getLoginCallback );
}
