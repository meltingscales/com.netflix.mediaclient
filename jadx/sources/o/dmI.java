package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes5.dex */
public final class dmI {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity e(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C8632dsu.a(context, "");
        }
        return null;
    }
}
