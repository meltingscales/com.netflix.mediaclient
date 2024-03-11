package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.android.app.StatusException;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.browse.api.task.enums.CmpTaskMode;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawRepo$getDetailsFromFalcor$1;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawRepo$getDetailsFromGraphQL$1;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Map;
import javax.inject.Inject;
import o.C1596aHd;
import o.C6004cQk;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4004bSr;
import o.InterfaceC5241buz;
import o.InterfaceC8366diy;
import o.dqE;

/* renamed from: o.ceJ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6488ceJ {
    private final InterfaceC4004bSr.b b;

    @Inject
    public C6488ceJ(InterfaceC4004bSr.b bVar) {
        C8632dsu.c((Object) bVar, "");
        this.b = bVar;
    }

    public final Single<InterfaceC5241buz> a(boolean z, String str) {
        C8632dsu.c((Object) str, "");
        if (z) {
            return b(str);
        }
        return e(str);
    }

    private final Single<InterfaceC5241buz> e(String str) {
        Observable e;
        e = new C6004cQk().e(str, (r27 & 2) != 0, (r27 & 4) != 0 ? false : false, (r27 & 8) != 0 ? false : true, (r27 & 16) != 0 ? false : false, (r27 & 32) != 0 ? false : false, (r27 & 64) != 0 ? false : false, (r27 & 128) != 0 ? false : false, (r27 & JSONzip.end) != 0 ? false : false, (r27 & 512) != 0 ? false : false, (r27 & 1024) != 0 ? null : null, (r27 & 2048) == 0 ? false : false, (r27 & 4096) != 0 ? CmpTaskMode.FROM_CACHE_OR_NETWORK : CmpTaskMode.FROM_CACHE_ONLY);
        final QuickDrawRepo$getDetailsFromFalcor$1 quickDrawRepo$getDetailsFromFalcor$1 = new drM<C6004cQk.d<InterfaceC8366diy>, ObservableSource<? extends InterfaceC5241buz>>() { // from class: com.netflix.mediaclient.ui.lomo.qddp.QuickDrawRepo$getDetailsFromFalcor$1
            @Override // o.drM
            /* renamed from: e */
            public final ObservableSource<? extends InterfaceC5241buz> invoke(C6004cQk.d<InterfaceC8366diy> dVar) {
                Map d;
                Map k;
                Throwable th;
                C8632dsu.c((Object) dVar, "");
                if (dVar.d().i() || !(dVar.c() instanceof InterfaceC5241buz)) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    ErrorType errorType = ErrorType.m;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd("Error fetching QuickDrawDetails: response: " + dVar, null, errorType, true, k, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd.a;
                    if (errorType2 != null) {
                        c1596aHd.e.put("errorType", errorType2.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType2.c() + " " + b);
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
                    InterfaceC1598aHf a = dVar2.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar2.e().b(c1596aHd, th);
                    }
                    return Observable.error(new StatusException(dVar.d()));
                }
                InterfaceC8366diy c = dVar.c();
                C8632dsu.d(c);
                return Observable.just(c);
            }
        };
        Single<InterfaceC5241buz> singleOrError = e.flatMap(new Function() { // from class: o.ceK
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource e2;
                e2 = C6488ceJ.e(drM.this, obj);
                return e2;
            }
        }).singleOrError();
        C8632dsu.a(singleOrError, "");
        return singleOrError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (ObservableSource) drm.invoke(obj);
    }

    private final Single<InterfaceC5241buz> b(String str) {
        Single b = InterfaceC4004bSr.b.c.b(this.b, null, 1, null);
        final QuickDrawRepo$getDetailsFromGraphQL$1 quickDrawRepo$getDetailsFromGraphQL$1 = new QuickDrawRepo$getDetailsFromGraphQL$1(str);
        Single<InterfaceC5241buz> flatMap = b.flatMap(new Function() { // from class: o.ceG
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource d;
                d = C6488ceJ.d(drM.this, obj);
                return d;
            }
        });
        C8632dsu.a(flatMap, "");
        return flatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }
}
