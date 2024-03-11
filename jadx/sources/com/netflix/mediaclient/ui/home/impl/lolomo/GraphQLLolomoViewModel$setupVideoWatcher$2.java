package com.netflix.mediaclient.ui.home.impl.lolomo;

import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC8918fl;
import o.C4049bUi;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC5218buc;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.InterfaceC6909cmG;
import o.InterfaceC8585dra;
import o.bTF;
import o.dpR;
import o.drX;
import o.dyR;
import o.dyS;

/* loaded from: classes4.dex */
public final class GraphQLLolomoViewModel$setupVideoWatcher$2 extends SuspendLambda implements drX<C4049bUi, InterfaceC8585dra<? super dyS<? extends InterfaceC5218buc>>, Object> {
    /* synthetic */ Object b;
    final /* synthetic */ bTF c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoViewModel$setupVideoWatcher$2(bTF btf, InterfaceC8585dra<? super GraphQLLolomoViewModel$setupVideoWatcher$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = btf;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(C4049bUi c4049bUi, InterfaceC8585dra<? super dyS<? extends InterfaceC5218buc>> interfaceC8585dra) {
        return ((GraphQLLolomoViewModel$setupVideoWatcher$2) create(c4049bUi, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        GraphQLLolomoViewModel$setupVideoWatcher$2 graphQLLolomoViewModel$setupVideoWatcher$2 = new GraphQLLolomoViewModel$setupVideoWatcher$2(this.c, interfaceC8585dra);
        graphQLLolomoViewModel$setupVideoWatcher$2.b = obj;
        return graphQLLolomoViewModel$setupVideoWatcher$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Lazy lazy;
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            C4049bUi c4049bUi = (C4049bUi) this.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<LoMo> c = c4049bUi.r().c();
            if (c != null) {
                for (LoMo loMo : c) {
                    if (C8632dsu.c((Object) loMo.getListContext(), (Object) LoMoType.COMING_SOON.a())) {
                        AbstractC8918fl<List<InterfaceC5222bug<? extends InterfaceC5223buh>>> abstractC8918fl = c4049bUi.u().get(loMo.getId());
                        List<InterfaceC5222bug<? extends InterfaceC5223buh>> c2 = abstractC8918fl != null ? abstractC8918fl.c() : null;
                        if (c2 != null && !c2.isEmpty()) {
                            ArrayList<InterfaceC5222bug> arrayList = new ArrayList();
                            for (Object obj2 : c2) {
                                if (((InterfaceC5222bug) obj2) instanceof InterfaceC5218buc) {
                                    arrayList.add(obj2);
                                }
                            }
                            for (InterfaceC5222bug interfaceC5222bug : arrayList) {
                                C8632dsu.d(interfaceC5222bug);
                                InterfaceC5218buc interfaceC5218buc = (InterfaceC5218buc) interfaceC5222bug;
                                linkedHashMap.put(interfaceC5218buc.i(), interfaceC5218buc);
                            }
                        }
                    }
                }
            }
            lazy = this.c.p;
            return dyR.a((dyS) ((InterfaceC6909cmG) lazy.get()).b(linkedHashMap), (drX) new AnonymousClass2(this.c, null));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$setupVideoWatcher$2$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements drX<InterfaceC5218buc, InterfaceC8585dra<? super dpR>, Object> {
        /* synthetic */ Object a;
        final /* synthetic */ bTF b;
        int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(bTF btf, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.b = btf;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, interfaceC8585dra);
            anonymousClass2.a = obj;
            return anonymousClass2;
        }

        @Override // o.drX
        /* renamed from: e */
        public final Object invoke(InterfaceC5218buc interfaceC5218buc, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass2) create(interfaceC5218buc, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.d == 0) {
                C8556dpz.d(obj);
                bTF.b(this.b, ((InterfaceC5218buc) this.a).i(), 0, 2, null);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
