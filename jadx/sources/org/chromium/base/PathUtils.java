package org.chromium.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.system.Os;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.compat.ApiHelperForM;
import org.chromium.base.compat.ApiHelperForQ;
import org.chromium.base.compat.ApiHelperForR;
import org.chromium.base.task.AsyncTask;

/* loaded from: classes6.dex */
public abstract class PathUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CACHE_DIRECTORY = 2;
    private static final int DATA_DIRECTORY = 0;
    private static final int NUM_DIRECTORIES = 3;
    private static final String TAG = "PathUtils";
    private static final int THUMBNAIL_DIRECTORY = 1;
    private static final String THUMBNAIL_DIRECTORY_NAME = "textures";
    private static String sCacheDirectoryBasePath;
    private static String sCacheSubDirectory;
    private static String sDataDirectoryBasePath;
    private static String sDataDirectorySuffix;
    private static FutureTask<String[]> sDirPathFetchTask;
    private static final AtomicBoolean sInitializationStarted = new AtomicBoolean();

    private PathUtils() {
    }

    public static void resetForTesting() {
        sInitializationStarted.set(false);
        sDirPathFetchTask = null;
        sDataDirectorySuffix = null;
        sCacheSubDirectory = null;
        sDataDirectoryBasePath = null;
        sCacheDirectoryBasePath = null;
    }

    private static String[] getOrComputeDirectoryPaths() {
        if (!sDirPathFetchTask.isDone()) {
            StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
            try {
                sDirPathFetchTask.run();
                if (allowDiskWrites != null) {
                    allowDiskWrites.close();
                }
            } catch (Throwable th) {
                if (allowDiskWrites != null) {
                    try {
                        allowDiskWrites.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        try {
            return sDirPathFetchTask.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressLint({"NewApi"})
    private static void chmod(String str, int i) {
        try {
            Os.chmod(str, i);
        } catch (Exception unused) {
            Log.e(TAG, "Failed to set permissions for path \"" + str + "\"");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] setPrivateDirectoryPathInternal() {
        File file;
        File file2;
        File cacheDir;
        String[] strArr = new String[3];
        Context applicationContext = ContextUtils.getApplicationContext();
        if (sDataDirectoryBasePath == null) {
            file = applicationContext.getDir(sDataDirectorySuffix, 0);
            file2 = applicationContext.getDir(THUMBNAIL_DIRECTORY_NAME, 0);
        } else {
            file = new File(sDataDirectoryBasePath, sDataDirectorySuffix);
            file.mkdirs();
            File file3 = new File(sDataDirectoryBasePath, THUMBNAIL_DIRECTORY_NAME);
            file3.mkdirs();
            file2 = file3;
        }
        if (sCacheDirectoryBasePath != null) {
            cacheDir = new File(sCacheDirectoryBasePath);
        } else {
            cacheDir = applicationContext.getCacheDir();
        }
        if (cacheDir != null) {
            if (sCacheSubDirectory != null) {
                cacheDir = new File(cacheDir, sCacheSubDirectory);
            }
            if (sCacheDirectoryBasePath != null || sCacheSubDirectory != null) {
                cacheDir.mkdirs();
                chmod(cacheDir.getPath(), 1472);
            }
            strArr[2] = cacheDir.getPath();
        }
        String path = file.getPath();
        strArr[0] = path;
        chmod(path, 448);
        strArr[1] = file2.getPath();
        return strArr;
    }

    public static void setPrivateDirectoryPath(String str, String str2, String str3, String str4) {
        if (sInitializationStarted.getAndSet(true)) {
            return;
        }
        sDataDirectoryBasePath = str;
        sCacheDirectoryBasePath = str2;
        sDataDirectorySuffix = str3;
        sCacheSubDirectory = str4;
        sDirPathFetchTask = new FutureTask<>(new Callable() { // from class: org.chromium.base.PathUtils$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] privateDirectoryPathInternal;
                privateDirectoryPathInternal = PathUtils.setPrivateDirectoryPathInternal();
                return privateDirectoryPathInternal;
            }
        });
        AsyncTask.THREAD_POOL_EXECUTOR.execute(sDirPathFetchTask);
    }

    public static void setPrivateDataDirectorySuffix(String str, String str2) {
        setPrivateDirectoryPath(null, null, str, str2);
    }

    public static void setPrivateDataDirectorySuffix(String str) {
        setPrivateDataDirectorySuffix(str, null);
    }

    private static String getDirectoryPath(int i) {
        return getOrComputeDirectoryPaths()[i];
    }

    @CalledByNative
    public static String getDataDirectory() {
        return getDirectoryPath(0);
    }

    @CalledByNative
    public static String getCacheDirectory() {
        return getDirectoryPath(2);
    }

    @CalledByNative
    public static String getThumbnailCacheDirectory() {
        return getDirectoryPath(1);
    }

    @CalledByNative
    public static String getDownloadsDirectory() {
        StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
                String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return str;
            }
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return path;
        } catch (Throwable th) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        StrictModeContext allowDiskWrites = StrictModeContext.allowDiskWrites();
        try {
            File[] externalFilesDirs = ContextUtils.getApplicationContext().getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
            return toAbsolutePathStrings(arrayList);
        } catch (Throwable th) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public static String[] getExternalDownloadVolumesNames() {
        ArrayList arrayList = new ArrayList();
        for (String str : ApiHelperForQ.getExternalVolumeNames(ContextUtils.getApplicationContext())) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                File volumeDir = ApiHelperForR.getVolumeDir((StorageManager) ApiHelperForM.getSystemService(ContextUtils.getApplicationContext(), StorageManager.class), MediaStore.Files.getContentUri(str));
                File file = new File(volumeDir, Environment.DIRECTORY_DOWNLOADS);
                if (!file.isDirectory()) {
                    Log.w(TAG, "Download dir missing: %s, parent dir:%s, isDirectory:%s", file.getAbsolutePath(), volumeDir.getAbsolutePath(), Boolean.valueOf(volumeDir.isDirectory()));
                }
                arrayList.add(file);
            }
        }
        return toAbsolutePathStrings(arrayList);
    }

    private static String[] toAbsolutePathStrings(List<File> list) {
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @CalledByNative
    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
        int i = applicationInfo.flags;
        return ((i & 128) != 0 || (i & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    @CalledByNative
    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }
}
