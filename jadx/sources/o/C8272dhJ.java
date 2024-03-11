package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.NavigationLevel;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.Navigate;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.util.log.clv2.NavigationLevelManagerImpl$activityCallbackListener$1$onActivityStarted$1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.dhJ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8272dhJ implements InterfaceC1276Vl {
    public static final c d = new c(null);
    public static final int c = 8;
    private int g = -1;
    private int i = -1;
    private int f = 1;

    /* renamed from: o  reason: collision with root package name */
    private final SparseArray<ArrayList<Integer>> f13839o = new SparseArray<>();
    private final WeakHashMap<Activity, Integer> b = new WeakHashMap<>();
    private final SparseArray<LinkedList<d>> j = new SparseArray<>();
    private final HashSet<Integer> a = new HashSet<>();
    private final e e = new e();
    private a h = new a() { // from class: o.dhJ.4
        @Override // o.C8272dhJ.a
        public void c(AppView appView, CommandValue commandValue, TrackingInfo trackingInfo) {
            Logger logger = Logger.INSTANCE;
            if (logger.isDisabled()) {
                return;
            }
            logger.startSession(new Navigate(appView, null, commandValue, trackingInfo));
        }

        @Override // o.C8272dhJ.a
        public long a(AppView appView, TrackingInfo trackingInfo) {
            Map d2;
            Map k;
            Throwable th;
            Logger logger = Logger.INSTANCE;
            if (!logger.isDisabled() && appView != null) {
                Long startSession = logger.startSession(new NavigationLevel(appView, trackingInfo));
                if (startSession == null) {
                    startSession = -1L;
                }
                return startSession.longValue();
            } else if (appView == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("appView is null", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                    return -1L;
                }
                dVar.e().b(c1596aHd, th);
                return -1L;
            } else {
                return -1L;
            }
        }

        @Override // o.C8272dhJ.a
        public void e(Long l) {
            Logger logger = Logger.INSTANCE;
            if (logger.isDisabled()) {
                return;
            }
            logger.endSession(l);
        }

        @Override // o.C8272dhJ.a
        public void b() {
            if (Logger.INSTANCE.isDisabled()) {
                return;
            }
            ExtLogger.INSTANCE.endExclusiveAction("Navigate");
        }

        @Override // o.C8272dhJ.a
        public Session c(String str) {
            Logger logger = Logger.INSTANCE;
            if (logger.isDisabled()) {
                return null;
            }
            return logger.getExclusiveSession(str);
        }
    };

    /* renamed from: o.dhJ$a */
    /* loaded from: classes.dex */
    public interface a {
        long a(AppView appView, TrackingInfo trackingInfo);

        void b();

        Session c(String str);

        void c(AppView appView, CommandValue commandValue, TrackingInfo trackingInfo);

        void e(Long l);
    }

    private final void b(int i) {
        this.g = this.i;
        this.i = i;
    }

    /* renamed from: o.dhJ$c */
    /* loaded from: classes.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: o.dhJ$e */
    /* loaded from: classes.dex */
    public static final class e implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C8632dsu.c((Object) activity, "");
        }

        e() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) activity, "");
            if (activity instanceof NetflixActivity) {
                C8271dhI.c.d();
                if (!C8141del.a()) {
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity);
                    GF gf = GF.e;
                    Context baseContext = ((NetflixActivity) activity).getBaseContext();
                    C8632dsu.a(baseContext, "");
                    C8737dwr.c(lifecycleScope, gf.a(baseContext), null, new NavigationLevelManagerImpl$activityCallbackListener$1$onActivityStarted$1(activity, null), 2, null);
                }
                try {
                    C8272dhJ.this.e((NetflixActivity) activity);
                } catch (Throwable th2) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str = "SPY-13864 . " + th2.getMessage();
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(str, th2, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType.c() + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) activity, "");
            if (activity instanceof NetflixActivity) {
                try {
                    C8272dhJ.this.c((NetflixActivity) activity);
                } catch (Throwable th2) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str = "SPY-13864 . " + th2.getMessage();
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(str, th2, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType.c() + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) activity, "");
            if (activity instanceof NetflixActivity) {
                try {
                    C8272dhJ.this.b((NetflixActivity) activity);
                } catch (Throwable th2) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str = "SPY-13864 . " + th2.getMessage();
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(str, th2, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType.c() + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) activity, "");
            if (activity instanceof NetflixActivity) {
                try {
                    C8272dhJ.this.c((NetflixActivity) activity, bundle);
                } catch (Throwable th2) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str = "SPY-13864 . " + th2.getMessage();
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(str, th2, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType.c() + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) bundle, "");
            if (activity instanceof NetflixActivity) {
                try {
                    C8272dhJ.this.e((NetflixActivity) activity, bundle);
                } catch (Throwable th2) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str = "SPY-13864 . " + th2.getMessage();
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd(str, th2, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType.c() + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C8632dsu.c((Object) activity, "");
            if (activity instanceof NetflixActivity) {
                C8271dhI.c.e((NetflixActivity) activity);
            }
        }
    }

    public final void a() {
        AbstractApplicationC1040Mh.a().registerActivityLifecycleCallbacks(this.e);
    }

    private final Bundle d(int i) {
        Bundle bundle;
        synchronized (this) {
            bundle = new Bundle();
            bundle.putIntegerArrayList("BottomTabActivityIds", new ArrayList<>(this.a));
            int i2 = this.i;
            if (i2 == -1) {
                i2 = this.g;
            }
            if (i2 > -1) {
                bundle.putInt("ActivityId", i);
                ArrayList<Integer> arrayList = this.f13839o.get(i2);
                if (arrayList != null) {
                    bundle.putIntegerArrayList("TaskActivityIds", arrayList);
                    for (Number number : arrayList) {
                        int intValue = number.intValue();
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        LinkedList<d> linkedList = this.j.get(intValue);
                        if (linkedList != null) {
                            C8632dsu.d(linkedList);
                            for (d dVar : linkedList) {
                                arrayList2.add(dVar.c().name());
                            }
                        }
                        bundle.putStringArrayList(String.valueOf(intValue), arrayList2);
                    }
                }
            }
        }
        return bundle;
    }

    private final void b(Activity activity, Bundle bundle) {
        String d2;
        synchronized (this) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("TaskActivityIds");
            if (integerArrayList != null) {
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                d2 = C8576dqs.d(integerArrayList, ",", null, null, 0, null, null, 62, null);
                aVar.a("NavigationLevelManager wasRestored " + d2);
                ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("BottomTabActivityIds");
                if (integerArrayList2 != null) {
                    this.a.addAll(integerArrayList2);
                }
                this.f13839o.put(activity.getTaskId(), integerArrayList);
                for (Integer num : integerArrayList) {
                    c(activity.getTaskId(), num, bundle);
                }
            } else {
                InterfaceC1593aHa.c.a("NavigationLevelManager wasRestored but taskActivityIds was null");
            }
        }
    }

    private final void c(int i, Integer num, Bundle bundle) {
        synchronized (this) {
            C1044Mm.e("NavigationLevelManager", "restoreActivityState: " + num);
            if (num != null && num.intValue() > 0 && this.f13839o.get(i) != null) {
                if (!this.f13839o.get(i).contains(num)) {
                    this.f13839o.get(i).add(num);
                }
                if (this.j.get(num.intValue()) == null) {
                    LinkedList<d> linkedList = new LinkedList<>();
                    ArrayList<String> stringArrayList = bundle.getStringArrayList(num.toString());
                    if (stringArrayList != null) {
                        for (String str : stringArrayList) {
                            C1044Mm.e("NavigationLevelManager", "adding SessionInfo: " + str);
                            C8632dsu.d((Object) str);
                            linkedList.add(new d(AppView.valueOf(str), 0L, null, 6, null));
                        }
                    }
                    this.j.put(num.intValue(), linkedList);
                }
            } else {
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                aVar.a("NavigationLevelManager wasRestored but activityId was missing from bundle or task was missing.  activityId: " + num);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(NetflixActivity netflixActivity, Bundle bundle) {
        synchronized (this) {
            Integer num = this.b.get(netflixActivity);
            if (num != null) {
                bundle.putBundle("NavLevelManagerBundle", d(num.intValue()));
            }
        }
    }

    public final void e(NetflixActivity netflixActivity, AppView appView, TrackingInfo trackingInfo) {
        Map d2;
        Map k;
        Throwable th;
        synchronized (this) {
            C8632dsu.c((Object) netflixActivity, "");
            C8632dsu.c((Object) appView, "");
            Integer num = this.b.get(netflixActivity);
            if (num == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("addNavigationLevel() activityId not found " + netflixActivity, null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            } else {
                if (this.j.size() != 0) {
                    a(appView, null, trackingInfo);
                }
                if (this.j.get(num.intValue()) == null) {
                    this.j.put(num.intValue(), new LinkedList<>());
                }
                d dVar2 = new d(appView, this.h.a(appView, trackingInfo), trackingInfo);
                LinkedList<d> linkedList = this.j.get(num.intValue());
                if (linkedList != null) {
                    linkedList.add(dVar2);
                }
            }
            netflixActivity.startRenderNavigationLevelSession();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        r13 = o.C8579dqv.w(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: all -> 0x0220, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0015, B:7:0x001f, B:9:0x002d, B:13:0x0038, B:15:0x0046, B:17:0x004c, B:18:0x0050, B:20:0x0056, B:24:0x0065, B:37:0x0095, B:39:0x00a3, B:40:0x00a6, B:42:0x00ac, B:43:0x00c3, B:45:0x00f0, B:47:0x0101, B:48:0x011c, B:50:0x0122, B:52:0x0126, B:63:0x015c, B:65:0x0164, B:66:0x0169, B:53:0x0132, B:55:0x0138, B:56:0x0142, B:60:0x0149, B:61:0x0154, B:62:0x0155, B:25:0x0068, B:27:0x0076, B:28:0x007a, B:30:0x0080, B:34:0x008f, B:11:0x0033, B:67:0x0172, B:69:0x019f, B:71:0x01b0, B:72:0x01cb, B:74:0x01d1, B:76:0x01d5, B:87:0x020b, B:89:0x0213, B:90:0x0217, B:77:0x01e1, B:79:0x01e7, B:80:0x01f1, B:84:0x01f8, B:85:0x0203, B:86:0x0204), top: B:96:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[Catch: all -> 0x0220, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0015, B:7:0x001f, B:9:0x002d, B:13:0x0038, B:15:0x0046, B:17:0x004c, B:18:0x0050, B:20:0x0056, B:24:0x0065, B:37:0x0095, B:39:0x00a3, B:40:0x00a6, B:42:0x00ac, B:43:0x00c3, B:45:0x00f0, B:47:0x0101, B:48:0x011c, B:50:0x0122, B:52:0x0126, B:63:0x015c, B:65:0x0164, B:66:0x0169, B:53:0x0132, B:55:0x0138, B:56:0x0142, B:60:0x0149, B:61:0x0154, B:62:0x0155, B:25:0x0068, B:27:0x0076, B:28:0x007a, B:30:0x0080, B:34:0x008f, B:11:0x0033, B:67:0x0172, B:69:0x019f, B:71:0x01b0, B:72:0x01cb, B:74:0x01d1, B:76:0x01d5, B:87:0x020b, B:89:0x0213, B:90:0x0217, B:77:0x01e1, B:79:0x01e7, B:80:0x01f1, B:84:0x01f8, B:85:0x0203, B:86:0x0204), top: B:96:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.netflix.mediaclient.android.activity.NetflixActivity r11, com.netflix.cl.model.AppView r12, com.netflix.cl.model.TrackingInfo r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8272dhJ.e(com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.cl.model.AppView, com.netflix.cl.model.TrackingInfo, boolean):void");
    }

    @Override // o.InterfaceC1276Vl
    public void c() {
        synchronized (this) {
            b(this, null, null, null, 7, null);
        }
    }

    public void b() {
        synchronized (this) {
            if (this.h.c("Navigate") != null) {
                this.h.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(NetflixActivity netflixActivity, Bundle bundle) {
        Object obj;
        synchronized (this) {
            if (bundle == null) {
                int i = this.f;
                this.f = i + 1;
                while (this.b.containsValue(Integer.valueOf(i))) {
                    i = this.f;
                    this.f = i + 1;
                }
                this.b.put(netflixActivity, Integer.valueOf(i));
                if (netflixActivity.hasBottomNavBar()) {
                    this.a.add(Integer.valueOf(i));
                }
            } else {
                Bundle bundle2 = bundle.getBundle("NavLevelManagerBundle");
                if (bundle2 != null) {
                    int i2 = bundle2.getInt("ActivityId");
                    Set<Map.Entry<Activity, Integer>> entrySet = this.b.entrySet();
                    C8632dsu.a(entrySet, "");
                    Iterator<T> it = entrySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        Integer num = (Integer) ((Map.Entry) obj).getValue();
                        if (num != null && num.intValue() == i2) {
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry != null) {
                        this.b.remove(entry.getKey());
                    }
                    this.b.put(netflixActivity, Integer.valueOf(i2));
                    if (this.f13839o.get(netflixActivity.getTaskId()) == null) {
                        b(netflixActivity, bundle2);
                    } else {
                        c(netflixActivity.getTaskId(), Integer.valueOf(i2), bundle2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da A[Catch: all -> 0x0135, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0012, B:7:0x003f, B:9:0x0050, B:10:0x006b, B:12:0x0071, B:14:0x0075, B:25:0x00ab, B:27:0x00b3, B:28:0x00b7, B:15:0x0081, B:17:0x0087, B:18:0x0091, B:22:0x0098, B:23:0x00a3, B:24:0x00a4, B:31:0x00c0, B:33:0x00cf, B:38:0x00da, B:40:0x00eb, B:42:0x00f8, B:43:0x00ff, B:51:0x012d, B:44:0x0107, B:46:0x010f, B:47:0x0117, B:49:0x011d, B:50:0x0124), top: B:57:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb A[Catch: all -> 0x0135, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0012, B:7:0x003f, B:9:0x0050, B:10:0x006b, B:12:0x0071, B:14:0x0075, B:25:0x00ab, B:27:0x00b3, B:28:0x00b7, B:15:0x0081, B:17:0x0087, B:18:0x0091, B:22:0x0098, B:23:0x00a3, B:24:0x00a4, B:31:0x00c0, B:33:0x00cf, B:38:0x00da, B:40:0x00eb, B:42:0x00f8, B:43:0x00ff, B:51:0x012d, B:44:0x0107, B:46:0x010f, B:47:0x0117, B:49:0x011d, B:50:0x0124), top: B:57:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107 A[Catch: all -> 0x0135, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0012, B:7:0x003f, B:9:0x0050, B:10:0x006b, B:12:0x0071, B:14:0x0075, B:25:0x00ab, B:27:0x00b3, B:28:0x00b7, B:15:0x0081, B:17:0x0087, B:18:0x0091, B:22:0x0098, B:23:0x00a3, B:24:0x00a4, B:31:0x00c0, B:33:0x00cf, B:38:0x00da, B:40:0x00eb, B:42:0x00f8, B:43:0x00ff, B:51:0x012d, B:44:0x0107, B:46:0x010f, B:47:0x0117, B:49:0x011d, B:50:0x0124), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.netflix.mediaclient.android.activity.NetflixActivity r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8272dhJ.e(com.netflix.mediaclient.android.activity.NetflixActivity):void");
    }

    private final void e(NetflixActivity netflixActivity, int i) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.f13839o.get(netflixActivity.getTaskId());
            if (arrayList != null) {
                for (Number number : arrayList) {
                    int intValue = number.intValue();
                    if (intValue != i && this.a.contains(Integer.valueOf(intValue))) {
                        a(this, intValue, false, null, 6, null);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(NetflixActivity netflixActivity) {
        Integer num;
        Integer num2;
        Object B;
        synchronized (this) {
            if (!netflixActivity.isChangingConfigurations() && (num = this.b.get(netflixActivity)) != null) {
                if (netflixActivity.isFinishing()) {
                    a(this, num.intValue(), false, netflixActivity, 2, null);
                    d(netflixActivity, num.intValue());
                    this.b.remove(netflixActivity);
                } else {
                    ArrayList<Integer> arrayList = this.f13839o.get(netflixActivity.getTaskId());
                    if (arrayList != null) {
                        B = C8576dqs.B((List<? extends Object>) arrayList);
                        num2 = (Integer) B;
                    } else {
                        num2 = null;
                    }
                    if (C8632dsu.c(num2, num)) {
                        e(netflixActivity.getTaskId());
                        b(-1);
                    }
                }
            }
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(NetflixActivity netflixActivity) {
        synchronized (this) {
            if (netflixActivity.isChangingConfigurations()) {
                this.b.remove(netflixActivity);
            } else {
                Integer num = this.b.get(netflixActivity);
                if (num != null) {
                    a(this, num.intValue(), false, netflixActivity, 2, null);
                    d(netflixActivity, num.intValue());
                    this.b.remove(netflixActivity);
                    b();
                }
            }
        }
    }

    private final void c(int i, NetflixActivity netflixActivity) {
        synchronized (this) {
            a(netflixActivity.getTaskId());
            ArrayList<Integer> arrayList = this.f13839o.get(netflixActivity.getTaskId());
            if (arrayList != null) {
                arrayList.add(Integer.valueOf(i));
            }
            AppView uiScreen = netflixActivity.getUiScreen();
            if (uiScreen != null) {
                e(netflixActivity, uiScreen, netflixActivity.getDataContext());
            }
        }
    }

    private final void d(NetflixActivity netflixActivity, int i) {
        synchronized (this) {
            Integer num = this.b.get(netflixActivity);
            if (num != null && num.intValue() == i) {
                int size = this.f13839o.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ArrayList<Integer> valueAt = this.f13839o.valueAt(i2);
                    if (valueAt != null) {
                        valueAt.remove(Integer.valueOf(i));
                    }
                }
                this.j.remove(i);
            }
        }
    }

    private final void e(int i) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.f13839o.get(i);
            if (arrayList != null) {
                for (Number number : arrayList) {
                    a(this, number.intValue(), true, null, 4, null);
                }
            }
        }
    }

    static /* synthetic */ void a(C8272dhJ c8272dhJ, int i, boolean z, NetflixActivity netflixActivity, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            netflixActivity = null;
        }
        c8272dhJ.e(i, z, netflixActivity);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:4:0x0003, B:10:0x0010, B:12:0x001a, B:13:0x001e, B:15:0x0024, B:19:0x0034, B:20:0x0040, B:22:0x004d, B:23:0x0053), top: B:29:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(int r6, boolean r7, com.netflix.mediaclient.android.activity.NetflixActivity r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r7 != 0) goto Lf
            android.util.SparseArray<java.util.LinkedList<o.dhJ$d>> r0 = r5.j     // Catch: java.lang.Throwable -> Ld
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            if (r0 <= r1) goto Lf
            goto L10
        Ld:
            r6 = move-exception
            goto L66
        Lf:
            r1 = 0
        L10:
            android.util.SparseArray<java.util.LinkedList<o.dhJ$d>> r0 = r5.j     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> Ld
            java.util.LinkedList r6 = (java.util.LinkedList) r6     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L64
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Ld
        L1e:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L64
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> Ld
            o.dhJ$d r0 = (o.C8272dhJ.d) r0     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r0.a()     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto L1e
            if (r1 == 0) goto L4b
            if (r7 == 0) goto L40
            com.netflix.cl.model.AppView r2 = com.netflix.cl.model.AppView.appBackground     // Catch: java.lang.Throwable -> Ld
            com.netflix.cl.model.CommandValue r3 = com.netflix.cl.model.CommandValue.CloseAppCommand     // Catch: java.lang.Throwable -> Ld
            com.netflix.cl.model.TrackingInfo r4 = r0.e()     // Catch: java.lang.Throwable -> Ld
            r5.a(r2, r3, r4)     // Catch: java.lang.Throwable -> Ld
            goto L4b
        L40:
            com.netflix.cl.model.AppView r2 = com.netflix.cl.model.AppView.backButton     // Catch: java.lang.Throwable -> Ld
            com.netflix.cl.model.CommandValue r3 = com.netflix.cl.model.CommandValue.BackCommand     // Catch: java.lang.Throwable -> Ld
            com.netflix.cl.model.TrackingInfo r4 = r0.e()     // Catch: java.lang.Throwable -> Ld
            r5.a(r2, r3, r4)     // Catch: java.lang.Throwable -> Ld
        L4b:
            if (r8 == 0) goto L53
            com.netflix.mediaclient.servicemgr.IClientLogging$CompletionReason r2 = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.canceled     // Catch: java.lang.Throwable -> Ld
            r3 = 0
            r8.endRenderNavigationLevelSession(r2, r3)     // Catch: java.lang.Throwable -> Ld
        L53:
            o.dhJ$a r2 = r5.h     // Catch: java.lang.Throwable -> Ld
            long r3 = r0.b()     // Catch: java.lang.Throwable -> Ld
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Ld
            r2.e(r3)     // Catch: java.lang.Throwable -> Ld
            r0.d()     // Catch: java.lang.Throwable -> Ld
            goto L1e
        L64:
            monitor-exit(r5)
            return
        L66:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8272dhJ.e(int, boolean, com.netflix.mediaclient.android.activity.NetflixActivity):void");
    }

    private final void c(int i) {
        List w;
        Object obj;
        synchronized (this) {
            C1044Mm.e("NavigationLevelManager", "taskResumed: " + i);
            ArrayList<Integer> arrayList = this.f13839o.get(i);
            if (arrayList != null) {
                w = C8579dqv.w(arrayList);
                Iterator it = w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (this.a.contains(Integer.valueOf(((Number) obj).intValue()))) {
                        break;
                    }
                }
                Integer num = (Integer) obj;
                int intValue = num != null ? num.intValue() : -1;
                for (Number number : arrayList) {
                    int intValue2 = number.intValue();
                    if (!this.a.contains(Integer.valueOf(intValue2))) {
                        d(intValue2, true);
                    } else if (intValue2 == intValue) {
                        d(intValue2, true);
                    }
                }
            }
            b(i);
        }
    }

    static /* synthetic */ void a(C8272dhJ c8272dhJ, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        c8272dhJ.d(i, z);
    }

    private final void d(int i, boolean z) {
        synchronized (this) {
            C1044Mm.e("NavigationLevelManager", "restartAllSessionsForActivity: " + i + " isResume: " + z);
            LinkedList<d> linkedList = this.j.get(i);
            if (linkedList != null) {
                for (d dVar : linkedList) {
                    if (!dVar.a()) {
                        if (!z) {
                            b(this, null, null, null, 7, null);
                        }
                        dVar.e(this.h.a(dVar.c(), dVar.e()));
                    }
                }
            }
        }
    }

    private final void a(int i) {
        synchronized (this) {
            if (this.f13839o.indexOfKey(i) < 0) {
                this.f13839o.put(i, new ArrayList<>());
            }
        }
    }

    static /* synthetic */ void b(C8272dhJ c8272dhJ, AppView appView, CommandValue commandValue, TrackingInfo trackingInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            appView = null;
        }
        if ((i & 2) != 0) {
            commandValue = null;
        }
        if ((i & 4) != 0) {
            trackingInfo = null;
        }
        c8272dhJ.a(appView, commandValue, trackingInfo);
    }

    private final void a(AppView appView, CommandValue commandValue, TrackingInfo trackingInfo) {
        synchronized (this) {
            if (this.h.c("Navigate") == null) {
                this.h.c(appView, commandValue, trackingInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dhJ$d */
    /* loaded from: classes.dex */
    public static final class d {
        private long a;
        private AppView b;
        private TrackingInfo c;

        public final boolean a() {
            return this.a != -1;
        }

        public final long b() {
            return this.a;
        }

        public final AppView c() {
            return this.b;
        }

        public final void d() {
            this.a = -1L;
        }

        public final TrackingInfo e() {
            return this.c;
        }

        public final void e(long j) {
            this.a = j;
        }

        public d(AppView appView, long j, TrackingInfo trackingInfo) {
            C8632dsu.c((Object) appView, "");
            this.b = appView;
            this.a = j;
            this.c = trackingInfo;
        }

        public /* synthetic */ d(AppView appView, long j, TrackingInfo trackingInfo, int i, C8627dsp c8627dsp) {
            this(appView, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? null : trackingInfo);
        }
    }
}
