package com.netflix.mediaclient.hendrixconfig.impl;

import android.content.Context;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1548aFj;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8691duz;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
final class CoreSingletonConfigModule$cleanupAccountDataCallback$1$onUserLogOut$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int c;
    final /* synthetic */ Context e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreSingletonConfigModule$cleanupAccountDataCallback$1$onUserLogOut$1(Context context, InterfaceC8585dra<? super CoreSingletonConfigModule$cleanupAccountDataCallback$1$onUserLogOut$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = context;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CoreSingletonConfigModule$cleanupAccountDataCallback$1$onUserLogOut$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CoreSingletonConfigModule$cleanupAccountDataCallback$1$onUserLogOut$1(this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean a;
        boolean i;
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            File[] listFiles = C1548aFj.e(this.e).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    String name = file.getName();
                    C8632dsu.a(name, "");
                    a = C8691duz.a(name, ".json", false, 2, null);
                    if (a) {
                        String name2 = file.getName();
                        C8632dsu.a(name2, "");
                        i = C8691duz.i(name2, "profile.", false, 2, null);
                        if (i) {
                            file.delete();
                        }
                    }
                }
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
