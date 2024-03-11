package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes5.dex */
public final class Strings_androidKt {
    /* renamed from: getString-4foXLRw  reason: not valid java name */
    public static final String m657getString4foXLRw(int i, Composer composer, int i2) {
        String string;
        composer.startReplaceableGroup(-726638443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-726638443, i2, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.Companion;
        if (Strings.m646equalsimpl0(i, companion.m654getNavigationMenuUdPEhr4())) {
            string = resources.getString(R.string.navigation_menu);
        } else if (Strings.m646equalsimpl0(i, companion.m650getCloseDrawerUdPEhr4())) {
            string = resources.getString(R.string.close_drawer);
        } else if (Strings.m646equalsimpl0(i, companion.m651getCloseSheetUdPEhr4())) {
            string = resources.getString(R.string.close_sheet);
        } else if (Strings.m646equalsimpl0(i, companion.m652getDefaultErrorMessageUdPEhr4())) {
            string = resources.getString(R.string.default_error_message);
        } else if (Strings.m646equalsimpl0(i, companion.m653getExposedDropdownMenuUdPEhr4())) {
            string = resources.getString(R.string.dropdown_menu);
        } else if (Strings.m646equalsimpl0(i, companion.m656getSliderRangeStartUdPEhr4())) {
            string = resources.getString(R.string.range_start);
        } else {
            string = Strings.m646equalsimpl0(i, companion.m655getSliderRangeEndUdPEhr4()) ? resources.getString(R.string.range_end) : "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return string;
    }
}
