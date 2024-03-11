package o;

import android.content.Context;
import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;
import o.aMN;

/* loaded from: classes3.dex */
public class aSS extends aSM {
    public static boolean c = false;
    private final Observer<aMN.e> d;
    private final Context e;

    public aSS(PublishSubject<dpR> publishSubject, Context context) {
        super(aMN.d.e, publishSubject);
        this.d = new bDM<aMN.e>("partnerModule") { // from class: o.aSS.3
            @Override // io.reactivex.Observer
            /* renamed from: e */
            public void onNext(aMN.e eVar) {
            }

            @Override // o.bDM, io.reactivex.Observer
            public void onError(Throwable th) {
            }
        };
        this.e = context;
    }

    public void d() {
        if (b()) {
            C1044Mm.c("nf_module_installer", "already installed %s", this.b.d());
        } else if (c(this.e)) {
            C1044Mm.c("nf_module_installer", "requesting install of %s", this.b.d());
            e(this.d, e());
        }
    }

    public static boolean c(Context context) {
        return C8151dev.j();
    }

    public static boolean b(Context context) {
        return c(context) && c();
    }

    public static boolean c() {
        return ((aMN) C1332Xp.b(aMN.class)).c(aMN.d.e);
    }

    @Override // o.aSM
    protected boolean e() {
        return AbstractApplicationC1040Mh.getInstance().o().i();
    }

    public static boolean a(Context context) {
        return b(context) || C1849aQn.e() || c;
    }
}
