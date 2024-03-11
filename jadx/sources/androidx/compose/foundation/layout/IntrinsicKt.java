package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class IntrinsicKt {
    public static final Modifier width(Modifier modifier, final IntrinsicSize intrinsicSize) {
        return modifier.then(new IntrinsicWidthElement(intrinsicSize, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.IntrinsicKt$width$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
                inspectorInfo.getProperties().set("intrinsicSize", IntrinsicSize.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final Modifier height(Modifier modifier, final IntrinsicSize intrinsicSize) {
        return modifier.then(new IntrinsicHeightElement(intrinsicSize, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.IntrinsicKt$height$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
                inspectorInfo.getProperties().set("intrinsicSize", IntrinsicSize.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
