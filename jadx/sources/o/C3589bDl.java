package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonSize;
import com.netflix.hawkins.consumer.component.button.HawkinsButtonType;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.FeatureEducationTip;
import com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$1;
import o.C1020Ln;
import o.C3589bDl;
import o.C3593bDp;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.bBM;
import o.bMT;
import o.dpR;
import o.drM;
import o.duS;

/* renamed from: o.bDl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3589bDl {
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen.a r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3589bDl.a(com.netflix.mediaclient.ui.commander.impl.presenter.DeviceSheetScreen$a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final com.netflix.mediaclient.ui.commander.impl.ui.menu.FeatureEducationTip r25, androidx.compose.ui.Modifier r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3589bDl.d(com.netflix.mediaclient.ui.commander.impl.ui.menu.FeatureEducationTip, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void a(final boolean z, final C3593bDp c3593bDp, final bMT bmt, final Long l, final String str, Modifier modifier, duS<? extends FeatureEducationTip> dus, drM<? super DeviceSheetScreen.e, dpR> drm, Composer composer, final int i, final int i2) {
        duS<? extends FeatureEducationTip> dus2;
        int i3;
        C8632dsu.c((Object) c3593bDp, "");
        Composer startRestartGroup = composer.startRestartGroup(-422413753);
        Modifier.Companion companion = (i2 & 32) != 0 ? Modifier.Companion : modifier;
        if ((i2 & 64) != 0) {
            i3 = i & (-3670017);
            dus2 = duO.a(FeatureEducationTip.b());
        } else {
            dus2 = dus;
            i3 = i;
        }
        FeatureEducationSheetKt$FeatureEducationContent$1 featureEducationSheetKt$FeatureEducationContent$1 = (i2 & 128) != 0 ? new drM<DeviceSheetScreen.e, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$1
            public final void c(DeviceSheetScreen.e eVar) {
                C8632dsu.c((Object) eVar, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(DeviceSheetScreen.e eVar) {
                c(eVar);
                return dpR.c;
            }
        } : drm;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-422413753, i3, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationContent (FeatureEducationSheet.kt:134)");
        }
        Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        drO<ComposeUiNode> constructor = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(wrapContentHeight$default);
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
        Modifier.Companion companion4 = Modifier.Companion;
        Modifier wrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), null, false, 3, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        drO<ComposeUiNode> constructor2 = companion3.getConstructor();
        InterfaceC8612dsa<SkippableUpdater<ComposeUiNode>, Composer, Integer, dpR> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(wrapContentHeight$default2);
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
        final duS<? extends FeatureEducationTip> dus3 = dus2;
        boolean z2 = false;
        final drM<? super DeviceSheetScreen.e, dpR> drm2 = featureEducationSheetKt$FeatureEducationContent$1;
        final Modifier modifier2 = companion;
        LazyDslKt.LazyColumn(ColumnScopeInstance.INSTANCE.weight(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 1.0f, false), null, null, false, arrangement.getTop(), companion2.getCenterHorizontally(), null, false, new drM<LazyListScope, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(LazyListScope lazyListScope) {
                a(lazyListScope);
                return dpR.c;
            }

            public final void a(LazyListScope lazyListScope) {
                C8632dsu.c((Object) lazyListScope, "");
                final bMT bmt2 = bmt;
                final String str2 = str;
                final Long l2 = l;
                final C3593bDp c3593bDp2 = c3593bDp;
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1657663959, true, new InterfaceC8612dsa<LazyItemScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$2$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                        d(lazyItemScope, composer2, num.intValue());
                        return dpR.c;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
                    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void d(androidx.compose.foundation.lazy.LazyItemScope r8, androidx.compose.runtime.Composer r9, int r10) {
                        /*
                            r7 = this;
                            java.lang.String r0 = ""
                            o.C8632dsu.c(r8, r0)
                            r8 = r10 & 81
                            r0 = 16
                            if (r8 != r0) goto L17
                            boolean r8 = r9.getSkipping()
                            if (r8 != 0) goto L12
                            goto L17
                        L12:
                            r9.skipToGroupEnd()
                            goto L88
                        L17:
                            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r8 == 0) goto L26
                            r8 = -1
                            java.lang.String r0 = "com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FeatureEducationSheet.kt:153)"
                            r1 = 1657663959(0x62cdf1d7, float:1.8995045E21)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r10, r8, r0)
                        L26:
                            o.bMT r8 = o.bMT.this
                            r10 = 0
                            if (r8 == 0) goto L62
                            java.lang.String r8 = r2
                            if (r8 == 0) goto L62
                            boolean r8 = o.C8684dus.a(r8)
                            if (r8 == 0) goto L36
                            goto L62
                        L36:
                            java.lang.Long r8 = r3
                            if (r8 == 0) goto L62
                            r8 = 1260734956(0x4b2549ec, float:1.0832364E7)
                            r9.startReplaceableGroup(r8)
                            o.bMT r0 = o.bMT.this
                            java.lang.Long r8 = r3
                            long r1 = r8.longValue()
                            java.lang.String r3 = r2
                            o.bDf r8 = o.C3583bDf.a
                            o.drX r4 = r8.e()
                            r6 = 4480(0x1180, float:6.278E-42)
                            r5 = r9
                            o.drX r8 = r0.a(r1, r3, r4, r5, r6)
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
                            r8.invoke(r9, r0)
                            r9.endReplaceableGroup()
                            goto L70
                        L62:
                            r8 = 1260735392(0x4b254ba0, float:1.08328E7)
                            r9.startReplaceableGroup(r8)
                            r8 = 0
                            r0 = 1
                            o.C3561bCk.b(r8, r9, r10, r0)
                            r9.endReplaceableGroup()
                        L70:
                            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.Companion
                            o.bDp r0 = r4
                            float r0 = r0.e()
                            androidx.compose.ui.Modifier r8 = androidx.compose.foundation.layout.SizeKt.m288height3ABfNKs(r8, r0)
                            androidx.compose.foundation.layout.SpacerKt.Spacer(r8, r9, r10)
                            boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r8 == 0) goto L88
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        L88:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$2$1$1.AnonymousClass1.d(androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):void");
                    }
                }), 3, null);
                final C3593bDp c3593bDp3 = c3593bDp;
                final boolean z3 = z;
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-2140193522, true, new InterfaceC8612dsa<LazyItemScope, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$2$1$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // o.InterfaceC8612dsa
                    public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                        c(lazyItemScope, composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void c(LazyItemScope lazyItemScope, Composer composer2, int i4) {
                        String stringResource;
                        C8632dsu.c((Object) lazyItemScope, "");
                        if ((i4 & 81) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2140193522, i4, -1, "com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FeatureEducationSheet.kt:175)");
                            }
                            Modifier.Companion companion5 = Modifier.Companion;
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(PaddingKt.m275paddingVpY3zN4$default(companion5, C3593bDp.this.c(), 0.0f, 2, null), false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt.FeatureEducationContent.2.1.1.2.1
                                public final void c(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    C8632dsu.c((Object) semanticsPropertyReceiver, "");
                                    SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                                }

                                @Override // o.drM
                                public /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    c(semanticsPropertyReceiver);
                                    return dpR.c;
                                }
                            }, 1, null);
                            if (z3) {
                                composer2.startReplaceableGroup(1260736043);
                                stringResource = StringResources_androidKt.stringResource(bBM.c.W, composer2, 0);
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(1260736157);
                                stringResource = StringResources_androidKt.stringResource(bBM.c.w, composer2, 0);
                                composer2.endReplaceableGroup();
                            }
                            int m2417getCentere0LSkKk = TextAlign.Companion.m2417getCentere0LSkKk();
                            C1020Ln.c(stringResource, semantics$default, (Token.Color) Token.Color.cW.c, (Theme) null, C3593bDp.this.b(), 0L, (TextDecoration) null, TextAlign.m2410boximpl(m2417getCentere0LSkKk), 0L, TextOverflow.Companion.m2458getEllipsisgIe3tQ8(), false, 0, 10, (drM<? super TextLayoutResult, dpR>) null, composer2, 805306752, 384, 11624);
                            SpacerKt.Spacer(SizeKt.m288height3ABfNKs(companion5, C3593bDp.this.e()), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), 3, null);
                final duS<FeatureEducationTip> dus4 = dus3;
                final C3593bDp c3593bDp4 = c3593bDp;
                final FeatureEducationSheetKt$FeatureEducationContent$2$1$1$invoke$$inlined$items$default$1 featureEducationSheetKt$FeatureEducationContent$2$1$1$invoke$$inlined$items$default$1 = new drM() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$2$1$1$invoke$$inlined$items$default$1
                    @Override // o.drM
                    /* renamed from: d */
                    public final Void invoke(FeatureEducationTip featureEducationTip) {
                        return null;
                    }
                };
                lazyListScope.items(dus4.size(), null, new drM<Integer, Object>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$2$1$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ Object invoke(Integer num) {
                        return e(num.intValue());
                    }

                    public final Object e(int i4) {
                        return drM.this.invoke(dus4.get(i4));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new InterfaceC8613dsb<LazyItemScope, Integer, Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$2$1$1$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // o.InterfaceC8613dsb
                    public /* synthetic */ dpR invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        c(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return dpR.c;
                    }

                    public final void c(LazyItemScope lazyItemScope, int i4, Composer composer2, int i5) {
                        int i6;
                        if ((i5 & 14) == 0) {
                            i6 = (composer2.changed(lazyItemScope) ? 4 : 2) | i5;
                        } else {
                            i6 = i5;
                        }
                        if ((i5 & 112) == 0) {
                            i6 |= composer2.changed(i4) ? 32 : 16;
                        }
                        if ((i6 & 731) == 146 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                        }
                        C3589bDl.d((FeatureEducationTip) dus4.get(i4), PaddingKt.m277paddingqDBjuR0$default(Modifier.Companion, c3593bDp4.c(), 0.0f, c3593bDp4.c(), c3593bDp4.d(), 2, null), composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }, startRestartGroup, 221184, 206);
        SpacerKt.Spacer(SizeKt.m288height3ABfNKs(companion4, androidx.compose.ui.unit.Dp.m2492constructorimpl(c3593bDp.e() - c3593bDp.d())), startRestartGroup, 0);
        Modifier m275paddingVpY3zN4$default = PaddingKt.m275paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), c3593bDp.c(), 0.0f, 2, null);
        HawkinsButtonType hawkinsButtonType = HawkinsButtonType.b;
        String stringResource = StringResources_androidKt.stringResource(bBM.c.y, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-624026606);
        int i4 = (i & 29360128) ^ 12582912;
        boolean z3 = (i4 > 8388608 && startRestartGroup.changedInstance(drm2)) || (i & 12582912) == 8388608;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$2$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }

                public final void a() {
                    drm2.invoke(DeviceSheetScreen.e.b.d);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        KF.a(hawkinsButtonType, stringResource, (drO) rememberedValue, m275paddingVpY3zN4$default, null, null, false, startRestartGroup, 6, 112);
        SpacerKt.Spacer(SizeKt.m288height3ABfNKs(companion4, androidx.compose.ui.unit.Dp.m2492constructorimpl(24)), startRestartGroup, 6);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        HawkinsButtonSize hawkinsButtonSize = HawkinsButtonSize.c;
        String stringResource2 = StringResources_androidKt.stringResource(bBM.c.d, startRestartGroup, 0);
        Modifier m277paddingqDBjuR0$default = PaddingKt.m277paddingqDBjuR0$default(boxScopeInstance.align(companion4, companion2.getTopEnd()), 0.0f, androidx.compose.ui.unit.Dp.m2492constructorimpl(12), androidx.compose.ui.unit.Dp.m2492constructorimpl(8), 0.0f, 9, null);
        HawkinsIcon.kk kkVar = HawkinsIcon.kk.e;
        HawkinsButtonType hawkinsButtonType2 = HawkinsButtonType.c;
        startRestartGroup.startReplaceableGroup(389268406);
        if ((i4 > 8388608 && startRestartGroup.changedInstance(drm2)) || (i & 12582912) == 8388608) {
            z2 = true;
        }
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$2$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    b();
                    return dpR.c;
                }

                public final void b() {
                    drm2.invoke(DeviceSheetScreen.e.b.d);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        KE.d(hawkinsButtonType2, (drO) rememberedValue2, kkVar, stringResource2, m277paddingqDBjuR0$default, null, hawkinsButtonSize, false, startRestartGroup, 1573254, 160);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final duS<? extends FeatureEducationTip> dus4 = dus2;
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.screens.FeatureEducationSheetKt$FeatureEducationContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i5) {
                    C3589bDl.a(z, c3593bDp, bmt, l, str, modifier2, dus4, drm2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
