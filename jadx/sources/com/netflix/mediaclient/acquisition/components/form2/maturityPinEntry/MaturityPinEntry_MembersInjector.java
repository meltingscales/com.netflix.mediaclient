package com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry;

import com.netflix.mediaclient.acquisition.components.KeyboardController;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class MaturityPinEntry_MembersInjector implements MembersInjector<MaturityPinEntry> {
    private final Provider<KeyboardController> keyboardControllerProvider;

    public MaturityPinEntry_MembersInjector(Provider<KeyboardController> provider) {
        this.keyboardControllerProvider = provider;
    }

    public static MembersInjector<MaturityPinEntry> create(Provider<KeyboardController> provider) {
        return new MaturityPinEntry_MembersInjector(provider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MaturityPinEntry maturityPinEntry) {
        injectKeyboardController(maturityPinEntry, this.keyboardControllerProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry.keyboardController")
    public static void injectKeyboardController(MaturityPinEntry maturityPinEntry, KeyboardController keyboardController) {
        maturityPinEntry.keyboardController = keyboardController;
    }
}
