package com.netflix.mediaclient.servicemgr;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.Multibinds;
import java.util.Set;

/* loaded from: classes6.dex */
public interface PlaybackEndedListener {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface PlaybackEndedListenerModule {
        @Multibinds
        Set<PlaybackEndedListener> c();
    }
}
