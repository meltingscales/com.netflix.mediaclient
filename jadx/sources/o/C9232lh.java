package o;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bugsnag.android.DeliveryStatus;
import com.bugsnag.android.internal.TaskType;
import java.io.File;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.AbstractC9245lu;
import o.C9228ld;
import o.C9232lh;
import o.C9246lv;
import o.C9258mG;

/* renamed from: o.lh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9232lh extends AbstractC9245lu {
    public static final a b = new a(null);
    private static final Comparator<? super File> d = new Comparator() { // from class: o.li
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int a2;
            a2 = C9232lh.a((File) obj, (File) obj2);
            return a2;
        }
    };
    private final C9301mx a;
    private final C9258mG c;
    private final C9190ks e;
    private final C9209lK f;
    private final InterfaceC9200lB g;

    /* renamed from: o.lh$c */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[DeliveryStatus.valuesCustom().length];
            iArr[DeliveryStatus.DELIVERED.ordinal()] = 1;
            iArr[DeliveryStatus.UNDELIVERED.ordinal()] = 2;
            iArr[DeliveryStatus.FAILURE.ordinal()] = 3;
            b = iArr;
        }
    }

    @Override // o.AbstractC9245lu
    protected InterfaceC9200lB a() {
        return this.g;
    }

    public C9232lh(C9258mG c9258mG, InterfaceC9200lB interfaceC9200lB, C9209lK c9209lK, C9301mx c9301mx, AbstractC9245lu.d dVar, C9190ks c9190ks) {
        super(new File(c9258mG.x().getValue(), "bugsnag/errors"), c9258mG.p(), d, interfaceC9200lB, dVar);
        this.c = c9258mG;
        this.g = interfaceC9200lB;
        this.f = c9209lK;
        this.a = c9301mx;
        this.e = c9190ks;
    }

    public final void d() {
        if (this.c.y()) {
            try {
                try {
                    this.a.e(TaskType.ERROR_REQUEST, new Runnable() { // from class: o.lg
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9232lh.e(C9232lh.this);
                        }
                    }).get(2000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    a().d("Failed to send launch crash reports within 2s timeout, continuing.", e);
                } catch (ExecutionException e2) {
                    a().d("Failed to send launch crash reports within 2s timeout, continuing.", e2);
                } catch (TimeoutException e3) {
                    a().d("Failed to send launch crash reports within 2s timeout, continuing.", e3);
                }
            } catch (RejectedExecutionException e4) {
                a().d("Failed to flush launch crash reports, continuing.", e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C9232lh c9232lh) {
        c9232lh.j();
    }

    private final void j() {
        Collection<? extends File> e;
        List<File> e2 = e();
        File e3 = e(e2);
        if (e3 != null) {
            e2.remove(e3);
        }
        c((Collection<? extends File>) e2);
        if (e3 != null) {
            a().a("Attempting to send the most recent launch crash report");
            e = C8566dqi.e(e3);
            b(e);
            a().a("Continuing with Bugsnag initialisation");
            return;
        }
        a().b("No startupcrash events to flush to Bugsnag.");
    }

    public final File e(Collection<? extends File> collection) {
        dtQ C;
        dtQ f;
        Object d2;
        C = C8576dqs.C(collection);
        f = C8670due.f(C, new drM<File, Boolean>() { // from class: com.bugsnag.android.EventStore$findLaunchCrashReport$1
            {
                super(1);
            }

            public final boolean a(File file) {
                C9258mG c9258mG;
                C9228ld.d dVar = C9228ld.e;
                c9258mG = C9232lh.this.c;
                return dVar.b(file, c9258mG).d();
            }

            @Override // o.drM
            public /* synthetic */ Boolean invoke(File file) {
                return Boolean.valueOf(a(file));
            }
        });
        d2 = C8670due.d(f, d);
        return (File) d2;
    }

    public final Future<String> d(C9246lv.a aVar) {
        final String c2 = c(aVar);
        if (c2 == null) {
            return null;
        }
        try {
            return this.a.c(TaskType.ERROR_REQUEST, new Callable() { // from class: o.ln
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String b2;
                    b2 = C9232lh.b(C9232lh.this, c2);
                    return b2;
                }
            });
        } catch (RejectedExecutionException unused) {
            a().d("Failed to flush all on-disk errors, retaining unsent errors for later.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(C9232lh c9232lh, String str) {
        c9232lh.b(new File(str));
        return str;
    }

    public final void c() {
        try {
            this.a.e(TaskType.ERROR_REQUEST, new Runnable() { // from class: o.lk
                @Override // java.lang.Runnable
                public final void run() {
                    C9232lh.c(C9232lh.this);
                }
            });
        } catch (RejectedExecutionException unused) {
            a().d("Failed to flush all on-disk errors, retaining unsent errors for later.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C9232lh c9232lh) {
        List<File> e = c9232lh.e();
        if (e.isEmpty()) {
            c9232lh.a().b("No regular events to flush to Bugsnag.");
        }
        c9232lh.b(e);
    }

    private final void b(Collection<? extends File> collection) {
        if (collection.isEmpty()) {
            return;
        }
        int size = collection.size();
        InterfaceC9200lB a2 = a();
        a2.a("Sending " + size + " saved error(s) to Bugsnag");
        for (File file : collection) {
            b(file);
        }
    }

    private final void b(File file) {
        Set a2;
        try {
            C9230lf a3 = a(file, C9228ld.e.b(file, this.c).c());
            if (a3 == null) {
                a2 = dqP.a(file);
                d(a2);
            } else {
                c(file, a3);
            }
        } catch (Exception e) {
            d(e, file);
        }
    }

    private final void c(File file, C9230lf c9230lf) {
        Set a2;
        int i = c.b[this.c.f().b(c9230lf, this.c.c(c9230lf)).ordinal()];
        if (i != 1) {
            if (i == 2) {
                c(file);
                return;
            } else if (i != 3) {
                return;
            } else {
                d(new RuntimeException("Failed to deliver event payload"), file);
                return;
            }
        }
        a2 = dqP.a(file);
        d(a2);
        InterfaceC9200lB a3 = a();
        a3.a("Deleting sent error file " + file + ".name");
    }

    private final void c(File file) {
        Set a2;
        Set a3;
        Set a4;
        if (e(file)) {
            InterfaceC9200lB a5 = a();
            a5.d("Discarding over-sized event (" + file.length() + ") after failed delivery");
            a4 = dqP.a(file);
            d(a4);
        } else if (d(file)) {
            InterfaceC9200lB a6 = a();
            a6.d("Discarding historical event (from " + a(file) + ") after failed delivery");
            a3 = dqP.a(file);
            d(a3);
        } else {
            a2 = dqP.a(file);
            c((Collection<? extends File>) a2);
            a().d("Could not send previously saved error(s) to Bugsnag, will try again later");
        }
    }

    private final C9230lf a(File file, String str) {
        C8632dsu.d((Object) str);
        C9204lF c9204lF = new C9204lF(file, str, a());
        try {
            if (!this.e.b(c9204lF, a())) {
                return null;
            }
        } catch (Exception unused) {
            c9204lF.d();
        }
        C9229le a2 = c9204lF.a();
        if (a2 != null) {
            return new C9230lf(a2.a(), a2, null, this.f, this.c);
        }
        return new C9230lf(str, null, file, this.f, this.c);
    }

    private final void d(Exception exc, File file) {
        Set a2;
        AbstractC9245lu.d i = i();
        if (i != null) {
            i.a(exc, file, "Crash Report Deserialization");
        }
        a2 = dqP.a(file);
        d(a2);
    }

    @Override // o.AbstractC9245lu
    public String c(Object obj) {
        C9228ld a2;
        String a3;
        if (obj == null) {
            a2 = null;
        } else {
            a2 = C9228ld.e.a(obj, (r17 & 2) != 0 ? UUID.randomUUID().toString() : null, null, (r17 & 8) != 0 ? System.currentTimeMillis() : 0L, this.c, (r17 & 32) != 0 ? null : null);
        }
        return (a2 == null || (a3 = a2.a()) == null) ? "" : a3;
    }

    public final String c(Object obj, String str) {
        C9228ld a2;
        String a3;
        if (obj == null) {
            a2 = null;
        } else {
            a2 = C9228ld.e.a(obj, (r17 & 2) != 0 ? UUID.randomUUID().toString() : null, str, (r17 & 8) != 0 ? System.currentTimeMillis() : 0L, this.c, (r17 & 32) != 0 ? null : null);
        }
        return (a2 == null || (a3 = a2.a()) == null) ? "" : a3;
    }

    private final boolean e(File file) {
        return file.length() > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private final boolean d(File file) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -60);
        return C9228ld.e.e(file) < calendar.getTimeInMillis();
    }

    private final Date a(File file) {
        return new Date(C9228ld.e.e(file));
    }

    /* renamed from: o.lh$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(File file, File file2) {
        if (file == null && file2 == null) {
            return 0;
        }
        if (file == null) {
            return 1;
        }
        if (file2 == null) {
            return -1;
        }
        return file.compareTo(file2);
    }
}
