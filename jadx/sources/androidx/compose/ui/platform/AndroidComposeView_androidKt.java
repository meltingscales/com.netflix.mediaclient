package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.unit.LayoutDirection;
import o.drM;

/* loaded from: classes.dex */
public final class AndroidComposeView_androidKt {
    private static drM<? super PlatformTextInputService, ? extends PlatformTextInputService> platformTextInputServiceInterceptor = new drM<PlatformTextInputService, PlatformTextInputService>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // o.drM
        public final PlatformTextInputService invoke(PlatformTextInputService platformTextInputService) {
            return platformTextInputService;
        }
    };

    public static final drM<PlatformTextInputService, PlatformTextInputService> getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    public static final LayoutDirection getLocaleLayoutDirection(Configuration configuration) {
        return layoutDirectionFromInt(configuration.getLayoutDirection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutDirection layoutDirectionFromInt(int i) {
        if (i != 0) {
            if (i == 1) {
                return LayoutDirection.Rtl;
            }
            return LayoutDirection.Ltr;
        }
        return LayoutDirection.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E  reason: not valid java name */
    public static final void m1982preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float m1981dotp89u6pk = m1981dotp89u6pk(fArr2, 0, fArr, 0);
        float m1981dotp89u6pk2 = m1981dotp89u6pk(fArr2, 0, fArr, 1);
        float m1981dotp89u6pk3 = m1981dotp89u6pk(fArr2, 0, fArr, 2);
        float m1981dotp89u6pk4 = m1981dotp89u6pk(fArr2, 0, fArr, 3);
        float m1981dotp89u6pk5 = m1981dotp89u6pk(fArr2, 1, fArr, 0);
        float m1981dotp89u6pk6 = m1981dotp89u6pk(fArr2, 1, fArr, 1);
        float m1981dotp89u6pk7 = m1981dotp89u6pk(fArr2, 1, fArr, 2);
        float m1981dotp89u6pk8 = m1981dotp89u6pk(fArr2, 1, fArr, 3);
        float m1981dotp89u6pk9 = m1981dotp89u6pk(fArr2, 2, fArr, 0);
        float m1981dotp89u6pk10 = m1981dotp89u6pk(fArr2, 2, fArr, 1);
        float m1981dotp89u6pk11 = m1981dotp89u6pk(fArr2, 2, fArr, 2);
        float m1981dotp89u6pk12 = m1981dotp89u6pk(fArr2, 2, fArr, 3);
        float m1981dotp89u6pk13 = m1981dotp89u6pk(fArr2, 3, fArr, 0);
        float m1981dotp89u6pk14 = m1981dotp89u6pk(fArr2, 3, fArr, 1);
        float m1981dotp89u6pk15 = m1981dotp89u6pk(fArr2, 3, fArr, 2);
        float m1981dotp89u6pk16 = m1981dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = m1981dotp89u6pk;
        fArr[1] = m1981dotp89u6pk2;
        fArr[2] = m1981dotp89u6pk3;
        fArr[3] = m1981dotp89u6pk4;
        fArr[4] = m1981dotp89u6pk5;
        fArr[5] = m1981dotp89u6pk6;
        fArr[6] = m1981dotp89u6pk7;
        fArr[7] = m1981dotp89u6pk8;
        fArr[8] = m1981dotp89u6pk9;
        fArr[9] = m1981dotp89u6pk10;
        fArr[10] = m1981dotp89u6pk11;
        fArr[11] = m1981dotp89u6pk12;
        fArr[12] = m1981dotp89u6pk13;
        fArr[13] = m1981dotp89u6pk14;
        fArr[14] = m1981dotp89u6pk15;
        fArr[15] = m1981dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTranslate-cG2Xzmc  reason: not valid java name */
    public static final void m1983preTranslatecG2Xzmc(float[] fArr, float f, float f2, float[] fArr2) {
        Matrix.m1375resetimpl(fArr2);
        Matrix.m1381translateimpl$default(fArr2, f, f2, 0.0f, 4, null);
        m1982preTransformJiSxe2E(fArr, fArr2);
    }

    /* renamed from: dot-p89u6pk  reason: not valid java name */
    private static final float m1981dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[i2 + 4]) + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }
}
