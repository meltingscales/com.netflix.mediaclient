package com.netflix.mediaclient.acquisition.components.tou;

import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.startMembershipButton.StartMembershipButtonViewModel;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public class TouPaymentViewModel extends TouViewModel {
    public static final int $stable = 8;
    private final TouParsedData parsedData;
    private final boolean showInternationalTransactionMessage;
    private final StringProvider stringProvider;
    private final int touStringRes;

    public final boolean getShowInternationalTransactionMessage() {
        return this.showInternationalTransactionMessage;
    }

    @Override // com.netflix.mediaclient.acquisition.components.tou.TouViewModel
    public int getTouStringRes() {
        return this.touStringRes;
    }

    public /* synthetic */ TouPaymentViewModel(StringProvider stringProvider, TouParsedData touParsedData, TouSettingsFactory touSettingsFactory, StartMembershipButtonViewModel startMembershipButtonViewModel, String str, int i, C8627dsp c8627dsp) {
        this(stringProvider, touParsedData, touSettingsFactory, startMembershipButtonViewModel, (i & 16) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouPaymentViewModel(StringProvider stringProvider, TouParsedData touParsedData, TouSettingsFactory touSettingsFactory, StartMembershipButtonViewModel startMembershipButtonViewModel, String str) {
        super(stringProvider, touParsedData, touSettingsFactory, startMembershipButtonViewModel, str);
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) touParsedData, "");
        C8632dsu.c((Object) touSettingsFactory, "");
        C8632dsu.c((Object) startMembershipButtonViewModel, "");
        this.stringProvider = stringProvider;
        this.parsedData = touParsedData;
        this.showInternationalTransactionMessage = touParsedData.getShowInternationalTransactionMessage();
        this.touStringRes = getTouSettings().getDefaultMessageRes();
    }

    @Override // com.netflix.mediaclient.acquisition.components.tou.TouViewModel
    public String getRightOfWithdrawalText() {
        if (this.parsedData.getRightOfWithdrawal() != null) {
            return this.stringProvider.getString(R.string.right_of_withdrawal_nft);
        }
        return null;
    }
}
