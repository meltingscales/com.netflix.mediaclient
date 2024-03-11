package o;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import java.util.List;
import o.InterfaceC4424beJ;

/* renamed from: o.beM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4427beM implements InterfaceC4421beG {
    private final Looper a;
    private final boolean b;
    private final InterfaceC4522bgB c;
    private final C4390bdc d;
    private C4418beD e;
    private final aTX i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4390bdc a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC4522bgB b() {
        return this.c;
    }

    @Override // o.InterfaceC4423beI
    public Looper c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aTX g() {
        return this.i;
    }

    public C4427beM(Looper looper, InterfaceC4522bgB interfaceC4522bgB, C4390bdc c4390bdc, boolean z, aTX atx) {
        this.d = c4390bdc;
        this.c = interfaceC4522bgB;
        this.a = looper;
        this.b = z;
        this.i = atx;
        h();
    }

    private void h() {
        new Handler(this.a).post(new Runnable() { // from class: o.beN
            @Override // java.lang.Runnable
            public final void run() {
                C4427beM.this.k();
            }
        });
    }

    @Override // o.InterfaceC4423beI
    /* renamed from: c */
    public InterfaceC4420beF e(Long l, InterfaceC4416beB interfaceC4416beB, InterfaceC4424beJ.c cVar) {
        InterfaceC4420beF c;
        synchronized (this) {
            c = k().c(l, interfaceC4416beB, cVar);
        }
        return c;
    }

    @Override // o.InterfaceC4423beI
    public FrameworkCryptoConfig c(long j) {
        C4418beD k = k();
        if (k != null) {
            return k.c();
        }
        return null;
    }

    public void e(List<C5102bsS> list) {
        if (this.b) {
            return;
        }
        C4418beD k = k();
        for (C5102bsS c5102bsS : list) {
            k.b(c5102bsS);
        }
    }

    public void e() {
        synchronized (this) {
            e(true);
        }
    }

    private void e(boolean z) {
        synchronized (this) {
            C4418beD c4418beD = this.e;
            if (c4418beD != null) {
                c4418beD.d(z, false);
            }
        }
    }

    @Override // o.InterfaceC4422beH
    public C4419beE a(boolean z) {
        return k().d(z);
    }

    @Override // o.InterfaceC4423beI
    public void e(Long l) {
        k().c(l);
    }

    @Override // o.InterfaceC4423beI
    public void d() {
        C4418beD c4418beD = this.e;
        if (c4418beD != null) {
            c4418beD.d(false, true);
        }
    }

    public void i() {
        e(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public C4418beD k() {
        C4418beD c4418beD;
        synchronized (this) {
            if (this.e == null) {
                C1044Mm.j("nf_MediaDrmManager", "Expected controller does NOT exist. Create it.");
                this.e = new C4418beD(this.a, this);
            } else {
                C1044Mm.e("nf_MediaDrmManager", "Expected controller found. Returns it.");
            }
            c4418beD = this.e;
        }
        return c4418beD;
    }
}
