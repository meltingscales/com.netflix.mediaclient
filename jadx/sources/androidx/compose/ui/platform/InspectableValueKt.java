package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class InspectableValueKt {
    private static final drM<InspectorInfo, dpR> NoInspectorInfo = new drM<InspectorInfo, dpR>() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InspectorInfo inspectorInfo) {
        }

        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return dpR.c;
        }
    };
    private static boolean isDebugInspectorInfoEnabled;

    public static final drM<InspectorInfo, dpR> getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final Modifier inspectableWrapper(Modifier modifier, drM<? super InspectorInfo, dpR> drm, Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(drm);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }
}
