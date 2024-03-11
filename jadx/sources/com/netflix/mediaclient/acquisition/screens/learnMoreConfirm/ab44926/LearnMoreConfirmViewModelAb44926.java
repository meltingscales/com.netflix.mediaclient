package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.ab44926;

import androidx.lifecycle.ViewModel;
import com.netflix.mediaclient.acquisition.lib.components.error.ErrorMessageViewModel;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.networking.SignupNetworkManager;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmParsedData;
import com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmViewModel;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class LearnMoreConfirmViewModelAb44926 extends LearnMoreConfirmViewModel {
    public static final int $stable = 0;
    private final String email;
    private final boolean showReceivedEmailExperience;

    /* loaded from: classes3.dex */
    public static final class LifecycleData extends ViewModel {
        public static final int $stable = 8;
        private String email;
        private boolean hasRecentlyRegistered;

        public final String getEmail() {
            return this.email;
        }

        public final boolean getHasRecentlyRegistered() {
            return this.hasRecentlyRegistered;
        }

        public final void setEmail(String str) {
            this.email = str;
        }

        public final void setHasRecentlyRegistered(boolean z) {
            this.hasRecentlyRegistered = z;
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmViewModel
    public String getEmail() {
        return this.email;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.LearnMoreConfirmViewModel
    public boolean getShowReceivedEmailExperience() {
        return this.showReceivedEmailExperience;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreConfirmViewModelAb44926(StringProvider stringProvider, LearnMoreConfirmParsedData learnMoreConfirmParsedData, SignupNetworkManager signupNetworkManager, ErrorMessageViewModel errorMessageViewModel, LifecycleData lifecycleData) {
        super(stringProvider, learnMoreConfirmParsedData, signupNetworkManager, errorMessageViewModel);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) learnMoreConfirmParsedData, "");
        C8632dsu.c((Object) signupNetworkManager, "");
        C8632dsu.c((Object) errorMessageViewModel, "");
        C8632dsu.c((Object) lifecycleData, "");
        lifecycleData.setHasRecentlyRegistered(lifecycleData.getHasRecentlyRegistered() | super.getShowReceivedEmailExperience());
        String email = lifecycleData.getEmail();
        lifecycleData.setEmail(email == null ? super.getEmail() : email);
        this.showReceivedEmailExperience = lifecycleData.getHasRecentlyRegistered();
        this.email = lifecycleData.getEmail();
    }
}
