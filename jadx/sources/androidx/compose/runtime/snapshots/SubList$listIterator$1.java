package androidx.compose.runtime.snapshots;

import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref;
import o.dsR;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class SubList$listIterator$1<T> implements ListIterator<T>, dsR {
    final /* synthetic */ Ref.IntRef $current;
    final /* synthetic */ SubList<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubList$listIterator$1(Ref.IntRef intRef, SubList<T> subList) {
        this.$current = intRef;
        this.this$0 = subList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        add((SubList$listIterator$1<T>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        set((SubList$listIterator$1<T>) obj);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.$current.b >= 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.$current.b + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        int i = this.$current.b;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.b = i - 1;
        return this.this$0.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.$current.b;
    }

    @Override // java.util.ListIterator
    public Void add(T t) {
        SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.$current.b < this.this$0.size() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        int i = this.$current.b + 1;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.b = i;
        return this.this$0.get(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Void remove() {
        SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.ListIterator
    public Void set(T t) {
        SnapshotStateListKt.modificationError();
        throw new KotlinNothingValueException();
    }
}
