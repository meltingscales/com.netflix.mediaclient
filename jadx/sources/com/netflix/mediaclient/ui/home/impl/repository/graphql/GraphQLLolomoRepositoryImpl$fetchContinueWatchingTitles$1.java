package com.netflix.mediaclient.ui.home.impl.repository.graphql;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchContinueWatchingTitles$1;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.jvm.internal.Lambda;
import o.C4001bSo;
import o.C4003bSq;
import o.C4116bWv;
import o.C8632dsu;
import o.InterfaceC5155btS;
import o.drM;

/* loaded from: classes4.dex */
public final class GraphQLLolomoRepositoryImpl$fetchContinueWatchingTitles$1 extends Lambda implements drM<C4001bSo, SingleSource<? extends Optional<C4003bSq>>> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean d;
    final /* synthetic */ C4116bWv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoRepositoryImpl$fetchContinueWatchingTitles$1(C4116bWv c4116bWv, int i, int i2, boolean z) {
        super(1);
        this.e = c4116bWv;
        this.a = i;
        this.b = i2;
        this.d = z;
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
                if (C8632dsu.c((Object) ((C4003bSq) next).b().getListContext(), (Object) LoMoType.CONTINUE_WATCHING.a())) {
                    c4003bSq = next;
                    break;
                }
            }
            c4003bSq = c4003bSq;
        }
        InterfaceC5155btS b = c4001bSo.b();
        if (c4003bSq != null && b != null) {
            C4116bWv c4116bWv = this.e;
            int listPos = c4003bSq.b().getListPos();
            int i = this.a;
            Single<C4003bSq> c = c4116bWv.c(b, listPos, this.b + i, this.d || i > 0);
            final AnonymousClass1 anonymousClass1 = new drM<C4003bSq, Optional<C4003bSq>>() { // from class: com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLLolomoRepositoryImpl$fetchContinueWatchingTitles$1.1
                @Override // o.drM
                /* renamed from: c */
                public final Optional<C4003bSq> invoke(C4003bSq c4003bSq2) {
                    C8632dsu.c((Object) c4003bSq2, "");
                    return Optional.ofNullable(c4003bSq2);
                }
            };
            return c.map(new Function() { // from class: o.bXe
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Optional a;
                    a = GraphQLLolomoRepositoryImpl$fetchContinueWatchingTitles$1.a(drM.this, obj);
                    return a;
                }
            });
        }
        return Single.just(Optional.ofNullable(c4003bSq));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Optional a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (Optional) drm.invoke(obj);
    }
}
