package androidx.compose.runtime;

/* loaded from: classes.dex */
final class ReferentialEqualityPolicy implements SnapshotMutationPolicy<Object> {
    public static final ReferentialEqualityPolicy INSTANCE = new ReferentialEqualityPolicy();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        return obj == obj2;
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }

    private ReferentialEqualityPolicy() {
    }
}
