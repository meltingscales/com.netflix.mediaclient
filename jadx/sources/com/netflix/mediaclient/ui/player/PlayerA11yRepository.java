package com.netflix.mediaclient.ui.player;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.ui.player.PlayerA11yRepository;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.LazyThreadSafetyMode;
import o.C7485cxB;
import o.C7533cxx;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class PlayerA11yRepository implements DefaultLifecycleObserver {
    private final BehaviorSubject<Integer> a;
    private final InterfaceC8554dpx c;
    private final InterfaceC8554dpx d;
    private final drO<Context> e;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerA11yRepository(drO<? extends Context> dro, LifecycleOwner lifecycleOwner) {
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        this.e = dro;
        lifecycleOwner.getLifecycle().addObserver(this);
        BehaviorSubject<Integer> create = BehaviorSubject.create();
        C8632dsu.a(create, "");
        this.a = create;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        b = dpB.b(lazyThreadSafetyMode, new PlayerA11yRepository$listener$2(this));
        this.c = b;
        b2 = dpB.b(lazyThreadSafetyMode, new PlayerA11yRepository$touchExplorationListener$2(this));
        this.d = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessibilityManager a() {
        Context invoke = this.e.invoke();
        Object systemService = invoke != null ? invoke.getSystemService("accessibility") : null;
        if (systemService instanceof AccessibilityManager) {
            return (AccessibilityManager) systemService;
        }
        return null;
    }

    private final AccessibilityManager.AccessibilityServicesStateChangeListener c() {
        return C7533cxx.c(this.c.getValue());
    }

    private final AccessibilityManager.TouchExplorationStateChangeListener d() {
        return (AccessibilityManager.TouchExplorationStateChangeListener) this.d.getValue();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        int c;
        C8632dsu.c((Object) lifecycleOwner, "");
        BehaviorSubject<Integer> behaviorSubject = this.a;
        c = C7485cxB.c(a());
        behaviorSubject.onNext(Integer.valueOf(c));
        if (Build.VERSION.SDK_INT >= 33) {
            AccessibilityManager a = a();
            if (a != null) {
                a.addAccessibilityServicesStateChangeListener(c());
                return;
            }
            return;
        }
        AccessibilityManager a2 = a();
        if (a2 != null) {
            a2.addTouchExplorationStateChangeListener(d());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) lifecycleOwner, "");
        if (Build.VERSION.SDK_INT >= 33) {
            AccessibilityManager a = a();
            if (a != null) {
                a.removeAccessibilityServicesStateChangeListener(c());
                return;
            }
            return;
        }
        AccessibilityManager a2 = a();
        if (a2 != null) {
            a2.removeTouchExplorationStateChangeListener(d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Boolean) drm.invoke(obj);
    }

    public final Observable<Boolean> e() {
        Observable<Integer> distinctUntilChanged = this.a.distinctUntilChanged();
        final PlayerA11yRepository$observeIsTalkBackEnabled$1 playerA11yRepository$observeIsTalkBackEnabled$1 = new drM<Integer, Boolean>() { // from class: com.netflix.mediaclient.ui.player.PlayerA11yRepository$observeIsTalkBackEnabled$1
            @Override // o.drM
            /* renamed from: b */
            public final Boolean invoke(Integer num) {
                C8632dsu.c((Object) num, "");
                return Boolean.valueOf((num.intValue() & 1) != 0);
            }
        };
        Observable map = distinctUntilChanged.map(new Function() { // from class: o.cxA
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean b;
                b = PlayerA11yRepository.b(drM.this, obj);
                return b;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Boolean) drm.invoke(obj);
    }

    public final Observable<Boolean> b() {
        Observable<Integer> distinctUntilChanged = this.a.distinctUntilChanged();
        final PlayerA11yRepository$observeIsA11yFeatureEnabled$1 playerA11yRepository$observeIsA11yFeatureEnabled$1 = new drM<Integer, Boolean>() { // from class: com.netflix.mediaclient.ui.player.PlayerA11yRepository$observeIsA11yFeatureEnabled$1
            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(Integer num) {
                C8632dsu.c((Object) num, "");
                return Boolean.valueOf(num.intValue() != 0);
            }
        };
        Observable map = distinctUntilChanged.map(new Function() { // from class: o.cxD
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean e;
                e = PlayerA11yRepository.e(drM.this, obj);
                return e;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }
}
