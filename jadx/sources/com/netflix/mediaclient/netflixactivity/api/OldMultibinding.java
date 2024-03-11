package com.netflix.mediaclient.netflixactivity.api;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.multibindings.Multibinds;
import java.util.Map;
import o.AbstractC8899fS;
import o.InterfaceC8936gC;
import o.InterfaceC8985gz;

@Module
@InstallIn({InterfaceC8936gC.class})
/* loaded from: classes6.dex */
public interface OldMultibinding {
    @Multibinds
    Map<Class<? extends AbstractC8899fS<?>>, InterfaceC8985gz<?, ?>> e();
}
