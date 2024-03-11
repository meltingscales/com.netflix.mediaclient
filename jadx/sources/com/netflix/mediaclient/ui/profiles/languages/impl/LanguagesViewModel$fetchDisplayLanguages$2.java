package com.netflix.mediaclient.ui.profiles.languages.impl;

import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C2545aiB;
import o.C4984bqG;
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
import o.XZ;
import o.aCE;
import o.aCG;
import o.cOK;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class LanguagesViewModel$fetchDisplayLanguages$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    private /* synthetic */ Object c;
    final /* synthetic */ boolean d;
    final /* synthetic */ cOK e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguagesViewModel$fetchDisplayLanguages$2(cOK cok, boolean z, InterfaceC8585dra<? super LanguagesViewModel$fetchDisplayLanguages$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = cok;
        this.d = z;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LanguagesViewModel$fetchDisplayLanguages$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        LanguagesViewModel$fetchDisplayLanguages$2 languagesViewModel$fetchDisplayLanguages$2 = new LanguagesViewModel$fetchDisplayLanguages$2(this.e, this.d, interfaceC8585dra);
        languagesViewModel$fetchDisplayLanguages$2.c = obj;
        return languagesViewModel$fetchDisplayLanguages$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        dpR dpr;
        e = C8586drb.e();
        int i = this.a;
        if (i == 0) {
            C8556dpz.d(obj);
            dwU dwu = (dwU) this.c;
            aCG i2 = this.e.i();
            XZ xz = new XZ();
            QueryMode queryMode = this.d ? QueryMode.d : QueryMode.b;
            this.c = dwu;
            this.a = 1;
            obj = aCE.d.d((aCE) i2, (InterfaceC8999hM) xz, queryMode, (RequestPriority) null, false, (InterfaceC8585dra) this, 12, (Object) null);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            dwU dwu2 = (dwU) this.c;
            C8556dpz.d(obj);
        }
        final C8954gU c8954gU = (C8954gU) obj;
        final List<C9035hw> list = c8954gU.e;
        if (list != null) {
            this.e.b(new drM<LanguagesState, LanguagesState>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$fetchDisplayLanguages$2$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
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
            final cOK cok = this.e;
            cok.b(new drM<LanguagesState, LanguagesState>() { // from class: com.netflix.mediaclient.ui.profiles.languages.impl.LanguagesViewModel$fetchDisplayLanguages$2$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final LanguagesState invoke(LanguagesState languagesState) {
                    Collection i3;
                    XZ.e c;
                    List<XZ.b> b;
                    int d;
                    C8313dhy d2;
                    XZ.c b2;
                    boolean b3;
                    XZ.c b4;
                    XZ.c b5;
                    C2545aiB e2;
                    C8632dsu.c((Object) languagesState, "");
                    XZ.a aVar = c8954gU.d;
                    if (aVar == null || (c = aVar.c()) == null || (b = c.b()) == null) {
                        i3 = C8569dql.i();
                    } else {
                        cOK cok2 = cok;
                        ArrayList<XZ.b> arrayList = new ArrayList();
                        Iterator<T> it = b.iterator();
                        while (true) {
                            C2545aiB c2545aiB = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            XZ.b bVar = (XZ.b) next;
                            String c2 = (bVar == null || (b5 = bVar.b()) == null || (e2 = b5.e()) == null) ? null : e2.c();
                            if (bVar != null && (b4 = bVar.b()) != null) {
                                c2545aiB = b4.e();
                            }
                            b3 = cok2.b(c2545aiB);
                            if (b3 && c2 != null && C4984bqG.b.b(c2)) {
                                arrayList.add(next);
                            }
                        }
                        cOK cok3 = cok;
                        d = C8572dqo.d(arrayList, 10);
                        i3 = new ArrayList(d);
                        for (XZ.b bVar2 : arrayList) {
                            d2 = cok3.d((bVar2 == null || (b2 = bVar2.b()) == null) ? null : b2.e());
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
