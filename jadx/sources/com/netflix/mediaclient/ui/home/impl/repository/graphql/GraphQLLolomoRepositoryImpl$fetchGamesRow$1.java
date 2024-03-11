package com.netflix.mediaclient.ui.home.impl.repository.graphql;

import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchGamesRow$1;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.jvm.internal.Lambda;
import o.C4001bSo;
import o.C4003bSq;
import o.C4065bUy;
import o.C4116bWv;
import o.C8632dsu;
import o.InterfaceC5155btS;
import o.drM;

/* loaded from: classes4.dex */
public final class GraphQLLolomoRepositoryImpl$fetchGamesRow$1 extends Lambda implements drM<C4001bSo, SingleSource<? extends Optional<C4003bSq>>> {
    final /* synthetic */ C4116bWv a;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoRepositoryImpl$fetchGamesRow$1(C4116bWv c4116bWv, int i, int i2, boolean z) {
        super(1);
        this.a = c4116bWv;
        this.e = i;
        this.d = i2;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.drM
    /* renamed from: e */
    public final SingleSource<? extends Optional<C4003bSq>> invoke(C4001bSo c4001bSo) {
        C8632dsu.c((Object) c4001bSo, "");
        List<C4003bSq> e = c4001bSo.e();
        C4003bSq c4003bSq = null;
        if (e != null) {
            Iterator<T> it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C4065bUy.a.e(((C4003bSq) next).b())) {
                    c4003bSq = next;
                    break;
                }
            }
            c4003bSq = c4003bSq;
        }
        InterfaceC5155btS b = c4001bSo.b();
        if (c4003bSq != null && b != null) {
            Single<C4003bSq> c = this.a.c(b, c4003bSq.b().getListPos(), this.e + this.d, this.c);
            final AnonymousClass1 anonymousClass1 = new drM<C4003bSq, Optional<C4003bSq>>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchGamesRow$1.1
                @Override // o.drM
                /* renamed from: e */
                public final Optional<C4003bSq> invoke(C4003bSq c4003bSq2) {
                    C8632dsu.c((Object) c4003bSq2, "");
                    return Optional.ofNullable(c4003bSq2);
                }
            };
            return c.map(new Function() { // from class: o.bXb
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Optional c2;
                    c2 = GraphQLLolomoRepositoryImpl$fetchGamesRow$1.c(drM.this, obj);
                    return c2;
                }
            });
        }
        return Single.just(Optional.ofNullable(c4003bSq));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Optional c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Optional) drm.invoke(obj);
    }
}
