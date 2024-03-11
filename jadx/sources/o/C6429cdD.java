package o;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.cdD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6429cdD {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(int i) {
        int i2 = (i >> 16) & PrivateKeyType.INVALID;
        return (i2 > 232 && ((i >> 8) & PrivateKeyType.INVALID) > 232 && (i & PrivateKeyType.INVALID) > 232) || (i2 < 23 && ((i >> 8) & PrivateKeyType.INVALID) < 23 && (i & PrivateKeyType.INVALID) < 23);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(int i, int i2) {
        double d = (((i >> 16) & PrivateKeyType.INVALID) * 0.2126d) + (((i >> 8) & PrivateKeyType.INVALID) * 0.7152d) + ((i & PrivateKeyType.INVALID) * 0.0722d) + 12.75d;
        double d2 = (((i2 >> 16) & PrivateKeyType.INVALID) * 0.2126d) + (((i2 >> 8) & PrivateKeyType.INVALID) * 0.7152d) + ((i2 & PrivateKeyType.INVALID) * 0.0722d) + 12.75d;
        return d <= d2 ? 1.6d < d2 / d : 1.6d < d / d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(int i) {
        return ColorUtils.calculateLuminance(i) < 0.5d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(int i, int i2) {
        int i3 = (i2 >> 16) & PrivateKeyType.INVALID;
        int i4 = (i2 >> 8) & PrivateKeyType.INVALID;
        int i5 = i2 & PrivateKeyType.INVALID;
        int i6 = (i >> 16) & PrivateKeyType.INVALID;
        return (((double) Math.abs(i6 - i3)) > 63.75d || ((double) Math.abs(((i >> 8) & PrivateKeyType.INVALID) - i4)) > 63.75d || ((double) Math.abs((i & PrivateKeyType.INVALID) - i5)) > 63.75d) && (((double) Math.abs(i6 - ((i >> 8) & PrivateKeyType.INVALID))) >= 7.65d || ((double) Math.abs(i6 - (i & PrivateKeyType.INVALID))) >= 7.65d || ((double) Math.abs(i3 - i4)) >= 7.65d || ((double) Math.abs(i3 - i5)) >= 7.65d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(int i, double d) {
        double d2;
        double d3 = ((i >> 16) & PrivateKeyType.INVALID) / 255.0d;
        double d4 = ((i >> 8) & PrivateKeyType.INVALID) / 255.0d;
        double d5 = (i & PrivateKeyType.INVALID) / 255.0d;
        double max = Math.max(d3, Math.max(d4, d5));
        double min = max - Math.min(d3, Math.min(d4, d5));
        double d6 = 0.0d;
        if (d <= (max == 0.0d ? 0.0d : min / max)) {
            return i;
        }
        double d7 = min == 0.0d ? 0.0d : d3 == max ? ((d4 - d5) / min) % 6 : d4 == max ? 2 + ((d5 - d3) / min) : 4 + ((d3 - d4) / min);
        if (d7 < 0.0d) {
            d7 += 6;
        }
        double d8 = max * d;
        double d9 = 1;
        double abs = (d9 - Math.abs((d7 % 2) - d9)) * d8;
        if (0.0d > d7 || d7 > 1.0d) {
            if (1.0d > d7 || d7 > 2.0d) {
                if (2.0d > d7 || d7 > 3.0d) {
                    if (3.0d <= d7 && d7 <= 4.0d) {
                        d2 = d8;
                    } else if (4.0d <= d7 && d7 <= 5.0d) {
                        d2 = d8;
                        abs = 0.0d;
                        d6 = abs;
                    } else if (d7 < 5.0d || d7 >= 6.0d) {
                        abs = 0.0d;
                        d2 = 0.0d;
                    }
                    double d10 = max - d8;
                    double d11 = (double) PrivateKeyType.INVALID;
                    return Color.argb((i >> 24) & PrivateKeyType.INVALID, ((int) ((d6 + d10) * d11)) & PrivateKeyType.INVALID, ((int) ((abs + d10) * d11)) & PrivateKeyType.INVALID, ((int) ((d2 + d10) * d11)) & PrivateKeyType.INVALID);
                }
                abs = 0.0d;
                d6 = abs;
            }
            d2 = d6;
            d6 = abs;
            abs = d8;
            double d102 = max - d8;
            double d112 = (double) PrivateKeyType.INVALID;
            return Color.argb((i >> 24) & PrivateKeyType.INVALID, ((int) ((d6 + d102) * d112)) & PrivateKeyType.INVALID, ((int) ((abs + d102) * d112)) & PrivateKeyType.INVALID, ((int) ((d2 + d102) * d112)) & PrivateKeyType.INVALID);
        }
        abs = 0.0d;
        d6 = abs;
        d2 = abs;
        abs = d6;
        d6 = d8;
        double d1022 = max - d8;
        double d1122 = (double) PrivateKeyType.INVALID;
        return Color.argb((i >> 24) & PrivateKeyType.INVALID, ((int) ((d6 + d1022) * d1122)) & PrivateKeyType.INVALID, ((int) ((abs + d1022) * d1122)) & PrivateKeyType.INVALID, ((int) ((d2 + d1022) * d1122)) & PrivateKeyType.INVALID);
    }

    public static final String b(int i) {
        String hexString = Integer.toHexString(i & 16777215);
        C8632dsu.a(hexString, "");
        return hexString;
    }
}
