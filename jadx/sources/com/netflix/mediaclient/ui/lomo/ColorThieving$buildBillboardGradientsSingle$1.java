package com.netflix.mediaclient.ui.lomo;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6472cdu;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class ColorThieving$buildBillboardGradientsSingle$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C6472cdu.b>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    int c;
    final /* synthetic */ Rect d;
    final /* synthetic */ Bitmap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorThieving$buildBillboardGradientsSingle$1(Bitmap bitmap, String str, Rect rect, boolean z, InterfaceC8585dra<? super ColorThieving$buildBillboardGradientsSingle$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = bitmap;
        this.a = str;
        this.d = rect;
        this.b = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ColorThieving$buildBillboardGradientsSingle$1(this.e, this.a, this.d, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C6472cdu.b> interfaceC8585dra) {
        return ((ColorThieving$buildBillboardGradientsSingle$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            C6472cdu c6472cdu = C6472cdu.b;
            Bitmap bitmap = this.e;
            String str = this.a;
            Rect rect = this.d;
            boolean z = this.b;
            this.c = 1;
            obj = c6472cdu.c(bitmap, str, rect, z, this);
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
