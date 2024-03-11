package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.MotionDurationScale;
import o.dqZ;
import o.drX;

/* loaded from: classes.dex */
final class MotionDurationScaleImpl implements MotionDurationScale {
    private final MutableFloatState scaleFactor$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    @Override // o.dqZ
    public <R> R fold(R r, drX<? super R, ? super dqZ.b, ? extends R> drx) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r, drx);
    }

    @Override // o.dqZ.b, o.dqZ
    public <E extends dqZ.b> E get(dqZ.d<E> dVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, dVar);
    }

    @Override // o.dqZ
    public dqZ minusKey(dqZ.d<?> dVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, dVar);
    }

    @Override // o.dqZ
    public dqZ plus(dqZ dqz) {
        return MotionDurationScale.DefaultImpls.plus(this, dqz);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return this.scaleFactor$delegate.getFloatValue();
    }

    public void setScaleFactor(float f) {
        this.scaleFactor$delegate.setFloatValue(f);
    }
}
