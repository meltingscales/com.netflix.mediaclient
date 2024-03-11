package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import java.util.Collection;
import java.util.List;
import o.C8569dql;
import o.C8576dqs;

/* loaded from: classes.dex */
public final class AndroidShader_androidKt {
    /* renamed from: ActualLinearGradientShader-VjE6UOU  reason: not valid java name */
    public static final Shader m1224ActualLinearGradientShaderVjE6UOU(long j, long j2, List<Color> list, List<Float> list2, int i) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.LinearGradient(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j), Offset.m1137getXimpl(j2), Offset.m1138getYimpl(j2), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m1225toAndroidTileMode0vamqd0(i));
    }

    public static final int countTransparentColors(List<Color> list) {
        int t;
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        t = C8569dql.t(list);
        for (int i2 = 1; i2 < t; i2++) {
            if (Color.m1295getAlphaimpl(list.get(i2).m1302unboximpl()) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static final int[] makeTransparentColors(List<Color> list, int i) {
        int t;
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = ColorKt.m1317toArgb8_81llA(list.get(i3).m1302unboximpl());
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        t = C8569dql.t(list);
        int size2 = list.size();
        int i4 = 0;
        while (i3 < size2) {
            long m1302unboximpl = list.get(i3).m1302unboximpl();
            if (Color.m1295getAlphaimpl(m1302unboximpl) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m1317toArgb8_81llA(Color.m1292copywmQWz5c$default(list.get(1).m1302unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i3 == t) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m1317toArgb8_81llA(Color.m1292copywmQWz5c$default(list.get(i3 - 1).m1302unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    iArr2[i4] = ColorKt.m1317toArgb8_81llA(Color.m1292copywmQWz5c$default(list.get(i3 - 1).m1302unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i2 = i4 + 2;
                    iArr2[i4 + 1] = ColorKt.m1317toArgb8_81llA(Color.m1292copywmQWz5c$default(list.get(i3 + 1).m1302unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i4 = i2;
            } else {
                iArr2[i4] = ColorKt.m1317toArgb8_81llA(m1302unboximpl);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    public static final float[] makeTransparentStops(List<Float> list, List<Color> list2, int i) {
        int t;
        float f;
        int t2;
        int t3;
        float f2;
        float[] o2;
        if (i == 0) {
            if (list != null) {
                o2 = C8576dqs.o((Collection<Float>) list);
                return o2;
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        t = C8569dql.t(list2);
        int i2 = 1;
        for (int i3 = 1; i3 < t; i3++) {
            long m1302unboximpl = list2.get(i3).m1302unboximpl();
            if (list != null) {
                f2 = list.get(i3).floatValue();
            } else {
                t3 = C8569dql.t(list2);
                f2 = i3 / t3;
            }
            int i4 = i2 + 1;
            fArr[i2] = f2;
            if (Color.m1295getAlphaimpl(m1302unboximpl) == 0.0f) {
                i2 += 2;
                fArr[i4] = f2;
            } else {
                i2 = i4;
            }
        }
        if (list != null) {
            t2 = C8569dql.t(list2);
            f = list.get(t2).floatValue();
        } else {
            f = 1.0f;
        }
        fArr[i2] = f;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
