package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
public class ApkAssets {
    private static final String LOGTAG = "ApkAssets";

    @CalledByNative
    public static long[] open(String str, String str2) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                Context applicationContext = ContextUtils.getApplicationContext();
                if (!TextUtils.isEmpty(str2) && BundleUtils.isIsolatedSplitInstalled(str2)) {
                    applicationContext = BundleUtils.createIsolatedSplitContext(applicationContext, str2);
                }
                assetFileDescriptor = applicationContext.getAssets().openNonAssetFd(str);
                long[] jArr = {assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
                try {
                    assetFileDescriptor.close();
                } catch (IOException e) {
                    android.util.Log.e(LOGTAG, "Unable to close AssetFileDescriptor", e);
                }
                return jArr;
            } catch (Throwable th) {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e2) {
                        android.util.Log.e(LOGTAG, "Unable to close AssetFileDescriptor", e2);
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            if (!e3.getMessage().equals("") && !e3.getMessage().equals(str)) {
                android.util.Log.e(LOGTAG, "Error while loading asset " + str + ": " + e3);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e4) {
                    android.util.Log.e(LOGTAG, "Unable to close AssetFileDescriptor", e4);
                }
            }
            return jArr2;
        }
    }
}
