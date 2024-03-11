package org.chromium.net.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes5.dex */
public final class CronetManifest {
    public static boolean isAppOptedInForTelemetry(Context context, CronetLogger.CronetSource cronetSource) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("org.chromium.net.EnableCronetTelemetry");
    }
}
