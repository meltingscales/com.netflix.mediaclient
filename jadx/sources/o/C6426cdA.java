package o;

import android.graphics.Color;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.cdA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6426cdA {
    public static final C6432cdG e(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        return new C6432cdG(fArr[0], fArr[1], fArr[2], (i >> 24) & PrivateKeyType.INVALID);
    }
}
