package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import o.C9596sh;
import o.C9603so;
import o.C9607ss;
import o.C9610sv;
import o.HandlerC9604sp;
import o.InterfaceC9605sq;

/* loaded from: classes5.dex */
public class GooglePlayReceiver extends Service implements C9596sh.e {
    private static final C9610sv d = new C9610sv("com.firebase.jobdispatcher.", true);
    Messenger a;
    private C9596sh b;
    private final Object j = new Object();
    private final C9603so e = new C9603so();
    private SimpleArrayMap<String, SimpleArrayMap<String, InterfaceC9605sq>> c = new SimpleArrayMap<>(1);

    public static C9610sv e() {
        return d;
    }

    private static void d(InterfaceC9605sq interfaceC9605sq, int i) {
        try {
            interfaceC9605sq.e(i);
        } catch (Throwable th) {
            Log.e("FJD.GooglePlayReceiver", "Encountered error running callback", th.getCause());
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            super.onStartCommand(intent, i, i2);
            if (intent == null) {
                Log.w("FJD.GooglePlayReceiver", "Null Intent passed, terminating");
                synchronized (this) {
                    if (this.c.isEmpty()) {
                        stopSelf(i2);
                    }
                }
                return 2;
            }
            String action = intent.getAction();
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                c().a(e(intent));
                synchronized (this) {
                    if (this.c.isEmpty()) {
                        stopSelf(i2);
                    }
                }
                return 2;
            } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                synchronized (this) {
                    if (this.c.isEmpty()) {
                        stopSelf(i2);
                    }
                }
                return 2;
            } else {
                Log.e("FJD.GooglePlayReceiver", "Unknown action received, terminating");
                synchronized (this) {
                    if (this.c.isEmpty()) {
                        stopSelf(i2);
                    }
                }
                return 2;
            }
        } catch (Throwable th) {
            synchronized (this) {
                if (this.c.isEmpty()) {
                    stopSelf(i2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null || !"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
            return null;
        }
        return a().getBinder();
    }

    private Messenger a() {
        Messenger messenger;
        synchronized (this.j) {
            if (this.a == null) {
                this.a = new Messenger(new HandlerC9604sp(Looper.getMainLooper(), this));
            }
            messenger = this.a;
        }
        return messenger;
    }

    public C9596sh c() {
        C9596sh c9596sh;
        synchronized (this.j) {
            if (this.b == null) {
                this.b = new C9596sh(this, this);
            }
            c9596sh = this.b;
        }
        return c9596sh;
    }

    C9607ss e(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.e("FJD.GooglePlayReceiver", "No data provided, terminating");
            return null;
        }
        InterfaceC9605sq a = this.e.a(extras);
        if (a == null) {
            Log.i("FJD.GooglePlayReceiver", "no callback found");
            return null;
        }
        return e(extras, a);
    }

    public C9607ss e(Bundle bundle, InterfaceC9605sq interfaceC9605sq) {
        C9607ss a = d.a(bundle);
        if (a == null) {
            Log.e("FJD.GooglePlayReceiver", "unable to decode job");
            d(interfaceC9605sq, 2);
            return null;
        }
        synchronized (this) {
            SimpleArrayMap<String, InterfaceC9605sq> simpleArrayMap = this.c.get(a.c());
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap<>(1);
                this.c.put(a.c(), simpleArrayMap);
            }
            simpleArrayMap.put(a.b(), interfaceC9605sq);
        }
        return a;
    }

    @Override // o.C9596sh.e
    public void b(C9607ss c9607ss, int i) {
        synchronized (this) {
            SimpleArrayMap<String, InterfaceC9605sq> simpleArrayMap = this.c.get(c9607ss.c());
            if (simpleArrayMap == null) {
                return;
            }
            InterfaceC9605sq remove = simpleArrayMap.remove(c9607ss.b());
            if (remove != null) {
                if (Log.isLoggable("FJD.GooglePlayReceiver", 2)) {
                    Log.v("FJD.GooglePlayReceiver", "sending jobFinished for " + c9607ss.b() + " = " + i);
                }
                d(remove, i);
            }
            if (simpleArrayMap.isEmpty()) {
                this.c.remove(c9607ss.c());
            }
        }
    }
}
