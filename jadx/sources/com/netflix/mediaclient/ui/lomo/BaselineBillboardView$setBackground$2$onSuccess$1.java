package com.netflix.mediaclient.ui.lomo;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6462cdk;
import o.C6472cdu;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class BaselineBillboardView$setBackground$2$onSuccess$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ BitmapDrawable a;
    final /* synthetic */ AbstractC6462cdk b;
    int c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaselineBillboardView$setBackground$2$onSuccess$1(AbstractC6462cdk abstractC6462cdk, BitmapDrawable bitmapDrawable, String str, InterfaceC8585dra<? super BaselineBillboardView$setBackground$2$onSuccess$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = abstractC6462cdk;
        this.a = bitmapDrawable;
        this.d = str;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((BaselineBillboardView$setBackground$2$onSuccess$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new BaselineBillboardView$setBackground$2$onSuccess$1(this.b, this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            AbstractC6462cdk abstractC6462cdk = this.b;
            Bitmap bitmap = this.a.getBitmap();
            C8632dsu.a(bitmap, "");
            String str = this.d;
            this.c = 1;
            obj = abstractC6462cdk.a(bitmap, str, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.b.d(((C6472cdu.b) obj).b());
        return dpR.c;
    }
}
