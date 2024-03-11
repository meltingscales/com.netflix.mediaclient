package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public interface AnimatedVisibilityScope {
    Transition<EnterExitState> getTransition();

    static /* synthetic */ Modifier animateEnterExit$default(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                enterTransition = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            }
            if ((i & 2) != 0) {
                exitTransition = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
            }
            if ((i & 4) != 0) {
                str = "animateEnterExit";
            }
            return animatedVisibilityScope.animateEnterExit(modifier, enterTransition, exitTransition, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
    }

    default Modifier animateEnterExit(Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final String str) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("animateEnterExit");
                inspectorInfo.getProperties().set("enter", EnterTransition.this);
                inspectorInfo.getProperties().set("exit", exitTransition);
                inspectorInfo.getProperties().set("label", str);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC8612dsa<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$2
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
                composer.startReplaceableGroup(1840112047);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1840112047, i, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:678)");
                }
                Modifier then = modifier2.then(EnterExitTransitionKt.createModifier(AnimatedVisibilityScope.this.getTransition(), enterTransition, exitTransition, str, composer, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return then;
            }
        });
    }
}
