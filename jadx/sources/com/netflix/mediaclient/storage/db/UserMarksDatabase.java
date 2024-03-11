package com.netflix.mediaclient.storage.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5326bwe;
import o.dpR;

/* loaded from: classes4.dex */
public abstract class UserMarksDatabase extends RoomDatabase {
    public static final a d = new a(null);
    private static UserMarksDatabase e;

    public abstract InterfaceC5326bwe c();

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final UserMarksDatabase c(Context context) {
            C8632dsu.c((Object) context, "");
            if (UserMarksDatabase.e == null) {
                synchronized (UserMarksDatabase.class) {
                    if (UserMarksDatabase.e == null) {
                        a aVar = UserMarksDatabase.d;
                        UserMarksDatabase.e = (UserMarksDatabase) Room.databaseBuilder(context, UserMarksDatabase.class, "UserMarksDb").build();
                    }
                    dpR dpr = dpR.c;
                }
            }
            UserMarksDatabase userMarksDatabase = UserMarksDatabase.e;
            C8632dsu.d(userMarksDatabase);
            return userMarksDatabase;
        }
    }
}
