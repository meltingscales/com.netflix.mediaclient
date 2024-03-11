package o;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.dlj  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C8432dlj {
    private int b;
    private AtomicInteger e = new AtomicInteger();

    public boolean b(int i) {
        return i >= this.b;
    }

    public int d() {
        return this.b;
    }

    public C8432dlj(int i) {
        this.b = i;
    }

    public int c() {
        return this.e.incrementAndGet();
    }
}
