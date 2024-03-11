package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonType;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.ui.pauseads.api.PauseAdsUiModel;
import o.AbstractC1010Ld;
import o.C7473cwq;
import o.C7479cww;
import o.dpR;

/* renamed from: o.cwq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7473cwq {
    private static final PauseAdsUiModel d = new PauseAdsUiModel("ad url", "ad content description", "box art url", "box art content description", "S1: E2 The Man in the Straw Hat", "19 min remaining", 20, "play button content description", new drO<dpR>() { // from class: com.netflix.mediaclient.ui.pauseads.impl.PauseAdsContentKt$DEFAULT_MODEL$1
        public final void b() {
        }

        @Override // o.drO
        public /* synthetic */ dpR invoke() {
            b();
            return dpR.c;
        }
    });

    public static final void c(final PauseAdsUiModel pauseAdsUiModel, final drO<dpR> dro, final InterfaceC1570aGe interfaceC1570aGe, Modifier modifier, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) pauseAdsUiModel, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) interfaceC1570aGe, "");
        Composer startRestartGroup = composer.startRestartGroup(-394229342);
        if ((i2 & 8) != 0) {
            modifier = Modifier.Companion;
        }
        final Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-394229342, i, -1, "com.netflix.mediaclient.ui.pauseads.impl.PauseAdsContent (PauseAdsContent.kt:45)");
        }
        C1572aGg.b(interfaceC1570aGe.a(), ComposableLambdaKt.composableLambda(startRestartGroup, 1534094193, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.pauseads.impl.PauseAdsContentKt$PauseAdsContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                d(composer2, num.intValue());
                return dpR.c;
            }

            public final void d(Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1534094193, i3, -1, "com.netflix.mediaclient.ui.pauseads.impl.PauseAdsContent.<anonymous> (PauseAdsContent.kt:47)");
                    }
                    C7473cwq.b(PauseAdsUiModel.this, dro, modifier2, composer2, 8, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.pauseads.impl.PauseAdsContentKt$PauseAdsContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void e(Composer composer2, int i3) {
                    C7473cwq.c(PauseAdsUiModel.this, dro, interfaceC1570aGe, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final void b(final PauseAdsUiModel pauseAdsUiModel, final drO<dpR> dro, Modifier modifier, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) pauseAdsUiModel, "");
        C8632dsu.c((Object) dro, "");
        Composer startRestartGroup = composer.startRestartGroup(-579139150);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-579139150, i, -1, "com.netflix.mediaclient.ui.pauseads.impl.PauseAdsContent (PauseAdsContent.kt:60)");
        }
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
        Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        String a = pauseAdsUiModel.a();
        String d2 = pauseAdsUiModel.d();
        Modifier.Companion companion4 = Modifier.Companion;
        final Modifier modifier2 = companion;
        KM.d(a, d2, boxScopeInstance.matchParentSize(companion4), null, null, null, null, null, 0.0f, null, 0, startRestartGroup, 0, 0, 2040);
        d(boxScopeInstance.align(PaddingKt.m277paddingqDBjuR0$default(companion4, 0.0f, androidx.compose.ui.unit.Dp.m2492constructorimpl(16), androidx.compose.ui.unit.Dp.m2492constructorimpl(28), 0.0f, 9, null), companion2.getTopEnd()), startRestartGroup, 0, 0);
        Modifier align = boxScopeInstance.align(ClipKt.clip(PaddingKt.m274paddingVpY3zN4(SizeKt.fillMaxWidth(companion4, 0.55f), androidx.compose.ui.unit.Dp.m2492constructorimpl(48), androidx.compose.ui.unit.Dp.m2492constructorimpl(64)), RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m2492constructorimpl(12))), companion2.getCenterStart());
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        drO<ComposeUiNode> constructor2 = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(align);
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
        Updater.m1013setimpl(m1009constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        int i3 = i & 112;
        c(pauseAdsUiModel, dro, ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, companion4, 1.0f, false, 2, null), startRestartGroup, i3 | 8, 0);
        d(pauseAdsUiModel, dro, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), startRestartGroup, i3 | 392, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.pauseads.impl.PauseAdsContentKt$PauseAdsContent$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i4) {
                    C7473cwq.b(PauseAdsUiModel.this, dro, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Modifier modifier, Composer composer, final int i, final int i2) {
        final Object obj;
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1483543941);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = i4 != 0 ? Modifier.Companion : obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1483543941, i3, -1, "com.netflix.mediaclient.ui.pauseads.impl.AdLabel (PauseAdsContent.kt:98)");
            }
            Modifier m273padding3ABfNKs = PaddingKt.m273padding3ABfNKs(BackgroundKt.m109backgroundbw27NRU(companion, LA.c(Token.Color.C0622hv.e, startRestartGroup, 6), RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m2492constructorimpl(4))), androidx.compose.ui.unit.Dp.m2492constructorimpl(6));
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            drO<ComposeUiNode> constructor = companion2.getConstructor();
            InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m273padding3ABfNKs);
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
            Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifier2 = companion;
            composer2 = startRestartGroup;
            C1020Ln.c(StringResources_androidKt.stringResource(C7479cww.b.a, startRestartGroup, 0), (Modifier) null, (Token.Color) null, (Theme) null, (Token.Typography) Token.Typography.C0692e.e, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, composer2, 24576, 0, 16366);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            obj = modifier2;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.pauseads.impl.PauseAdsContentKt$AdLabel$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void c(Composer composer3, int i5) {
                    C7473cwq.d(Modifier.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer3, Integer num) {
                    c(composer3, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final PauseAdsUiModel pauseAdsUiModel, final drO<dpR> dro, Modifier modifier, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-749776505);
        final Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-749776505, i, -1, "com.netflix.mediaclient.ui.pauseads.impl.StoryArt (PauseAdsContent.kt:119)");
        }
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        KE.d(HawkinsButtonType.c, dro, HawkinsIcon.C0214de.b, pauseAdsUiModel.g(), PaddingKt.m277paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(Modifier.Companion, companion2.getTopEnd()), 0.0f, androidx.compose.ui.unit.Dp.m2492constructorimpl(10), androidx.compose.ui.unit.Dp.m2492constructorimpl(8), 0.0f, 9, null), null, null, false, startRestartGroup, (i & 112) | 390, 224);
        KM.d(pauseAdsUiModel.e(), pauseAdsUiModel.c(), null, null, null, null, null, null, 0.0f, null, 0, startRestartGroup, 0, 0, 2044);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.pauseads.impl.PauseAdsContentKt$StoryArt$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i3) {
                    C7473cwq.c(PauseAdsUiModel.this, dro, companion, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final PauseAdsUiModel pauseAdsUiModel, final drO<dpR> dro, Modifier modifier, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(1217410472);
        final Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1217410472, i, -1, "com.netflix.mediaclient.ui.pauseads.impl.PlaybackStatus (PauseAdsContent.kt:144)");
        }
        startRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
        Modifier.Companion companion4 = Modifier.Companion;
        float f = 14;
        Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(companion4, androidx.compose.ui.unit.Dp.m2492constructorimpl(20), 0.0f, androidx.compose.ui.unit.Dp.m2492constructorimpl(f), 0.0f, 10, null);
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        drO<ComposeUiNode> constructor2 = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m277paddingqDBjuR0$default);
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
        Updater.m1013setimpl(m1009constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        KE.d(HawkinsButtonType.b, dro, HawkinsIcon.gG.e, pauseAdsUiModel.g(), null, null, null, false, startRestartGroup, (i & 112) | 390, 240);
        SpacerKt.Spacer(SizeKt.m295size3ABfNKs(companion4, androidx.compose.ui.unit.Dp.m2492constructorimpl(f)), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        drO<ComposeUiNode> constructor3 = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion4);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        Composer m1009constructorimpl3 = Updater.m1009constructorimpl(startRestartGroup);
        Updater.m1013setimpl(m1009constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m1009constructorimpl3.getInserting() || !C8632dsu.c(m1009constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m1009constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m1009constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        C1020Ln.c(pauseAdsUiModel.i(), (Modifier) null, (Token.Color) Token.Color.cW.c, (Theme) null, (Token.Typography) Token.Typography.C0693f.b, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, 24960, 0, 16362);
        C1020Ln.c(pauseAdsUiModel.h(), (Modifier) null, (Token.Color) Token.Color.C0499df.d, (Theme) null, (Token.Typography) Token.Typography.C0690c.e, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, 24960, 0, 16362);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m295size3ABfNKs(companion4, androidx.compose.ui.unit.Dp.m2492constructorimpl(8)), startRestartGroup, 6);
        C1008Lb.a(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), new AbstractC1010Ld.d(pauseAdsUiModel.f()), startRestartGroup, 6 | (AbstractC1010Ld.d.d << 3), 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        dpR dpr = dpR.c;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.pauseads.impl.PauseAdsContentKt$PlaybackStatus$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void d(Composer composer2, int i3) {
                    C7473cwq.d(PauseAdsUiModel.this, dro, companion, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
