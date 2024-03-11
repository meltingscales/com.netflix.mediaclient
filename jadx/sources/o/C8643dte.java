package o;

import java.util.NoSuchElementException;

/* renamed from: o.dte  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8643dte extends AbstractC8568dqk {
    private int a;
    private final int c;
    private boolean d;
    private final int e;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.d;
    }

    public C8643dte(char c, char c2, int i) {
        this.e = i;
        this.c = c2;
        boolean z = i <= 0 ? C8632dsu.d(c, c2) >= 0 : C8632dsu.d(c, c2) <= 0;
        this.d = z;
        this.a = z ? c : c2;
    }

    @Override // o.AbstractC8568dqk
    public char a() {
        int i = this.a;
        if (i != this.c) {
            this.a = this.e + i;
        } else if (!this.d) {
            throw new NoSuchElementException();
        } else {
            this.d = false;
        }
        return (char) i;
    }
}
