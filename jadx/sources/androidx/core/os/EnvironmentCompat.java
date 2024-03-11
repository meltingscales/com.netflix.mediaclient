package androidx.core.os;

import android.os.Environment;
import java.io.File;

/* loaded from: classes2.dex */
public final class EnvironmentCompat {
    public static String getStorageState(File file) {
        return Api21Impl.getExternalStorageState(file);
    }

    /* loaded from: classes2.dex */
    static class Api21Impl {
        static String getExternalStorageState(File file) {
            return Environment.getExternalStorageState(file);
        }
    }
}
