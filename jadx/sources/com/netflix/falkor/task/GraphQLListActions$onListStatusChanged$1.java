package com.netflix.falkor.task;

import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C0987Kg;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.aCE;
import o.aCG;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class GraphQLListActions$onListStatusChanged$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C8954gU<? extends InterfaceC8999hM.c>>, Object> {
    final /* synthetic */ C0987Kg a;
    int b;
    final /* synthetic */ InterfaceC8999hM<? extends InterfaceC8999hM.c> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLListActions$onListStatusChanged$1(C0987Kg c0987Kg, InterfaceC8999hM<? extends InterfaceC8999hM.c> interfaceC8999hM, InterfaceC8585dra<? super GraphQLListActions$onListStatusChanged$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c0987Kg;
        this.e = interfaceC8999hM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GraphQLListActions$onListStatusChanged$1(this.a, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C8954gU<? extends InterfaceC8999hM.c>> interfaceC8585dra) {
        return ((GraphQLListActions$onListStatusChanged$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        aCG acg;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            acg = this.a.c;
            InterfaceC8999hM<? extends InterfaceC8999hM.c> interfaceC8999hM = this.e;
            QueryMode queryMode = QueryMode.d;
            this.b = 1;
            obj = aCE.d.a(acg, interfaceC8999hM, queryMode, null, false, this, 12, null);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
