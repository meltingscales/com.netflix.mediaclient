package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.ui.repository.MoneyballRepository$runMoneyballRequest$1$1;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public final class cQL extends AbstractC5999cQf<aMU> {
    public static final e a = new e(null);

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("MoneyballRepository");
        }
    }

    @Override // o.AbstractC5999cQf
    /* renamed from: b */
    public aMU a() {
        aMU n = AbstractApplicationC1040Mh.getInstance().i().n();
        if (n != null) {
            return n;
        }
        throw new IllegalStateException("userAgent is null");
    }

    public static /* synthetic */ Single e(cQL cql, boolean z, drX drx, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return cql.e(z, drx);
    }

    @SuppressLint({"CheckResult"})
    public final Single<MoneyballData> e(final boolean z, final drX<? super aMU, ? super aMX, dpR> drx) {
        C8632dsu.c((Object) drx, "");
        Single<MoneyballData> create = Single.create(new SingleOnSubscribe() { // from class: o.cQJ
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                cQL.e(cQL.this, drx, z, singleEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    public static final void b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void e(cQL cql, drX drx, boolean z, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) cql, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) singleEmitter, "");
        Single<aMU> h = cql.h();
        final MoneyballRepository$runMoneyballRequest$1$1 moneyballRepository$runMoneyballRequest$1$1 = new MoneyballRepository$runMoneyballRequest$1$1(drx, singleEmitter, z);
        h.subscribe(new Consumer() { // from class: o.cQO
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                cQL.b(drM.this, obj);
            }
        });
    }
}
