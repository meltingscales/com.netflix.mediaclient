package o;

import com.netflix.android.volley.TimeoutError;
import com.netflix.android.volley.VolleyError;
import com.netflix.mediaclient.util.log.RootCause;
import java.net.HttpRetryException;
import java.util.Map;
import org.chromium.net.NetworkException;

/* renamed from: o.brN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5044brN {
    public static int d(VolleyError volleyError) {
        if (volleyError == null) {
            return -1;
        }
        if (volleyError instanceof TimeoutError) {
            C1044Mm.e("ftl", volleyError, "FTL error for connection timeout", new Object[0]);
            return 1;
        }
        RootCause e = C8169dfM.e(volleyError);
        if (e == RootCause.sslExpiredCert || e == RootCause.sslHandshakeFailure || e == RootCause.sslNoCipher || e == RootCause.sslUntrustedCert) {
            C1044Mm.e("ftl", volleyError, "FTL error for TLS failure", new Object[0]);
            return 3;
        }
        Throwable cause = volleyError.getCause();
        if (cause instanceof HttpRetryException) {
            C1044Mm.e("ftl", volleyError.getCause(), "NOT FTL error for retry: status code %s", Integer.valueOf(((HttpRetryException) cause).responseCode()));
            return -1;
        } else if (cause instanceof NetworkException) {
            return c(((NetworkException) cause).getErrorCode());
        } else {
            C1044Mm.e("ftl", volleyError.getCause(), "NOT FTL error: unknown connection error", new Object[0]);
            return -1;
        }
    }

    public static int c(int i) {
        switch (i) {
            case 1:
                C1044Mm.a("ftl", "FTL error for DNS failure: %s", Integer.valueOf(i));
                return 2;
            case 2:
                return 5;
            case 3:
                return -1;
            case 4:
                C1044Mm.a("ftl", "FTL error for cronet timeout: %s", Integer.valueOf(i));
                return 1;
            case 5:
            case 8:
                C1044Mm.a("ftl", "FTL error for IO failure: %s", Integer.valueOf(i));
                return 4;
            case 6:
            case 7:
            case 9:
                C1044Mm.a("ftl", "FTL error for connect failure: %s", Integer.valueOf(i));
                return 0;
            default:
                C1044Mm.a("ftl", "FTL error for connection: %s", Integer.valueOf(i));
                return 10;
        }
    }

    public static String d(C9858xs c9858xs) {
        Map<String, String> map;
        if (c9858xs == null || (map = c9858xs.d) == null) {
            return null;
        }
        return map.get("Via");
    }
}
