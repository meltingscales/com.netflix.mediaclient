package com.netflix.mediaclient.acquisition.components.form2.edittext;

import com.netflix.android.moneyball.fields.StringField;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.mediaclient.acquisition.components.form.formfield.FieldValueChangeListener;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class FormViewEditTextViewModelImpl implements FormViewEditTextViewModel {
    public static final int $stable = 8;
    private final AppView appView;
    private final InputKind inputKind;
    private final boolean isReadOnly;
    private final int maxLength;
    private final int minLength;
    private final StringField stringField;
    private final FieldValueChangeListener valueChangeListener;

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
    public AppView getAppView() {
        return this.appView;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
    public InputKind getInputKind() {
        return this.inputKind;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
    public int getMaxLength() {
        return this.maxLength;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
    public int getMinLength() {
        return this.minLength;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
    public boolean isReadOnly() {
        return this.isReadOnly;
    }

    public FormViewEditTextViewModelImpl(StringField stringField, AppView appView, InputKind inputKind, FieldValueChangeListener fieldValueChangeListener) {
        C8632dsu.c((Object) stringField, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) inputKind, "");
        this.stringField = stringField;
        this.appView = appView;
        this.inputKind = inputKind;
        this.valueChangeListener = fieldValueChangeListener;
        this.minLength = stringField.getMinLength();
        this.maxLength = stringField.getMaxLength();
        this.isReadOnly = stringField.isReadOnly();
    }

    public /* synthetic */ FormViewEditTextViewModelImpl(StringField stringField, AppView appView, InputKind inputKind, FieldValueChangeListener fieldValueChangeListener, int i, C8627dsp c8627dsp) {
        this(stringField, appView, inputKind, (i & 8) != 0 ? null : fieldValueChangeListener);
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
    public boolean isValid() {
        return this.stringField.isValid();
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
    public String getValue() {
        Object value = this.stringField.getValue();
        if (value instanceof String) {
            return (String) value;
        }
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
    public void setValue(String str) {
        if (str == null) {
            str = "";
        }
        this.stringField.setValue(str);
        FieldValueChangeListener fieldValueChangeListener = this.valueChangeListener;
        if (fieldValueChangeListener != null) {
            fieldValueChangeListener.onValueChange(this.stringField.getId(), str);
        }
    }

    @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
    public FormViewEditTextViewModel.Error getError() {
        String value = getValue();
        if (value == null || value.length() == 0) {
            return FormViewEditTextViewModel.Error.EMPTY;
        }
        int minLength = getMinLength();
        int maxLength = getMaxLength();
        int length = value.length();
        if (minLength > length || length > maxLength) {
            return FormViewEditTextViewModel.Error.LENGTH;
        }
        if (isValid()) {
            return null;
        }
        return FormViewEditTextViewModel.Error.REGEX;
    }
}
