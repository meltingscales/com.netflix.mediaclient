package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class BoxScopeInstance implements BoxScope {
    public static final BoxScopeInstance INSTANCE = new BoxScopeInstance();

    private BoxScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier matchParentSize(Modifier modifier) {
        return modifier.then(new BoxChildDataElement(Alignment.Companion.getCenter(), true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1
            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("matchParentSize");
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier align(Modifier modifier, final Alignment alignment) {
        return modifier.then(new BoxChildDataElement(alignment, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$align$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("align");
                inspectorInfo.setValue(Alignment.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
