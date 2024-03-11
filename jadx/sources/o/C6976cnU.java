package o;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonType;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.ui.R;
import o.C1020Ln;
import o.C6956cnA;
import o.C6976cnU;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.KE;
import o.KK;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* renamed from: o.cnU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6976cnU {
    public static final void d(final BoxScope boxScope, final Modifier modifier, final drO<dpR> dro, Composer composer, final int i, final int i2) {
        int i3;
        C8632dsu.c((Object) boxScope, "");
        Composer startRestartGroup = composer.startRestartGroup(-1650920086);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(dro) ? JSONzip.end : 128;
        }
        if ((i3 & 721) != 144 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                dro = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListTabPopOverKt$MyListTabPopOver$1
                    public final void c() {
                    }

                    @Override // o.drO
                    public /* synthetic */ dpR invoke() {
                        c();
                        return dpR.c;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1650920086, i3, -1, "com.netflix.mediaclient.ui.mylist.impl.game.MyListTabPopOver (MyListTabPopOver.kt:36)");
            }
            LC.d(Theme.a, ComposableLambdaKt.composableLambda(startRestartGroup, -1862059084, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListTabPopOverKt$MyListTabPopOver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    d(composer2, num.intValue());
                    return dpR.c;
                }

                public final void d(Composer composer2, int i6) {
                    if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862059084, i6, -1, "com.netflix.mediaclient.ui.mylist.impl.game.MyListTabPopOver.<anonymous> (MyListTabPopOver.kt:38)");
                        }
                        final String stringResource = StringResources_androidKt.stringResource(C6956cnA.c.i, composer2, 0);
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(PaddingKt.m273padding3ABfNKs(SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), 0.0f, 1, null), Dp.m2492constructorimpl(4)), null, false, 3, null);
                        composer2.startReplaceableGroup(-1256442328);
                        boolean changed = composer2.changed(stringResource);
                        Object rememberedValue = composer2.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListTabPopOverKt$MyListTabPopOver$2$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    C8632dsu.c((Object) semanticsPropertyReceiver, "");
                                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, stringResource);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    b(semanticsPropertyReceiver);
                                    return dpR.c;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        Modifier then = SemanticsModifierKt.semantics$default(wrapContentHeight$default, false, (drM) rememberedValue, 1, null).then(Modifier.this);
                        drO<dpR> dro2 = dro;
                        composer2.startReplaceableGroup(-483455358);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.Companion;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        drO<ComposeUiNode> constructor = companion3.getConstructor();
                        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
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
                        Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        drO<ComposeUiNode> constructor2 = companion3.getConstructor();
                        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer m1009constructorimpl2 = Updater.m1009constructorimpl(composer2);
                        Updater.m1013setimpl(m1009constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m1013setimpl(m1009constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (m1009constructorimpl2.getInserting() || !C8632dsu.c(m1009constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m1009constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m1009constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        modifierMaterializerOf2.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        float f = 16;
                        Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m2492constructorimpl(f), 7, null);
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        drO<ComposeUiNode> constructor3 = companion3.getConstructor();
                        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m277paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer m1009constructorimpl3 = Updater.m1009constructorimpl(composer2);
                        Updater.m1013setimpl(m1009constructorimpl3, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m1013setimpl(m1009constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (m1009constructorimpl3.getInserting() || !C8632dsu.c(m1009constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m1009constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m1009constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        modifierMaterializerOf3.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        HawkinsIcon.dN dNVar = HawkinsIcon.dN.d;
                        float f2 = 8;
                        Modifier m295size3ABfNKs = SizeKt.m295size3ABfNKs(PaddingKt.m277paddingqDBjuR0$default(companion, 0.0f, Dp.m2492constructorimpl(f2), 0.0f, 0.0f, 13, null), Dp.m2492constructorimpl(48));
                        Token.Color.cW cWVar = Token.Color.cW.c;
                        KK.c(dNVar, null, m295size3ABfNKs, null, null, cWVar, composer2, 197046, 24);
                        SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 0);
                        KE.d(HawkinsButtonType.c, dro2, HawkinsIcon.kk.e, StringResources_androidKt.stringResource(R.o.au, composer2, 0), TestTagKt.testTag(companion, "myListPopOverCloseButton"), null, null, false, composer2, 24966, 224);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        C1020Ln.c(StringResources_androidKt.stringResource(C6956cnA.c.D, composer2, 0), PaddingKt.m277paddingqDBjuR0$default(SemanticsModifierKt.semantics$default(companion, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListTabPopOverKt$MyListTabPopOver$2$2$1$2
                            public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                C8632dsu.c((Object) semanticsPropertyReceiver, "");
                                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                            }

                            @Override // o.drM
                            public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                b(semanticsPropertyReceiver);
                                return dpR.c;
                            }
                        }, 1, null), 0.0f, 0.0f, 0.0f, Dp.m2492constructorimpl(f), 7, null), (Token.Color) cWVar, (Theme) null, (Token.Typography) Token.Typography.ax.d, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, composer2, 24960, 0, 16360);
                        C1020Ln.c(StringResources_androidKt.stringResource(C6956cnA.c.x, composer2, 0), PaddingKt.m277paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m2492constructorimpl(f2), 7, null), (Token.Color) cWVar, (Theme) null, (Token.Typography) Token.Typography.C0694g.e, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (drM<? super TextLayoutResult, dpR>) null, composer2, 25008, 0, 16360);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
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
            }), startRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final drO<dpR> dro2 = dro;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListTabPopOverKt$MyListTabPopOver$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void c(Composer composer2, int i6) {
                    C6976cnU.d(BoxScope.this, modifier2, dro2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    c(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
