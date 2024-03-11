package com.netflix.mediaclient.util;

import android.content.Context;
import com.google.android.gms.auth.blockstore.Blockstore;
import com.google.android.gms.auth.blockstore.BlockstoreClient;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.C8632dsu;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes5.dex */
public final class BlockStoreClientModule {
    @Provides
    @Singleton
    public final BlockstoreClient d(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        BlockstoreClient client = Blockstore.getClient(context);
        C8632dsu.a(client, "");
        return client;
    }
}
