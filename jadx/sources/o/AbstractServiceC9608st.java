package o;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;

/* renamed from: o.st  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractServiceC9608st extends Service {
    private final SimpleArrayMap<String, d> e = new SimpleArrayMap<>(1);
    private a b = new a();

    public abstract boolean c(InterfaceC9606sr interfaceC9606sr);

    public abstract boolean d(InterfaceC9606sr interfaceC9606sr);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.b;
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(InterfaceC9606sr interfaceC9606sr, Message message) {
        synchronized (this.e) {
            if (this.e.containsKey(interfaceC9606sr.b())) {
                Log.w("FJD.JobService", String.format(Locale.US, "Job with tag = %s was already running.", interfaceC9606sr.b()));
                return;
            }
            this.e.put(interfaceC9606sr.b(), new d(message));
            if (!c(interfaceC9606sr)) {
                this.e.remove(interfaceC9606sr.b()).d(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(C9607ss c9607ss) {
        synchronized (this.e) {
            d remove = this.e.remove(c9607ss.b());
            if (remove == null) {
                if (Log.isLoggable("FJD.JobService", 3)) {
                    Log.d("FJD.JobService", "Provided job has already been executed.");
                }
                return;
            }
            remove.d(d(c9607ss) ? 1 : 0);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        stopSelf(i2);
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        synchronized (this.e) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                SimpleArrayMap<String, d> simpleArrayMap = this.e;
                d dVar = simpleArrayMap.get(simpleArrayMap.keyAt(size));
                if (dVar != null) {
                    dVar.d(d((InterfaceC9606sr) dVar.a.obj) ? 1 : 2);
                }
            }
        }
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }

    /* renamed from: o.st$d */
    /* loaded from: classes5.dex */
    static final class d {
        public final Message a;

        private d(Message message) {
            this.a = message;
        }

        void d(int i) {
            Message message = this.a;
            message.arg1 = i;
            message.sendToTarget();
        }
    }

    /* renamed from: o.st$a */
    /* loaded from: classes5.dex */
    class a extends Binder {
        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractServiceC9608st c() {
            return AbstractServiceC9608st.this;
        }

        a() {
        }
    }
}
