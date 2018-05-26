package com.uriahsolution.sms.ui.login;

import com.uriahsolution.sms.BaseView;

public class LoginContract {


        interface View extends BaseView<Presenter> {

                void startActivity(Class<?> cls);

        }

        interface Presenter {

        }


}
