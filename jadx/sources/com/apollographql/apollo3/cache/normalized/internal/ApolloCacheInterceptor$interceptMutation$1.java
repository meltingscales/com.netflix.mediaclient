package com.apollographql.apollo3.cache.normalized.internal;

import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8951gR;
import o.C8954gU;
import o.C9028hp;
import o.C9061iV;
import o.InterfaceC8585dra;
import o.InterfaceC8990hD;
import o.InterfaceC9135jq;
import o.dpR;
import o.drX;
import o.dyQ;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class ApolloCacheInterceptor$interceptMutation$1<D> extends SuspendLambda implements drX<dyQ<? super C8954gU<D>>, InterfaceC8585dra<? super dpR>, Object> {
    Object a;
    final /* synthetic */ InterfaceC9135jq b;
    final /* synthetic */ C8951gR<D> c;
    final /* synthetic */ C9028hp d;
    Object e;
    final /* synthetic */ C9061iV g;
    int h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloCacheInterceptor$interceptMutation$1(C8951gR<D> c8951gR, C9061iV c9061iV, C9028hp c9028hp, InterfaceC9135jq interfaceC9135jq, InterfaceC8585dra<? super ApolloCacheInterceptor$interceptMutation$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c8951gR;
        this.g = c9061iV;
        this.d = c9028hp;
        this.b = interfaceC9135jq;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dyQ<? super C8954gU<D>> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ApolloCacheInterceptor$interceptMutation$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ApolloCacheInterceptor$interceptMutation$1 apolloCacheInterceptor$interceptMutation$1 = new ApolloCacheInterceptor$interceptMutation$1(this.c, this.g, this.d, this.b, interfaceC8585dra);
        apolloCacheInterceptor$interceptMutation$1.i = obj;
        return apolloCacheInterceptor$interceptMutation$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass5<T> implements dyQ {
        final /* synthetic */ Ref.ObjectRef<Set<String>> a;
        final /* synthetic */ dyQ<C8954gU<D>> b;
        final /* synthetic */ Ref.ObjectRef<C8954gU<D>> c;
        final /* synthetic */ C9028hp d;
        final /* synthetic */ InterfaceC8990hD.b e;
        final /* synthetic */ C8951gR<D> i;
        final /* synthetic */ C9061iV j;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(InterfaceC8990hD.b bVar, Ref.ObjectRef<C8954gU<D>> objectRef, Ref.ObjectRef<Set<String>> objectRef2, C9061iV c9061iV, C8951gR<D> c8951gR, C9028hp c9028hp, dyQ<? super C8954gU<D>> dyq) {
            this.e = bVar;
            this.c = objectRef;
            this.a = objectRef2;
            this.j = c9061iV;
            this.i = c8951gR;
            this.d = c9028hp;
            this.b = dyq;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d4 A[RETURN] */
        @Override // o.dyQ
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(o.C8954gU<D> r12, o.InterfaceC8585dra<? super o.dpR> r13) {
            /*
                Method dump skipped, instructions count: 216
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$interceptMutation$1.AnonymousClass5.emit(o.gU, o.dra):java.lang.Object");
        }
    }
}
