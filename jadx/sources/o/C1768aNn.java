package o;

import android.os.Build;
import com.netflix.mediaclient.cdx.api.DeviceType;
import com.netflix.mediaclient.service.user.UserAgent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.aNn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1768aNn extends C1045Mp {
    public static final C1768aNn d = new C1768aNn();

    /* renamed from: o.aNn$c */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[DeviceType.values().length];
            try {
                iArr[DeviceType.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            e = iArr;
        }
    }

    private C1768aNn() {
        super("nf_cdx_device_util");
    }

    public final String e(UserAgent userAgent) {
        InterfaceC5283bvo j;
        String profileName = (userAgent == null || (j = userAgent.j()) == null) ? null : j.getProfileName();
        String str = Build.MODEL;
        if (str.length() > 15) {
            C8632dsu.a(str, "");
            str = str.substring(0, 15);
            C8632dsu.a(str, "");
        }
        if (profileName != null) {
            return profileName + " " + str;
        }
        C8632dsu.d((Object) str);
        return str;
    }

    public final C1255Uq b(List<C1255Uq> list, String str) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        for (C1255Uq c1255Uq : list) {
            if (C8632dsu.c((Object) str, (Object) c1255Uq.a())) {
                getLogTag();
                return c1255Uq;
            }
        }
        return null;
    }

    public static /* synthetic */ List e(C1768aNn c1768aNn, JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c1768aNn.a(jSONObject, z);
    }

    public final boolean c(C1255Uq c1255Uq) {
        C8632dsu.c((Object) c1255Uq, "");
        return c.e[c1255Uq.j().ordinal()] == 1;
    }

    private final String a(JSONObject jSONObject) {
        if (jSONObject.has("esn")) {
            return jSONObject.optString("esn");
        }
        if (jSONObject.has("ESN")) {
            return jSONObject.optString("ESN");
        }
        return null;
    }

    public final C1255Uq b(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        String a = a(jSONObject);
        if (a != null) {
            String optString = jSONObject.optString("friendlyName");
            String optString2 = jSONObject.optString("deviceAddress");
            String optString3 = jSONObject.optString("vuiToken");
            String optString4 = jSONObject.optString("deviceType");
            C8632dsu.a(optString4, "");
            DeviceType e = e(optString4);
            String optString5 = jSONObject.optString("profileGuid");
            String optString6 = jSONObject.optString("networkId");
            boolean optBoolean = jSONObject.optBoolean("supportsCompanionMode", true);
            C8632dsu.d((Object) optString5);
            C8632dsu.d((Object) optString6);
            return new C1255Uq(a, optString, optString3, optString2, e, optString5, optString6, optBoolean);
        }
        return null;
    }

    public final C1255Uq c(C1255Uq c1255Uq, Map<String, C1255Uq> map) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) map, "");
        if (!b(c1255Uq)) {
            C1255Uq c1255Uq2 = map.get(c1255Uq.a());
            return c1255Uq2 == null ? c1255Uq : c1255Uq2;
        }
        getLogTag();
        return c1255Uq;
    }

    private final boolean b(C1255Uq c1255Uq) {
        String b;
        String e;
        String a = c1255Uq.a();
        return (a == null || a.length() == 0 || (b = c1255Uq.b()) == null || b.length() == 0 || (e = c1255Uq.e()) == null || e.length() == 0) ? false : true;
    }

    private final DeviceType e(String str) {
        DeviceType deviceType;
        boolean a;
        DeviceType[] values = DeviceType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                deviceType = null;
                break;
            }
            deviceType = values[i];
            a = C8691duz.a(deviceType.name(), str, true);
            if (a) {
                break;
            }
            i++;
        }
        return deviceType == null ? DeviceType.d : deviceType;
    }

    public final List<C1255Uq> b(C1255Uq c1255Uq, List<C1255Uq> list) {
        C8632dsu.c((Object) list, "");
        if (c1255Uq != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C1255Uq c1255Uq2 = (C1255Uq) obj;
                if (!C8632dsu.c(c1255Uq2, c1255Uq) && c1255Uq2.g()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((C1255Uq) obj2).g()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final List<C1255Uq> a(JSONObject jSONObject, boolean z) {
        List<C1255Uq> i;
        C8632dsu.c((Object) jSONObject, "");
        getLogTag();
        if (jSONObject.has("devices")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("devices");
            C8632dsu.d(optJSONArray);
            return b(optJSONArray, z);
        }
        i = C8569dql.i();
        return i;
    }

    private final List<C1255Uq> b(JSONArray jSONArray, boolean z) {
        getLogTag();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C8632dsu.a(jSONObject, "");
            C1255Uq b = b(jSONObject);
            if (b != null) {
                if (!z) {
                    arrayList.add(b);
                } else if (d.c(b)) {
                    arrayList.add(b);
                }
            }
        }
        return arrayList;
    }
}
