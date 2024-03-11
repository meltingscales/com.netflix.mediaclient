package com.netflix.mediaclient.acquisition.components.form2;

import com.netflix.android.moneyball.fields.BooleanField;
import com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class BooleanViewModel {
    public static final int $stable = 8;
    private final BooleanField booleanField;
    private final String id;
    private final FieldValueChangeListener valueChangeListener;

    public final String getId() {
        return this.id;
    }

    public BooleanViewModel(BooleanField booleanField, FieldValueChangeListener fieldValueChangeListener) {
        C8632dsu.c((Object) booleanField, "");
        this.booleanField = booleanField;
        this.valueChangeListener = fieldValueChangeListener;
        this.id = booleanField.getId();
    }

    public /* synthetic */ BooleanViewModel(BooleanField booleanField, FieldValueChangeListener fieldValueChangeListener, int i, C8627dsp c8627dsp) {
        this(booleanField, (i & 2) != 0 ? null : fieldValueChangeListener);
    }

    public final boolean getValue() {
        Object value = this.booleanField.getValue();
        Boolean bool = value instanceof Boolean ? (Boolean) value : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void setValue(boolean z) {
        this.booleanField.setValue(Boolean.valueOf(z));
        FieldValueChangeListener fieldValueChangeListener = this.valueChangeListener;
        if (fieldValueChangeListener != null) {
            fieldValueChangeListener.onValueChange(this.booleanField.getId(), Boolean.valueOf(z));
        }
    }
}
