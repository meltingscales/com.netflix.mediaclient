package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectableModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class FocusableKt {
    private static final FocusableKt$FocusableInNonTouchModeElement$1 FocusableInNonTouchModeElement;
    private static final InspectableModifier focusGroupInspectorInfo;

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }

    public static final Modifier focusable(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource) {
        Modifier modifier2;
        if (z) {
            modifier2 = FocusModifierKt.focusTarget(new FocusableElement(mutableInteractionSource));
        } else {
            modifier2 = Modifier.Companion;
        }
        return modifier.then(modifier2);
    }

    public static final Modifier focusableInNonTouchMode(Modifier modifier, final boolean z, final MutableInteractionSource mutableInteractionSource) {
        return InspectableValueKt.inspectableWrapper(modifier, new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                inspectorInfo.setName("focusableInNonTouchMode");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
            }
        }, focusable(Modifier.Companion.then(FocusableInNonTouchModeElement), z, mutableInteractionSource));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        focusGroupInspectorInfo = new InspectableModifier(InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.FocusableKt$special$$inlined$debugInspectorInfo$1
            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("focusGroup");
            }
        } : InspectableValueKt.getNoInspectorInfo());
        FocusableInNonTouchModeElement = new ModifierNodeElement<FocusableInNonTouchMode>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public boolean equals(Object obj) {
                return this == obj;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(FocusableInNonTouchMode focusableInNonTouchMode) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public FocusableInNonTouchMode create() {
                return new FocusableInNonTouchMode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return System.identityHashCode(this);
            }
        };
    }
}
