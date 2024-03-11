package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class BackgroundKt {
    /* renamed from: background-bw27NRU$default  reason: not valid java name */
    public static /* synthetic */ Modifier m110backgroundbw27NRU$default(Modifier modifier, long j, Shape shape, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m109backgroundbw27NRU(modifier, j, shape);
    }

    public static /* synthetic */ Modifier background$default(Modifier modifier, Brush brush, Shape shape, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return background(modifier, brush, shape, f);
    }

    /* renamed from: background-bw27NRU  reason: not valid java name */
    public static final Modifier m109backgroundbw27NRU(Modifier modifier, final long j, final Shape shape) {
        return modifier.then(new BackgroundElement(j, null, 1.0f, shape, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("background");
                inspectorInfo.setValue(Color.m1284boximpl(j));
                inspectorInfo.getProperties().set("color", Color.m1284boximpl(j));
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), 2, null));
    }

    public static final Modifier background(Modifier modifier, final Brush brush, final Shape shape, final float f) {
        return modifier.then(new BackgroundElement(0L, brush, f, shape, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.BackgroundKt$background$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("background");
                inspectorInfo.getProperties().set(InteractiveAnimation.ANIMATION_TYPE.ALPHA, Float.valueOf(f));
                inspectorInfo.getProperties().set("brush", brush);
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), 1, null));
    }
}
