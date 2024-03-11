package com.netflix.mediaclient.flipper.empty;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.XS;

/* loaded from: classes3.dex */
public final class NetflixFlipperEmpty implements XS {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface FlipperModule {
        @Binds
        XS b(NetflixFlipperEmpty netflixFlipperEmpty);
    }

    @Override // o.XS
    public boolean e() {
        return false;
    }
}
