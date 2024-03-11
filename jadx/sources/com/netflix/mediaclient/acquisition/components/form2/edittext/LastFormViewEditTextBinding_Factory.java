package com.netflix.mediaclient.acquisition.components.form2.edittext;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class LastFormViewEditTextBinding_Factory implements Factory<LastFormViewEditTextBinding> {
    private final Provider<KeyboardController> keyboardControllerProvider;

    public LastFormViewEditTextBinding_Factory(Provider<KeyboardController> provider) {
        this.keyboardControllerProvider = provider;
    }

    @Override // javax.inject.Provider
    public LastFormViewEditTextBinding get() {
        return newInstance(this.keyboardControllerProvider.get());
    }

    public static LastFormViewEditTextBinding_Factory create(Provider<KeyboardController> provider) {
        return new LastFormViewEditTextBinding_Factory(provider);
    }

    public static LastFormViewEditTextBinding newInstance(KeyboardController keyboardController) {
        return new LastFormViewEditTextBinding(keyboardController);
    }
}
