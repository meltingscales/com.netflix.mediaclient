package o;

import io.reactivex.schedulers.Schedulers;

/* loaded from: classes3.dex */
public final class aIP implements aIK {
    private boolean a;
    private final long c;
    private boolean d;
    private final aIQ e;

    @Override // o.aIK
    public boolean a() {
        return this.d;
    }

    public aIP(aIQ aiq) {
        C8632dsu.c((Object) aiq, "");
        this.e = aiq;
        this.c = 28L;
        this.d = C8157dfA.b(AbstractApplicationC1040Mh.d(), "nfu_cellular_user", false);
        this.a = C8157dfA.b(AbstractApplicationC1040Mh.d(), "nfu_cellular_pacing_enabled", false);
    }

    @Override // o.aIK
    public void e(final int i) {
        Schedulers.io().scheduleDirect(new Runnable() { // from class: o.aIO
            @Override // java.lang.Runnable
            public final void run() {
                aIP.b(aIP.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(aIP aip, int i) {
        C8632dsu.c((Object) aip, "");
        try {
            boolean d = aip.e.d(i, aip.c);
            if (d != aip.d) {
                aip.d = d;
                aip.e(d);
            }
        } catch (Exception unused) {
        }
    }

    @Override // o.aIK
    public void d(final int i) {
        Schedulers.io().scheduleDirect(new Runnable() { // from class: o.aIN
            @Override // java.lang.Runnable
            public final void run() {
                aIP.e(aIP.this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(aIP aip, int i) {
        C8632dsu.c((Object) aip, "");
        try {
            boolean d = aip.e.d(i, aip.c);
            if (d != aip.a) {
                aip.a = d;
                C8157dfA.d(AbstractApplicationC1040Mh.d(), "nfu_cellular_pacing_enabled", aip.a);
            }
        } catch (Exception unused) {
        }
    }

    private final void e(boolean z) {
        C8157dfA.d(AbstractApplicationC1040Mh.d(), "nfu_cellular_user", z);
    }
}
