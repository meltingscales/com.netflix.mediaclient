package com.netflix.mediaclient.acquisition.components.form2.popupEditText;

import com.netflix.android.moneyball.fields.NumberField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener;
import java.util.ArrayList;
import java.util.List;
import o.C8572dqo;
import o.C8576dqs;
import o.C8632dsu;
import o.C8654dtp;

/* loaded from: classes3.dex */
public final class BirthDateViewModel extends PopupIntEditTextViewModel {
    public static final int $stable = 0;

    @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditTextViewModel
    public int getHintResId() {
        return R.string.date_hint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthDateViewModel(NumberField numberField, FieldValueChangeListener fieldValueChangeListener) {
        super(numberField, fieldValueChangeListener);
        C8632dsu.c((Object) numberField, "");
        C8632dsu.c((Object) fieldValueChangeListener, "");
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditTextViewModel
    public List<Integer> getDropDownValues() {
        List<Integer> U;
        U = C8576dqs.U(new C8654dtp(1, 31));
        return U;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditTextViewModel
    public String getUserFacingValue() {
        Integer value = getValue();
        if (value != null) {
            int intValue = value.intValue();
            if (getDropDownValues().contains(Integer.valueOf(intValue))) {
                return String.valueOf(intValue);
            }
        }
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditTextViewModel
    public String[] getDropDownUserFacingValues() {
        int d;
        List<Integer> dropDownValues = getDropDownValues();
        d = C8572dqo.d(dropDownValues, 10);
        ArrayList arrayList = new ArrayList(d);
        for (Number number : dropDownValues) {
            arrayList.add(String.valueOf(number.intValue()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
