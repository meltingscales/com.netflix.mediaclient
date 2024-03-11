package org.chromium.net.impl;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes5.dex */
public final class CronetLoggerFactory {
    private static final String TAG = "CronetLoggerFactory";
    private static final CronetLogger sDefaultLogger = new NoOpLogger();
    private static CronetLogger sTestingLogger;

    public static CronetLogger createNoOpLogger() {
        return sDefaultLogger;
    }

    private CronetLoggerFactory() {
    }

    public static CronetLogger createLogger(Context context, CronetLogger.CronetSource cronetSource) {
        CronetLogger cronetLogger = sTestingLogger;
        if (cronetLogger != null) {
            return cronetLogger;
        }
        if (!CronetManifest.isAppOptedInForTelemetry(context, cronetSource) || Build.VERSION.SDK_INT < 30) {
            return sDefaultLogger;
        }
        Class<? extends CronetLogger> fetchLoggerImplClass = fetchLoggerImplClass();
        if (fetchLoggerImplClass == null) {
            return sDefaultLogger;
        }
        try {
            return fetchLoggerImplClass.getConstructor(Integer.TYPE).newInstance(1);
        } catch (Exception e) {
            Log.e(TAG, "Exception creating an instance of CronetLoggerImpl", e);
            return sDefaultLogger;
        }
    }

    private static Class<? extends CronetLogger> fetchLoggerImplClass() {
        try {
            return CronetLoggerFactory.class.getClassLoader().loadClass("com.google.net.cronet.telemetry.CronetLoggerImpl").asSubclass(CronetLogger.class);
        } catch (Exception e) {
            Log.e(TAG, "Exception fetching LoggerImpl class", e);
            return null;
        }
    }
}
