package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public interface OverscrollEffect {
    /* renamed from: applyToFling-BMRW4eQ */
    Object mo104applyToFlingBMRW4eQ(long j, drX<? super Velocity, ? super InterfaceC8585dra<? super Velocity>, ? extends Object> drx, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    /* renamed from: applyToScroll-Rhakbz0 */
    long mo105applyToScrollRhakbz0(long j, int i, drM<? super Offset, Offset> drm);

    Modifier getEffectModifier();

    boolean isInProgress();
}
