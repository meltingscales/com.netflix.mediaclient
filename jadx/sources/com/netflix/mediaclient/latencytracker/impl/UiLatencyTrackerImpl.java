package com.netflix.mediaclient.latencytracker.impl;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import o.C1045Mp;
import o.C1579aGn;
import o.C1580aGo;
import o.C1581aGp;
import o.C5165btc;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1573aGh;
import o.InterfaceC1574aGi;
import o.InterfaceC1575aGj;
import o.InterfaceC1576aGk;
import o.InterfaceC1659aJm;
import o.InterfaceC8358diq;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class UiLatencyTrackerImpl implements InterfaceC1573aGh {
    public static final c d = new c(null);
    private final Context a;
    private C1579aGn b;
    public AppView c;
    private boolean e;
    private boolean f;
    private final UiLatencyMarker g;
    private boolean h;
    private InterfaceC1576aGk i;
    private final InterfaceC1659aJm j;
    private UiLatencyTrackerStarterImpl k;
    private UiLatencyTrackerLogger l;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes6.dex */
    public interface UiLatencyTrackerModule {
        @Binds
        InterfaceC1573aGh d(UiLatencyTrackerImpl uiLatencyTrackerImpl);
    }

    public final UiLatencyTrackerLogger a() {
        return this.l;
    }

    public final void a(AppView appView) {
        C8632dsu.c((Object) appView, "");
        this.c = appView;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final Context b() {
        return this.a;
    }

    public final void b(boolean z) {
        this.f = z;
    }

    public final void c(boolean z) {
        this.e = z;
    }

    public final UiLatencyMarker d() {
        return this.g;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    @Inject
    public UiLatencyTrackerImpl(UiLatencyMarker uiLatencyMarker, InterfaceC1659aJm interfaceC1659aJm, Provider<UiLatencyTrackerLogger> provider, @ApplicationContext Context context) {
        C8632dsu.c((Object) uiLatencyMarker, "");
        C8632dsu.c((Object) interfaceC1659aJm, "");
        C8632dsu.c((Object) provider, "");
        C8632dsu.c((Object) context, "");
        this.g = uiLatencyMarker;
        this.j = interfaceC1659aJm;
        this.a = context;
        this.l = provider.get();
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("UiLatencyTracker");
        }
    }

    public final AppView c() {
        AppView appView = this.c;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    public InterfaceC1574aGi d(AppView appView, LifecycleOwner lifecycleOwner, InterfaceC1576aGk interfaceC1576aGk, boolean z) {
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) interfaceC1576aGk, "");
        a(appView);
        this.i = interfaceC1576aGk;
        UiLatencyTrackerLogger uiLatencyTrackerLogger = this.l;
        if (uiLatencyTrackerLogger != null) {
            uiLatencyTrackerLogger.c(appView, z);
        }
        UiLatencyTrackerStarterImpl uiLatencyTrackerStarterImpl = new UiLatencyTrackerStarterImpl(lifecycleOwner, this);
        this.k = uiLatencyTrackerStarterImpl;
        return uiLatencyTrackerStarterImpl;
    }

    @Override // o.InterfaceC1573aGh
    public InterfaceC1574aGi a(AppView appView, LifecycleOwner lifecycleOwner, InterfaceC1576aGk interfaceC1576aGk) {
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) interfaceC1576aGk, "");
        return d(appView, lifecycleOwner, interfaceC1576aGk, false);
    }

    @Override // o.InterfaceC1573aGh
    public InterfaceC1575aGj e(boolean z) {
        C1579aGn c1579aGn = new C1579aGn(this, z);
        this.b = c1579aGn;
        return c1579aGn;
    }

    public final void c(InterfaceC8358diq.c cVar) {
        C8632dsu.c((Object) cVar, "");
        if (this.h) {
            this.h = false;
            UiLatencyTrackerLogger uiLatencyTrackerLogger = this.l;
            if (uiLatencyTrackerLogger != null) {
                uiLatencyTrackerLogger.e(cVar);
            }
        }
    }

    private final boolean h() {
        return this.j.e();
    }

    public final void j() {
        UiLatencyTrackerLogger uiLatencyTrackerLogger;
        d.getLogTag();
        if (this.e || this.f || this.h || !h() || (uiLatencyTrackerLogger = this.l) == null) {
            return;
        }
        uiLatencyTrackerLogger.a();
    }

    public final void a(UiLatencyStatus uiLatencyStatus, Boolean bool, String str, Map<String, String> map) {
        C8632dsu.c((Object) uiLatencyStatus, "");
        C8632dsu.c((Object) map, "");
        d.getLogTag();
        if (this.e) {
            this.e = false;
            JSONObject put = new JSONObject((Map) map).put("status", uiLatencyStatus.d());
            if (str != null) {
                put.put("fetchStatus", str);
            }
            UiLatencyTrackerLogger uiLatencyTrackerLogger = this.l;
            if (uiLatencyTrackerLogger != null) {
                C8632dsu.d(put);
                uiLatencyTrackerLogger.c(uiLatencyStatus, bool, put);
            }
        }
    }

    public final void e(UiLatencyStatus uiLatencyStatus, String str, List<C5165btc> list) {
        C1580aGo c2;
        C8632dsu.c((Object) uiLatencyStatus, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        d.getLogTag();
        if (this.f) {
            this.f = false;
            InterfaceC1576aGk interfaceC1576aGk = this.i;
            if (interfaceC1576aGk == null) {
                C8632dsu.d("");
                interfaceC1576aGk = null;
            }
            interfaceC1576aGk.endRenderNavigationLevelSession(uiLatencyStatus.c(), null);
            JSONObject put = new JSONObject().put("reason", str);
            if (!list.isEmpty()) {
                C8632dsu.d(put);
                C1581aGp.d(put, "ttr_images", list);
            }
            UiLatencyTrackerLogger uiLatencyTrackerLogger = this.l;
            if (uiLatencyTrackerLogger != null) {
                C8632dsu.d(put);
                uiLatencyTrackerLogger.d(uiLatencyStatus, list, put);
            }
        }
        C1579aGn c1579aGn = this.b;
        if (c1579aGn == null || (c2 = c1579aGn.c()) == null) {
            return;
        }
        c2.d();
        C1579aGn c1579aGn2 = this.b;
        if (c1579aGn2 == null) {
            return;
        }
        c1579aGn2.b((C1580aGo) null);
    }
}
