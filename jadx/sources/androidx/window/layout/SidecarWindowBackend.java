package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.layout.SidecarWindowBackend;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes2.dex */
public final class SidecarWindowBackend implements WindowBackend {
    private static volatile SidecarWindowBackend globalInstance;
    private ExtensionInterfaceCompat windowExtension;
    private final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = new CopyOnWriteArrayList<>();
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    public final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    public SidecarWindowBackend(ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        ExtensionInterfaceCompat extensionInterfaceCompat2 = this.windowExtension;
        if (extensionInterfaceCompat2 == null) {
            return;
        }
        extensionInterfaceCompat2.setExtensionCallback(new ExtensionListenerImpl(this));
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(Activity activity, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        WindowLayoutInfo windowLayoutInfo;
        Object obj;
        List i;
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) executor, "");
        C8632dsu.c((Object) consumer, "");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            ExtensionInterfaceCompat windowExtension = getWindowExtension();
            if (windowExtension == null) {
                i = C8569dql.i();
                consumer.accept(new WindowLayoutInfo(i));
                return;
            }
            boolean isActivityRegistered = isActivityRegistered(activity);
            WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new WindowLayoutChangeCallbackWrapper(activity, executor, consumer);
            getWindowLayoutChangeCallbacks().add(windowLayoutChangeCallbackWrapper);
            if (!isActivityRegistered) {
                windowExtension.onWindowLayoutChangeListenerAdded(activity);
            } else {
                Iterator<T> it = getWindowLayoutChangeCallbacks().iterator();
                while (true) {
                    windowLayoutInfo = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C8632dsu.c(activity, ((WindowLayoutChangeCallbackWrapper) obj).getActivity())) {
                        break;
                    }
                }
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (WindowLayoutChangeCallbackWrapper) obj;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    windowLayoutInfo = windowLayoutChangeCallbackWrapper2.getLastInfo();
                }
                if (windowLayoutInfo != null) {
                    windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
                }
            }
            dpR dpr = dpR.c;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer) {
        C8632dsu.c((Object) consumer, "");
        synchronized (globalLock) {
            if (getWindowExtension() == null) {
                return;
            }
            ArrayList<WindowLayoutChangeCallbackWrapper> arrayList = new ArrayList();
            Iterator<WindowLayoutChangeCallbackWrapper> it = getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper next = it.next();
                if (next.getCallback() == consumer) {
                    C8632dsu.a(next, "");
                    arrayList.add(next);
                }
            }
            getWindowLayoutChangeCallbacks().removeAll(arrayList);
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : arrayList) {
                callbackRemovedForActivity(windowLayoutChangeCallbackWrapper.getActivity());
            }
            dpR dpr = dpR.c;
        }
    }

    /* loaded from: classes2.dex */
    public final class ExtensionListenerImpl implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        final /* synthetic */ SidecarWindowBackend this$0;

        public ExtensionListenerImpl(SidecarWindowBackend sidecarWindowBackend) {
            C8632dsu.c((Object) sidecarWindowBackend, "");
            this.this$0 = sidecarWindowBackend;
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) windowLayoutInfo, "");
            Iterator<WindowLayoutChangeCallbackWrapper> it = this.this$0.getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                WindowLayoutChangeCallbackWrapper next = it.next();
                if (C8632dsu.c(next.getActivity(), activity)) {
                    next.accept(windowLayoutInfo);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class WindowLayoutChangeCallbackWrapper {
        private final Activity activity;
        private final Consumer<WindowLayoutInfo> callback;
        private final Executor executor;
        private WindowLayoutInfo lastInfo;

        public final Activity getActivity() {
            return this.activity;
        }

        public final Consumer<WindowLayoutInfo> getCallback() {
            return this.callback;
        }

        public final WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public WindowLayoutChangeCallbackWrapper(Activity activity, Executor executor, Consumer<WindowLayoutInfo> consumer) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) executor, "");
            C8632dsu.c((Object) consumer, "");
            this.activity = activity;
            this.executor = executor;
            this.callback = consumer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: accept$lambda-0  reason: not valid java name */
        public static final void m2754accept$lambda0(WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo) {
            C8632dsu.c((Object) windowLayoutChangeCallbackWrapper, "");
            C8632dsu.c((Object) windowLayoutInfo, "");
            windowLayoutChangeCallbackWrapper.callback.accept(windowLayoutInfo);
        }

        public final void accept(final WindowLayoutInfo windowLayoutInfo) {
            C8632dsu.c((Object) windowLayoutInfo, "");
            this.lastInfo = windowLayoutInfo;
            this.executor.execute(new Runnable() { // from class: androidx.window.layout.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m2754accept$lambda0(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.this, windowLayoutInfo);
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final SidecarWindowBackend getInstance(Context context) {
            C8632dsu.c((Object) context, "");
            if (SidecarWindowBackend.globalInstance == null) {
                ReentrantLock reentrantLock = SidecarWindowBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (SidecarWindowBackend.globalInstance == null) {
                        SidecarWindowBackend.globalInstance = new SidecarWindowBackend(SidecarWindowBackend.Companion.initAndVerifyExtension(context));
                    }
                    dpR dpr = dpR.c;
                } finally {
                    reentrantLock.unlock();
                }
            }
            SidecarWindowBackend sidecarWindowBackend = SidecarWindowBackend.globalInstance;
            C8632dsu.d(sidecarWindowBackend);
            return sidecarWindowBackend;
        }

        public final ExtensionInterfaceCompat initAndVerifyExtension(Context context) {
            C8632dsu.c((Object) context, "");
            try {
                if (isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.validateExtensionInterface()) {
                        return sidecarCompat;
                    }
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public final boolean isSidecarVersionSupported(Version version) {
            return version != null && version.compareTo(Version.Companion.getVERSION_0_1()) >= 0;
        }
    }

    private final boolean isActivityRegistered(Activity activity) {
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : copyOnWriteArrayList) {
                if (C8632dsu.c(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void callbackRemovedForActivity(Activity activity) {
        CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : copyOnWriteArrayList) {
                if (C8632dsu.c(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                    return;
                }
            }
        }
        ExtensionInterfaceCompat extensionInterfaceCompat = this.windowExtension;
        if (extensionInterfaceCompat == null) {
            return;
        }
        extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
    }
}
