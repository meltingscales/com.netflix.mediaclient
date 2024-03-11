package androidx.compose.runtime.external.kotlinx.collections.immutable;

/* loaded from: classes.dex */
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {
    @Override // java.util.Set, java.util.Collection
    PersistentSet<E> add(E e);

    @Override // java.util.Set, java.util.Collection
    PersistentSet<E> remove(E e);
}
