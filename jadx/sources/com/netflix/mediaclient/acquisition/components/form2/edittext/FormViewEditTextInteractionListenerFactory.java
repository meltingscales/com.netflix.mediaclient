package com.netflix.mediaclient.acquisition.components.form2.edittext;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;

/* loaded from: classes3.dex */
public interface FormViewEditTextInteractionListenerFactory {
    FormViewEditText.FormViewEditTextInteractionListener createTextLogger(AppView appView, InputKind inputKind);
}
