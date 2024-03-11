package com.netflix.mediaclient.ui.home.impl.lolomo;

import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C4049bUi;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.bTF;
import o.bZK;
import o.dpR;
import o.drM;
import o.drX;
import org.linphone.core.Privacy;

/* loaded from: classes6.dex */
public final class GraphQLLolomoViewModel$observeLiveState$2$2 extends SuspendLambda implements drX<bZK, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ bTF a;
    int d;
    /* synthetic */ Object e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoViewModel$observeLiveState$2$2(bTF btf, InterfaceC8585dra<? super GraphQLLolomoViewModel$observeLiveState$2$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = btf;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(bZK bzk, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLLolomoViewModel$observeLiveState$2$2) create(bzk, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLLolomoViewModel$observeLiveState$2$2 graphQLLolomoViewModel$observeLiveState$2$2 = new GraphQLLolomoViewModel$observeLiveState$2$2(this.a, interfaceC8585dra);
        graphQLLolomoViewModel$observeLiveState$2$2.e = obj;
        return graphQLLolomoViewModel$observeLiveState$2$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            final bZK bzk = (bZK) this.e;
            this.a.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$observeLiveState$2$2.1
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final C4049bUi invoke(C4049bUi c4049bUi) {
                    C4049bUi d;
                    C8632dsu.c((Object) c4049bUi, "");
                    d = c4049bUi.d((r43 & 1) != 0 ? c4049bUi.l : false, (r43 & 2) != 0 ? c4049bUi.a : null, (r43 & 4) != 0 ? c4049bUi.q : null, (r43 & 8) != 0 ? c4049bUi.w : null, (r43 & 16) != 0 ? c4049bUi.m : null, (r43 & 32) != 0 ? c4049bUi.u : null, (r43 & 64) != 0 ? c4049bUi.y : null, (r43 & 128) != 0 ? c4049bUi.k : bZK.this, (r43 & JSONzip.end) != 0 ? c4049bUi.z : null, (r43 & 512) != 0 ? c4049bUi.i : null, (r43 & 1024) != 0 ? c4049bUi.d : null, (r43 & 2048) != 0 ? c4049bUi.b : false, (r43 & 4096) != 0 ? c4049bUi.r : null, (r43 & 8192) != 0 ? c4049bUi.t : null, (r43 & 16384) != 0 ? c4049bUi.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi.h : false, (r43 & 131072) != 0 ? c4049bUi.e : null, (r43 & 262144) != 0 ? c4049bUi.x : null, (r43 & 524288) != 0 ? c4049bUi.n : null, (r43 & 1048576) != 0 ? c4049bUi.p : null, (r43 & 2097152) != 0 ? c4049bUi.c : 0, (r43 & 4194304) != 0 ? c4049bUi.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi.j : 0, (r43 & 16777216) != 0 ? c4049bUi.s : null);
                    return d;
                }
            });
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
