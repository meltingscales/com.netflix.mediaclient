package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import o.C8657dts;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class TextFieldSizeKt {
    public static final Modifier textFieldMinSize(Modifier modifier, final TextStyle textStyle) {
        return ComposedModifierKt.composed$default(modifier, null, new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.Composer] */
            /* JADX WARN: Type inference failed for: r2v9 */
            /* JADX WARN: Type inference failed for: r4v2 */
            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceableGroup(1582736677);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1582736677, i, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:38)");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                TextStyle textStyle2 = TextStyle.this;
                composer.startReplaceableGroup(511388516);
                boolean changed = composer.changed(textStyle2);
                boolean changed2 = composer.changed(layoutDirection);
                Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = TextStyleKt.resolveDefaults(textStyle2, layoutDirection);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                TextStyle textStyle3 = rememberedValue;
                composer.startReplaceableGroup(511388516);
                boolean changed3 = composer.changed(resolver);
                boolean changed4 = composer.changed(textStyle3);
                Object rememberedValue2 = composer.rememberedValue();
                if ((changed3 | changed4) || rememberedValue2 == Composer.Companion.getEmpty()) {
                    FontFamily fontFamily = textStyle3.getFontFamily();
                    FontWeight fontWeight = textStyle3.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.Companion.getNormal();
                    }
                    FontStyle m2171getFontStyle4Lr2A7w = textStyle3.m2171getFontStyle4Lr2A7w();
                    int m2220unboximpl = m2171getFontStyle4Lr2A7w != null ? m2171getFontStyle4Lr2A7w.m2220unboximpl() : FontStyle.Companion.m2222getNormal_LCdwA();
                    FontSynthesis m2172getFontSynthesisZQGJjVo = textStyle3.m2172getFontSynthesisZQGJjVo();
                    rememberedValue2 = resolver.mo2201resolveDPcqOEQ(fontFamily, fontWeight, m2220unboximpl, m2172getFontSynthesisZQGJjVo != null ? m2172getFontSynthesisZQGJjVo.m2231unboximpl() : FontSynthesis.Companion.m2232getAllGVVA2EU());
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                State state = rememberedValue2;
                TextStyle textStyle4 = TextStyle.this;
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue3 = composer.rememberedValue();
                TextFieldSize textFieldSize = rememberedValue3;
                if (rememberedValue3 == Composer.Companion.getEmpty()) {
                    TextFieldSize textFieldSize2 = new TextFieldSize(layoutDirection, density, resolver, textStyle4, state.getValue());
                    composer.updateRememberedValue(textFieldSize2);
                    textFieldSize = textFieldSize2;
                }
                composer.endReplaceableGroup();
                final TextFieldSize textFieldSize3 = (TextFieldSize) textFieldSize;
                textFieldSize3.update(layoutDirection, density, resolver, textStyle3, state.getValue());
                Modifier layout = LayoutModifierKt.layout(Modifier.Companion, new InterfaceC8612dsa<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1.1
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m472invoke3p2s80s(measureScope, measurable, constraints.m2478unboximpl());
                    }

                    /* renamed from: invoke-3p2s80s  reason: not valid java name */
                    public final MeasureResult m472invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                        int c;
                        int c2;
                        SizeKt.m287defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, 0.0f, 3, null);
                        long m471getMinSizeYbymL2g = TextFieldSize.this.m471getMinSizeYbymL2g();
                        c = C8657dts.c(IntSize.m2547getWidthimpl(m471getMinSizeYbymL2g), Constraints.m2475getMinWidthimpl(j), Constraints.m2473getMaxWidthimpl(j));
                        c2 = C8657dts.c(IntSize.m2546getHeightimpl(m471getMinSizeYbymL2g), Constraints.m2474getMinHeightimpl(j), Constraints.m2472getMaxHeightimpl(j));
                        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(Constraints.m2464copyZbe2FdA$default(j, c, 0, c2, 0, 10, null));
                        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1.1.1
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return dpR.c;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                });
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return layout;
            }
        }, 1, null);
    }
}
