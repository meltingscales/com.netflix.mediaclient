package o;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TabRowDefaults;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$1;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.ExpiringContentAdvisory;
import o.C1332Xp;
import o.C8632dsu;
import o.InterfaceC1610aHr;
import o.InterfaceC8612dsa;
import o.LA;
import o.cIY;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class cIY {
    private static final InterfaceC8554dpx b;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ExpiringContentAdvisory.ContentType.values().length];
            try {
                iArr[ExpiringContentAdvisory.ContentType.SERIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExpiringContentAdvisory.ContentType.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExpiringContentAdvisory.ContentType.SEASON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr;
        }
    }

    public static final void b(final boolean z, final Advisory advisory, final String str, final drM<? super AbstractC5823cJr, dpR> drm, Modifier modifier, Composer composer, final int i, final int i2) {
        EnterTransition plus;
        ExitTransition plus2;
        C8632dsu.c((Object) drm, "");
        Composer startRestartGroup = composer.startRestartGroup(1019544027);
        Modifier.Companion companion = (i2 & 16) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1019544027, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryView (PlayerContentAdvisoryView.kt:53)");
        }
        startRestartGroup.startReplaceableGroup(571824353);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new MutableTransitionState(Boolean.FALSE);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(571824413);
        if (advisory == null) {
            mutableTransitionState.setTargetState(Boolean.FALSE);
        } else {
            EffectsKt.LaunchedEffect(advisory, new PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$1(advisory, drm, str, mutableTransitionState, null), startRestartGroup, 72);
        }
        startRestartGroup.endReplaceableGroup();
        if (z) {
            plus = EnterTransition.Companion.getNone();
        } else {
            plus = EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(700, 0, EasingKt.getLinearEasing(), 2, null), new drM<Integer, Integer>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$containerEnterTransition$1
                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return e(num.intValue());
                }

                public final Integer e(int i3) {
                    return Integer.valueOf(i3 / 2);
                }
            }).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null));
        }
        EnterTransition enterTransition = plus;
        if (z) {
            plus2 = ExitTransition.Companion.getNone();
        } else {
            plus2 = EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween$default(700, 0, EasingKt.getLinearEasing(), 2, null), new drM<Integer, Integer>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$containerExitTransition$1
                @Override // o.drM
                public /* synthetic */ Integer invoke(Integer num) {
                    return d(num.intValue());
                }

                public final Integer d(int i3) {
                    return Integer.valueOf(i3);
                }
            }).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null));
        }
        AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, companion, enterTransition, plus2, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1973394947, true, new InterfaceC8612dsa<AnimatedVisibilityScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                c(animatedVisibilityScope, composer2, num.intValue());
                return dpR.c;
            }

            public final void c(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, int i3) {
                C8632dsu.c((Object) animatedVisibilityScope, "");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1973394947, i3, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryView.<anonymous> (PlayerContentAdvisoryView.kt:130)");
                }
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier height = IntrinsicKt.height(companion2, IntrinsicSize.Min);
                boolean z2 = z;
                Advisory advisory2 = advisory;
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                drO<ComposeUiNode> constructor = companion3.getConstructor();
                InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(height);
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
                Updater.m1013setimpl(m1009constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TabRowDefaults.INSTANCE.m671Divider9IZ8Weo(SizeKt.m300width3ABfNKs(SizeKt.fillMaxHeight$default(z2 ^ true ? AnimatedVisibilityScope.animateEnterExit$default(animatedVisibilityScope, companion2, EnterExitTransitionKt.expandVertically$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), 2, null), null, false, null, 14, null), EnterExitTransitionKt.shrinkVertically$default(AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), 2, null), null, false, null, 14, null), null, 4, null) : companion2, 0.0f, 1, null), Dp.m2492constructorimpl(2)), 0.0f, LA.e(Token.Color.cX.b), composer2, TabRowDefaults.$stable << 9, 2);
                SpacerKt.Spacer(SizeKt.m300width3ABfNKs(companion2, Dp.m2492constructorimpl(4)), composer2, 6);
                cIY.b(advisory2, composer2, 8);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), startRestartGroup, MutableTransitionState.$stable | 196608 | ((i >> 9) & 112), 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = companion;
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$PlayerContentAdvisoryView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i3) {
                    cIY.b(z, advisory, str, drm, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final void b(final Advisory advisory, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1855177588);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1855177588, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.AdvisoryContent (PlayerContentAdvisoryView.kt:165)");
        }
        if (advisory instanceof ContentAdvisory) {
            startRestartGroup.startReplaceableGroup(-190362537);
            a((ContentAdvisory) advisory, startRestartGroup, 8);
            startRestartGroup.endReplaceableGroup();
        } else if (advisory instanceof ExpiringContentAdvisory) {
            startRestartGroup.startReplaceableGroup(-190362469);
            b((ExpiringContentAdvisory) advisory, startRestartGroup, 8);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-190362389);
            if (advisory != null) {
                String message = advisory.getMessage();
                C8632dsu.a(message, "");
                c(message, advisory.getSecondaryMessage(), startRestartGroup, 0);
            }
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$AdvisoryContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i2) {
                    cIY.b(Advisory.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final void b(final ExpiringContentAdvisory expiringContentAdvisory, Composer composer, final int i) {
        final String a;
        C8632dsu.c((Object) expiringContentAdvisory, "");
        Composer startRestartGroup = composer.startRestartGroup(-1294511488);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1294511488, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ExpiringContentAdvisoryView (PlayerContentAdvisoryView.kt:180)");
        }
        ExpiringContentAdvisory.ContentType contentType = expiringContentAdvisory.contentType;
        int i2 = contentType != null ? d.b[contentType.ordinal()] : -1;
        int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? com.netflix.mediaclient.ui.R.o.bN : com.netflix.mediaclient.ui.R.o.bP : com.netflix.mediaclient.ui.R.o.bQ : com.netflix.mediaclient.ui.R.o.bS;
        String message = expiringContentAdvisory.getMessage();
        if (message == null || message.length() == 0) {
            a = C8168dfL.a(i3, expiringContentAdvisory.localizedDate);
        } else {
            a = expiringContentAdvisory.getMessage();
        }
        AndroidView_androidKt.AndroidView(new drM<Context, View>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$ExpiringContentAdvisoryView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final View invoke(Context context) {
                InterfaceC1610aHr b2;
                C8632dsu.c((Object) context, "");
                b2 = cIY.b();
                String str = a;
                C8632dsu.a(str, "");
                View b3 = b2.b(context, str, expiringContentAdvisory.getSecondaryMessage());
                C8632dsu.d(b3);
                return b3;
            }
        }, null, null, startRestartGroup, 0, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$ExpiringContentAdvisoryView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i4) {
                    cIY.b(ExpiringContentAdvisory.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final void a(final ContentAdvisory contentAdvisory, Composer composer, final int i) {
        C8632dsu.c((Object) contentAdvisory, "");
        Composer startRestartGroup = composer.startRestartGroup(-693710088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-693710088, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.ContentAdvisoryView (PlayerContentAdvisoryView.kt:207)");
        }
        AndroidView_androidKt.AndroidView(new drM<Context, View>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$ContentAdvisoryView$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final View invoke(Context context) {
                InterfaceC1610aHr b2;
                C8632dsu.c((Object) context, "");
                b2 = cIY.b();
                View b3 = b2.b(context, ContentAdvisory.this, false);
                C8632dsu.d(b3);
                return b3;
            }
        }, null, null, startRestartGroup, 0, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$ContentAdvisoryView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void d(Composer composer2, int i2) {
                    cIY.a(ContentAdvisory.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final void c(final String str, final String str2, Composer composer, final int i) {
        int i2;
        C8632dsu.c((Object) str, "");
        Composer startRestartGroup = composer.startRestartGroup(1320684629);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1320684629, i2, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.AdvisoryView (PlayerContentAdvisoryView.kt:223)");
            }
            startRestartGroup.startReplaceableGroup(-1127059918);
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | z2) || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drM<Context, View>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$AdvisoryView$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: c */
                    public final View invoke(Context context) {
                        InterfaceC1610aHr b2;
                        C8632dsu.c((Object) context, "");
                        b2 = cIY.b();
                        View b3 = b2.b(context, str, str2);
                        C8632dsu.d(b3);
                        return b3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((drM) rememberedValue, null, null, startRestartGroup, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$AdvisoryView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i3) {
                    cIY.c(str, str2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    static {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<InterfaceC1610aHr>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerContentAdvisoryViewKt$advisoryProvider$2
            @Override // o.drO
            /* renamed from: b */
            public final InterfaceC1610aHr invoke() {
                C1332Xp c1332Xp = C1332Xp.b;
                return (InterfaceC1610aHr) C1332Xp.b(InterfaceC1610aHr.class);
            }
        });
        b = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1610aHr b() {
        return (InterfaceC1610aHr) b.getValue();
    }
}
