package o;

import android.app.Activity;
import com.bugsnag.android.DeliveryStatus;
import com.bugsnag.android.internal.TaskType;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import o.AbstractC9286mi;
import o.C9246lv;
import o.C9303mz;

/* renamed from: o.md  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9281md extends C9185kn implements C9303mz.b {
    final InterfaceC9200lB a;
    final C9223lY b;
    final C9301mx c;
    private final C9190ks d;
    private final C9191kt e;
    private final long f;
    private volatile C9220lV h;
    private final Deque<String> i;
    private final C9258mG j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9281md(C9258mG c9258mG, C9190ks c9190ks, C9191kt c9191kt, C9223lY c9223lY, InterfaceC9200lB interfaceC9200lB, C9301mx c9301mx) {
        this(c9258mG, c9190ks, c9191kt, 30000L, c9223lY, interfaceC9200lB, c9301mx);
    }

    C9281md(C9258mG c9258mG, C9190ks c9190ks, C9191kt c9191kt, long j, C9223lY c9223lY, InterfaceC9200lB interfaceC9200lB, C9301mx c9301mx) {
        this.i = new ArrayDeque();
        this.h = null;
        this.j = c9258mG;
        this.d = c9190ks;
        this.e = c9191kt;
        this.f = j;
        this.b = c9223lY;
        this.c = c9301mx;
        this.a = interfaceC9200lB;
    }

    C9220lV b(Date date, C9294mq c9294mq, boolean z) {
        if (this.e.e().d(z)) {
            return null;
        }
        C9220lV c9220lV = new C9220lV(UUID.randomUUID().toString(), date, c9294mq, z, this.e.o(), this.a, this.j.b());
        if (b(c9220lV)) {
            return c9220lV;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9220lV c(boolean z) {
        if (this.e.e().d(z)) {
            return null;
        }
        return b(new Date(), this.e.q(), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        C9220lV c9220lV = this.h;
        if (c9220lV != null) {
            c9220lV.a.set(true);
            updateState(AbstractC9286mi.k.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        C9220lV c9220lV = this.h;
        boolean z = false;
        if (c9220lV == null) {
            c9220lV = c(false);
        } else {
            z = c9220lV.a.compareAndSet(true, false);
        }
        if (c9220lV != null) {
            c(c9220lV);
        }
        return z;
    }

    private void c(C9220lV c9220lV) {
        updateState(new AbstractC9286mi.n(c9220lV.e(), C9302my.a(c9220lV.a()), c9220lV.d(), c9220lV.b()));
    }

    public C9220lV d(Date date, String str, C9294mq c9294mq, int i, int i2) {
        C9220lV c9220lV = null;
        if (this.e.e().d(false)) {
            return null;
        }
        if (date != null && str != null) {
            c9220lV = new C9220lV(str, date, c9294mq, i, i2, this.e.o(), this.a, this.j.b());
            c(c9220lV);
        } else {
            updateState(AbstractC9286mi.k.b);
        }
        this.h = c9220lV;
        return c9220lV;
    }

    private boolean b(C9220lV c9220lV) {
        this.a.b("SessionTracker#trackSessionIfNeeded() - session captured by Client");
        c9220lV.b(this.e.c().b());
        c9220lV.d(this.e.j().d());
        if (this.d.c(c9220lV, this.a) && c9220lV.g().compareAndSet(false, true)) {
            this.h = c9220lV;
            c(c9220lV);
            d(c9220lV);
            a();
            return true;
        }
        return false;
    }

    public C9220lV c() {
        C9220lV c9220lV = this.h;
        if (c9220lV == null || c9220lV.a.get()) {
            return null;
        }
        return c9220lV;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        try {
            this.c.e(TaskType.SESSION_REQUEST, new Runnable() { // from class: o.md.3
                @Override // java.lang.Runnable
                public void run() {
                    C9281md.this.e();
                }
            });
        } catch (RejectedExecutionException e) {
            this.a.e("Failed to flush session reports", e);
        }
    }

    void e() {
        for (File file : this.b.e()) {
            d(file);
        }
    }

    void d(File file) {
        this.a.b("SessionTracker#flushStoredSession() - attempting delivery");
        C9220lV c9220lV = new C9220lV(file, this.e.o(), this.a, this.j.b());
        if (c9220lV.j()) {
            c9220lV.b(this.e.c().b());
            c9220lV.d(this.e.j().d());
        }
        int i = AnonymousClass2.a[e(c9220lV).ordinal()];
        if (i == 1) {
            this.b.d(Collections.singletonList(file));
            this.a.b("Sent 1 new session to Bugsnag");
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            this.a.d("Deleting invalid session tracking payload");
            this.b.d(Collections.singletonList(file));
        } else if (this.b.d(file)) {
            InterfaceC9200lB interfaceC9200lB = this.a;
            interfaceC9200lB.d("Discarding historical session (from {" + this.b.b(file) + "}) after failed delivery");
            this.b.d(Collections.singletonList(file));
        } else {
            this.b.c((Collection<? extends File>) Collections.singletonList(file));
            this.a.d("Leaving session payload for future delivery");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.md$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DeliveryStatus.valuesCustom().length];
            a = iArr;
            try {
                iArr[DeliveryStatus.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DeliveryStatus.UNDELIVERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DeliveryStatus.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void d(final C9220lV c9220lV) {
        try {
            this.c.e(TaskType.SESSION_REQUEST, new Runnable() { // from class: o.md.5
                @Override // java.lang.Runnable
                public void run() {
                    C9281md.this.a(c9220lV);
                }
            });
        } catch (RejectedExecutionException unused) {
            this.b.c((C9246lv.a) c9220lV);
        }
    }

    void a(C9220lV c9220lV) {
        try {
            this.a.b("SessionTracker#trackSessionIfNeeded() - attempting initial delivery");
            int i = AnonymousClass2.a[e(c9220lV).ordinal()];
            if (i == 1) {
                this.a.b("Sent 1 new session to Bugsnag");
            } else if (i == 2) {
                this.a.d("Storing session payload for future delivery");
                this.b.c((C9246lv.a) c9220lV);
            } else if (i == 3) {
                this.a.d("Dropping invalid session tracking payload");
            }
        } catch (Exception e) {
            this.a.e("Session tracking payload failed", e);
        }
    }

    DeliveryStatus e(C9220lV c9220lV) {
        return this.j.f().a(c9220lV, this.j.e(c9220lV));
    }

    @Override // o.C9303mz.b
    public void e(Activity activity) {
        a(activity.getClass().getSimpleName(), true);
    }

    @Override // o.C9303mz.b
    public void c(Activity activity) {
        a(activity.getClass().getSimpleName(), false);
    }

    void a(String str, boolean z) {
        if (z) {
            synchronized (this.i) {
                this.i.add(str);
            }
        } else {
            synchronized (this.i) {
                this.i.removeLastOccurrence(str);
            }
        }
        this.e.f().e(d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return C9303mz.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long b() {
        return C9303mz.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        String peekLast;
        synchronized (this.i) {
            peekLast = this.i.peekLast();
        }
        return peekLast;
    }

    @Override // o.C9303mz.b
    public void d(boolean z, long j) {
        if (z && j - C9303mz.a() >= this.f && this.j.i()) {
            b(new Date(), this.e.q(), true);
        }
        updateState(new AbstractC9286mi.m(z, d()));
    }
}
