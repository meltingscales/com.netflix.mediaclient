package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.dGc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7808dGc {
    private final dGR c;

    public final dGR a() {
        return this.c;
    }

    public C7808dGc(dGR dgr) {
        C8632dsu.d(dgr, "");
        this.c = dgr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7808dGc(int i, long j, TimeUnit timeUnit) {
        this(new dGR(dGL.e, i, j, timeUnit));
        C8632dsu.d(timeUnit, "");
    }

    public C7808dGc() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
