package o;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.components.TranslateOrigin;
import o.C5836cKd;
import o.C8632dsu;
import o.InterfaceC5816cJk;
import o.InterfaceC8612dsa;
import o.cIJ;
import o.cIS;
import o.cIT;
import o.cJF;
import o.cJI;
import o.cJM;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class cJI {
    public static final void c(final C5836cKd c5836cKd, final drM<? super cJF, dpR> drm, Modifier modifier, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) c5836cKd, "");
        C8632dsu.c((Object) drm, "");
        Composer startRestartGroup = composer.startRestartGroup(289526839);
        if ((i2 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(289526839, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerPrePlayUIExperience (PlayerPrePlayUIExperience.kt:25)");
        }
        C5808cJc.c(c5836cKd.m(), c5836cKd.a(), drm, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1366915506, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerPrePlayUIExperienceKt$PlayerPrePlayUIExperience$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                c(composer2, num.intValue());
                return dpR.c;
            }

            public final void c(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1366915506, i3, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerPrePlayUIExperience.<anonymous> (PlayerPrePlayUIExperience.kt:32)");
                    }
                    cJM.d(C5836cKd.this.f(), C5836cKd.this.a(), drm, (Modifier) null, composer2, 0, 8);
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment center = companion2.getCenter();
                    final C5836cKd c5836cKd2 = C5836cKd.this;
                    final drM<cJF, dpR> drm2 = drm;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    drO<ComposeUiNode> constructor = companion3.getConstructor();
                    InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
                    Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    cIJ.a(c5836cKd2.i(), c5836cKd2.a(), null, ComposableLambdaKt.composableLambda(composer2, -1819192599, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerPrePlayUIExperienceKt$PlayerPrePlayUIExperience$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                            c(composer3, num.intValue());
                            return dpR.c;
                        }

                        public final void c(Composer composer3, int i4) {
                            if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1819192599, i4, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerPrePlayUIExperience.<anonymous>.<anonymous>.<anonymous> (PlayerPrePlayUIExperience.kt:46)");
                                }
                                cIT.d(C5836cKd.this.s(), drm2, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 3072, 4);
                    cIJ.c(TranslateOrigin.d, c5836cKd2.i(), c5836cKd2.a(), boxScopeInstance.align(companion, companion2.getBottomCenter()), ComposableLambdaKt.composableLambda(composer2, 1655388552, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerPrePlayUIExperienceKt$PlayerPrePlayUIExperience$1$1$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                            b(composer3, num.intValue());
                            return dpR.c;
                        }

                        public final void b(Composer composer3, int i4) {
                            if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1655388552, i4, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerPrePlayUIExperience.<anonymous>.<anonymous>.<anonymous> (PlayerPrePlayUIExperience.kt:58)");
                                }
                                boolean g = C5836cKd.this.g();
                                InterfaceC5816cJk u = C5836cKd.this.u();
                                boolean z = C5836cKd.this.z();
                                boolean B = C5836cKd.this.B();
                                drM<cJF, dpR> drm3 = drm2;
                                cIS.d(g, u, z, B, true, drm3, drm3, drm3, drm3, null, composer3, 24576, 512);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 24582, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ((i << 3) & 896) | 196608, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = modifier;
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.experience.PlayerPrePlayUIExperienceKt$PlayerPrePlayUIExperience$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i3) {
                    cJI.c(C5836cKd.this, drm, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
