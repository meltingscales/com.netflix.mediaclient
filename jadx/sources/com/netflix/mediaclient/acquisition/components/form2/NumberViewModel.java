package com.netflix.mediaclient.acquisition.components.form2;

import com.netflix.android.moneyball.fields.NumberField;
import com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class NumberViewModel {
    public static final int $stable = 8;
    private final NumberField numberField;
    private final FieldValueChangeListener valueChangeListener;

    public NumberViewModel(NumberField numberField, FieldValueChangeListener fieldValueChangeListener) {
        C8632dsu.c((Object) numberField, "");
        C8632dsu.c((Object) fieldValueChangeListener, "");
        this.numberField = numberField;
        this.valueChangeListener = fieldValueChangeListener;
    }

    public final Integer getValue() {
        Object value = this.numberField.getValue();
        if (value instanceof Double) {
            return Integer.valueOf((int) ((Number) value).doubleValue());
        }
        if (value instanceof Integer) {
            return (Integer) value;
        }
        if (value instanceof Long) {
            return Integer.valueOf((int) ((Number) value).longValue());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setValue(java.lang.Integer r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            com.netflix.android.moneyball.fields.NumberField r0 = r2.numberField
            r0.setValue(r3)
            com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener r0 = r2.valueChangeListener
            com.netflix.android.moneyball.fields.NumberField r1 = r2.numberField
            java.lang.String r1 = r1.getId()
            r0.onValueChange(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.components.form2.NumberViewModel.setValue(java.lang.Integer):void");
    }

    public final boolean isValid() {
        return this.numberField.isValid();
    }
}
