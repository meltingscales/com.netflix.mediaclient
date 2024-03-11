package com.netflix.mediaclient.ui.playercontrolscompose.impl.components;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class PlayerSeekbarKt$bounceClick$1 extends Lambda implements InterfaceC8612dsa<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekbarKt$bounceClick$1(boolean z) {
        super(3);
        this.a = z;
    }

    @Override // o.InterfaceC8612dsa
    public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return e(modifier, composer, num.intValue());
    }

    public final Modifier e(Modifier modifier, Composer composer, int i) {
        C8632dsu.c((Object) modifier, "");
        composer.startReplaceableGroup(1772663469);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1772663469, i, -1, "com.netflix.mediaclient.ui.playercontrolscompose.impl.components.bounceClick.<anonymous> (PlayerSeekbar.kt:207)");
        }
        composer.startReplaceableGroup(2074942866);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ViewState.d, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceableGroup();
        final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState((d((MutableState<ViewState>) mutableState) == ViewState.b && this.a) ? 0.95f : 1.0f, null, 0.0f, "floatAsState", null, composer, 3072, 22);
        composer.startReplaceableGroup(2074943066);
        boolean changed = composer.changed(animateFloatAsState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new drM<GraphicsLayerScope, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerSeekbarKt$bounceClick$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(GraphicsLayerScope graphicsLayerScope) {
                    b(graphicsLayerScope);
                    return dpR.c;
                }

                public final void b(GraphicsLayerScope graphicsLayerScope) {
                    float c;
                    float c2;
                    C8632dsu.c((Object) graphicsLayerScope, "");
                    c = PlayerSeekbarKt$bounceClick$1.c(animateFloatAsState);
                    graphicsLayerScope.setScaleX(c);
                    c2 = PlayerSeekbarKt$bounceClick$1.c(animateFloatAsState);
                    graphicsLayerScope.setScaleY(c2);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifier, (drM) rememberedValue2);
        composer.startReplaceableGroup(2074943184);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Modifier m128clickableO2vRcR0$default = ClickableKt.m128clickableO2vRcR0$default(graphicsLayer, (MutableInteractionSource) rememberedValue3, null, false, null, null, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerSeekbarKt$bounceClick$1.3
            public final void a() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                a();
                return dpR.c;
            }
        }, 28, null);
        ViewState d = d((MutableState<ViewState>) mutableState);
        composer.startReplaceableGroup(2074943326);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new PlayerSeekbarKt$bounceClick$1$4$1(mutableState, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(m128clickableO2vRcR0$default, d, (drX) rememberedValue4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pointerInput;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState d(MutableState<ViewState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MutableState<ViewState> mutableState, ViewState viewState) {
        mutableState.setValue(viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(State<Float> state) {
        return state.getValue().floatValue();
    }
}
