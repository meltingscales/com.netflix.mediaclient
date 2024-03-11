package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class dBS extends dAC<dBS> {
    private final AtomicReferenceArray c;

    public final AtomicReferenceArray a() {
        return this.c;
    }

    public dBS(long j, dBS dbs, int i) {
        super(j, dbs, i);
        int i2;
        i2 = dBR.b;
        this.c = new AtomicReferenceArray(i2);
    }

    @Override // o.dAC
    public int d() {
        int i;
        i = dBR.b;
        return i;
    }

    @Override // o.dAC
    public void e(int i, Throwable th, dqZ dqz) {
        dAH dah;
        dah = dBR.e;
        a().set(i, dah);
        k();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + ']';
    }
}
