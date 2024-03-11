package com.netflix.android.widgetry.utils.compose;

import android.graphics.Rect;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import com.netflix.hawkins.consumer.tokens.Theme;
import kotlin.jvm.internal.Lambda;
import o.C1021Lo;
import o.C1025Ls;
import o.C8632dsu;
import o.C9872yF;
import o.C9876yJ;
import o.InterfaceC8612dsa;
import o.InterfaceC8613dsb;
import o.InterfaceC9877yK;
import o.LC;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes2.dex */
public final class HawkinsTooltipCompatKt$showTooltip$2 extends Lambda implements drX<Composer, Integer, dpR> {
    final /* synthetic */ drM<Boolean, dpR> a;
    final /* synthetic */ InterfaceC8613dsb<BoxScope, InterfaceC9877yK, Composer, Integer, dpR> b;
    final /* synthetic */ PopupProperties c;
    final /* synthetic */ Rect d;
    final /* synthetic */ Modifier e;
    final /* synthetic */ C9872yF g;
    final /* synthetic */ C1025Ls.c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HawkinsTooltipCompatKt$showTooltip$2(Rect rect, C9872yF c9872yF, C1025Ls.c cVar, Modifier modifier, PopupProperties popupProperties, drM<? super Boolean, dpR> drm, InterfaceC8613dsb<? super BoxScope, ? super InterfaceC9877yK, ? super Composer, ? super Integer, dpR> interfaceC8613dsb) {
        super(2);
        this.d = rect;
        this.g = c9872yF;
        this.i = cVar;
        this.e = modifier;
        this.c = popupProperties;
        this.a = drm;
        this.b = interfaceC8613dsb;
    }

    @Override // o.drX
    public /* synthetic */ dpR invoke(Composer composer, Integer num) {
        c(composer, num.intValue());
        return dpR.c;
    }

    public final void c(Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1000863189, i, -1, "com.netflix.android.widgetry.utils.compose.showTooltip.<anonymous> (HawkinsTooltipCompat.kt:48)");
        }
        composer.startReplaceableGroup(-1350087231);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceableGroup();
        if (b(mutableState)) {
            Rect rect = this.d;
            final C1025Ls.c cVar = this.i;
            final Modifier modifier = this.e;
            final PopupProperties popupProperties = this.c;
            final drM<Boolean, dpR> drm = this.a;
            final InterfaceC8613dsb<BoxScope, InterfaceC9877yK, Composer, Integer, dpR> interfaceC8613dsb = this.b;
            C9876yJ.a(rect, ComposableLambdaKt.composableLambda(composer, -236245573, true, new InterfaceC8612dsa<BoxScope, Composer, Integer, dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsTooltipCompatKt$showTooltip$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // o.InterfaceC8612dsa
                public /* synthetic */ dpR invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    d(boxScope, composer2, num.intValue());
                    return dpR.c;
                }

                public final void d(BoxScope boxScope, Composer composer2, int i2) {
                    C8632dsu.c((Object) boxScope, "");
                    if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-236245573, i2, -1, "com.netflix.android.widgetry.utils.compose.showTooltip.<anonymous>.<anonymous> (HawkinsTooltipCompat.kt:51)");
                        }
                        boolean b = HawkinsTooltipCompatKt$showTooltip$2.b(mutableState);
                        C1025Ls.c cVar2 = C1025Ls.c.this;
                        composer2.startReplaceableGroup(-605916352);
                        if (cVar2 == null) {
                            cVar2 = new C1025Ls.c((Theme) composer2.consume(LC.e()), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, null, 0.0f, 0.0f, 0.0f, 0.0f, 8190, null);
                        }
                        C1025Ls.c cVar3 = cVar2;
                        composer2.endReplaceableGroup();
                        Modifier modifier2 = modifier;
                        PopupProperties popupProperties2 = popupProperties;
                        composer2.startReplaceableGroup(-605916503);
                        boolean changedInstance = composer2.changedInstance(drm);
                        final drM<Boolean, dpR> drm2 = drm;
                        final MutableState<Boolean> mutableState2 = mutableState;
                        Object rememberedValue2 = composer2.rememberedValue();
                        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = new drO<dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsTooltipCompatKt$showTooltip$2$1$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(0);
                                }

                                @Override // o.drO
                                public /* synthetic */ dpR invoke() {
                                    d();
                                    return dpR.c;
                                }

                                public final void d() {
                                    HawkinsTooltipCompatKt$showTooltip$2.e(mutableState2, false);
                                    drM<Boolean, dpR> drm3 = drm2;
                                    if (drm3 != null) {
                                        drm3.invoke(Boolean.FALSE);
                                    }
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final InterfaceC8613dsb<BoxScope, InterfaceC9877yK, Composer, Integer, dpR> interfaceC8613dsb2 = interfaceC8613dsb;
                        final drM<Boolean, dpR> drm3 = drm;
                        final MutableState<Boolean> mutableState3 = mutableState;
                        C1021Lo.c(b, modifier2, cVar3, popupProperties2, (drO) rememberedValue2, ComposableLambdaKt.composableLambda(composer2, 405361624, true, new InterfaceC8612dsa<BoxScope, Composer, Integer, dpR>() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsTooltipCompatKt.showTooltip.2.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // o.InterfaceC8612dsa
                            public /* synthetic */ dpR invoke(BoxScope boxScope2, Composer composer3, Integer num) {
                                a(boxScope2, composer3, num.intValue());
                                return dpR.c;
                            }

                            public final void a(BoxScope boxScope2, Composer composer3, int i3) {
                                C8632dsu.c((Object) boxScope2, "");
                                if ((i3 & 14) == 0) {
                                    i3 |= composer3.changed(boxScope2) ? 4 : 2;
                                }
                                if ((i3 & 91) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(405361624, i3, -1, "com.netflix.android.widgetry.utils.compose.showTooltip.<anonymous>.<anonymous>.<anonymous> (HawkinsTooltipCompat.kt:61)");
                                    }
                                    InterfaceC8613dsb<BoxScope, InterfaceC9877yK, Composer, Integer, dpR> interfaceC8613dsb3 = interfaceC8613dsb2;
                                    final drM<Boolean, dpR> drm4 = drm3;
                                    final MutableState<Boolean> mutableState4 = mutableState3;
                                    interfaceC8613dsb3.invoke(boxScope2, new InterfaceC9877yK() { // from class: com.netflix.android.widgetry.utils.compose.HawkinsTooltipCompatKt.showTooltip.2.1.2.2
                                        @Override // o.InterfaceC9877yK
                                        public void e() {
                                            HawkinsTooltipCompatKt$showTooltip$2.e(mutableState4, false);
                                            drM<Boolean, dpR> drm5 = drm4;
                                            if (drm5 != null) {
                                                drm5.invoke(Boolean.TRUE);
                                            }
                                        }
                                    }, composer3, Integer.valueOf(i3 & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, (C1025Ls.c.e << 6) | 196608, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composer, 56);
        } else {
            this.g.e();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
