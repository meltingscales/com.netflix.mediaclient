package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MSLTransport;
import com.netflix.mediaclient.service.msl.MslServiceState;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.msl.client.params.MslBootKey;
import com.netflix.msl.msg.MslControl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C8404dki;

/* loaded from: classes3.dex */
public abstract class aYZ implements InterfaceC8387djs, InterfaceC8383djo<C8418dkw> {
    protected static final int c;
    protected final aYO a;
    protected final aOV b;
    protected final Context d;
    protected final C8382djn e;
    protected final aHJ f;
    protected final InterfaceC5128bss g;
    protected final AtomicBoolean h = new AtomicBoolean(false);
    protected final C8404dki i;
    protected final C2088aZk j;
    protected final aYH k;
    protected final MslControl l;
    protected C8384djp m;
    protected final dkF n;

    /* renamed from: o  reason: collision with root package name */
    protected final AbstractC8399dkd f13457o;
    protected final aYR p;
    protected final UserAgent r;
    protected aYY t;

    @Override // o.InterfaceC8387djs
    public Context k() {
        return this.d;
    }

    static {
        c = C1865aRc.m() ? C1865aRc.j().c() : 10000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aYZ(Context context, aOV aov, aHJ ahj, UserAgent userAgent, InterfaceC5128bss interfaceC5128bss, aYH ayh) {
        this.f = ahj;
        this.d = context;
        this.r = userAgent;
        this.g = interfaceC5128bss;
        this.k = ayh;
        this.b = aov;
        if (aov.aF()) {
            if (aYW.a()) {
                this.e = new C8382djn(MslBootKey.KeyType.ECC, MslBootKey.KeyType.RSA);
            } else {
                this.e = new C8382djn(MslBootKey.KeyType.ECC, null);
            }
        } else {
            this.e = new C8382djn(MslBootKey.KeyType.RSA, null);
        }
        this.j = new C2088aZk(aov);
        C8427dle.b(new C8430dlh());
        djY djy = new djY();
        this.f13457o = djy;
        this.l = new MslControl(0, new dkH(), new aYM(context));
        C1044Mm.a("nf_msl_client", "ESN %s", aov.w().m());
        aYR ayr = new aYR(context);
        this.p = ayr;
        aYO ayo = new aYO(context);
        this.a = ayo;
        this.n = new aYQ(djy);
        this.t = new aYV(context, userAgent, djy);
        ayh.b(MslServiceState.e);
        this.m = e(aov.w().m(), ayr, this.t);
        if (Config_FastProperty_MSLTransport.isCborEnabled()) {
            this.i = C8404dki.d;
            this.m.b(new HashSet<C8404dki>() { // from class: com.netflix.mediaclient.service.msl.client.BaseMslClient$1
                {
                    add(C8404dki.d);
                }
            });
        } else {
            this.i = C8404dki.b;
            this.m.b(new HashSet<C8404dki>() { // from class: com.netflix.mediaclient.service.msl.client.BaseMslClient$2
                {
                    add(C8404dki.b);
                }
            });
        }
        C1044Mm.a("nf_msl_client", "Do we need to clear MSL store (ESN migration is needed: %b): false", Boolean.valueOf(aov.ao()));
        ayo.c();
        ayr.c();
        ayh.b(MslServiceState.i);
        ((aYV) this.t).b(this.m, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8384djp e(String str, djT djt, InterfaceC8429dlg interfaceC8429dlg) {
        HashMap hashMap = new HashMap();
        hashMap.put(djI.j, new djO(djt, new C2084aZg()));
        hashMap.put(djI.b, new djJ(this.a, new C2084aZg()));
        aYP ayp = new aYP(this.b.w());
        C1044Mm.e("nf_msl_client", "Create Widevine Entity Authorization MSL context");
        byte[] d = i().d();
        djI dji = djL.t;
        djG e = C2078aZa.e(this.b, d);
        hashMap.put(dji, new djU(ayp));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(C8419dkx.i, new C2086aZi());
        return C8384djp.a().b(e).c(interfaceC8429dlg).c(hashMap).d(hashMap2).b(this.f13457o).d(new HashSet<C8404dki>() { // from class: com.netflix.mediaclient.service.msl.client.BaseMslClient$3
            {
                add(C8404dki.b);
            }
        }).d();
    }

    @Override // o.InterfaceC8383djo
    /* renamed from: h */
    public C8418dkw i() {
        C1044Mm.e("nf_msl_client", "WidevineKeyRequestDataProvider::get:");
        return aPB.e().c();
    }
}
