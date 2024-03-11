package org.chromium.base.compat;

import android.net.Uri;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.File;

/* loaded from: classes6.dex */
public final class ApiHelperForR {
    public static File getVolumeDir(StorageManager storageManager, Uri uri) {
        StorageVolume storageVolume;
        File directory;
        storageVolume = storageManager.getStorageVolume(uri);
        directory = storageVolume.getDirectory();
        return directory;
    }
}
