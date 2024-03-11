package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.google.firebase.events.Publisher;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class DataCollectionConfigStorage {
    private final Context applicationContext;
    private final AtomicBoolean dataCollectionDefaultEnabled = new AtomicBoolean(readAutoDataCollectionEnabled());
    private final Publisher publisher;
    private final SharedPreferences sharedPreferences;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        this.applicationContext = directBootSafe(context);
        this.sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.publisher = publisher;
    }

    private static Context directBootSafe(Context context) {
        return ContextCompat.isDeviceProtectedStorage(context) ? context : ContextCompat.createDeviceProtectedStorageContext(context);
    }

    public boolean isEnabled() {
        return this.dataCollectionDefaultEnabled.get();
    }

    private boolean readAutoDataCollectionEnabled() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (this.sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            return this.sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }
}
