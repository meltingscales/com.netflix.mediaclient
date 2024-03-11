package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C3701bHl;
import o.C3705bHp;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$setInMyListQueue$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ TrackingInfoHolder b;
    Object c;
    int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ C3701bHl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$setInMyListQueue$2(boolean z, C3701bHl c3701bHl, TrackingInfoHolder trackingInfoHolder, String str, InterfaceC8585dra<? super DetailsPageRepositoryImpl$setInMyListQueue$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = z;
        this.g = c3701bHl;
        this.b = trackingInfoHolder;
        this.a = str;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super Result<Boolean>> interfaceC8585dra) {
        return ((DetailsPageRepositoryImpl$setInMyListQueue$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DetailsPageRepositoryImpl$setInMyListQueue$2(this.e, this.g, this.b, this.a, interfaceC8585dra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Long] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef e;
        Object c;
        Ref.ObjectRef objectRef;
        C3705bHp c3705bHp;
        Object d;
        C3705bHp c3705bHp2;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                if (this.e) {
                    c3705bHp2 = this.g.a;
                    objectRef2.d = c3705bHp2.c(this.b);
                    C3701bHl c3701bHl = this.g;
                    String str = this.a;
                    this.c = objectRef2;
                    this.d = 1;
                    d = c3701bHl.c(str, this);
                    if (d == e) {
                        return e;
                    }
                } else {
                    c3705bHp = this.g.a;
                    objectRef2.d = c3705bHp.d(this.b);
                    C3701bHl c3701bHl2 = this.g;
                    String str2 = this.a;
                    this.c = objectRef2;
                    this.d = 2;
                    d = c3701bHl2.d(str2, this);
                    if (d == e) {
                        return e;
                    }
                }
                objectRef = objectRef2;
                c = d;
            } catch (Exception e2) {
                e = objectRef2;
                e = e2;
                Result.c cVar = Result.e;
                c = Result.e(C8556dpz.a(e));
                objectRef = e;
                Result b = Result.b(c);
                this.g.c(b.c(), this.e, (Long) objectRef.d);
                return b;
            }
        } else {
            try {
                if (i == 1) {
                    Ref.ObjectRef objectRef3 = (Ref.ObjectRef) this.c;
                    C8556dpz.d(obj);
                    e = objectRef3;
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) this.c;
                    C8556dpz.d(obj);
                    e = objectRef4;
                }
                c = ((Result) obj).c();
                objectRef = e;
            } catch (Exception e3) {
                e = e3;
                Result.c cVar2 = Result.e;
                c = Result.e(C8556dpz.a(e));
                objectRef = e;
                Result b2 = Result.b(c);
                this.g.c(b2.c(), this.e, (Long) objectRef.d);
                return b2;
            }
        }
        Result b22 = Result.b(c);
        this.g.c(b22.c(), this.e, (Long) objectRef.d);
        return b22;
    }
}
