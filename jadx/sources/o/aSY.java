package o;

import android.content.Context;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o.C8157dfA;
import o.C8632dsu;
import o.InterfaceC1270Vf;
import o.aSY;

/* loaded from: classes3.dex */
public final class aSY {
    private final InterfaceC1270Vf a;
    private final Context c;
    private final cQF d;
    private final long f;
    private final cQQ i;
    private final boolean j;
    public static final b e = new b(null);
    public static final int b = 8;

    @AssistedFactory
    /* loaded from: classes3.dex */
    public interface c {
        aSY c(cQF cqf, cQQ cqq);
    }

    @AssistedInject
    public aSY(@ApplicationContext Context context, @Assisted cQF cqf, @Assisted cQQ cqq, InterfaceC1270Vf interfaceC1270Vf, boolean z, long j) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) cqf, "");
        C8632dsu.c((Object) cqq, "");
        C8632dsu.c((Object) interfaceC1270Vf, "");
        this.c = context;
        this.d = cqf;
        this.i = cqq;
        this.a = interfaceC1270Vf;
        this.j = z;
        this.f = j;
    }

    private final boolean d() {
        if (this.j) {
            return this.a.c() - C8157dfA.b(this.c, "com.netflix.mediaclient.service.job.ConfigRefresh.lastExecutionTime", 0L) >= TimeUnit.HOURS.toMillis(this.f);
        }
        return false;
    }

    public final Completable c() {
        if (d()) {
            Single<Boolean> a = this.d.a(this.i, true);
            final drM<Boolean, SingleSource<? extends Boolean>> drm = new drM<Boolean, SingleSource<? extends Boolean>>() { // from class: com.netflix.mediaclient.service.job.InsomniaConfigRefresh$refreshConfig$1
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: d */
                public final SingleSource<? extends Boolean> invoke(Boolean bool) {
                    Context context;
                    InterfaceC1270Vf interfaceC1270Vf;
                    C8632dsu.c((Object) bool, "");
                    if (bool.booleanValue()) {
                        context = aSY.this.c;
                        interfaceC1270Vf = aSY.this.a;
                        C8157dfA.e(context, "com.netflix.mediaclient.service.job.ConfigRefresh.lastExecutionTime", interfaceC1270Vf.c());
                        return Single.just(Boolean.TRUE);
                    }
                    return Single.error(new IOException("Failed to fetch config"));
                }
            };
            Completable fromSingle = Completable.fromSingle(a.flatMap(new Function() { // from class: o.aSX
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    SingleSource b2;
                    b2 = aSY.b(drM.this, obj);
                    return b2;
                }
            }));
            C8632dsu.d(fromSingle);
            return fromSingle;
        }
        Completable complete = Completable.complete();
        C8632dsu.d(complete);
        return complete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
