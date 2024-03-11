package o;

import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.UUID;
import o.C9337ng;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.nk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9341nk {
    public static final UUID b = new UUID(0, 0);
    public static final JsonReader.d<UUID> c = new JsonReader.d<UUID>() { // from class: o.nk.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.d
        /* renamed from: c */
        public UUID d(JsonReader jsonReader) {
            if (jsonReader.q()) {
                return null;
            }
            return AbstractC9341nk.a(jsonReader);
        }
    };
    public static final C9337ng.a<UUID> e = new C9337ng.a<UUID>() { // from class: o.nk.1
        @Override // o.C9337ng.a
        /* renamed from: a */
        public void b(C9337ng c9337ng, UUID uuid) {
            AbstractC9341nk.c(uuid, c9337ng);
        }
    };
    private static final char[] a = new char[JSONzip.end];
    private static final byte[] d = new byte[55];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = (i >> 4) & 15;
            int i3 = i & 15;
            a[i] = (char) (((i2 < 10 ? i2 + 48 : i2 + 87) << 8) + (i3 < 10 ? i3 + 48 : i3 + 87));
        }
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            int i4 = c2 - '0';
            d[i4] = (byte) i4;
        }
        for (char c3 = 'a'; c3 <= 'f'; c3 = (char) (c3 + 1)) {
            d[c3 - '0'] = (byte) (c3 - 'W');
        }
        for (char c4 = 'A'; c4 <= 'F'; c4 = (char) (c4 + 1)) {
            d[c4 - '0'] = (byte) (c4 - '7');
        }
    }

    public static void c(UUID uuid, C9337ng c9337ng) {
        if (uuid == null) {
            c9337ng.b();
        } else {
            e(uuid, c9337ng);
        }
    }

    public static void e(UUID uuid, C9337ng c9337ng) {
        d(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits(), c9337ng);
    }

    public static void d(long j, long j2, C9337ng c9337ng) {
        int i = (int) (j >> 32);
        int i2 = (int) j;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) j2;
        byte[] b2 = c9337ng.b(38);
        int a2 = c9337ng.a();
        b2[a2] = 34;
        char[] cArr = a;
        char c2 = cArr[(i >> 24) & PrivateKeyType.INVALID];
        b2[a2 + 1] = (byte) (c2 >> '\b');
        b2[a2 + 2] = (byte) c2;
        char c3 = cArr[(i >> 16) & PrivateKeyType.INVALID];
        b2[a2 + 3] = (byte) (c3 >> '\b');
        b2[a2 + 4] = (byte) c3;
        char c4 = cArr[(i >> 8) & PrivateKeyType.INVALID];
        b2[a2 + 5] = (byte) (c4 >> '\b');
        b2[a2 + 6] = (byte) c4;
        char c5 = cArr[i & PrivateKeyType.INVALID];
        b2[a2 + 7] = (byte) (c5 >> '\b');
        b2[a2 + 8] = (byte) c5;
        b2[a2 + 9] = 45;
        char c6 = cArr[(i2 >> 24) & PrivateKeyType.INVALID];
        b2[a2 + 10] = (byte) (c6 >> '\b');
        b2[a2 + 11] = (byte) c6;
        char c7 = cArr[(i2 >> 16) & PrivateKeyType.INVALID];
        b2[a2 + 12] = (byte) (c7 >> '\b');
        b2[a2 + 13] = (byte) c7;
        b2[a2 + 14] = 45;
        char c8 = cArr[(i2 >> 8) & PrivateKeyType.INVALID];
        b2[a2 + 15] = (byte) (c8 >> '\b');
        b2[a2 + 16] = (byte) c8;
        char c9 = cArr[i2 & PrivateKeyType.INVALID];
        b2[a2 + 17] = (byte) (c9 >> '\b');
        b2[a2 + 18] = (byte) c9;
        b2[a2 + 19] = 45;
        char c10 = cArr[(i3 >> 24) & PrivateKeyType.INVALID];
        b2[a2 + 20] = (byte) (c10 >> '\b');
        b2[a2 + 21] = (byte) c10;
        char c11 = cArr[(i3 >> 16) & PrivateKeyType.INVALID];
        b2[a2 + 22] = (byte) (c11 >> '\b');
        b2[a2 + 23] = (byte) c11;
        b2[a2 + 24] = 45;
        char c12 = cArr[(i3 >> 8) & PrivateKeyType.INVALID];
        b2[a2 + 25] = (byte) (c12 >> '\b');
        b2[a2 + 26] = (byte) c12;
        char c13 = cArr[i3 & PrivateKeyType.INVALID];
        b2[a2 + 27] = (byte) (c13 >> '\b');
        b2[a2 + 28] = (byte) c13;
        char c14 = cArr[(i4 >> 24) & PrivateKeyType.INVALID];
        b2[a2 + 29] = (byte) (c14 >> '\b');
        b2[a2 + 30] = (byte) c14;
        char c15 = cArr[(i4 >> 16) & PrivateKeyType.INVALID];
        b2[a2 + 31] = (byte) (c15 >> '\b');
        b2[a2 + 32] = (byte) c15;
        char c16 = cArr[(i4 >> 8) & PrivateKeyType.INVALID];
        b2[a2 + 33] = (byte) (c16 >> '\b');
        b2[a2 + 34] = (byte) c16;
        char c17 = cArr[i4 & PrivateKeyType.INVALID];
        b2[a2 + 35] = (byte) (c17 >> '\b');
        b2[a2 + 36] = (byte) c17;
        b2[a2 + 37] = 34;
        c9337ng.e(38);
    }

    public static UUID a(JsonReader jsonReader) {
        int i;
        char[] l = jsonReader.l();
        int a2 = jsonReader.a() - jsonReader.b();
        long j = 0;
        if (a2 != 37 || l[8] != '-' || l[13] != '-' || l[18] != '-' || l[23] != '-') {
            if (a2 == 33) {
                int i2 = 0;
                long j2 = 0;
                while (true) {
                    if (i2 >= 16) {
                        break;
                    }
                    try {
                        j2 = (j2 << 4) + d[l[i2] - '0'];
                        i2++;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        return UUID.fromString(new String(l, 0, 32));
                    }
                    return UUID.fromString(new String(l, 0, 32));
                }
                for (i = 16; i < 32; i++) {
                    j = (j << 4) + d[l[i] - '0'];
                }
                return new UUID(j2, j);
            }
            return UUID.fromString(new String(l, 0, a2 - 1));
        }
        long j3 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            try {
                j3 = (j3 << 4) + d[l[i3] - '0'];
            } catch (ArrayIndexOutOfBoundsException unused2) {
                return UUID.fromString(new String(l, 0, 36));
            }
        }
        for (int i4 = 9; i4 < 13; i4++) {
            j3 = (j3 << 4) + d[l[i4] - '0'];
        }
        for (int i5 = 14; i5 < 18; i5++) {
            j3 = (j3 << 4) + d[l[i5] - '0'];
        }
        for (int i6 = 19; i6 < 23; i6++) {
            j = (j << 4) + d[l[i6] - '0'];
        }
        for (int i7 = 24; i7 < 36; i7++) {
            j = (j << 4) + d[l[i7] - '0'];
        }
        return new UUID(j3, j);
    }
}
