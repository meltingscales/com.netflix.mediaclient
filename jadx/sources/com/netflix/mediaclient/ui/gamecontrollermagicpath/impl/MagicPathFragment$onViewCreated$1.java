package com.netflix.mediaclient.ui.gamecontrollermagicpath.impl;

import androidx.fragment.app.FragmentActivity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC3870bNs;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC3861bNj;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* loaded from: classes4.dex */
final class MagicPathFragment$onViewCreated$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MagicPathFragment b;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicPathFragment$onViewCreated$1(MagicPathFragment magicPathFragment, InterfaceC8585dra<? super MagicPathFragment$onViewCreated$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = magicPathFragment;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MagicPathFragment$onViewCreated$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new MagicPathFragment$onViewCreated$1(this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            dyS<AbstractC3870bNs> g = this.b.f().g();
            final MagicPathFragment magicPathFragment = this.b;
            dyQ<? super AbstractC3870bNs> dyq = new dyQ() { // from class: com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathFragment$onViewCreated$1.5
                @Override // o.dyQ
                /* renamed from: d */
                public final Object emit(AbstractC3870bNs abstractC3870bNs, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    if (!C8632dsu.c(abstractC3870bNs, AbstractC3870bNs.a.c)) {
                        if (C8632dsu.c(abstractC3870bNs, AbstractC3870bNs.c.a)) {
                            InterfaceC3861bNj j = MagicPathFragment.this.j();
                            FragmentActivity requireActivity = MagicPathFragment.this.requireActivity();
                            C8632dsu.a(requireActivity, "");
                            j.b(requireActivity);
                        } else if (abstractC3870bNs instanceof AbstractC3870bNs.b) {
                            InterfaceC3861bNj j2 = MagicPathFragment.this.j();
                            FragmentActivity requireActivity2 = MagicPathFragment.this.requireActivity();
                            C8632dsu.a(requireActivity2, "");
                            j2.e(requireActivity2, ((AbstractC3870bNs.b) abstractC3870bNs).c());
                        }
                    }
                    return dpR.c;
                }
            };
            this.e = 1;
            if (g.collect(dyq, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
