package o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.netflix.clcs.ui.ClcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import o.C0880Gd;
import o.C0895Gs;
import o.FC;
import o.FV;
import o.dpR;

/* renamed from: o.Gs  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0895Gs {
    public static final void e(final FV fv, final Theme theme, final FY fy, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        FC c;
        FA a;
        float m2492constructorimpl;
        Modifier modifier2;
        Modifier modifier3;
        int i3;
        float m2492constructorimpl2;
        FC.b d;
        Integer e;
        FC.b d2;
        Integer c2;
        FC.b d3;
        Integer a2;
        FC.b d4;
        Integer d5;
        Token.Color a3;
        Token.Color e2;
        C8632dsu.c((Object) fv, "");
        C8632dsu.c((Object) theme, "");
        C8632dsu.c((Object) fy, "");
        Composer startRestartGroup = composer.startRestartGroup(-1122494223);
        Modifier.Companion companion = (i2 & 16) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1122494223, i, -1, "com.netflix.clcs.ui.ClcsSelectableCard (ClcsSelectableCard.kt:30)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(dyR.c((drX) new ClcsSelectableCardKt$ClcsSelectableCard$selectedFlow$1(fv, fy, null)), Boolean.FALSE, null, startRestartGroup, 56, 2);
        if (e(collectAsState)) {
            c = fv.f();
        } else {
            c = fv.c();
        }
        if (e(collectAsState)) {
            a = fv.b();
        } else {
            a = fv.a();
        }
        Arrangement arrangement = Arrangement.INSTANCE;
        float f = 16;
        androidx.compose.ui.unit.Dp dp = (androidx.compose.ui.unit.Dp) new FR(androidx.compose.ui.unit.Dp.m2490boximpl(androidx.compose.ui.unit.Dp.m2492constructorimpl(f)), null, androidx.compose.ui.unit.Dp.m2490boximpl(androidx.compose.ui.unit.Dp.m2492constructorimpl(40)), null, null).e(startRestartGroup, 0);
        if (dp != null) {
            m2492constructorimpl = dp.m2498unboximpl();
        } else {
            m2492constructorimpl = androidx.compose.ui.unit.Dp.m2492constructorimpl(f);
        }
        Arrangement.HorizontalOrVertical m230spacedBy0680j_4 = arrangement.m230spacedBy0680j_4(m2492constructorimpl);
        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
        if (c == null || (e2 = c.e()) == null || (modifier2 = BackgroundKt.m110backgroundbw27NRU$default(Modifier.Companion, LA.d(e2, theme), null, 2, null)) == null) {
            modifier2 = Modifier.Companion;
        }
        Modifier then = companion.then(modifier2);
        if (c == null || (a3 = c.a()) == null || (modifier3 = BorderKt.m114borderxT4_qwU(Modifier.Companion, androidx.compose.ui.unit.Dp.m2492constructorimpl(4), LA.d(a3, theme), RoundedCornerShapeKt.m399RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m2492constructorimpl(8)))) == null) {
            modifier3 = Modifier.Companion;
        }
        Modifier then2 = then.then(modifier3);
        float m2492constructorimpl3 = (c == null || (d4 = c.d()) == null || (d5 = d4.d()) == null) ? androidx.compose.ui.unit.Dp.m2492constructorimpl(0) : androidx.compose.ui.unit.Dp.m2492constructorimpl(d5.intValue());
        float m2492constructorimpl4 = (c == null || (d3 = c.d()) == null || (a2 = d3.a()) == null) ? androidx.compose.ui.unit.Dp.m2492constructorimpl(0) : androidx.compose.ui.unit.Dp.m2492constructorimpl(a2.intValue());
        float m2492constructorimpl5 = (c == null || (d2 = c.d()) == null || (c2 = d2.c()) == null) ? androidx.compose.ui.unit.Dp.m2492constructorimpl(0) : androidx.compose.ui.unit.Dp.m2492constructorimpl(c2.intValue());
        if (c == null || (d = c.d()) == null || (e = d.e()) == null) {
            i3 = 0;
            m2492constructorimpl2 = androidx.compose.ui.unit.Dp.m2492constructorimpl(0);
        } else {
            m2492constructorimpl2 = androidx.compose.ui.unit.Dp.m2492constructorimpl(e.intValue());
            i3 = 0;
        }
        Modifier m276paddingqDBjuR0 = PaddingKt.m276paddingqDBjuR0(then2, m2492constructorimpl3, m2492constructorimpl4, m2492constructorimpl5, m2492constructorimpl2);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m230spacedBy0680j_4, centerHorizontally, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i3);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion2.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m276paddingqDBjuR0);
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
        FD d6 = fv.d();
        Modifier.Companion companion3 = Modifier.Companion;
        int i4 = (i & 112) | 24576;
        final Modifier modifier4 = companion;
        C0884Gh.b(d6, theme, str, fy, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), startRestartGroup, ((i >> 3) & 896) | i4 | ((i << 3) & 7168), 0);
        startRestartGroup.startReplaceableGroup(-897479005);
        if (a != null) {
            C0878Gb.c(a, theme, fy, str, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), new drO<dpR>() { // from class: com.netflix.clcs.ui.ClcsSelectableCardKt$ClcsSelectableCard$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    C0880Gd e3 = FV.this.e();
                    if (e3 != null) {
                        fy.a(FV.this.j(), e3);
                    }
                }
            }, startRestartGroup, i4 | (i & 896) | (i & 7168), 0);
        }
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
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.clcs.ui.ClcsSelectableCardKt$ClcsSelectableCard$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i5) {
                    C0895Gs.e(FV.this, theme, fy, str, modifier4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    private static final boolean e(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
