package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class KeyboardArrowDownKt {
    private static ImageVector _keyboardArrowDown;

    public static final ImageVector getKeyboardArrowDown(Icons.Filled filled) {
        ImageVector.Builder m1583addPathoIyEayM;
        ImageVector imageVector = _keyboardArrowDown;
        if (imageVector != null) {
            C8632dsu.d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.KeyboardArrowDown", Dp.m2492constructorimpl(24.0f), Dp.m2492constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m1303getBlack0d7_KjU(), null);
        int m1448getButtKaPHkGw = StrokeCap.Companion.m1448getButtKaPHkGw();
        int m1457getBevelLxFBmk8 = StrokeJoin.Companion.m1457getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.41f, 8.59f);
        pathBuilder.lineTo(12.0f, 13.17f);
        pathBuilder.lineToRelative(4.59f, -4.58f);
        pathBuilder.lineTo(18.0f, 10.0f);
        pathBuilder.lineToRelative(-6.0f, 6.0f);
        pathBuilder.lineToRelative(-6.0f, -6.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.close();
        m1583addPathoIyEayM = builder.m1583addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & JSONzip.end) != 0 ? VectorKt.getDefaultStrokeLineCap() : m1448getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m1457getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m1583addPathoIyEayM.build();
        _keyboardArrowDown = build;
        C8632dsu.d(build);
        return build;
    }
}
