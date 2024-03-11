package androidx.mediarouter.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import androidx.mediarouter.media.MediaRouterJellybean;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class MediaRouterJellybeanMr1 {

    /* loaded from: classes2.dex */
    public interface Callback extends MediaRouterJellybean.Callback {
        void onRoutePresentationDisplayChanged(Object obj);
    }

    public static Object createCallback(Callback callback) {
        return new CallbackProxy(callback);
    }

    /* loaded from: classes2.dex */
    public static final class RouteInfo {
        public static boolean isEnabled(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isEnabled();
        }

        public static Display getPresentationDisplay(Object obj) {
            try {
                return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError e) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
                return null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ActiveScanWorkaround implements Runnable {
        private boolean mActivelyScanningWifiDisplays;
        private final DisplayManager mDisplayManager;
        private final Handler mHandler;
        private Method mScanWifiDisplaysMethod;

        public ActiveScanWorkaround(Context context, Handler handler) {
            throw new UnsupportedOperationException();
        }

        public void setActiveScanRouteTypes(int i) {
            if ((i & 2) == 0) {
                if (this.mActivelyScanningWifiDisplays) {
                    this.mActivelyScanningWifiDisplays = false;
                    this.mHandler.removeCallbacks(this);
                }
            } else if (this.mActivelyScanningWifiDisplays) {
            } else {
                if (this.mScanWifiDisplaysMethod != null) {
                    this.mActivelyScanningWifiDisplays = true;
                    this.mHandler.post(this);
                    return;
                }
                Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mActivelyScanningWifiDisplays) {
                try {
                    this.mScanWifiDisplaysMethod.invoke(this.mDisplayManager, new Object[0]);
                } catch (IllegalAccessException e) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", e);
                } catch (InvocationTargetException e2) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", e2);
                }
                this.mHandler.postDelayed(this, 15000L);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class IsConnectingWorkaround {
        private Method mGetStatusCodeMethod;
        private int mStatusConnecting;

        public IsConnectingWorkaround() {
            throw new UnsupportedOperationException();
        }

        public boolean isConnecting(Object obj) {
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj;
            Method method = this.mGetStatusCodeMethod;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(routeInfo, new Object[0])).intValue() == this.mStatusConnecting;
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    static class CallbackProxy<T extends Callback> extends MediaRouterJellybean.CallbackProxy<T> {
        public CallbackProxy(T t) {
            super(t);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRoutePresentationDisplayChanged(android.media.MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            ((Callback) this.mCallback).onRoutePresentationDisplayChanged(routeInfo);
        }
    }
}
