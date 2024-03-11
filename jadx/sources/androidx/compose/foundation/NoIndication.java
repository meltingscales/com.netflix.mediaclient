package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;

/* loaded from: classes.dex */
final class NoIndication implements Indication {
    public static final NoIndication INSTANCE = new NoIndication();

    /* loaded from: classes.dex */
    static final class NoIndicationInstance implements IndicationInstance {
        public static final NoIndicationInstance INSTANCE = new NoIndicationInstance();

        private NoIndicationInstance() {
        }

        @Override // androidx.compose.foundation.IndicationInstance
        public void drawIndication(ContentDrawScope contentDrawScope) {
            contentDrawScope.drawContent();
        }
    }

    private NoIndication() {
    }

    @Override // androidx.compose.foundation.Indication
    public IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i) {
        composer.startReplaceableGroup(285654452);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(285654452, i, -1, "androidx.compose.foundation.NoIndication.rememberUpdatedInstance (Indication.kt:140)");
        }
        NoIndicationInstance noIndicationInstance = NoIndicationInstance.INSTANCE;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return noIndicationInstance;
    }
}
