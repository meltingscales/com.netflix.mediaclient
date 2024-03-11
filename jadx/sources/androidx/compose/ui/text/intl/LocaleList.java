package androidx.compose.ui.text.intl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import o.C8627dsp;
import o.C8628dsq;
import o.C8632dsu;
import o.dsK;

/* loaded from: classes.dex */
public final class LocaleList implements Collection<Locale>, dsK {
    public static final Companion Companion = new Companion(null);
    private final List<Locale> localeList;
    private final int size;

    @Override // java.util.Collection
    public /* synthetic */ boolean add(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Locale> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<Locale> getLocaleList() {
        return this.localeList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super Locale> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C8628dsq.c(this, tArr);
    }

    public LocaleList(List<Locale> list) {
        this.localeList = list;
        this.size = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Locale) {
            return contains((Locale) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int size() {
        return getSize();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final LocaleList getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent();
        }
    }

    public final Locale get(int i) {
        return this.localeList.get(i);
    }

    public boolean contains(Locale locale) {
        return this.localeList.contains(locale);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return this.localeList.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Locale> iterator() {
        return this.localeList.iterator();
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleList) && C8632dsu.c(this.localeList, ((LocaleList) obj).localeList);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.localeList.hashCode();
    }

    public String toString() {
        return "LocaleList(localeList=" + this.localeList + ')';
    }
}
