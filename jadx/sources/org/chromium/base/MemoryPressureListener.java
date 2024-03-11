package org.chromium.base;

import android.app.Activity;
import java.util.Iterator;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.memory.MemoryPressureCallback;

/* loaded from: classes6.dex */
public class MemoryPressureListener {
    private static final String ACTION_LOW_MEMORY = "org.chromium.base.ACTION_LOW_MEMORY";
    private static final String ACTION_TRIM_MEMORY = "org.chromium.base.ACTION_TRIM_MEMORY";
    private static final String ACTION_TRIM_MEMORY_MODERATE = "org.chromium.base.ACTION_TRIM_MEMORY_MODERATE";
    private static final String ACTION_TRIM_MEMORY_RUNNING_CRITICAL = "org.chromium.base.ACTION_TRIM_MEMORY_RUNNING_CRITICAL";
    private static ObserverList<MemoryPressureCallback> sCallbacks;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface Natives {
        void onMemoryPressure(int i);
    }

    @CalledByNative
    private static void addNativeCallback() {
        ThreadUtils.assertOnUiThread();
        addCallback(new MemoryPressureCallback() { // from class: org.chromium.base.MemoryPressureListener$$ExternalSyntheticLambda0
            @Override // org.chromium.base.memory.MemoryPressureCallback
            public final void onPressure(int i) {
                MemoryPressureListener.lambda$addNativeCallback$0(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addNativeCallback$0(int i) {
        MemoryPressureListenerJni.get().onMemoryPressure(i);
    }

    public static void addCallback(MemoryPressureCallback memoryPressureCallback) {
        ThreadUtils.assertOnUiThread();
        if (sCallbacks == null) {
            sCallbacks = new ObserverList<>();
        }
        sCallbacks.addObserver(memoryPressureCallback);
    }

    public static void removeCallback(MemoryPressureCallback memoryPressureCallback) {
        ThreadUtils.assertOnUiThread();
        ObserverList<MemoryPressureCallback> observerList = sCallbacks;
        if (observerList == null) {
            return;
        }
        observerList.removeObserver(memoryPressureCallback);
    }

    public static void notifyMemoryPressure(int i) {
        ThreadUtils.assertOnUiThread();
        ObserverList<MemoryPressureCallback> observerList = sCallbacks;
        if (observerList == null) {
            return;
        }
        Iterator<MemoryPressureCallback> it = observerList.iterator();
        while (it.hasNext()) {
            it.next().onPressure(i);
        }
    }

    public static boolean handleDebugIntent(Activity activity, String str) {
        ThreadUtils.assertOnUiThread();
        if (ACTION_LOW_MEMORY.equals(str)) {
            simulateLowMemoryPressureSignal(activity);
            return true;
        } else if (ACTION_TRIM_MEMORY.equals(str)) {
            simulateTrimMemoryPressureSignal(activity, 80);
            return true;
        } else if (ACTION_TRIM_MEMORY_RUNNING_CRITICAL.equals(str)) {
            simulateTrimMemoryPressureSignal(activity, 15);
            return true;
        } else if (ACTION_TRIM_MEMORY_MODERATE.equals(str)) {
            simulateTrimMemoryPressureSignal(activity, 60);
            return true;
        } else {
            return false;
        }
    }

    private static void simulateLowMemoryPressureSignal(Activity activity) {
        activity.getApplication().onLowMemory();
        activity.onLowMemory();
    }

    private static void simulateTrimMemoryPressureSignal(Activity activity, int i) {
        activity.getApplication().onTrimMemory(i);
        activity.onTrimMemory(i);
    }
}
