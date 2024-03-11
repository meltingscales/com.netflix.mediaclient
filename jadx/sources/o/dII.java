package o;

/* loaded from: classes5.dex */
public final class dII {
    private static final byte[] e = dIl.a("0123456789abcdef");

    public static final byte[] e() {
        return e;
    }

    public static final boolean c(dIE die, int i, byte[] bArr, int i2, int i3) {
        C8632dsu.c((Object) die, "");
        C8632dsu.c((Object) bArr, "");
        int i4 = die.d;
        byte[] bArr2 = die.e;
        while (i2 < i3) {
            if (i == i4) {
                die = die.c;
                C8632dsu.d(die);
                byte[] bArr3 = die.e;
                bArr2 = bArr3;
                i = die.g;
                i4 = die.d;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String a(C7872dIo c7872dIo, long j) {
        C8632dsu.c((Object) c7872dIo, "");
        if (j > 0) {
            long j2 = j - 1;
            if (c7872dIo.a(j2) == ((byte) 13)) {
                String b = c7872dIo.b(j2);
                c7872dIo.h(2L);
                return b;
            }
        }
        String b2 = c7872dIo.b(j);
        c7872dIo.h(1L);
        return b2;
    }

    public static /* synthetic */ int e(C7872dIo c7872dIo, dIA dia, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(c7872dIo, dia, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x005b, code lost:
        if (r19 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x005d, code lost:
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x005e, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int a(o.C7872dIo r17, o.dIA r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dII.a(o.dIo, o.dIA, boolean):int");
    }
}
