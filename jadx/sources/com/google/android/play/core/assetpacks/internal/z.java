package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class z {
    private static final Map a = new HashMap();
    private final Context b;
    private final o c;
    private final String d;
    private boolean h;
    private final Intent i;
    private ServiceConnection m;
    private IInterface n;

    /* renamed from: o */
    private final com.google.android.play.core.assetpacks.z f13118o;
    private final List e = new ArrayList();
    private final Set f = new HashSet();
    private final Object g = new Object();
    private final IBinder.DeathRecipient k = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.assetpacks.internal.r
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            z.j(z.this);
        }
    };
    private final AtomicInteger l = new AtomicInteger(0);
    private final WeakReference j = new WeakReference(null);

    public z(Context context, o oVar, String str, Intent intent, com.google.android.play.core.assetpacks.z zVar, u uVar) {
        this.b = context;
        this.c = oVar;
        this.d = str;
        this.i = intent;
        this.f13118o = zVar;
    }

    public static /* synthetic */ void j(z zVar) {
        zVar.c.d("reportBinderDeath", new Object[0]);
        u uVar = (u) zVar.j.get();
        if (uVar == null) {
            zVar.c.d("%s : Binder has died.", zVar.d);
            for (p pVar : zVar.e) {
                pVar.c(zVar.v());
            }
            zVar.e.clear();
        } else {
            zVar.c.d("calling onBinderDied", new Object[0]);
            uVar.a();
        }
        synchronized (zVar.g) {
            zVar.w();
        }
    }

    public static /* synthetic */ void n(z zVar, final TaskCompletionSource taskCompletionSource) {
        zVar.f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.assetpacks.internal.q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                z.this.t(taskCompletionSource, task);
            }
        });
    }

    public static /* synthetic */ void q(z zVar) {
        zVar.c.d("linkToDeath", new Object[0]);
        try {
            zVar.n.asBinder().linkToDeath(zVar.k, 0);
        } catch (RemoteException e) {
            zVar.c.c(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* synthetic */ void r(z zVar) {
        zVar.c.d("unlinkToDeath", new Object[0]);
        zVar.n.asBinder().unlinkToDeath(zVar.k, 0);
    }

    public final void w() {
        for (TaskCompletionSource taskCompletionSource : this.f) {
            taskCompletionSource.trySetException(v());
        }
        this.f.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = a;
        synchronized (map) {
            if (!map.containsKey(this.d)) {
                HandlerThread handlerThread = new HandlerThread(this.d, 10);
                handlerThread.start();
                map.put(this.d, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.d);
        }
        return handler;
    }

    public final IInterface e() {
        return this.n;
    }

    public final void s(p pVar, TaskCompletionSource taskCompletionSource) {
        c().post(new s(this, pVar.b(), taskCompletionSource, pVar));
    }

    public final /* synthetic */ void t(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.g) {
            this.f.remove(taskCompletionSource);
        }
    }

    public final void u(TaskCompletionSource taskCompletionSource) {
        synchronized (this.g) {
            this.f.remove(taskCompletionSource);
        }
        c().post(new t(this));
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.d).concat(" : Binder has died."));
    }

    public static /* synthetic */ void p(z zVar, p pVar) {
        if (zVar.n != null || zVar.h) {
            if (zVar.h) {
                zVar.c.d("Waiting to bind to the service.", new Object[0]);
                zVar.e.add(pVar);
                return;
            }
            pVar.run();
            return;
        }
        zVar.c.d("Initiate binding to the service.", new Object[0]);
        zVar.e.add(pVar);
        y yVar = new y(zVar, null);
        zVar.m = yVar;
        zVar.h = true;
        if (zVar.b.bindService(zVar.i, yVar, 1)) {
            return;
        }
        zVar.c.d("Failed to bind to the service.", new Object[0]);
        zVar.h = false;
        for (p pVar2 : zVar.e) {
            pVar2.c(new aa());
        }
        zVar.e.clear();
    }
}
