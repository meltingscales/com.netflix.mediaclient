package com.netflix.mediaclient.ui.collecttaste.impl.rating;

import com.netflix.mediaclient.android.app.Status;
import io.reactivex.Observable;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1004Kx;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.aLP;
import o.dAU;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class CollectTasteViewModel$setRating$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drM<Throwable, dpR> a;
    final /* synthetic */ int b;
    final /* synthetic */ aLP c;
    final /* synthetic */ int d;
    final /* synthetic */ String e;
    int g;
    Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CollectTasteViewModel$setRating$1(drM<? super Throwable, dpR> drm, aLP alp, String str, int i, int i2, InterfaceC8585dra<? super CollectTasteViewModel$setRating$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = drm;
        this.c = alp;
        this.e = str;
        this.d = i;
        this.b = i2;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CollectTasteViewModel$setRating$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CollectTasteViewModel$setRating$1(this.a, this.c, this.e, this.d, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        drM<Throwable, dpR> drm;
        Status status;
        e = C8586drb.e();
        int i = this.g;
        if (i == 0) {
            C8556dpz.d(obj);
            drM<Throwable, dpR> drm2 = this.a;
            Observable e2 = this.c.e(new C1004Kx(this.e, this.d, this.b));
            this.j = drm2;
            this.g = 1;
            Object e3 = dAU.e(e2, this);
            if (e3 == e) {
                return e;
            }
            drm = drm2;
            obj = e3;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            drm = (drM) this.j;
            C8556dpz.d(obj);
        }
        Pair pair = (Pair) obj;
        drm.invoke((pair == null || (status = (Status) pair.a()) == null) ? null : status.e());
        return dpR.c;
    }
}
