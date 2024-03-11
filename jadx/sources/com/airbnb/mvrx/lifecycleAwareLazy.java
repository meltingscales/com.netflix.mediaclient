package com.airbnb.mvrx;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.mvrx.lifecycleAwareLazy;
import java.io.Serializable;
import o.C8627dsp;
import o.C8632dsu;
import o.C8978gs;
import o.InterfaceC8554dpx;
import o.drO;

/* loaded from: classes2.dex */
public final class lifecycleAwareLazy<T> implements InterfaceC8554dpx<T>, Serializable {
    private final LifecycleOwner a;
    private drO<? extends T> b;
    private volatile Object c;
    private final lifecycleAwareLazy<T> d;

    public lifecycleAwareLazy(LifecycleOwner lifecycleOwner, drO<Boolean> dro, drO<? extends T> dro2) {
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        this.a = lifecycleOwner;
        this.b = dro2;
        this.c = C8978gs.b;
        this.d = this;
        if (dro.invoke().booleanValue()) {
            c(lifecycleOwner);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.gD
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycleAwareLazy.c(lifecycleAwareLazy.this);
                }
            });
        }
    }

    public /* synthetic */ lifecycleAwareLazy(LifecycleOwner lifecycleOwner, drO dro, drO dro2, int i, C8627dsp c8627dsp) {
        this(lifecycleOwner, (i & 2) != 0 ? new drO<Boolean>() { // from class: com.airbnb.mvrx.lifecycleAwareLazy.1
            @Override // o.drO
            /* renamed from: c */
            public final Boolean invoke() {
                return Boolean.valueOf(C8632dsu.c(Looper.myLooper(), Looper.getMainLooper()));
            }
        } : dro, dro2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(lifecycleAwareLazy lifecycleawarelazy) {
        C8632dsu.c((Object) lifecycleawarelazy, "");
        lifecycleawarelazy.c(lifecycleawarelazy.a);
    }

    private final void c(LifecycleOwner lifecycleOwner) {
        Lifecycle.State currentState = lifecycleOwner.getLifecycle().getCurrentState();
        if (currentState == Lifecycle.State.DESTROYED || isInitialized()) {
            return;
        }
        if (currentState == Lifecycle.State.INITIALIZED) {
            lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver(this) { // from class: com.airbnb.mvrx.lifecycleAwareLazy$initializeWhenCreated$1
                final /* synthetic */ lifecycleAwareLazy<T> c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.c = this;
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onCreate(LifecycleOwner lifecycleOwner2) {
                    C8632dsu.c((Object) lifecycleOwner2, "");
                    if (!this.c.isInitialized()) {
                        this.c.getValue();
                    }
                    lifecycleOwner2.getLifecycle().removeObserver(this);
                }
            });
        } else if (isInitialized()) {
        } else {
            getValue();
        }
    }

    @Override // o.InterfaceC8554dpx
    public T getValue() {
        T t;
        T t2 = (T) this.c;
        C8978gs c8978gs = C8978gs.b;
        if (t2 != c8978gs) {
            return t2;
        }
        synchronized (this.d) {
            t = (T) this.c;
            if (t == c8978gs) {
                drO<? extends T> dro = this.b;
                C8632dsu.d(dro);
                t = dro.invoke();
                this.c = t;
                this.b = null;
            }
        }
        return t;
    }

    @Override // o.InterfaceC8554dpx
    public boolean isInitialized() {
        return this.c != C8978gs.b;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
