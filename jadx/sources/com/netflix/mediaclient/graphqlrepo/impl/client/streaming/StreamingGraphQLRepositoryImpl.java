package com.netflix.mediaclient.graphqlrepo.impl.client.streaming;

import dagger.Module;
import dagger.Provides;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import dagger.hilt.InstallIn;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1471aCn;
import o.InterfaceC1474aCq;
import o.MC;
import o.aCG;
import o.aCJ;
import o.aCO;
import o.aCW;
import o.aFU;

/* loaded from: classes3.dex */
public final class StreamingGraphQLRepositoryImpl extends aCO implements aCG {

    @AssistedFactory
    /* loaded from: classes3.dex */
    public interface d {
        StreamingGraphQLRepositoryImpl a(aCW acw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public StreamingGraphQLRepositoryImpl(InterfaceC1474aCq interfaceC1474aCq, @Assisted aCW acw, InterfaceC1471aCn interfaceC1471aCn) {
        super(interfaceC1474aCq, acw, interfaceC1471aCn);
        C8632dsu.c((Object) interfaceC1474aCq, "");
        C8632dsu.c((Object) acw, "");
        C8632dsu.c((Object) interfaceC1471aCn, "");
    }

    @Module
    @InstallIn({aFU.class})
    /* loaded from: classes3.dex */
    public static final class GraphQLRepositoryProfileScopeModule {
        public static final d c = new d(null);

        /* loaded from: classes3.dex */
        public static final class d {
            public /* synthetic */ d(C8627dsp c8627dsp) {
                this();
            }

            private d() {
            }

            @Provides
            public final aCG a(d dVar, aCW.a aVar, aCJ acj) {
                C8632dsu.c((Object) dVar, "");
                C8632dsu.c((Object) aVar, "");
                C8632dsu.c((Object) acj, "");
                return dVar.a(aVar.e(acj));
            }
        }
    }

    @Module
    @InstallIn({MC.class})
    /* loaded from: classes3.dex */
    public static final class GraphQLRepositoryAccountScopeModule {
        public static final a d = new a(null);

        /* loaded from: classes3.dex */
        public static final class a {
            public /* synthetic */ a(C8627dsp c8627dsp) {
                this();
            }

            private a() {
            }

            @Provides
            public final aCG b(d dVar, aCW acw) {
                C8632dsu.c((Object) dVar, "");
                C8632dsu.c((Object) acw, "");
                return dVar.a(acw);
            }

            @Provides
            public final aCW b(aCW.d dVar, aCJ acj) {
                C8632dsu.c((Object) dVar, "");
                C8632dsu.c((Object) acj, "");
                return dVar.a(acj);
            }
        }
    }
}
