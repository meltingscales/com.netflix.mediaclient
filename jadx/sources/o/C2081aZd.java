package o;

import com.netflix.android.org.json.JSONArray;
import com.netflix.android.org.json.JSONObject;
import com.netflix.msl.MslException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: o.aZd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2081aZd {
    public static final C2081aZd e = new C2081aZd();

    private C2081aZd() {
    }

    public static final URL b(aOV aov, String str, Object obj) {
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) str, "");
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            C1044Mm.a("nf_msl_client", e2, "Failed to add TAG to URL");
            return new URL(aov.j().b(null));
        }
    }

    public static final void e(ExecutionException executionException) {
        C8632dsu.c((Object) executionException, "");
        Throwable cause = executionException.getCause();
        if (cause instanceof RuntimeException) {
            C1044Mm.d("nf_msl_client", "Runtime exception found ");
            throw cause;
        }
    }

    public static final void b(ExecutionException executionException) {
        C8632dsu.c((Object) executionException, "");
        Throwable cause = executionException.getCause();
        if (cause instanceof MslException) {
            C1044Mm.d("nf_msl_client", "MSL exception found ");
            throw cause;
        }
    }

    private static final List<?> e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(e(jSONArray.get(i)));
        }
        return arrayList;
    }

    private static final Object e(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return b((JSONObject) obj);
        }
        return obj instanceof JSONArray ? e((JSONArray) obj) : obj;
    }

    public static final Map<String, Object> b(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object next = keys.next();
            C8632dsu.d(next);
            String str = (String) next;
            hashMap.put(str, e(jSONObject.get(str)));
        }
        return hashMap;
    }

    public static final void b(C2083aZf c2083aZf) {
        C8632dsu.c((Object) c2083aZf, "");
        C2082aZe c2082aZe = c2083aZf.b;
        if (c2082aZe == null) {
            throw new IllegalStateException("MSL URL not known! This should NOT happen!".toString());
        }
        c2082aZe.b();
    }
}
