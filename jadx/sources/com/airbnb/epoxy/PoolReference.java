package com.airbnb.epoxy;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import o.C2104aa;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PoolReference implements LifecycleObserver {
    private final WeakReference<Context> a;
    private final RecyclerView.RecycledViewPool b;
    private final C2104aa d;

    public final RecyclerView.RecycledViewPool e() {
        return this.b;
    }

    public PoolReference(Context context, RecyclerView.RecycledViewPool recycledViewPool, C2104aa c2104aa) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) recycledViewPool, "");
        C8632dsu.c((Object) c2104aa, "");
        this.b = recycledViewPool;
        this.d = c2104aa;
        this.a = new WeakReference<>(context);
    }

    public final Context d() {
        return this.a.get();
    }

    public final void c() {
        this.d.a(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onContextDestroyed() {
        c();
    }
}
