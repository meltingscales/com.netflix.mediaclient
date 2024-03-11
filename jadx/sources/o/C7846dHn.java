package o;

import com.netflix.android.org.json.zip.JSONzip;
import okio.ByteString;

/* renamed from: o.dHn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7846dHn {
    private static final String[] d;
    public static final C7846dHn c = new C7846dHn();
    public static final ByteString e = ByteString.c.e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] a = new String[64];

    static {
        String b2;
        String[] strArr = new String[JSONzip.end];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C8632dsu.b(binaryString, "");
            b2 = C8691duz.b(dGB.a("%8s", binaryString), ' ', '0', false, 4, (Object) null);
            strArr[i] = b2;
        }
        d = strArr;
        String[] strArr2 = a;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = C8632dsu.d(strArr2[i2], (Object) "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = a;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + "|" + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + "|" + strArr3[i4] + "|PADDED";
        }
        int length = a.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = a;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    private C7846dHn() {
    }

    public final String d(boolean z, int i, int i2, int i3, int i4) {
        String[] strArr = b;
        return dGB.a("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), i3 < strArr.length ? strArr[i3] : dGB.a("0x%02x", Integer.valueOf(i3)), e(i3, i4));
    }

    public final String e(int i, int i2) {
        String str;
        String b2;
        String b3;
        if (i2 == 0) {
            return "";
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : d[i2];
            } else if (i != 7 && i != 8) {
                String[] strArr = a;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    if (str == null) {
                        C8632dsu.e();
                    }
                } else {
                    str = d[i2];
                }
                String str2 = str;
                if (i == 5 && (i2 & 4) != 0) {
                    b3 = C8691duz.b(str2, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                    return b3;
                } else if (i != 0 || (i2 & 32) == 0) {
                    return str2;
                } else {
                    b2 = C8691duz.b(str2, "PRIORITY", "COMPRESSED", false, 4, (Object) null);
                    return b2;
                }
            }
        }
        return d[i2];
    }
}
