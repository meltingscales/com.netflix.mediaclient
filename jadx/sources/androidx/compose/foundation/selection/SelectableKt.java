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
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class SelectableKt {
    /* renamed from: selectable-O2vRcR0  reason: not valid java name */
    public static final Modifier m393selectableO2vRcR0(Modifier modifier, final boolean z, final MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final Role role, final drO<dpR> dro) {
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("selectable");
                inspectorInfo.getProperties().set(VisualStateDefinition.ELEMENT_STATE.SELECTED, Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", dro);
            }
        } : InspectableValueKt.getNoInspectorInfo(), SemanticsModifierKt.semantics$default(ClickableKt.m128clickableO2vRcR0$default(Modifier.Companion, mutableInteractionSource, indication, z2, null, role, dro, 8, null), false, new drM<SemanticsPropertyReceiver, dpR>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable$4$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
            }
        }, 1, null));
    }
}
