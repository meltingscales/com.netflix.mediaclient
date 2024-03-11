package com.netflix.mediaclient.acquisition.components.form2.popupEditText;

import com.netflix.android.moneyball.fields.NumberField;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import java.util.ArrayList;
import java.util.List;
import o.C8572dqo;
import o.C8576dqs;
import o.C8632dsu;
import o.C8654dtp;

/* loaded from: classes3.dex */
public final class BirthMonthViewModel extends PopupIntEditTextViewModel {
    public static final int $stable = 8;
    private final StringProvider stringProvider;

    @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditTextViewModel
    public int getHintResId() {
        return R.string.month_hint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthMonthViewModel(StringProvider stringProvider, NumberField numberField, FieldValueChangeListener fieldValueChangeListener) {
        super(numberField, fieldValueChangeListener);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) numberField, "");
        C8632dsu.c((Object) fieldValueChangeListener, "");
        this.stringProvider = stringProvider;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditTextViewModel
    public List<Integer> getDropDownValues() {
        List<Integer> U;
        U = C8576dqs.U(new C8654dtp(1, 12));
        return U;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.popupEditText.PopupEditTextViewModel
    public String getUserFacingValue() {
        Integer value = getValue();
        if (value != null) {
            int intValue = value.intValue();
            if (getDropDownValues().contains(Integer.valueOf(intValue))) {
                return getMonthString(Integer.valueOf(intValue));
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
            arrayList.add(getMonthString(Integer.valueOf(number.intValue())));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final String getMonthString(Integer num) {
        int i;
        if (num != null && num.intValue() == 1) {
            i = R.string.month_1;
        } else if (num != null && num.intValue() == 2) {
            i = R.string.month_2;
        } else if (num != null && num.intValue() == 3) {
            i = R.string.month_3;
        } else if (num != null && num.intValue() == 4) {
            i = R.string.month_4;
        } else if (num != null && num.intValue() == 5) {
            i = R.string.month_5;
        } else if (num != null && num.intValue() == 6) {
            i = R.string.month_6;
        } else if (num != null && num.intValue() == 7) {
            i = R.string.month_7;
        } else if (num != null && num.intValue() == 8) {
            i = R.string.month_8;
        } else if (num != null && num.intValue() == 9) {
            i = R.string.month_9;
        } else if (num != null && num.intValue() == 10) {
            i = R.string.month_10;
        } else {
            i = (num != null && num.intValue() == 11) ? R.string.month_11 : R.string.month_12;
        }
        return this.stringProvider.getString(i);
    }
}
