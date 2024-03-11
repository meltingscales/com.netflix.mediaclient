package o;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.ui.profiles.EmptyProfileStateKt$EmptyProfileState$1;
import o.C5855cKw;
import o.C8632dsu;
import o.LA;
import o.cLP;
import o.dpR;

/* loaded from: classes4.dex */
public final class cLP {
    public static final void d(drO<dpR> dro, Composer composer, final int i, final int i2) {
        Object obj;
        int i3;
        final drO<dpR> dro2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1880483194);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            obj = dro;
        } else if ((i & 14) == 0) {
            obj = dro;
            i3 = (startRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            obj = dro;
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            EmptyProfileStateKt$EmptyProfileState$1 emptyProfileStateKt$EmptyProfileState$1 = i4 != 0 ? new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.EmptyProfileStateKt$EmptyProfileState$1
                public final void b() {
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }
            } : obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1880483194, i3, -1, "com.netflix.mediaclient.ui.profiles.EmptyProfileState (EmptyProfileState.kt:30)");
            }
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(com.netflix.mediaclient.ui.R.b.D, startRestartGroup, 0);
            float dimensionResource2 = PrimitiveResources_androidKt.dimensionResource(com.netflix.mediaclient.ui.R.b.y, startRestartGroup, 0);
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m230spacedBy0680j_4 = Arrangement.INSTANCE.m230spacedBy0680j_4(androidx.compose.ui.unit.Dp.m2492constructorimpl(12));
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m276paddingqDBjuR0(companion2, dimensionResource, dimensionResource2, dimensionResource, dimensionResource2), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m230spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion3.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1009constructorimpl = Updater.m1009constructorimpl(startRestartGroup);
            Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment center = companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            drO<ComposeUiNode> constructor2 = companion3.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1009constructorimpl2 = Updater.m1009constructorimpl(startRestartGroup);
            Updater.m1013setimpl(m1009constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f = 176;
            CanvasKt.Canvas(SizeKt.m288height3ABfNKs(SizeKt.m300width3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m2492constructorimpl(f)), androidx.compose.ui.unit.Dp.m2492constructorimpl(f)), new drM<DrawScope, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.EmptyProfileStateKt$EmptyProfileState$2$1$1
                @Override // o.drM
                public /* synthetic */ dpR invoke(DrawScope drawScope) {
                    b(drawScope);
                    return dpR.c;
                }

                public final void b(DrawScope drawScope) {
                    C8632dsu.c((Object) drawScope, "");
                    DrawScope.m1547drawCircleVaOC9Bg$default(drawScope, LA.e(Token.Color.C0625hy.d), drawScope.mo193toPx0680j_4(Dp.m2492constructorimpl(78)), OffsetKt.Offset(Size.m1176getWidthimpl(drawScope.mo1562getSizeNHjbRc()) / 2.0f, Size.m1174getHeightimpl(drawScope.mo1562getSizeNHjbRc()) / 2.0f), 0.0f, null, null, 0, 120, null);
                }
            }, startRestartGroup, 54);
            Painter painterResource = PainterResources_androidKt.painterResource(C5855cKw.e.c, startRestartGroup, 0);
            float f2 = 120;
            Modifier m288height3ABfNKs = SizeKt.m288height3ABfNKs(SizeKt.m300width3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m2492constructorimpl(f2)), androidx.compose.ui.unit.Dp.m2492constructorimpl(f2));
            dro2 = emptyProfileStateKt$EmptyProfileState$1;
            ImageKt.Image(painterResource, null, m288height3ABfNKs, null, null, 0.0f, null, startRestartGroup, 440, 120);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            C1020Ln.c(StringResources_androidKt.stringResource(com.netflix.mediaclient.ui.R.o.lJ, startRestartGroup, 0), SemanticsModifierKt.semantics$default(companion2, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.EmptyProfileStateKt$EmptyProfileState$2$2
                public final void a(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    C8632dsu.c((Object) semanticsPropertyReceiver, "");
                    SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    a(semanticsPropertyReceiver);
                    return dpR.c;
                }
            }, 1, null), (Token.Color) null, (Theme) null, (Token.Typography) Token.Typography.aq.e, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, 24576, 0, 16364);
            C1020Ln.c(StringResources_androidKt.stringResource(C5855cKw.i.g, startRestartGroup, 0), (Modifier) null, (Token.Color) Token.Color.C0499df.d, (Theme) null, (Token.Typography) Token.Typography.C0690c.e, 0L, (TextDecoration) null, TextAlign.m2410boximpl(TextAlign.Companion.m2417getCentere0LSkKk()), 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, 24960, 0, 16234);
            composer2 = startRestartGroup;
            String stringResource = StringResources_androidKt.stringResource(C5855cKw.i.h, composer2, 0);
            composer2.startReplaceableGroup(1629017701);
            boolean z = (i3 & 14) == 4;
            Object rememberedValue = composer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.EmptyProfileStateKt$EmptyProfileState$2$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        e();
                        return dpR.c;
                    }

                    public final void e() {
                        dro2.invoke();
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            composer2.endReplaceableGroup();
            C5893cMg.d(null, stringResource, (drO) rememberedValue, composer2, 0, 1);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            dro2 = obj;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.EmptyProfileStateKt$EmptyProfileState$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer3, int i5) {
                    cLP.d(dro2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                    a(composer3, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
