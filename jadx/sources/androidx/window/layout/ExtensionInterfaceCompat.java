package androidx.window.layout;

import android.app.Activity;

/* loaded from: classes2.dex */
public interface ExtensionInterfaceCompat {

    /* loaded from: classes2.dex */
    public interface ExtensionCallbackInterface {
        void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo);
    }

    void onWindowLayoutChangeListenerAdded(Activity activity);

    void onWindowLayoutChangeListenerRemoved(Activity activity);

    void setExtensionCallback(ExtensionCallbackInterface extensionCallbackInterface);
}
