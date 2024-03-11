package o;

import java.util.NoSuchElementException;

/* renamed from: o.dti  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8647dti extends dqB {
    private final int a;
    private final int b;
    private boolean d;
    private int e;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.d;
    }

    public C8647dti(int i, int i2, int i3) {
        this.b = i3;
        this.a = i2;
        boolean z = i3 <= 0 ? i >= i2 : i <= i2;
        this.d = z;
        this.e = z ? i : i2;
    }

    @Override // o.dqB
    public int nextInt() {
        int i = this.e;
        if (i != this.a) {
            this.e = this.b + i;
        } else if (!this.d) {
            throw new NoSuchElementException();
        } else {
            this.d = false;
        }
        return i;
    }
}
