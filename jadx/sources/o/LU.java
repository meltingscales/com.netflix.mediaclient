package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.netflix.hawkins.consumer.component.input.HawkinsInputSize;
import o.LU;
import o.dpR;

/* loaded from: classes3.dex */
public final class LU {
    private static final ProvidableCompositionLocal<HawkinsInputSize> e = CompositionLocalKt.staticCompositionLocalOf(new drO<HawkinsInputSize>() { // from class: com.netflix.hawkins.internal.hawkins.HawkinsTextFieldImplKt$LocalHawkinsInputSize$1
        @Override // o.drO
        /* renamed from: e */
        public final HawkinsInputSize invoke() {
            return HawkinsInputSize.e;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:109:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.foundation.interaction.InteractionSource r33, final androidx.compose.foundation.layout.PaddingValues r34, final o.LZ r35, final boolean r36, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r37, final o.InterfaceC8612dsa<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r38, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r39, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r40, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r41, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r42, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r43, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r44, final float r45, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r46, androidx.compose.ui.Modifier r47, boolean r48, boolean r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LU.a(androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, o.LZ, boolean, o.drX, o.dsa, o.drX, o.drX, o.drX, o.drX, o.drX, o.drX, float, o.drX, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void c(final HawkinsInputSize hawkinsInputSize, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i, final int i2) {
        int i3;
        C8632dsu.c((Object) drx, "");
        Composer startRestartGroup = composer.startRestartGroup(-119999617);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(hawkinsInputSize) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(drx) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                hawkinsInputSize = HawkinsInputSize.e;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-119999617, i3, -1, "com.netflix.hawkins.internal.hawkins.ProvideHawkinsInputSize (HawkinsTextFieldImpl.kt:81)");
            }
            CompositionLocalKt.CompositionLocalProvider(e.provides(hawkinsInputSize), drx, startRestartGroup, ProvidedValue.$stable | (i3 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.hawkins.internal.hawkins.HawkinsTextFieldImplKt$ProvideHawkinsInputSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i5) {
                    LU.c(HawkinsInputSize.this, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
