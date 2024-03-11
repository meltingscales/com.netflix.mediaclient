package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import o.dsT;

/* loaded from: classes.dex */
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* renamed from: create-nHHXs2Y */
    public PlatformMagnifierImpl mo150createnHHXs2Y(View view, boolean z, long j, float f, float f2, boolean z2, Density density, float f3) {
        int e;
        int e2;
        if (z) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long mo194toSizeXkaWNTQ = density.mo194toSizeXkaWNTQ(j);
        float mo193toPx0680j_4 = density.mo193toPx0680j_4(f);
        float mo193toPx0680j_42 = density.mo193toPx0680j_4(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (mo194toSizeXkaWNTQ != Size.Companion.m1181getUnspecifiedNHjbRc()) {
            e = dsT.e(Size.m1176getWidthimpl(mo194toSizeXkaWNTQ));
            e2 = dsT.e(Size.m1174getHeightimpl(mo194toSizeXkaWNTQ));
            builder.setSize(e, e2);
        }
        if (!Float.isNaN(mo193toPx0680j_4)) {
            builder.setCornerRadius(mo193toPx0680j_4);
        }
        if (!Float.isNaN(mo193toPx0680j_42)) {
            builder.setElevation(mo193toPx0680j_42);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new PlatformMagnifierImpl(builder.build());
    }

    /* loaded from: classes.dex */
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public PlatformMagnifierImpl(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo149updateWko1d7g(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                getMagnifier().setZoom(f);
            }
            if (OffsetKt.m1151isSpecifiedk4lQ0M(j2)) {
                getMagnifier().show(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j), Offset.m1137getXimpl(j2), Offset.m1138getYimpl(j2));
            } else {
                getMagnifier().show(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j));
            }
        }
    }
}
