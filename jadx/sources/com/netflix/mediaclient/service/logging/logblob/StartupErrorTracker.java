package com.netflix.mediaclient.service.logging.logblob;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.logging.logblob.StartupErrorTracker;
import com.netflix.mediaclient.service.pushnotification.Payload;
import dagger.hilt.android.EntryPointAccessors;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C1991aVv;
import o.C8157dfA;
import o.C8168dfL;
import o.C8170dfN;
import o.C8575dqr;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.InterfaceC1245Ug;
import o.InterfaceC8598drn;
import o.dpR;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class StartupErrorTracker {
    public static final StartupErrorTracker a = new StartupErrorTracker();
    private static JSONArray d = new JSONArray();

    private StartupErrorTracker() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class StartupErrorCategory {
        private static final /* synthetic */ InterfaceC8598drn i;
        private static final /* synthetic */ StartupErrorCategory[] j;
        private final String h;
        public static final StartupErrorCategory g = new StartupErrorCategory("Network", 0, "network");
        public static final StartupErrorCategory e = new StartupErrorCategory("Appboot", 1, "appboot");
        public static final StartupErrorCategory d = new StartupErrorCategory("Config", 2, "config");
        public static final StartupErrorCategory c = new StartupErrorCategory("Crash", 3, "crash");
        public static final StartupErrorCategory b = new StartupErrorCategory("Drm", 4, "drm");
        public static final StartupErrorCategory a = new StartupErrorCategory("Msl", 5, "msl");
        public static final StartupErrorCategory f = new StartupErrorCategory("Others", 6, "others");

        private static final /* synthetic */ StartupErrorCategory[] c() {
            return new StartupErrorCategory[]{g, e, d, c, b, a, f};
        }

        public static StartupErrorCategory valueOf(String str) {
            return (StartupErrorCategory) Enum.valueOf(StartupErrorCategory.class, str);
        }

        public static StartupErrorCategory[] values() {
            return (StartupErrorCategory[]) j.clone();
        }

        public final String e() {
            return this.h;
        }

        private StartupErrorCategory(String str, int i2, String str2) {
            this.h = str2;
        }

        static {
            StartupErrorCategory[] c2 = c();
            j = c2;
            i = C8600drp.e(c2);
        }
    }

    public final void d() {
        Schedulers.io().scheduleDirect(new Runnable() { // from class: o.aUT
            @Override // java.lang.Runnable
            public final void run() {
                StartupErrorTracker.e(StartupErrorTracker.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(StartupErrorTracker startupErrorTracker) {
        C8632dsu.c((Object) startupErrorTracker, "");
        synchronized (startupErrorTracker) {
            a.e();
            dpR dpr = dpR.c;
        }
    }

    public static /* synthetic */ void a(StartupErrorTracker startupErrorTracker, long j, String str, String str2, StartupErrorCategory startupErrorCategory, Throwable th, int i, Object obj) {
        if ((i & 16) != 0) {
            th = null;
        }
        startupErrorTracker.b(j, str, str2, startupErrorCategory, th);
    }

    public final void b(long j, String str, String str2, StartupErrorCategory startupErrorCategory, Throwable th) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) startupErrorCategory, "");
        C1044Mm.a("startupError", "clienttime" + j + " errorcode=" + str + " errormsg=" + str2 + " category=" + startupErrorCategory);
        synchronized (this) {
            StartupErrorTracker startupErrorTracker = a;
            startupErrorTracker.e();
            if (startupErrorTracker.b()) {
                startupErrorTracker.c();
            }
            d.put(startupErrorTracker.a(str, str2, startupErrorCategory, j, th));
            String jSONArray = d.toString();
            C8632dsu.a(jSONArray, "");
            startupErrorTracker.a(jSONArray);
            dpR dpr = dpR.c;
        }
    }

    public final void e(C1991aVv c1991aVv) {
        C8632dsu.c((Object) c1991aVv, "");
        synchronized (this) {
            StartupErrorTracker startupErrorTracker = a;
            startupErrorTracker.e();
            if (d.length() > 0) {
                JSONArray jSONArray = d;
                jSONArray.getJSONObject(jSONArray.length() - 1).put("dns", c1991aVv.i());
            }
            String jSONArray2 = d.toString();
            C8632dsu.a(jSONArray2, "");
            startupErrorTracker.a(jSONArray2);
            dpR dpr = dpR.c;
        }
    }

    public static final void a(Status status, String str) {
        C8632dsu.c((Object) status, "");
        C8632dsu.c((Object) str, "");
        StartupErrorCategory startupErrorCategory = StartupErrorCategory.f;
        if (status.c() == InterfaceC1078Nw.ap.e) {
            startupErrorCategory = StartupErrorCategory.e;
        } else if (status.c() == StatusCode.FATAL_CONFIG_DOWNLOAD_FAILED || status.c() == StatusCode.FATAL_ESN_BASED_CONFIG_DOWNLOAD_FAILED) {
            startupErrorCategory = StartupErrorCategory.d;
        } else if (status.c().isDrmError()) {
            startupErrorCategory = StartupErrorCategory.b;
        } else if (status.c().isMslError()) {
            startupErrorCategory = StartupErrorCategory.a;
        } else if (status.g()) {
            startupErrorCategory = StartupErrorCategory.g;
        }
        a.b(C8170dfN.d(), String.valueOf(status.c().getValue()), str, startupErrorCategory, status.e());
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((JSONObject) t).optLong("clienttime", 0L)), Long.valueOf(((JSONObject) t2).optLong("clienttime", 0L)));
            return compareValues;
        }
    }

    public static final void a(Throwable th) {
        C8632dsu.c((Object) th, "");
        if (AbstractApplicationC1040Mh.getInstance().i().r()) {
            return;
        }
        StartupErrorTracker startupErrorTracker = a;
        long d2 = C8170dfN.d();
        String message = th.getMessage();
        a(startupErrorTracker, d2, message == null ? "" : message, "", StartupErrorCategory.c, null, 16, null);
    }

    public static final void c(String str, JSONObject jSONObject, boolean z) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) jSONObject, "");
        StartupErrorTracker startupErrorTracker = a;
        synchronized (startupErrorTracker) {
            startupErrorTracker.e();
            if (d.length() > 0) {
                jSONObject.put(str, d);
                if (z) {
                    startupErrorTracker.a("");
                }
            }
            dpR dpr = dpR.c;
        }
    }

    private final void e() {
        try {
            String e = C8157dfA.e(AbstractApplicationC1040Mh.d(), "startup_error_history", (String) null);
            if (C8168dfL.g(e)) {
                return;
            }
            C1044Mm.a("startupError", "loadStartupErrors pref" + e);
            d = new JSONArray(e);
        } catch (JSONException unused) {
        }
    }

    private final void c() {
        ArrayList<JSONObject> arrayList = new ArrayList();
        int length = d.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = d.getJSONObject(i);
            if (jSONObject != null) {
                arrayList.add(jSONObject);
            }
        }
        C8575dqr.c(arrayList, new b());
        arrayList.remove(0);
        JSONArray jSONArray = new JSONArray();
        for (JSONObject jSONObject2 : arrayList) {
            jSONArray.put(jSONObject2);
        }
        d = jSONArray;
    }

    private final JSONObject a(String str, String str2, StartupErrorCategory startupErrorCategory, long j, Throwable th) {
        Throwable cause;
        String message;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorcode", str);
        jSONObject.put("errormsg", str2);
        jSONObject.put("category", startupErrorCategory.e());
        jSONObject.put("clienttime", j);
        Context d2 = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d2, "");
        jSONObject.put("appvers", ((InterfaceC1245Ug) EntryPointAccessors.fromApplication(d2, InterfaceC1245Ug.class)).w().i());
        jSONObject.put("bg", AbstractApplicationC1040Mh.getInstance().o().h());
        jSONObject.put("bgstart", AbstractApplicationC1040Mh.getInstance().o().j());
        if (th != null && (message = th.getMessage()) != null) {
            jSONObject.put("causemsg", message);
        }
        if (th != null && (cause = th.getCause()) != null) {
            jSONObject.put(Payload.PARAM_RENO_CAUSE, C1044Mm.d(cause));
        }
        return jSONObject;
    }

    private final boolean b() {
        return d.length() >= 10;
    }

    private final void a(String str) {
        C8157dfA.a(AbstractApplicationC1040Mh.d(), "startup_error_history", str);
    }

    public final boolean a() {
        boolean z = d.length() == 0;
        C1044Mm.a("startupError", "hasNoStartupErrors=" + z);
        return d.length() == 0;
    }
}
