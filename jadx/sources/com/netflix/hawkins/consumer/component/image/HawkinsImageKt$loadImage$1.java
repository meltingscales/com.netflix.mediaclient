package com.netflix.hawkins.consumer.component.image;

import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC1571aGf;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes3.dex */
public final class HawkinsImageKt$loadImage$1 extends SuspendLambda implements drX<ProduceStateScope<Result<? extends ImageBitmap>>, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    int b;
    Object c;
    private /* synthetic */ Object d;
    final /* synthetic */ InterfaceC1571aGf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HawkinsImageKt$loadImage$1(InterfaceC1571aGf interfaceC1571aGf, String str, InterfaceC8585dra<? super HawkinsImageKt$loadImage$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = interfaceC1571aGf;
        this.a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        HawkinsImageKt$loadImage$1 hawkinsImageKt$loadImage$1 = new HawkinsImageKt$loadImage$1(this.e, this.a, interfaceC8585dra);
        hawkinsImageKt$loadImage$1.d = obj;
        return hawkinsImageKt$loadImage$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(ProduceStateScope<Result<ImageBitmap>> produceStateScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((HawkinsImageKt$loadImage$1) create(produceStateScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        ProduceStateScope produceStateScope;
        Throwable th;
        ProduceStateScope produceStateScope2;
        Result b;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            ProduceStateScope produceStateScope3 = (ProduceStateScope) this.d;
            produceStateScope3.setValue(null);
            try {
                InterfaceC1571aGf interfaceC1571aGf = this.e;
                String str = this.a;
                this.d = produceStateScope3;
                this.c = produceStateScope3;
                this.b = 1;
                Object c = interfaceC1571aGf.c(str, this);
                if (c == e) {
                    return e;
                }
                produceStateScope2 = produceStateScope3;
                obj = c;
                produceStateScope = produceStateScope2;
            } catch (Throwable th2) {
                produceStateScope = produceStateScope3;
                th = th2;
                Result.c cVar = Result.e;
                b = Result.b(Result.e(C8556dpz.a(th)));
                produceStateScope2 = produceStateScope;
                produceStateScope2.setValue(b);
                return dpR.c;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            produceStateScope2 = (ProduceStateScope) this.c;
            produceStateScope = (ProduceStateScope) this.d;
            try {
                C8556dpz.d(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.c cVar2 = Result.e;
                b = Result.b(Result.e(C8556dpz.a(th)));
                produceStateScope2 = produceStateScope;
                produceStateScope2.setValue(b);
                return dpR.c;
            }
        }
        Result.c cVar3 = Result.e;
        b = Result.b(Result.e((ImageBitmap) obj));
        produceStateScope2.setValue(b);
        return dpR.c;
    }
}
