package androidx.compose.ui.res;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public final class ColorResources_androidKt {
    public static final long colorResource(int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1777644873, i2, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:36)");
        }
        long m2019getColorWaAFU9c = ColorResourceHelper.INSTANCE.m2019getColorWaAFU9c((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2019getColorWaAFU9c;
    }
}
