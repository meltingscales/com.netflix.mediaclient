package o;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import com.netflix.android.org.json.zip.JSONzip;
import o.C1033Ma;
import o.dpR;

/* renamed from: o.Ma  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1033Ma {
    private static final float b;
    private static final float d;
    private static final Modifier e;
    private static final float g;
    private static final long j = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float c = androidx.compose.ui.unit.Dp.m2492constructorimpl(12);
    private static final float f = androidx.compose.ui.unit.Dp.m2492constructorimpl(4);
    private static final float i = androidx.compose.ui.unit.Dp.m2492constructorimpl(2);
    private static final float a = androidx.compose.ui.unit.Dp.m2492constructorimpl(24);

    public static final Modifier a() {
        return e;
    }

    public static final float b() {
        return c;
    }

    public static final float c() {
        return d;
    }

    public static final float d() {
        return a;
    }

    public static final float e() {
        return b;
    }

    public static final long f() {
        return j;
    }

    public static final float g() {
        return i;
    }

    public static final float h() {
        return f;
    }

    public static final float j() {
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final com.netflix.hawkins.internal.material3.TextFieldType r42, final java.lang.String r43, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r44, final androidx.compose.ui.text.input.VisualTransformation r45, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r46, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r47, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r48, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r49, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r50, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r51, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r52, boolean r53, boolean r54, boolean r55, final androidx.compose.foundation.interaction.InteractionSource r56, final androidx.compose.foundation.layout.PaddingValues r57, final o.LZ r58, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r59, androidx.compose.runtime.Composer r60, final int r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1033Ma.d(com.netflix.hawkins.internal.material3.TextFieldType, java.lang.String, o.drX, androidx.compose.ui.text.input.VisualTransformation, o.drX, o.drX, o.drX, o.drX, o.drX, o.drX, o.drX, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, o.LZ, o.drX, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void e(final long j2, TextStyle textStyle, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i2, final int i3) {
        int i4;
        C8632dsu.c((Object) drx, "");
        Composer startRestartGroup = composer.startRestartGroup(1256708541);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(j2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(drx) ? JSONzip.end : 128;
        }
        if ((i4 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i5 != 0) {
                textStyle = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1256708541, i4, -1, "com.netflix.hawkins.internal.material3.Decoration (TextFieldImpl.kt:301)");
            }
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1172235455, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.hawkins.internal.material3.TextFieldImplKt$Decoration$contentWithColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }

                public final void b(Composer composer2, int i6) {
                    if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1172235455, i6, -1, "com.netflix.hawkins.internal.material3.Decoration.<anonymous> (TextFieldImpl.kt:303)");
                        }
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m1284boximpl(j2)), drx, composer2, ProvidedValue.$stable);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            });
            if (textStyle != null) {
                startRestartGroup.startReplaceableGroup(-1690611596);
                TextKt.ProvideTextStyle(textStyle, composableLambda, startRestartGroup, ((i4 >> 3) & 14) | 48);
            } else {
                startRestartGroup.startReplaceableGroup(-1690611544);
                composableLambda.invoke(startRestartGroup, 6);
            }
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final TextStyle textStyle2 = textStyle;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.hawkins.internal.material3.TextFieldImplKt$Decoration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void d(Composer composer2, int i6) {
                    C1033Ma.e(j2, textStyle2, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final int b(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int c(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final Object b(IntrinsicMeasurable intrinsicMeasurable) {
        C8632dsu.c((Object) intrinsicMeasurable, "");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f2 = 16;
        g = androidx.compose.ui.unit.Dp.m2492constructorimpl(f2);
        d = androidx.compose.ui.unit.Dp.m2492constructorimpl(f2);
        b = androidx.compose.ui.unit.Dp.m2492constructorimpl(f2);
        float f3 = 48;
        e = SizeKt.m286defaultMinSizeVpY3zN4(Modifier.Companion, androidx.compose.ui.unit.Dp.m2492constructorimpl(f3), androidx.compose.ui.unit.Dp.m2492constructorimpl(f3));
    }
}
