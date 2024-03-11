package com.netflix.mediaclient.storage.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5264bvV;
import o.InterfaceC5324bwc;

/* loaded from: classes4.dex */
public abstract class AppHistoryDb extends RoomDatabase {
    public static final b b = new b(null);
    private static AppHistoryDb c;

    public abstract InterfaceC5324bwc b();

    public abstract InterfaceC5264bvV c();

    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final AppHistoryDb c(Context context) {
            C8632dsu.c((Object) context, "");
            if (AppHistoryDb.c == null) {
                Context applicationContext = context.getApplicationContext();
                C8632dsu.a(applicationContext, "");
                AppHistoryDb.c = (AppHistoryDb) Room.databaseBuilder(applicationContext, AppHistoryDb.class, "appHistory").fallbackToDestructiveMigration().build();
            }
            AppHistoryDb appHistoryDb = AppHistoryDb.c;
            C8632dsu.d(appHistoryDb);
            return appHistoryDb;
        }
    }
}
