package com.netflix.mediaclient.hendrixconfig.impl;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8613dsb;
import o.InterfaceC8810dzj;
import o.aFT;
import o.aFV;
import o.dEI;
import o.dpR;

/* loaded from: classes3.dex */
public final class VolatileConfigManager$diffFieldJson$2 extends SuspendLambda implements InterfaceC8613dsb<String, dEI, dEI, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object a;
    final /* synthetic */ aFT b;
    final /* synthetic */ Set<String> c;
    int d;
    /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolatileConfigManager$diffFieldJson$2(Set<String> set, aFT aft, InterfaceC8585dra<? super VolatileConfigManager$diffFieldJson$2> interfaceC8585dra) {
        super(4, interfaceC8585dra);
        this.c = set;
        this.b = aft;
    }

    @Override // o.InterfaceC8613dsb
    /* renamed from: a */
    public final Object invoke(String str, dEI dei, dEI dei2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        VolatileConfigManager$diffFieldJson$2 volatileConfigManager$diffFieldJson$2 = new VolatileConfigManager$diffFieldJson$2(this.c, this.b, interfaceC8585dra);
        volatileConfigManager$diffFieldJson$2.e = str;
        volatileConfigManager$diffFieldJson$2.a = dei2;
        return volatileConfigManager$diffFieldJson$2.invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        ConcurrentHashMap concurrentHashMap;
        InterfaceC8810dzj a;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            String str = (String) this.e;
            dEI dei = (dEI) this.a;
            this.c.add(str);
            concurrentHashMap = this.b.d;
            aFV afv = (aFV) concurrentHashMap.get(str);
            if (afv != null && (a = afv.a()) != null) {
                this.e = null;
                this.d = 1;
                if (a.emit(dei, this) == e) {
                    return e;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
