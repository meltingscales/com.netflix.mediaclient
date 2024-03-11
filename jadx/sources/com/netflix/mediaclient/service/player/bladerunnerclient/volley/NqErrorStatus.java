package com.netflix.mediaclient.service.player.bladerunnerclient.volley;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.Locale;
import o.C1044Mm;
import o.C2090aZm;
import o.C4363bdB;
import o.C8168dfL;
import o.InterfaceC2092aZo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NqErrorStatus extends BasePlayErrorStatus {

    /* renamed from: o  reason: collision with root package name */
    private static String f13214o = "nf_nq";

    @Override // o.InterfaceC4413bdz
    public String u() {
        return "NQ";
    }

    public NqErrorStatus(Context context, JSONObject jSONObject, BasePlayErrorStatus.PlayRequestType playRequestType) {
        super(context, playRequestType);
        if (!BasePlayErrorStatus.d(jSONObject)) {
            this.e = StatusCode.OK;
            return;
        }
        this.e = StatusCode.NODEQUARK_FAILURE;
        InterfaceC2092aZo b = C2090aZm.d.b(jSONObject);
        if (b == null || !b.d()) {
            j(jSONObject);
        }
    }

    private void j(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(UmaAlert.ICON_ERROR)) == null || !optJSONObject.has("code")) {
            return;
        }
        String b = b(optJSONObject);
        this.f = b;
        if (C8168dfL.h(b)) {
            StatusCode b2 = ClientActionFromLase.a(optJSONObject.optInt("clientAction", ClientActionFromLase.NO_ACTION.c())).b();
            String optString = optJSONObject.optString("detail");
            if (!b2.isError()) {
                b2 = e(this.f, optString);
            }
            this.e = b2;
        }
        this.i = optJSONObject.optString("playbackContextId");
        this.h = optJSONObject.optString("errorNccpCode", null);
        this.l = optJSONObject.optString("errorDisplayMessage");
        this.a = optJSONObject.optInt("errorActionId");
        if (optJSONObject.optJSONArray("alert") != null) {
            this.j = new C4363bdB(optJSONObject.optJSONArray("alert").optJSONObject(0)).b();
        }
        this.b = optJSONObject.optString("alertTag");
        C1044Mm.e(f13214o, "mStatusCode: %s, mUserDisplayErrorMessage:%s, actionId:%s", this.e, this.l, Integer.valueOf(this.a));
        a(optJSONObject);
    }

    private String b(JSONObject jSONObject) {
        String optString = jSONObject.optString("code");
        String optString2 = jSONObject.optString("bladeRunnerCode", null);
        return (!a(optString) || optString2 == null) ? optString : optString2;
    }

    private static StatusCode e(String str, String str2) {
        C1044Mm.c(f13214o, "mapNqErrorCodeToStatusCode nqErrorCode=%s, detail: %s", str, str2);
        return c(str) ? StatusCode.NODEQUARK_RETRY : e(str2);
    }

    private static StatusCode e(String str) {
        StatusCode statusCode = StatusCode.NODEQUARK_FAILURE;
        if (e(LaseOfflineError.TotalLicensesPerDeviceReached.c(), str)) {
            return StatusCode.DL_TOTAL_LICENSE_PER_DEVICE_LIMIT;
        }
        if (e(LaseOfflineError.StudioOfflineTitleLimitReached.c(), str)) {
            return StatusCode.DL_LIMIT_TOO_MANY_DOWNLOADED_DELETE_SOME;
        }
        if (e(LaseOfflineError.YearlyStudioDownloadLimitReached.c(), str) || e(LaseOfflineError.YearlyStudioLicenseLimitReached.c(), str)) {
            return StatusCode.DL_LIMIT_CANT_DOWNLOAD_TILL_DATE;
        }
        if (e(LaseOfflineError.OfflineDeviceLimitReached.c(), str)) {
            return StatusCode.DL_LIMIT_TOO_MANY_DEVICES_PLAN_OPTION;
        }
        if (e(LaseOfflineError.BlacklistedDevice.c(), str)) {
            return StatusCode.DL_BLACKLISTED_DEVICE;
        }
        return e(LaseOfflineError.DeviceMonthlyLimitError.c(), str) ? StatusCode.DL_MONTHLY_DOWNLOAD_LIMIT : statusCode;
    }

    private static boolean e(int i, String str) {
        if (C8168dfL.g(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return str.contains(sb.toString());
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus
    public String o() {
        return u() + this.m.d() + "." + this.f;
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus
    protected boolean v() {
        return (!C8168dfL.h(this.f) || a(this.f) || d(this.f)) ? false : true;
    }

    private boolean a(String str) {
        return C8168dfL.d(str, "FAIL") || C8168dfL.d(str, "fail");
    }

    private boolean d(String str) {
        return str.toUpperCase(Locale.ENGLISH).contains("BLACKLISTED");
    }

    public static boolean c(String str) {
        return C8168dfL.d(str, "RETRY") || C8168dfL.d(str, "retry");
    }

    protected void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.g.putOpt("errorNccpCode", this.h);
            this.g.putOpt("code", this.f);
            this.g.putOpt("errorDisplayMessage", this.l);
            this.g.putOpt("errorActionId", Integer.valueOf(this.a));
            this.g.putOpt("apkStatusCode", this.e.toString());
            String optString = jSONObject.optString("detail");
            if (C8168dfL.h(optString)) {
                this.g.putOpt("detail", optString);
            }
        } catch (JSONException unused) {
        }
    }

    @Override // o.InterfaceC4413bdz
    public boolean B() {
        return C8168dfL.d(this.f, "INCORRECT_PIN");
    }

    @Override // o.InterfaceC4413bdz
    public boolean y() {
        return C8168dfL.d(this.f, "ACCOUNT_ON_HOLD");
    }

    @Override // o.InterfaceC4413bdz
    public boolean C() {
        return C8168dfL.d(this.f, "EXTRA_MEMBER_STREAM_HOLD");
    }

    @Override // o.InterfaceC4413bdz
    public boolean w() {
        return C8168dfL.d(this.f, "ACCOUNT_NON_MEMBER") || C8168dfL.d(this.f, "FREE_PREVIEW_ENDED");
    }

    @Override // o.InterfaceC4413bdz
    public boolean D() {
        return C8168dfL.d(this.f, "STREAM_QUOTA_EXCEEDED") || C8168dfL.d(this.f, "CONCURRENT_STREAM_QUOTA_EXCEEDED_FAULT");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC4413bdz
    public boolean z() {
        char c;
        String str = this.f;
        if (str != null) {
            str.hashCode();
            switch (str.hashCode()) {
                case -1464512787:
                    if (str.equals("ACCOUNT_ON_HOLD")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -453146134:
                    if (str.equals("BLACKLISTED_IP")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -283774592:
                    if (str.equals("INSUFFICICENT_MATURITY")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 259234240:
                    if (str.equals("TITLE_OUT_OF_WINDOW")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 685570531:
                    if (str.equals("AGE_VERIFICATION_REQUIRED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 859611579:
                    if (str.equals("INCORRECT_PIN")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 867249145:
                    if (str.equals("STREAM_QUOTA_EXCEEDED")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 972735966:
                    if (str.equals("ACCOUNT_NON_MEMBER")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
            }
        }
        return false;
    }
}
