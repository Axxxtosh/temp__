package com.uriahsolution.sms.ui.login;

import com.uriahsolution.sms.BasePresenter;
import com.uriahsolution.sms.BaseView;

public class LoginContract {


        interface View extends BaseView<Presenter> {


        }

        interface Presenter extends BasePresenter<View> {


            void takeView(LoginContract.View view);
            void dropView();
        }


}
