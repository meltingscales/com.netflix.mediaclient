package com.netflix.mediaclient.ui.player.v2.uiView.interactive;

import androidx.recyclerview.widget.RecyclerView;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5781cIc;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.cHZ;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlayerInteractiveNavigationUIView$setAdapterMoments$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C5781cIc a;
    final /* synthetic */ InteractiveMoments b;
    int d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerInteractiveNavigationUIView$setAdapterMoments$2(C5781cIc c5781cIc, InteractiveMoments interactiveMoments, boolean z, InterfaceC8585dra<? super PlayerInteractiveNavigationUIView$setAdapterMoments$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c5781cIc;
        this.b = interactiveMoments;
        this.e = z;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayerInteractiveNavigationUIView$setAdapterMoments$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerInteractiveNavigationUIView$setAdapterMoments$2(this.a, this.b, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        RecyclerView recyclerView;
        cHZ chz;
        cHZ chz2;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            recyclerView = this.a.j;
            recyclerView.stopScroll();
            chz = this.a.d;
            InteractiveMoments interactiveMoments = this.b;
            boolean z = this.e;
            this.d = 1;
            if (chz.a(interactiveMoments, z, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        chz2 = this.a.d;
        if (!chz2.e()) {
            this.a.g();
        } else if (this.a.w()) {
            this.a.i();
        }
        return dpR.c;
    }
}
