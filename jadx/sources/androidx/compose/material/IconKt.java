package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m295size3ABfNKs(Modifier.Companion, Dp.m2492constructorimpl(24));

    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    public static final void m611Iconww6aTOc(ImageVector imageVector, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-800853103);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        long m1292copywmQWz5c$default = (i2 & 8) != 0 ? Color.m1292copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1302unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800853103, i, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        m610Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composer, i & 14), str, modifier2, m1292copywmQWz5c$default, composer, VectorPainter.$stable | (i & 112) | (i & 896) | (i & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* renamed from: Icon-ww6aTOc  reason: not valid java name */
    public static final void m610Iconww6aTOc(final Painter painter, final String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        final long j2;
        int i3;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(-1142959010);
        final Modifier modifier3 = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i2 & 8) != 0) {
            j2 = Color.m1292copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1302unboximpl(), ((Number) startRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            i3 = i & (-7169);
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1142959010, i3, -1, "androidx.compose.material.Icon (Icon.kt:134)");
        }
        Color m1284boximpl = Color.m1284boximpl(j2);
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(m1284boximpl);
        ColorFilter rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Color.m1294equalsimpl0(j2, Color.Companion.m1309getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m1312tintxETnrds$default(ColorFilter.Companion, j2, 0, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        ColorFilter colorFilter = (ColorFilter) rememberedValue;
        if (str != null) {
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(-2040376539);
            boolean changed2 = startRestartGroup.changed(str);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.material.IconKt$Icon$semantics$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                        SemanticsPropertiesKt.m2050setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m2039getImageo7Vup1c());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            modifier2 = SemanticsModifierKt.semantics$default(companion, false, (drM) rememberedValue2, 1, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier3), painter), painter, false, null, ContentScale.Companion.getFit(), 0.0f, colorFilter, 22, null).then(modifier2), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material.IconKt$Icon$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i4) {
                    IconKt.m610Iconww6aTOc(Painter.this, str, modifier3, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        return modifier.then((Size.m1173equalsimpl0(painter.mo1570getIntrinsicSizeNHjbRc(), Size.Companion.m1181getUnspecifiedNHjbRc()) || m612isInfiniteuvyYCjk(painter.mo1570getIntrinsicSizeNHjbRc())) ? DefaultIconSizeModifier : Modifier.Companion);
    }

    /* renamed from: isInfinite-uvyYCjk  reason: not valid java name */
    private static final boolean m612isInfiniteuvyYCjk(long j) {
        return Float.isInfinite(Size.m1176getWidthimpl(j)) && Float.isInfinite(Size.m1174getHeightimpl(j));
    }
}
