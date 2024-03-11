package com.netflix.mediaclient.ui.nonmember.impl;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.netflix.cl.Logger;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.hawkins.consumer.component.input.HawkinsInputCopyLinkSize;
import kotlin.jvm.internal.Lambda;
import o.C7016coH;
import o.C7033coZ;
import o.C8054ddD;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC8612dsa;
import o.KS;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NonMemberHomeActivity$showCopyLinkBanner$2 extends Lambda implements drX<Composer, Integer, dpR> {
    final /* synthetic */ String d;
    final /* synthetic */ NonMemberHomeActivity e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonMemberHomeActivity$showCopyLinkBanner$2(NonMemberHomeActivity nonMemberHomeActivity, String str) {
        super(2);
        this.e = nonMemberHomeActivity;
        this.d = str;
    }

    @Override // o.drX
    public /* synthetic */ dpR invoke(Composer composer, Integer num) {
        d(composer, num.intValue());
        return dpR.c;
    }

    public final void d(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1873273166, i, -1, "com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity.showCopyLinkBanner.<anonymous> (NonMemberHomeActivity.kt:165)");
            }
            final NonMemberHomeActivity nonMemberHomeActivity = this.e;
            final String str = this.d;
            composer.startReplaceableGroup(733328855);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion3.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1009constructorimpl = Updater.m1009constructorimpl(composer);
            Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-2062570549);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            composer.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(c(mutableState), boxScopeInstance.align(companion, companion2.getBottomCenter()), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInVertically$default(null, new drM<Integer, Integer>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$showCopyLinkBanner$2$1$1
                public final Integer c(int i2) {
                    return Integer.valueOf(i2);
                }

                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return c(num.intValue());
                }
            }, 1, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideOutVertically$default(null, new drM<Integer, Integer>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$showCopyLinkBanner$2$1$2
                public final Integer e(int i2) {
                    return Integer.valueOf(i2);
                }

                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return e(num.intValue());
                }
            }, 1, null)), (String) null, ComposableLambdaKt.composableLambda(composer, -828202092, true, new InterfaceC8612dsa<AnimatedVisibilityScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$showCopyLinkBanner$2$1$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // o.InterfaceC8612dsa
                public /* synthetic */ dpR invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    d(animatedVisibilityScope, composer2, num.intValue());
                    return dpR.c;
                }

                public final void d(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, int i2) {
                    C8632dsu.c((Object) animatedVisibilityScope, "");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-828202092, i2, -1, "com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity.showCopyLinkBanner.<anonymous>.<anonymous>.<anonymous> (NonMemberHomeActivity.kt:173)");
                    }
                    String stringResource = StringResources_androidKt.stringResource(C7033coZ.a.c, composer2, 0);
                    String stringResource2 = StringResources_androidKt.stringResource(C7033coZ.a.b, composer2, 0);
                    Modifier m273padding3ABfNKs = PaddingKt.m273padding3ABfNKs(Modifier.Companion, Dp.m2492constructorimpl(16));
                    final NonMemberHomeActivity nonMemberHomeActivity2 = NonMemberHomeActivity.this;
                    final MutableState<Boolean> mutableState2 = mutableState;
                    drO<dpR> dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$showCopyLinkBanner$2$1$3.1
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
                            Logger.INSTANCE.logEvent(new Selected(NonMemberHomeActivity.this.getUiScreen(), null, CommandValue.CloseCommand, null));
                            NonMemberHomeActivity$showCopyLinkBanner$2.d(mutableState2, false);
                        }
                    };
                    final NonMemberHomeActivity nonMemberHomeActivity3 = NonMemberHomeActivity.this;
                    final String str2 = str;
                    C7016coH.d(stringResource, stringResource2, dro, m273padding3ABfNKs, null, ComposableLambdaKt.composableLambda(composer2, -1441067225, true, new InterfaceC8612dsa<ColumnScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity$showCopyLinkBanner$2$1$3.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // o.InterfaceC8612dsa
                        public /* synthetic */ dpR invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            c(columnScope, composer3, num.intValue());
                            return dpR.c;
                        }

                        public final void c(ColumnScope columnScope, Composer composer3, int i3) {
                            C8632dsu.c((Object) columnScope, "");
                            if ((i3 & 81) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1441067225, i3, -1, "com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity.showCopyLinkBanner.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NonMemberHomeActivity.kt:182)");
                            }
                            String o2 = NonMemberHomeActivity.this.o();
                            String str3 = str2;
                            final NonMemberHomeActivity nonMemberHomeActivity4 = NonMemberHomeActivity.this;
                            KS.d(o2, str3, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.nonmember.impl.NonMemberHomeActivity.showCopyLinkBanner.2.1.3.2.1
                                {
                                    super(0);
                                }

                                @Override // o.drO
                                public /* synthetic */ dpR invoke() {
                                    c();
                                    return dpR.c;
                                }

                                public final void c() {
                                    Logger.INSTANCE.logEvent(new Selected(NonMemberHomeActivity.this.getUiScreen(), null, CommandValue.CopyURLCommand, null));
                                    C8054ddD.c(NonMemberHomeActivity.this.getApplicationContext(), C9834xU.h.i, 0);
                                }
                            }, null, null, HawkinsInputCopyLinkSize.d, null, null, false, composer3, 196608, 472);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 199680, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer, 200064, 16);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    private static final boolean c(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
