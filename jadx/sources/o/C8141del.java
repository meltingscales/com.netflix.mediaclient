package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* renamed from: o.del  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8141del {
    public static <T> T d(Context context, Class<T> cls) {
        Context baseContext;
        if (cls.isInstance(context)) {
            return cls.cast(context);
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return (T) d(baseContext, cls);
    }

    public static <T> T e(Context context, Class<T> cls) {
        T t = (T) d(context, cls);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Given context cannot be resolved as a " + cls.getName());
    }

    public static boolean c(Context context) {
        if (context == null) {
            return true;
        }
        Activity activity = context instanceof Activity ? (Activity) context : (Activity) d(context, Activity.class);
        if (activity != null) {
            return activity.isFinishing() || activity.isDestroyed();
        }
        InterfaceC1598aHf.a("No activity found in this context : " + context);
        return true;
    }

    public static Activity e(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @Deprecated
    public static boolean a() {
        return TextUtils.equals("robolectric", Build.FINGERPRINT);
    }
}
