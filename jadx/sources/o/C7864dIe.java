package o;

import o.C7872dIo;

/* renamed from: o.dIe  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7864dIe {
    public static final C7864dIe c = new C7864dIe();

    private C7864dIe() {
    }

    public final void c(C7872dIo.d dVar, byte[] bArr) {
        C8632dsu.d(dVar, "");
        C8632dsu.d(bArr, "");
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = dVar.a;
            int i2 = dVar.g;
            int i3 = dVar.e;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (dVar.a() != -1);
    }

    public final String a(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        } else if ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) {
            return null;
        } else {
            return "Code " + i + " is reserved and may not be used.";
        }
    }

    public final void e(int i) {
        String a = a(i);
        if (a == null) {
            return;
        }
        if (a == null) {
            C8632dsu.e();
        }
        throw new IllegalArgumentException(a.toString());
    }
}
