package com.netflix.mediaclient.acquisition.components.form2.edittext;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.ValidateInputRejected;
import com.netflix.cl.model.event.session.action.ValidateInput;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupLogger;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FormViewEditTextLogger implements FormViewEditText.FormViewEditTextInteractionListener {
    public static final int $stable = 8;
    private final AppView appView;
    private Long inputFocusId;
    private final InputKind inputKind;
    private Long inputValidationId;
    private final SignupLogger signupLogger;

    public final AppView getAppView() {
        return this.appView;
    }

    public final InputKind getInputKind() {
        return this.inputKind;
    }

    public FormViewEditTextLogger(SignupLogger signupLogger, AppView appView, InputKind inputKind) {
        C8632dsu.c((Object) signupLogger, "");
        this.signupLogger = signupLogger;
        this.appView = appView;
        this.inputKind = inputKind;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText.FormViewEditTextInteractionListener
    public void onFocusChange(boolean z) {
        AppView appView = this.appView;
        if (appView == null) {
            return;
        }
        if (z) {
            this.inputFocusId = this.signupLogger.startSession(new Focus(appView, null));
            return;
        }
        Long l = this.inputFocusId;
        if (l != null) {
            this.signupLogger.endSession(l.longValue());
            this.inputFocusId = null;
        }
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText.FormViewEditTextInteractionListener
    public void onPreValidation() {
        InputKind inputKind = this.inputKind;
        if (inputKind == null || this.inputValidationId != null) {
            return;
        }
        this.inputValidationId = this.signupLogger.startSession(new ValidateInput(null, inputKind, null, null, null));
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText.FormViewEditTextInteractionListener
    public void onPostValidation(boolean z) {
        Long l = this.inputValidationId;
        if (this.inputKind == null || l == null) {
            return;
        }
        if (z) {
            ValidateInputRejected createValidateInputRejected = this.signupLogger.createValidateInputRejected(l);
            if (createValidateInputRejected != null) {
                this.signupLogger.endSession(createValidateInputRejected);
            }
        } else {
            this.signupLogger.endSession(l.longValue());
        }
        this.inputValidationId = null;
    }
}
