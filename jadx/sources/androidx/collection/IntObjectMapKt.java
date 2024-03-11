package androidx.collection;

/* loaded from: classes.dex */
public final class IntObjectMapKt {
    private static final MutableIntObjectMap EmptyIntObjectMap = new MutableIntObjectMap(0);

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf() {
        return new MutableIntObjectMap<>(0, 1, null);
    }
}
