package androidx.compose.material3;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class ModalBottomSheet_androidKt {

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:312:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /* renamed from: ModalBottomSheet-dYc4hso  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m795ModalBottomSheetdYc4hso(final o.drO<o.dpR> r42, androidx.compose.ui.Modifier r43, androidx.compose.material3.SheetState r44, float r45, androidx.compose.ui.graphics.Shape r46, long r47, long r49, float r51, long r52, o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r54, androidx.compose.foundation.layout.WindowInsets r55, androidx.compose.material3.ModalBottomSheetProperties r56, final o.InterfaceC8612dsa<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r57, androidx.compose.runtime.Composer r58, final int r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt.m795ModalBottomSheetdYc4hso(o.drO, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, long, o.drX, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.ModalBottomSheetProperties, o.dsa, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final SheetState rememberModalBottomSheetState(boolean z, drM<? super SheetValue, Boolean> drm, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1261794383);
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            drm = new drM<SheetValue, Boolean>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$rememberModalBottomSheetState$1
                @Override // o.drM
                public final Boolean invoke(SheetValue sheetValue) {
                    return Boolean.TRUE;
                }
            };
        }
        drM<? super SheetValue, Boolean> drm2 = drm;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1261794383, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.android.kt:363)");
        }
        SheetState rememberSheetState = SheetDefaultsKt.rememberSheetState(z2, drm2, SheetValue.Hidden, false, composer, (i & 14) | 384 | (i & 112), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M  reason: not valid java name */
    public static final void m796Scrim3JVO9M(final long j, final drO<dpR> dro, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(1053897700);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(dro) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? JSONzip.end : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1053897700, i3, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.android.kt:370)");
            }
            if (j != Color.Companion.m1309getUnspecified0d7_KjU()) {
                final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                startRestartGroup.startReplaceableGroup(-1858718943);
                if (z) {
                    Modifier.Companion companion = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(-1858718859);
                    boolean z2 = (i3 & 112) == 32;
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(dro, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    modifier = SemanticsModifierKt.clearAndSetSemantics(SuspendingPointerInputFilterKt.pointerInput(companion, dro, (drX) rememberedValue), new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$dismissSheet$2
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return dpR.c;
                        }
                    });
                } else {
                    modifier = Modifier.Companion;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
                startRestartGroup.startReplaceableGroup(-1858718531);
                boolean z3 = (i3 & 14) == 4;
                boolean changed = startRestartGroup.changed(animateFloatAsState);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changed | z3) || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new drM<DrawScope, dpR>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* bridge */ /* synthetic */ dpR invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return dpR.c;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float Scrim_3J_VO9M$lambda$5;
                            long j2 = j;
                            Scrim_3J_VO9M$lambda$5 = ModalBottomSheet_androidKt.Scrim_3J_VO9M$lambda$5(animateFloatAsState);
                            DrawScope.m1557drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, Scrim_3J_VO9M$lambda$5, null, null, 0, 118, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (drM) rememberedValue2, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i4) {
                    ModalBottomSheet_androidKt.m796Scrim3JVO9M(j, dro, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier modalBottomSheetAnchors(Modifier modifier, final SheetState sheetState, final float f) {
        return OnRemeasuredModifierKt.onSizeChanged(modifier, new drM<IntSize, dpR>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetAnchors$1

            /* loaded from: classes.dex */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheetValue.values().length];
                    try {
                        iArr[SheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(IntSize intSize) {
                m800invokeozmzZPI(intSize.m2550unboximpl());
                return dpR.c;
            }

            /* renamed from: invoke-ozmzZPI  reason: not valid java name */
            public final void m800invokeozmzZPI(final long j) {
                SheetValue sheetValue;
                final float f2 = f;
                final SheetState sheetState2 = SheetState.this;
                DraggableAnchors<SheetValue> DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new drM<DraggableAnchorsConfig<SheetValue>, dpR>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetAnchors$1$newAnchors$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                        invoke2(draggableAnchorsConfig);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                        draggableAnchorsConfig.at(SheetValue.Hidden, f2);
                        if (IntSize.m2546getHeightimpl(j) > f2 / 2 && !sheetState2.getSkipPartiallyExpanded$material3_release()) {
                            draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, f2 / 2.0f);
                        }
                        if (IntSize.m2546getHeightimpl(j) != 0) {
                            draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(0.0f, f2 - IntSize.m2546getHeightimpl(j)));
                        }
                    }
                });
                int i = WhenMappings.$EnumSwitchMapping$0[SheetState.this.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                if (i == 1) {
                    sheetValue = SheetValue.Hidden;
                } else if (i == 2 || i == 3) {
                    sheetValue = SheetValue.PartiallyExpanded;
                    if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                        sheetValue = SheetValue.Expanded;
                        if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                            sheetValue = SheetValue.Hidden;
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                SheetState.this.getAnchoredDraggableState$material3_release().updateAnchors(DraggableAnchors, sheetValue);
            }
        });
    }

    public static final void ModalBottomSheetPopup(final ModalBottomSheetProperties modalBottomSheetProperties, final drO<dpR> dro, final WindowInsets windowInsets, final drX<? super Composer, ? super Integer, dpR> drx, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(738805080);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modalBottomSheetProperties) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(dro) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(windowInsets) ? JSONzip.end : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(drx) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(738805080, i3, -1, "androidx.compose.material3.ModalBottomSheetPopup (ModalBottomSheet.android.kt:436)");
            }
            View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            UUID uuid = (UUID) RememberSaveableKt.rememberSaveable(new Object[0], null, null, new drO<UUID>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$id$1
                @Override // o.drO
                public final UUID invoke() {
                    return UUID.randomUUID();
                }
            }, startRestartGroup, 3072, 6);
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(drx, startRestartGroup, (i3 >> 9) & 14);
            final LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(173201889);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            ModalBottomSheetWindow modalBottomSheetWindow = rememberedValue;
            if (rememberedValue == companion.getEmpty()) {
                ModalBottomSheetWindow modalBottomSheetWindow2 = new ModalBottomSheetWindow(modalBottomSheetProperties, dro, view, uuid);
                modalBottomSheetWindow2.setCustomContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-114385661, true, new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return dpR.c;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        drX ModalBottomSheetPopup$lambda$8;
                        if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-114385661, i4, -1, "androidx.compose.material3.ModalBottomSheetPopup.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:452)");
                            }
                            Modifier modifier = Modifier.Companion;
                            Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SemanticsModifierKt.semantics$default(modifier, false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1.1
                                @Override // o.drM
                                public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return dpR.c;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
                                }
                            }, 1, null), WindowInsets.this);
                            if (Build.VERSION.SDK_INT >= 33) {
                                modifier = WindowInsetsPadding_androidKt.imePadding(modifier);
                            }
                            Modifier then = windowInsetsPadding.then(modifier);
                            State<drX<Composer, Integer, dpR>> state = rememberUpdatedState;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            drO<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m1013setimpl(m1009constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m1013setimpl(m1009constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            drX<ComposeUiNode, Integer, dpR> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (m1009constructorimpl.getInserting() || !C8632dsu.c(m1009constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m1009constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m1009constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m1003boximpl(SkippableUpdater.m1004constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ModalBottomSheetPopup$lambda$8 = ModalBottomSheet_androidKt.ModalBottomSheetPopup$lambda$8(state);
                            ModalBottomSheetPopup$lambda$8.invoke(composer2, 0);
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
                }));
                startRestartGroup.updateRememberedValue(modalBottomSheetWindow2);
                modalBottomSheetWindow = modalBottomSheetWindow2;
            }
            final ModalBottomSheetWindow modalBottomSheetWindow3 = (ModalBottomSheetWindow) modalBottomSheetWindow;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(173202877);
            boolean changedInstance = startRestartGroup.changedInstance(modalBottomSheetWindow3);
            boolean changed = startRestartGroup.changed(layoutDirection);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance | changed) || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new drM<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        ModalBottomSheetWindow.this.show();
                        ModalBottomSheetWindow.this.superSetLayoutDirection(layoutDirection);
                        final ModalBottomSheetWindow modalBottomSheetWindow4 = ModalBottomSheetWindow.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                ModalBottomSheetWindow.this.disposeComposition();
                                ModalBottomSheetWindow.this.dismiss();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(modalBottomSheetWindow3, (drM) rememberedValue2, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i4) {
                    ModalBottomSheet_androidKt.ModalBottomSheetPopup(ModalBottomSheetProperties.this, dro, windowInsets, drx, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldApplySecureFlag(SecureFlagPolicy secureFlagPolicy, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return z;
                }
                throw new NoWhenBranchMatchedException();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final drX<Composer, Integer, dpR> ModalBottomSheetPopup$lambda$8(State<? extends drX<? super Composer, ? super Integer, dpR>> state) {
        return (drX) state.getValue();
    }
}
