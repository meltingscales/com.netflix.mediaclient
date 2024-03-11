package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class OffsetKt {
    /* renamed from: offset-VpY3zN4  reason: not valid java name */
    public static final Modifier m253offsetVpY3zN4(Modifier modifier, final float f, final float f2) {
        return modifier.then(new OffsetElement(f, f2, true, new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$1
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
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set(InteractiveAnimation.ANIMATION_TYPE.X, Dp.m2490boximpl(f));
                inspectorInfo.getProperties().set(InteractiveAnimation.ANIMATION_TYPE.Y, Dp.m2490boximpl(f2));
            }
        }, null));
    }

    public static final Modifier offset(Modifier modifier, final drM<? super Density, IntOffset> drm) {
        return modifier.then(new OffsetPxElement(drm, true, new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                inspectorInfo.setName("offset");
                inspectorInfo.getProperties().set("offset", drm);
            }
        }));
    }

    /* renamed from: offset-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m254offsetVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m2492constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m2492constructorimpl(0);
        }
        return m253offsetVpY3zN4(modifier, f, f2);
    }
}
