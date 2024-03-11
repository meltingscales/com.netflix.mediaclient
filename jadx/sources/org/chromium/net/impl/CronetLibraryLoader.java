package org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes5.dex */
public class CronetLibraryLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static volatile boolean sInitThreadInitDone;
    private static final Object sLoadLock = new Object();
    private static final String LIBRARY_NAME = "cronet." + ImplVersion.getCronetVersion();
    private static final String TAG = CronetLibraryLoader.class.getSimpleName();
    private static final HandlerThread sInitThread = new HandlerThread("CronetInit");
    private static volatile boolean sLibraryLoaded = false;
    private static final ConditionVariable sWaitForLibLoad = new ConditionVariable();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface Natives {
        void cronetInitOnInitThread();

        String getCronetVersion();
    }

    public static void ensureInitialized(Context context, CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        synchronized (sLoadLock) {
            if (!sInitThreadInitDone) {
                ContextUtils.initApplicationContext(context);
                HandlerThread handlerThread = sInitThread;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                postToInitThread(new Runnable() { // from class: org.chromium.net.impl.CronetLibraryLoader.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CronetLibraryLoader.ensureInitializedOnInitThread();
                    }
                });
            }
            if (!sLibraryLoaded) {
                if (cronetEngineBuilderImpl.libraryLoader() != null) {
                    cronetEngineBuilderImpl.libraryLoader().loadLibrary(LIBRARY_NAME);
                } else {
                    System.loadLibrary(LIBRARY_NAME);
                }
                String cronetVersion = ImplVersion.getCronetVersion();
                if (!cronetVersion.equals(CronetLibraryLoaderJni.get().getCronetVersion())) {
                    throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", cronetVersion, CronetLibraryLoaderJni.get().getCronetVersion()));
                }
                Log.i(TAG, "Cronet version: %s, arch: %s", cronetVersion, System.getProperty("os.arch"));
                sLibraryLoaded = true;
                sWaitForLibLoad.open();
            }
        }
    }

    private static boolean onInitThread() {
        return sInitThread.getLooper() == Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ensureInitializedOnInitThread() {
        if (sInitThreadInitDone) {
            return;
        }
        NetworkChangeNotifier.init();
        NetworkChangeNotifier.registerToReceiveNotificationsAlways();
        sWaitForLibLoad.block();
        CronetLibraryLoaderJni.get().cronetInitOnInitThread();
        sInitThreadInitDone = true;
    }

    public static void postToInitThread(Runnable runnable) {
        if (onInitThread()) {
            runnable.run();
        } else {
            new Handler(sInitThread.getLooper()).post(runnable);
        }
    }

    @CalledByNative
    private static String getDefaultUserAgent() {
        return UserAgent.from(ContextUtils.getApplicationContext());
    }

    @CalledByNative
    private static void ensureInitializedFromNative() {
        synchronized (sLoadLock) {
            sLibraryLoaded = true;
            sWaitForLibLoad.open();
        }
        ensureInitialized(ContextUtils.getApplicationContext(), null);
    }

    @CalledByNative
    private static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
    }
}
