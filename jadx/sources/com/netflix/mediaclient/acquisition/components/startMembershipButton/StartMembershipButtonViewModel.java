package com.netflix.mediaclient.acquisition.components.startMembershipButton;

import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class StartMembershipButtonViewModel {
    public static final int $stable = 8;
    private final String primaryLabel;
    private final String secondaryLabel;
    private final StringProvider stringProvider;
    private final String text;

    public final String getPrimaryLabel() {
        return this.primaryLabel;
    }

    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }

    public final String getText() {
        return this.text;
    }

    public StartMembershipButtonViewModel(StringProvider stringProvider, StartMembershipButtonParsedData startMembershipButtonParsedData) {
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) startMembershipButtonParsedData, "");
        this.stringProvider = stringProvider;
        String primaryLabelKey = startMembershipButtonParsedData.getPrimaryLabelKey();
        String string = primaryLabelKey != null ? stringProvider.getString(primaryLabelKey) : null;
        this.primaryLabel = string;
        String secondaryLabelKey = startMembershipButtonParsedData.getSecondaryLabelKey();
        this.secondaryLabel = secondaryLabelKey != null ? stringProvider.getString(secondaryLabelKey) : null;
        if (!startMembershipButtonParsedData.getWillStartMembership()) {
            string = stringProvider.getString(R.string.label_continue);
        } else if (startMembershipButtonParsedData.isPaused()) {
            string = stringProvider.getString(R.string.button_resume_membership);
        } else if (string == null) {
            string = stringProvider.getString(R.string.order_confirm_button_start_cap);
        }
        this.text = string;
    }
}
