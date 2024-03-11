package o;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.lang.ref.WeakReference;

/* renamed from: o.sh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9596sh {
    private final e a;
    private final Context e;
    private final SimpleArrayMap<C9607ss, ServiceConnectionC9609su> d = new SimpleArrayMap<>();
    private final d c = new d(Looper.getMainLooper(), new WeakReference(this));

    /* renamed from: o.sh$e */
    /* loaded from: classes5.dex */
    public interface e {
        void b(C9607ss c9607ss, int i);
    }

    public C9596sh(Context context, e eVar) {
        this.e = context;
        this.a = eVar;
    }

    public boolean a(C9607ss c9607ss) {
        boolean bindService;
        if (c9607ss == null) {
            return false;
        }
        ServiceConnectionC9609su serviceConnectionC9609su = new ServiceConnectionC9609su(c9607ss, this.c.obtainMessage(1));
        synchronized (this.d) {
            if (this.d.put(c9607ss, serviceConnectionC9609su) != null) {
                Log.e("FJD.ExternalReceiver", "Received execution request for already running job");
            }
            bindService = this.e.bindService(d(c9607ss), serviceConnectionC9609su, 1);
        }
        return bindService;
    }

    private Intent d(InterfaceC9606sr interfaceC9606sr) {
        Intent intent = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
        intent.setClassName(this.e, interfaceC9606sr.c());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(C9607ss c9607ss) {
        synchronized (this.d) {
            ServiceConnectionC9609su remove = this.d.remove(c9607ss);
            if (remove != null) {
                remove.c();
                b(remove);
            }
        }
    }

    private void b(ServiceConnectionC9609su serviceConnectionC9609su) {
        if (serviceConnectionC9609su == null || !serviceConnectionC9609su.b()) {
            return;
        }
        try {
            this.e.unbindService(serviceConnectionC9609su);
        } catch (IllegalArgumentException e2) {
            Log.w("FJD.ExternalReceiver", "Error unbinding service: " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C9607ss c9607ss, int i) {
        synchronized (this.d) {
            b(this.d.remove(c9607ss));
        }
        this.a.b(c9607ss, i);
    }

    /* renamed from: o.sh$d */
    /* loaded from: classes5.dex */
    static class d extends Handler {
        private final WeakReference<C9596sh> c;

        d(Looper looper, WeakReference<C9596sh> weakReference) {
            super(looper);
            this.c = weakReference;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                if (message.obj instanceof C9607ss) {
                    C9596sh c9596sh = this.c.get();
                    if (c9596sh != null) {
                        c9596sh.a((C9607ss) message.obj, message.arg1);
                        return;
                    } else {
                        Log.wtf("FJD.ExternalReceiver", "handleMessage: service was unexpectedly GC'd, can't send job result");
                        return;
                    }
                }
                Log.wtf("FJD.ExternalReceiver", "handleMessage: unknown obj returned");
                return;
            }
            Log.wtf("FJD.ExternalReceiver", "handleMessage: unknown message type received: " + message.what);
        }
    }
}
