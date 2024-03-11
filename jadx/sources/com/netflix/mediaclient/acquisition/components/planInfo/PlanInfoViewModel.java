package com.netflix.mediaclient.acquisition.components.planInfo;

import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import o.C1333Xq;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class PlanInfoViewModel {
    public static final int $stable = 8;
    private final PlanInfoParsedData parsedData;
    private final StringProvider stringProvider;

    public final PlanInfoParsedData getParsedData() {
        return this.parsedData;
    }

    public final StringProvider getStringProvider() {
        return this.stringProvider;
    }

    public PlanInfoViewModel(StringProvider stringProvider, PlanInfoParsedData planInfoParsedData) {
        C8632dsu.c((Object) stringProvider, "");
        C8632dsu.c((Object) planInfoParsedData, "");
        this.stringProvider = stringProvider;
        this.parsedData = planInfoParsedData;
    }

    public final String getPlanName() {
        return this.stringProvider.getFormatter(R.string.label_standard_plan_name).d("planName", this.parsedData.getPlanName()).c();
    }

    public final String getPlanDescription() {
        String str;
        C1333Xq formatter = this.stringProvider.getFormatter((this.parsedData.getHasEligibleOffer() && C8632dsu.c((Object) this.parsedData.getOfferType(), (Object) SignupConstants.OfferType.LOW_COST_FIRST_MONTH)) ? R.string.label_standard_plan_desc_offer : R.string.label_standard_plan_desc);
        String planBillingFrequency = this.parsedData.getPlanBillingFrequency();
        if (planBillingFrequency != null) {
            str = planBillingFrequency.toLowerCase();
            C8632dsu.a(str, "");
        } else {
            str = null;
        }
        return formatter.d("planBillingFrequency", str).d(SignupConstants.Field.PLAN_PRICE, this.parsedData.getPlanPrice()).d("hasFreeTrial", Boolean.FALSE).d(SignupConstants.Field.HAS_ELIGIBLE_OFFER, Boolean.valueOf(this.parsedData.getHasEligibleOffer())).d("planPricePreTax", Boolean.valueOf(this.parsedData.isPreTax())).c();
    }
}
