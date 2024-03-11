package com.netflix.mediaclient.ui.home.impl.lolomo;

import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import dagger.Lazy;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8918fl;
import o.C1567aGb;
import o.C4049bUi;
import o.C7461cwe;
import o.C8556dpz;
import o.C8576dqs;
import o.C8586drb;
import o.C8632dsu;
import o.C8971gl;
import o.InterfaceC7303ctf;
import o.InterfaceC8585dra;
import o.bTF;
import o.dpR;
import o.dqE;
import o.drM;
import o.drX;
import org.linphone.core.Privacy;

/* loaded from: classes6.dex */
public final class GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4 extends SuspendLambda implements drX<C4049bUi, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ bTF b;
    int c;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4(bTF btf, InterfaceC8585dra<? super GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = btf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4 graphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4 = new GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4(this.b, interfaceC8585dra);
        graphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4.e = obj;
        return graphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(C4049bUi c4049bUi, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4) create(c4049bUi, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final List n;
        Object obj2;
        Lazy lazy;
        C1567aGb c1567aGb;
        final Map k;
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            C4049bUi c4049bUi = (C4049bUi) this.e;
            AbstractC8918fl<List<LoMo>> r = c4049bUi.r();
            if (r instanceof C8971gl) {
                n = C8576dqs.n((Collection) ((C8971gl) r).c());
                Iterator it = n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((LoMo) obj2).getType() == LoMoType.MY_DOWNLOADS) {
                        break;
                    }
                }
                LoMo loMo = (LoMo) obj2;
                if (loMo != null) {
                    lazy = this.b.s;
                    c1567aGb = this.b.t;
                    List<C7461cwe> d = ((InterfaceC7303ctf) lazy.get()).d(c1567aGb.a());
                    k = dqE.k(c4049bUi.u());
                    k.put(loMo.getId(), new C8971gl(d));
                    loMo.setLengthOverride(d.size());
                    this.b.b(new drM<C4049bUi, C4049bUi>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$insertVideosIntoMyDownloadsRow$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        /* renamed from: b */
                        public final C4049bUi invoke(C4049bUi c4049bUi2) {
                            C4049bUi d2;
                            C8632dsu.c((Object) c4049bUi2, "");
                            d2 = c4049bUi2.d((r43 & 1) != 0 ? c4049bUi2.l : false, (r43 & 2) != 0 ? c4049bUi2.a : null, (r43 & 4) != 0 ? c4049bUi2.q : null, (r43 & 8) != 0 ? c4049bUi2.w : null, (r43 & 16) != 0 ? c4049bUi2.m : null, (r43 & 32) != 0 ? c4049bUi2.u : new C8971gl(n), (r43 & 64) != 0 ? c4049bUi2.y : k, (r43 & 128) != 0 ? c4049bUi2.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi2.z : null, (r43 & 512) != 0 ? c4049bUi2.i : null, (r43 & 1024) != 0 ? c4049bUi2.d : null, (r43 & 2048) != 0 ? c4049bUi2.b : false, (r43 & 4096) != 0 ? c4049bUi2.r : null, (r43 & 8192) != 0 ? c4049bUi2.t : null, (r43 & 16384) != 0 ? c4049bUi2.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi2.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi2.h : false, (r43 & 131072) != 0 ? c4049bUi2.e : null, (r43 & 262144) != 0 ? c4049bUi2.x : null, (r43 & 524288) != 0 ? c4049bUi2.n : null, (r43 & 1048576) != 0 ? c4049bUi2.p : null, (r43 & 2097152) != 0 ? c4049bUi2.c : 0, (r43 & 4194304) != 0 ? c4049bUi2.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi2.j : 0, (r43 & 16777216) != 0 ? c4049bUi2.s : null);
                            return d2;
                        }
                    });
                }
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
