package o;

import com.bugsnag.android.DeliveryStatus;
import com.bugsnag.android.internal.TaskType;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import o.AbstractC9286mi;
import o.C9246lv;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.kH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9153kH extends C9185kn {
    static long b = 3000;
    final C9301mx a;
    final InterfaceC9200lB c;
    private final C9232lh d;
    private final C9190ks e;
    private final C9209lK g;
    private final C9258mG j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9153kH(InterfaceC9200lB interfaceC9200lB, C9232lh c9232lh, C9258mG c9258mG, C9190ks c9190ks, C9209lK c9209lK, C9301mx c9301mx) {
        this.c = interfaceC9200lB;
        this.d = c9232lh;
        this.j = c9258mG;
        this.e = c9190ks;
        this.g = c9209lK;
        this.a = c9301mx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(C9229le c9229le) {
        this.c.b("DeliveryDelegate#deliver() - event being stored/delivered by Client");
        C9220lV d = c9229le.d();
        if (d != null) {
            if (c9229le.g()) {
                c9229le.c(d.h());
                updateState(AbstractC9286mi.o.b);
            } else {
                c9229le.c(d.f());
                updateState(AbstractC9286mi.f.e);
            }
        }
        if (c9229le.e().f()) {
            boolean equals = "unhandledPromiseRejection".equals(c9229le.e().g());
            if (c9229le.e().a(c9229le) || equals) {
                d(c9229le, true);
            } else if (this.j.c()) {
                b(c9229le);
            } else {
                d(c9229le, false);
            }
        } else if (this.e.b(c9229le, this.c)) {
            b(c9229le, new C9230lf(c9229le.a(), c9229le, this.g, this.j));
        }
    }

    private void b(final C9229le c9229le, final C9230lf c9230lf) {
        try {
            this.a.e(TaskType.ERROR_REQUEST, new Runnable() { // from class: o.kH.2
                @Override // java.lang.Runnable
                public void run() {
                    C9153kH.this.e(c9230lf, c9229le);
                }
            });
        } catch (RejectedExecutionException unused) {
            d(c9229le, false);
            this.c.d("Exceeded max queue count, saving to disk to send later");
        }
    }

    DeliveryStatus e(C9230lf c9230lf, C9229le c9229le) {
        this.c.b("DeliveryDelegate#deliverPayloadInternal() - attempting event delivery");
        DeliveryStatus b2 = this.j.f().b(c9230lf, this.j.c(c9230lf));
        int i = AnonymousClass3.b[b2.ordinal()];
        if (i == 1) {
            this.c.a("Sent 1 new event to Bugsnag");
        } else if (i == 2) {
            this.c.d("Could not send event(s) to Bugsnag, saving to disk to send later");
            d(c9229le, false);
        } else if (i == 3) {
            this.c.d("Problem sending event to Bugsnag");
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.kH$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[DeliveryStatus.valuesCustom().length];
            b = iArr;
            try {
                iArr[DeliveryStatus.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[DeliveryStatus.UNDELIVERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[DeliveryStatus.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void b(C9229le c9229le) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = b;
        Future<String> d = this.d.d(c9229le);
        long currentTimeMillis2 = (currentTimeMillis + j) - System.currentTimeMillis();
        if (d == null || currentTimeMillis2 <= 0) {
            return;
        }
        try {
            d.get(currentTimeMillis2, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            this.c.e("failed to immediately deliver event", e);
        }
        if (d.isDone()) {
            return;
        }
        d.cancel(true);
    }

    private void d(C9229le c9229le, boolean z) {
        this.d.c((C9246lv.a) c9229le);
        if (z) {
            this.d.c();
        }
    }
}
