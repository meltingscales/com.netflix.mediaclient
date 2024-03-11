package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.ListIterator;
import o.C8560dqc;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private drO<dpR> enabledChangedCallback;
    private final Runnable fallbackOnBackPressed;
    private OnBackInvokedDispatcher invokedDispatcher;
    private OnBackInvokedCallback onBackInvokedCallback;
    private final C8560dqc<OnBackPressedCallback> onBackPressedCallbacks;

    public OnBackPressedDispatcher() {
        this(null, 1, null);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.fallbackOnBackPressed = runnable;
        this.onBackPressedCallbacks = new C8560dqc<>();
        if (Build.VERSION.SDK_INT >= 33) {
            this.enabledChangedCallback = new drO<dpR>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.updateBackInvokedCallbackState$activity_release();
                }
            };
            this.onBackInvokedCallback = Api33Impl.INSTANCE.createOnBackInvokedCallback(new drO<dpR>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.onBackPressed();
                }
            });
        }
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : runnable);
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C8632dsu.c((Object) onBackInvokedDispatcher, "");
        this.invokedDispatcher = onBackInvokedDispatcher;
        updateBackInvokedCallbackState$activity_release();
    }

    public final void updateBackInvokedCallbackState$activity_release() {
        boolean hasEnabledCallbacks = hasEnabledCallbacks();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (hasEnabledCallbacks && !this.backInvokedCallbackRegistered) {
            Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else if (hasEnabledCallbacks || !this.backInvokedCallbackRegistered) {
        } else {
            Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        C8632dsu.c((Object) onBackPressedCallback, "");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    public final Cancellable addCancellableCallback$activity_release(OnBackPressedCallback onBackPressedCallback) {
        C8632dsu.c((Object) onBackPressedCallback, "");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        if (Build.VERSION.SDK_INT >= 33) {
            updateBackInvokedCallbackState$activity_release();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.enabledChangedCallback);
        }
        return onBackPressedCancellable;
    }

    public final void addCallback(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) onBackPressedCallback, "");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            updateBackInvokedCallbackState$activity_release();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.enabledChangedCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class OnBackPressedCancellable implements Cancellable {
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            C8632dsu.c((Object) onBackPressedCallback, "");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            this.onBackPressedCallback.removeCancellable(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
                this.this$0.updateBackInvokedCallbackState$activity_release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        private Cancellable currentCancellable;
        private final Lifecycle lifecycle;
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            C8632dsu.c((Object) lifecycle, "");
            C8632dsu.c((Object) onBackPressedCallback, "");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            C8632dsu.c((Object) lifecycleOwner, "");
            C8632dsu.c((Object) event, "");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
            } else if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            }
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }
    }

    /* loaded from: classes.dex */
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public final void registerOnBackInvokedCallback(Object obj, int i, Object obj2) {
            C8632dsu.c(obj, "");
            C8632dsu.c(obj2, "");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        public final void unregisterOnBackInvokedCallback(Object obj, Object obj2) {
            C8632dsu.c(obj, "");
            C8632dsu.c(obj2, "");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createOnBackInvokedCallback$lambda$0(drO dro) {
            C8632dsu.c((Object) dro, "");
            dro.invoke();
        }

        public final OnBackInvokedCallback createOnBackInvokedCallback(final drO<dpR> dro) {
            C8632dsu.c((Object) dro, "");
            return new OnBackInvokedCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(drO.this);
                }
            };
        }
    }

    public final boolean hasEnabledCallbacks() {
        C8560dqc<OnBackPressedCallback> c8560dqc = this.onBackPressedCallbacks;
        if (!(c8560dqc instanceof Collection) || !c8560dqc.isEmpty()) {
            for (OnBackPressedCallback onBackPressedCallback : c8560dqc) {
                if (onBackPressedCallback.isEnabled()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallback;
        C8560dqc<OnBackPressedCallback> c8560dqc = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> listIterator = c8560dqc.listIterator(c8560dqc.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                onBackPressedCallback = null;
                break;
            }
            onBackPressedCallback = listIterator.previous();
            if (onBackPressedCallback.isEnabled()) {
                break;
            }
        }
        OnBackPressedCallback onBackPressedCallback2 = onBackPressedCallback;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }
}
