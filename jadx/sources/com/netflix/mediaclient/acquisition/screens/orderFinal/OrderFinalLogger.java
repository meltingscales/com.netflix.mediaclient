package com.netflix.mediaclient.acquisition.screens.orderFinal;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextInteractionListenerFactory;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class OrderFinalLogger implements OrderFinalFragment.OrderFinalInteractionListener {
    public static final int $stable = 8;
    private final FormViewEditText.FormViewEditTextInteractionListener phoneInputLogger;
    private final SignupLogger signupLogger;
    private Long submitId;

    public final SignupLogger getSignupLogger() {
        return this.signupLogger;
    }

    public final Long getSubmitId() {
        return this.submitId;
    }

    public final void setSubmitId(Long l) {
        this.submitId = l;
    }

    @Inject
    public OrderFinalLogger(FormViewEditTextInteractionListenerFactory formViewEditTextInteractionListenerFactory, SignupLogger signupLogger) {
        C8632dsu.c((Object) formViewEditTextInteractionListenerFactory, "");
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
        this.phoneInputLogger = formViewEditTextInteractionListenerFactory.createTextLogger(AppView.phoneNumberInput, InputKind.phoneNumber);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment.OrderFinalInteractionListener
    public void logContinueAction() {
        this.submitId = this.signupLogger.startSession(new Focus(AppView.continueButton, null));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment.OrderFinalInteractionListener
    public void logPhoneFocusChange(boolean z) {
        FormViewEditText.FormViewEditTextInteractionListener formViewEditTextInteractionListener = this.phoneInputLogger;
        if (formViewEditTextInteractionListener != null) {
            formViewEditTextInteractionListener.onFocusChange(z);
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment.OrderFinalInteractionListener
    public void endSessions() {
        FormViewEditText.FormViewEditTextInteractionListener formViewEditTextInteractionListener = this.phoneInputLogger;
        if (formViewEditTextInteractionListener != null) {
            formViewEditTextInteractionListener.onFocusChange(false);
        }
        Long l = this.submitId;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
        }
    }
}
