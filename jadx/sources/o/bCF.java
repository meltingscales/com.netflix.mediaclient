package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonSize;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.SupportedBadge;
import o.C8632dsu;
import o.VW;
import o.bBM;
import o.bCF;
import o.dpR;

/* loaded from: classes4.dex */
public final class bCF {
    public static final void c(final VW vw, final drO<dpR> dro, Modifier modifier, Composer composer, final int i, final int i2) {
        C8632dsu.c((Object) vw, "");
        C8632dsu.c((Object) dro, "");
        Composer startRestartGroup = composer.startRestartGroup(-1236248296);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1236248296, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeContainerBig (EpisodeContainerBig.kt:37)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.Companion;
        Alignment.Horizontal start = companion2.getStart();
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, start, startRestartGroup, 54);
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
        Modifier.Companion companion4 = Modifier.Companion;
        final Modifier modifier2 = companion;
        bCK.b(vw, dro, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), HawkinsButtonSize.e, startRestartGroup, (i & 112) | 3464, 0);
        SpacerKt.Spacer(SizeKt.m288height3ABfNKs(companion4, androidx.compose.ui.unit.Dp.m2492constructorimpl(12)), startRestartGroup, 6);
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
        Arrangement.Horizontal start2 = arrangement.getStart();
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start2, centerVertically, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        drO<ComposeUiNode> constructor2 = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default2);
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
        C3600bDw b = C3603bDz.b(vw.f(), startRestartGroup, 0);
        String c = b.c();
        final String c2 = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.aj, startRestartGroup, 0)).d("runtime", b.a()).c();
        String b2 = b(vw, startRestartGroup, 8);
        TextOverflow.Companion companion5 = TextOverflow.Companion;
        C1020Ln.c(b2, (Modifier) null, (Token.Color) null, (Theme) null, (Token.Typography) Token.Typography.C0692e.e, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m2458getEllipsisgIe3tQ8(), false, 0, 5, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, 805330944, 384, 11758);
        SpacerKt.Spacer(SizeKt.m300width3ABfNKs(companion4, androidx.compose.ui.unit.Dp.m2492constructorimpl(10)), startRestartGroup, 6);
        Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        drO<ComposeUiNode> constructor3 = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(weight$default);
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
        Updater.m1013setimpl(m1009constructorimpl3, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m1009constructorimpl3.getInserting() || !C8632dsu.c(m1009constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m1009constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m1009constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        Modifier align = BoxScopeInstance.INSTANCE.align(companion4, companion2.getCenterEnd());
        startRestartGroup.startReplaceableGroup(-1847795452);
        boolean changed = startRestartGroup.changed(c2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeContainerBigKt$EpisodeContainerBig$1$1$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    b(semanticsPropertyReceiver);
                    return dpR.c;
                }

                public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    C8632dsu.c((Object) semanticsPropertyReceiver, "");
                    String str = c2;
                    C8632dsu.a(str, "");
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        C1020Ln.c(c, SemanticsModifierKt.semantics$default(align, false, (drM) rememberedValue, 1, null), (Token.Color) Token.Color.cU.c, (Theme) null, (Token.Typography) Token.Typography.C0681aa.e, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m2458getEllipsisgIe3tQ8(), false, 0, 4, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, 805331328, 384, 11752);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeContainerBigKt$EpisodeContainerBig$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i3) {
                    bCF.c(VW.this, dro, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    public static final String b(VW vw, Composer composer, int i) {
        String b;
        String c;
        C8632dsu.c((Object) vw, "");
        composer.startReplaceableGroup(1218179707);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1218179707, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.createTitleText (EpisodeContainerBig.kt:91)");
        }
        composer.startReplaceableGroup(1635286534);
        if (vw.m()) {
            if (vw.o()) {
                c = vw.a();
            } else {
                c = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.n, composer, 0)).d("episodeNumber", String.valueOf(vw.e())).d("episodeName", vw.a()).c();
                C8632dsu.d((Object) c);
            }
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return c;
        }
        composer.endReplaceableGroup();
        if (C8168dfL.g(vw.b())) {
            b = StringResources_androidKt.stringResource(bBM.c.F, composer, 0);
        } else {
            b = vw.b();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return b;
    }

    public static final String e(String str, Composer composer, int i) {
        boolean a;
        boolean a2;
        String str2 = "";
        C8632dsu.c((Object) str, "");
        composer.startReplaceableGroup(866997578);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(866997578, i, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.getEpisodeBadge (EpisodeContainerBig.kt:112)");
        }
        if (str.length() > 0) {
            a = C8691duz.a(str, SupportedBadge.c.toString(), true);
            if (a) {
                composer.startReplaceableGroup(-1792040674);
                str2 = StringResources_androidKt.stringResource(bBM.c.D, composer, 0);
                composer.endReplaceableGroup();
            } else {
                a2 = C8691duz.a(str, SupportedBadge.e.toString(), true);
                if (a2) {
                    composer.startReplaceableGroup(-1792040515);
                    str2 = StringResources_androidKt.stringResource(bBM.c.C, composer, 0);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-1792040432);
                    composer.endReplaceableGroup();
                }
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return str2;
    }
}
