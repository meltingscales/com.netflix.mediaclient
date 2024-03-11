package com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class MaturityPinEntry$setupListeners$textChangeListener$1 implements TextWatcher {
    final /* synthetic */ EditText $slot;
    final /* synthetic */ MaturityPinEntry this$0;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaturityPinEntry$setupListeners$textChangeListener$1(EditText editText, MaturityPinEntry maturityPinEntry) {
        this.$slot = editText;
        this.this$0 = maturityPinEntry;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            EditText editText = this.$slot;
            if (charSequence.length() < 2 || !editText.hasFocus()) {
                return;
            }
            editText.setText(String.valueOf(charSequence.charAt(i)));
            editText.setSelection(1);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.this$0.updatePinViewModel();
        Handler handler = new Handler();
        if (editable == null || editable.length() <= 0) {
            return;
        }
        if (this.this$0.getNextMap().get(this.$slot) == null) {
            this.this$0.getKeyboardController().dismissKeyboard();
            return;
        }
        final MaturityPinEntry maturityPinEntry = this.this$0;
        final EditText editText = this.$slot;
        handler.postDelayed(new Runnable() { // from class: com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry$setupListeners$textChangeListener$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MaturityPinEntry$setupListeners$textChangeListener$1.afterTextChanged$lambda$1(MaturityPinEntry.this, editText);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void afterTextChanged$lambda$1(MaturityPinEntry maturityPinEntry, EditText editText) {
        C8632dsu.c((Object) maturityPinEntry, "");
        C8632dsu.c((Object) editText, "");
        EditText editText2 = maturityPinEntry.getNextMap().get(editText);
        if (editText2 != null) {
            editText2.requestFocusFromTouch();
        }
    }
}
