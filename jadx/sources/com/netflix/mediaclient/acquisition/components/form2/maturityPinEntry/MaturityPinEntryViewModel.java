package com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry;

import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class MaturityPinEntryViewModel {
    public static final int $stable = 8;
    private final StringField stringField;
    private final FieldValueChangeListener valueChangeListener;

    public MaturityPinEntryViewModel(StringField stringField, FieldValueChangeListener fieldValueChangeListener) {
        C8632dsu.c((Object) stringField, "");
        C8632dsu.c((Object) fieldValueChangeListener, "");
        this.stringField = stringField;
        this.valueChangeListener = fieldValueChangeListener;
    }

    public final String getValue() {
        Object value = this.stringField.getValue();
        if (value instanceof String) {
            return (String) value;
        }
        return null;
    }

    public final void setValue(String str) {
        if (str == null) {
            str = "";
        }
        this.stringField.setValue(str);
        this.valueChangeListener.onValueChange(this.stringField.getId(), str);
    }

    public final boolean isValid() {
        return this.stringField.isValid();
    }
}
