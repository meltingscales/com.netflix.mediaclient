package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import o.C8576dqs;
import o.drX;

/* loaded from: classes.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyVerticalGrid(final androidx.compose.foundation.lazy.grid.GridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.grid.LazyGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final o.drM<? super androidx.compose.foundation.lazy.grid.LazyGridScope, o.dpR> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, o.drM, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final LazyGridSlotsProvider rememberColumnWidthSums(final GridCells gridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(1632454918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1632454918, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(gridCells);
        boolean changed2 = composer.changed(horizontal);
        boolean changed3 = composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3) || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GridSlotCache(new drX<Density, Constraints, LazyGridSlots>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
                    return m347invoke0kLqBqw(density, constraints.m2478unboximpl());
                }

                /* renamed from: invoke-0kLqBqw  reason: not valid java name */
                public final LazyGridSlots m347invoke0kLqBqw(Density density, long j) {
                    int[] m;
                    if (Constraints.m2473getMaxWidthimpl(j) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
                    }
                    PaddingValues paddingValues2 = PaddingValues.this;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    int m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(j) - density.mo187roundToPx0680j_4(Dp.m2492constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, layoutDirection) + PaddingKt.calculateEndPadding(PaddingValues.this, layoutDirection)));
                    GridCells gridCells2 = gridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    m = C8576dqs.m(gridCells2.calculateCrossAxisCellSizes(density, m2473getMaxWidthimpl, density.mo187roundToPx0680j_4(horizontal2.mo233getSpacingD9Ej5fM())));
                    int[] iArr = new int[m.length];
                    horizontal2.arrange(density, m2473getMaxWidthimpl, m, layoutDirection, iArr);
                    return new LazyGridSlots(m, iArr);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i, int i2, int i3) {
        int i4 = i - (i3 * (i2 - 1));
        int i5 = i4 / i2;
        ArrayList arrayList = new ArrayList(i2);
        int i6 = 0;
        while (i6 < i2) {
            arrayList.add(Integer.valueOf((i6 < i4 % i2 ? 1 : 0) + i5));
            i6++;
        }
        return arrayList;
    }
}
