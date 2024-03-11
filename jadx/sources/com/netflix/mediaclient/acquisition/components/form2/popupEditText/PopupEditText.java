package com.netflix.mediaclient.acquisition.components.form2.popupEditText;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.netflix.mediaclient.acquisition.databinding.FormInputPopupEditTextViewHolderBinding;
import com.netflix.mediaclient.ui.R;
import dagger.hilt.android.AndroidEntryPoint;
import o.C8168dfL;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drO;

@AndroidEntryPoint(LinearLayout.class)
/* loaded from: classes3.dex */
public abstract class PopupEditText extends Hilt_PopupEditText {
    public static final int $stable = 8;
    private final FormInputPopupEditTextViewHolderBinding binding;
    private final EditText editText;
    private final TextInputLayout inputLayout;
    private drO<dpR> validationListener;
    private PopupEditTextViewModel<Integer> viewModel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopupEditText(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopupEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopupEditText(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public static /* synthetic */ void getInputLayout$annotations() {
    }

    public abstract AlertDialog getAlertDialog(drO<dpR> dro);

    /* JADX INFO: Access modifiers changed from: protected */
    public final EditText getEditText() {
        return this.editText;
    }

    public final TextInputLayout getInputLayout() {
        return this.inputLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final PopupEditTextViewModel<Integer> getViewModel() {
        return this.viewModel;
    }

    protected final void setViewModel(PopupEditTextViewModel<Integer> popupEditTextViewModel) {
        this.viewModel = popupEditTextViewModel;
    }

    public /* synthetic */ PopupEditText(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        FormInputPopupEditTextViewHolderBinding inflate = FormInputPopupEditTextViewHolderBinding.inflate(LayoutInflater.from(context), this, true);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        TextInputLayout textInputLayout = inflate.inputLayout;
        C8632dsu.a(textInputLayout, "");
        this.inputLayout = textInputLayout;
        EditText editText = inflate.editText;
        C8632dsu.a(editText, "");
        this.editText = editText;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditText$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PopupEditText._init_$lambda$0(PopupEditText.this, view);
            }
        };
        setOnClickListener(onClickListener);
        editText.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PopupEditText popupEditText, View view) {
        C8632dsu.c((Object) popupEditText, "");
        popupEditText.showDialog();
    }

    public void bind(PopupEditTextViewModel<Integer> popupEditTextViewModel, drO<dpR> dro) {
        this.viewModel = popupEditTextViewModel;
        this.validationListener = dro;
        if (popupEditTextViewModel != null) {
            this.inputLayout.setHint(C8168dfL.d(popupEditTextViewModel.getHintResId()));
            String userFacingValue = popupEditTextViewModel.getUserFacingValue();
            if (userFacingValue != null) {
                this.editText.setText(userFacingValue);
            }
        }
    }

    public final void setValidationState(boolean z) {
        if (z) {
            this.inputLayout.setBackgroundResource(R.e.aV);
        } else {
            this.inputLayout.setBackgroundResource(R.e.aR);
        }
    }

    public void showDialog() {
        AlertDialog alertDialog = getAlertDialog(this.validationListener);
        alertDialog.getListView().setDivider(new ColorDrawable(ContextCompat.getColor(getContext(), R.c.r)));
        alertDialog.getListView().setDividerHeight(2);
        alertDialog.show();
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
