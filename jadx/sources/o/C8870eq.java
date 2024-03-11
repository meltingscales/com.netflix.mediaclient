package o;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.eq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8870eq implements InterfaceC8846eS<C7670dB> {
    private int e;

    public C8870eq(int i) {
        this.e = i;
    }

    @Override // o.InterfaceC8846eS
    /* renamed from: a */
    public C7670dB d(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.l() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.c();
        }
        while (jsonReader.f()) {
            arrayList.add(Float.valueOf((float) jsonReader.g()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.e = 2;
        }
        if (z) {
            jsonReader.a();
        }
        if (this.e == -1) {
            this.e = arrayList.size() / 4;
        }
        int i = this.e;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.e * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb((int) PrivateKeyType.INVALID, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        return e(new C7670dB(fArr, iArr), arrayList);
    }

    private C7670dB e(C7670dB c7670dB, List<Float> list) {
        int i = this.e * 4;
        if (list.size() <= i) {
            return c7670dB;
        }
        float[] c = c7670dB.c();
        int[] e = c7670dB.e();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] c2 = c(c7670dB.c(), fArr);
        int length = c2.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = c2[i3];
            int binarySearch = Arrays.binarySearch(c, f);
            int binarySearch2 = Arrays.binarySearch(fArr, f);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i3] = b(f, fArr2[binarySearch2], c, e);
            } else {
                iArr[i3] = d(f, e[binarySearch], fArr, fArr2);
            }
        }
        return new C7670dB(c2, iArr);
    }

    int b(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 >= f || i == fArr.length - 1) {
                int i2 = i - 1;
                float f4 = fArr[i2];
                float f5 = (f - f4) / (f3 - f4);
                int i3 = iArr[i];
                int i4 = iArr[i2];
                return Color.argb((int) (f2 * 255.0f), C8851eX.c(f5, Color.red(i4), Color.red(i3)), C8851eX.c(f5, Color.green(i4), Color.green(i3)), C8851eX.c(f5, Color.blue(i4), Color.blue(i3)));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private int d(float f, int i, float[] fArr, float[] fArr2) {
        float b;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            int i3 = (f2 > f ? 1 : (f2 == f ? 0 : -1));
            if (i3 >= 0 || i2 == fArr.length - 1) {
                if (i3 <= 0) {
                    b = fArr2[i2];
                } else {
                    int i4 = i2 - 1;
                    float f3 = fArr[i4];
                    b = C8853eZ.b(fArr2[i4], fArr2[i2], (f - f3) / (f2 - f3));
                }
                return Color.argb((int) (b * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    protected static float[] c(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (Float.isNaN(f2) || f < f2) {
                fArr3[i4] = f;
                i2++;
            } else if (Float.isNaN(f) || f2 < f) {
                fArr3[i4] = f2;
                i3++;
            } else {
                fArr3[i4] = f;
                i2++;
                i3++;
                i++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }
}
