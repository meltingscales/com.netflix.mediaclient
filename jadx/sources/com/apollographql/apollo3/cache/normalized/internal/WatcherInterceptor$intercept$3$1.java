package com.apollographql.apollo3.cache.normalized.internal;

import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8951gR;
import o.C8954gU;
import o.C9028hp;
import o.C9051iL;
import o.C9123je;
import o.InterfaceC8585dra;
import o.InterfaceC8991hE;
import o.InterfaceC9080io;
import o.dpR;
import o.drX;

/* JADX INFO: Add missing generic type declarations: [D] */
/* loaded from: classes2.dex */
public final class WatcherInterceptor$intercept$3$1<D> extends SuspendLambda implements drX<C8954gU<D>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C9028hp a;
    /* synthetic */ Object b;
    final /* synthetic */ Ref.ObjectRef<Set<String>> c;
    int d;
    final /* synthetic */ C8951gR<D> e;
    final /* synthetic */ C9123je j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatcherInterceptor$intercept$3$1(Ref.ObjectRef<Set<String>> objectRef, C9123je c9123je, C8951gR<D> c8951gR, C9028hp c9028hp, InterfaceC8585dra<? super WatcherInterceptor$intercept$3$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = objectRef;
        this.j = c9123je;
        this.e = c8951gR;
        this.a = c9028hp;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(C8954gU<D> c8954gU, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((WatcherInterceptor$intercept$3$1) create(c8954gU, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        WatcherInterceptor$intercept$3$1 watcherInterceptor$intercept$3$1 = new WatcherInterceptor$intercept$3$1(this.c, this.j, this.e, this.a, interfaceC8585dra);
        watcherInterceptor$intercept$3$1.b = obj;
        return watcherInterceptor$intercept$3$1;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [T, java.util.Set] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            C8954gU c8954gU = (C8954gU) this.b;
            if (c8954gU.d != 0) {
                Ref.ObjectRef<Set<String>> objectRef = this.c;
                InterfaceC9080io b = this.j.b();
                InterfaceC8991hE<D> h = this.e.h();
                D d = c8954gU.d;
                C8632dsu.d(d);
                objectRef.d = C9051iL.c(b.a(h, d, this.a).values());
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
