package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes5.dex */
class HeartBeatInfoStorage {
    private static HeartBeatInfoStorage instance;
    private final SharedPreferences sharedPreferences;

    private HeartBeatInfoStorage(Context context) {
        this.sharedPreferences = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HeartBeatInfoStorage getInstance(Context context) {
        HeartBeatInfoStorage heartBeatInfoStorage;
        synchronized (HeartBeatInfoStorage.class) {
            if (instance == null) {
                instance = new HeartBeatInfoStorage(context);
            }
            heartBeatInfoStorage = instance;
        }
        return heartBeatInfoStorage;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldSendSdkHeartBeat(String str, long j) {
        synchronized (this) {
            if (this.sharedPreferences.contains(str)) {
                if (j - this.sharedPreferences.getLong(str, -1L) >= 86400000) {
                    this.sharedPreferences.edit().putLong(str, j).apply();
                    return true;
                }
                return false;
            }
            this.sharedPreferences.edit().putLong(str, j).apply();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldSendGlobalHeartBeat(long j) {
        boolean shouldSendSdkHeartBeat;
        synchronized (this) {
            shouldSendSdkHeartBeat = shouldSendSdkHeartBeat("fire-global", j);
        }
        return shouldSendSdkHeartBeat;
    }
}
