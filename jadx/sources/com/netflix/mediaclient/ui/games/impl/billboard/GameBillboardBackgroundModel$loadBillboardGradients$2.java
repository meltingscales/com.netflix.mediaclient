package com.netflix.mediaclient.ui.games.impl.billboard;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C6472cdu;
import o.C8556dpz;
import o.C8586drb;
import o.C8738dws;
import o.GF;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwQ;
import o.dwU;

/* loaded from: classes4.dex */
public final class GameBillboardBackgroundModel$loadBillboardGradients$2 extends SuspendLambda implements drM<InterfaceC8585dra<? super C6472cdu.b>, Object> {
    final /* synthetic */ Bitmap a;
    int b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameBillboardBackgroundModel$loadBillboardGradients$2(Bitmap bitmap, String str, boolean z, InterfaceC8585dra<? super GameBillboardBackgroundModel$loadBillboardGradients$2> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.a = bitmap;
        this.c = str;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new GameBillboardBackgroundModel$loadBillboardGradients$2(this.a, this.c, this.d, interfaceC8585dra);
    }

    @Override // o.drM
    /* renamed from: d */
    public final Object invoke(InterfaceC8585dra<? super C6472cdu.b> interfaceC8585dra) {
        return ((GameBillboardBackgroundModel$loadBillboardGradients$2) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.games.impl.billboard.GameBillboardBackgroundModel$loadBillboardGradients$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C6472cdu.b>, Object> {
        int a;
        final /* synthetic */ boolean b;
        final /* synthetic */ Bitmap c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Bitmap bitmap, String str, boolean z, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.c = bitmap;
            this.d = str;
            this.b = z;
        }

        @Override // o.drX
        /* renamed from: a */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super C6472cdu.b> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.c, this.d, this.b, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.a;
            if (i == 0) {
                C8556dpz.d(obj);
                C6472cdu c6472cdu = C6472cdu.b;
                Bitmap bitmap = this.c;
                String str = this.d;
                Rect a = c6472cdu.a(bitmap);
                boolean z = this.b;
                this.a = 1;
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
            dwQ c = GF.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, this.c, this.d, null);
            this.b = 1;
            obj = C8738dws.c(c, anonymousClass1, this);
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
