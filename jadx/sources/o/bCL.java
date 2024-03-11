package o;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import o.C8632dsu;
import o.VW;
import o.bBM;
import o.bCL;
import o.dpR;

/* loaded from: classes4.dex */
public final class bCL {
    public static final void c(final VW vw, final drO<dpR> dro, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        C8632dsu.c((Object) vw, "");
        C8632dsu.c((Object) dro, "");
        Composer startRestartGroup = composer.startRestartGroup(167816812);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            f2 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getFontScale();
        } else {
            f2 = f;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(167816812, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeRow (EpisodeRow.kt:33)");
        }
        final String c = C1333Xq.d(StringResources_androidKt.stringResource(bBM.c.q, startRestartGroup, 0)).d("episodeNumber", "").d("episodeName", "").c();
        Modifier focusable$default = FocusableKt.focusable$default(companion, false, null, 3, null);
        startRestartGroup.startReplaceableGroup(1176361598);
        boolean z = (((i & 112) ^ 48) > 32 && startRestartGroup.changedInstance(dro)) || (i & 48) == 32;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeRowKt$EpisodeRow$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public final void a() {
                    dro.invoke();
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier m130clickableXHw0xAI$default = ClickableKt.m130clickableXHw0xAI$default(focusable$default, false, null, null, (drO) rememberedValue, 7, null);
        startRestartGroup.startReplaceableGroup(1176361645);
        boolean changed = startRestartGroup.changed(c);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeRowKt$EpisodeRow$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    d(semanticsPropertyReceiver);
                    return dpR.c;
                }

                public final void d(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    C8632dsu.c((Object) semanticsPropertyReceiver, "");
                    String str = c;
                    C8632dsu.a(str, "");
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(m130clickableXHw0xAI$default, false, (drM) rememberedValue2, 1, null);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal start = Alignment.Companion.getStart();
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, start, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion2.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
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
        Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (f2 <= 1.0f) {
            startRestartGroup.startReplaceableGroup(-1094182366);
            bCJ.e(vw, dro, null, startRestartGroup, (i3 & 112) | 8, 4);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-1094182280);
            bCF.c(vw, dro, null, startRestartGroup, (i3 & 112) | 8, 4);
            startRestartGroup.endReplaceableGroup();
        }
        SpacerKt.Spacer(SizeKt.m288height3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m2492constructorimpl(8)), startRestartGroup, 6);
        int m2458getEllipsisgIe3tQ8 = TextOverflow.Companion.m2458getEllipsisgIe3tQ8();
        Token.Color.cU cUVar = Token.Color.cU.c;
        Token.Typography.C0681aa c0681aa = Token.Typography.C0681aa.e;
        String g = vw.g();
        final Modifier modifier2 = companion;
        C1020Ln.c(g == null ? "" : g, (Modifier) null, (Token.Color) cUVar, (Theme) null, (Token.Typography) c0681aa, 0L, (TextDecoration) null, (TextAlign) null, 0L, m2458getEllipsisgIe3tQ8, false, 0, 5, (drM<? super TextLayoutResult, dpR>) null, startRestartGroup, 805331328, 384, 11754);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final float f3 = f2;
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodeRowKt$EpisodeRow$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void d(Composer composer2, int i4) {
                    bCL.c(VW.this, dro, modifier2, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
