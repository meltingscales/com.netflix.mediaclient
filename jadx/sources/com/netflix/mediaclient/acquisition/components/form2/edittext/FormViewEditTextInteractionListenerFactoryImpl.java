package com.netflix.mediaclient.acquisition.components.form2.edittext;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FormViewEditTextInteractionListenerFactoryImpl implements FormViewEditTextInteractionListenerFactory {
    public static final int $stable = 8;
    private final SignupLogger signupLogger;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes6.dex */
    public interface FormViewEditTextInteractionListenerFactoryModule {
        @Binds
        FormViewEditTextInteractionListenerFactory interactionListenerFactory(FormViewEditTextInteractionListenerFactoryImpl formViewEditTextInteractionListenerFactoryImpl);
    }

    @Inject
    public FormViewEditTextInteractionListenerFactoryImpl(SignupLogger signupLogger) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextInteractionListenerFactory
    public FormViewEditText.FormViewEditTextInteractionListener createTextLogger(AppView appView, InputKind inputKind) {
        if (appView == null && inputKind == null) {
            return null;
        }
        return new FormViewEditTextLogger(this.signupLogger, appView, inputKind);
    }
}
