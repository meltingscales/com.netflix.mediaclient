package com.netflix.mediaclient.log.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.session.NavigationLevel;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.SessionEnded;
import com.netflix.cl.util.NavigationLevelCollector;
import com.netflix.cl.util.SessionListener;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1045Mp;
import o.C1600aHh;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.C9737vz;
import o.InterfaceC1593aHa;
import o.InterfaceC1595aHc;
import o.dqE;
import org.json.JSONException;
import org.json.JSONObject;

@Singleton
/* loaded from: classes3.dex */
public final class ErrorLoggingDataCollectorImpl implements InterfaceC1595aHc {
    public static final c d = new c(null);
    private Map<String, String> a;
    private final Set<ExternalCrashReporter> b;
    private final Context c;
    private final InterfaceC1593aHa e;
    private Map<String, Integer> f;
    private WeakReference<Activity> i;
    private Map<String, Integer> j;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface CollectorModule {
        @Binds
        InterfaceC1595aHc d(ErrorLoggingDataCollectorImpl errorLoggingDataCollectorImpl);
    }

    @Override // o.InterfaceC1595aHc
    public void d(Map<String, Integer> map) {
        C8632dsu.c((Object) map, "");
        this.j = map;
    }

    @Override // o.InterfaceC1595aHc
    public void e(Map<String, Integer> map) {
        C8632dsu.c((Object) map, "");
        this.f = map;
    }

    @Inject
    public ErrorLoggingDataCollectorImpl(@ApplicationContext Context context, InterfaceC1593aHa interfaceC1593aHa, Set<ExternalCrashReporter> set) {
        Map<String, String> d2;
        Map<String, Integer> d3;
        Map<String, Integer> d4;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC1593aHa, "");
        C8632dsu.c((Object) set, "");
        this.c = context;
        this.e = interfaceC1593aHa;
        this.b = set;
        d2 = dqE.d();
        this.a = d2;
        d3 = dqE.d();
        this.f = d3;
        d4 = dqE.d();
        this.j = d4;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ErrorLoggingDataCollectorImpl");
        }
    }

    public final void b(Map<String, String> map) {
        C8632dsu.c((Object) map, "");
        this.a = map;
        NavigationLevelCollector.INSTANCE.initListener();
        ((Application) C9737vz.e(this.c, Application.class)).registerActivityLifecycleCallbacks(new e());
        Logger.INSTANCE.addSessionListeners(new b());
    }

    public final JSONObject c(Throwable th) {
        C8632dsu.c((Object) th, "");
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.a.entrySet()) {
                C1600aHh.b(jSONObject, entry.getKey(), entry.getValue());
            }
            NavigationLevelCollector navigationLevelCollector = NavigationLevelCollector.INSTANCE;
            NavigationLevel currentNavigationLevel = navigationLevelCollector.getCurrentNavigationLevel();
            jSONObject.put("navigationLevel", currentNavigationLevel != null ? currentNavigationLevel.getView() : null);
            C1600aHh.b(jSONObject, "abTest", c());
            C1600aHh.b(jSONObject, "appClass", b(th));
            WeakReference<Activity> weakReference = this.i;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity != null) {
                if (activity.isFinishing()) {
                    jSONObject.put("finishing", true);
                }
                if (activity.isDestroyed()) {
                    jSONObject.put("destroyed", true);
                }
                jSONObject.put("activity", activity.getClass().getName());
            }
            C1600aHh.b(jSONObject, "navigationLevelLastTenAsc", navigationLevelCollector.buildNavigationLevelsString());
            C1600aHh.b(jSONObject, "breadcrumbs", a());
        } catch (JSONException unused) {
            d.getLogTag();
        }
        return jSONObject;
    }

    public final JSONObject d(Throwable th) {
        C8632dsu.c((Object) th, "");
        JSONObject c2 = c(th);
        try {
            WeakReference<Activity> weakReference = this.i;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity != null) {
                c2.put("orientation", activity.getResources().getConfiguration().orientation);
                c2.put("screenHeightDp", activity.getResources().getConfiguration().screenHeightDp);
                c2.put("screenWidthDp", activity.getResources().getConfiguration().screenWidthDp);
                c2.put("densityDpi", activity.getResources().getConfiguration().densityDpi);
            }
        } catch (JSONException unused) {
            d.getLogTag();
        }
        return c2;
    }

    private final String a() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.e.a()) {
            sb.append(str);
            sb.append(";");
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    private final String b(Throwable th) {
        boolean i;
        boolean i2;
        StackTraceElement[] stackTrace = th.getStackTrace();
        C8632dsu.a(stackTrace, "");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            C8632dsu.a(className, "");
            i = C8691duz.i(className, "com.netflix", false, 2, null);
            if (i) {
                String className2 = stackTraceElement.getClassName();
                C8632dsu.a(className2, "");
                i2 = C8691duz.i(className2, "com.netflix.mediaclient.log", false, 2, null);
                if (!i2) {
                    return stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber();
                }
            }
        }
        return null;
    }

    private final String c() {
        Map e2;
        StringBuilder sb = new StringBuilder();
        e2 = dqE.e((Map) this.f, (Map) this.j);
        for (Map.Entry entry : e2.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(((Number) entry.getValue()).intValue());
            sb.append(",");
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    /* loaded from: classes3.dex */
    final class b implements SessionListener {
        public b() {
        }

        @Override // com.netflix.cl.util.SessionListener
        public void onStartSession(Session session) {
            C8632dsu.c((Object) session, "");
            if (session instanceof NavigationLevel) {
                ErrorLoggingDataCollectorImpl.this.e.d(String.valueOf(((NavigationLevel) session).getView()));
                for (ExternalCrashReporter externalCrashReporter : ErrorLoggingDataCollectorImpl.this.b) {
                    externalCrashReporter.d("navigationLevelLastTenAsc", NavigationLevelCollector.INSTANCE.buildNavigationLevelsString());
                }
            }
        }

        @Override // com.netflix.cl.util.SessionListener
        public void onEndSession(Session session, SessionEnded sessionEnded) {
            C8632dsu.c((Object) session, "");
            C8632dsu.c((Object) sessionEnded, "");
            if (session instanceof NavigationLevel) {
                NavigationLevelCollector.INSTANCE.getAppViews().removeLastOccurrence(session);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class e implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C8632dsu.c((Object) activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C8632dsu.c((Object) activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C8632dsu.c((Object) activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) bundle, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C8632dsu.c((Object) activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C8632dsu.c((Object) activity, "");
        }

        public e() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C8632dsu.c((Object) activity, "");
            ErrorLoggingDataCollectorImpl.this.i = new WeakReference(activity);
        }
    }
}
