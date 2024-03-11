package com.netflix.mediaclient.ui.usermarks.impl;

import com.netflix.mediaclient.ui.usermarks.api.UserMarksFlexEventType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5251bvI;
import o.C5341bwt;
import o.C7969dbY;
import o.C8002dcE;
import o.C8049dcz;
import o.C8556dpz;
import o.C8572dqo;
import o.C8576dqs;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class UserMarksViewModel$loadUserMarks$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C8002dcE b;
    final /* synthetic */ String c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMarksViewModel$loadUserMarks$1$1(C8002dcE c8002dcE, String str, InterfaceC8585dra<? super UserMarksViewModel$loadUserMarks$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = c8002dcE;
        this.c = str;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((UserMarksViewModel$loadUserMarks$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new UserMarksViewModel$loadUserMarks$1$1(this.b, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        C5251bvI c5251bvI;
        Object c;
        int d;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            c5251bvI = this.b.b;
            if (c5251bvI == null) {
                C8632dsu.d("");
                c5251bvI = null;
            }
            String str = this.c;
            this.d = 1;
            c = c5251bvI.c(str, this);
            if (c == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
            c = obj;
        }
        List<C5341bwt> list = (List) c;
        d = C8572dqo.d(list, 10);
        final ArrayList arrayList = new ArrayList(d);
        for (C5341bwt c5341bwt : list) {
            arrayList.add(new C7969dbY(c5341bwt.a(), c5341bwt.h(), c5341bwt.f(), c5341bwt.g(), c5341bwt.i(), c5341bwt.d(), c5341bwt.b(), c5341bwt.j()));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count", C8589dre.c(arrayList.size()));
        UserMarksFlexEventType.a.b(UserMarksFlexEventType.e, UserMarksFlexEventType.k, hashMap, null, 4, null);
        this.b.b(new drM<C8049dcz, C8049dcz>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$loadUserMarks$1$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C8049dcz invoke(C8049dcz c8049dcz) {
                List U;
                Object x;
                C8632dsu.c((Object) c8049dcz, "");
                U = C8576dqs.U(arrayList);
                x = C8576dqs.x(arrayList);
                return C8049dcz.copy$default(c8049dcz, U, (C7969dbY) x, false, null, 12, null);
            }
        });
        return dpR.c;
    }
}
