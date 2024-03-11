package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface IntState extends State<Integer> {
    int getIntValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    default Integer getValue() {
        return Integer.valueOf(getIntValue());
    }
}
