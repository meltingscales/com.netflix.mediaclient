package com.netflix.mediaclient.acquisition.components.startMembershipButton;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import com.netflix.mediaclient.acquisition.lib.services.networking.BaseViewModelInitializer;
import javax.inject.Inject;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class StartMembershipButtonViewModelInitializer extends BaseViewModelInitializer {
    public static final int $stable = 8;
    private final MoneyballDataSource moneyballDataSource;
    private final StringProvider stringProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public StartMembershipButtonViewModelInitializer(MoneyballDataSource moneyballDataSource, SignupErrorReporter signupErrorReporter, StringProvider stringProvider) {
        super(signupErrorReporter);
        C8632dsu.c((Object) moneyballDataSource, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) stringProvider, "");
        this.moneyballDataSource = moneyballDataSource;
        this.stringProvider = stringProvider;
    }

    private final FlowMode getFlowMode() {
        return this.moneyballDataSource.getFlowMode();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonParsedData extractStartMembershipButtonData() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonViewModelInitializer.extractStartMembershipButtonData():com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonParsedData");
    }

    public final StartMembershipButtonViewModel createStartMembershipButtonViewModel() {
        return new StartMembershipButtonViewModel(this.stringProvider, extractStartMembershipButtonData());
    }
}
