package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes2.dex */
public final class SidecarCompat implements ExtensionInterfaceCompat {
    public static final Companion Companion = new Companion(null);
    private final Map<Activity, ComponentCallbacks> componentCallbackMap;
    private ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;
    private final SidecarInterface sidecar;
    private final SidecarAdapter sidecarAdapter;
    private final Map<IBinder, Activity> windowListenerRegisteredContexts;

    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    public SidecarCompat(SidecarInterface sidecarInterface, SidecarAdapter sidecarAdapter) {
        C8632dsu.c((Object) sidecarAdapter, "");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(Companion.getSidecarCompat$window_release(context), new SidecarAdapter(null, 1, null));
        C8632dsu.c((Object) context, "");
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
        C8632dsu.c((Object) extensionCallbackInterface, "");
        this.extensionCallback = new DistinctElementCallback(extensionCallbackInterface);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback(this)));
    }

    public final WindowLayoutInfo getWindowLayoutInfo(Activity activity) {
        List i;
        C8632dsu.c((Object) activity, "");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            i = C8569dql.i();
            return new WindowLayoutInfo(i);
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release);
        SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, deviceState);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(Activity activity) {
        C8632dsu.c((Object) activity, "");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new FirstAttachAdapter(this, activity));
    }

    public final void register(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        C8632dsu.c((Object) iBinder, "");
        C8632dsu.c((Object) activity, "");
        this.windowListenerRegisteredContexts.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.extensionCallback;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    private final void registerConfigurationChangeListener(final Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    C8632dsu.c((Object) configuration, "");
                    ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = SidecarCompat.this.extensionCallback;
                    if (extensionCallbackInterface == null) {
                        return;
                    }
                    Activity activity2 = activity;
                    extensionCallbackInterface.onWindowLayoutChanged(activity2, SidecarCompat.this.getWindowLayoutInfo(activity2));
                }
            };
            this.componentCallbackMap.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(Activity activity) {
        SidecarInterface sidecarInterface;
        C8632dsu.c((Object) activity, "");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        unregisterComponentCallback(activity);
        boolean z = this.windowListenerRegisteredContexts.size() == 1;
        this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
        if (!z || (sidecarInterface = this.sidecar) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    private final void unregisterComponentCallback(Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0172 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:13:0x0024, B:15:0x002c, B:19:0x0034, B:23:0x003c, B:33:0x005d, B:35:0x0065, B:45:0x0086, B:47:0x008c, B:57:0x00ac, B:59:0x00b2, B:61:0x00b8, B:67:0x00ee, B:68:0x010a, B:70:0x010d, B:72:0x013c, B:75:0x0146, B:76:0x014d, B:77:0x014e, B:78:0x0155, B:63:0x00bb, B:65:0x00e6, B:79:0x0156, B:80:0x015d, B:81:0x015e, B:82:0x0165, B:83:0x0166, B:84:0x0171, B:56:0x00a8, B:50:0x0091, B:53:0x0099, B:85:0x0172, B:86:0x017d, B:44:0x0082, B:38:0x006a, B:41:0x0072, B:87:0x017e, B:88:0x0189, B:32:0x0059, B:26:0x0041, B:29:0x0049, B:22:0x0039, B:18:0x0031, B:89:0x018a, B:90:0x0195, B:12:0x0020, B:6:0x0008, B:9:0x0010), top: B:95:0x0001, inners: #0, #2 }] */
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean validateExtensionInterface() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.validateExtensionInterface():boolean");
    }

    /* loaded from: classes2.dex */
    static final class FirstAttachAdapter implements View.OnAttachStateChangeListener {
        private final WeakReference<Activity> activityWeakReference;
        private final SidecarCompat sidecarCompat;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C8632dsu.c((Object) view, "");
        }

        public FirstAttachAdapter(SidecarCompat sidecarCompat, Activity activity) {
            C8632dsu.c((Object) sidecarCompat, "");
            C8632dsu.c((Object) activity, "");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C8632dsu.c((Object) view, "");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.activityWeakReference.get();
            IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
            if (activity == null || activityWindowToken$window_release == null) {
                return;
            }
            this.sidecarCompat.register(activityWindowToken$window_release, activity);
        }
    }

    /* loaded from: classes2.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        final /* synthetic */ SidecarCompat this$0;

        public TranslatingCallback(SidecarCompat sidecarCompat) {
            C8632dsu.c((Object) sidecarCompat, "");
            this.this$0 = sidecarCompat;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface sidecar;
            C8632dsu.c((Object) sidecarDeviceState, "");
            SidecarCompat sidecarCompat = this.this$0;
            for (Activity activity : this.this$0.windowListenerRegisteredContexts.values()) {
                IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = (activityWindowToken$window_release == null || (sidecar = sidecarCompat.getSidecar()) == null) ? null : sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.extensionCallback;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate(windowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            C8632dsu.c((Object) iBinder, "");
            C8632dsu.c((Object) sidecarWindowLayoutInfo, "");
            Activity activity = (Activity) this.this$0.windowListenerRegisteredContexts.get(iBinder);
            if (activity != null) {
                SidecarAdapter sidecarAdapter = this.this$0.sidecarAdapter;
                SidecarInterface sidecar = this.this$0.getSidecar();
                SidecarDeviceState deviceState = sidecar == null ? null : sidecar.getDeviceState();
                if (deviceState == null) {
                    deviceState = new SidecarDeviceState();
                }
                WindowLayoutInfo translate = sidecarAdapter.translate(sidecarWindowLayoutInfo, deviceState);
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.this$0.extensionCallback;
                if (extensionCallbackInterface == null) {
                    return;
                }
                extensionCallbackInterface.onWindowLayoutChanged(activity, translate);
                return;
            }
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
        }
    }

    /* loaded from: classes2.dex */
    static final class DistinctElementCallback implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        private final WeakHashMap<Activity, WindowLayoutInfo> activityWindowLayoutInfo;
        private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
        private final ReentrantLock lock;

        public DistinctElementCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
            C8632dsu.c((Object) extensionCallbackInterface, "");
            this.callbackInterface = extensionCallbackInterface;
            this.lock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) windowLayoutInfo, "");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (C8632dsu.c(windowLayoutInfo, this.activityWindowLayoutInfo.get(activity))) {
                    return;
                }
                this.activityWindowLayoutInfo.put(activity, windowLayoutInfo);
                reentrantLock.unlock();
                this.callbackInterface.onWindowLayoutChanged(activity, windowLayoutInfo);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        private final SidecarInterface.SidecarCallback callbackInterface;
        private SidecarDeviceState lastDeviceState;
        private final ReentrantLock lock;
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;
        private final SidecarAdapter sidecarAdapter;

        public DistinctSidecarElementCallback(SidecarAdapter sidecarAdapter, SidecarInterface.SidecarCallback sidecarCallback) {
            C8632dsu.c((Object) sidecarAdapter, "");
            C8632dsu.c((Object) sidecarCallback, "");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = sidecarCallback;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            C8632dsu.c((Object) sidecarDeviceState, "");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, sidecarDeviceState)) {
                    return;
                }
                this.lastDeviceState = sidecarDeviceState;
                this.callbackInterface.onDeviceStateChanged(sidecarDeviceState);
                dpR dpr = dpR.c;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            C8632dsu.c((Object) iBinder, "");
            C8632dsu.c((Object) sidecarWindowLayoutInfo, "");
            synchronized (this.lock) {
                if (this.sidecarAdapter.isEqualSidecarWindowLayoutInfo(this.mActivityWindowLayoutInfo.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.mActivityWindowLayoutInfo.put(iBinder, sidecarWindowLayoutInfo);
                this.callbackInterface.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Version getSidecarVersion() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty(apiVersion)) {
                    return Version.Companion.parse(apiVersion);
                }
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            }
            return null;
        }

        public final SidecarInterface getSidecarCompat$window_release(Context context) {
            C8632dsu.c((Object) context, "");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final IBinder getActivityWindowToken$window_release(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }
    }
}
