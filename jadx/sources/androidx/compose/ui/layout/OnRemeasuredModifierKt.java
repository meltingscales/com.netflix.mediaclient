package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class OnRemeasuredModifierKt {
    public static final Modifier onSizeChanged(Modifier modifier, final drM<? super IntSize, dpR> drm) {
        return modifier.then(new OnSizeChangedModifier(drm, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.ui.layout.OnRemeasuredModifierKt$onSizeChanged$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("onSizeChanged");
                inspectorInfo.getProperties().set("onSizeChanged", drM.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
