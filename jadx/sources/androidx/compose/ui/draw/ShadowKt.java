package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class ShadowKt {
    /* renamed from: shadow-s4CzXII$default */
    public static /* synthetic */ Modifier m1073shadows4CzXII$default(Modifier modifier, float f, Shape shape, boolean z, long j, long j2, int i, Object obj) {
        boolean z2;
        Shape rectangleShape = (i & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i & 4) != 0) {
            z2 = false;
            if (Dp.m2491compareTo0680j_4(f, Dp.m2492constructorimpl(0)) > 0) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        return m1072shadows4CzXII(modifier, f, rectangleShape, z2, (i & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j, (i & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j2);
    }

    /* renamed from: shadow-s4CzXII */
    public static final Modifier m1072shadows4CzXII(Modifier modifier, final float f, final Shape shape, final boolean z, final long j, final long j2) {
        if (Dp.m2491compareTo0680j_4(f, Dp.m2492constructorimpl(0)) > 0 || z) {
            return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1
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
                    inspectorInfo.setName("shadow");
                    inspectorInfo.getProperties().set("elevation", Dp.m2490boximpl(f));
                    inspectorInfo.getProperties().set("shape", shape);
                    inspectorInfo.getProperties().set("clip", Boolean.valueOf(z));
                    inspectorInfo.getProperties().set("ambientColor", Color.m1284boximpl(j));
                    inspectorInfo.getProperties().set("spotColor", Color.m1284boximpl(j2));
                }
            } : InspectableValueKt.getNoInspectorInfo(), GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, new drM<GraphicsLayerScope, dpR>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo193toPx0680j_4(f));
                    graphicsLayerScope.setShape(shape);
                    graphicsLayerScope.setClip(z);
                    graphicsLayerScope.mo1350setAmbientShadowColor8_81llA(j);
                    graphicsLayerScope.mo1352setSpotShadowColor8_81llA(j2);
                }
            }));
        }
        return modifier;
    }
}
