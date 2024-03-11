package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC6462cdk;
import o.C6472cdu;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8738dws;
import o.GF;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwQ;
import o.dwU;

/* loaded from: classes4.dex */
public final class BaselineBillboardView$loadBillboardGradients$2 extends SuspendLambda implements drM<InterfaceC8585dra<? super C6472cdu.b>, Object> {
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ AbstractC6462cdk d;
    final /* synthetic */ Bitmap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaselineBillboardView$loadBillboardGradients$2(AbstractC6462cdk abstractC6462cdk, Bitmap bitmap, String str, InterfaceC8585dra<? super BaselineBillboardView$loadBillboardGradients$2> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.d = abstractC6462cdk;
        this.e = bitmap;
        this.c = str;
    }

    @Override // o.drM
    /* renamed from: a */
    public final Object invoke(InterfaceC8585dra<? super C6472cdu.b> interfaceC8585dra) {
        return ((BaselineBillboardView$loadBillboardGradients$2) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new BaselineBillboardView$loadBillboardGradients$2(this.d, this.e, this.c, interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.lomo.BaselineBillboardView$loadBillboardGradients$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C6472cdu.b>, Object> {
        final /* synthetic */ String a;
        int b;
        final /* synthetic */ AbstractC6462cdk c;
        final /* synthetic */ Bitmap d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Bitmap bitmap, String str, AbstractC6462cdk abstractC6462cdk, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.d = bitmap;
            this.a = str;
            this.c = abstractC6462cdk;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.d, this.a, this.c, interfaceC8585dra);
        }

        @Override // o.drX
        /* renamed from: e */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super C6472cdu.b> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.b;
            if (i == 0) {
                C8556dpz.d(obj);
                C6472cdu c6472cdu = C6472cdu.b;
                Bitmap bitmap = this.d;
                String str = this.a;
                Rect a = c6472cdu.a(bitmap);
                boolean z = this.c.getLayoutDirection() == 1;
                this.b = 1;
                obj = c6472cdu.c(bitmap, str, a, z, this);
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            GF gf = GF.e;
            Context context = this.d.getContext();
            C8632dsu.a(context, "");
            dwQ e2 = gf.e(context);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e, this.c, this.d, null);
            this.b = 1;
            obj = C8738dws.c(e2, anonymousClass1, this);
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
