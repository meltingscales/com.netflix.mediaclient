package com.netflix.mediaclient.ui.profiles.languages.impl;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1345Yc;
import o.C2545aiB;
import o.C8313dhy;
import o.C8556dpz;
import o.C8569dql;
import o.C8572dqo;
import o.C8586drb;
import o.C8632dsu;
import o.C8927fu;
import o.C8954gU;
import o.C8971gl;
import o.C9035hw;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.aCE;
import o.aCG;
import o.cOK;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class LanguagesViewModel$fetchContentLanguages$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ cOK a;
    private /* synthetic */ Object b;
    final /* synthetic */ boolean d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagesViewModel$fetchContentLanguages$2(cOK cok, boolean z, InterfaceC8585dra<? super LanguagesViewModel$fetchContentLanguages$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = cok;
        this.d = z;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LanguagesViewModel$fetchContentLanguages$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        LanguagesViewModel$fetchContentLanguages$2 languagesViewModel$fetchContentLanguages$2 = new LanguagesViewModel$fetchContentLanguages$2(this.a, this.d, interfaceC8585dra);
        languagesViewModel$fetchContentLanguages$2.b = obj;
        return languagesViewModel$fetchContentLanguages$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dpR dpr;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.b;
            aCG i2 = this.a.i();
            C1345Yc c1345Yc = new C1345Yc();
            QueryMode queryMode = this.d ? QueryMode.d : QueryMode.b;
            this.b = dwu;
            this.e = 1;
            obj = aCE.d.d((aCE) i2, (InterfaceC8999hM) c1345Yc, queryMode, (RequestPriority) null, false, (InterfaceC8585dra) this, 12, (Object) null);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dwU dwu2 = (dwU) this.b;
            C8556dpz.d(obj);
        }
        final C8954gU c8954gU = (C8954gU) obj;
        final List<C9035hw> list = c8954gU.e;
        if (list != null) {
            this.a.b(new drM<LanguagesState, LanguagesState>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$fetchContentLanguages$2$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: e */
                public final LanguagesState invoke(LanguagesState languagesState) {
                    C8632dsu.c((Object) languagesState, "");
                    return LanguagesState.copy$default(languagesState, null, null, null, null, new C8927fu(new Throwable(list.get(0).toString()), null, 2, null), 15, null);
                }
            });
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            final cOK cok = this.a;
            cok.b(new drM<LanguagesState, LanguagesState>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$fetchContentLanguages$2$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final LanguagesState invoke(LanguagesState languagesState) {
                    Collection i3;
                    C1345Yc.a c;
                    List<C1345Yc.c> c2;
                    int d;
                    C8313dhy d2;
                    C1345Yc.e e2;
                    boolean b;
                    C1345Yc.e e3;
                    C8632dsu.c((Object) languagesState, "");
                    C1345Yc.d dVar = c8954gU.d;
                    if (dVar == null || (c = dVar.c()) == null || (c2 = c.c()) == null) {
                        i3 = C8569dql.i();
                    } else {
                        cOK cok2 = cok;
                        ArrayList<C1345Yc.c> arrayList = new ArrayList();
                        Iterator<T> it = c2.iterator();
                        while (true) {
                            C2545aiB c2545aiB = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            C1345Yc.c cVar = (C1345Yc.c) next;
                            if (cVar != null && (e3 = cVar.e()) != null) {
                                c2545aiB = e3.d();
                            }
                            b = cok2.b(c2545aiB);
                            if (b) {
                                arrayList.add(next);
                            }
                        }
                        cOK cok3 = cok;
                        d = C8572dqo.d(arrayList, 10);
                        i3 = new ArrayList(d);
                        for (C1345Yc.c cVar2 : arrayList) {
                            d2 = cok3.d((cVar2 == null || (e2 = cVar2.e()) == null) ? null : e2.d());
                            i3.add(d2);
                        }
                    }
                    return LanguagesState.copy$default(languagesState, null, null, null, null, new C8971gl(i3), 15, null);
                }
            });
        }
        return dpR.c;
    }
}
