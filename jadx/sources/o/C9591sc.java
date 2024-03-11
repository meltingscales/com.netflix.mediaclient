package o;

import com.netflix.android.org.json.zip.JSONzip;

/* renamed from: o.sc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9591sc {
    public static final int[] c;

    public static boolean b(int i, byte b) {
        return ((b & 224) >> 5) == i;
    }

    static {
        int[] iArr = new int[JSONzip.end];
        for (int i = 128; i < 256; i++) {
            iArr[i] = (i & 224) == 192 ? 1 : (i & 240) == 224 ? 2 : (i & 248) == 240 ? 3 : -1;
        }
        c = iArr;
    }
}
