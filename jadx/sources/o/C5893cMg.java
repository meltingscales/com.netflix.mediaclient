package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import kotlin.Pair;
import o.C1020Ln;
import o.C5889cMc;
import o.C5893cMg;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* renamed from: o.cMg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5893cMg {
    public static final void e(final C5889cMc.d dVar, Composer composer, final int i) {
        int i2;
        C8632dsu.c((Object) dVar, "");
        Composer startRestartGroup = composer.startRestartGroup(-373520032);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-373520032, i2, -1, "com.netflix.mediaclient.ui.profiles.EmptyState (MyNetflixEmptyStateManager.kt:127)");
            }
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(com.netflix.mediaclient.ui.R.b.D, startRestartGroup, 0);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m277paddingqDBjuR0$default(BackgroundKt.m110backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m277paddingqDBjuR0$default(Modifier.Companion, dimensionResource, PrimitiveResources_androidKt.dimensionResource(com.netflix.mediaclient.ui.R.b.y, startRestartGroup, 0), dimensionResource, 0.0f, 8, null), RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m2492constructorimpl(4))), LA.c(Token.Color.C0511ds.d, startRestartGroup, 6), null, 2, null), 0.0f, dimensionResource, dimensionResource, dimensionResource, 1, null), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(-270267587);
            startRestartGroup.startReplaceableGroup(-3687241);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new Measurer();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final Measurer measurer = (Measurer) rememberedValue;
            startRestartGroup.startReplaceableGroup(-3687241);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new ConstraintLayoutScope();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-3687241);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Pair<MeasurePolicy, drO<dpR>> rememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState) rememberedValue3, measurer, startRestartGroup, 4544);
            MeasurePolicy b = rememberConstraintLayoutMeasurePolicy.b();
            final drO<dpR> c = rememberConstraintLayoutMeasurePolicy.c();
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(fillMaxWidth$default, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManagerKt$EmptyState$$inlined$ConstraintLayout$1
                {
                    super(1);
                }

                public final void e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    C8632dsu.c((Object) semanticsPropertyReceiver, "");
                    ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, Measurer.this);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    e(semanticsPropertyReceiver);
                    return dpR.c;
                }
            }, 1, null), ComposableLambdaKt.composableLambda(startRestartGroup, -819894182, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManagerKt$EmptyState$$inlined$ConstraintLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }

                public final void b(Composer composer2, int i3) {
                    if (((i3 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                        int helpersHashCode = ConstraintLayoutScope.this.getHelpersHashCode();
                        ConstraintLayoutScope.this.reset();
                        ConstraintLayoutScope constraintLayoutScope2 = ConstraintLayoutScope.this;
                        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                        final ConstrainedLayoutReference component1 = createRefs.component1();
                        final ConstrainedLayoutReference component2 = createRefs.component2();
                        final ConstrainedLayoutReference component3 = createRefs.component3();
                        ConstrainedLayoutReference component4 = createRefs.component4();
                        Painter painterResource = PainterResources_androidKt.painterResource(dVar.d(), composer2, 0);
                        Modifier.Companion companion2 = Modifier.Companion;
                        float f = 72;
                        ImageKt.Image(painterResource, null, constraintLayoutScope2.constrainAs(PaddingKt.m273padding3ABfNKs(SizeKt.m300width3ABfNKs(SizeKt.m288height3ABfNKs(companion2, Dp.m2492constructorimpl(f)), Dp.m2492constructorimpl(f)), Dp.m2492constructorimpl(8)), component1, new drM<ConstrainScope, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManagerKt$EmptyState$1$1
                            @Override // o.drM
                            public /* synthetic */ dpR invoke(ConstrainScope constrainScope) {
                                a(constrainScope);
                                return dpR.c;
                            }

                            public final void a(ConstrainScope constrainScope) {
                                C8632dsu.c((Object) constrainScope, "");
                                VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m2607linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
                            }
                        }), null, null, 0.0f, null, composer2, 56, 120);
                        String stringResource = StringResources_androidKt.stringResource(dVar.b(), composer2, 0);
                        Token.Typography.ax axVar = Token.Typography.ax.d;
                        TextAlign.Companion companion3 = TextAlign.Companion;
                        int m2422getStarte0LSkKk = companion3.m2422getStarte0LSkKk();
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion2, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManagerKt$EmptyState$1$2
                            public final void e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                C8632dsu.c((Object) semanticsPropertyReceiver, "");
                                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                e(semanticsPropertyReceiver);
                                return dpR.c;
                            }
                        }, 1, null);
                        composer2.startReplaceableGroup(277998239);
                        boolean changed = composer2.changed(component1);
                        Object rememberedValue4 = composer2.rememberedValue();
                        if (changed || rememberedValue4 == Composer.Companion.getEmpty()) {
                            rememberedValue4 = new drM<ConstrainScope, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManagerKt$EmptyState$1$3$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(ConstrainScope constrainScope) {
                                    e(constrainScope);
                                    return dpR.c;
                                }

                                public final void e(ConstrainScope constrainScope) {
                                    C8632dsu.c((Object) constrainScope, "");
                                    VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getStart(), ConstrainedLayoutReference.this.getEnd(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                    HorizontalAnchorable.DefaultImpls.m2607linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                    constrainScope.setWidth(Dimension.Companion.getFillToConstraints());
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        C1020Ln.c(stringResource, constraintLayoutScope2.constrainAs(semantics$default, component2, (drM) rememberedValue4), (Token.Color) null, (Theme) null, (Token.Typography) axVar, 0L, (TextDecoration) null, TextAlign.m2410boximpl(m2422getStarte0LSkKk), 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, composer2, 24576, 0, 16236);
                        String stringResource2 = StringResources_androidKt.stringResource(dVar.e(), composer2, 0);
                        Token.Typography.C0690c c0690c = Token.Typography.C0690c.e;
                        Token.Color.C0499df c0499df = Token.Color.C0499df.d;
                        int m2422getStarte0LSkKk2 = companion3.m2422getStarte0LSkKk();
                        float f2 = 10;
                        Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(companion2, 0.0f, Dp.m2492constructorimpl(f2), 0.0f, Dp.m2492constructorimpl(f2), 5, null);
                        composer2.startReplaceableGroup(277998806);
                        boolean changed2 = composer2.changed(component2);
                        Object rememberedValue5 = composer2.rememberedValue();
                        if (changed2 || rememberedValue5 == Composer.Companion.getEmpty()) {
                            rememberedValue5 = new drM<ConstrainScope, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManagerKt$EmptyState$1$4$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(ConstrainScope constrainScope) {
                                    c(constrainScope);
                                    return dpR.c;
                                }

                                public final void c(ConstrainScope constrainScope) {
                                    C8632dsu.c((Object) constrainScope, "");
                                    VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getStart(), ConstrainedLayoutReference.this.getStart(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                    HorizontalAnchorable.DefaultImpls.m2607linkToVpY3zN4$default(constrainScope.getTop(), ConstrainedLayoutReference.this.getBottom(), 0.0f, 0.0f, 6, null);
                                    constrainScope.setWidth(Dimension.Companion.getFillToConstraints());
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        composer2.endReplaceableGroup();
                        C1020Ln.c(stringResource2, constraintLayoutScope2.constrainAs(m277paddingqDBjuR0$default, component3, (drM) rememberedValue5), (Token.Color) c0499df, (Theme) null, (Token.Typography) c0690c, 0L, (TextDecoration) null, TextAlign.m2410boximpl(m2422getStarte0LSkKk2), 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, composer2, 24960, 0, 16232);
                        composer2.startReplaceableGroup(277999101);
                        boolean changed3 = composer2.changed(component2);
                        boolean changed4 = composer2.changed(component3);
                        Object rememberedValue6 = composer2.rememberedValue();
                        if ((changed3 | changed4) || rememberedValue6 == Composer.Companion.getEmpty()) {
                            rememberedValue6 = new drM<ConstrainScope, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManagerKt$EmptyState$1$5$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(ConstrainScope constrainScope) {
                                    e(constrainScope);
                                    return dpR.c;
                                }

                                public final void e(ConstrainScope constrainScope) {
                                    C8632dsu.c((Object) constrainScope, "");
                                    VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getStart(), ConstrainedLayoutReference.this.getStart(), 0.0f, 0.0f, 6, null);
                                    HorizontalAnchorable.DefaultImpls.m2607linkToVpY3zN4$default(constrainScope.getTop(), component3.getBottom(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getEnd(), ConstrainedLayoutReference.this.getEnd(), 0.0f, 0.0f, 6, null);
                                    constrainScope.setWidth(Dimension.Companion.getFillToConstraints());
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        composer2.endReplaceableGroup();
                        Modifier constrainAs = constraintLayoutScope2.constrainAs(companion2, component4, (drM) rememberedValue6);
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                        drO<ComposeUiNode> constructor = companion4.getConstructor();
                        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(constrainAs);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m1009constructorimpl = Updater.m1009constructorimpl(composer2);
                        Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        C5893cMg.d(null, StringResources_androidKt.stringResource(dVar.c(), composer2, 0), dVar.a(), composer2, 0, 1);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ConstraintLayoutScope.this.getHelpersHashCode() != helpersHashCode) {
                            c.invoke();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), b, startRestartGroup, 48, 0);
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixEmptyStateManagerKt$EmptyState$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i3) {
                    C5893cMg.e(C5889cMc.d.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.Modifier r16, java.lang.String r17, o.drO<o.dpR> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5893cMg.d(androidx.compose.ui.Modifier, java.lang.String, o.drO, androidx.compose.runtime.Composer, int, int):void");
    }
}
