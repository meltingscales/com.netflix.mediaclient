package com.netflix.mediaclient.acquisition.components.form2.edittext;

import android.view.KeyEvent;
import android.widget.TextView;
import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.components.form.FormSubmissionListener;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class LastFormViewEditTextBinding {
    public static final int $stable = 8;
    private final KeyboardController keyboardController;

    @Inject
    public LastFormViewEditTextBinding(KeyboardController keyboardController) {
        C8632dsu.c((Object) keyboardController, "");
        this.keyboardController = keyboardController;
    }

    public final void bind(FormViewEditText formViewEditText, boolean z, final FormSubmissionListener formSubmissionListener) {
        C8632dsu.c((Object) formViewEditText, "");
        C8632dsu.c((Object) formSubmissionListener, "");
        if (z) {
            formViewEditText.setImeOptions(2);
        }
        formViewEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.LastFormViewEditTextBinding$$ExternalSyntheticLambda0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean bind$lambda$0;
                bind$lambda$0 = LastFormViewEditTextBinding.bind$lambda$0(FormSubmissionListener.this, this, textView, i, keyEvent);
                return bind$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$0(FormSubmissionListener formSubmissionListener, LastFormViewEditTextBinding lastFormViewEditTextBinding, TextView textView, int i, KeyEvent keyEvent) {
        C8632dsu.c((Object) formSubmissionListener, "");
        C8632dsu.c((Object) lastFormViewEditTextBinding, "");
        if (i == 2) {
            formSubmissionListener.onFormSubmit();
        }
        lastFormViewEditTextBinding.keyboardController.dismissKeyboard();
        return true;
    }
}
