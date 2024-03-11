package com.netflix.mediaclient.acquisition.screens;

import android.os.Bundle;
import android.view.View;
import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormSubmissionListener;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public abstract class AbstractNetworkFragment2 extends AbstractSignupFragment2 implements FormSubmissionListener {
    public static final int $stable = 8;
    @Inject
    public KeyboardController keyboardController;

    public final void setKeyboardController(KeyboardController keyboardController) {
        C8632dsu.c((Object) keyboardController, "");
        this.keyboardController = keyboardController;
    }

    public abstract void setupLoadingObserver();

    public abstract void setupWarningObserver();

    public final KeyboardController getKeyboardController() {
        KeyboardController keyboardController = this.keyboardController;
        if (keyboardController != null) {
            return keyboardController;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        setupWarningObserver();
        setupLoadingObserver();
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getKeyboardController().dismissKeyboard();
    }

    @Override // com.netflix.mediaclient.acquisition.components.form.FormSubmissionListener
    public void onFormSubmit() {
        getKeyboardController().dismissKeyboard();
    }
}
