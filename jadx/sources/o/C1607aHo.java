package o;

import android.util.Base64;
import com.netflix.cl.util.CLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.aHo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1607aHo {
    private static final InterfaceC8554dpx b;
    public static final C1607aHo d = new C1607aHo();

    private C1607aHo() {
    }

    static {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<MessageDigest>() { // from class: com.netflix.mediaclient.log.impl.LoggerUtils$md5Digest$2
            @Override // o.drO
            /* renamed from: a */
            public final MessageDigest invoke() {
                return MessageDigest.getInstance("MD5");
            }
        });
        b = b2;
    }

    private final MessageDigest d() {
        Object value = b.getValue();
        C8632dsu.a(value, "");
        return (MessageDigest) value;
    }

    public final JSONObject d(C1596aHd c1596aHd, Throwable th, JSONObject jSONObject, C1606aHn c1606aHn) {
        C8632dsu.c((Object) c1596aHd, "");
        C8632dsu.c((Object) th, "");
        C8632dsu.c((Object) jSONObject, "");
        C8632dsu.c((Object) c1606aHn, "");
        a(jSONObject, c1596aHd, c1606aHn);
        try {
            if (th.getMessage() != null) {
                jSONObject.put("message", th.getMessage());
            }
            jSONObject.put("className", th.getClass().getName());
            jSONObject.put(SignupConstants.Error.DEBUG_FIELD_STACK_TRACE, CLUtils.getStackTraceString(th));
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", "handledException");
        jSONObject2.put("debug", jSONObject);
        return jSONObject2;
    }

    public final Error e(C1596aHd c1596aHd) {
        C8632dsu.c((Object) c1596aHd, "");
        return e(c1596aHd.b(), c1596aHd.i);
    }

    private final Error e(String str, Throwable th) {
        if (str == null || th == null) {
            if (str != null) {
                return new Error(str);
            }
            if (th != null) {
                return new Error(th);
            }
            return new Error("Handled exception with no message");
        }
        return new Error(str, th);
    }

    private final void a(JSONObject jSONObject, C1596aHd c1596aHd, C1606aHn c1606aHn) {
        Iterator<T> it = c1596aHd.e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getValue();
            if (str == null) {
                str = "null";
            }
            if (str.length() > 500) {
                str = str.substring(0, 500);
                C8632dsu.a(str, "");
            }
            jSONObject.put((String) entry.getKey(), str);
        }
        if (c1596aHd.b) {
            jSONObject.put("isHighVolumeEvent", "true");
        }
        jSONObject.put("samplingPercentage", c1606aHn.c());
    }

    public final Map<String, String> d(C1596aHd c1596aHd, C1606aHn c1606aHn, String str) {
        Map<String, String> k;
        C8632dsu.c((Object) c1596aHd, "");
        C8632dsu.c((Object) c1606aHn, "");
        k = dqE.k(c1596aHd.e);
        if (c1596aHd.b) {
            k.put("isHighVolumeEvent", "true");
        }
        if (str != null) {
            k.put("fast_property_kill_switch", str);
        }
        k.put("samplingPercentage", String.valueOf(c1606aHn.c()));
        return k;
    }

    public final String c(C1596aHd c1596aHd) {
        C8632dsu.c((Object) c1596aHd, "");
        String b2 = c1596aHd.b();
        if (b2 == null) {
            return null;
        }
        d().reset();
        MessageDigest d2 = d();
        byte[] bytes = b2.getBytes(C8674dui.i);
        C8632dsu.a(bytes, "");
        d2.update(bytes);
        String encodeToString = Base64.encodeToString(d().digest(), 2);
        return "v1_" + encodeToString;
    }
}
