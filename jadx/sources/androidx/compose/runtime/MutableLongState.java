package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface MutableLongState extends LongState, MutableState<Long> {
    @Override // androidx.compose.runtime.LongState
    long getLongValue();

    void setLongValue(long j);

    @Override // androidx.compose.runtime.MutableState
    /* synthetic */ default void setValue(Long l) {
        setValue(l.longValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    default Long getValue() {
        return Long.valueOf(getLongValue());
    }

    default void setValue(long j) {
        setLongValue(j);
    }
}
