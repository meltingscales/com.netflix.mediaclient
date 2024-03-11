package o;

import java.util.NoSuchElementException;

/* renamed from: o.dtm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8651dtm extends AbstractC8581dqx {
    private final long a;
    private final long b;
    private boolean c;
    private long d;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }

    public C8651dtm(long j, long j2, long j3) {
        this.a = j3;
        this.b = j2;
        boolean z = j3 <= 0 ? j >= j2 : j <= j2;
        this.c = z;
        this.d = z ? j : j2;
    }

    @Override // o.AbstractC8581dqx
    public long nextLong() {
        long j = this.d;
        if (j != this.b) {
            this.d = this.a + j;
        } else if (!this.c) {
            throw new NoSuchElementException();
        } else {
            this.c = false;
        }
        return j;
    }
}
