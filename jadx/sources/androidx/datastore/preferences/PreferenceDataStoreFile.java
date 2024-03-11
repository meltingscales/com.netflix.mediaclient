package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class PreferenceDataStoreFile {
    public static final File preferencesDataStoreFile(Context context, String str) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        return DataStoreFile.dataStoreFile(context, C8632dsu.d(str, (Object) ".preferences_pb"));
    }
}
