package o;

import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;
import o.aMN;

/* loaded from: classes3.dex */
public abstract class aSM {
    protected boolean a;
    protected final aMN.d b;
    private final PublishSubject<dpR> c;
    private final aMN e = (aMN) C1332Xp.b(aMN.class);

    protected boolean e() {
        return false;
    }

    public boolean a() {
        return this.a || b();
    }

    public aSM(aMN.d dVar, PublishSubject<dpR> publishSubject) {
        this.b = dVar;
        this.c = publishSubject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b() {
        return this.e.c(this.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(Observer<aMN.e> observer, boolean z) {
        if (!b()) {
            C1044Mm.a("nf_module_installer", "downloadAndInstallModule requesting install of %s fg=%b", this.b.d(), Boolean.valueOf(z));
            this.a = true;
            boolean i = AbstractApplicationC1040Mh.getInstance().o().i();
            if (z && i) {
                this.e.a(this.b).takeUntil(this.c).subscribe(observer);
                return;
            } else {
                this.e.e(this.b);
                return;
            }
        }
        C1044Mm.a("nf_module_installer", "downloadAndInstallModule module %s already installed", this.b.d());
    }
}
