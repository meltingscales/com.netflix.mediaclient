package com.apollographql.apollo3.internal;

import com.apollographql.apollo3.exception.DefaultApolloException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C9005hS;
import o.C9009hW;
import o.C9096jD;
import o.C9144jz;
import o.InterfaceC7871dIn;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dyQ;

/* loaded from: classes2.dex */
public final class MultipartKt$multipartBodyFlow$1 extends SuspendLambda implements drX<dyQ<? super InterfaceC7871dIn>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C9009hW a;
    int b;
    final /* synthetic */ Ref.ObjectRef<C9096jD> c;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$multipartBodyFlow$1(Ref.ObjectRef<C9096jD> objectRef, C9009hW c9009hW, InterfaceC8585dra<? super MultipartKt$multipartBodyFlow$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = objectRef;
        this.a = c9009hW;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        MultipartKt$multipartBodyFlow$1 multipartKt$multipartBodyFlow$1 = new MultipartKt$multipartBodyFlow$1(this.c, this.a, interfaceC8585dra);
        multipartKt$multipartBodyFlow$1.e = obj;
        return multipartKt$multipartBodyFlow$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dyQ<? super InterfaceC7871dIn> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MultipartKt$multipartBodyFlow$1) create(dyq, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, o.jD] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dyQ dyq;
        String c;
        InterfaceC7871dIn c2;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            dyq = (dyQ) this.e;
            Ref.ObjectRef<C9096jD> objectRef = this.c;
            InterfaceC7871dIn a = this.a.a();
            C8632dsu.d(a);
            c = C9144jz.c(C9005hS.c(this.a.c(), "Content-Type"));
            if (c != null) {
                objectRef.d = new C9096jD(a, c);
            } else {
                throw new DefaultApolloException("Expected the Content-Type to have a boundary parameter", null, 2, null);
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dyq = (dyQ) this.e;
            C8556dpz.d(obj);
        }
        do {
            C9096jD c9096jD = this.c.d;
            C8632dsu.d(c9096jD);
            C9096jD.d b = c9096jD.b();
            if (b != null) {
                c2 = b.c();
                this.e = dyq;
                this.b = 1;
            } else {
                return dpR.c;
            }
        } while (dyq.emit(c2, this) != e);
        return e;
    }
}
