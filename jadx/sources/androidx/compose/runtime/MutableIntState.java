package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface MutableIntState extends IntState, MutableState<Integer> {
    @Override // androidx.compose.runtime.IntState
    int getIntValue();

    void setIntValue(int i);

    @Override // androidx.compose.runtime.MutableState
    /* synthetic */ default void setValue(Integer num) {
        setValue(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }

    default void setValue(int i) {
        setIntValue(i);
    }
}
