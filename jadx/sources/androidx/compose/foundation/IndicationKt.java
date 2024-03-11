package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class IndicationKt {
    private static final ProvidableCompositionLocal<Indication> LocalIndication = CompositionLocalKt.staticCompositionLocalOf(new drO<Indication>() { // from class: androidx.compose.foundation.IndicationKt$LocalIndication$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.drO
        public final Indication invoke() {
            return DefaultDebugIndication.INSTANCE;
        }
    });

    public static final ProvidableCompositionLocal<Indication> getLocalIndication() {
        return LocalIndication;
    }

    public static final Modifier indication(Modifier modifier, final InteractionSource interactionSource, final Indication indication) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.IndicationKt$indication$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indication");
                inspectorInfo.getProperties().set("indication", Indication.this);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.IndicationKt$indication$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceableGroup(-353972293);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-353972293, i, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:108)");
                }
                Indication indication2 = Indication.this;
                if (indication2 == null) {
                    indication2 = NoIndication.INSTANCE;
                }
                IndicationInstance rememberUpdatedInstance = indication2.rememberUpdatedInstance(interactionSource, composer, 0);
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(rememberUpdatedInstance);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new IndicationModifier(rememberUpdatedInstance);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                IndicationModifier indicationModifier = (IndicationModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return indicationModifier;
            }
        });
    }
}
