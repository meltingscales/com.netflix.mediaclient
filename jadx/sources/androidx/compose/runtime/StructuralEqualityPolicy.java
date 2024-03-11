package androidx.compose.runtime;

import o.C8632dsu;

/* loaded from: classes.dex */
final class StructuralEqualityPolicy implements SnapshotMutationPolicy<Object> {
    public static final StructuralEqualityPolicy INSTANCE = new StructuralEqualityPolicy();

    public String toString() {
        return "StructuralEqualityPolicy";
    }

    private StructuralEqualityPolicy() {
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        return C8632dsu.c(obj, obj2);
    }
}
