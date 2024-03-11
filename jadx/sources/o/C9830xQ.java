package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: o.xQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C9830xQ {
    private static C9830xQ e;
    private d b;
    private d c;
    private final Object d = new Object();
    private final Handler a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o.xQ.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C9830xQ.this.b((d) message.obj);
            return true;
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.xQ$e */
    /* loaded from: classes2.dex */
    public interface e {
        void a(int i);

        void e(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C9830xQ d() {
        if (e == null) {
            e = new C9830xQ();
        }
        return e;
    }

    private C9830xQ() {
    }

    public void e(int i, e eVar, boolean z) {
        synchronized (this.d) {
            if (h(eVar)) {
                d dVar = this.c;
                dVar.e = i;
                this.a.removeCallbacksAndMessages(dVar);
                a(this.c);
                return;
            }
            if (j(eVar)) {
                this.b.e = i;
            } else {
                this.b = new d(i, z, eVar);
            }
            d dVar2 = this.c;
            if (dVar2 == null || !b(dVar2, 4)) {
                this.c = null;
                a(z);
            }
        }
    }

    public void a(e eVar, int i) {
        synchronized (this.d) {
            if (h(eVar)) {
                b(this.c, i);
            } else if (j(eVar)) {
                b(this.b, i);
            }
        }
    }

    public void c(e eVar) {
        synchronized (this.d) {
            if (h(eVar)) {
                this.c = null;
                d dVar = this.b;
                if (dVar != null) {
                    a(dVar.a);
                }
            }
        }
    }

    public void b(e eVar) {
        synchronized (this.d) {
            if (h(eVar)) {
                a(this.c);
            }
        }
    }

    public void d(e eVar) {
        synchronized (this.d) {
            if (h(eVar)) {
                this.a.removeCallbacksAndMessages(this.c);
            }
        }
    }

    public void f(e eVar) {
        synchronized (this.d) {
            if (h(eVar)) {
                a(this.c);
            }
        }
    }

    public boolean e(e eVar) {
        boolean h;
        synchronized (this.d) {
            h = h(eVar);
        }
        return h;
    }

    public boolean a(e eVar) {
        boolean z;
        synchronized (this.d) {
            z = h(eVar) || j(eVar);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.xQ$d */
    /* loaded from: classes2.dex */
    public static class d {
        boolean a;
        final WeakReference<e> c;
        int e;

        d(int i, boolean z, e eVar) {
            this.c = new WeakReference<>(eVar);
            this.e = i;
            this.a = z;
        }

        boolean c(e eVar) {
            return eVar != null && this.c.get() == eVar;
        }
    }

    private void a(boolean z) {
        d dVar = this.b;
        if (dVar != null) {
            this.c = dVar;
            this.b = null;
            e eVar = dVar.c.get();
            if (eVar != null) {
                eVar.e(z);
            } else {
                this.c = null;
            }
        }
    }

    private boolean b(d dVar, int i) {
        e eVar = dVar.c.get();
        if (eVar != null) {
            this.a.removeCallbacksAndMessages(dVar);
            eVar.a(i);
            return true;
        }
        return false;
    }

    private boolean h(e eVar) {
        d dVar = this.c;
        return dVar != null && dVar.c(eVar);
    }

    private boolean j(e eVar) {
        d dVar = this.b;
        return dVar != null && dVar.c(eVar);
    }

    private void a(d dVar) {
        int i = dVar.e;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.a.removeCallbacksAndMessages(dVar);
        Handler handler = this.a;
        handler.sendMessageDelayed(Message.obtain(handler, 0, dVar), i);
    }

    void b(d dVar) {
        synchronized (this.d) {
            if (this.c == dVar || this.b == dVar) {
                b(dVar, 2);
            }
        }
    }
}
