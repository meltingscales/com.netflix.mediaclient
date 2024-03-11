package com.netflix.mediaclient.service.player.bladerunnerclient;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import o.AbstractC4561bgo;
import o.C1044Mm;
import o.C8427dle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class OfflineLicenseResponse {
    public static String a = "refresh";
    private static String p = "activate";
    private static String u = "bladerunnerOfflineLicenseResponse";
    private static String v = "activateAndRefresh";
    private static String x = "deactivate";
    private static String y = "convertLicense";
    private boolean B;
    private String C;
    public long b;
    public int c;
    public byte[] d;
    public LimitationType e;
    public AbstractC4561bgo f;
    public AbstractC4561bgo g;
    public AbstractC4561bgo h;
    public AbstractC4561bgo i;
    public long j;
    public boolean k;
    public long l;
    public long m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public long f13210o;
    public boolean q;
    public long r;
    public boolean s;
    public long t;
    private byte[] w;

    public void c(byte[] bArr) {
        this.d = bArr;
    }

    public byte[] c() {
        return this.w;
    }

    public String toString() {
        return "OfflineLicenseResponse{mExpirationTimeInMs=" + this.b + ", mPlayableWindowInHour=" + this.l + ", mPlayableWindowInMs=" + this.m + ", mPlayWindowResetLimit=" + this.j + ", mRefreshLicenseTimeStamp=" + this.f13210o + ", mLimitationType=" + this.e + ", mAllocationsRemaining=" + this.c + ", mYearlyLimitExpiryDateMillis=" + this.r + ", mShouldUsePlayWindowLimits=" + this.s + ", mPwResettable=" + this.n + ", mShouldRefresh=" + this.k + ", mShouldRefreshByTimestamp=" + this.q + ", mViewingWindow=" + this.t + ", mKeySetId=" + Arrays.toString(this.d) + ", mLinkActivate='" + this.f + "', mLinkDeactivate='" + this.g + "', mLinkRefresh='" + this.i + "', mLinkConvertLicense='" + this.h + "', providerSessionToken='" + this.C + "'}";
    }

    public OfflineLicenseResponse(JSONObject jSONObject, boolean z) {
        this.B = z;
        a(jSONObject);
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.C = jSONObject.optString("providerSessionToken");
        this.w = C8427dle.e(jSONObject.optString("licenseResponseBase64"));
        C1044Mm.e(u, "parsing license response end.");
        if (this.B) {
            this.b = jSONObject.optLong("expiration");
        } else {
            this.b = jSONObject.optLong("absoluteExpirationTimeMillis");
        }
        long optLong = jSONObject.optLong("viewingWindowExpiration");
        this.t = optLong;
        if (optLong <= 0) {
            this.t = Long.MAX_VALUE;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("playbackLimitations");
        if (optJSONObject != null) {
            this.s = optJSONObject.optBoolean("APPLYPLAYWINDOW");
            this.l = optJSONObject.optLong("PLAYWINDOWHOURS");
            this.m = optJSONObject.optLong("PLAYWINDOWMILLIS");
            this.n = optJSONObject.optBoolean("ALLOWPLAYWINDOWRESET");
            this.j = optJSONObject.optLong("PLAYWINDOWRESETLIMIT");
            this.k = optJSONObject.optBoolean("ALLOWAUTOLICENSEREFRESH");
            this.q = optJSONObject.optBoolean("APPLYLICENSEREFRESHLIMIT");
            this.f13210o = optJSONObject.optLong("REFRESHLICENSETIMESTAMP");
            this.e = LimitationType.c(optJSONObject.optString("YEARLYLIMITATIONTYPE"));
            this.r = optJSONObject.optLong("YEARLYLIMITEXPIRYDATEMILLIS");
            this.c = optJSONObject.optInt("ALLOCATIONSREMAINING");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("links");
        if (optJSONObject2 != null) {
            this.f = d(optJSONObject2, p);
            this.g = d(optJSONObject2, x);
            if (this.B) {
                this.i = d(optJSONObject2, a);
            } else {
                this.i = d(optJSONObject2, v);
            }
            this.h = d(optJSONObject2, y);
        }
    }

    public static AbstractC4561bgo d(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        return AbstractC4561bgo.d(jSONObject.optJSONObject(str));
    }

    public long d() {
        long j = this.m;
        if (j >= 0) {
            return j;
        }
        long j2 = this.l;
        if (j2 >= 0) {
            return TimeUnit.HOURS.toMillis(j2);
        }
        return -1L;
    }

    public boolean b() {
        LimitationType limitationType = LimitationType.License;
        LimitationType limitationType2 = this.e;
        return (limitationType == limitationType2 || LimitationType.Download == limitationType2) && this.c == 1 && this.r != -1;
    }

    /* loaded from: classes3.dex */
    public enum LimitationType {
        License("license"),
        Download("download"),
        Unlimited("unlimited"),
        UNKNOWN("");
        
        private String i;

        LimitationType(String str) {
            this.i = str;
        }

        public static LimitationType c(String str) {
            LimitationType[] values;
            for (LimitationType limitationType : values()) {
                if (limitationType.i.equalsIgnoreCase(str)) {
                    return limitationType;
                }
            }
            return UNKNOWN;
        }
    }
}
