package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$1;
import com.airbnb.mvrx.FlowExtensionsKt$collectLatest$1;
import com.airbnb.mvrx.FlowExtensionsKt$collectLatest$flow$1;
import com.airbnb.mvrx.FlowExtensionsKt$collectLatest$flow$2;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.CoroutineStart;
import o.C8632dsu;
import o.C8929fw;

/* renamed from: o.fw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8929fw {
    public static final <T> dxD d(dyS<? extends T> dys, LifecycleOwner lifecycleOwner, ConcurrentHashMap<String, Object> concurrentHashMap, Set<String> set, AbstractC8928fv abstractC8928fv, drX<? super T, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        dxD c;
        C8632dsu.c((Object) dys, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) concurrentHashMap, "");
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) abstractC8928fv, "");
        C8632dsu.c((Object) drx, "");
        Boolean bool = C8895fO.d;
        C8632dsu.a(bool, "");
        if (!bool.booleanValue()) {
            if (abstractC8928fv instanceof C8977gr) {
                dys = dyR.a(dyR.e(C8887fG.e(dyR.d(e(dys, lifecycleOwner, set, abstractC8928fv.b()), (drX) new FlowExtensionsKt$collectLatest$flow$1(concurrentHashMap, abstractC8928fv, null)), lifecycleOwner)), (drX) new FlowExtensionsKt$collectLatest$flow$2(concurrentHashMap, abstractC8928fv, null));
            } else {
                dys = C8887fG.e(dys, lifecycleOwner);
            }
        }
        c = C8737dwr.c(dwY.e(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C8930fx.c.c().a()), null, CoroutineStart.UNDISPATCHED, new FlowExtensionsKt$collectLatest$1(dys, drx, lifecycleOwner, null), 1, null);
        return c;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$observer$1, androidx.lifecycle.LifecycleObserver] */
    public static final <T> dyS<T> e(dyS<? extends T> dys, LifecycleOwner lifecycleOwner, final Set<String> set, final String str) {
        C8632dsu.c((Object) dys, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) str, "");
        ?? r5 = new DefaultLifecycleObserver() { // from class: com.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(LifecycleOwner lifecycleOwner2) {
                String c;
                C8632dsu.c((Object) lifecycleOwner2, "");
                if (set.contains(str)) {
                    c = C8929fw.c(str);
                    throw new IllegalStateException(c.toString());
                } else {
                    set.add(str);
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner2) {
                C8632dsu.c((Object) lifecycleOwner2, "");
                set.remove(str);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(r5);
        return dyR.a((dyS) dys, (InterfaceC8612dsa) new FlowExtensionsKt$assertOneActiveSubscription$1(set, str, lifecycleOwner, r5, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(String str) {
        String h;
        h = C8681dup.h("\n        Subscribing with a duplicate subscription id: " + str + ".\n        If you have multiple uniqueOnly subscriptions in a Mavericks view that listen to the same properties\n        you must use a custom subscription id. If you are using a custom MavericksView, make sure you are using the proper\n        lifecycle owner. See BaseMvRxFragment for an example.\n");
        return h;
    }
}
