package com.netflix.mediaclient.service.webclient.model.leafs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class MembershipChoicesResponse {
    @SerializedName("bundleInfo")
    private final BundleInfo bundleInfo;
    @SerializedName("choices")
    private final List<MembershipProductChoice> choices;
    @SerializedName("currentViewings")
    private final List<CurrentViewing> currentViewings;
    @SerializedName("fallback")
    private final boolean isFallback;
    @SerializedName("lastPlanChangeDate")
    private final long lastPlanChangeDate;
    @SerializedName("nextBillingDate")
    private final long nextBillingDate;
    @SerializedName("trackingInfo")
    private final String trackingInfo;

    public MembershipChoicesResponse() {
        this(null, 0L, 0L, false, null, null, null, 127, null);
    }

    public final List<MembershipProductChoice> component1() {
        return this.choices;
    }

    public final long component2() {
        return this.nextBillingDate;
    }

    public final long component3() {
        return this.lastPlanChangeDate;
    }

    public final boolean component4() {
        return this.isFallback;
    }

    public final String component5() {
        return this.trackingInfo;
    }

    public final BundleInfo component6() {
        return this.bundleInfo;
    }

    public final List<CurrentViewing> component7() {
        return this.currentViewings;
    }

    public final MembershipChoicesResponse copy(List<MembershipProductChoice> list, long j, long j2, boolean z, String str, BundleInfo bundleInfo, List<CurrentViewing> list2) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        return new MembershipChoicesResponse(list, j, j2, z, str, bundleInfo, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MembershipChoicesResponse) {
            MembershipChoicesResponse membershipChoicesResponse = (MembershipChoicesResponse) obj;
            return C8632dsu.c(this.choices, membershipChoicesResponse.choices) && this.nextBillingDate == membershipChoicesResponse.nextBillingDate && this.lastPlanChangeDate == membershipChoicesResponse.lastPlanChangeDate && this.isFallback == membershipChoicesResponse.isFallback && C8632dsu.c((Object) this.trackingInfo, (Object) membershipChoicesResponse.trackingInfo) && C8632dsu.c(this.bundleInfo, membershipChoicesResponse.bundleInfo) && C8632dsu.c(this.currentViewings, membershipChoicesResponse.currentViewings);
        }
        return false;
    }

    public final BundleInfo getBundleInfo() {
        return this.bundleInfo;
    }

    public final List<MembershipProductChoice> getChoices() {
        return this.choices;
    }

    public final List<CurrentViewing> getCurrentViewings() {
        return this.currentViewings;
    }

    public final long getLastPlanChangeDate() {
        return this.lastPlanChangeDate;
    }

    public final long getNextBillingDate() {
        return this.nextBillingDate;
    }

    public final String getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.choices.hashCode();
        int hashCode2 = Long.hashCode(this.nextBillingDate);
        int hashCode3 = Long.hashCode(this.lastPlanChangeDate);
        int hashCode4 = Boolean.hashCode(this.isFallback);
        int hashCode5 = this.trackingInfo.hashCode();
        BundleInfo bundleInfo = this.bundleInfo;
        int hashCode6 = bundleInfo == null ? 0 : bundleInfo.hashCode();
        List<CurrentViewing> list = this.currentViewings;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean isFallback() {
        return this.isFallback;
    }

    public String toString() {
        List<MembershipProductChoice> list = this.choices;
        long j = this.nextBillingDate;
        long j2 = this.lastPlanChangeDate;
        boolean z = this.isFallback;
        String str = this.trackingInfo;
        BundleInfo bundleInfo = this.bundleInfo;
        List<CurrentViewing> list2 = this.currentViewings;
        return "MembershipChoicesResponse(choices=" + list + ", nextBillingDate=" + j + ", lastPlanChangeDate=" + j2 + ", isFallback=" + z + ", trackingInfo=" + str + ", bundleInfo=" + bundleInfo + ", currentViewings=" + list2 + ")";
    }

    public MembershipChoicesResponse(List<MembershipProductChoice> list, long j, long j2, boolean z, String str, BundleInfo bundleInfo, List<CurrentViewing> list2) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        this.choices = list;
        this.nextBillingDate = j;
        this.lastPlanChangeDate = j2;
        this.isFallback = z;
        this.trackingInfo = str;
        this.bundleInfo = bundleInfo;
        this.currentViewings = list2;
    }

    public /* synthetic */ MembershipChoicesResponse(List list, long j, long j2, boolean z, String str, BundleInfo bundleInfo, List list2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? C8569dql.i() : list, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : bundleInfo, (i & 64) == 0 ? list2 : null);
    }

    /* loaded from: classes4.dex */
    public static final class CurrentViewing {
        @SerializedName("device")
        private final String device;
        @SerializedName("video")
        private final String video;

        public CurrentViewing() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ CurrentViewing copy$default(CurrentViewing currentViewing, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = currentViewing.device;
            }
            if ((i & 2) != 0) {
                str2 = currentViewing.video;
            }
            return currentViewing.copy(str, str2);
        }

        public final String component1() {
            return this.device;
        }

        public final String component2() {
            return this.video;
        }

        public final CurrentViewing copy(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            return new CurrentViewing(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CurrentViewing) {
                CurrentViewing currentViewing = (CurrentViewing) obj;
                return C8632dsu.c((Object) this.device, (Object) currentViewing.device) && C8632dsu.c((Object) this.video, (Object) currentViewing.video);
            }
            return false;
        }

        public final String getDevice() {
            return this.device;
        }

        public final String getVideo() {
            return this.video;
        }

        public int hashCode() {
            return (this.device.hashCode() * 31) + this.video.hashCode();
        }

        public String toString() {
            String str = this.device;
            String str2 = this.video;
            return "CurrentViewing(device=" + str + ", video=" + str2 + ")";
        }

        public CurrentViewing(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.device = str;
            this.video = str2;
        }

        public /* synthetic */ CurrentViewing(String str, String str2, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class BundleInfo implements Parcelable {
        public static final Parcelable.Creator<BundleInfo> CREATOR = new Creator();
        @SerializedName("canChangePlan")
        private final boolean canChangePlan;
        @SerializedName("isOnBundle")
        private final boolean isOnBundle;
        @SerializedName(SignupConstants.Field.PARTNER_DISPLAY_NAME)
        private final String partnerDisplayName;

        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<BundleInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BundleInfo createFromParcel(Parcel parcel) {
                C8632dsu.c((Object) parcel, "");
                return new BundleInfo(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BundleInfo[] newArray(int i) {
                return new BundleInfo[i];
            }
        }

        public BundleInfo() {
            this(false, false, null, 7, null);
        }

        public static /* synthetic */ BundleInfo copy$default(BundleInfo bundleInfo, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bundleInfo.isOnBundle;
            }
            if ((i & 2) != 0) {
                z2 = bundleInfo.canChangePlan;
            }
            if ((i & 4) != 0) {
                str = bundleInfo.partnerDisplayName;
            }
            return bundleInfo.copy(z, z2, str);
        }

        public final boolean component1() {
            return this.isOnBundle;
        }

        public final boolean component2() {
            return this.canChangePlan;
        }

        public final String component3() {
            return this.partnerDisplayName;
        }

        public final BundleInfo copy(boolean z, boolean z2, String str) {
            return new BundleInfo(z, z2, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BundleInfo) {
                BundleInfo bundleInfo = (BundleInfo) obj;
                return this.isOnBundle == bundleInfo.isOnBundle && this.canChangePlan == bundleInfo.canChangePlan && C8632dsu.c((Object) this.partnerDisplayName, (Object) bundleInfo.partnerDisplayName);
            }
            return false;
        }

        public final boolean getCanChangePlan() {
            return this.canChangePlan;
        }

        public final String getPartnerDisplayName() {
            return this.partnerDisplayName;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.isOnBundle);
            int hashCode2 = Boolean.hashCode(this.canChangePlan);
            String str = this.partnerDisplayName;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean isOnBundle() {
            return this.isOnBundle;
        }

        public String toString() {
            boolean z = this.isOnBundle;
            boolean z2 = this.canChangePlan;
            String str = this.partnerDisplayName;
            return "BundleInfo(isOnBundle=" + z + ", canChangePlan=" + z2 + ", partnerDisplayName=" + str + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C8632dsu.c((Object) parcel, "");
            parcel.writeInt(this.isOnBundle ? 1 : 0);
            parcel.writeInt(this.canChangePlan ? 1 : 0);
            parcel.writeString(this.partnerDisplayName);
        }

        public BundleInfo(boolean z, boolean z2, String str) {
            this.isOnBundle = z;
            this.canChangePlan = z2;
            this.partnerDisplayName = str;
        }

        public /* synthetic */ BundleInfo(boolean z, boolean z2, String str, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str);
        }
    }
}
