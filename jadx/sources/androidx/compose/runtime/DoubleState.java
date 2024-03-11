package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface DoubleState extends State<Double> {
    double getDoubleValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    default Double getValue() {
        return Double.valueOf(getDoubleValue());
    }
}
