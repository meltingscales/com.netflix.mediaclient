package io.reactivex.subjects;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class BehaviorSubject<T> extends Subject<T> {
    long index;
    final ReadWriteLock lock;
    final Lock readLock;
    final AtomicReference<BehaviorDisposable<T>[]> subscribers;
    final AtomicReference<Throwable> terminalEvent;
    final AtomicReference<Object> value;
    final Lock writeLock;
    private static final Object[] EMPTY_ARRAY = new Object[0];
    static final BehaviorDisposable[] EMPTY = new BehaviorDisposable[0];
    static final BehaviorDisposable[] TERMINATED = new BehaviorDisposable[0];

    public static <T> BehaviorSubject<T> create() {
        return new BehaviorSubject<>();
    }

    public static <T> BehaviorSubject<T> createDefault(T t) {
        return new BehaviorSubject<>(t);
    }

    BehaviorSubject() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
        this.subscribers = new AtomicReference<>(EMPTY);
        this.value = new AtomicReference<>();
        this.terminalEvent = new AtomicReference<>();
    }

    BehaviorSubject(T t) {
        this();
        this.value.lazySet(ObjectHelper.requireNonNull(t, "defaultValue is null"));
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        BehaviorDisposable<T> behaviorDisposable = new BehaviorDisposable<>(observer, this);
        observer.onSubscribe(behaviorDisposable);
        if (add(behaviorDisposable)) {
            if (behaviorDisposable.cancelled) {
                remove(behaviorDisposable);
                return;
            } else {
                behaviorDisposable.emitFirst();
                return;
            }
        }
        Throwable th = this.terminalEvent.get();
        if (th == ExceptionHelper.TERMINATED) {
            observer.onComplete();
        } else {
            observer.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.terminalEvent.get() != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.terminalEvent.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t);
        setCurrent(next);
        for (BehaviorDisposable<T> behaviorDisposable : this.subscribers.get()) {
            behaviorDisposable.emitNext(next, this.index);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.terminalEvent, null, th)) {
            RxJavaPlugins.onError(th);
            return;
        }
        Object error = NotificationLite.error(th);
        for (BehaviorDisposable<T> behaviorDisposable : terminate(error)) {
            behaviorDisposable.emitNext(error, this.index);
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.terminalEvent, null, ExceptionHelper.TERMINATED)) {
            Object complete = NotificationLite.complete();
            for (BehaviorDisposable<T> behaviorDisposable : terminate(complete)) {
                behaviorDisposable.emitNext(complete, this.index);
            }
        }
    }

    public boolean hasObservers() {
        return this.subscribers.get().length != 0;
    }

    public T getValue() {
        Object obj = this.value.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    boolean add(BehaviorDisposable<T> behaviorDisposable) {
        BehaviorDisposable<T>[] behaviorDisposableArr;
        BehaviorDisposable[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = this.subscribers.get();
            if (behaviorDisposableArr == TERMINATED) {
                return false;
            }
            int length = behaviorDisposableArr.length;
            behaviorDisposableArr2 = new BehaviorDisposable[length + 1];
            System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = behaviorDisposable;
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.subscribers, behaviorDisposableArr, behaviorDisposableArr2));
        return true;
    }

    void remove(BehaviorDisposable<T> behaviorDisposable) {
        BehaviorDisposable<T>[] behaviorDisposableArr;
        BehaviorDisposable[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = this.subscribers.get();
            int length = behaviorDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (behaviorDisposableArr[i] == behaviorDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorDisposableArr2 = EMPTY;
            } else {
                BehaviorDisposable[] behaviorDisposableArr3 = new BehaviorDisposable[length - 1];
                System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr3, 0, i);
                System.arraycopy(behaviorDisposableArr, i + 1, behaviorDisposableArr3, i, (length - i) - 1);
                behaviorDisposableArr2 = behaviorDisposableArr3;
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.subscribers, behaviorDisposableArr, behaviorDisposableArr2));
    }

    BehaviorDisposable<T>[] terminate(Object obj) {
        AtomicReference<BehaviorDisposable<T>[]> atomicReference = this.subscribers;
        BehaviorDisposable<T>[] behaviorDisposableArr = TERMINATED;
        BehaviorDisposable<T>[] andSet = atomicReference.getAndSet(behaviorDisposableArr);
        if (andSet != behaviorDisposableArr) {
            setCurrent(obj);
        }
        return andSet;
    }

    void setCurrent(Object obj) {
        this.writeLock.lock();
        this.index++;
        this.value.lazySet(obj);
        this.writeLock.unlock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class BehaviorDisposable<T> implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {
        volatile boolean cancelled;
        final Observer<? super T> downstream;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        AppendOnlyLinkedArrayList<Object> queue;
        final BehaviorSubject<T> state;

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        BehaviorDisposable(Observer<? super T> observer, BehaviorSubject<T> behaviorSubject) {
            this.downstream = observer;
            this.state = behaviorSubject;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.remove(this);
        }

        void emitFirst() {
            if (this.cancelled) {
                return;
            }
            synchronized (this) {
                if (this.cancelled) {
                    return;
                }
                if (this.next) {
                    return;
                }
                BehaviorSubject<T> behaviorSubject = this.state;
                Lock lock = behaviorSubject.readLock;
                lock.lock();
                this.index = behaviorSubject.index;
                Object obj = behaviorSubject.value.get();
                lock.unlock();
                this.emitting = obj != null;
                this.next = true;
                if (obj == null || test(obj)) {
                    return;
                }
                emitLoop();
            }
        }

        void emitNext(Object obj, long j) {
            if (this.cancelled) {
                return;
            }
            if (!this.fastPath) {
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    if (this.index == j) {
                        return;
                    }
                    if (this.emitting) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.queue = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.add(obj);
                        return;
                    }
                    this.next = true;
                    this.fastPath = true;
                }
            }
            test(obj);
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            return this.cancelled || NotificationLite.accept(obj, this.downstream);
        }

        void emitLoop() {
            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
            while (!this.cancelled) {
                synchronized (this) {
                    appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        this.emitting = false;
                        return;
                    }
                    this.queue = null;
                }
                appendOnlyLinkedArrayList.forEachWhile(this);
            }
        }
    }
}
