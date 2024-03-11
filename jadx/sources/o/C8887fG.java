package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1;
import o.C8632dsu;
import o.InterfaceC8792dys;
import o.dpR;
import o.dyI;

/* renamed from: o.fG  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8887fG {
    public static final <T> dyS<T> e(dyS<? extends T> dys, LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) dys, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        return dyR.d(new MavericksLifecycleAwareFlowKt$flowWhenStarted$1(lifecycleOwner, dys, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1, androidx.lifecycle.LifecycleObserver] */
    public static final InterfaceC8792dys<Boolean> b(final Lifecycle lifecycle) {
        final InterfaceC8792dys<Boolean> e = C8799dyz.e(-1, null, null, 6, null);
        final ?? r1 = new DefaultLifecycleObserver() { // from class: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(LifecycleOwner lifecycleOwner) {
                C8632dsu.c((Object) lifecycleOwner, "");
                e.d((InterfaceC8792dys<Boolean>) Boolean.TRUE);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(LifecycleOwner lifecycleOwner) {
                C8632dsu.c((Object) lifecycleOwner, "");
                e.d((InterfaceC8792dys<Boolean>) Boolean.FALSE);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                C8632dsu.c((Object) lifecycleOwner, "");
                dyI.e.a(e, null, 1, null);
            }
        };
        lifecycle.addObserver(r1);
        e.d(new drM<Throwable, dpR>() { // from class: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                a(th);
                return dpR.c;
            }

            public final void a(Throwable th) {
                Lifecycle.this.removeObserver(r1);
            }
        });
        return e;
    }
}
