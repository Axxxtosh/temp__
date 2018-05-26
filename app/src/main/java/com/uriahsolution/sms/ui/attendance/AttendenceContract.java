package com.uriahsolution.sms.ui.attendance;

import com.uriahsolution.sms.BaseView;


public class AttendenceContract {


    interface View extends BaseView<AttendenceContract.Presenter> {

        void startActivity(Class<?> cls);

    }

    interface Presenter {

        void test();

    }

}
