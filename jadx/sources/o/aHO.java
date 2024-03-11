package o;

import android.content.Context;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC9854xo;
import org.apache.http.impl.cookie.DateUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class aHO {
    public static Map<String, String> e(InterfaceC9854xo.d dVar) {
        if (dVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = dVar.a;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        if (dVar.e > 0) {
            hashMap.put("If-Modified-Since", DateUtils.formatDate(new Date(dVar.e)));
        }
        return hashMap;
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            if (jSONObject.has("host")) {
                return jSONObject.getString("host");
            }
            return null;
        } catch (JSONException e) {
            C9862xw.a("Json exception reading redirect response %s", e);
            return null;
        }
    }

    public static String c(Context context) {
        return aHK.c(context);
    }

    public static InetAddress[] e(String str) {
        return InetAddress.getAllByName(str);
    }

    public static Inet6Address[] e(InetAddress[] inetAddressArr) {
        if (inetAddressArr == null) {
            return new Inet6Address[0];
        }
        ArrayList arrayList = new ArrayList();
        for (InetAddress inetAddress : inetAddressArr) {
            if (inetAddress instanceof Inet6Address) {
                arrayList.add((Inet6Address) inetAddress);
            }
        }
        return (Inet6Address[]) arrayList.toArray(new Inet6Address[0]);
    }

    public static Inet4Address[] c(InetAddress[] inetAddressArr) {
        if (inetAddressArr == null) {
            return new Inet4Address[0];
        }
        ArrayList arrayList = new ArrayList();
        for (InetAddress inetAddress : inetAddressArr) {
            if (inetAddress instanceof Inet4Address) {
                arrayList.add((Inet4Address) inetAddress);
            }
        }
        return (Inet4Address[]) arrayList.toArray(new Inet4Address[0]);
    }
}
