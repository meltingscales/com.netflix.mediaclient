package o;

import com.netflix.mediaclient.util.gfx.ImageLoader;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import o.C8632dsu;
import o.C9652uT;
import o.InterfaceC4942bpR;
import o.InterfaceC9636uD;

/* renamed from: o.uT  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9652uT extends AbstractC5999cQf<InterfaceC4942bpR> implements InterfaceC9651uS {
    @Override // o.InterfaceC9651uS
    public Single<InterfaceC9636uD> c() {
        Single<InterfaceC4942bpR> h = h();
        final drM<InterfaceC4942bpR, InterfaceC9636uD> drm = new drM<InterfaceC4942bpR, InterfaceC9636uD>() { // from class: com.netflix.android.imageloader.impl.ImageLoaderProviderImpl$getImageLoaderSingle$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final InterfaceC9636uD invoke(InterfaceC4942bpR interfaceC4942bpR) {
                InterfaceC9636uD c;
                C8632dsu.c((Object) interfaceC4942bpR, "");
                c = C9652uT.this.c(interfaceC4942bpR);
                return c;
            }
        };
        Single map = h.map(new Function() { // from class: o.uV
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InterfaceC9636uD a;
                a = C9652uT.a(drM.this, obj);
                return a;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC9636uD a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (InterfaceC9636uD) drm.invoke(obj);
    }

    @Override // o.InterfaceC9651uS
    public Single<InterfaceC9636uD> b() {
        Single<InterfaceC9636uD> observeOn = c().observeOn(AndroidSchedulers.mainThread());
        C8632dsu.a(observeOn, "");
        return observeOn;
    }

    @Override // o.InterfaceC9651uS
    public InterfaceC9636uD d() {
        InterfaceC4942bpR interfaceC4942bpR = (InterfaceC4942bpR) AbstractApplicationC1040Mh.getInstance().i().o();
        return (InterfaceC9636uD) (interfaceC4942bpR != null ? interfaceC4942bpR.e() : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5999cQf
    /* renamed from: e */
    public InterfaceC4942bpR a() {
        Object o2 = AbstractApplicationC1040Mh.getInstance().i().o();
        C8632dsu.d(o2);
        return (InterfaceC4942bpR) o2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC9636uD c(InterfaceC4942bpR interfaceC4942bpR) {
        ImageLoader e = interfaceC4942bpR.e();
        C8632dsu.d(e);
        return (InterfaceC9636uD) e;
    }
}
