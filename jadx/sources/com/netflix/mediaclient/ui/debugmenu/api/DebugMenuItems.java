package com.netflix.mediaclient.ui.debugmenu.api;

import android.view.Menu;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

/* loaded from: classes.dex */
public interface DebugMenuItems {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface DebugMenuItemsModule {
        @BindsOptionalOf
        DebugMenuItems a();
    }

    void e(Menu menu);
}
