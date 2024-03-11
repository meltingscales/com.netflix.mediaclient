package com.airbnb.epoxy;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import o.AbstractC3073as;

/* loaded from: classes2.dex */
public class ModelList extends ArrayList<AbstractC3073as<?>> {
    private boolean c;
    private e d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface e {
        void b(int i, int i2);

        void d(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(e eVar) {
        this.d = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ModelList(int i) {
        super(i);
    }

    public ModelList() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.c) {
            throw new IllegalStateException("Notifications already paused");
        }
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (!this.c) {
            throw new IllegalStateException("Notifications already resumed");
        }
        this.c = false;
    }

    private void e(int i, int i2) {
        e eVar;
        if (this.c || (eVar = this.d) == null) {
            return;
        }
        eVar.b(i, i2);
    }

    private void b(int i, int i2) {
        e eVar;
        if (this.c || (eVar = this.d) == null) {
            return;
        }
        eVar.d(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public AbstractC3073as<?> set(int i, AbstractC3073as<?> abstractC3073as) {
        AbstractC3073as<?> abstractC3073as2 = (AbstractC3073as) super.set(i, abstractC3073as);
        if (abstractC3073as2.b() != abstractC3073as.b()) {
            b(i, 1);
            e(i, 1);
        }
        return abstractC3073as2;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a */
    public boolean add(AbstractC3073as<?> abstractC3073as) {
        e(size(), 1);
        return super.add(abstractC3073as);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: d */
    public void add(int i, AbstractC3073as<?> abstractC3073as) {
        e(i, 1);
        super.add(i, abstractC3073as);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends AbstractC3073as<?>> collection) {
        e(size(), collection.size());
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends AbstractC3073as<?>> collection) {
        e(i, collection.size());
        return super.addAll(i, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: e */
    public AbstractC3073as<?> remove(int i) {
        b(i, 1);
        return (AbstractC3073as) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf, 1);
        super.remove(indexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (isEmpty()) {
            return;
        }
        b(0, size());
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected void removeRange(int i, int i2) {
        if (i == i2) {
            return;
        }
        b(i, i2 - i);
        super.removeRange(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Iterator<AbstractC3073as<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        Iterator<AbstractC3073as<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<AbstractC3073as<?>> iterator() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Iterator<AbstractC3073as<?>> {
        int a;
        int b;
        int d;

        private b() {
            this.b = -1;
            this.a = ((ArrayList) ModelList.this).modCount;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.d != ModelList.this.size();
        }

        @Override // java.util.Iterator
        /* renamed from: d */
        public AbstractC3073as<?> next() {
            b();
            int i = this.d;
            this.d = i + 1;
            this.b = i;
            return ModelList.this.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.b < 0) {
                throw new IllegalStateException();
            }
            b();
            try {
                ModelList.this.remove(this.b);
                this.d = this.b;
                this.b = -1;
                this.a = ((ArrayList) ModelList.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        final void b() {
            if (((ArrayList) ModelList.this).modCount != this.a) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator<AbstractC3073as<?>> listIterator() {
        return new d(0);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator<AbstractC3073as<?>> listIterator(int i) {
        return new d(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d extends b implements ListIterator<AbstractC3073as<?>> {
        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.d != 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.d;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.d - 1;
        }

        d(int i) {
            super();
            this.d = i;
        }

        @Override // java.util.ListIterator
        /* renamed from: e */
        public AbstractC3073as<?> previous() {
            b();
            int i = this.d - 1;
            if (i < 0) {
                throw new NoSuchElementException();
            }
            this.d = i;
            this.b = i;
            return ModelList.this.get(i);
        }

        @Override // java.util.ListIterator
        /* renamed from: e */
        public void set(AbstractC3073as<?> abstractC3073as) {
            if (this.b < 0) {
                throw new IllegalStateException();
            }
            b();
            try {
                ModelList.this.set(this.b, abstractC3073as);
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        /* renamed from: b */
        public void add(AbstractC3073as<?> abstractC3073as) {
            b();
            try {
                int i = this.d;
                ModelList.this.add(i, abstractC3073as);
                this.d = i + 1;
                this.b = -1;
                this.a = ((ArrayList) ModelList.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public List<AbstractC3073as<?>> subList(int i, int i2) {
        if (i < 0 || i2 > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i <= i2) {
            return new a(this, i, i2);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a extends AbstractList<AbstractC3073as<?>> {
        private int c;
        private int d;
        private final ModelList e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.airbnb.epoxy.ModelList$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0036a implements ListIterator<AbstractC3073as<?>> {
            private int b;
            private final ListIterator<AbstractC3073as<?>> c;
            private final a d;
            private int e;

            C0036a(ListIterator<AbstractC3073as<?>> listIterator, a aVar, int i, int i2) {
                this.c = listIterator;
                this.d = aVar;
                this.e = i;
                this.b = i + i2;
            }

            @Override // java.util.ListIterator
            /* renamed from: b */
            public void add(AbstractC3073as<?> abstractC3073as) {
                this.c.add(abstractC3073as);
                this.d.c(true);
                this.b++;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.c.nextIndex() < this.b;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.c.previousIndex() >= this.e;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            /* renamed from: c */
            public AbstractC3073as<?> next() {
                if (this.c.nextIndex() < this.b) {
                    return this.c.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.c.nextIndex() - this.e;
            }

            @Override // java.util.ListIterator
            /* renamed from: e */
            public AbstractC3073as<?> previous() {
                if (this.c.previousIndex() >= this.e) {
                    return this.c.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                int previousIndex = this.c.previousIndex();
                int i = this.e;
                if (previousIndex >= i) {
                    return previousIndex - i;
                }
                return -1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                this.c.remove();
                this.d.c(false);
                this.b--;
            }

            @Override // java.util.ListIterator
            /* renamed from: e */
            public void set(AbstractC3073as<?> abstractC3073as) {
                this.c.set(abstractC3073as);
            }
        }

        a(ModelList modelList, int i, int i2) {
            this.e = modelList;
            ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
            this.d = i;
            this.c = i2 - i;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public void add(int i, AbstractC3073as<?> abstractC3073as) {
            if (((AbstractList) this).modCount != ((ArrayList) this.e).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i >= 0 && i <= this.c) {
                this.e.add(i + this.d, abstractC3073as);
                this.c++;
                ((AbstractList) this).modCount = ((ArrayList) this.e).modCount;
                return;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends AbstractC3073as<?>> collection) {
            if (((AbstractList) this).modCount == ((ArrayList) this.e).modCount) {
                if (i >= 0 && i <= this.c) {
                    boolean addAll = this.e.addAll(i + this.d, collection);
                    if (addAll) {
                        this.c += collection.size();
                        ((AbstractList) this).modCount = ((ArrayList) this.e).modCount;
                    }
                    return addAll;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends AbstractC3073as<?>> collection) {
            if (((AbstractList) this).modCount == ((ArrayList) this.e).modCount) {
                boolean addAll = this.e.addAll(this.d + this.c, collection);
                if (addAll) {
                    this.c += collection.size();
                    ((AbstractList) this).modCount = ((ArrayList) this.e).modCount;
                }
                return addAll;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public AbstractC3073as<?> get(int i) {
            if (((AbstractList) this).modCount == ((ArrayList) this.e).modCount) {
                if (i >= 0 && i < this.c) {
                    return this.e.get(i + this.d);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<AbstractC3073as<?>> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<AbstractC3073as<?>> listIterator(int i) {
            if (((AbstractList) this).modCount == ((ArrayList) this.e).modCount) {
                if (i >= 0 && i <= this.c) {
                    return new C0036a(this.e.listIterator(i + this.d), this, this.d, this.c);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public AbstractC3073as<?> remove(int i) {
            if (((AbstractList) this).modCount == ((ArrayList) this.e).modCount) {
                if (i >= 0 && i < this.c) {
                    AbstractC3073as<?> remove = this.e.remove(i + this.d);
                    this.c--;
                    ((AbstractList) this).modCount = ((ArrayList) this.e).modCount;
                    return remove;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            if (i != i2) {
                if (((AbstractList) this).modCount == ((ArrayList) this.e).modCount) {
                    ModelList modelList = this.e;
                    int i3 = this.d;
                    modelList.removeRange(i + i3, i3 + i2);
                    this.c -= i2 - i;
                    ((AbstractList) this).modCount = ((ArrayList) this.e).modCount;
                    return;
                }
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public AbstractC3073as<?> set(int i, AbstractC3073as<?> abstractC3073as) {
            if (((AbstractList) this).modCount == ((ArrayList) this.e).modCount) {
                if (i >= 0 && i < this.c) {
                    return this.e.set(i + this.d, abstractC3073as);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            if (((AbstractList) this).modCount == ((ArrayList) this.e).modCount) {
                return this.c;
            }
            throw new ConcurrentModificationException();
        }

        void c(boolean z) {
            this.c = z ? this.c + 1 : this.c - 1;
            ((AbstractList) this).modCount = ((ArrayList) this.e).modCount;
        }
    }
}
