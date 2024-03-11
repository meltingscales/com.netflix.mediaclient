package o;

import android.content.Context;
import o.C9209lK;
import o.C9232lh;
import o.C9234lj;
import o.C9242lr;
import o.C9258mG;
import o.C9301mx;
import o.InterfaceC9200lB;

/* renamed from: o.lj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9234lj extends AbstractC9267mP {
    private final InterfaceC8554dpx a;
    private final C9258mG b;
    private final InterfaceC8554dpx d;

    public C9234lj(final C9268mQ c9268mQ, C9266mO c9266mO, final C9151kF c9151kF, final C9301mx c9301mx, final C9291mn c9291mn, final C9270mS c9270mS, final C9209lK c9209lK, final C9190ks c9190ks) {
        this.b = c9266mO.a();
        this.d = e(new drO<C9242lr>() { // from class: com.bugsnag.android.EventStorageModule$delegate$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final C9242lr invoke() {
                C9258mG c9258mG;
                C9258mG c9258mG2;
                C9258mG c9258mG3;
                c9258mG = C9234lj.this.b;
                if (c9258mG.B().contains(Telemetry.INTERNAL_ERRORS)) {
                    Context a = c9268mQ.a();
                    c9258mG2 = C9234lj.this.b;
                    InterfaceC9200lB m = c9258mG2.m();
                    c9258mG3 = C9234lj.this.b;
                    return new C9242lr(a, m, c9258mG3, c9270mS.b(), c9151kF.c(), c9151kF.a(), c9291mn.c(), c9209lK, c9301mx);
                }
                return null;
            }
        });
        this.a = e(new drO<C9232lh>() { // from class: com.bugsnag.android.EventStorageModule$eventStore$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final C9232lh invoke() {
                C9258mG c9258mG;
                C9258mG c9258mG2;
                C9242lr b;
                c9258mG = C9234lj.this.b;
                c9258mG2 = C9234lj.this.b;
                InterfaceC9200lB m = c9258mG2.m();
                C9209lK c9209lK2 = c9209lK;
                C9301mx c9301mx2 = c9301mx;
                b = C9234lj.this.b();
                return new C9232lh(c9258mG, m, c9209lK2, c9301mx2, b, c9190ks);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C9242lr b() {
        return (C9242lr) this.d.getValue();
    }

    public final C9232lh d() {
        return (C9232lh) this.a.getValue();
    }
}
