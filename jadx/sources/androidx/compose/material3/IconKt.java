package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.painter.Painter;

/* loaded from: classes.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m295size3ABfNKs(Modifier.Companion, IconButtonTokens.INSTANCE.m903getIconSizeD9Ej5fM());

    /* JADX WARN: Removed duplicated region for block: B:101:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0154  */
    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m792Iconww6aTOc(final androidx.compose.ui.graphics.painter.Painter r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, long r23, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.m792Iconww6aTOc(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        return modifier.then((Size.m1173equalsimpl0(painter.mo1570getIntrinsicSizeNHjbRc(), Size.Companion.m1181getUnspecifiedNHjbRc()) || m793isInfiniteuvyYCjk(painter.mo1570getIntrinsicSizeNHjbRc())) ? DefaultIconSizeModifier : Modifier.Companion);
    }

    /* renamed from: isInfinite-uvyYCjk  reason: not valid java name */
    private static final boolean m793isInfiniteuvyYCjk(long j) {
        return Float.isInfinite(Size.m1176getWidthimpl(j)) && Float.isInfinite(Size.m1174getHeightimpl(j));
    }
}
