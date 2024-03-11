package androidx.media3.extractor;

import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class WavUtil {
    public static int getPcmEncodingForType(int i, int i2) {
        if (i != 1) {
            if (i == 3) {
                return i2 == 32 ? 4 : 0;
            } else if (i != 65534) {
                return 0;
            }
        }
        return Util.getPcmEncoding(i2);
    }
}
