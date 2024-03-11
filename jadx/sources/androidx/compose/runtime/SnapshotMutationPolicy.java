package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface SnapshotMutationPolicy<T> {
    boolean equivalent(T t, T t2);

    default T merge(T t, T t2, T t3) {
        return null;
    }
}
