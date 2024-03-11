package com.netflix.mediaclient.acquisition.components;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class KeyboardController {
    public static final int $stable = 8;
    private final Activity activity;

    @Inject
    public KeyboardController(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.activity = activity;
    }

    public final void dismissKeyboard() {
        Object systemService = this.activity.getSystemService("input_method");
        C8632dsu.d(systemService);
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = this.activity.getCurrentFocus();
        inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
    }

    public final void requestKeyboard(EditText editText) {
        C8632dsu.c((Object) editText, "");
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.activity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }
}
