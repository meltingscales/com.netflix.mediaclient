package o;

import com.netflix.msl.util.MslContext;
import java.util.Random;

/* renamed from: o.dll  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8434dll {
    private static boolean d(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            return false;
        }
        return i == 0 || (j & (j - 1)) == 0;
    }

    public static boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    public static long a(MslContext mslContext) {
        boolean d = d(9007199254740992L);
        Random j = mslContext.j();
        while (true) {
            long nextLong = j.nextLong();
            if (d) {
                nextLong &= 9007199254740991L;
            }
            if (nextLong >= 0 && nextLong <= 9007199254740992L) {
                return nextLong;
            }
        }
    }
}
