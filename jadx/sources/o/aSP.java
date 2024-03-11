package o;

import android.content.Context;
import io.reactivex.Observer;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;
import o.aMN;

/* loaded from: classes3.dex */
public class aSP extends aSM {
    private final Observer<aMN.e> c;
    private final Context d;
    private final aOV e;

    public aSP(PublishSubject<dpR> publishSubject, Context context, aOV aov) {
        super(aMN.d.c, publishSubject);
        this.c = new bDM<aMN.e>("VoIp") { // from class: o.aSP.2
            @Override // io.reactivex.Observer
            /* renamed from: e */
            public void onNext(aMN.e eVar) {
            }

            @Override // o.bDM, io.reactivex.Observer
            public void onError(Throwable th) {
            }
        };
        this.d = context;
        this.e = aov;
    }

    public void c() {
        if (b()) {
            C1044Mm.c("nf_module_installer", "already installed %s", this.b.d());
            return;
        }
        long b = C8157dfA.b(this.d, "voip_module_not_installed_time", 0L);
        if (b == 0) {
            b = System.currentTimeMillis();
            C8157dfA.e(this.d, "voip_module_not_installed_time", b);
        }
        boolean e = e();
        if (e) {
            long days = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - b);
            int Z = this.e.Z();
            C1044Mm.a("nf_module_installer", "checkVoipModuleInstallation deadlineDays=%d", Integer.valueOf(Z));
            e = Z >= 0 && days >= ((long) Z);
        }
        C1044Mm.c("nf_module_installer", "requesting install of %s", this.b.d());
        e(this.c, e);
    }

    @Override // o.aSM
    protected boolean e() {
        return AbstractApplicationC1040Mh.getInstance().o().i();
    }
}
