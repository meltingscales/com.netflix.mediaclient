package androidx.compose.runtime;

/* loaded from: classes.dex */
final class NeverEqualPolicy implements SnapshotMutationPolicy<Object> {
    public static final NeverEqualPolicy INSTANCE = new NeverEqualPolicy();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        return "NeverEqualPolicy";
    }

    private NeverEqualPolicy() {
    }
}
