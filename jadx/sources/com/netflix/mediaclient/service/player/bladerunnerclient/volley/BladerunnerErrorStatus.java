package com.netflix.mediaclient.service.player.bladerunnerclient.volley;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import o.C1044Mm;
import o.C2090aZm;
import o.C8168dfL;
import o.C8198dfp;
import o.InterfaceC2092aZo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BladerunnerErrorStatus extends BasePlayErrorStatus {
    protected String k;
    protected int n;

    @Override // o.InterfaceC4413bdz
    public boolean C() {
        return false;
    }

    @Override // o.InterfaceC4413bdz
    public String u() {
        return "BR";
    }

    @Override // o.InterfaceC4413bdz
    public boolean w() {
        return false;
    }

    @Override // o.InterfaceC4413bdz
    public boolean z() {
        return false;
    }

    public BladerunnerErrorStatus(Context context, JSONObject jSONObject, BasePlayErrorStatus.PlayRequestType playRequestType) {
        super(context, playRequestType);
        this.n = -1;
        if (!BasePlayErrorStatus.d(jSONObject)) {
            this.e = StatusCode.OK;
            return;
        }
        this.e = StatusCode.BLADERUNNER_FAILURE;
        InterfaceC2092aZo b = C2090aZm.d.b(jSONObject);
        if (b == null || !b.d()) {
            a(jSONObject);
        }
    }

    @Override // o.InterfaceC4413bdz
    public boolean B() {
        return C8168dfL.d("INCORRECT_PIN_FAULT", this.k);
    }

    @Override // o.InterfaceC4413bdz
    public boolean y() {
        return C8168dfL.d("ACCOUNT_ON_HOLD_FAULT", this.k);
    }

    @Override // o.InterfaceC4413bdz
    public boolean D() {
        return C8168dfL.d("CONCURRENT_STREAM_QUOTA_EXCEEDED_FAULT", this.k);
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus
    public String o() {
        return u() + this.m.d() + "." + this.f;
    }

    private void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(UmaAlert.ICON_ERROR)) == null || !optJSONObject.has("bladeRunnerCode")) {
            return;
        }
        this.f = optJSONObject.optString("bladeRunnerCode", null);
        this.k = optJSONObject.optString("bladeRunnerExceptionType", null);
        this.h = optJSONObject.optString("errorNccpCode", null);
        int intValue = C8198dfp.d(this.f, -1).intValue();
        this.n = intValue;
        if (intValue == -1) {
            StatusCode statusCode = StatusCode.BLADERUNNER_FAILURE;
            this.e = statusCode;
            this.n = statusCode.getValue();
        } else {
            StatusCode b = ClientActionFromLase.a(optJSONObject.optInt("clientAction", ClientActionFromLase.NO_ACTION.c())).b();
            if (!b.isError()) {
                b = d(this.n);
            }
            this.e = b;
        }
        this.l = optJSONObject.optString("errorDisplayMessage");
        this.a = optJSONObject.optInt("errorActionId");
        if (optJSONObject.optJSONObject("extraInfo") != null) {
            this.j = optJSONObject.optJSONObject("extraInfo");
        }
        if (optJSONObject.optJSONObject("extraInfo") != null) {
            this.j = optJSONObject.optJSONObject("extraInfo");
        }
        C1044Mm.e("nf_bladerunner", "mStatusCode: %s, mUserDisplayErrorMessage:%s, actionId:%d", this.e, this.l, Integer.valueOf(this.a));
        b(optJSONObject);
    }

    protected void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.g.putOpt("errorNccpCode", this.h);
            this.g.putOpt("bladeRunnerCode", this.f);
            this.g.putOpt("bladeRunnerExceptionType", this.k);
            this.g.putOpt("errorDisplayMessage", this.l);
            this.g.putOpt("errorActionId", Integer.valueOf(this.a));
            this.g.putOpt("apkStatusCode", this.e.toString());
            String optString = jSONObject.optString("bladeRunnerMessage");
            if (C8168dfL.h(optString)) {
                if (optString.length() > 200) {
                    optString = optString.substring(0, 199);
                }
                this.g.putOpt("bladeRunnerMessage", optString);
            }
        } catch (JSONException unused) {
        }
    }

    private static StatusCode d(int i) {
        C1044Mm.c("nf_bladerunner", "mapBladeRunnerErrorCodeToStatusCode bladeRunnerErrorCode=%d", Integer.valueOf(i));
        StatusCode e = e(i);
        return e == StatusCode.BLADERUNNER_FAILURE ? c(i) : e;
    }

    private static StatusCode e(int i) {
        StatusCode statusCode = StatusCode.BLADERUNNER_FAILURE;
        int i2 = AnonymousClass4.b[LaseOfflineError.b(i).ordinal()];
        if (i2 != 7) {
            if (i2 != 14) {
                if (i2 != 24) {
                    if (i2 != 32) {
                        switch (i2) {
                            case 10:
                                return StatusCode.DL_LIMIT_TOO_MANY_DOWNLOADED_DELETE_SOME;
                            case 11:
                            case 12:
                                return StatusCode.DL_LIMIT_CANT_DOWNLOAD_TILL_DATE;
                            default:
                                return statusCode;
                        }
                    }
                    return StatusCode.DL_BLACKLISTED_DEVICE;
                }
                return StatusCode.DL_LIMIT_TOO_MANY_DEVICES_PLAN_OPTION;
            }
            return StatusCode.DL_MONTHLY_DOWNLOAD_LIMIT;
        }
        return StatusCode.DL_TOTAL_LICENSE_PER_DEVICE_LIMIT;
    }

    private static StatusCode c(int i) {
        return AnonymousClass4.e[EdgeApiError.c(i).ordinal()] != 1 ? StatusCode.BLADERUNNER_FAILURE : StatusCode.BLADERUNNER_RETRY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.player.bladerunnerclient.volley.BladerunnerErrorStatus$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[EdgeApiError.values().length];
            e = iArr;
            try {
                iArr[EdgeApiError.HystrixTimeout.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[EdgeApiError.NOT_KNOWN_TO_CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LaseOfflineError.values().length];
            b = iArr2;
            try {
                iArr2[LaseOfflineError.Undefined.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[LaseOfflineError.AggregateError.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[LaseOfflineError.EventStoreError.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[LaseOfflineError.RequestTypeError.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[LaseOfflineError.MembershipError.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[LaseOfflineError.LicenseAggregateError.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[LaseOfflineError.TotalLicensesPerDeviceReached.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[LaseOfflineError.TotalLicensesPerAccountReached.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[LaseOfflineError.TitleNotAvailableForOffline.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[LaseOfflineError.StudioOfflineTitleLimitReached.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[LaseOfflineError.YearlyStudioDownloadLimitReached.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[LaseOfflineError.YearlyStudioLicenseLimitReached.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[LaseOfflineError.viewingWindowExpired.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[LaseOfflineError.DeviceMonthlyLimitError.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[LaseOfflineError.LicenseNotMarkedPlayable.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[LaseOfflineError.LicenseIdMismatch.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[LaseOfflineError.LicenseReleasedError.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[LaseOfflineError.LicenseTooOld.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[LaseOfflineError.DataMissError.ordinal()] = 19;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[LaseOfflineError.DataWriteError.ordinal()] = 20;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[LaseOfflineError.DeviceNotActiveError.ordinal()] = 21;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[LaseOfflineError.ViewableNotAvailableInRegion.ordinal()] = 22;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                b[LaseOfflineError.PackageRevokedError.ordinal()] = 23;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                b[LaseOfflineError.OfflineDeviceLimitReached.ordinal()] = 24;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                b[LaseOfflineError.DeviceAggregateError.ordinal()] = 25;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                b[LaseOfflineError.ServerError.ordinal()] = 26;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                b[LaseOfflineError.IOError.ordinal()] = 27;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                b[LaseOfflineError.DependencyCommandError.ordinal()] = 28;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                b[LaseOfflineError.ClientUsageError.ordinal()] = 29;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                b[LaseOfflineError.PlayableAggregateError.ordinal()] = 30;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                b[LaseOfflineError.LicenseNotActive.ordinal()] = 31;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                b[LaseOfflineError.BlacklistedDevice.ordinal()] = 32;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                b[LaseOfflineError.NOT_KNOWN_TO_CLIENT.ordinal()] = 33;
            } catch (NoSuchFieldError unused35) {
            }
        }
    }

    public String toString() {
        return "BladerunnerErrorStatus, " + this.e;
    }
}
