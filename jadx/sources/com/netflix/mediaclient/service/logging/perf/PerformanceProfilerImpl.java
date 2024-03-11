package com.netflix.mediaclient.service.logging.perf;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.Event;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.event.session.DebugSession;
import com.netflix.cl.model.event.session.DebugSessionEnded;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PerfProfilerDebugEventLoggingSampling;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PerfProfilerDebugSessionLoggingSampling;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.C1044Mm;
import o.C1071Np;
import o.C1079Nx;
import o.C1332Xp;
import o.C1988aVs;
import o.C1993aVx;
import o.C8166dfJ;
import o.C8196dfn;
import o.InterfaceC1985aVp;
import org.json.JSONObject;

/* loaded from: classes.dex */
public enum PerformanceProfilerImpl implements InterfaceC1985aVp {
    INSTANCE;
    
    private final ConcurrentHashMap<Long, C1988aVs> c = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Sessions, List<c>> b = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public interface c {
        void c(Sessions sessions, C1988aVs c1988aVs);

        void e(Sessions sessions, C1988aVs c1988aVs);
    }

    private static void c(String str, Event event) {
    }

    private void d() {
    }

    public void e(Activity activity) {
    }

    PerformanceProfilerImpl() {
    }

    private void c(Sessions sessions, C1988aVs c1988aVs) {
        List<c> list = this.b.get(sessions);
        if (list != null) {
            for (c cVar : list) {
                cVar.c(sessions, c1988aVs);
            }
        }
    }

    private void a(Sessions sessions, C1988aVs c1988aVs) {
        List<c> list = this.b.get(sessions);
        if (list != null) {
            for (c cVar : list) {
                cVar.e(sessions, c1988aVs);
            }
        }
    }

    public void a() {
        synchronized (this.c) {
            for (C1988aVs c1988aVs : this.c.values()) {
                Logger.INSTANCE.cancelSession(Long.valueOf(c1988aVs.e.getSessionId()));
            }
            this.c.clear();
        }
        for (List<c> list : this.b.values()) {
            if (list != null) {
                list.clear();
            }
        }
        this.b.clear();
    }

    public void d(Events events, Map<String, String> map) {
        if (Config_FastProperty_PerfProfilerDebugEventLoggingSampling.Companion.b()) {
            DebugEvent debugEvent = new DebugEvent(b(events, map));
            Logger.INSTANCE.logEvent(debugEvent);
            c("discreteEvent CLV2: ", debugEvent);
        }
    }

    public void c(Sessions sessions, Map<String, String> map) {
        if (c(sessions)) {
            C1988aVs b = C1988aVs.b(sessions, map);
            Logger.INSTANCE.startSession(b.e);
            c("startSession CLV2: ", b.e);
            long id = b.e.getId();
            c(sessions.name(), Integer.valueOf((int) id));
            synchronized (this.c) {
                this.c.put(Long.valueOf(id), b);
            }
            c(sessions, b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[Sessions.values().length];
            e = iArr;
            try {
                iArr[Sessions.NETFLIX_SERVICE_LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[Sessions.CONFIG_AGENT_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[Sessions.USER_AGENT_LOADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[Sessions.FALKOR_AGENT_LOADED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[Sessions.RESOURCE_FETCHER_LOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[Sessions.LOGGING_AGENT_LOADED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private boolean c(Sessions sessions) {
        switch (AnonymousClass3.e[sessions.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return c();
            default:
                return true;
        }
    }

    @Override // o.InterfaceC1985aVp
    public void d(Sessions sessions) {
        c(sessions, (Map<String, String>) null);
    }

    public void b(Sessions sessions, Map<String, String> map, Long l) {
        if (l != null && this.c.containsKey(l)) {
            C1988aVs c1988aVs = this.c.get(l);
            if (c1988aVs != null) {
                DebugSession debugSession = c1988aVs.e;
                if (debugSession != null) {
                    DebugSessionEnded debugSessionEnded = new DebugSessionEnded(debugSession, b(sessions, map));
                    c1988aVs.c = debugSessionEnded;
                    Logger.INSTANCE.endSession(debugSessionEnded);
                    c("endSession CLV2: ", debugSessionEnded);
                }
                if (sessions.name().contains("TT")) {
                    C1044Mm.b("PerformanceProfilerImpl", "%s = %s", sessions.name(), Long.valueOf(c1988aVs.c.getDurationInMs()));
                }
                a(sessions, c1988aVs);
                return;
            }
            return;
        }
        C1044Mm.a("PerformanceProfilerImpl", "Couldn't find the SessionStartedEvent");
    }

    @Override // o.InterfaceC1985aVp
    public void d(Sessions sessions, Map<String, String> map) {
        synchronized (this.c) {
            for (C1988aVs c1988aVs : this.c.values()) {
                if (c1988aVs.c == null && c1988aVs.a.equals(sessions.name())) {
                    long id = c1988aVs.e.getId();
                    d(sessions.name(), Integer.valueOf((int) id));
                    b(sessions, map, Long.valueOf(id));
                }
            }
        }
    }

    @Override // o.InterfaceC1985aVp
    public void a(Sessions sessions) {
        d(sessions, (Map<String, String>) null);
    }

    public void b() {
        synchronized (this) {
            C1044Mm.a("PerformanceProfilerImpl", "flush...");
            d();
            Iterator<C1988aVs> it = this.c.values().iterator();
            while (it.hasNext()) {
                if (it.next().c()) {
                    it.remove();
                }
            }
        }
    }

    @Override // o.InterfaceC1985aVp
    public boolean c() {
        return Config_FastProperty_PerfProfilerDebugSessionLoggingSampling.Companion.c();
    }

    public static void c(String str, Integer num) {
        if (Build.VERSION.SDK_INT < 29 || !C1993aVx.e((Context) C1332Xp.b(Context.class))) {
            return;
        }
        Trace.beginAsyncSection(str, num.intValue());
    }

    public static void d(String str, Integer num) {
        if (Build.VERSION.SDK_INT < 29 || !C1993aVx.e((Context) C1332Xp.b(Context.class))) {
            return;
        }
        Trace.endAsyncSection(str, num.intValue());
    }

    public static void d(final int i) {
        if (C8166dfJ.a()) {
            new C1071Np().d(new C1079Nx.b() { // from class: o.aVo
                @Override // o.C1079Nx.b
                public final void run() {
                    PerformanceProfilerImpl.a(i);
                }
            });
        } else {
            a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(int i) {
        Map<String, String> b = C8196dfn.b(i);
        PerformanceProfilerImpl performanceProfilerImpl = INSTANCE;
        performanceProfilerImpl.d(Events.APP_TRIM_MEMORY, b);
        performanceProfilerImpl.b();
    }

    public static JSONObject b(Enum r2, Map<String, String> map) {
        JSONObject jSONObject = null;
        if (map != null) {
            if (map.size() > 0) {
                jSONObject = new JSONObject((Map) map);
                jSONObject.put("name", r2.name());
                return jSONObject;
            }
        }
        jSONObject = new JSONObject();
        jSONObject.put("name", r2.name());
        return jSONObject;
    }

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes.dex */
    public static class ProfilerModule {
        @Provides
        public static InterfaceC1985aVp a() {
            return PerformanceProfilerImpl.INSTANCE;
        }
    }
}
