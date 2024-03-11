package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface FloatState extends State<Float> {
    float getFloatValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }
}
