package com.netflix.mediaclient.ui.profiles;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import dagger.hilt.EntryPoints;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1567aGb;
import o.C1596aHd;
import o.C8556dpz;
import o.C8586drb;
import o.C8691duz;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC8351dij;
import o.InterfaceC8585dra;
import o.aFY;
import o.dpR;
import o.dqE;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class ProfileSelectionActivityKt$fetchUxConfigId$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C1567aGb a;
    int c;
    final /* synthetic */ ProfileSelectionActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSelectionActivityKt$fetchUxConfigId$1(ProfileSelectionActivity profileSelectionActivity, C1567aGb c1567aGb, InterfaceC8585dra<? super ProfileSelectionActivityKt$fetchUxConfigId$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = profileSelectionActivity;
        this.a = c1567aGb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ProfileSelectionActivityKt$fetchUxConfigId$1(this.e, this.a, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ProfileSelectionActivityKt$fetchUxConfigId$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        boolean g;
        Map k;
        Throwable th;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            ProfileSelectionActivity profileSelectionActivity = this.e;
            C1567aGb c1567aGb = this.a;
            g = C8691duz.g(c1567aGb.a());
            if (g) {
                InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                k = dqE.k(new LinkedHashMap());
                C1596aHd c1596aHd = new C1596aHd("SPY-35060 - User profile has a null or blank profile GUID", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1597aHe c2 = dVar2.c();
                if (c2 != null) {
                    c2.d(c1596aHd, th);
                } else {
                    dVar2.e().b(c1596aHd, th);
                }
            }
            InterfaceC8351dij s = ((ProfileSelectionActivity.b) EntryPoints.get(aFY.b.e(profileSelectionActivity).e(c1567aGb), ProfileSelectionActivity.b.class)).s();
            this.c = 1;
            if (s.a(false, this) == e) {
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
