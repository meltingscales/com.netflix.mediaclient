package androidx.compose.runtime;

import o.C8632dsu;

/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotMutationPolicyKt {
    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        ReferentialEqualityPolicy referentialEqualityPolicy = ReferentialEqualityPolicy.INSTANCE;
        C8632dsu.d(referentialEqualityPolicy);
        return referentialEqualityPolicy;
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        StructuralEqualityPolicy structuralEqualityPolicy = StructuralEqualityPolicy.INSTANCE;
        C8632dsu.d(structuralEqualityPolicy);
        return structuralEqualityPolicy;
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.INSTANCE;
        C8632dsu.d(neverEqualPolicy);
        return neverEqualPolicy;
    }
}
