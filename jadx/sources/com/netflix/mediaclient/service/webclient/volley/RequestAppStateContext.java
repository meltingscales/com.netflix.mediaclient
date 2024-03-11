package com.netflix.mediaclient.service.webclient.volley;

import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class RequestAppStateContext {
    public static final a c;
    private static final /* synthetic */ RequestAppStateContext[] g;
    private static final /* synthetic */ InterfaceC8598drn h;
    private final String f;
    public static final RequestAppStateContext a = new RequestAppStateContext("BACKGROUND", 0, "background");
    public static final RequestAppStateContext e = new RequestAppStateContext("FOREGROUND", 1, "foreground");
    public static final RequestAppStateContext b = new RequestAppStateContext("IDLE", 2, "idle");
    public static final RequestAppStateContext d = new RequestAppStateContext("UNKNOWN", 3, "unknown");

    private static final /* synthetic */ RequestAppStateContext[] a() {
        return new RequestAppStateContext[]{a, e, b, d};
    }

    public static RequestAppStateContext valueOf(String str) {
        return (RequestAppStateContext) Enum.valueOf(RequestAppStateContext.class, str);
    }

    public static RequestAppStateContext[] values() {
        return (RequestAppStateContext[]) g.clone();
    }

    private RequestAppStateContext(String str, int i, String str2) {
        this.f = str2;
    }

    static {
        RequestAppStateContext[] a2 = a();
        g = a2;
        h = C8600drp.e(a2);
        c = new a(null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appState", this.f);
        String jSONObject2 = jSONObject.toString();
        C8632dsu.a(jSONObject2, "");
        return jSONObject2;
    }
}
