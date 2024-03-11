package com.netflix.mediaclient.acquisition.components.form2.popupEditText;

import java.util.List;

/* loaded from: classes3.dex */
public interface PopupEditTextViewModel<T> {
    int getCheckedItem();

    String[] getDropDownUserFacingValues();

    List<T> getDropDownValues();

    int getHintResId();

    String getUserFacingValue();

    T mapIndexToValue(int i);
}
