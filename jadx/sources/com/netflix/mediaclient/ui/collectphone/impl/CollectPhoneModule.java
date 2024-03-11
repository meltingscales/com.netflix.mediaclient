package com.netflix.mediaclient.ui.collectphone.impl;

import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import o.C5463bzI;
import o.C5470bzP;

@Module
@InstallIn({ActivityComponent.class})
/* loaded from: classes6.dex */
public interface CollectPhoneModule {
    @Binds
    CollectPhone.e b(C5463bzI c5463bzI);

    @Binds
    CollectPhone b(C5470bzP c5470bzP);
}
