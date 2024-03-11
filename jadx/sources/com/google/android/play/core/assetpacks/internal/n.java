package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class n {
    public final o a;
    private final IntentFilter c;
    private final Context d;
    protected final Set b = new HashSet();
    private m e = null;
    private volatile boolean f = false;

    public n(o oVar, IntentFilter intentFilter, Context context) {
        this.a = oVar;
        this.c = intentFilter;
        this.d = ag.a(context);
    }

    private final void a() {
        m mVar;
        if ((this.f || !this.b.isEmpty()) && this.e == null) {
            m mVar2 = new m(this, null);
            this.e = mVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.d.registerReceiver(mVar2, this.c, 2);
            } else {
                this.d.registerReceiver(mVar2, this.c);
            }
        }
        if (this.f || !this.b.isEmpty() || (mVar = this.e) == null) {
            return;
        }
        this.d.unregisterReceiver(mVar);
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c(Context context, Intent intent);

    public final void g(boolean z) {
        synchronized (this) {
            this.f = z;
            a();
        }
    }

    public final void i(Object obj) {
        synchronized (this) {
            Iterator it = new HashSet(this.b).iterator();
            while (it.hasNext()) {
                ((StateUpdatedListener) it.next()).onStateUpdate(obj);
            }
        }
    }

    public final boolean j() {
        m mVar;
        synchronized (this) {
            mVar = this.e;
        }
        return mVar != null;
    }
}
