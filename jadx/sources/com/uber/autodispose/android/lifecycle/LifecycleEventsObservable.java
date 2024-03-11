package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.uber.autodispose.android.internal.AutoDisposeAndroidUtil;
import com.uber.autodispose.android.internal.MainThreadDisposable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.subjects.BehaviorSubject;

/* loaded from: classes.dex */
class LifecycleEventsObservable extends Observable<Lifecycle.Event> {
    private final BehaviorSubject<Lifecycle.Event> a = BehaviorSubject.create();
    private final Lifecycle e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleEventsObservable(Lifecycle lifecycle) {
        this.e = lifecycle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Lifecycle.Event a() {
        return this.a.getValue();
    }

    /* renamed from: com.uber.autodispose.android.lifecycle.LifecycleEventsObservable$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            c = iArr;
            try {
                iArr[Lifecycle.State.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[Lifecycle.State.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[Lifecycle.State.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[Lifecycle.State.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[Lifecycle.State.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        Lifecycle.Event event;
        int i = AnonymousClass1.c[this.e.getCurrentState().ordinal()];
        if (i == 1) {
            event = Lifecycle.Event.ON_CREATE;
        } else if (i == 2) {
            event = Lifecycle.Event.ON_START;
        } else if (i == 3 || i == 4) {
            event = Lifecycle.Event.ON_RESUME;
        } else {
            event = Lifecycle.Event.ON_DESTROY;
        }
        this.a.onNext(event);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Lifecycle.Event> observer) {
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.e, observer, this.a);
        observer.onSubscribe(archLifecycleObserver);
        if (!AutoDisposeAndroidUtil.d()) {
            observer.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.e.addObserver(archLifecycleObserver);
        if (archLifecycleObserver.isDisposed()) {
            this.e.removeObserver(archLifecycleObserver);
        }
    }

    /* loaded from: classes.dex */
    static final class ArchLifecycleObserver extends MainThreadDisposable implements LifecycleObserver {
        private final Observer<? super Lifecycle.Event> b;
        private final Lifecycle d;
        private final BehaviorSubject<Lifecycle.Event> e;

        ArchLifecycleObserver(Lifecycle lifecycle, Observer<? super Lifecycle.Event> observer, BehaviorSubject<Lifecycle.Event> behaviorSubject) {
            this.d = lifecycle;
            this.b = observer;
            this.e = behaviorSubject;
        }

        @Override // com.uber.autodispose.android.internal.MainThreadDisposable
        public void b() {
            this.d.removeObserver(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        public void onStateChange(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (isDisposed()) {
                return;
            }
            if (event != Lifecycle.Event.ON_CREATE || this.e.getValue() != event) {
                this.e.onNext(event);
            }
            this.b.onNext(event);
        }
    }
}
