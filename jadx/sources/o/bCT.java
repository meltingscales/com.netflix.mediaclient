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
import androidx.compose.runtime.MutableState;
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
import com.netflix.mediaclient.ui.commander.impl.presenter.AudioSubtitlesScreen;
import com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.bCT;
import o.dpR;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class bCT {
    public static final void e(final AudioSubtitlesScreen.e eVar, final drX<? super Composer, ? super Integer, dpR> drx, Modifier modifier, final drM<? super ControllerScreen.e, dpR> drm, Composer composer, final int i, final int i2) {
        int i3;
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) drx, "");
        Composer startRestartGroup = composer.startRestartGroup(-808058057);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(eVar) ? 4 : 2) | i;
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
                drm = new drM<ControllerScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.LanguageBottomSheetKt$LanguageBottomSheet$1
                    public final void c(ControllerScreen.e eVar2) {
                        C8632dsu.c((Object) eVar2, "");
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(ControllerScreen.e eVar2) {
                        c(eVar2);
                        return dpR.c;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-808058057, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.language.LanguageBottomSheet (LanguageBottomSheet.kt:23)");
            }
            boolean b = eVar.b();
            startRestartGroup.startReplaceableGroup(-128468653);
            boolean z = (i3 & 7168) == 2048;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.LanguageBottomSheetKt$LanguageBottomSheet$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Boolean bool) {
                        c(bool.booleanValue());
                        return dpR.c;
                    }

                    public final void c(boolean z2) {
                        drm.invoke(ControllerScreen.e.k.b);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            C3594bDq.b(b, (drM) rememberedValue, modifier, ComposableLambdaKt.composableLambda(startRestartGroup, -1206270679, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.LanguageBottomSheetKt$LanguageBottomSheet$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    e(composer2, num.intValue());
                    return dpR.c;
                }

                public final void e(Composer composer2, int i6) {
                    if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1206270679, i6, -1, "com.netflix.mediaclient.ui.commander.impl.ui.modes.language.LanguageBottomSheet.<anonymous> (LanguageBottomSheet.kt:31)");
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
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.modes.language.LanguageBottomSheetKt$LanguageBottomSheet$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i6) {
                    bCT.e(AudioSubtitlesScreen.e.this, drx, modifier2, drm2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen.c.e r16, androidx.compose.ui.Modifier r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bCT.d(com.netflix.mediaclient.ui.commander.impl.presenter.ControllerScreen$c$e, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }
}
