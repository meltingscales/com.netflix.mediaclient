package com.netflix.mediaclient.net;

import android.content.Context;
import android.os.SystemClock;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C8157dfA;
import o.C8168dfL;
import o.C8342dia;
import o.aHH;
import o.aHI;
import o.aHK;
import o.aHN;
import o.aHQ;
import o.aMF;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public enum NetworkRequestLogger implements aHH {
    INSTANCE;
    
    private String a;
    private JSONObject f;
    private long g;
    private aMF.b h;
    private long j;
    private final Random i = new Random();
    private boolean l = true;
    private Map<NetworkRequestType, aHQ> e = new HashMap();
    private Map<AppVisibilityState, aHN> b = new HashMap();
    private Map<String, Long> n = new HashMap();

    public JSONObject c() {
        return this.f;
    }

    NetworkRequestLogger() {
    }

    public void c(aMF.b bVar, long j) {
        this.h = bVar;
        this.g = j;
        String e = C8157dfA.e(bVar.b(), "previous_network_stats", (String) null);
        C1044Mm.a("nf_net_stats", "NetworkRequestLogge::init: previousNetworkStats: %s", e);
        if (C8168dfL.g(e)) {
            return;
        }
        C8157dfA.e(bVar.b(), "previous_network_stats");
        try {
            this.f = new JSONObject(e);
        } catch (Throwable th) {
            C1044Mm.b("nf_net_stats", th, "Failed to create JSON!", new Object[0]);
        }
    }

    @Override // o.aHH
    public void d(String str) {
        synchronized (this.n) {
            this.n.put(str, -1L);
        }
    }

    @Override // o.aHH
    public void a(String str, Long l) {
        Context b = this.h.b();
        if (l != null) {
            synchronized (this.n) {
                this.n.put(str, l);
            }
        }
        e(b);
    }

    @Override // o.aHH
    public void c(NetworkRequestType networkRequestType, Map<String, List<String>> map, String str, Long l, Long l2) {
        synchronized (this) {
            if (C8168dfL.g(str)) {
                return;
            }
            b(this.h);
            Context b = this.h.b();
            if (networkRequestType == null) {
                networkRequestType = e(str);
            }
            if (networkRequestType == null) {
                C1044Mm.j("nf_net_stats", "onNetworkRequestFinished:: networkRequestType is null!");
                networkRequestType = NetworkRequestType.UNKNOWN;
                if (C8342dia.c(str)) {
                    networkRequestType = NetworkRequestType.PRIVATE_SUBNET;
                }
            }
            C1044Mm.a("nf_net_stats", "onNetworkRequestFinished:: networkRequestType: %s", networkRequestType.name());
            aHQ ahq = this.e.get(networkRequestType);
            if (ahq == null) {
                ahq = new aHQ(networkRequestType);
                this.e.put(networkRequestType, ahq);
            }
            String c = aHK.c(b);
            if (c == null) {
                C1044Mm.d("nf_net_stats", "Network type is null, not expected! Set it to 'unknown'");
                c = "unkown";
            }
            String str2 = c;
            ahq.e(str2, l, l2, map, networkRequestType, str);
            AppVisibilityState appVisibilityState = AbstractApplicationC1040Mh.getInstance().n() ? AppVisibilityState.BACKGROUND : AppVisibilityState.FOREGROUND;
            aHN ahn = this.b.get(appVisibilityState);
            if (ahn == null) {
                ahn = new aHN(appVisibilityState.toString());
                this.b.put(appVisibilityState, ahn);
            }
            ahn.d(str2, l, l2, map, networkRequestType, str);
            e(b);
        }
    }

    @Override // o.aHH
    public void d(aHI ahi) {
        ConsolidatedLoggingSessionSpecification c = this.h.a().c("networkStats");
        if (c != null && this.i.nextInt(100) + 1 > c.getSuppressPercentagePerEvent()) {
            try {
                Logger.INSTANCE.logEvent(new DebugEvent(ahi.k()));
            } catch (JSONException e) {
                C1044Mm.b("nf_net_stats", e, "unable to send networkStats", new Object[0]);
            }
        }
    }

    private void e(Context context) {
        if (e()) {
            C1044Mm.e("nf_net_stats", "Saving network starts...");
            C8157dfA.a(context, "previous_network_stats", toString());
            C1044Mm.e("nf_net_stats", "Saving network done.");
        }
    }

    JSONObject b() {
        JSONObject jSONObject;
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.g;
            C1044Mm.a("nf_net_stats", "toJson: now: %d, startTimeInMs: %d, duration: %d", Long.valueOf(currentTimeMillis), Long.valueOf(this.g), Long.valueOf(j));
            jSONObject = new JSONObject();
            jSONObject.put(NetflixMediaDrm.PROPERTY_APP_ID, this.a);
            jSONObject.put("startTime", this.g);
            jSONObject.put("duration", j);
            JSONObject jSONObject2 = new JSONObject();
            synchronized (this.n) {
                for (Map.Entry<String, Long> entry : this.n.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("xid_bytes", jSONObject2);
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(NotificationFactory.DATA, jSONArray);
            for (aHQ ahq : this.e.values()) {
                jSONArray.put(ahq.d());
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONObject.put("app_visibility_data", jSONArray2);
            for (Map.Entry<AppVisibilityState, aHN> entry2 : this.b.entrySet()) {
                JSONObject a = entry2.getValue().a();
                a.put("state", entry2.getKey().toString());
                jSONArray2.put(a);
            }
        }
        return jSONObject;
    }

    @Override // java.lang.Enum
    public String toString() {
        try {
            return b().toString();
        } catch (Throwable th) {
            C1044Mm.b("nf_net_stats", th, "Failed to create toString!", new Object[0]);
            return "";
        }
    }

    private void b(aMF.b bVar) {
        synchronized (this) {
            if (this.l) {
                String a = bVar.h().a();
                this.a = a;
                if (C8168dfL.g(a)) {
                    C1044Mm.d("nf_net_stats", "saveAppData:: appId is still not available!");
                    return;
                }
                C1044Mm.a("nf_net_stats", "saveAppData:: appId: %s, start time in ms: %d", this.a, Long.valueOf(this.g));
                this.l = false;
            }
        }
    }

    private boolean e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.j;
        boolean z = elapsedRealtime - j > 30000;
        C1044Mm.a("nf_net_stats", "shouldSaveStats:: now: %d, lastTimeLogged: %d, save: %b", Long.valueOf(elapsedRealtime), Long.valueOf(j), Boolean.valueOf(z));
        if (z) {
            this.j = elapsedRealtime;
        }
        return z;
    }

    private static NetworkRequestType e(String str) {
        if (str.contains("/msl")) {
            return a(str);
        }
        return c(str);
    }

    private static NetworkRequestType a(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        String substring = str.substring(lastIndexOf + 1);
        C1044Mm.a("nf_net_stats", "parseMslRequestForNetworkRequestType:: last index of /: %d, type: %s", Integer.valueOf(lastIndexOf), substring);
        return NetworkRequestType.d(substring);
    }

    private static NetworkRequestType c(String str) {
        String substring;
        int lastIndexOf = str.lastIndexOf("&TAG=");
        if (lastIndexOf < 0) {
            lastIndexOf = str.lastIndexOf("?TAG=");
        }
        int lastIndexOf2 = str.lastIndexOf("&");
        if (lastIndexOf < 0) {
            return null;
        }
        if (lastIndexOf < lastIndexOf2) {
            int i = lastIndexOf + 5;
            int indexOf = str.indexOf("&", i);
            substring = str.substring(i, indexOf);
            lastIndexOf2 = indexOf;
        } else {
            substring = str.substring(lastIndexOf + 5);
        }
        C1044Mm.a("nf_net_stats", "parseWebRequestForNetworkRequestType:: last index of '[&|?]TAG=': %d, last index of delimiter: %d, type: %s", Integer.valueOf(lastIndexOf), Integer.valueOf(lastIndexOf2), substring);
        return NetworkRequestType.d(substring);
    }
}
