package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes2.dex */
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {
    private final Map<Activity, MulticastConsumer> activityToListeners;
    private final WindowLayoutComponent component;
    private final ReentrantLock extensionWindowBackendLock;
    private final Map<Consumer<WindowLayoutInfo>, Activity> listenerToActivity;

    public ExtensionWindowLayoutInfoBackend(WindowLayoutComponent windowLayoutComponent) {
        C8632dsu.c((Object) windowLayoutComponent, "");
        this.component = windowLayoutComponent;
        this.extensionWindowBackendLock = new ReentrantLock();
        this.activityToListeners = new LinkedHashMap();
        this.listenerToActivity = new LinkedHashMap();
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(Activity activity, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        dpR dpr;
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) executor, "");
        C8632dsu.c((Object) consumer, "");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                dpr = null;
            } else {
                multicastConsumer.addListener(consumer);
                this.listenerToActivity.put(consumer, activity);
                dpr = dpR.c;
            }
            if (dpr == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(activity);
                this.activityToListeners.put(activity, multicastConsumer2);
                this.listenerToActivity.put(consumer, activity);
                multicastConsumer2.addListener(consumer);
                this.component.addWindowLayoutInfoListener(activity, multicastConsumer2);
            }
            dpR dpr2 = dpR.c;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer) {
        C8632dsu.c((Object) consumer, "");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            Activity activity = this.listenerToActivity.get(consumer);
            if (activity == null) {
                return;
            }
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                return;
            }
            multicastConsumer.removeListener(consumer);
            if (multicastConsumer.isEmpty()) {
                this.component.removeWindowLayoutInfoListener(multicastConsumer);
            }
            dpR dpr = dpR.c;
        } finally {
            reentrantLock.unlock();
        }
    }

    @SuppressLint({"NewApi"})
    /* loaded from: classes2.dex */
    static final class MulticastConsumer implements java.util.function.Consumer<androidx.window.extensions.layout.WindowLayoutInfo> {
        private final Activity activity;
        private WindowLayoutInfo lastKnownValue;
        private final ReentrantLock multicastConsumerLock;
        private final Set<Consumer<WindowLayoutInfo>> registeredListeners;

        public MulticastConsumer(Activity activity) {
            C8632dsu.c((Object) activity, "");
            this.activity = activity;
            this.multicastConsumerLock = new ReentrantLock();
            this.registeredListeners = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        public void accept(androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
            C8632dsu.c((Object) windowLayoutInfo, "");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.activity, windowLayoutInfo);
                Iterator<T> it = this.registeredListeners.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).accept(this.lastKnownValue);
                }
                dpR dpr = dpR.c;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void addListener(Consumer<WindowLayoutInfo> consumer) {
            C8632dsu.c((Object) consumer, "");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo = this.lastKnownValue;
                if (windowLayoutInfo != null) {
                    consumer.accept(windowLayoutInfo);
                }
                this.registeredListeners.add(consumer);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void removeListener(Consumer<WindowLayoutInfo> consumer) {
            C8632dsu.c((Object) consumer, "");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(consumer);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean isEmpty() {
            return this.registeredListeners.isEmpty();
        }
    }
}
