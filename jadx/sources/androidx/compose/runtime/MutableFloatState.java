package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface MutableFloatState extends FloatState, MutableState<Float> {
    @Override // androidx.compose.runtime.FloatState
    float getFloatValue();

    void setFloatValue(float f);

    @Override // androidx.compose.runtime.MutableState
    /* synthetic */ default void setValue(Float f) {
        setValue(f.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    default Float getValue() {
        return Float.valueOf(getFloatValue());
    }

    default void setValue(float f) {
        setFloatValue(f);
    }
}
