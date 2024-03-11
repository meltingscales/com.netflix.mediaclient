package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import o.AbstractServiceC9608st;

/* renamed from: o.su  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class ServiceConnectionC9609su implements ServiceConnection {
    private boolean a = false;
    private final C9607ss b;
    private final Message c;
    private AbstractServiceC9608st.a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC9609su(C9607ss c9607ss, Message message) {
        this.c = message;
        this.b = c9607ss;
        message.obj = c9607ss;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            if (!(iBinder instanceof AbstractServiceC9608st.a)) {
                Log.w("FJD.ExternalReceiver", "Unknown service connected");
            } else if (this.a) {
                Log.w("FJD.ExternalReceiver", "onServiceConnected Duplicate calls. Ignored.");
            } else {
                this.a = true;
                AbstractServiceC9608st.a aVar = (AbstractServiceC9608st.a) iBinder;
                this.d = aVar;
                aVar.c().c(this.b, this.c);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        boolean z;
        synchronized (this) {
            z = this.d != null;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        synchronized (this) {
            if (b()) {
                this.d.c().e(this.b);
            }
        }
    }
}
