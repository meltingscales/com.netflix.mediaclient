package com.netflix.mediaclient.graphqlplatform.impl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import o.C1478aCu;
import o.C1479aCv;
import o.C1480aCw;
import o.C1481aCx;
import o.C1482aCy;
import o.C1483aCz;
import o.InterfaceC1469aCl;
import o.InterfaceC1471aCn;
import o.InterfaceC1473aCp;
import o.InterfaceC1474aCq;
import o.InterfaceC1475aCr;
import o.InterfaceC1476aCs;
import o.InterfaceC1477aCt;
import o.aCD;

@Module
@InstallIn({SingletonComponent.class})
/* loaded from: classes6.dex */
public interface PlatformModule {
    @Binds
    InterfaceC1474aCq a(C1478aCu c1478aCu);

    @Binds
    InterfaceC1476aCs a(C1481aCx c1481aCx);

    @Binds
    InterfaceC1477aCt a(aCD.a aVar);

    @Binds
    InterfaceC1471aCn c(C1480aCw c1480aCw);

    @Binds
    InterfaceC1475aCr d(C1483aCz c1483aCz);

    @Binds
    InterfaceC1469aCl e(C1479aCv c1479aCv);

    @Singleton
    @Binds
    InterfaceC1473aCp e(C1482aCy c1482aCy);
}
