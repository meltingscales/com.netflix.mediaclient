package com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText;

import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextInteractionListenerFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ProfileEntryEditTextCheckbox_MembersInjector implements MembersInjector<ProfileEntryEditTextCheckbox> {
    private final Provider<FormViewEditTextInteractionListenerFactory> interactionListenerFactoryProvider;

    public ProfileEntryEditTextCheckbox_MembersInjector(Provider<FormViewEditTextInteractionListenerFactory> provider) {
        this.interactionListenerFactoryProvider = provider;
    }

    public static MembersInjector<ProfileEntryEditTextCheckbox> create(Provider<FormViewEditTextInteractionListenerFactory> provider) {
        return new ProfileEntryEditTextCheckbox_MembersInjector(provider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox) {
        injectInteractionListenerFactory(profileEntryEditTextCheckbox, this.interactionListenerFactoryProvider.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox.interactionListenerFactory")
    public static void injectInteractionListenerFactory(ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox, FormViewEditTextInteractionListenerFactory formViewEditTextInteractionListenerFactory) {
        profileEntryEditTextCheckbox.interactionListenerFactory = formViewEditTextInteractionListenerFactory;
    }
}
