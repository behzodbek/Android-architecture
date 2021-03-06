package com.demo.ui.auth;

import com.demo.presenter.modules.auth.AuthPresenter;
import com.demo.presenter.modules.auth.AuthPresenterImpl;
import com.demo.presenter.modules.auth.SmsVerifierPresenter;
import com.demo.presenter.modules.auth.SmsVerifierPresenterImpl;

import dagger.Module;
import dagger.Provides;


/**
 * Created by Beka on 8/8/16.
 */

@Module(
        complete = false,
        library = true,
        injects = {AuthActivity.class,
                AuthFragment.class,
                SelectCountryActivity.class,
                SmsVerifierFragment.class,
                SimpleViewHolder.class})
public class AuthModule {
    @Provides
    AuthPresenter provideAuthPresenter(AuthPresenterImpl authPresenter) {
        return authPresenter;
    }

    @Provides SmsVerifierPresenter provideSmsVerifierPresenter(SmsVerifierPresenterImpl smsVerifierPresenter){
        return smsVerifierPresenter;
    }
}
