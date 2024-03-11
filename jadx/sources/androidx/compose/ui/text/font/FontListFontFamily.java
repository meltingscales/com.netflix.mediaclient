package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import o.C8628dsq;
import o.C8632dsu;
import o.dsK;

/* loaded from: classes.dex */
public final class FontListFontFamily extends FileBasedFontFamily implements List<Font>, dsK {
    private final /* synthetic */ List<Font> $$delegate_0;
    private final List<Font> fonts;

    @Override // java.util.List
    public /* synthetic */ void add(int i, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Font> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Font> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Font font) {
        return this.$$delegate_0.contains(font);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return this.$$delegate_0.containsAll(collection);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Font get(int i) {
        return this.$$delegate_0.get(i);
    }

    public final List<Font> getFonts() {
        return this.fonts;
    }

    public int getSize() {
        return this.$$delegate_0.size();
    }

    public int indexOf(Font font) {
        return this.$$delegate_0.indexOf(font);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Font> iterator() {
        return this.$$delegate_0.iterator();
    }

    public int lastIndexOf(Font font) {
        return this.$$delegate_0.lastIndexOf(font);
    }

    @Override // java.util.List
    public ListIterator<Font> listIterator() {
        return this.$$delegate_0.listIterator();
    }

    @Override // java.util.List
    public ListIterator<Font> listIterator(int i) {
        return this.$$delegate_0.listIterator(i);
    }

    @Override // java.util.List
    public /* synthetic */ Font remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Font> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ Font set(int i, Font font) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super Font> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<Font> subList(int i, int i2) {
        return this.$$delegate_0.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C8628dsq.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C8628dsq.c(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Font) {
            return contains((Font) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Font) {
            return indexOf((Font) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Font) {
            return lastIndexOf((Font) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamily(List<? extends Font> list) {
        super(null);
        this.$$delegate_0 = list;
        if (!(!list.isEmpty())) {
            throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
        }
        this.fonts = new ArrayList(list);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FontListFontFamily) && C8632dsu.c(this.fonts, ((FontListFontFamily) obj).fonts);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.fonts.hashCode();
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.fonts + ')';
    }
}
