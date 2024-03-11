package com.netflix.mediaclient.latencytracker.impl;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C5165btc;
import o.C8166dfJ;
import o.C8569dql;
import o.C8632dsu;
import o.InterfaceC1574aGi;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class UiLatencyTrackerStarterImpl implements InterfaceC1574aGi, DefaultLifecycleObserver {
    private final UiLatencyTrackerImpl c;
    private JSONObject e;

    public UiLatencyTrackerStarterImpl(LifecycleOwner lifecycleOwner, UiLatencyTrackerImpl uiLatencyTrackerImpl) {
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) uiLatencyTrackerImpl, "");
        this.c = uiLatencyTrackerImpl;
        this.e = new JSONObject();
        lifecycleOwner.getLifecycle().addObserver(this);
        this.e.put("uiId", uiLatencyTrackerImpl.c().name());
    }

    @Override // o.InterfaceC1574aGi
    public InterfaceC1574aGi e(boolean z) {
        this.e.put("isColdStart", z);
        return this;
    }

    @Override // o.InterfaceC1574aGi
    public InterfaceC1574aGi a(boolean z) {
        this.e.put("isFirstLaunch", z);
        return this;
    }

    @Override // o.InterfaceC1574aGi
    public InterfaceC1574aGi c(String str) {
        C8632dsu.c((Object) str, "");
        this.e.put("navigationSource", str);
        return this;
    }

    @Override // o.InterfaceC1574aGi
    public InterfaceC1574aGi b() {
        JSONObject e = this.c.d().e();
        Iterator keys = e.keys();
        C8632dsu.a(keys, "");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            this.e.put(str, e.get(str));
        }
        return this;
    }

    @Override // o.InterfaceC1574aGi
    public void a() {
        C8166dfJ.e(null, false, 3, null);
        UiLatencyTrackerImpl.d.getLogTag();
        UiLatencyTrackerLogger a = this.c.a();
        if (a != null) {
            a.e();
        }
        this.c.c(true);
        this.c.b(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        List<C5165btc> i;
        C8632dsu.c((Object) lifecycleOwner, "");
        UiLatencyTrackerImpl.d.getLogTag();
        if (this.c.e() || this.c.f()) {
            UiLatencyTrackerImpl uiLatencyTrackerImpl = this.c;
            UiLatencyStatus uiLatencyStatus = UiLatencyStatus.b;
            Map<String, String> emptyMap = Collections.emptyMap();
            C8632dsu.a(emptyMap, "");
            uiLatencyTrackerImpl.a(uiLatencyStatus, null, "UI Stopped", emptyMap);
            UiLatencyTrackerImpl uiLatencyTrackerImpl2 = this.c;
            i = C8569dql.i();
            uiLatencyTrackerImpl2.e(uiLatencyStatus, "UI Stopped", i);
            this.c.j();
        }
        super.onStop(lifecycleOwner);
    }
}
