package androidx.datastore;

import android.content.Context;
import java.io.File;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class DataStoreFile {
    public static final File dataStoreFile(Context context, String str) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        return new File(context.getApplicationContext().getFilesDir(), C8632dsu.d("datastore/", (Object) str));
    }
}
