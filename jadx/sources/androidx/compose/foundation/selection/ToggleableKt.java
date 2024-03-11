package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class ToggleableKt {
    /* renamed from: toggleable-O2vRcR0  reason: not valid java name */
    public static final Modifier m394toggleableO2vRcR0(Modifier modifier, final boolean z, final MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final Role role, final drM<? super Boolean, dpR> drm) {
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("toggleable");
                inspectorInfo.getProperties().set("value", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onValueChange", drm);
            }
        } : InspectableValueKt.getNoInspectorInfo(), m395triStateToggleableO2vRcR0(Modifier.Companion, ToggleableStateKt.ToggleableState(z), mutableInteractionSource, indication, z2, role, new drO<dpR>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                drm.invoke(Boolean.valueOf(!z));
            }
        }));
    }

    /* renamed from: triStateToggleable-O2vRcR0  reason: not valid java name */
    public static final Modifier m395triStateToggleableO2vRcR0(Modifier modifier, final ToggleableState toggleableState, final MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final Role role, final drO<dpR> dro) {
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("triStateToggleable");
                inspectorInfo.getProperties().set("state", ToggleableState.this);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("onClick", dro);
            }
        } : InspectableValueKt.getNoInspectorInfo(), SemanticsModifierKt.semantics$default(ClickableKt.m128clickableO2vRcR0$default(Modifier.Companion, mutableInteractionSource, indication, z, null, role, dro, 8, null), false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$4$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableState.this);
            }
        }, 1, null));
    }
}
