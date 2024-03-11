package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C8632dsu;
import o.C9694vI;
import o.C9935zP;

/* renamed from: o.zP  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9935zP {
    private final DefaultLifecycleObserver c;
    private final HashMap<Class<?>, Subject<?>> d;
    private final LifecycleOwner e;
    public static final b b = new b(null);
    private static final Map<LifecycleOwner, C9935zP> a = new LinkedHashMap();

    public /* synthetic */ C9935zP(LifecycleOwner lifecycleOwner, C8627dsp c8627dsp) {
        this(lifecycleOwner);
    }

    public static final C9935zP d(LifecycleOwner lifecycleOwner) {
        return b.d(lifecycleOwner);
    }

    public final HashMap<Class<?>, Subject<?>> b() {
        return this.d;
    }

    public final DefaultLifecycleObserver c() {
        return this.c;
    }

    private C9935zP(LifecycleOwner lifecycleOwner) {
        this.e = lifecycleOwner;
        this.d = new HashMap<>();
        this.c = new DefaultLifecycleObserver() { // from class: com.netflix.arch.EventBusFactory$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner2) {
                LifecycleOwner lifecycleOwner3;
                C8632dsu.c((Object) lifecycleOwner2, "");
                for (Map.Entry<Class<?>, Subject<?>> entry : C9935zP.this.b().entrySet()) {
                    entry.getValue().onComplete();
                }
                Map map = C9935zP.a;
                lifecycleOwner3 = C9935zP.this.e;
                map.remove(lifecycleOwner3);
                super.onDestroy(lifecycleOwner2);
            }
        };
    }

    /* renamed from: o.zP$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C9935zP d(LifecycleOwner lifecycleOwner) {
            C8632dsu.c((Object) lifecycleOwner, "");
            if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new IllegalStateException("Do not access a bus on a destroyed lifecycleOwner");
            }
            C9935zP c9935zP = (C9935zP) C9935zP.a.get(lifecycleOwner);
            if (c9935zP == null) {
                c9935zP = new C9935zP(lifecycleOwner, null);
                C9935zP.a.put(lifecycleOwner, c9935zP);
                Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.addObserver(c9935zP.c());
                }
            }
            return c9935zP;
        }
    }

    public final dwU a() {
        return LifecycleKt.getCoroutineScope(this.e.getLifecycle());
    }

    private final <T> Subject<T> c(Class<T> cls) {
        Subject<T> subject = (Subject<T>) this.d.get(cls);
        if (subject != null) {
            return subject;
        }
        Subject<T> serialized = PublishSubject.create().toSerialized();
        C8632dsu.a(serialized, "");
        this.d.put(cls, serialized);
        return serialized;
    }

    public final <T extends C9941zV> void b(Class<T> cls, T t) {
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) t, "");
        C8166dfJ.e("emitting UIComponentEvent need to happens on main thread", false, 2, null);
        c(cls).onNext(t);
    }

    public final <T extends C9941zV> Observable<T> d(Class<T> cls) {
        C8632dsu.c((Object) cls, "");
        return c(cls);
    }

    public final Observable<dpR> d() {
        Observable<dpR> subscribeOn = Observable.create(new C9694vI.d(this.e)).subscribeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(subscribeOn, "");
        return subscribeOn;
    }
}
