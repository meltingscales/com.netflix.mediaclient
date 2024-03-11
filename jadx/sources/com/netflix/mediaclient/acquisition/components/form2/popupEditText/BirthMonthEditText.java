package com.netflix.mediaclient.acquisition.components.form2.popupEditText;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.widget.EditText;
import com.netflix.mediaclient.acquisition.R;
import dagger.hilt.android.AndroidEntryPoint;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drO;

@AndroidEntryPoint(PopupEditText.class)
/* loaded from: classes3.dex */
public final class BirthMonthEditText extends Hilt_BirthMonthEditText {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BirthMonthEditText(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BirthMonthEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BirthMonthEditText(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ BirthMonthEditText(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthMonthEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
    }

    private final BirthMonthViewModel getBirthMonthViewModel() {
        PopupEditTextViewModel<Integer> viewModel = getViewModel();
        if (viewModel instanceof BirthMonthViewModel) {
            return (BirthMonthViewModel) viewModel;
        }
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditText
    public AlertDialog getAlertDialog(final drO<dpR> dro) {
        AlertDialog.Builder title = new AlertDialog.Builder(getContext()).setTitle(R.string.select_birth_month);
        BirthMonthViewModel birthMonthViewModel = getBirthMonthViewModel();
        String[] dropDownUserFacingValues = birthMonthViewModel != null ? birthMonthViewModel.getDropDownUserFacingValues() : null;
        BirthMonthViewModel birthMonthViewModel2 = getBirthMonthViewModel();
        AlertDialog create = title.setSingleChoiceItems(dropDownUserFacingValues, birthMonthViewModel2 != null ? birthMonthViewModel2.getCheckedItem() : -1, new DialogInterface.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.form2.popupEditText.BirthMonthEditText$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BirthMonthEditText.getAlertDialog$lambda$0(BirthMonthEditText.this, dro, dialogInterface, i);
            }
        }).setCancelable(true).create();
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAlertDialog$lambda$0(BirthMonthEditText birthMonthEditText, drO dro, DialogInterface dialogInterface, int i) {
        String[] dropDownUserFacingValues;
        C8632dsu.c((Object) birthMonthEditText, "");
        BirthMonthViewModel birthMonthViewModel = birthMonthEditText.getBirthMonthViewModel();
        if (birthMonthViewModel != null) {
            birthMonthViewModel.setValue(Integer.valueOf(i + 1));
        }
        EditText editText = birthMonthEditText.getEditText();
        BirthMonthViewModel birthMonthViewModel2 = birthMonthEditText.getBirthMonthViewModel();
        editText.setText((birthMonthViewModel2 == null || (dropDownUserFacingValues = birthMonthViewModel2.getDropDownUserFacingValues()) == null) ? null : dropDownUserFacingValues[i]);
        if (dro != null) {
            dro.invoke();
        }
        dialogInterface.dismiss();
    }
}
