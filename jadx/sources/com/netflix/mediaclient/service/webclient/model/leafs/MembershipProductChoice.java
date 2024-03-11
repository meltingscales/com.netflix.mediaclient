package com.netflix.mediaclient.service.webclient.model.leafs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import org.linphone.core.Privacy;

/* loaded from: classes4.dex */
public final class MembershipProductChoice implements Parcelable {
    public static final Parcelable.Creator<MembershipProductChoice> CREATOR = new Creator();
    @SerializedName("additionalAmountOverCurrent")
    private final Float additionalAmountOverCurrent;
    @SerializedName("additionalAmountOverCurrentFormatted")
    private final String additionalAmountOverCurrentFormatted;
    @SerializedName("country")
    private final String country;
    @SerializedName("currency")
    private final String currency;
    @SerializedName("gfState")
    private final MembershipGrandfatheredState grandfatheredState;
    @SerializedName("isNewBillingDateApproximate")
    private final Boolean isNewBillingDateApproximate;
    @SerializedName("maxStreams")
    private final int maxStreams;
    @SerializedName("newBillingDate")
    private final Long newBillingDate;
    @SerializedName("planChangeEffectiveDate")
    private final Long planChangeEffectiveDate;
    @SerializedName("planChangeType")
    private final MembershipPlanChangeType planChangeType;
    @SerializedName("planDescShort")
    private final String planDescShort;
    @SerializedName(SignupConstants.Field.PLAN_ID)
    private final int planId;
    @SerializedName("planName")
    private final String planName;
    @SerializedName("planStatus")
    private final MembershipPlanStatus planStatus;
    @SerializedName("price")
    private final float price;
    @SerializedName("priceConsent")
    private final MembershipPriceConsentInfo priceConsent;
    @SerializedName("priceDuration")
    private final MembershipDuration priceDuration;
    @SerializedName("priceFormatted")
    private final String priceFormatted;
    @SerializedName("priceTier")
    private final String priceTier;
    @SerializedName("quality")
    private final MembershipStreamQuality quality;
    @SerializedName("revokeUouOffer")
    private final Boolean revokesUouOffer;
    @SerializedName("showPreTaxInPrice")
    private final Boolean shouldShowPreTaxInPrice;

    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<MembershipProductChoice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MembershipProductChoice createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            C8632dsu.c((Object) parcel, "");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            float readFloat = parcel.readFloat();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            MembershipStreamQuality valueOf4 = parcel.readInt() == 0 ? null : MembershipStreamQuality.valueOf(parcel.readString());
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            MembershipGrandfatheredState valueOf5 = parcel.readInt() == 0 ? null : MembershipGrandfatheredState.valueOf(parcel.readString());
            Long valueOf6 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            MembershipPlanStatus valueOf7 = parcel.readInt() == 0 ? null : MembershipPlanStatus.valueOf(parcel.readString());
            MembershipPlanChangeType valueOf8 = parcel.readInt() == 0 ? null : MembershipPlanChangeType.valueOf(parcel.readString());
            Float valueOf9 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString7 = parcel.readString();
            MembershipDuration valueOf10 = parcel.readInt() == 0 ? null : MembershipDuration.valueOf(parcel.readString());
            MembershipPriceConsentInfo createFromParcel = parcel.readInt() == 0 ? null : MembershipPriceConsentInfo.CREATOR.createFromParcel(parcel);
            Long valueOf11 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MembershipProductChoice(readInt, readInt2, readString, readString2, readFloat, readString3, readString4, valueOf4, readString5, readString6, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, readString7, valueOf10, createFromParcel, valueOf11, valueOf, valueOf2, valueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MembershipProductChoice[] newArray(int i) {
            return new MembershipProductChoice[i];
        }
    }

    public MembershipProductChoice() {
        this(0, 0, null, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public final int component1() {
        return this.planId;
    }

    public final String component10() {
        return this.planDescShort;
    }

    public final MembershipGrandfatheredState component11() {
        return this.grandfatheredState;
    }

    public final Long component12() {
        return this.planChangeEffectiveDate;
    }

    public final MembershipPlanStatus component13() {
        return this.planStatus;
    }

    public final MembershipPlanChangeType component14() {
        return this.planChangeType;
    }

    public final Float component15() {
        return this.additionalAmountOverCurrent;
    }

    public final String component16() {
        return this.additionalAmountOverCurrentFormatted;
    }

    public final MembershipDuration component17() {
        return this.priceDuration;
    }

    public final MembershipPriceConsentInfo component18() {
        return this.priceConsent;
    }

    public final Long component19() {
        return this.newBillingDate;
    }

    public final int component2() {
        return this.maxStreams;
    }

    public final Boolean component20() {
        return this.isNewBillingDateApproximate;
    }

    public final Boolean component21() {
        return this.revokesUouOffer;
    }

    public final Boolean component22() {
        return this.shouldShowPreTaxInPrice;
    }

    public final String component3() {
        return this.country;
    }

    public final String component4() {
        return this.currency;
    }

    public final float component5() {
        return this.price;
    }

    public final String component6() {
        return this.priceFormatted;
    }

    public final String component7() {
        return this.priceTier;
    }

    public final MembershipStreamQuality component8() {
        return this.quality;
    }

    public final String component9() {
        return this.planName;
    }

    public final MembershipProductChoice copy(int i, int i2, String str, String str2, float f, String str3, String str4, MembershipStreamQuality membershipStreamQuality, String str5, String str6, MembershipGrandfatheredState membershipGrandfatheredState, Long l, MembershipPlanStatus membershipPlanStatus, MembershipPlanChangeType membershipPlanChangeType, Float f2, String str7, MembershipDuration membershipDuration, MembershipPriceConsentInfo membershipPriceConsentInfo, Long l2, Boolean bool, Boolean bool2, Boolean bool3) {
        return new MembershipProductChoice(i, i2, str, str2, f, str3, str4, membershipStreamQuality, str5, str6, membershipGrandfatheredState, l, membershipPlanStatus, membershipPlanChangeType, f2, str7, membershipDuration, membershipPriceConsentInfo, l2, bool, bool2, bool3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MembershipProductChoice) {
            MembershipProductChoice membershipProductChoice = (MembershipProductChoice) obj;
            return this.planId == membershipProductChoice.planId && this.maxStreams == membershipProductChoice.maxStreams && C8632dsu.c((Object) this.country, (Object) membershipProductChoice.country) && C8632dsu.c((Object) this.currency, (Object) membershipProductChoice.currency) && Float.compare(this.price, membershipProductChoice.price) == 0 && C8632dsu.c((Object) this.priceFormatted, (Object) membershipProductChoice.priceFormatted) && C8632dsu.c((Object) this.priceTier, (Object) membershipProductChoice.priceTier) && this.quality == membershipProductChoice.quality && C8632dsu.c((Object) this.planName, (Object) membershipProductChoice.planName) && C8632dsu.c((Object) this.planDescShort, (Object) membershipProductChoice.planDescShort) && this.grandfatheredState == membershipProductChoice.grandfatheredState && C8632dsu.c(this.planChangeEffectiveDate, membershipProductChoice.planChangeEffectiveDate) && this.planStatus == membershipProductChoice.planStatus && this.planChangeType == membershipProductChoice.planChangeType && C8632dsu.c((Object) this.additionalAmountOverCurrent, (Object) membershipProductChoice.additionalAmountOverCurrent) && C8632dsu.c((Object) this.additionalAmountOverCurrentFormatted, (Object) membershipProductChoice.additionalAmountOverCurrentFormatted) && this.priceDuration == membershipProductChoice.priceDuration && C8632dsu.c(this.priceConsent, membershipProductChoice.priceConsent) && C8632dsu.c(this.newBillingDate, membershipProductChoice.newBillingDate) && C8632dsu.c(this.isNewBillingDateApproximate, membershipProductChoice.isNewBillingDateApproximate) && C8632dsu.c(this.revokesUouOffer, membershipProductChoice.revokesUouOffer) && C8632dsu.c(this.shouldShowPreTaxInPrice, membershipProductChoice.shouldShowPreTaxInPrice);
        }
        return false;
    }

    public final Float getAdditionalAmountOverCurrent() {
        return this.additionalAmountOverCurrent;
    }

    public final String getAdditionalAmountOverCurrentFormatted() {
        return this.additionalAmountOverCurrentFormatted;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final MembershipGrandfatheredState getGrandfatheredState() {
        return this.grandfatheredState;
    }

    public final int getMaxStreams() {
        return this.maxStreams;
    }

    public final Long getNewBillingDate() {
        return this.newBillingDate;
    }

    public final Long getPlanChangeEffectiveDate() {
        return this.planChangeEffectiveDate;
    }

    public final MembershipPlanChangeType getPlanChangeType() {
        return this.planChangeType;
    }

    public final String getPlanDescShort() {
        return this.planDescShort;
    }

    public final int getPlanId() {
        return this.planId;
    }

    public final String getPlanName() {
        return this.planName;
    }

    public final MembershipPlanStatus getPlanStatus() {
        return this.planStatus;
    }

    public final float getPrice() {
        return this.price;
    }

    public final MembershipPriceConsentInfo getPriceConsent() {
        return this.priceConsent;
    }

    public final MembershipDuration getPriceDuration() {
        return this.priceDuration;
    }

    public final String getPriceFormatted() {
        return this.priceFormatted;
    }

    public final String getPriceTier() {
        return this.priceTier;
    }

    public final MembershipStreamQuality getQuality() {
        return this.quality;
    }

    public final Boolean getRevokesUouOffer() {
        return this.revokesUouOffer;
    }

    public final Boolean getShouldShowPreTaxInPrice() {
        return this.shouldShowPreTaxInPrice;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.planId);
        int hashCode2 = Integer.hashCode(this.maxStreams);
        String str = this.country;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.currency;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        int hashCode5 = Float.hashCode(this.price);
        String str3 = this.priceFormatted;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.priceTier;
        int hashCode7 = str4 == null ? 0 : str4.hashCode();
        MembershipStreamQuality membershipStreamQuality = this.quality;
        int hashCode8 = membershipStreamQuality == null ? 0 : membershipStreamQuality.hashCode();
        String str5 = this.planName;
        int hashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.planDescShort;
        int hashCode10 = str6 == null ? 0 : str6.hashCode();
        MembershipGrandfatheredState membershipGrandfatheredState = this.grandfatheredState;
        int hashCode11 = membershipGrandfatheredState == null ? 0 : membershipGrandfatheredState.hashCode();
        Long l = this.planChangeEffectiveDate;
        int hashCode12 = l == null ? 0 : l.hashCode();
        MembershipPlanStatus membershipPlanStatus = this.planStatus;
        int hashCode13 = membershipPlanStatus == null ? 0 : membershipPlanStatus.hashCode();
        MembershipPlanChangeType membershipPlanChangeType = this.planChangeType;
        int hashCode14 = membershipPlanChangeType == null ? 0 : membershipPlanChangeType.hashCode();
        Float f = this.additionalAmountOverCurrent;
        int hashCode15 = f == null ? 0 : f.hashCode();
        String str7 = this.additionalAmountOverCurrentFormatted;
        int hashCode16 = str7 == null ? 0 : str7.hashCode();
        MembershipDuration membershipDuration = this.priceDuration;
        int hashCode17 = membershipDuration == null ? 0 : membershipDuration.hashCode();
        MembershipPriceConsentInfo membershipPriceConsentInfo = this.priceConsent;
        int hashCode18 = membershipPriceConsentInfo == null ? 0 : membershipPriceConsentInfo.hashCode();
        Long l2 = this.newBillingDate;
        int hashCode19 = l2 == null ? 0 : l2.hashCode();
        Boolean bool = this.isNewBillingDateApproximate;
        int hashCode20 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.revokesUouOffer;
        int hashCode21 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.shouldShowPreTaxInPrice;
        return (((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + (bool3 == null ? 0 : bool3.hashCode());
    }

    public final Boolean isNewBillingDateApproximate() {
        return this.isNewBillingDateApproximate;
    }

    public String toString() {
        int i = this.planId;
        int i2 = this.maxStreams;
        String str = this.country;
        String str2 = this.currency;
        float f = this.price;
        String str3 = this.priceFormatted;
        String str4 = this.priceTier;
        MembershipStreamQuality membershipStreamQuality = this.quality;
        String str5 = this.planName;
        String str6 = this.planDescShort;
        MembershipGrandfatheredState membershipGrandfatheredState = this.grandfatheredState;
        Long l = this.planChangeEffectiveDate;
        MembershipPlanStatus membershipPlanStatus = this.planStatus;
        MembershipPlanChangeType membershipPlanChangeType = this.planChangeType;
        Float f2 = this.additionalAmountOverCurrent;
        String str7 = this.additionalAmountOverCurrentFormatted;
        MembershipDuration membershipDuration = this.priceDuration;
        MembershipPriceConsentInfo membershipPriceConsentInfo = this.priceConsent;
        Long l2 = this.newBillingDate;
        Boolean bool = this.isNewBillingDateApproximate;
        Boolean bool2 = this.revokesUouOffer;
        Boolean bool3 = this.shouldShowPreTaxInPrice;
        return "MembershipProductChoice(planId=" + i + ", maxStreams=" + i2 + ", country=" + str + ", currency=" + str2 + ", price=" + f + ", priceFormatted=" + str3 + ", priceTier=" + str4 + ", quality=" + membershipStreamQuality + ", planName=" + str5 + ", planDescShort=" + str6 + ", grandfatheredState=" + membershipGrandfatheredState + ", planChangeEffectiveDate=" + l + ", planStatus=" + membershipPlanStatus + ", planChangeType=" + membershipPlanChangeType + ", additionalAmountOverCurrent=" + f2 + ", additionalAmountOverCurrentFormatted=" + str7 + ", priceDuration=" + membershipDuration + ", priceConsent=" + membershipPriceConsentInfo + ", newBillingDate=" + l2 + ", isNewBillingDateApproximate=" + bool + ", revokesUouOffer=" + bool2 + ", shouldShowPreTaxInPrice=" + bool3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeInt(this.planId);
        parcel.writeInt(this.maxStreams);
        parcel.writeString(this.country);
        parcel.writeString(this.currency);
        parcel.writeFloat(this.price);
        parcel.writeString(this.priceFormatted);
        parcel.writeString(this.priceTier);
        MembershipStreamQuality membershipStreamQuality = this.quality;
        if (membershipStreamQuality == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(membershipStreamQuality.name());
        }
        parcel.writeString(this.planName);
        parcel.writeString(this.planDescShort);
        MembershipGrandfatheredState membershipGrandfatheredState = this.grandfatheredState;
        if (membershipGrandfatheredState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(membershipGrandfatheredState.name());
        }
        Long l = this.planChangeEffectiveDate;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        MembershipPlanStatus membershipPlanStatus = this.planStatus;
        if (membershipPlanStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(membershipPlanStatus.name());
        }
        MembershipPlanChangeType membershipPlanChangeType = this.planChangeType;
        if (membershipPlanChangeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(membershipPlanChangeType.name());
        }
        Float f = this.additionalAmountOverCurrent;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.additionalAmountOverCurrentFormatted);
        MembershipDuration membershipDuration = this.priceDuration;
        if (membershipDuration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(membershipDuration.name());
        }
        MembershipPriceConsentInfo membershipPriceConsentInfo = this.priceConsent;
        if (membershipPriceConsentInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            membershipPriceConsentInfo.writeToParcel(parcel, i);
        }
        Long l2 = this.newBillingDate;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Boolean bool = this.isNewBillingDateApproximate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.revokesUouOffer;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.shouldShowPreTaxInPrice;
        if (bool3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool3.booleanValue() ? 1 : 0);
    }

    public MembershipProductChoice(int i, int i2, String str, String str2, float f, String str3, String str4, MembershipStreamQuality membershipStreamQuality, String str5, String str6, MembershipGrandfatheredState membershipGrandfatheredState, Long l, MembershipPlanStatus membershipPlanStatus, MembershipPlanChangeType membershipPlanChangeType, Float f2, String str7, MembershipDuration membershipDuration, MembershipPriceConsentInfo membershipPriceConsentInfo, Long l2, Boolean bool, Boolean bool2, Boolean bool3) {
        this.planId = i;
        this.maxStreams = i2;
        this.country = str;
        this.currency = str2;
        this.price = f;
        this.priceFormatted = str3;
        this.priceTier = str4;
        this.quality = membershipStreamQuality;
        this.planName = str5;
        this.planDescShort = str6;
        this.grandfatheredState = membershipGrandfatheredState;
        this.planChangeEffectiveDate = l;
        this.planStatus = membershipPlanStatus;
        this.planChangeType = membershipPlanChangeType;
        this.additionalAmountOverCurrent = f2;
        this.additionalAmountOverCurrentFormatted = str7;
        this.priceDuration = membershipDuration;
        this.priceConsent = membershipPriceConsentInfo;
        this.newBillingDate = l2;
        this.isNewBillingDateApproximate = bool;
        this.revokesUouOffer = bool2;
        this.shouldShowPreTaxInPrice = bool3;
    }

    public /* synthetic */ MembershipProductChoice(int i, int i2, String str, String str2, float f, String str3, String str4, MembershipStreamQuality membershipStreamQuality, String str5, String str6, MembershipGrandfatheredState membershipGrandfatheredState, Long l, MembershipPlanStatus membershipPlanStatus, MembershipPlanChangeType membershipPlanChangeType, Float f2, String str7, MembershipDuration membershipDuration, MembershipPriceConsentInfo membershipPriceConsentInfo, Long l2, Boolean bool, Boolean bool2, Boolean bool3, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? 0.0f : f, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : membershipStreamQuality, (i3 & JSONzip.end) != 0 ? null : str5, (i3 & 512) != 0 ? null : str6, (i3 & 1024) != 0 ? null : membershipGrandfatheredState, (i3 & 2048) != 0 ? null : l, (i3 & 4096) != 0 ? null : membershipPlanStatus, (i3 & 8192) != 0 ? null : membershipPlanChangeType, (i3 & 16384) != 0 ? null : f2, (i3 & Privacy.DEFAULT) != 0 ? null : str7, (i3 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? null : membershipDuration, (i3 & 131072) != 0 ? null : membershipPriceConsentInfo, (i3 & 262144) != 0 ? null : l2, (i3 & 524288) != 0 ? null : bool, (i3 & 1048576) != 0 ? null : bool2, (i3 & 2097152) != 0 ? null : bool3);
    }

    public final boolean isUpgrade() {
        return this.planChangeType == MembershipPlanChangeType.IMMEDIATE;
    }

    public final boolean isDowngrade() {
        return this.planStatus == MembershipPlanStatus.PENDING || this.planChangeType == MembershipPlanChangeType.DEFERRED;
    }

    public final boolean isCurrent() {
        return this.planStatus == MembershipPlanStatus.CURRENT;
    }

    public final int getLatestPlanId() {
        MembershipPriceConsentInfo applicablePriceConsent = getApplicablePriceConsent();
        return applicablePriceConsent != null ? applicablePriceConsent.getPlanId() : this.planId;
    }

    public final String getLatestPriceTier() {
        String priceTier;
        MembershipPriceConsentInfo applicablePriceConsent = getApplicablePriceConsent();
        return (applicablePriceConsent == null || (priceTier = applicablePriceConsent.getPriceTier()) == null) ? this.priceTier : priceTier;
    }

    public final String getLatestPriceFormatted() {
        String priceFormatted;
        MembershipPriceConsentInfo applicablePriceConsent = getApplicablePriceConsent();
        return (applicablePriceConsent == null || (priceFormatted = applicablePriceConsent.getPriceFormatted()) == null) ? this.priceFormatted : priceFormatted;
    }

    private final MembershipPriceConsentInfo getApplicablePriceConsent() {
        MembershipPriceConsentInfo membershipPriceConsentInfo = this.priceConsent;
        if ((membershipPriceConsentInfo != null ? membershipPriceConsentInfo.getStatus() : null) != MembershipPriceConsentInfo.Status.NOT_SET) {
            return this.priceConsent;
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static final class MembershipPriceConsentInfo implements Parcelable {
        public static final Parcelable.Creator<MembershipPriceConsentInfo> CREATOR = new Creator();
        private final String currency;
        private final int planId;
        private final float price;
        private final String priceFormatted;
        private final String priceTier;
        private final Status status;

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<MembershipPriceConsentInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MembershipPriceConsentInfo createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                return new MembershipPriceConsentInfo(Status.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MembershipPriceConsentInfo[] newArray(int i) {
                return new MembershipPriceConsentInfo[i];
            }
        }

        public MembershipPriceConsentInfo() {
            this(null, 0, null, 0.0f, null, null, 63, null);
        }

        public static /* synthetic */ MembershipPriceConsentInfo copy$default(MembershipPriceConsentInfo membershipPriceConsentInfo, Status status, int i, String str, float f, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                status = membershipPriceConsentInfo.status;
            }
            if ((i2 & 2) != 0) {
                i = membershipPriceConsentInfo.planId;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                str = membershipPriceConsentInfo.priceTier;
            }
            String str4 = str;
            if ((i2 & 8) != 0) {
                f = membershipPriceConsentInfo.price;
            }
            float f2 = f;
            if ((i2 & 16) != 0) {
                str2 = membershipPriceConsentInfo.currency;
            }
            String str5 = str2;
            if ((i2 & 32) != 0) {
                str3 = membershipPriceConsentInfo.priceFormatted;
            }
            return membershipPriceConsentInfo.copy(status, i3, str4, f2, str5, str3);
        }

        public final Status component1() {
            return this.status;
        }

        public final int component2() {
            return this.planId;
        }

        public final String component3() {
            return this.priceTier;
        }

        public final float component4() {
            return this.price;
        }

        public final String component5() {
            return this.currency;
        }

        public final String component6() {
            return this.priceFormatted;
        }

        public final MembershipPriceConsentInfo copy(Status status, int i, String str, float f, String str2, String str3) {
            C8632dsu.c((Object) status, "");
            C8632dsu.c((Object) str2, "");
            return new MembershipPriceConsentInfo(status, i, str, f, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MembershipPriceConsentInfo) {
                MembershipPriceConsentInfo membershipPriceConsentInfo = (MembershipPriceConsentInfo) obj;
                return this.status == membershipPriceConsentInfo.status && this.planId == membershipPriceConsentInfo.planId && C8632dsu.c((Object) this.priceTier, (Object) membershipPriceConsentInfo.priceTier) && Float.compare(this.price, membershipPriceConsentInfo.price) == 0 && C8632dsu.c((Object) this.currency, (Object) membershipPriceConsentInfo.currency) && C8632dsu.c((Object) this.priceFormatted, (Object) membershipPriceConsentInfo.priceFormatted);
            }
            return false;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final int getPlanId() {
            return this.planId;
        }

        public final float getPrice() {
            return this.price;
        }

        public final String getPriceFormatted() {
            return this.priceFormatted;
        }

        public final String getPriceTier() {
            return this.priceTier;
        }

        public final Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode = this.status.hashCode();
            int hashCode2 = Integer.hashCode(this.planId);
            String str = this.priceTier;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = Float.hashCode(this.price);
            int hashCode5 = this.currency.hashCode();
            String str2 = this.priceFormatted;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            Status status = this.status;
            int i = this.planId;
            String str = this.priceTier;
            float f = this.price;
            String str2 = this.currency;
            String str3 = this.priceFormatted;
            return "MembershipPriceConsentInfo(status=" + status + ", planId=" + i + ", priceTier=" + str + ", price=" + f + ", currency=" + str2 + ", priceFormatted=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeString(this.status.name());
            parcel.writeInt(this.planId);
            parcel.writeString(this.priceTier);
            parcel.writeFloat(this.price);
            parcel.writeString(this.currency);
            parcel.writeString(this.priceFormatted);
        }

        public MembershipPriceConsentInfo(Status status, int i, String str, float f, String str2, String str3) {
            C8632dsu.c((Object) status, "");
            C8632dsu.c((Object) str2, "");
            this.status = status;
            this.planId = i;
            this.priceTier = str;
            this.price = f;
            this.currency = str2;
            this.priceFormatted = str3;
        }

        public /* synthetic */ MembershipPriceConsentInfo(Status status, int i, String str, float f, String str2, String str3, int i2, C8627dsp c8627dsp) {
            this((i2 & 1) != 0 ? Status.NOT_SET : status, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 0.0f : f, (i2 & 16) != 0 ? "" : str2, (i2 & 32) == 0 ? str3 : null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class Status {
            private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            @SerializedName("CONSENT_STATUS_NOT_SET")
            public static final Status NOT_SET = new Status("NOT_SET", 0);
            @SerializedName("CONSENT_STATUS_NOT_APPLICABLE")
            public static final Status NOT_APPLICABLE = new Status("NOT_APPLICABLE", 1);
            @SerializedName("CONSENT_STATUS_OPTIONAL")
            public static final Status OPTIONAL = new Status("OPTIONAL", 2);
            @SerializedName("CONSENT_STATUS_MANDATORY")
            public static final Status MANDATORY = new Status("MANDATORY", 3);
            @SerializedName("CONSENT_STATUS_PROVIDED")
            public static final Status PROVIDED = new Status("PROVIDED", 4);
            @SerializedName("CONSENT_STATUS_AUTO_CONSENTED")
            public static final Status AUTO_CONSENTED = new Status("AUTO_CONSENTED", 5);
            @SerializedName("CONSENT_STATUS_NOTIFIED")
            public static final Status NOTIFIED = new Status("NOTIFIED", 6);

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{NOT_SET, NOT_APPLICABLE, OPTIONAL, MANDATORY, PROVIDED, AUTO_CONSENTED, NOTIFIED};
            }

            public static InterfaceC8598drn<Status> getEntries() {
                return $ENTRIES;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }

            private Status(String str, int i) {
            }

            static {
                Status[] $values = $values();
                $VALUES = $values;
                $ENTRIES = C8600drp.e($values);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class MembershipStreamQuality {
        private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
        private static final /* synthetic */ MembershipStreamQuality[] $VALUES;
        @SerializedName("PRODUCT_CHOICE_STREAM_QUALITY_NOT_SET")
        public static final MembershipStreamQuality NOT_SET = new MembershipStreamQuality("NOT_SET", 0);
        @SerializedName("PRODUCT_CHOICE_STREAM_QUALITY_SD")
        public static final MembershipStreamQuality SD = new MembershipStreamQuality("SD", 1);
        @SerializedName("PRODUCT_CHOICE_STREAM_QUALITY_HD")
        public static final MembershipStreamQuality HD = new MembershipStreamQuality("HD", 2);
        @SerializedName("PRODUCT_CHOICE_STREAM_QUALITY_UHD")
        public static final MembershipStreamQuality UHD = new MembershipStreamQuality("UHD", 3);

        private static final /* synthetic */ MembershipStreamQuality[] $values() {
            return new MembershipStreamQuality[]{NOT_SET, SD, HD, UHD};
        }

        public static InterfaceC8598drn<MembershipStreamQuality> getEntries() {
            return $ENTRIES;
        }

        public static MembershipStreamQuality valueOf(String str) {
            return (MembershipStreamQuality) Enum.valueOf(MembershipStreamQuality.class, str);
        }

        public static MembershipStreamQuality[] values() {
            return (MembershipStreamQuality[]) $VALUES.clone();
        }

        private MembershipStreamQuality(String str, int i) {
        }

        static {
            MembershipStreamQuality[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C8600drp.e($values);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class MembershipGrandfatheredState {
        private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
        private static final /* synthetic */ MembershipGrandfatheredState[] $VALUES;
        @SerializedName("PRODUCT_CHOICE_GF_STATUS_NOT_SET")
        public static final MembershipGrandfatheredState NOT_SET = new MembershipGrandfatheredState("NOT_SET", 0);
        @SerializedName("PRODUCT_CHOICE_GF_STATUS_NONE")
        public static final MembershipGrandfatheredState NONE = new MembershipGrandfatheredState("NONE", 1);
        @SerializedName("PRODUCT_CHOICE_GF_STATUS_WITH_EXPIRY")
        public static final MembershipGrandfatheredState WITH_EXPIRY = new MembershipGrandfatheredState("WITH_EXPIRY", 2);
        @SerializedName("PRODUCT_CHOICE_GF_STATUS_FOREVER")
        public static final MembershipGrandfatheredState FOREVER = new MembershipGrandfatheredState("FOREVER", 3);

        private static final /* synthetic */ MembershipGrandfatheredState[] $values() {
            return new MembershipGrandfatheredState[]{NOT_SET, NONE, WITH_EXPIRY, FOREVER};
        }

        public static InterfaceC8598drn<MembershipGrandfatheredState> getEntries() {
            return $ENTRIES;
        }

        public static MembershipGrandfatheredState valueOf(String str) {
            return (MembershipGrandfatheredState) Enum.valueOf(MembershipGrandfatheredState.class, str);
        }

        public static MembershipGrandfatheredState[] values() {
            return (MembershipGrandfatheredState[]) $VALUES.clone();
        }

        private MembershipGrandfatheredState(String str, int i) {
        }

        static {
            MembershipGrandfatheredState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C8600drp.e($values);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class MembershipPlanStatus {
        private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
        private static final /* synthetic */ MembershipPlanStatus[] $VALUES;
        @SerializedName("PRODUCT_CHOICE_PLAN_STATUS_NOT_SET")
        public static final MembershipPlanStatus NOT_SET = new MembershipPlanStatus("NOT_SET", 0);
        @SerializedName("PRODUCT_CHOICE_PLAN_STATUS_CURRENT")
        public static final MembershipPlanStatus CURRENT = new MembershipPlanStatus("CURRENT", 1);
        @SerializedName("PRODUCT_CHOICE_PLAN_STATUS_PENDING")
        public static final MembershipPlanStatus PENDING = new MembershipPlanStatus("PENDING", 2);
        @SerializedName("PRODUCT_CHOICE_PLAN_STATUS_PAYING")
        public static final MembershipPlanStatus PAYING = new MembershipPlanStatus("PAYING", 3);

        private static final /* synthetic */ MembershipPlanStatus[] $values() {
            return new MembershipPlanStatus[]{NOT_SET, CURRENT, PENDING, PAYING};
        }

        public static InterfaceC8598drn<MembershipPlanStatus> getEntries() {
            return $ENTRIES;
        }

        public static MembershipPlanStatus valueOf(String str) {
            return (MembershipPlanStatus) Enum.valueOf(MembershipPlanStatus.class, str);
        }

        public static MembershipPlanStatus[] values() {
            return (MembershipPlanStatus[]) $VALUES.clone();
        }

        private MembershipPlanStatus(String str, int i) {
        }

        static {
            MembershipPlanStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C8600drp.e($values);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class MembershipPlanChangeType {
        private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
        private static final /* synthetic */ MembershipPlanChangeType[] $VALUES;
        @SerializedName("PRODUCT_CHOICE_PLAN_CHANGE_TYPE_NOT_SET")
        public static final MembershipPlanChangeType NOT_SET = new MembershipPlanChangeType("NOT_SET", 0);
        @SerializedName("PRODUCT_CHOICE_PLAN_CHANGE_TYPE_IMMEDIATE")
        public static final MembershipPlanChangeType IMMEDIATE = new MembershipPlanChangeType("IMMEDIATE", 1);
        @SerializedName("PRODUCT_CHOICE_PLAN_CHANGE_TYPE_DEFERRED")
        public static final MembershipPlanChangeType DEFERRED = new MembershipPlanChangeType("DEFERRED", 2);

        private static final /* synthetic */ MembershipPlanChangeType[] $values() {
            return new MembershipPlanChangeType[]{NOT_SET, IMMEDIATE, DEFERRED};
        }

        public static InterfaceC8598drn<MembershipPlanChangeType> getEntries() {
            return $ENTRIES;
        }

        public static MembershipPlanChangeType valueOf(String str) {
            return (MembershipPlanChangeType) Enum.valueOf(MembershipPlanChangeType.class, str);
        }

        public static MembershipPlanChangeType[] values() {
            return (MembershipPlanChangeType[]) $VALUES.clone();
        }

        private MembershipPlanChangeType(String str, int i) {
        }

        static {
            MembershipPlanChangeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C8600drp.e($values);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class MembershipDuration {
        private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
        private static final /* synthetic */ MembershipDuration[] $VALUES;
        @SerializedName("DURATION_UNSET")
        public static final MembershipDuration UNSET = new MembershipDuration("UNSET", 0);
        @SerializedName("DURATION_DAY")
        public static final MembershipDuration DAY = new MembershipDuration("DAY", 1);
        @SerializedName("DURATION_WEEK")
        public static final MembershipDuration WEEK = new MembershipDuration("WEEK", 2);
        @SerializedName("DURATION_MONTH")
        public static final MembershipDuration MONTH = new MembershipDuration("MONTH", 3);

        private static final /* synthetic */ MembershipDuration[] $values() {
            return new MembershipDuration[]{UNSET, DAY, WEEK, MONTH};
        }

        public static InterfaceC8598drn<MembershipDuration> getEntries() {
            return $ENTRIES;
        }

        public static MembershipDuration valueOf(String str) {
            return (MembershipDuration) Enum.valueOf(MembershipDuration.class, str);
        }

        public static MembershipDuration[] values() {
            return (MembershipDuration[]) $VALUES.clone();
        }

        private MembershipDuration(String str, int i) {
        }

        static {
            MembershipDuration[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C8600drp.e($values);
        }
    }
}
