package com.apollographql.apollo3.network.ws;

import com.apollographql.apollo3.exception.ApolloNetworkException;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C9104jL;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes2.dex */
public final class SubscriptionWsProtocol$connectionInit$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C9104jL a;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocol$connectionInit$2(C9104jL c9104jL, InterfaceC8585dra<? super SubscriptionWsProtocol$connectionInit$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c9104jL;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SubscriptionWsProtocol$connectionInit$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new SubscriptionWsProtocol$connectionInit$2(this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            C9104jL c9104jL = this.a;
            this.c = 1;
            obj = c9104jL.a(this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        Map map = (Map) obj;
        Object obj2 = map.get("type");
        if (C8632dsu.c(obj2, (Object) "connection_ack")) {
            return dpR.c;
        }
        if (C8632dsu.c(obj2, (Object) "connection_error")) {
            throw new ApolloNetworkException("Connection error:\n" + map, null, 2, null);
        }
        System.out.println((Object) ("unknown message while waiting for connection_ack: '" + obj2));
        return dpR.c;
    }
}
