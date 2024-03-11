package com.netflix.mediaclient.ui.player.v2;

import com.apollographql.apollo3.exception.ApolloException;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1044Mm;
import o.C1384Zi;
import o.C5600cBk;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.aCE;
import o.aCG;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
public final class PlayerPrefetchRepositoryImpl$prefetchPlayer$2 extends SuspendLambda implements drX<C1384Zi, InterfaceC8585dra<? super C8954gU<C1384Zi.e>>, Object> {
    int a;
    final /* synthetic */ C1384Zi b;
    final /* synthetic */ C5600cBk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerPrefetchRepositoryImpl$prefetchPlayer$2(C5600cBk c5600cBk, C1384Zi c1384Zi, InterfaceC8585dra<? super PlayerPrefetchRepositoryImpl$prefetchPlayer$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c5600cBk;
        this.b = c1384Zi;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(C1384Zi c1384Zi, InterfaceC8585dra<? super C8954gU<C1384Zi.e>> interfaceC8585dra) {
        return ((PlayerPrefetchRepositoryImpl$prefetchPlayer$2) create(c1384Zi, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerPrefetchRepositoryImpl$prefetchPlayer$2(this.d, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCG acg;
        e = C8586drb.e();
        int i = this.a;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                acg = this.d.d;
                C1384Zi c1384Zi = this.b;
                QueryMode queryMode = QueryMode.b;
                this.a = 1;
                obj = aCE.d.a(acg, c1384Zi, queryMode, null, false, this, 12, null);
                if (obj == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            return (C8954gU) obj;
        } catch (ApolloException unused) {
            C1044Mm.b("PlayerPrefetchRepositoryImpl", "Found an apollo exception in prefetch for player");
            return null;
        }
    }
}
