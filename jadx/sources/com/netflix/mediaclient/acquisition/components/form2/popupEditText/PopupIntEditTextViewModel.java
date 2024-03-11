package com.netflix.mediaclient.acquisition.components.form2.popupEditText;

import com.netflix.android.moneyball.fields.NumberField;
import com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener;
import com.netflix.mediaclient.acquisition.components.form2.NumberViewModel;
import o.C8632dsu;

/* loaded from: classes3.dex */
public abstract class PopupIntEditTextViewModel extends NumberViewModel implements PopupEditTextViewModel<Integer> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupIntEditTextViewModel(NumberField numberField, FieldValueChangeListener fieldValueChangeListener) {
        super(numberField, fieldValueChangeListener);
        C8632dsu.c((Object) numberField, "");
        C8632dsu.c((Object) fieldValueChangeListener, "");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditTextViewModel
    public Integer mapIndexToValue(int i) {
        return Integer.valueOf(i + 1);
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditTextViewModel
    public int getCheckedItem() {
        Integer value = getValue();
        int intValue = value != null ? value.intValue() : -1;
        return intValue > 0 ? intValue - 1 : intValue;
    }
}
