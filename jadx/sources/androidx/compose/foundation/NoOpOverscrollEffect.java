package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class NoOpOverscrollEffect implements OverscrollEffect {
    public static final NoOpOverscrollEffect INSTANCE = new NoOpOverscrollEffect();

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        return false;
    }

    private NoOpOverscrollEffect() {
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo105applyToScrollRhakbz0(long j, int i, drM<? super Offset, Offset> drm) {
        return drm.invoke(Offset.m1126boximpl(j)).m1146unboximpl();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ */
    public Object mo104applyToFlingBMRW4eQ(long j, drX<? super Velocity, ? super InterfaceC8585dra<? super Velocity>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object invoke = drx.invoke(Velocity.m2580boximpl(j), interfaceC8585dra);
        e = C8586drb.e();
        return invoke == e ? invoke : dpR.c;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public Modifier getEffectModifier() {
        return Modifier.Companion;
    }
}
