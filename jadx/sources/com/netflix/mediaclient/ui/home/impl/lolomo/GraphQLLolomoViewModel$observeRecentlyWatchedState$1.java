package com.netflix.mediaclient.ui.home.impl.lolomo;

import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C4049bUi;
import o.C8556dpz;
import o.C8576dqs;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.bTF;
import o.dpR;
import o.drM;
import o.drX;
import org.linphone.core.Privacy;

/* loaded from: classes6.dex */
public final class GraphQLLolomoViewModel$observeRecentlyWatchedState$1 extends SuspendLambda implements drX<String, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object a;
    final /* synthetic */ bTF c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoViewModel$observeRecentlyWatchedState$1(bTF btf, InterfaceC8585dra<? super GraphQLLolomoViewModel$observeRecentlyWatchedState$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = btf;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(String str, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLLolomoViewModel$observeRecentlyWatchedState$1) create(str, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLLolomoViewModel$observeRecentlyWatchedState$1 graphQLLolomoViewModel$observeRecentlyWatchedState$1 = new GraphQLLolomoViewModel$observeRecentlyWatchedState$1(this.c, interfaceC8585dra);
        graphQLLolomoViewModel$observeRecentlyWatchedState$1.a = obj;
        return graphQLLolomoViewModel$observeRecentlyWatchedState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            final String str = (String) this.a;
            this.c.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$observeRecentlyWatchedState$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final C4049bUi invoke(C4049bUi c4049bUi) {
                    Set V;
                    C4049bUi d;
                    C8632dsu.c((Object) c4049bUi, "");
                    V = C8576dqs.V(c4049bUi.y());
                    V.add(str);
                    dpR dpr = dpR.c;
                    d = c4049bUi.d((r43 & 1) != 0 ? c4049bUi.l : false, (r43 & 2) != 0 ? c4049bUi.a : null, (r43 & 4) != 0 ? c4049bUi.q : null, (r43 & 8) != 0 ? c4049bUi.w : null, (r43 & 16) != 0 ? c4049bUi.m : null, (r43 & 32) != 0 ? c4049bUi.u : null, (r43 & 64) != 0 ? c4049bUi.y : null, (r43 & 128) != 0 ? c4049bUi.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi.z : V, (r43 & 512) != 0 ? c4049bUi.i : null, (r43 & 1024) != 0 ? c4049bUi.d : null, (r43 & 2048) != 0 ? c4049bUi.b : false, (r43 & 4096) != 0 ? c4049bUi.r : null, (r43 & 8192) != 0 ? c4049bUi.t : null, (r43 & 16384) != 0 ? c4049bUi.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi.h : false, (r43 & 131072) != 0 ? c4049bUi.e : null, (r43 & 262144) != 0 ? c4049bUi.x : null, (r43 & 524288) != 0 ? c4049bUi.n : null, (r43 & 1048576) != 0 ? c4049bUi.p : null, (r43 & 2097152) != 0 ? c4049bUi.c : 0, (r43 & 4194304) != 0 ? c4049bUi.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi.j : 0, (r43 & 16777216) != 0 ? c4049bUi.s : null);
                    return d;
                }
            });
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
