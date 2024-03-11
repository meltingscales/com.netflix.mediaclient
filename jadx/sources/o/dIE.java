package o;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class dIE {
    public static final a a = new a(null);
    public boolean b;
    public dIE c;
    public int d;
    public final byte[] e;
    public int g;
    public dIE i;
    public boolean j;

    public dIE() {
        this.e = new byte[8192];
        this.b = true;
        this.j = false;
    }

    public dIE(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C8632dsu.c((Object) bArr, "");
        this.e = bArr;
        this.g = i;
        this.d = i2;
        this.j = z;
        this.b = z2;
    }

    public final dIE b() {
        this.j = true;
        return new dIE(this.e, this.g, this.d, true, false);
    }

    public final dIE c() {
        byte[] bArr = this.e;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C8632dsu.a(copyOf, "");
        return new dIE(copyOf, this.g, this.d, false, true);
    }

    public final dIE e() {
        dIE die = this.c;
        if (die == this) {
            die = null;
        }
        dIE die2 = this.i;
        C8632dsu.d(die2);
        die2.c = this.c;
        dIE die3 = this.c;
        C8632dsu.d(die3);
        die3.i = this.i;
        this.c = null;
        this.i = null;
        return die;
    }

    public final dIE b(dIE die) {
        C8632dsu.c((Object) die, "");
        die.i = this;
        die.c = this.c;
        dIE die2 = this.c;
        C8632dsu.d(die2);
        die2.i = die;
        this.c = die;
        return die;
    }

    public final dIE b(int i) {
        dIE c;
        if (i <= 0 || i > this.d - this.g) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i >= 1024) {
            c = b();
        } else {
            c = dIC.c();
            byte[] bArr = this.e;
            byte[] bArr2 = c.e;
            int i2 = this.g;
            C8564dqg.a(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
        }
        c.d = c.g + i;
        this.g += i;
        dIE die = this.i;
        C8632dsu.d(die);
        die.b(c);
        return c;
    }

    public final void d() {
        int i;
        dIE die = this.i;
        if (die == this) {
            throw new IllegalStateException("cannot compact".toString());
        }
        C8632dsu.d(die);
        if (die.b) {
            int i2 = this.d - this.g;
            dIE die2 = this.i;
            C8632dsu.d(die2);
            int i3 = die2.d;
            dIE die3 = this.i;
            C8632dsu.d(die3);
            if (die3.j) {
                i = 0;
            } else {
                dIE die4 = this.i;
                C8632dsu.d(die4);
                i = die4.g;
            }
            if (i2 > (8192 - i3) + i) {
                return;
            }
            dIE die5 = this.i;
            C8632dsu.d(die5);
            d(die5, i2);
            e();
            dIC.e(this);
        }
    }

    public final void d(dIE die, int i) {
        C8632dsu.c((Object) die, "");
        if (!die.b) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = die.d;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (die.j) {
                throw new IllegalArgumentException();
            }
            int i4 = die.g;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = die.e;
            C8564dqg.a(bArr, bArr, 0, i4, i2, 2, (Object) null);
            die.d -= die.g;
            die.g = 0;
        }
        byte[] bArr2 = this.e;
        byte[] bArr3 = die.e;
        int i5 = die.d;
        int i6 = this.g;
        C8564dqg.d(bArr2, bArr3, i5, i6, i6 + i);
        die.d += i;
        this.g += i;
    }

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }
    }
}
