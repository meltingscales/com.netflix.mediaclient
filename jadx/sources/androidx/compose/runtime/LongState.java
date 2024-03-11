package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface LongState extends State<Long> {
    long getLongValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    default Long getValue() {
        return Long.valueOf(getLongValue());
    }
}
