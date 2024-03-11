package o;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.netflix.mediaclient.cdx.api.PairingType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC1804aOw;

/* renamed from: o.aOz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1807aOz extends C1045Mp {
    public static final C1807aOz a = new C1807aOz();

    private C1807aOz() {
        super("nf_cdx_pairing_utils");
    }

    public final void c(Context context, Map<String, aOE> map) {
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) map, "");
            String json = C8118deO.a().toJson(map);
            getLogTag();
            C8157dfA.a(context, "pref_cdx_prompted_pairing_prompts", json);
        }
    }

    public final Map<String, aOE> e(Context context) {
        Map<String, aOE> map;
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            String e = C8157dfA.e(context, "pref_cdx_prompted_pairing_prompts", (String) null);
            getLogTag();
            if (e == null) {
                map = new HashMap<>();
            } else {
                Type type = new c().getType();
                C8632dsu.a(type, "");
                map = (Map) C8118deO.a().fromJson(e, type);
                C8632dsu.d(map);
            }
        }
        return map;
    }

    /* renamed from: o.aOz$c */
    /* loaded from: classes3.dex */
    public static final class c extends TypeToken<Map<String, ? extends aOE>> {
        c() {
        }
    }

    public final String e(Context context, Map<String, Map<String, C1801aOt>> map) {
        String json;
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) map, "");
            json = C8118deO.a().toJson(map);
            getLogTag();
            C8157dfA.a(context, "pref_cdx_pairing_history", json);
            C8632dsu.d((Object) json);
        }
        return json;
    }

    public final Map<String, Map<String, C1801aOt>> b(Context context) {
        Map<String, Map<String, C1801aOt>> map;
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            String e = C8157dfA.e(context, "pref_cdx_pairing_history", (String) null);
            getLogTag();
            if (e == null) {
                map = dqE.d();
            } else {
                map = (Map) C8118deO.a().fromJson(e, new b().getType());
                C8632dsu.d(map);
            }
        }
        return map;
    }

    /* renamed from: o.aOz$b */
    /* loaded from: classes3.dex */
    public static final class b extends TypeToken<HashMap<String, Map<String, ? extends C1801aOt>>> {
        b() {
        }
    }

    public final AbstractC1804aOw.a c(C1255Uq c1255Uq) {
        List e;
        C8632dsu.c((Object) c1255Uq, "");
        e = C8566dqi.e(c1255Uq);
        return new AbstractC1804aOw.a(e);
    }

    public final AbstractC1804aOw.a a(List<C1255Uq> list) {
        C8632dsu.c((Object) list, "");
        return new AbstractC1804aOw.a(list);
    }

    public final List<C1255Uq> d(List<C1255Uq> list, Map<String, C1801aOt> map) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) map, "");
        ArrayList arrayList = new ArrayList();
        for (C1255Uq c1255Uq : list) {
            if (map.get(c1255Uq.a()) != null) {
                arrayList.add(c1255Uq);
            }
        }
        return arrayList;
    }

    public final List<C1255Uq> c(C1255Uq c1255Uq, List<C1255Uq> list) {
        C8632dsu.c((Object) c1255Uq, "");
        C8632dsu.c((Object) list, "");
        ArrayList arrayList = new ArrayList();
        for (C1255Uq c1255Uq2 : list) {
            if (C8632dsu.c((Object) c1255Uq2.b(), (Object) c1255Uq.b())) {
                arrayList.add(c1255Uq2);
            }
        }
        return arrayList;
    }

    public final List<C1255Uq> b(String str, List<C1255Uq> list) {
        C8632dsu.c((Object) list, "");
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        for (C1255Uq c1255Uq : list) {
            if (C8632dsu.c((Object) c1255Uq.e(), (Object) str)) {
                arrayList.add(c1255Uq);
            }
        }
        return arrayList;
    }

    public final boolean b(PairingType pairingType) {
        C8632dsu.c((Object) pairingType, "");
        return pairingType != PairingType.b;
    }
}
