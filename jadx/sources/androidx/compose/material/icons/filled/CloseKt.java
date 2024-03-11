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
public final class CloseKt {
    private static ImageVector _close;

    public static final ImageVector getClose(Icons.Filled filled) {
        ImageVector.Builder m1583addPathoIyEayM;
        ImageVector imageVector = _close;
        if (imageVector != null) {
            C8632dsu.d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Close", Dp.m2492constructorimpl(24.0f), Dp.m2492constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m1303getBlack0d7_KjU(), null);
        int m1448getButtKaPHkGw = StrokeCap.Companion.m1448getButtKaPHkGw();
        int m1457getBevelLxFBmk8 = StrokeJoin.Companion.m1457getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 6.41f);
        pathBuilder.lineTo(17.59f, 5.0f);
        pathBuilder.lineTo(12.0f, 10.59f);
        pathBuilder.lineTo(6.41f, 5.0f);
        pathBuilder.lineTo(5.0f, 6.41f);
        pathBuilder.lineTo(10.59f, 12.0f);
        pathBuilder.lineTo(5.0f, 17.59f);
        pathBuilder.lineTo(6.41f, 19.0f);
        pathBuilder.lineTo(12.0f, 13.41f);
        pathBuilder.lineTo(17.59f, 19.0f);
        pathBuilder.lineTo(19.0f, 17.59f);
        pathBuilder.lineTo(13.41f, 12.0f);
        pathBuilder.close();
        m1583addPathoIyEayM = builder.m1583addPathoIyEayM(pathBuilder.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : "", (r30 & 8) != 0 ? null : solidColor, (r30 & 16) != 0 ? 1.0f : 1.0f, (r30 & 32) == 0 ? null : null, (r30 & 64) != 0 ? 1.0f : 1.0f, (r30 & 128) != 0 ? 0.0f : 1.0f, (r30 & JSONzip.end) != 0 ? VectorKt.getDefaultStrokeLineCap() : m1448getButtKaPHkGw, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : m1457getBevelLxFBmk8, (r30 & 1024) != 0 ? 4.0f : 1.0f, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        ImageVector build = m1583addPathoIyEayM.build();
        _close = build;
        C8632dsu.d(build);
        return build;
    }
}
