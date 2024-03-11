package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.uber.autodispose.lifecycle.CorrespondingEventsFunction;
import com.uber.autodispose.lifecycle.LifecycleEndedException;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopes;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;

/* loaded from: classes.dex */
public final class AndroidLifecycleScopeProvider implements LifecycleScopeProvider<Lifecycle.Event> {
    private static final CorrespondingEventsFunction<Lifecycle.Event> a = new CorrespondingEventsFunction() { // from class: com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider$$ExternalSyntheticLambda0
        @Override // com.uber.autodispose.lifecycle.CorrespondingEventsFunction, io.reactivex.functions.Function
        public final Object apply(Object obj) {
            Lifecycle.Event a2;
            a2 = AndroidLifecycleScopeProvider.a((Lifecycle.Event) obj);
            return a2;
        }
    };
    private final LifecycleEventsObservable b;
    private final CorrespondingEventsFunction<Lifecycle.Event> c;

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    public CorrespondingEventsFunction<Lifecycle.Event> b() {
        return this.c;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    public Observable<Lifecycle.Event> d() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            d = iArr;
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Lifecycle.Event a(Lifecycle.Event event) {
        int i = AnonymousClass1.d[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return Lifecycle.Event.ON_STOP;
                    }
                    throw new LifecycleEndedException("Lifecycle has ended! Last event was " + event);
                }
                return Lifecycle.Event.ON_PAUSE;
            }
            return Lifecycle.Event.ON_STOP;
        }
        return Lifecycle.Event.ON_DESTROY;
    }

    public static AndroidLifecycleScopeProvider c(LifecycleOwner lifecycleOwner) {
        return d(lifecycleOwner.getLifecycle());
    }

    public static AndroidLifecycleScopeProvider a(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        return c(lifecycleOwner.getLifecycle(), event);
    }

    public static AndroidLifecycleScopeProvider d(Lifecycle lifecycle) {
        return b(lifecycle, a);
    }

    public static AndroidLifecycleScopeProvider c(Lifecycle lifecycle, Lifecycle.Event event) {
        return b(lifecycle, new UntilEventFunction(event));
    }

    public static AndroidLifecycleScopeProvider b(Lifecycle lifecycle, CorrespondingEventsFunction<Lifecycle.Event> correspondingEventsFunction) {
        return new AndroidLifecycleScopeProvider(lifecycle, correspondingEventsFunction);
    }

    private AndroidLifecycleScopeProvider(Lifecycle lifecycle, CorrespondingEventsFunction<Lifecycle.Event> correspondingEventsFunction) {
        this.b = new LifecycleEventsObservable(lifecycle);
        this.c = correspondingEventsFunction;
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider
    /* renamed from: e */
    public Lifecycle.Event c() {
        this.b.e();
        return this.b.a();
    }

    @Override // com.uber.autodispose.lifecycle.LifecycleScopeProvider, com.uber.autodispose.ScopeProvider
    public CompletableSource a() {
        return LifecycleScopes.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class UntilEventFunction implements CorrespondingEventsFunction<Lifecycle.Event> {
        private final Lifecycle.Event b;

        @Override // com.uber.autodispose.lifecycle.CorrespondingEventsFunction, io.reactivex.functions.Function
        /* renamed from: b */
        public Lifecycle.Event apply(Lifecycle.Event event) {
            return this.b;
        }

        UntilEventFunction(Lifecycle.Event event) {
            this.b = event;
        }
    }
}
