package com.netflix.mediaclient.storage.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import o.InterfaceC5266bvX;

/* loaded from: classes4.dex */
public abstract class PersistedManifestDatabase extends RoomDatabase {
    private static PersistedManifestDatabase a;

    public static void d() {
        a = null;
    }

    public abstract InterfaceC5266bvX c();

    public static PersistedManifestDatabase e(Context context) {
        if (a == null) {
            a = (PersistedManifestDatabase) Room.databaseBuilder(context.getApplicationContext(), PersistedManifestDatabase.class, "manifest").fallbackToDestructiveMigration().build();
        }
        return a;
    }
}
