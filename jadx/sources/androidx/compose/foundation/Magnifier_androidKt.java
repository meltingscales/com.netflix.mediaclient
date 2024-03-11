package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class Magnifier_androidKt {
    private static final SemanticsPropertyKey<drO<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    public static final SemanticsPropertyKey<drO<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    public static final boolean isPlatformMagnifierSupported(int i) {
        return i >= 28;
    }

    /* renamed from: magnifier-jPUL71Q  reason: not valid java name */
    public static final Modifier m145magnifierjPUL71Q(Modifier modifier, final drM<? super Density, Offset> drm, final drM<? super Density, Offset> drm2, drM<? super DpSize, dpR> drm3, final float f, boolean z, final long j, final float f2, final float f3, final boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            return modifier.then(new MagnifierElement(drm, drm2, drm3, f, z, j, f2, f3, z2, platformMagnifierFactory == null ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : platformMagnifierFactory, null));
        }
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new drM<InspectorInfo, dpR>() { // from class: androidx.compose.foundation.Magnifier_androidKt$magnifier-jPUL71Q$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("magnifier (not supported)");
                inspectorInfo.getProperties().set("sourceCenter", drM.this);
                inspectorInfo.getProperties().set("magnifierCenter", drm2);
                inspectorInfo.getProperties().set("zoom", Float.valueOf(f));
                inspectorInfo.getProperties().set("size", DpSize.m2514boximpl(j));
                inspectorInfo.getProperties().set("cornerRadius", Dp.m2490boximpl(f2));
                inspectorInfo.getProperties().set("elevation", Dp.m2490boximpl(f3));
                inspectorInfo.getProperties().set("clippingEnabled", Boolean.valueOf(z2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), Modifier.Companion);
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i);
    }
}
