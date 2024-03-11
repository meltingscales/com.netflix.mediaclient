package o;

import com.netflix.android.volley.NoConnectionError;
import com.netflix.android.volley.ServerError;
import com.netflix.android.volley.VolleyError;
import com.netflix.falkor.FalkorException;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.service.msl.client.ProfileSwitchFailedException;
import com.netflix.mediaclient.service.msl.client.WidevineContextException;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.volley.ParseException;
import com.netflix.mediaclient.service.webclient.volley.StatusCodeError;
import com.netflix.msl.MslErrorException;
import com.netflix.msl.MslException;
import com.netflix.msl.MslInternalException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;

/* renamed from: o.dgb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8237dgb {
    public static int e = 408;
    public static final VolleyError c = new VolleyError(new C9858xs(e, new byte[0], Collections.emptyMap(), false));

    public static NetflixStatus a(VolleyError volleyError, StatusCode statusCode) {
        StatusCode d;
        FalkorException falkorException;
        Map<String, String> map;
        String message = volleyError.getMessage();
        boolean z = volleyError instanceof FalkorException;
        if (z) {
            d = ((FalkorException) volleyError).a(message);
        } else if (volleyError instanceof ParseException) {
            d = StatusCode.RESPONSE_PARSE_ERROR;
        } else if (volleyError instanceof ServerError) {
            d = StatusCode.SERVER_ERROR;
        } else if (volleyError instanceof NoConnectionError) {
            d = StatusCode.NO_CONNECTIVITY;
        } else if (volleyError instanceof StatusCodeError) {
            d = ((StatusCodeError) volleyError).d();
        } else {
            d = d(volleyError);
        }
        if (d != null) {
            statusCode = d;
        }
        C1044Mm.e("nf_volley", "getStatus statusCode: " + statusCode);
        NetflixStatus netflixStatus = new NetflixStatus(statusCode);
        netflixStatus.e(C8169dfM.b(volleyError));
        netflixStatus.c(volleyError);
        if (z && (map = (falkorException = (FalkorException) volleyError).c) != null && map.containsKey("jsonErrorMessage")) {
            netflixStatus.a(falkorException.c.get("jsonErrorMessage"));
        }
        return netflixStatus;
    }

    public static StatusCodeError b(VolleyError volleyError) {
        String obj = volleyError.toString();
        if (obj == null) {
            return new StatusCodeError(StatusCode.HTTP_ERROR_UNKNOWN, volleyError.toString());
        }
        String upperCase = obj.toUpperCase(Locale.ENGLISH);
        if (upperCase.contains("REQUEST_ERROR_CONNECTION_TIMED_OUT")) {
            return new StatusCodeError(StatusCode.HTTP_ERR_TIMEOUT, upperCase);
        }
        if (upperCase.contains("ERR_NAME_NOT_RESOLVED")) {
            return new StatusCodeError(StatusCode.HTTP_ERR_NOT_RESOLVED, upperCase);
        }
        if (upperCase.contains("ERR_INVALID_URL") || upperCase.contains("ERR_DISALLOWED_URL_SCHEME") || upperCase.contains("ERR_UNKNOWN_URL_SCHEME")) {
            return new StatusCodeError(StatusCode.HTTP_ERR_MALFORMED_URL, upperCase);
        }
        return new StatusCodeError(StatusCode.HTTP_ERROR_UNKNOWN, upperCase);
    }

    public static StatusCode d(VolleyError volleyError) {
        Throwable cause = volleyError.getCause();
        if (cause != null) {
            if (cause instanceof UnknownHostException) {
                return StatusCode.NET_UNKNOWN_HOST_EXCEPTION;
            }
            if (cause instanceof ConnectException) {
                return StatusCode.NET_CONNECTION_EXCEPTION;
            }
            if (cause instanceof SocketTimeoutException) {
                return StatusCode.NET_SOCKET_TIMEOUT_EXCEPTION;
            }
            if (C8185dfc.a(volleyError)) {
                return StatusCode.MSL_USERAUTH_ENTITY_MISMATCH;
            }
            if (cause instanceof WidevineContextException) {
                return ((WidevineContextException) cause).e();
            }
            if (cause instanceof ProfileSwitchFailedException) {
                return ((ProfileSwitchFailedException) cause).b();
            }
            if (a(cause)) {
                return StatusCode.MSL_GENERIC_EXCEPTION;
            }
            if (cause instanceof CronetException) {
                return a((CronetException) cause);
            }
        }
        return null;
    }

    private static StatusCode a(CronetException cronetException) {
        if (cronetException instanceof NetworkException) {
            switch (((NetworkException) cronetException).getErrorCode()) {
                case 1:
                    return StatusCode.NET_CRONET_HOSTNAME_NOT_RESOLVED;
                case 2:
                    return StatusCode.NET_CRONET_INTERNET_DISCONNECTED;
                case 3:
                    return StatusCode.NET_CRONET_NETWORK_CHANGED;
                case 4:
                    return StatusCode.NET_CRONET_TIMED_OUT;
                case 5:
                    return StatusCode.NET_CRONET_CONNECTION_CLOSED;
                case 6:
                    return StatusCode.NET_CRONET_CONNECTION_TIMED_OUT;
                case 7:
                    return StatusCode.NET_CRONET_CONNECTION_REFUSED;
                case 8:
                    return StatusCode.NET_CRONET_CONNECTION_RESET;
                case 9:
                    return StatusCode.NET_CRONET_ADDRESS_UNREACHABLE;
                case 10:
                    return StatusCode.NET_CRONET_QUIC_PROTOCOL_FAILED;
                case 11:
                    return StatusCode.NET_CRONET_ERROR_OTHER;
            }
        }
        return null;
    }

    private static boolean a(Throwable th) {
        if (th == null) {
            return false;
        }
        if (c(th) || c(th.getCause())) {
            return true;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        return (C8168dfL.h(stringWriter2) && stringWriter2.contains("com.netflix.msl")) || stringWriter2.contains(aYS.class.getCanonicalName()) || stringWriter2.contains(aYV.class.getCanonicalName());
    }

    private static boolean c(Throwable th) {
        return (th instanceof MslErrorException) || (th instanceof MslInternalException) || (th instanceof MslException);
    }

    public static AbstractC5042brL d(UserAgent userAgent, String str, AbstractC5042brL abstractC5042brL, boolean z) {
        InterfaceC5034brD c2 = userAgent.c(str);
        if (c2 != null) {
            abstractC5042brL.e(c2);
        } else if (z) {
            C1044Mm.j("nf_volley", "UserCredentialRegistry not found for profile %s, but request is marked as always deliver, use current credentials.", str);
        } else {
            C1044Mm.j("nf_volley", "UserCredentialRegistry not found for profile %s, drop request", str);
            return null;
        }
        return abstractC5042brL;
    }

    public static String e(Map<String, String> map, String str) {
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";");
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }
}
