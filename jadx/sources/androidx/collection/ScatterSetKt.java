package androidx.collection;

/* loaded from: classes.dex */
public final class ScatterSetKt {
    private static final MutableScatterSet<Object> EmptyScatterSet = new MutableScatterSet<>(0);

    public static final <E> MutableScatterSet<E> mutableScatterSetOf() {
        return new MutableScatterSet<>(0, 1, null);
    }
}
