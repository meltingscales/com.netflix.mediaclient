package com.netflix.mediaclient.ui.player.postplay;

import com.netflix.mediaclient.ui.player.postplay.ui.PostPlayPreviewsEpoxyController;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5512cAd;
import o.C5530cAv;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
public final class PostPlayPreviewThreeUpImpl$setPreviewVideos$1 extends SuspendLambda implements drX<C5530cAv, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C5512cAd c;
    /* synthetic */ Object d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPlayPreviewThreeUpImpl$setPreviewVideos$1(C5512cAd c5512cAd, InterfaceC8585dra<? super PostPlayPreviewThreeUpImpl$setPreviewVideos$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c5512cAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PostPlayPreviewThreeUpImpl$setPreviewVideos$1 postPlayPreviewThreeUpImpl$setPreviewVideos$1 = new PostPlayPreviewThreeUpImpl$setPreviewVideos$1(this.c, interfaceC8585dra);
        postPlayPreviewThreeUpImpl$setPreviewVideos$1.d = obj;
        return postPlayPreviewThreeUpImpl$setPreviewVideos$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(C5530cAv c5530cAv, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PostPlayPreviewThreeUpImpl$setPreviewVideos$1) create(c5530cAv, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PostPlayPreviewsEpoxyController postPlayPreviewsEpoxyController;
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            postPlayPreviewsEpoxyController = this.c.g;
            postPlayPreviewsEpoxyController.setData((C5530cAv) this.d);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
