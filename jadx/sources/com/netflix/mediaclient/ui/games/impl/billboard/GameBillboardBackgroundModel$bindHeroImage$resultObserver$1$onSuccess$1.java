package com.netflix.mediaclient.ui.games.impl.billboard;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC3893bOo;
import o.C3796bKz;
import o.C6472cdu;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8738dws;
import o.GF;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dxN;

/* loaded from: classes4.dex */
public final class GameBillboardBackgroundModel$bindHeroImage$resultObserver$1$onSuccess$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ AbstractC3893bOo.b b;
    final /* synthetic */ AbstractC3893bOo d;
    final /* synthetic */ BitmapDrawable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameBillboardBackgroundModel$bindHeroImage$resultObserver$1$onSuccess$1(AbstractC3893bOo abstractC3893bOo, BitmapDrawable bitmapDrawable, AbstractC3893bOo.b bVar, InterfaceC8585dra<? super GameBillboardBackgroundModel$bindHeroImage$resultObserver$1$onSuccess$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = abstractC3893bOo;
        this.e = bitmapDrawable;
        this.b = bVar;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GameBillboardBackgroundModel$bindHeroImage$resultObserver$1$onSuccess$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GameBillboardBackgroundModel$bindHeroImage$resultObserver$1$onSuccess$1(this.d, this.e, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            AbstractC3893bOo abstractC3893bOo = this.d;
            Bitmap bitmap = this.e.getBitmap();
            C8632dsu.a(bitmap, "");
            String o2 = this.d.o();
            C8632dsu.d((Object) o2);
            boolean z = this.b.r().getContext().getResources().getConfiguration().getLayoutDirection() == 1;
            this.a = 1;
            obj = abstractC3893bOo.a(bitmap, o2, z, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        dxN e2 = GF.e();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, (C6472cdu.b) obj, (int) this.b.r().getContext().getResources().getDimension(C3796bKz.d.a), null);
        this.a = 2;
        if (C8738dws.c(e2, anonymousClass1, this) == e) {
            return e;
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.games.impl.billboard.GameBillboardBackgroundModel$bindHeroImage$resultObserver$1$onSuccess$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
        int a;
        final /* synthetic */ AbstractC3893bOo.b b;
        final /* synthetic */ int c;
        final /* synthetic */ C6472cdu.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AbstractC3893bOo.b bVar, C6472cdu.b bVar2, int i, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.b = bVar;
            this.d = bVar2;
            this.c = i;
        }

        @Override // o.drX
        /* renamed from: b */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            return new AnonymousClass1(this.b, this.d, this.c, interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.a == 0) {
                C8556dpz.d(obj);
                View a = this.b.a();
                GradientDrawable b = this.d.b();
                AbstractC3893bOo.b bVar = this.b;
                b.setBounds(0, 0, bVar.d().getWidth(), this.c);
                a.setBackground(b);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
