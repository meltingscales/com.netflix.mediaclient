package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: o.ab  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2163ab {
    public static final boolean b(Context context) {
        Context baseContext;
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (baseContext = contextWrapper.getBaseContext()) == null) {
                return false;
            }
            return b(baseContext);
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing()) {
            return true;
        }
        return activity.isDestroyed();
    }
}
