package com.netflix.mediaclient.acquisition.components.form2.ageVerify;

import android.content.Context;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.NumberViewModel;
import com.netflix.mediaclient.acquisition.databinding.FormInputBirthYearEditTextBinding;
import dagger.hilt.android.AndroidEntryPoint;
import o.C8168dfL;
import o.C8627dsp;
import o.C8632dsu;
import o.C8689dux;
import o.dpR;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class BirthYearEditText extends Hilt_BirthYearEditText {
    public static final int $stable = 8;
    private final FormInputBirthYearEditTextBinding binding;
    private final EditText editText;
    private final TextInputLayout inputLayout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BirthYearEditText(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BirthYearEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BirthYearEditText(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public static /* synthetic */ void getInputLayout$annotations() {
    }

    public final TextInputLayout getInputLayout() {
        return this.inputLayout;
    }

    public /* synthetic */ BirthYearEditText(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthYearEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        FormInputBirthYearEditTextBinding inflate = FormInputBirthYearEditTextBinding.inflate(LayoutInflater.from(context), this);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        EditText editText = inflate.editText;
        C8632dsu.a(editText, "");
        this.editText = editText;
        TextInputLayout textInputLayout = inflate.inputLayout;
        C8632dsu.a(textInputLayout, "");
        this.inputLayout = textInputLayout;
        setOrientation(1);
    }

    public final void bind(final NumberViewModel numberViewModel, final drO<dpR> dro) {
        this.inputLayout.setHint(C8168dfL.d(R.string.year_hint));
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.netflix.mediaclient.acquisition.components.form2.ageVerify.BirthYearEditText$bind$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Integer n;
                NumberViewModel numberViewModel2 = NumberViewModel.this;
                if (numberViewModel2 == null) {
                    return;
                }
                n = C8689dux.n(String.valueOf(charSequence));
                numberViewModel2.setValue(n);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                drO<dpR> dro2 = dro;
                if (dro2 != null) {
                    dro2.invoke();
                }
            }
        });
        if (numberViewModel != null) {
            Integer value = numberViewModel.getValue();
            this.editText.setText(value != null ? value.toString() : null);
        }
    }

    public final void setValidationState(boolean z) {
        if (z) {
            this.inputLayout.setBackgroundResource(com.netflix.mediaclient.ui.R.e.aV);
        } else {
            this.inputLayout.setBackgroundResource(com.netflix.mediaclient.ui.R.e.aR);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }
}
