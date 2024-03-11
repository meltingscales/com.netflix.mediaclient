package com.netflix.mediaclient.latencytracker.impl;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppStartType;
import com.netflix.cl.model.AppTtrArgs;
import com.netflix.cl.model.AppTtrEvent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.LolomoTtrArgs;
import com.netflix.cl.model.LolomoTtrEvent;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.cl.model.NetflixTraceEventTypeTiming;
import com.netflix.cl.model.NetflixTraceStatus;
import com.netflix.cl.model.TimingEventArgs;
import com.netflix.cl.model.TraceEventFormatTypeX;
import com.netflix.cl.model.TtrOrTtiEvent;
import com.netflix.cl.model.event.discrete.AppTtr;
import com.netflix.cl.model.event.discrete.LolomoTtr;
import com.netflix.cl.model.event.discrete.PerformanceTraceReported;
import com.netflix.cl.model.event.discrete.PerformanceTraceTtr;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.latencytracker.api.UiLatencyMarker;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import o.C1045Mp;
import o.C1587aGv;
import o.C1665aJs;
import o.C5165btc;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8358diq;
import o.InterfaceC8598drn;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class UiLatencyTrackerLogger {
    private AppView b;
    private final C1587aGv c;
    private boolean e;
    private TraceType f;
    private Long g;
    private C1665aJs h;
    private final UiLatencyMarker i;
    private final EnumSet<AppView> j;
    public static final e d = new e(null);
    private static boolean a = true;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[TraceType.values().length];
            try {
                iArr[TraceType.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TraceType.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TraceType.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
            int[] iArr2 = new int[ImageLoader.AssetLocationType.values().length];
            try {
                iArr2[ImageLoader.AssetLocationType.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ImageLoader.AssetLocationType.DISKCACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageLoader.AssetLocationType.MEMCACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageLoader.AssetLocationType.PLACEHOLDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr2;
        }
    }

    @Inject
    public UiLatencyTrackerLogger(UiLatencyMarker uiLatencyMarker, C1587aGv c1587aGv) {
        C8632dsu.c((Object) uiLatencyMarker, "");
        C8632dsu.c((Object) c1587aGv, "");
        this.i = uiLatencyMarker;
        this.c = c1587aGv;
        this.j = EnumSet.of(AppView.browseTitles, AppView.browseTitlesGallery);
        this.h = new C1665aJs(0L, null, false, null, 14, null);
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean a() {
            return false;
        }

        private e() {
            super("UiLatencyTracker-logger");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    static final class TraceType {
        private static final /* synthetic */ InterfaceC8598drn c;
        private static final /* synthetic */ TraceType[] d;
        public static final TraceType a = new TraceType("APP_TTR", 0);
        public static final TraceType b = new TraceType("LOLOMO_TTR", 1);
        public static final TraceType e = new TraceType("GENERIC_TTR", 2);

        private static final /* synthetic */ TraceType[] a() {
            return new TraceType[]{a, b, e};
        }

        public static TraceType valueOf(String str) {
            return (TraceType) Enum.valueOf(TraceType.class, str);
        }

        public static TraceType[] values() {
            return (TraceType[]) d.clone();
        }

        private TraceType(String str, int i) {
        }

        static {
            TraceType[] a2 = a();
            d = a2;
            c = C8600drp.e(a2);
        }
    }

    public final void c(AppView appView, boolean z) {
        TraceType traceType;
        C8632dsu.c((Object) appView, "");
        this.b = appView;
        boolean z2 = a;
        if (z2) {
            a = false;
            c();
        }
        this.e = z;
        if (z2) {
            traceType = TraceType.a;
        } else {
            traceType = this.j.contains(appView) ? TraceType.b : TraceType.e;
        }
        this.f = traceType;
    }

    public final void e() {
        this.g = Long.valueOf(this.h.a());
        TraceType traceType = this.f;
        TraceType traceType2 = null;
        if (traceType == null) {
            C8632dsu.d("");
            traceType = null;
        }
        if (traceType == TraceType.b) {
            this.i.b(UiLatencyMarker.Mark.LOLOMO_PREPARE_START);
            return;
        }
        TraceType traceType3 = this.f;
        if (traceType3 == null) {
            C8632dsu.d("");
        } else {
            traceType2 = traceType3;
        }
        if (traceType2 == TraceType.e) {
            this.i.b(UiLatencyMarker.Mark.PREPARE_START);
        }
    }

    public final void c(UiLatencyStatus uiLatencyStatus, Boolean bool, JSONObject jSONObject) {
        AppView appView;
        C8632dsu.c((Object) uiLatencyStatus, "");
        C8632dsu.c((Object) jSONObject, "");
        AppView appView2 = this.b;
        if (appView2 == null) {
            C8632dsu.d("");
            appView = null;
        } else {
            appView = appView2;
        }
        TimingEventArgs timingEventArgs = new TimingEventArgs(null, null, bool, appView, uiLatencyStatus.e(), jSONObject);
        Long l = this.g;
        if (l != null) {
            long longValue = l.longValue();
            this.h.d(new TtrOrTtiEvent(timingEventArgs, Long.valueOf(this.h.a() - longValue), NetflixTraceCategory.combo, "tti", TraceEventFormatTypeX.X, NetflixTraceEventTypeTiming.timing, Long.valueOf(longValue)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void d(UiLatencyStatus uiLatencyStatus, List<C5165btc> list, JSONObject jSONObject) {
        C8632dsu.c((Object) uiLatencyStatus, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) jSONObject, "");
        this.c.b(uiLatencyStatus, list);
        a(this.h, list);
        TraceType traceType = this.f;
        if (traceType == null) {
            C8632dsu.d("");
            traceType = null;
        }
        int i = a.d[traceType.ordinal()];
        if (i == 1) {
            a(uiLatencyStatus, jSONObject);
        } else if (i == 2) {
            c(uiLatencyStatus, jSONObject);
        } else if (i != 3) {
        } else {
            d(uiLatencyStatus, jSONObject);
        }
    }

    public final void e(InterfaceC8358diq.c cVar) {
        C8632dsu.c((Object) cVar, "");
        this.c.a(cVar);
    }

    public final void a() {
        if (ConfigFastPropertyFeatureControlConfig.Companion.z()) {
            C1665aJs.e(this.h, "newFragmentTtrInfo", this.c.c(), (NetflixTraceCategory) null, (Long) null, (AppView) null, 28, (Object) null);
        }
        PerformanceTraceReported d2 = this.h.d(new d());
        d.a();
        Logger.INSTANCE.logEvent(d2);
    }

    /* loaded from: classes3.dex */
    public static final class d implements C1665aJs.d {

        /* loaded from: classes3.dex */
        public final /* synthetic */ class c {
            public static final /* synthetic */ int[] d;

            static {
                int[] iArr = new int[TraceType.values().length];
                try {
                    iArr[TraceType.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TraceType.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TraceType.e.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                d = iArr;
            }
        }

        d() {
        }

        @Override // o.C1665aJs.d
        public PerformanceTraceReported d(JSONObject jSONObject, Long l, long j) {
            C8632dsu.c((Object) jSONObject, "");
            TraceType traceType = UiLatencyTrackerLogger.this.f;
            if (traceType == null) {
                C8632dsu.d("");
                traceType = null;
            }
            int i = c.d[traceType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new PerformanceTraceTtr(jSONObject, l, Long.valueOf(j));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return new LolomoTtr(jSONObject, l, Long.valueOf(j));
            }
            return new AppTtr(jSONObject, l, Long.valueOf(j));
        }
    }

    private final void a(UiLatencyStatus uiLatencyStatus, JSONObject jSONObject) {
        d();
        AppStartType appStartType = AppStartType.cold;
        AppView appView = this.b;
        if (appView == null) {
            C8632dsu.d("");
            appView = null;
        }
        AppTtrArgs appTtrArgs = new AppTtrArgs(null, null, null, appStartType, appView, uiLatencyStatus.e(), jSONObject);
        long micros = TimeUnit.MILLISECONDS.toMicros(NetflixApplication.getInstance().g());
        long a2 = this.h.a();
        this.h.d(new AppTtrEvent(appTtrArgs, Long.valueOf(a2 - micros), NetflixTraceCategory.combo, "ttr", TraceEventFormatTypeX.X, NetflixTraceEventTypeTiming.timing, Long.valueOf(micros)));
    }

    private final void c(UiLatencyStatus uiLatencyStatus, JSONObject jSONObject) {
        d();
        b();
        AppView appView = this.b;
        if (appView == null) {
            C8632dsu.d("");
            appView = null;
        }
        LolomoTtrArgs lolomoTtrArgs = new LolomoTtrArgs(null, null, null, appView, uiLatencyStatus.e(), Boolean.valueOf(this.e), jSONObject);
        Long l = this.g;
        if (l != null) {
            long longValue = l.longValue();
            long a2 = this.h.a();
            this.h.d(new LolomoTtrEvent(lolomoTtrArgs, Long.valueOf(a2 - longValue), NetflixTraceCategory.combo, "ttr", TraceEventFormatTypeX.X, NetflixTraceEventTypeTiming.timing, Long.valueOf(longValue)));
            this.e = false;
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void d(UiLatencyStatus uiLatencyStatus, JSONObject jSONObject) {
        d();
        AppView appView = this.b;
        if (appView == null) {
            C8632dsu.d("");
            appView = null;
        }
        TimingEventArgs timingEventArgs = new TimingEventArgs(null, null, null, appView, uiLatencyStatus.e(), jSONObject);
        Long l = this.g;
        if (l != null) {
            long longValue = l.longValue();
            long a2 = this.h.a();
            this.h.d(new TtrOrTtiEvent(timingEventArgs, Long.valueOf(a2 - longValue), NetflixTraceCategory.combo, "ttr", TraceEventFormatTypeX.X, NetflixTraceEventTypeTiming.timing, Long.valueOf(longValue)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void c() {
        UiLatencyMarker.Mark mark = UiLatencyMarker.Mark.APP_ON_CREATE_START;
        UiLatencyMarker.Mark mark2 = UiLatencyMarker.Mark.APP_ON_CREATE_END;
        d(this, "AppCreate", mark, mark2, null, 8, null);
        d(this, "CrashReporterInitialization", UiLatencyMarker.Mark.INIT_CRASH_REPORTER_START, UiLatencyMarker.Mark.INIT_CRASH_REPORTER_END, null, 8, null);
        d(this, "FastPropertiesInitialization", UiLatencyMarker.Mark.INIT_FP_START, UiLatencyMarker.Mark.INIT_FP_END, null, 8, null);
        d(this, "ABTestsRegister", UiLatencyMarker.Mark.REGISTER_TESTS_START, UiLatencyMarker.Mark.REGISTER_TESTS_END, null, 8, null);
        d(this, "NonmemberABTestsRegister", UiLatencyMarker.Mark.REGISTER_NONMEMBER_TESTS_START, UiLatencyMarker.Mark.REGISTER_NONMEMBER_TESTS_END, null, 8, null);
        d(this, "LookupRegister", UiLatencyMarker.Mark.REGISTER_LOOKUP_START, UiLatencyMarker.Mark.REGISTER_LOOKUP_END, null, 8, null);
        d(this, "StartupListeners", UiLatencyMarker.Mark.APP_LISTENER_START, UiLatencyMarker.Mark.APP_LISTENER_END, null, 8, null);
        UiLatencyMarker.Mark mark3 = UiLatencyMarker.Mark.LAUNCH_ACTIVITY_CREATE;
        d(this, "SplashScreenCreate", mark2, mark3, null, 8, null);
        UiLatencyMarker.Mark mark4 = UiLatencyMarker.Mark.LAUNCH_ACTIVITY_READY;
        d(this, "ServiceInitialization", mark3, mark4, null, 8, null);
        a("LanguageInstall", UiLatencyMarker.Mark.LANGUAGE_INSTALL_START, UiLatencyMarker.Mark.LANGUAGE_INSTALL_END, NetflixTraceCategory.cloud);
        d(this, "ProfileGateCreate", mark4, UiLatencyMarker.Mark.PROFILE_SELECTION_ACTIVITY_CREATE, null, 8, null);
    }

    private final void b() {
        UiLatencyMarker.Mark mark = UiLatencyMarker.Mark.LOLOMO_PREPARE_START;
        UiLatencyMarker.Mark mark2 = UiLatencyMarker.Mark.LOLOMO_PREPARE_END;
        NetflixTraceCategory netflixTraceCategory = NetflixTraceCategory.device;
        a("LolomoPrepare", mark, mark2, netflixTraceCategory);
        a("LolomoQueued", UiLatencyMarker.Mark.LOLOMO_QUEUED_START, UiLatencyMarker.Mark.LOLOMO_QUEUED_END, netflixTraceCategory);
        a("LolomoBeforeFetch", UiLatencyMarker.Mark.LOLOMO_BEFORE_FETCH_START, UiLatencyMarker.Mark.LOLOMO_BEFORE_FETCH_END, netflixTraceCategory);
        a("LolomoFetchCache", UiLatencyMarker.Mark.LOLOMO_CACHE_START, UiLatencyMarker.Mark.LOLOMO_CACHE_END, netflixTraceCategory);
        UiLatencyMarker.Mark mark3 = UiLatencyMarker.Mark.LOLOMO_NETWORK_START;
        UiLatencyMarker.Mark mark4 = UiLatencyMarker.Mark.LOLOMO_NETWORK_END;
        NetflixTraceCategory netflixTraceCategory2 = NetflixTraceCategory.cloud;
        a("LolomoNetwork", mark3, mark4, netflixTraceCategory2);
        a("LolomoProcessResponse", UiLatencyMarker.Mark.LOLOMO_PROCESSING_START, UiLatencyMarker.Mark.LOLOMO_PROCESSING_END, netflixTraceCategory);
        a("LomosFetchCache", UiLatencyMarker.Mark.LOMOS_CACHE_START, UiLatencyMarker.Mark.LOMOS_CACHE_END, netflixTraceCategory);
        a("LomosNetwork", UiLatencyMarker.Mark.LOMOS_NETWORK_START, UiLatencyMarker.Mark.LOMOS_NETWORK_END, netflixTraceCategory2);
        a("LomosProcessResponse", UiLatencyMarker.Mark.LOMOS_PROCESSING_START, UiLatencyMarker.Mark.LOMOS_PROCESSING_END, netflixTraceCategory);
    }

    private final void d() {
        UiLatencyMarker.Mark mark = UiLatencyMarker.Mark.PREPARE_START;
        UiLatencyMarker.Mark mark2 = UiLatencyMarker.Mark.PREPARE_END;
        NetflixTraceCategory netflixTraceCategory = NetflixTraceCategory.device;
        a("Prepare", mark, mark2, netflixTraceCategory);
        a("Queued", UiLatencyMarker.Mark.QUEUED_START, UiLatencyMarker.Mark.QUEUED_END, netflixTraceCategory);
        a("Cache", UiLatencyMarker.Mark.CACHE_START, UiLatencyMarker.Mark.CACHE_END, netflixTraceCategory);
        a("Network", UiLatencyMarker.Mark.NETWORK_START, UiLatencyMarker.Mark.NETWORK_END, NetflixTraceCategory.cloud);
        a("ProcessResponse", UiLatencyMarker.Mark.PROCESSING_START, UiLatencyMarker.Mark.PROCESSING_END, netflixTraceCategory);
    }

    static /* synthetic */ void d(UiLatencyTrackerLogger uiLatencyTrackerLogger, String str, UiLatencyMarker.Mark mark, UiLatencyMarker.Mark mark2, NetflixTraceCategory netflixTraceCategory, int i, Object obj) {
        if ((i & 8) != 0) {
            netflixTraceCategory = NetflixTraceCategory.device;
        }
        uiLatencyTrackerLogger.a(str, mark, mark2, netflixTraceCategory);
    }

    private final void a(String str, UiLatencyMarker.Mark mark, UiLatencyMarker.Mark mark2, NetflixTraceCategory netflixTraceCategory) {
        Long b = b(mark);
        Long b2 = b(mark2);
        if (b == null || b2 == null) {
            return;
        }
        this.h.e(str, b.longValue(), b2.longValue() - b.longValue(), (r28 & 8) != 0 ? NetflixTraceCategory.device : netflixTraceCategory, (r28 & 16) != 0 ? NetflixTraceStatus.success : null, (r28 & 32) != 0 ? null : null, (r28 & 64) != 0 ? null : null, (r28 & 128) != 0 ? null : null, (r28 & JSONzip.end) != 0 ? null : null, (r28 & 512) != 0 ? null : null);
    }

    private final Long b(UiLatencyMarker.Mark mark) {
        Long c = this.i.c(mark);
        if (c != null) {
            return Long.valueOf(TimeUnit.MILLISECONDS.toMicros(c.longValue()));
        }
        return null;
    }

    private final void a(C1665aJs c1665aJs, List<C5165btc> list) {
        int i = 0;
        for (C5165btc c5165btc : list) {
            String str = "imageRequest_" + i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c1665aJs.e(str, timeUnit.toMicros(c5165btc.b()), timeUnit.toMicros(c5165btc.d() - c5165btc.b()), (r28 & 8) != 0 ? NetflixTraceCategory.device : a(c5165btc.e()), (r28 & 16) != 0 ? NetflixTraceStatus.success : c5165btc.c() != null ? NetflixTraceStatus.fail : NetflixTraceStatus.success, (r28 & 32) != 0 ? null : null, (r28 & 64) != 0 ? null : null, (r28 & 128) != 0 ? null : Boolean.valueOf(c5165btc.e() != ImageLoader.AssetLocationType.NETWORK), (r28 & JSONzip.end) != 0 ? null : null, (r28 & 512) != 0 ? null : null);
            i++;
        }
    }

    private final NetflixTraceCategory a(ImageLoader.AssetLocationType assetLocationType) {
        int i = assetLocationType == null ? -1 : a.a[assetLocationType.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return NetflixTraceCategory.device;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return NetflixTraceCategory.device;
                }
                return NetflixTraceCategory.device;
            }
            return NetflixTraceCategory.cdn;
        }
        return NetflixTraceCategory.device;
    }
}
