package o;

import android.content.Context;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.ui.upnextfeed.impl.data.FalcorUpNextFeedRepository$reFetchInitialIfExpired$1$apply$1$1;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Ref;
import o.C5220bue;
import o.C7911daT;
import o.C7972dbb;
import o.C8632dsu;

/* renamed from: o.daT  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7911daT implements InterfaceC7974dbd {
    private final aLP a;
    private final Context b;
    private final C7977dbg c;
    private final C7971dba d;
    private final InterfaceC1270Vf e;
    private final C7972dbb i;

    public C7911daT(aLP alp, InterfaceC1270Vf interfaceC1270Vf, C7972dbb c7972dbb, C7977dbg c7977dbg, C7971dba c7971dba, @ApplicationContext Context context) {
        C8632dsu.c((Object) alp, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        C8632dsu.c((Object) c7972dbb, "");
        C8632dsu.c((Object) c7977dbg, "");
        C8632dsu.c((Object) c7971dba, "");
        C8632dsu.c((Object) context, "");
        this.a = alp;
        this.e = interfaceC1270Vf;
        this.i = c7972dbb;
        this.c = c7977dbg;
        this.d = c7971dba;
        this.b = context;
    }

    @Override // o.InterfaceC7974dbd
    public Single<C5220bue> b(final C7971dba c7971dba) {
        C8632dsu.c((Object) c7971dba, "");
        Single<C5220bue> defer = Single.defer(new Callable() { // from class: o.daV
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SingleSource c;
                c = C7911daT.c(C7911daT.this, c7971dba);
                return c;
            }
        });
        C8632dsu.a(defer, "");
        return defer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource c(C7911daT c7911daT, C7971dba c7971dba) {
        Map<Integer, C8654dtp> c;
        TaskMode d;
        C8632dsu.c((Object) c7911daT, "");
        C8632dsu.c((Object) c7971dba, "");
        C7972dbb.d d2 = c7911daT.i.d(c7911daT.b);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (d2 == null || C7976dbf.c(d2, c7911daT.e.c())) {
            d2 = c7911daT.d();
            c7911daT.i.d(d2, c7911daT.b);
            booleanRef.a = true;
        }
        if (booleanRef.a) {
            c = c7911daT.d.c();
            d = TaskMode.FROM_NETWORK;
        } else {
            c = c7971dba.c();
            d = c7971dba.d();
        }
        Observable e2 = c7911daT.a.e(new JS(d2.a(), c, d, c7971dba.e()));
        final drM<C5220bue, C5220bue> drm = new drM<C5220bue, C5220bue>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.FalcorUpNextFeedRepository$fetch$1$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C5220bue invoke(C5220bue c5220bue) {
                C8632dsu.c((Object) c5220bue, "");
                return C5220bue.e(c5220bue, null, null, Ref.BooleanRef.this.a, 3, null);
            }
        };
        return e2.map(new Function() { // from class: o.daW
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C5220bue d3;
                d3 = C7911daT.d(drM.this, obj);
                return d3;
            }
        }).concatMap(c7911daT.d(c7971dba.e())).singleOrError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5220bue d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (C5220bue) drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7972dbb.d d() {
        C7972dbb.d dVar = new C7972dbb.d(this.c.b(), this.e.c());
        this.i.d(dVar, this.b);
        return dVar;
    }

    /* renamed from: o.daT$e */
    /* loaded from: classes5.dex */
    public static final class e implements Function<C5220bue, ObservableSource<C5220bue>> {
        final /* synthetic */ boolean d;

        e(boolean z) {
            this.d = z;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: e */
        public ObservableSource<C5220bue> apply(C5220bue c5220bue) {
            C8632dsu.c((Object) c5220bue, "");
            Long expiresTime = c5220bue.b().getExpiresTime();
            if (expiresTime != null) {
                C7911daT c7911daT = C7911daT.this;
                boolean z = this.d;
                if (expiresTime.longValue() < 0) {
                    Observable e = c7911daT.a.e(new JS(c7911daT.d().a(), c7911daT.d.c(), TaskMode.FROM_NETWORK, z));
                    final FalcorUpNextFeedRepository$reFetchInitialIfExpired$1$apply$1$1 falcorUpNextFeedRepository$reFetchInitialIfExpired$1$apply$1$1 = new drM<C5220bue, C5220bue>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.FalcorUpNextFeedRepository$reFetchInitialIfExpired$1$apply$1$1
                        @Override // o.drM
                        /* renamed from: e */
                        public final C5220bue invoke(C5220bue c5220bue2) {
                            C8632dsu.c((Object) c5220bue2, "");
                            return C5220bue.e(c5220bue2, null, null, true, 3, null);
                        }
                    };
                    Observable map = e.map(new Function() { // from class: o.dbc
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            C5220bue e2;
                            e2 = C7911daT.e.e(drM.this, obj);
                            return e2;
                        }
                    });
                    C8632dsu.a(map, "");
                    return map;
                }
            }
            Observable just = Observable.just(c5220bue);
            C8632dsu.a(just, "");
            return just;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5220bue e(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return (C5220bue) drm.invoke(obj);
        }
    }

    private final e d(boolean z) {
        return new e(z);
    }
}
