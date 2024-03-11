package androidx.core.hardware.display;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class DisplayManagerCompat {
    private static final WeakHashMap<Context, WeakReference<DisplayManagerCompat>> sInstances = new WeakHashMap<>();
    private final Context mContext;

    private DisplayManagerCompat(Context context) {
        this.mContext = context;
    }

    public static DisplayManagerCompat getInstance(Context context) {
        DisplayManagerCompat displayManagerCompat;
        WeakHashMap<Context, WeakReference<DisplayManagerCompat>> weakHashMap = sInstances;
        synchronized (weakHashMap) {
            WeakReference<DisplayManagerCompat> weakReference = weakHashMap.get(context);
            if (weakReference == null || weakReference.get() == null) {
                weakReference = new WeakReference<>(new DisplayManagerCompat(context));
                weakHashMap.put(context, weakReference);
            }
            displayManagerCompat = weakReference.get();
        }
        return displayManagerCompat;
    }
}
