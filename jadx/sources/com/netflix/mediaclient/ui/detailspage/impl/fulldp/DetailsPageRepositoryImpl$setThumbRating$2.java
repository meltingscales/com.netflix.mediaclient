package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3701bHl;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class DetailsPageRepositoryImpl$setThumbRating$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Result<? extends ThumbRating>>, Object> {
    final /* synthetic */ ThumbRating a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ C3701bHl d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageRepositoryImpl$setThumbRating$2(C3701bHl c3701bHl, String str, ThumbRating thumbRating, int i, InterfaceC8585dra<? super DetailsPageRepositoryImpl$setThumbRating$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c3701bHl;
        this.c = str;
        this.a = thumbRating;
        this.b = i;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super Result<? extends ThumbRating>> interfaceC8585dra) {
        return ((DetailsPageRepositoryImpl$setThumbRating$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DetailsPageRepositoryImpl$setThumbRating$2(this.d, this.c, this.a, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object e2;
        e = C8586drb.e();
        int i = this.e;
        try {
            if (i == 0) {
                C8556dpz.d(obj);
                C3701bHl c3701bHl = this.d;
                String str = this.c;
                ThumbRating thumbRating = this.a;
                int i2 = this.b;
                this.e = 1;
                e2 = c3701bHl.d(str, thumbRating, i2, this);
                if (e2 == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
                e2 = ((Result) obj).c();
            }
        } catch (Exception e3) {
            Result.c cVar = Result.e;
            e2 = Result.e(C8556dpz.a(e3));
        }
        return Result.b(e2);
    }
}
