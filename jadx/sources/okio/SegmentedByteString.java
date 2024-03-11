package okio;

import java.security.MessageDigest;
import o.C7868dIi;
import o.C7872dIo;
import o.C8564dqg;
import o.C8632dsu;
import o.dIE;
import o.dIO;

/* loaded from: classes5.dex */
public final class SegmentedByteString extends ByteString {
    private final transient byte[][] b;
    private final transient int[] d;

    public final int[] l() {
        return this.d;
    }

    public final byte[][] q() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.e.c());
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) iArr, "");
        this.b = bArr;
        this.d = iArr;
    }

    @Override // okio.ByteString
    public String d() {
        return t().d();
    }

    @Override // okio.ByteString
    public String j() {
        return t().j();
    }

    @Override // okio.ByteString
    public ByteString o() {
        return t().o();
    }

    @Override // okio.ByteString
    public ByteString a(String str) {
        C8632dsu.c((Object) str, "");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = q().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = l()[length + i];
            int i4 = l()[i];
            messageDigest.update(q()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        C8632dsu.a(digest, "");
        return new ByteString(digest);
    }

    private final ByteString t() {
        return new ByteString(n());
    }

    @Override // okio.ByteString
    public byte[] f() {
        return n();
    }

    @Override // okio.ByteString
    public String toString() {
        return t().toString();
    }

    private final Object writeReplace() {
        ByteString t = t();
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
    }

    @Override // okio.ByteString
    public byte b(int i) {
        C7868dIi.a(l()[q().length - 1], i, 1L);
        int a = dIO.a(this, i);
        return q()[a][(i - (a == 0 ? 0 : l()[a - 1])) + l()[q().length + a]];
    }

    @Override // okio.ByteString
    public int b() {
        return l()[q().length - 1];
    }

    @Override // okio.ByteString
    public byte[] n() {
        byte[] bArr = new byte[k()];
        int length = q().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = l()[length + i];
            int i5 = l()[i];
            int i6 = i5 - i2;
            C8564dqg.d(q()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public void b(C7872dIo c7872dIo, int i, int i2) {
        C8632dsu.c((Object) c7872dIo, "");
        int i3 = i2 + i;
        int a = dIO.a(this, i);
        while (i < i3) {
            int i4 = a == 0 ? 0 : l()[a - 1];
            int i5 = l()[a];
            int i6 = l()[q().length + a];
            int min = Math.min(i3, (i5 - i4) + i4) - i;
            int i7 = i6 + (i - i4);
            dIE die = new dIE(q()[a], i7, i7 + min, true, false);
            dIE die2 = c7872dIo.c;
            if (die2 == null) {
                die.i = die;
                die.c = die;
                c7872dIo.c = die;
            } else {
                C8632dsu.d(die2);
                dIE die3 = die2.i;
                C8632dsu.d(die3);
                die3.b(die);
            }
            i += min;
            a++;
        }
        c7872dIo.f(c7872dIo.D() + k());
    }

    @Override // okio.ByteString
    public boolean e(int i, ByteString byteString, int i2, int i3) {
        C8632dsu.c((Object) byteString, "");
        if (i < 0 || i > k() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int a = dIO.a(this, i);
        while (i < i4) {
            int i5 = a == 0 ? 0 : l()[a - 1];
            int i6 = l()[a];
            int i7 = l()[q().length + a];
            int min = Math.min(i4, (i6 - i5) + i5) - i;
            if (!byteString.e(i2, q()[a], i7 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    @Override // okio.ByteString
    public boolean e(int i, byte[] bArr, int i2, int i3) {
        C8632dsu.c((Object) bArr, "");
        if (i < 0 || i > k() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int a = dIO.a(this, i);
        while (i < i4) {
            int i5 = a == 0 ? 0 : l()[a - 1];
            int i6 = l()[a];
            int i7 = l()[q().length + a];
            int min = Math.min(i4, (i6 - i5) + i5) - i;
            if (!C7868dIi.e(q()[a], i7 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof ByteString)) {
                return false;
            }
            ByteString byteString = (ByteString) obj;
            if (byteString.k() != k() || !e(0, byteString, 0, k())) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.ByteString
    public int hashCode() {
        int a = a();
        if (a != 0) {
            return a;
        }
        int length = q().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = l()[length + i];
            int i5 = l()[i];
            byte[] bArr = q()[i];
            for (int i6 = i4; i6 < (i5 - i3) + i4; i6++) {
                i2 = (i2 * 31) + bArr[i6];
            }
            i++;
            i3 = i5;
        }
        c(i2);
        return i2;
    }
}
