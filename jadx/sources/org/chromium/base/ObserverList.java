package org.chromium.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.chromium.base.ThreadUtils;

/* loaded from: classes5.dex */
public class ObserverList<E> implements Iterable<E> {
    private int mCount;
    private int mIterationDepth;
    private boolean mNeedsCompact;
    public final List<E> mObservers = new ArrayList();
    private boolean mEnableThreadAsserts = true;
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();

    /* loaded from: classes5.dex */
    public interface RewindableIterator extends Iterator {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementIterationDepth() {
        this.mIterationDepth++;
    }

    public void disableThreadAsserts() {
        this.mEnableThreadAsserts = false;
    }

    public boolean addObserver(E e) {
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        if (e == null || this.mObservers.contains(e)) {
            return false;
        }
        this.mObservers.add(e);
        this.mCount++;
        return true;
    }

    public boolean removeObserver(E e) {
        int indexOf;
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        if (e == null || (indexOf = this.mObservers.indexOf(e)) == -1) {
            return false;
        }
        if (this.mIterationDepth == 0) {
            this.mObservers.remove(indexOf);
        } else {
            this.mNeedsCompact = true;
            this.mObservers.set(indexOf, null);
        }
        this.mCount--;
        return true;
    }

    public void clear() {
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        this.mCount = 0;
        if (this.mIterationDepth == 0) {
            this.mObservers.clear();
            return;
        }
        int size = this.mObservers.size();
        this.mNeedsCompact |= size != 0;
        for (int i = 0; i < size; i++) {
            this.mObservers.set(i, null);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        return new ObserverListIterator();
    }

    public boolean isEmpty() {
        if (this.mEnableThreadAsserts) {
            this.mThreadChecker.assertOnValidThread();
        }
        return this.mCount == 0;
    }

    private void compact() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            if (this.mObservers.get(size) == null) {
                this.mObservers.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementIterationDepthAndCompactIfNeeded() {
        int i = this.mIterationDepth - 1;
        this.mIterationDepth = i;
        if (i <= 0 && this.mNeedsCompact) {
            this.mNeedsCompact = false;
            compact();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int capacity() {
        return this.mObservers.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E getObserverAt(int i) {
        return this.mObservers.get(i);
    }

    /* loaded from: classes5.dex */
    class ObserverListIterator implements RewindableIterator<E> {
        private int mIndex;
        private boolean mIsExhausted;
        private int mListEndMarker;

        private ObserverListIterator() {
            ObserverList.this.incrementIterationDepth();
            this.mListEndMarker = ObserverList.this.capacity();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (ObserverList.this.mEnableThreadAsserts) {
                ObserverList.this.mThreadChecker.assertOnValidThread();
            }
            int i = this.mIndex;
            while (i < this.mListEndMarker && ObserverList.this.getObserverAt(i) == null) {
                i++;
            }
            if (i < this.mListEndMarker) {
                return true;
            }
            compactListIfNeeded();
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            if (ObserverList.this.mEnableThreadAsserts) {
                ObserverList.this.mThreadChecker.assertOnValidThread();
            }
            while (true) {
                int i = this.mIndex;
                if (i >= this.mListEndMarker || ObserverList.this.getObserverAt(i) != null) {
                    break;
                }
                this.mIndex++;
            }
            int i2 = this.mIndex;
            if (i2 < this.mListEndMarker) {
                ObserverList observerList = ObserverList.this;
                this.mIndex = i2 + 1;
                return (E) observerList.getObserverAt(i2);
            }
            compactListIfNeeded();
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private void compactListIfNeeded() {
            if (this.mIsExhausted) {
                return;
            }
            this.mIsExhausted = true;
            ObserverList.this.decrementIterationDepthAndCompactIfNeeded();
        }
    }
}
