package com.netflix.mediaclient.acquisition.screens.welcomefuji;

import com.netflix.android.moneyball.fields.ActionField;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class WelcomeFujiParsedData {
    public static final int $stable = 8;
    private final String defaultCtaStringKey;
    private final String formerMemberCtaStringKey;
    private final boolean hasEligibleOffer;
    private final boolean isRecognizedFormerMember;
    private final boolean isRecognizedNeverMember;
    private final String neverMemberCtaStringKey;
    private final ActionField nextAction;
    private final boolean nextActionGoesToWebView;
    private final String offerPrice;
    private final String offerType;
    private final List<FujiCardParsedData> reggieCards;
    private final ActionField resumeMembershipAction;
    private final ActionField saveEmailAction;
    private final boolean showPlanFallback;
    private final boolean showPlanUnavailableDialog;
    private final boolean showSignOut;

    public final boolean component1() {
        return this.isRecognizedFormerMember;
    }

    public final ActionField component10() {
        return this.nextAction;
    }

    public final ActionField component11() {
        return this.resumeMembershipAction;
    }

    public final ActionField component12() {
        return this.saveEmailAction;
    }

    public final boolean component13() {
        return this.nextActionGoesToWebView;
    }

    public final List<FujiCardParsedData> component14() {
        return this.reggieCards;
    }

    public final boolean component15() {
        return this.showPlanUnavailableDialog;
    }

    public final boolean component16() {
        return this.showPlanFallback;
    }

    public final boolean component2() {
        return this.isRecognizedNeverMember;
    }

    public final boolean component3() {
        return this.showSignOut;
    }

    public final boolean component4() {
        return this.hasEligibleOffer;
    }

    public final String component5() {
        return this.offerType;
    }

    public final String component6() {
        return this.offerPrice;
    }

    public final String component7() {
        return this.defaultCtaStringKey;
    }

    public final String component8() {
        return this.formerMemberCtaStringKey;
    }

    public final String component9() {
        return this.neverMemberCtaStringKey;
    }

    public final WelcomeFujiParsedData copy(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, ActionField actionField, ActionField actionField2, ActionField actionField3, boolean z5, List<FujiCardParsedData> list, boolean z6, boolean z7) {
        C8632dsu.c((Object) list, "");
        return new WelcomeFujiParsedData(z, z2, z3, z4, str, str2, str3, str4, str5, actionField, actionField2, actionField3, z5, list, z6, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WelcomeFujiParsedData) {
            WelcomeFujiParsedData welcomeFujiParsedData = (WelcomeFujiParsedData) obj;
            return this.isRecognizedFormerMember == welcomeFujiParsedData.isRecognizedFormerMember && this.isRecognizedNeverMember == welcomeFujiParsedData.isRecognizedNeverMember && this.showSignOut == welcomeFujiParsedData.showSignOut && this.hasEligibleOffer == welcomeFujiParsedData.hasEligibleOffer && C8632dsu.c((Object) this.offerType, (Object) welcomeFujiParsedData.offerType) && C8632dsu.c((Object) this.offerPrice, (Object) welcomeFujiParsedData.offerPrice) && C8632dsu.c((Object) this.defaultCtaStringKey, (Object) welcomeFujiParsedData.defaultCtaStringKey) && C8632dsu.c((Object) this.formerMemberCtaStringKey, (Object) welcomeFujiParsedData.formerMemberCtaStringKey) && C8632dsu.c((Object) this.neverMemberCtaStringKey, (Object) welcomeFujiParsedData.neverMemberCtaStringKey) && C8632dsu.c(this.nextAction, welcomeFujiParsedData.nextAction) && C8632dsu.c(this.resumeMembershipAction, welcomeFujiParsedData.resumeMembershipAction) && C8632dsu.c(this.saveEmailAction, welcomeFujiParsedData.saveEmailAction) && this.nextActionGoesToWebView == welcomeFujiParsedData.nextActionGoesToWebView && C8632dsu.c(this.reggieCards, welcomeFujiParsedData.reggieCards) && this.showPlanUnavailableDialog == welcomeFujiParsedData.showPlanUnavailableDialog && this.showPlanFallback == welcomeFujiParsedData.showPlanFallback;
        }
        return false;
    }

    public final String getDefaultCtaStringKey() {
        return this.defaultCtaStringKey;
    }

    public final String getFormerMemberCtaStringKey() {
        return this.formerMemberCtaStringKey;
    }

    public final boolean getHasEligibleOffer() {
        return this.hasEligibleOffer;
    }

    public final String getNeverMemberCtaStringKey() {
        return this.neverMemberCtaStringKey;
    }

    public final ActionField getNextAction() {
        return this.nextAction;
    }

    public final boolean getNextActionGoesToWebView() {
        return this.nextActionGoesToWebView;
    }

    public final String getOfferPrice() {
        return this.offerPrice;
    }

    public final String getOfferType() {
        return this.offerType;
    }

    public final List<FujiCardParsedData> getReggieCards() {
        return this.reggieCards;
    }

    public final ActionField getResumeMembershipAction() {
        return this.resumeMembershipAction;
    }

    public final ActionField getSaveEmailAction() {
        return this.saveEmailAction;
    }

    public final boolean getShowPlanFallback() {
        return this.showPlanFallback;
    }

    public final boolean getShowPlanUnavailableDialog() {
        return this.showPlanUnavailableDialog;
    }

    public final boolean getShowSignOut() {
        return this.showSignOut;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isRecognizedFormerMember);
        int hashCode2 = Boolean.hashCode(this.isRecognizedNeverMember);
        int hashCode3 = Boolean.hashCode(this.showSignOut);
        int hashCode4 = Boolean.hashCode(this.hasEligibleOffer);
        String str = this.offerType;
        int hashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.offerPrice;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.defaultCtaStringKey;
        int hashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.formerMemberCtaStringKey;
        int hashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.neverMemberCtaStringKey;
        int hashCode9 = str5 == null ? 0 : str5.hashCode();
        ActionField actionField = this.nextAction;
        int hashCode10 = actionField == null ? 0 : actionField.hashCode();
        ActionField actionField2 = this.resumeMembershipAction;
        int hashCode11 = actionField2 == null ? 0 : actionField2.hashCode();
        ActionField actionField3 = this.saveEmailAction;
        return (((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (actionField3 != null ? actionField3.hashCode() : 0)) * 31) + Boolean.hashCode(this.nextActionGoesToWebView)) * 31) + this.reggieCards.hashCode()) * 31) + Boolean.hashCode(this.showPlanUnavailableDialog)) * 31) + Boolean.hashCode(this.showPlanFallback);
    }

    public final boolean isRecognizedFormerMember() {
        return this.isRecognizedFormerMember;
    }

    public final boolean isRecognizedNeverMember() {
        return this.isRecognizedNeverMember;
    }

    public String toString() {
        boolean z = this.isRecognizedFormerMember;
        boolean z2 = this.isRecognizedNeverMember;
        boolean z3 = this.showSignOut;
        boolean z4 = this.hasEligibleOffer;
        String str = this.offerType;
        String str2 = this.offerPrice;
        String str3 = this.defaultCtaStringKey;
        String str4 = this.formerMemberCtaStringKey;
        String str5 = this.neverMemberCtaStringKey;
        ActionField actionField = this.nextAction;
        ActionField actionField2 = this.resumeMembershipAction;
        ActionField actionField3 = this.saveEmailAction;
        boolean z5 = this.nextActionGoesToWebView;
        List<FujiCardParsedData> list = this.reggieCards;
        boolean z6 = this.showPlanUnavailableDialog;
        boolean z7 = this.showPlanFallback;
        return "WelcomeFujiParsedData(isRecognizedFormerMember=" + z + ", isRecognizedNeverMember=" + z2 + ", showSignOut=" + z3 + ", hasEligibleOffer=" + z4 + ", offerType=" + str + ", offerPrice=" + str2 + ", defaultCtaStringKey=" + str3 + ", formerMemberCtaStringKey=" + str4 + ", neverMemberCtaStringKey=" + str5 + ", nextAction=" + actionField + ", resumeMembershipAction=" + actionField2 + ", saveEmailAction=" + actionField3 + ", nextActionGoesToWebView=" + z5 + ", reggieCards=" + list + ", showPlanUnavailableDialog=" + z6 + ", showPlanFallback=" + z7 + ")";
    }

    public WelcomeFujiParsedData(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, ActionField actionField, ActionField actionField2, ActionField actionField3, boolean z5, List<FujiCardParsedData> list, boolean z6, boolean z7) {
        C8632dsu.c((Object) list, "");
        this.isRecognizedFormerMember = z;
        this.isRecognizedNeverMember = z2;
        this.showSignOut = z3;
        this.hasEligibleOffer = z4;
        this.offerType = str;
        this.offerPrice = str2;
        this.defaultCtaStringKey = str3;
        this.formerMemberCtaStringKey = str4;
        this.neverMemberCtaStringKey = str5;
        this.nextAction = actionField;
        this.resumeMembershipAction = actionField2;
        this.saveEmailAction = actionField3;
        this.nextActionGoesToWebView = z5;
        this.reggieCards = list;
        this.showPlanUnavailableDialog = z6;
        this.showPlanFallback = z7;
    }
}
