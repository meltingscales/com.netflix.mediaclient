package com.netflix.mediaclient.ui.home.impl.repository.graphql;

import android.content.Context;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding;
import dagger.Binds;
import dagger.Module;
import dagger.Reusable;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import o.C4116bWv;
import o.C8632dsu;
import o.InterfaceC4004bSr;
import o.InterfaceC5283bvo;
import o.aFU;
import o.cQQ;
import o.drM;

/* loaded from: classes4.dex */
public final class GraphQLHomeRepositoryBinding implements InterfaceC4004bSr.b {
    private final Context e;

    @Module
    @InstallIn({aFU.class})
    /* loaded from: classes6.dex */
    public interface GraphQLHomeRepoActivityProfileScopeModule {
        @Reusable
        @Binds
        InterfaceC4004bSr.b c(GraphQLHomeRepositoryBinding graphQLHomeRepositoryBinding);
    }

    @Module
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: classes6.dex */
    public interface GraphQLHomeRepoActivityRetainedScopeModule {
        @Reusable
        @Binds
        InterfaceC4004bSr.b d(GraphQLHomeRepositoryBinding graphQLHomeRepositoryBinding);
    }

    @EntryPoint
    @InstallIn({aFU.class})
    /* loaded from: classes4.dex */
    public interface a {
        C4116bWv.b i();
    }

    @Inject
    public GraphQLHomeRepositoryBinding(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.e = context;
    }

    @Override // o.InterfaceC4004bSr.b
    public Single<InterfaceC4004bSr> d(final String str) {
        Single<InterfaceC5283bvo> e = new cQQ().e();
        final drM<InterfaceC5283bvo, InterfaceC4004bSr> drm = new drM<InterfaceC5283bvo, InterfaceC4004bSr>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding$create$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
                if (r1 != false) goto L8;
             */
            @Override // o.drM
            /* renamed from: e */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final o.InterfaceC4004bSr invoke(o.InterfaceC5283bvo r13) {
                /*
                    r12 = this;
                    java.lang.String r0 = ""
                    o.C8632dsu.c(r13, r0)
                    com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding r0 = com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding.this
                    android.content.Context r0 = com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding.e(r0)
                    java.lang.String r1 = r13.getProfileGuid()
                    if (r1 == 0) goto L17
                    boolean r1 = o.C8684dus.a(r1)
                    if (r1 == 0) goto Lb5
                L17:
                    o.aHe$d r1 = o.InterfaceC1597aHe.b
                    java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                    r1.<init>()
                    java.util.Map r7 = o.dqF.d(r1)
                    o.aHd r1 = new o.aHd
                    java.lang.String r3 = "SPY-35060 - User profile has a null or blank profile GUID"
                    r4 = 0
                    r5 = 0
                    r6 = 1
                    r8 = 0
                    r9 = 0
                    r10 = 96
                    r11 = 0
                    r2 = r1
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    com.netflix.mediaclient.api.logging.error.ErrorType r2 = r1.a
                    if (r2 == 0) goto L62
                    java.util.Map<java.lang.String, java.lang.String> r3 = r1.e
                    java.lang.String r4 = "errorType"
                    java.lang.String r5 = r2.c()
                    r3.put(r4, r5)
                    java.lang.String r3 = r1.b()
                    if (r3 == 0) goto L62
                    java.lang.String r2 = r2.c()
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r2)
                    java.lang.String r2 = " "
                    r4.append(r2)
                    r4.append(r3)
                    java.lang.String r2 = r4.toString()
                    r1.a(r2)
                L62:
                    java.lang.String r2 = r1.b()
                    if (r2 == 0) goto L78
                    java.lang.Throwable r2 = r1.i
                    if (r2 == 0) goto L78
                    java.lang.Throwable r2 = new java.lang.Throwable
                    java.lang.String r3 = r1.b()
                    java.lang.Throwable r4 = r1.i
                    r2.<init>(r3, r4)
                    goto La2
                L78:
                    java.lang.String r2 = r1.b()
                    if (r2 == 0) goto L88
                    java.lang.Throwable r2 = new java.lang.Throwable
                    java.lang.String r3 = r1.b()
                    r2.<init>(r3)
                    goto La2
                L88:
                    java.lang.Throwable r2 = r1.i
                    if (r2 == 0) goto L9b
                    if (r2 == 0) goto L8f
                    goto La2
                L8f:
                    java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = "Required value was null."
                    java.lang.String r0 = r0.toString()
                    r13.<init>(r0)
                    throw r13
                L9b:
                    java.lang.Throwable r2 = new java.lang.Throwable
                    java.lang.String r3 = "Handled exception with no message"
                    r2.<init>(r3)
                La2:
                    o.aHi$d r3 = o.InterfaceC1601aHi.c
                    o.aHe r4 = r3.c()
                    if (r4 == 0) goto Lae
                    r4.d(r1, r2)
                    goto Lb5
                Lae:
                    o.aHb r3 = r3.e()
                    r3.b(r1, r2)
                Lb5:
                    o.aGb$e r1 = o.C1567aGb.a
                    o.aGb r13 = r1.e(r13)
                    o.aFY$b r1 = o.aFY.b
                    o.aFY r0 = r1.e(r0)
                    o.aFU r13 = r0.e(r13)
                    java.lang.Class<com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding$a> r0 = com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding.a.class
                    java.lang.Object r13 = dagger.hilt.EntryPoints.get(r13, r0)
                    com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding$a r13 = (com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding.a) r13
                    o.bWv$b r13 = r13.i()
                    java.lang.String r0 = r2
                    o.bWv r13 = r13.c(r0)
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeRepositoryBinding$create$1.invoke(o.bvo):o.bSr");
            }
        };
        Single map = e.map(new Function() { // from class: o.bWs
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InterfaceC4004bSr e2;
                e2 = GraphQLHomeRepositoryBinding.e(drM.this, obj);
                return e2;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4004bSr e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (InterfaceC4004bSr) drm.invoke(obj);
    }
}
