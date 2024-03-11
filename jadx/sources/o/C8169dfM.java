package o;

import android.util.Pair;
import com.netflix.android.volley.VolleyError;
import com.netflix.cl.model.Error;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.BaseStatus;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.util.log.RootCause;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.dfM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8169dfM {
    private static Error d(StatusCode statusCode, String str, boolean z, RootCause rootCause) {
        return d(statusCode, C8123deT.e(new Pair[]{new Pair("fatal", String.valueOf(z)), new Pair("reason", str), new Pair("rootCause", rootCause.name())}));
    }

    public static Status e(StatusCode statusCode, String str, boolean z, RootCause rootCause) {
        NetflixStatus netflixStatus = new NetflixStatus(statusCode);
        netflixStatus.e(d(statusCode, str, false, rootCause));
        return netflixStatus;
    }

    public static Error e(Status status) {
        if (status != null && (status instanceof BaseStatus)) {
            return ((BaseStatus) status).a();
        }
        return null;
    }

    public static String d(Status status) {
        Error e = e(status);
        if (e != null) {
            try {
                return e.toJSONObject().toString();
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public static Error d(StatusCode statusCode, JSONObject jSONObject) {
        if (statusCode == null) {
            statusCode = StatusCode.UNKNOWN;
        }
        switch (AnonymousClass3.b[statusCode.ordinal()]) {
            case 1:
            case 2:
                C1044Mm.e("StatusUtils", "Report success");
                return null;
            case 3:
                return new Error(RootCause.networkFailure.name(), null, jSONObject);
            case 4:
                return new Error(RootCause.tcpNoRouteToHost.name(), null, jSONObject);
            case 5:
                return new Error(RootCause.sslExpiredCert.name(), null, jSONObject);
            case 6:
                return new Error(RootCause.sslUntrustedCert.name(), null, jSONObject);
            case 7:
                return new Error(RootCause.sslUntrustedCert.name(), null, jSONObject);
            case 8:
                return new Error(RootCause.serverFailure.name(), null, jSONObject);
            case 9:
                return new Error(RootCause.unknownFailure.name(), null, jSONObject);
            default:
                return new Error(RootCause.unknownFailure.name(), null, jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dfM$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[StatusCode.values().length];
            b = iArr;
            try {
                iArr[StatusCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[StatusCode.NON_RECOMMENDED_APP_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[StatusCode.NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[StatusCode.NO_CONNECTIVITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[StatusCode.HTTP_SSL_NO_VALID_CERT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[StatusCode.HTTP_SSL_DATE_TIME_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[StatusCode.HTTP_SSL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[StatusCode.SERVER_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[StatusCode.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private static boolean d(VolleyError volleyError) {
        return (volleyError == null || volleyError.b == null) ? false : true;
    }

    public static RootCause e(VolleyError volleyError) {
        if (!d(volleyError)) {
            return RootCause.networkFailure;
        }
        int i = volleyError.b.e;
        if (i < 400 || i >= 500) {
            if (i >= 500 && i < 600) {
                return RootCause.http5xx;
            }
            String message = volleyError.getMessage();
            if (message != null) {
                String lowerCase = message.toLowerCase(Locale.US);
                if (lowerCase.contains("sslhandshakeexception")) {
                    return RootCause.sslHandshakeFailure;
                }
                if (lowerCase.contains("current time") && lowerCase.contains("validation time")) {
                    return RootCause.sslExpiredCert;
                }
                if (lowerCase.contains("no trusted certificate found")) {
                    return RootCause.sslUntrustedCert;
                }
            }
            return RootCause.networkFailure;
        }
        return RootCause.http4xx;
    }

    public static Error b(VolleyError volleyError) {
        if (volleyError == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rootCause", e(volleyError).name());
            if (d(volleyError)) {
                jSONObject.put("statusCode", volleyError.b.e);
                byte[] bArr = volleyError.b.c;
                if (bArr != null) {
                    jSONObject.put("response", new String(bArr, "UTF-8"));
                }
            }
        } catch (Throwable unused) {
        }
        return ExtCLUtils.toError(StatusCode.NETWORK_ERROR.name(), jSONObject, volleyError);
    }

    public static String a(Error error) {
        if (error != null) {
            try {
                JSONObject jSONObject = error.toJSONObject();
                if (jSONObject == null) {
                    return null;
                }
                return jSONObject.toString();
            } catch (JSONException unused) {
            } catch (Throwable th) {
                InterfaceC1598aHf.a(new C1596aHd("Not expected exception on error conversion").b(ErrorType.j).d(th));
            }
        }
        return null;
    }

    public static Error c(Status status) {
        StatusCode statusCode;
        if (status == null || status.c() == null) {
            statusCode = StatusCode.UNKNOWN;
        } else {
            statusCode = status.c();
        }
        return d(statusCode);
    }

    public static String b(Status status) {
        return a(c(status));
    }

    public static Error d(StatusCode statusCode) {
        return d(statusCode, null);
    }

    public static String b(StatusCode statusCode) {
        return e(statusCode, null);
    }

    public static String e(StatusCode statusCode, JSONObject jSONObject) {
        Error d;
        try {
            d = d(statusCode, jSONObject);
        } catch (JSONException unused) {
        }
        if (d == null) {
            return null;
        }
        return d.toJSONObject().toString();
    }
}
