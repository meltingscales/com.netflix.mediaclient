package com.netflix.mediaclient.graphqlrepo.impl.client.loggedout;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1497aDm;
import o.C8632dsu;
import o.InterfaceC1471aCn;
import o.InterfaceC1474aCq;
import o.aCI;
import o.aCO;
import o.aCW;

@Singleton
/* loaded from: classes3.dex */
public final class LoggedOutGraphQLRepositoryImpl extends aCO implements aCI {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface LoggedOutGraphQLRepositoryModule {
        @Binds
        aCI d(LoggedOutGraphQLRepositoryImpl loggedOutGraphQLRepositoryImpl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public LoggedOutGraphQLRepositoryImpl(InterfaceC1474aCq interfaceC1474aCq, C1497aDm c1497aDm, aCW.d dVar, InterfaceC1471aCn interfaceC1471aCn) {
        super(interfaceC1474aCq, dVar.a(c1497aDm), interfaceC1471aCn);
        C8632dsu.c((Object) interfaceC1474aCq, "");
        C8632dsu.c((Object) c1497aDm, "");
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) interfaceC1471aCn, "");
    }
}
