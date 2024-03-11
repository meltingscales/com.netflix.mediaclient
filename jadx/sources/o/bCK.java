package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.AspectRatioKt;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonSize;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonType;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import kotlin.Pair;
import o.AbstractC1010Ld;
import o.C1008Lb;
import o.C1020Ln;
import o.C1333Xq;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.KE;
import o.KM;
import o.LA;
import o.VW;
import o.bBM;
import o.bCF;
import o.bCG;
import o.bCK;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class bCK {
    public static final void b(final VW vw, final drO<dpR> dro, Modifier modifier, HawkinsButtonSize hawkinsButtonSize, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) vw, "");
        C8632dsu.c((Object) dro, "");
        Composer startRestartGroup = composer.startRestartGroup(-125627440);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        HawkinsButtonSize hawkinsButtonSize2 = (i2 & 8) != 0 ? HawkinsButtonSize.c : hawkinsButtonSize;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-125627440, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeImageContainer (EpisodeImageContainer.kt:41)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-270267587);
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = new Measurer();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        final Measurer measurer = (Measurer) rememberedValue;
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new ConstraintLayoutScope();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        Pair<MeasurePolicy, drO<dpR>> rememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState) rememberedValue3, measurer, startRestartGroup, 4544);
        MeasurePolicy b = rememberConstraintLayoutMeasurePolicy.b();
        final drO<dpR> c = rememberConstraintLayoutMeasurePolicy.c();
        final HawkinsButtonSize hawkinsButtonSize3 = hawkinsButtonSize2;
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(fillMaxWidth$default, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeImageContainerKt$EpisodeImageContainer$$inlined$ConstraintLayout$1
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
        }, 1, null), ComposableLambdaKt.composableLambda(startRestartGroup, -819894182, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeImageContainerKt$EpisodeImageContainer$$inlined$ConstraintLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                c(composer2, num.intValue());
                return dpR.c;
            }

            /* JADX WARN: Type inference failed for: r13v11 */
            /* JADX WARN: Type inference failed for: r13v2 */
            /* JADX WARN: Type inference failed for: r13v3, types: [int, boolean] */
            public final void c(Composer composer2, int i3) {
                Modifier.Companion companion3;
                final ConstrainedLayoutReference constrainedLayoutReference;
                ?? r13;
                int i4;
                Modifier.Companion companion4;
                ConstrainedLayoutReference constrainedLayoutReference2;
                ConstrainedLayoutReference constrainedLayoutReference3;
                ConstraintLayoutScope constraintLayoutScope2;
                if (((i3 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                    int helpersHashCode = ConstraintLayoutScope.this.getHelpersHashCode();
                    ConstraintLayoutScope.this.reset();
                    ConstraintLayoutScope constraintLayoutScope3 = ConstraintLayoutScope.this;
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope3.createRefs();
                    ConstrainedLayoutReference component1 = createRefs.component1();
                    ConstrainedLayoutReference component2 = createRefs.component2();
                    ConstrainedLayoutReference component3 = createRefs.component3();
                    final ConstrainedLayoutReference component4 = createRefs.component4();
                    String d = vw.d();
                    ContentScale fit = ContentScale.Companion.getFit();
                    Modifier.Companion companion5 = Modifier.Companion;
                    Modifier constrainAs = constraintLayoutScope3.constrainAs(ClipKt.clip(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 1.77f, false, 2, null), RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(Dp.m2492constructorimpl(4))), component1, new drM<ConstrainScope, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeImageContainerKt$EpisodeImageContainer$1$1
                        @Override // o.drM
                        public /* synthetic */ dpR invoke(ConstrainScope constrainScope) {
                            d(constrainScope);
                            return dpR.c;
                        }

                        public final void d(ConstrainScope constrainScope) {
                            C8632dsu.c((Object) constrainScope, "");
                            VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getStart(), constrainScope.getParent().getStart(), 0.0f, 0.0f, 6, null);
                            HorizontalAnchorable.DefaultImpls.m2607linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
                        }
                    });
                    bCG bcg = bCG.b;
                    KM.d(d, null, constrainAs, null, bcg.b(), bcg.a(), null, fit, 0.0f, null, 0, composer2, 12804144, 0, 1864);
                    composer2.startReplaceableGroup(-408053194);
                    if (vw.m()) {
                        HawkinsIcon.gG gGVar = HawkinsIcon.gG.e;
                        HawkinsButtonType hawkinsButtonType = HawkinsButtonType.a;
                        composer2.startReplaceableGroup(-408052865);
                        constrainedLayoutReference = component1;
                        boolean changed = composer2.changed(constrainedLayoutReference);
                        Object rememberedValue4 = composer2.rememberedValue();
                        if (changed || rememberedValue4 == Composer.Companion.getEmpty()) {
                            rememberedValue4 = new drM<ConstrainScope, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeImageContainerKt$EpisodeImageContainer$1$2$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(ConstrainScope constrainScope) {
                                    b(constrainScope);
                                    return dpR.c;
                                }

                                public final void b(ConstrainScope constrainScope) {
                                    C8632dsu.c((Object) constrainScope, "");
                                    VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getStart(), ConstrainedLayoutReference.this.getStart(), 0.0f, 0.0f, 6, null);
                                    HorizontalAnchorable.DefaultImpls.m2607linkToVpY3zN4$default(constrainScope.getTop(), ConstrainedLayoutReference.this.getTop(), 0.0f, 0.0f, 6, null);
                                    HorizontalAnchorable.DefaultImpls.m2607linkToVpY3zN4$default(constrainScope.getBottom(), ConstrainedLayoutReference.this.getBottom(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getEnd(), ConstrainedLayoutReference.this.getEnd(), 0.0f, 0.0f, 6, null);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        companion3 = companion5;
                        Modifier constrainAs2 = constraintLayoutScope3.constrainAs(companion3, component2, (drM) rememberedValue4);
                        String c2 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.q, composer2, 0)).d("episodeNumber", Integer.valueOf(vw.e())).d("episodeName", vw.a()).c();
                        drO dro2 = dro;
                        HawkinsButtonSize hawkinsButtonSize4 = hawkinsButtonSize3;
                        int i5 = i;
                        r13 = 0;
                        KE.d(hawkinsButtonType, dro2, gGVar, c2, constrainAs2, null, hawkinsButtonSize4, false, composer2, (i5 & 112) | 390 | ((i5 << 9) & 3670016), 160);
                    } else {
                        companion3 = companion5;
                        constrainedLayoutReference = component1;
                        r13 = 0;
                    }
                    composer2.endReplaceableGroup();
                    String e = bCF.e(vw.c(), composer2, r13);
                    final int i6 = vw.i();
                    composer2.startReplaceableGroup(-408052041);
                    if (e.length() > 0) {
                        float f = 6;
                        Modifier m109backgroundbw27NRU = BackgroundKt.m109backgroundbw27NRU(companion3, LA.c(Token.Color.cX.b, composer2, 6), RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(Dp.m2492constructorimpl(f)));
                        composer2.startReplaceableGroup(-408051716);
                        boolean changed2 = composer2.changed(constrainedLayoutReference);
                        boolean changed3 = composer2.changed(i6);
                        boolean changed4 = composer2.changed(component4);
                        Object rememberedValue5 = composer2.rememberedValue();
                        if ((changed2 | changed3 | changed4) || rememberedValue5 == Composer.Companion.getEmpty()) {
                            rememberedValue5 = new drM<ConstrainScope, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeImageContainerKt$EpisodeImageContainer$1$3$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(ConstrainScope constrainScope) {
                                    a(constrainScope);
                                    return dpR.c;
                                }

                                public final void a(ConstrainScope constrainScope) {
                                    C8632dsu.c((Object) constrainScope, "");
                                    VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getStart(), ConstrainedLayoutReference.this.getStart(), 0.0f, 0.0f, 6, null);
                                    if (i6 > 0) {
                                        HorizontalAnchorable.DefaultImpls.m2607linkToVpY3zN4$default(constrainScope.getBottom(), component4.getTop(), 0.0f, 0.0f, 6, null);
                                    } else {
                                        HorizontalAnchorable.DefaultImpls.m2607linkToVpY3zN4$default(constrainScope.getBottom(), ConstrainedLayoutReference.this.getBottom(), 0.0f, 0.0f, 6, null);
                                    }
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        composer2.endReplaceableGroup();
                        Modifier constrainAs3 = constraintLayoutScope3.constrainAs(m109backgroundbw27NRU, component3, (drM) rememberedValue5);
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), r13, composer2, r13);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, r13);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                        drO<ComposeUiNode> constructor = companion6.getConstructor();
                        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(constrainAs3);
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
                        Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier.Companion companion7 = companion3;
                        companion4 = companion7;
                        i4 = i6;
                        constrainedLayoutReference3 = component4;
                        constraintLayoutScope2 = constraintLayoutScope3;
                        constrainedLayoutReference2 = constrainedLayoutReference;
                        C1020Ln.c(e, PaddingKt.m274paddingVpY3zN4(companion7, Dp.m2492constructorimpl(f), Dp.m2492constructorimpl(2)), (Token.Color) null, (Theme) null, (Token.Typography) Token.Typography.as.b, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m2458getEllipsisgIe3tQ8(), false, 0, 1, (drM<? super TextLayoutResult, dpR>) null, composer2, 805330992, 384, 11756);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    } else {
                        i4 = i6;
                        companion4 = companion3;
                        constrainedLayoutReference2 = constrainedLayoutReference;
                        constrainedLayoutReference3 = component4;
                        constraintLayoutScope2 = constraintLayoutScope3;
                    }
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-357995198);
                    int i7 = i4;
                    if (i7 > 0) {
                        AbstractC1010Ld.d dVar = new AbstractC1010Ld.d(i7);
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        composer2.startReplaceableGroup(-408050736);
                        final ConstrainedLayoutReference constrainedLayoutReference4 = constrainedLayoutReference2;
                        boolean changed5 = composer2.changed(constrainedLayoutReference4);
                        Object rememberedValue6 = composer2.rememberedValue();
                        if (changed5 || rememberedValue6 == Composer.Companion.getEmpty()) {
                            rememberedValue6 = new drM<ConstrainScope, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeImageContainerKt$EpisodeImageContainer$1$5$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(1);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(ConstrainScope constrainScope) {
                                    d(constrainScope);
                                    return dpR.c;
                                }

                                public final void d(ConstrainScope constrainScope) {
                                    C8632dsu.c((Object) constrainScope, "");
                                    VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getStart(), ConstrainedLayoutReference.this.getStart(), 0.0f, 0.0f, 6, null);
                                    VerticalAnchorable.DefaultImpls.m2612linkToVpY3zN4$default(constrainScope.getEnd(), ConstrainedLayoutReference.this.getEnd(), 0.0f, 0.0f, 6, null);
                                    HorizontalAnchorable.DefaultImpls.m2607linkToVpY3zN4$default(constrainScope.getBottom(), ConstrainedLayoutReference.this.getBottom(), 0.0f, 0.0f, 6, null);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        composer2.endReplaceableGroup();
                        C1008Lb.a(constraintLayoutScope2.constrainAs(fillMaxWidth$default2, constrainedLayoutReference3, (drM) rememberedValue6), dVar, composer2, AbstractC1010Ld.d.d << 3, 0);
                    }
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
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = companion;
            final HawkinsButtonSize hawkinsButtonSize4 = hawkinsButtonSize2;
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeImageContainerKt$EpisodeImageContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i3) {
                    bCK.b(VW.this, dro, modifier2, hawkinsButtonSize4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
