package com.netflix.mediaclient.acquisition.components.form2.choiceField;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import java.util.List;

/* loaded from: classes6.dex */
public interface ChoiceFieldViewModel {
    AppView getAppView();

    Integer getErrorMessage();

    InputKind getInputKind();

    int getLabel();

    List<OptionFieldViewModel> getOptions();

    String getValue();

    void setValue(String str);
}
