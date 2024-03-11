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
public final class DetailsPageRepositoryImpl$setInRemindMeQueue$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ TrackingInfoHolder a;
    final /* synthetic */ String b;
    int c;
    final /* synthetic */ boolean d;
    Object e;
    final /* synthetic */ C3701bHl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$setInRemindMeQueue$2(boolean z, C3701bHl c3701bHl, TrackingInfoHolder trackingInfoHolder, String str, InterfaceC8585dra<? super DetailsPageRepositoryImpl$setInRemindMeQueue$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = z;
        this.f = c3701bHl;
        this.a = trackingInfoHolder;
        this.b = str;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super Result<Boolean>> interfaceC8585dra) {
        return ((DetailsPageRepositoryImpl$setInRemindMeQueue$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DetailsPageRepositoryImpl$setInRemindMeQueue$2(this.d, this.f, this.a, this.b, interfaceC8585dra);
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
        Object e2;
        C3705bHp c3705bHp2;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                if (this.d) {
                    c3705bHp2 = this.f.a;
                    objectRef2.d = c3705bHp2.e(this.a);
                    C3701bHl c3701bHl = this.f;
                    String str = this.b;
                    TrackingInfoHolder trackingInfoHolder = this.a;
                    this.e = objectRef2;
                    this.c = 1;
                    e2 = c3701bHl.a(str, trackingInfoHolder, this);
                    if (e2 == e) {
                        return e;
                    }
                } else {
                    c3705bHp = this.f.a;
                    objectRef2.d = c3705bHp.g(this.a);
                    C3701bHl c3701bHl2 = this.f;
                    String str2 = this.b;
                    TrackingInfoHolder trackingInfoHolder2 = this.a;
                    this.e = objectRef2;
                    this.c = 2;
                    e2 = c3701bHl2.e(str2, trackingInfoHolder2, this);
                    if (e2 == e) {
                        return e;
                    }
                }
                objectRef = objectRef2;
                c = e2;
            } catch (Exception e3) {
                e = objectRef2;
                e = e3;
                Result.c cVar = Result.e;
                c = Result.e(C8556dpz.a(e));
                objectRef = e;
                Result b = Result.b(c);
                this.f.c(b.c(), this.d, (Long) objectRef.d);
                return b;
            }
        } else {
            try {
                if (i == 1) {
                    Ref.ObjectRef objectRef3 = (Ref.ObjectRef) this.e;
                    C8556dpz.d(obj);
                    e = objectRef3;
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) this.e;
                    C8556dpz.d(obj);
                    e = objectRef4;
                }
                c = ((Result) obj).c();
                objectRef = e;
            } catch (Exception e4) {
                e = e4;
                Result.c cVar2 = Result.e;
                c = Result.e(C8556dpz.a(e));
                objectRef = e;
                Result b2 = Result.b(c);
                this.f.c(b2.c(), this.d, (Long) objectRef.d);
                return b2;
            }
        }
        Result b22 = Result.b(c);
        this.f.c(b22.c(), this.d, (Long) objectRef.d);
        return b22;
    }
}
