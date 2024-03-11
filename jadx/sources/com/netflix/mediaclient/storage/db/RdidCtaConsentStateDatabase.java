package com.netflix.mediaclient.storage.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5323bwb;

/* loaded from: classes4.dex */
public abstract class RdidCtaConsentStateDatabase extends RoomDatabase {
    public static final b d = new b(null);

    public abstract InterfaceC5323bwb e();

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes4.dex */
    public static final class AppModule {
        public static final AppModule b = new AppModule();

        private AppModule() {
        }

        @Provides
        @Singleton
        public final RdidCtaConsentStateDatabase e(@ApplicationContext Context context) {
            RdidCtaConsentStateDatabase rdidCtaConsentStateDatabase;
            C8632dsu.c((Object) context, "");
            synchronized (RdidCtaConsentStateDatabase.class) {
                rdidCtaConsentStateDatabase = (RdidCtaConsentStateDatabase) Room.databaseBuilder(context, RdidCtaConsentStateDatabase.class, "RdidCtaConsentStateDb").build();
            }
            return rdidCtaConsentStateDatabase;
        }

        @Provides
        @Singleton
        public final InterfaceC5323bwb e(RdidCtaConsentStateDatabase rdidCtaConsentStateDatabase) {
            C8632dsu.c((Object) rdidCtaConsentStateDatabase, "");
            return rdidCtaConsentStateDatabase.e();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
