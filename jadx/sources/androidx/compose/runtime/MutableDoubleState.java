package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface MutableDoubleState extends DoubleState, MutableState<Double> {
    @Override // androidx.compose.runtime.DoubleState
    double getDoubleValue();

    void setDoubleValue(double d);

    @Override // androidx.compose.runtime.MutableState
    /* synthetic */ default void setValue(Double d) {
        setValue(d.doubleValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }

    default void setValue(double d) {
        setDoubleValue(d);
    }
}
