package o;

import org.chromium.net.PrivateKeyType;

/* renamed from: o.eX  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8851eX {
    private static float a(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float d(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & PrivateKeyType.INVALID) / 255.0f;
        float d = d(((i >> 16) & PrivateKeyType.INVALID) / 255.0f);
        float d2 = d(((i >> 8) & PrivateKeyType.INVALID) / 255.0f);
        float d3 = d((i & PrivateKeyType.INVALID) / 255.0f);
        float d4 = d(((i2 >> 16) & PrivateKeyType.INVALID) / 255.0f);
        float d5 = d(((i2 >> 8) & PrivateKeyType.INVALID) / 255.0f);
        float d6 = d((i2 & PrivateKeyType.INVALID) / 255.0f);
        float a = a(d + ((d4 - d) * f));
        float a2 = a(d2 + ((d5 - d2) * f));
        float a3 = a(d3 + ((d6 - d3) * f));
        return (Math.round((f2 + (((((i2 >> 24) & PrivateKeyType.INVALID) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(a * 255.0f) << 16) | (Math.round(a2 * 255.0f) << 8) | Math.round(a3 * 255.0f);
    }
}
