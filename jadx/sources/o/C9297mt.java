package o;

import android.app.Application;
import android.content.Context;

/* renamed from: o.mt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9297mt extends AbstractC9296ms {
    @Override // o.AbstractC9296ms, android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            return true;
        }
        C9303mz c9303mz = C9303mz.c;
        C9303mz.d(application);
        return true;
    }
}
