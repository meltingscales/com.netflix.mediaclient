package o;

import kotlinx.coroutines.selects.OnTimeout$selectClause$1;

/* renamed from: o.dBw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7693dBw {
    private final long e;

    /* renamed from: o.dBw$b */
    /* loaded from: classes5.dex */
    public static final class b implements Runnable {
        final /* synthetic */ C7693dBw a;
        final /* synthetic */ dBH d;

        public b(dBH dbh, C7693dBw c7693dBw) {
            this.d = dbh;
            this.a = c7693dBw;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.d(this.a, dpR.c);
        }
    }

    public C7693dBw(long j) {
        this.e = j;
    }

    public final dBC b() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.d;
        C8632dsu.d(onTimeout$selectClause$1);
        return new dBE(this, (InterfaceC8612dsa) dsH.a(onTimeout$selectClause$1, 3), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(dBH<?> dbh, Object obj) {
        if (this.e <= 0) {
            dbh.b(dpR.c);
            return;
        }
        b bVar = new b(dbh, this);
        C8632dsu.d(dbh);
        dBJ dbj = (dBJ) dbh;
        dqZ d = dbh.d();
        dbh.e(C8749dxc.c(d).e(this.e, bVar, d));
    }
}
