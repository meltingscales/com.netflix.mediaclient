package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: o.oY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9382oY {
    private static final int[] c = {8000, 8000, 2000, 2000};
    private static final int[] e = {4000, 4000, 200, 200};
    protected final AtomicReferenceArray<char[]> a;
    protected final AtomicReferenceArray<byte[]> b;

    public C9382oY() {
        this(4, 4);
    }

    protected C9382oY(int i, int i2) {
        this.b = new AtomicReferenceArray<>(i);
        this.a = new AtomicReferenceArray<>(i2);
    }

    public final byte[] e(int i) {
        return e(i, 0);
    }

    public byte[] e(int i, int i2) {
        int c2 = c(i);
        if (i2 < c2) {
            i2 = c2;
        }
        byte[] andSet = this.b.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? a(i2) : andSet;
    }

    public void a(int i, byte[] bArr) {
        this.b.set(i, bArr);
    }

    public final char[] b(int i) {
        return a(i, 0);
    }

    public char[] a(int i, int i2) {
        int g = g(i);
        if (i2 < g) {
            i2 = g;
        }
        char[] andSet = this.a.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? d(i2) : andSet;
    }

    public void d(int i, char[] cArr) {
        this.a.set(i, cArr);
    }

    protected int c(int i) {
        return c[i];
    }

    protected int g(int i) {
        return e[i];
    }

    protected byte[] a(int i) {
        return new byte[i];
    }

    protected char[] d(int i) {
        return new char[i];
    }
}
