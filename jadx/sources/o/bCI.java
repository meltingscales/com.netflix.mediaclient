package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.EpisodesScreen;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.bCI;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class bCI {
    public static final void c(final EpisodesScreen.d dVar, final drX<? super Composer, ? super Integer, dpR> drx, Modifier modifier, final drM<? super ControllerScreen.e, dpR> drm, Composer composer, final int i, final int i2) {
        int i3;
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) drx, "");
        Composer startRestartGroup = composer.startRestartGroup(-1068203593);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(drx) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? JSONzip.end : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(drm) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                drm = new drM<ControllerScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodesBottomSheetKt$EpisodesBottomSheet$1
                    public final void c(ControllerScreen.e eVar) {
                        C8632dsu.c((Object) eVar, "");
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(ControllerScreen.e eVar) {
                        c(eVar);
                        return dpR.c;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1068203593, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodesBottomSheet (EpisodesBottomSheet.kt:19)");
            }
            boolean b = dVar.b();
            startRestartGroup.startReplaceableGroup(1091831965);
            boolean z = (i3 & 7168) == 2048;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodesBottomSheetKt$EpisodesBottomSheet$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Boolean bool) {
                        a(bool.booleanValue());
                        return dpR.c;
                    }

                    public final void a(boolean z2) {
                        drm.invoke(ControllerScreen.e.j.e);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            C3594bDq.b(b, (drM) rememberedValue, modifier, ComposableLambdaKt.composableLambda(startRestartGroup, -1466416215, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodesBottomSheetKt$EpisodesBottomSheet$3
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

                public final void c(Composer composer2, int i6) {
                    if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1466416215, i6, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodesBottomSheet.<anonymous> (EpisodesBottomSheet.kt:27)");
                        }
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                        drX<Composer, Integer, dpR> drx2 = drx;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        drO<ComposeUiNode> constructor = companion.getConstructor();
                        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
                        Updater.m1013setimpl(m1009constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        drx2.invoke(composer2, 0);
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
            }), startRestartGroup, (i3 & 896) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final drM<? super ControllerScreen.e, dpR> drm2 = drm;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.episodes.EpisodesBottomSheetKt$EpisodesBottomSheet$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(Composer composer2, int i6) {
                    bCI.c(EpisodesScreen.d.this, drx, modifier2, drm2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    a(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c.e r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bCI.e(com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$c$e, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
