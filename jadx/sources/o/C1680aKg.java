package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.netflix.mediaclient.playerui.videoview.SurfaceViewErrorTracker$removeDestroyed$1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import o.C1680aKg;
import o.C8632dsu;
import o.C9737vz;
import o.aJY;

/* renamed from: o.aKg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1680aKg extends C1045Mp {
    public static final C1680aKg a = new C1680aKg();
    private static final List<c> b = new ArrayList();
    private static final HashMap<Activity, Application.ActivityLifecycleCallbacks> c = new HashMap<>();
    private static final Application.ActivityLifecycleCallbacks d = new b();

    private C1680aKg() {
        super("surfaceErrors");
    }

    /* renamed from: o.aKg$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final aJY a;
        private final C5167bte c;
        private final AbstractC1678aKe d;
        private final long e;

        public final aJY b() {
            return this.a;
        }

        public final long c() {
            return this.e;
        }

        public final AbstractC1678aKe d() {
            return this.d;
        }

        public final C5167bte e() {
            return this.c;
        }

        public c(aJY ajy, AbstractC1678aKe abstractC1678aKe, C5167bte c5167bte, long j) {
            C8632dsu.c((Object) ajy, "");
            C8632dsu.c((Object) abstractC1678aKe, "");
            C8632dsu.c((Object) c5167bte, "");
            this.a = ajy;
            this.d = abstractC1678aKe;
            this.c = c5167bte;
            this.e = j;
        }

        public final boolean a() {
            return this.e + ((long) 5000) < SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: o.aKg$b */
    /* loaded from: classes3.dex */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C8632dsu.c((Object) activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C8632dsu.c((Object) activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
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

        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C8632dsu.c((Object) activity, "");
            C1680aKg.a.d(activity);
        }
    }

    public final void a(aJY ajy, AbstractC1678aKe abstractC1678aKe, C5167bte c5167bte) {
        C8632dsu.c((Object) ajy, "");
        C8632dsu.c((Object) c5167bte, "");
        if (abstractC1678aKe != null) {
            C1680aKg c1680aKg = a;
            Context context = ajy.getContext();
            C8632dsu.a(context, "");
            Activity activity = (Activity) C9737vz.e(context, Activity.class);
            if (activity.isDestroyed() && activity.isFinishing()) {
                return;
            }
            b.add(new c(ajy, abstractC1678aKe, c5167bte, SystemClock.elapsedRealtime()));
            HashMap<Activity, Application.ActivityLifecycleCallbacks> hashMap = c;
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = d;
            if (hashMap.putIfAbsent(activity, activityLifecycleCallbacks) == null) {
                activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
            c1680aKg.b(activity);
        }
    }

    public final void b(final aJY ajy, final AbstractC1678aKe abstractC1678aKe) {
        C8632dsu.c((Object) ajy, "");
        C8632dsu.c((Object) abstractC1678aKe, "");
        C8571dqn.a(b, new drM<c, Boolean>() { // from class: com.netflix.mediaclient.playerui.videoview.SurfaceViewErrorTracker$onSurfaceAvailable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(C1680aKg.c cVar) {
                C8632dsu.c((Object) cVar, "");
                return Boolean.valueOf(C8632dsu.c(cVar.b(), aJY.this) && C8632dsu.c(cVar.d(), abstractC1678aKe));
            }
        });
    }

    public final void d(aJY ajy) {
        C8632dsu.c((Object) ajy, "");
        Context context = ajy.getContext();
        C8632dsu.a(context, "");
        b((Activity) C9737vz.e(context, Activity.class));
    }

    private final void b(Activity activity) {
        c(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Activity activity) {
        c.remove(activity);
        c(activity);
    }

    private final void c() {
        Set<Map.Entry<Activity, Application.ActivityLifecycleCallbacks>> entrySet = c.entrySet();
        final SurfaceViewErrorTracker$removeDestroyed$1 surfaceViewErrorTracker$removeDestroyed$1 = new drM<Map.Entry<Activity, Application.ActivityLifecycleCallbacks>, Boolean>() { // from class: com.netflix.mediaclient.playerui.videoview.SurfaceViewErrorTracker$removeDestroyed$1
            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(Map.Entry<Activity, Application.ActivityLifecycleCallbacks> entry) {
                C8632dsu.c((Object) entry, "");
                return Boolean.valueOf(entry.getKey().isDestroyed());
            }
        };
        entrySet.removeIf(new Predicate() { // from class: o.aKh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean c2;
                c2 = C1680aKg.c(drM.this, obj);
                return c2;
            }
        });
        C8571dqn.a(b, new drM<c, Boolean>() { // from class: com.netflix.mediaclient.playerui.videoview.SurfaceViewErrorTracker$removeDestroyed$2
            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(C1680aKg.c cVar) {
                C8632dsu.c((Object) cVar, "");
                Context context = cVar.b().getContext();
                C8632dsu.a(context, "");
                return Boolean.valueOf(((Activity) C9737vz.e(context, Activity.class)).isDestroyed());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    private final void c(Activity activity) {
        List<c> list = b;
        ArrayList<c> arrayList = new ArrayList();
        for (Object obj : list) {
            c cVar = (c) obj;
            Context context = cVar.b().getContext();
            C8632dsu.a(context, "");
            if (C8632dsu.c(C9737vz.e(context, Activity.class), activity) && cVar.a()) {
                arrayList.add(obj);
            }
        }
        b.removeAll(arrayList);
        for (c cVar2 : arrayList) {
            String c2 = cVar2.e().c();
            C8632dsu.a(c2, "");
            C8159dfC.c(new aUU(c2, SystemClock.elapsedRealtime() - cVar2.c()));
        }
        c();
    }
}
