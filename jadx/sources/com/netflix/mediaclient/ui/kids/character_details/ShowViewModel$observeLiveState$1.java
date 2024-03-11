package com.netflix.mediaclient.ui.kids.character_details;

import com.netflix.android.org.json.zip.JSONzip;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C4171bYw;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.bYA;
import o.bZK;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyS;

/* loaded from: classes6.dex */
public final class ShowViewModel$observeLiveState$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int c;
    final /* synthetic */ bYA e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowViewModel$observeLiveState$1(bYA bya, InterfaceC8585dra<? super ShowViewModel$observeLiveState$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = bya;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ShowViewModel$observeLiveState$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ShowViewModel$observeLiveState$1(this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dyS h;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            h = this.e.h();
            final bYA bya = this.e;
            dyQ dyq = new dyQ() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$observeLiveState$1.4
                @Override // o.dyQ
                /* renamed from: e */
                public final Object emit(final bZK bzk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    bYA.this.b(new drM<C4171bYw, C4171bYw>() { // from class: com.netflix.mediaclient.ui.kids.character_details.ShowViewModel$observeLiveState$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: c */
                        public final C4171bYw invoke(C4171bYw c4171bYw) {
                            C4171bYw c;
                            C8632dsu.c((Object) c4171bYw, "");
                            c = c4171bYw.c((r22 & 1) != 0 ? c4171bYw.g : null, (r22 & 2) != 0 ? c4171bYw.f : null, (r22 & 4) != 0 ? c4171bYw.h : false, (r22 & 8) != 0 ? c4171bYw.i : null, (r22 & 16) != 0 ? c4171bYw.d : null, (r22 & 32) != 0 ? c4171bYw.b : null, (r22 & 64) != 0 ? c4171bYw.c : null, (r22 & 128) != 0 ? c4171bYw.e : null, (r22 & JSONzip.end) != 0 ? c4171bYw.a : bZK.this, (r22 & 512) != 0 ? c4171bYw.j : null);
                            return c;
                        }
                    });
                    return dpR.c;
                }
            };
            this.c = 1;
            if (h.collect(dyq, this) == e) {
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
