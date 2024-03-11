package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever;
import com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum;
import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger;
import com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.subjects.CompletableSubject;
import java.util.EnumSet;
import o.C8241dgf;

/* renamed from: o.aWp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2012aWp implements aVK {
    private C2027aXd a;
    private final Handler b;
    private final aWP c;
    private final String d;
    private final Looper e;
    private C2038aXo f;
    private final aVJ h;
    private final C2013aWq i;

    public aWP f() {
        return this.c;
    }

    public aVJ g() {
        return this.h;
    }

    public Looper h() {
        return this.e;
    }

    public Handler i() {
        return this.b;
    }

    public String j() {
        return this.d;
    }

    public C2013aWq n() {
        return this.i;
    }

    public boolean t() {
        return this.a != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2012aWp(aVJ avj, String str, Looper looper, Handler handler, C2013aWq c2013aWq, aWP awp) {
        this.h = avj;
        this.d = str;
        this.e = looper;
        this.b = handler;
        this.i = c2013aWq;
        this.c = awp;
    }

    public void d(Context context, InterfaceC5129bst interfaceC5129bst, final CompletableSubject completableSubject) {
        if (this.a == null) {
            CompletableSubject create = CompletableSubject.create();
            create.subscribe(new CallbackCompletableObserver(new Consumer<Throwable>() { // from class: o.aWp.2
                @Override // io.reactivex.functions.Consumer
                /* renamed from: b */
                public void accept(Throwable th) {
                    C1044Mm.e("TargetManagerV2", "addCaf - failed to init CAF, error: %s", th.getMessage());
                    C2012aWp.this.a = null;
                    completableSubject.onError(th);
                }
            }, new Action() { // from class: o.aWp.5
                @Override // io.reactivex.functions.Action
                public void run() {
                    C1044Mm.a("TargetManagerV2", "addCaf - successfully initialized CAF");
                    completableSubject.onComplete();
                }
            }));
            this.a = new C2027aXd(context, this, interfaceC5129bst, create);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Context context, aVM avm, InterfaceC5129bst interfaceC5129bst, aHJ ahj) {
        if (this.f == null) {
            try {
                this.f = new C2038aXo(context, avm, this, interfaceC5129bst, ahj);
            } catch (Throwable th) {
                InterfaceC1598aHf.e("Failed to init MdxStackDial, error: " + th.getMessage(), th);
                C1044Mm.e("TargetManagerV2", "Failed to init MdxStackDial, error: %s", th.getMessage());
                this.f = null;
            }
        }
    }

    public String l(String str) {
        AbstractC2065aYo<?>[] j;
        for (AbstractC2065aYo<?> abstractC2065aYo : this.f.j()) {
            if (abstractC2065aYo.n().contains(str)) {
                return abstractC2065aYo.t();
            }
        }
        return null;
    }

    public void a(String str, String str2) {
        AbstractC2065aYo<?> q;
        if (C8168dfL.g(str) || C8168dfL.g(str2) || (q = q(str)) == null) {
            return;
        }
        q.c(q.n(), str2);
    }

    public void u() {
        C1044Mm.a("TargetManagerV2", "start MDX");
        C2027aXd c2027aXd = this.a;
        if (c2027aXd != null) {
            c2027aXd.p();
        }
        C2038aXo c2038aXo = this.f;
        if (c2038aXo != null) {
            c2038aXo.a();
        }
    }

    public void v() {
        C1044Mm.a("TargetManagerV2", "stop");
        b("", true);
        C2027aXd c2027aXd = this.a;
        if (c2027aXd != null) {
            c2027aXd.q();
        }
        C2038aXo c2038aXo = this.f;
        if (c2038aXo != null) {
            c2038aXo.c();
        }
    }

    public void b(String str, boolean z) {
        e(str, z, (C1999aWc) null);
    }

    public void e(String str, boolean z, C1999aWc c1999aWc) {
        C1044Mm.c("TargetManagerV2", "selectTarget %s %b", str, Boolean.valueOf(z));
        if (this.i != null) {
            AbstractC2065aYo<?> q = q(str);
            boolean z2 = c1999aWc != null && (c1999aWc.a(MdxLoginPolicyEnum.LoginOnlyRequestedByTarget) || c1999aWc.a(MdxLoginPolicyEnum.LoginAndPairRequestedByTarget));
            if (z2 ? !(q == null || q.i() || q.a()) : q != null) {
                this.i.d(q);
                if (z) {
                    if (z2) {
                        EnumSet of = EnumSet.of(MdxLoginPolicyEnum.LoginAndPair, MdxLoginPolicyEnum.LoginAndPairRequestedByTarget);
                        if (c1999aWc == null || c1999aWc.e(of)) {
                            MdxConnectionLogblobLogger.a(q.n());
                        }
                    } else {
                        MdxConnectionLogblobLogger.a(q.n());
                    }
                }
                if (q instanceof InterfaceC2070aYt) {
                    C1044Mm.a("TargetManagerV2", "selectTarget, need launch");
                    if (q instanceof C2067aYq) {
                        ((C2067aYq) q).d(z, c1999aWc);
                    } else {
                        ((InterfaceC2070aYt) q).b(z);
                    }
                } else {
                    SessionMdxTarget<?> p = p(str);
                    if (p != null) {
                        C1044Mm.a("TargetManagerV2", "selectTarget, contact mdx target");
                        p.b(z, c1999aWc);
                    } else {
                        C1044Mm.c("TargetManagerV2", "BUG!!! selectTarget failed %s", str);
                    }
                }
                w();
            } else if (C8168dfL.d(str, "")) {
                this.i.d((AbstractC2065aYo) null);
                w();
            }
        }
    }

    public AbstractC2065aYo<?> b() {
        return q(this.i.b());
    }

    public void m(String str) {
        AbstractC2065aYo<?> q = q(str);
        if (q != null) {
            q.a(false);
        }
    }

    public void i(String str) {
        AbstractC2065aYo<?> q = q(str);
        if (q != null) {
            q.a(true);
        }
    }

    public void e() {
        C2027aXd c2027aXd = this.a;
        if (c2027aXd != null) {
            c2027aXd.s();
        }
    }

    public void w() {
        C2027aXd c2027aXd = this.a;
        if (c2027aXd != null) {
            c2027aXd.t();
        } else {
            C1044Mm.j("TargetManagerV2", "updateTargetList, cast mdx is not ready");
        }
        C2038aXo c2038aXo = this.f;
        if (c2038aXo != null) {
            c2038aXo.t();
        } else {
            C1044Mm.j("TargetManagerV2", "updateTargetList, dial mdx is not ready");
        }
    }

    public Pair<String, String>[] l() {
        return e(true, true);
    }

    public Pair<String, String>[] e(boolean z, boolean z2) {
        int i;
        C2038aXo c2038aXo;
        C2027aXd c2027aXd;
        int i2 = 0;
        AbstractC2065aYo<?>[] abstractC2065aYoArr = new AbstractC2065aYo[0];
        if (!z || (c2027aXd = this.a) == null) {
            i = 0;
        } else {
            abstractC2065aYoArr = c2027aXd.j();
            i = abstractC2065aYoArr.length;
        }
        AbstractC2065aYo<?>[] abstractC2065aYoArr2 = new AbstractC2065aYo[0];
        if (z2 && (c2038aXo = this.f) != null) {
            abstractC2065aYoArr2 = c2038aXo.j();
            i += abstractC2065aYoArr2.length;
        }
        if (i > 0) {
            Pair<String, String>[] pairArr = new Pair[i];
            int length = abstractC2065aYoArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                AbstractC2065aYo<?> abstractC2065aYo = abstractC2065aYoArr[i3];
                pairArr[i4] = Pair.create(abstractC2065aYo.t(), abstractC2065aYo.k());
                i3++;
                i4++;
            }
            int length2 = abstractC2065aYoArr2.length;
            while (i2 < length2) {
                AbstractC2065aYo<?> abstractC2065aYo2 = abstractC2065aYoArr2[i2];
                pairArr[i4] = Pair.create(abstractC2065aYo2.t(), abstractC2065aYo2.k());
                i2++;
                i4++;
            }
            return pairArr;
        }
        return null;
    }

    public void b(String str, boolean z, String str2, String str3) {
        if (C8168dfL.g(str)) {
            str = "UNKNOWN-NAME";
        }
        if (C8168dfL.g(str3)) {
            str3 = "UNKNOWN-SSID";
        }
        if (C8168dfL.g(str2)) {
            str2 = "0.0.0.0";
        }
        C2027aXd c2027aXd = this.a;
        if (c2027aXd != null) {
            c2027aXd.b(str, z, str2, str3);
        }
        C2038aXo c2038aXo = this.f;
        if (c2038aXo != null) {
            c2038aXo.e(str, z, str2, str3);
        }
    }

    public void d() {
        C2027aXd c2027aXd = this.a;
        if (c2027aXd != null) {
            c2027aXd.q();
            this.a.e();
            this.a = null;
        }
        C2038aXo c2038aXo = this.f;
        if (c2038aXo != null) {
            c2038aXo.c();
            this.f.e();
            this.f = null;
        }
    }

    public void y() {
        C2027aXd c2027aXd = this.a;
        if (c2027aXd != null) {
            c2027aXd.w();
        }
        C2038aXo c2038aXo = this.f;
        if (c2038aXo != null) {
            c2038aXo.p();
        }
    }

    private AbstractC2065aYo<?> q(String str) {
        C2027aXd c2027aXd = this.a;
        AbstractC2065aYo<?> d = c2027aXd != null ? c2027aXd.d(str) : null;
        C2038aXo c2038aXo = this.f;
        return (c2038aXo == null || d != null) ? d : c2038aXo.d(str);
    }

    private SessionMdxTarget<?> p(String str) {
        AbstractC2065aYo<?> q = q(str);
        if (q != null) {
            return q.c();
        }
        return null;
    }

    public String k(String str) {
        AbstractC2065aYo<?> q = q(str);
        if (q != null) {
            return q.t();
        }
        return null;
    }

    public boolean o(String str) {
        SessionMdxTarget<?> p = p(str);
        return p != null && p.G();
    }

    @Override // o.aVK
    public void c(String str, String str2) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.f(str2);
        }
    }

    @Override // o.aVK
    public void e(String str) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.g();
        }
    }

    @Override // o.aVK
    public void d(String str, boolean z) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.e(z);
        }
    }

    @Override // o.aVK
    public void c(String str) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXL());
        }
    }

    @Override // o.aVK
    public void h(String str) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXN());
        }
    }

    @Override // o.aVK
    public void b(String str, int i) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXS(p.w(), i, p.U()));
        }
    }

    @Override // o.aVK
    public void c(String str, String str2, int i, String str3, int i2, boolean z, String str4) {
        SessionMdxTarget<?> p = p(str);
        String e = aMH.c().e();
        String e2 = C8055ddE.e(AbstractApplicationC1040Mh.d());
        aOV d = AbstractApplicationC1040Mh.getInstance().i().d();
        aXK axk = new aXK(str2, i, this.d, str3, Integer.valueOf(i2), z, str4, e, d != null ? aWL.c(d.a()) : "{}", e2);
        if (p != null) {
            p.c(axk);
            this.c.c(p.G() ? MdxTargetType.Cast : MdxTargetType.Nrdp, p.t(), p.k());
            return;
        }
        AbstractC2065aYo<?> q = q(str);
        if (q != null) {
            q.c(axk);
            this.c.c(q instanceof C2066aYp ? MdxTargetType.Cast : MdxTargetType.Nrdp, q.t(), q.k());
        }
    }

    @Override // o.aVK
    public void j(String str) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXM(p.w()));
        }
    }

    @Override // o.aVK
    public void g(String str) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXJ(p.w()));
        }
    }

    @Override // o.aVK
    public void e(String str, String str2) {
        MdxNotificationIntentRetriever.InvocSource d = MdxNotificationIntentRetriever.InvocSource.d(str2);
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            this.c.b().a(d, p.G() ? MdxTargetType.Cast : MdxTargetType.Nrdp);
            aXW axw = new aXW(p.w());
            if (MdxNotificationIntentRetriever.InvocSource.Disconnect.a().equals(str2)) {
                p.e(axw);
            } else {
                p.c(axw);
            }
        }
    }

    @Override // o.aVK
    public void d(String str, int i) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXQ(p.w(), i));
        }
    }

    @Override // o.aVK
    public void a(String str, String str2, String str3) {
        MdxNotificationIntentRetriever.SegmentType d = MdxNotificationIntentRetriever.SegmentType.d(str2);
        MdxNotificationIntentRetriever.InvocSource d2 = MdxNotificationIntentRetriever.InvocSource.d(str3);
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            this.c.b().d(d, d2, p.G() ? MdxTargetType.Cast : MdxTargetType.Nrdp);
            p.c(new aXO(p.w()));
        }
    }

    @Override // o.aVK
    public void a(String str, int i) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXR(p.w(), i));
        }
    }

    @Override // o.aVK
    public void c(String str, int i) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXP(p.w(), i));
        }
    }

    @Override // o.aVK
    public void d(String str, String str2, String str3) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXU(str2, str3));
        }
    }

    @Override // o.aVK
    public void e(String str, String str2, String str3) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXA(str2, str3));
        }
    }

    @Override // o.aVK
    public void d(String str, String str2, String str3, String str4) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXH(str2, str3, str4));
        }
    }

    @Override // o.aVK
    public void a(String str) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXI());
        }
    }

    @Override // o.aVK
    public void d(String str) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXG());
        }
    }

    @Override // o.aVK
    public void b(String str) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXE());
        }
    }

    @Override // o.aVK
    public void f(String str) {
        SessionMdxTarget<?> p = p(str);
        if (p != null) {
            p.c(new aXT(p.w()));
        }
    }

    public boolean r() {
        SessionMdxTarget<?> p = p(this.i.b());
        return p != null && p.D();
    }

    public boolean q() {
        AbstractC2065aYo<?> b = b();
        if (b != null) {
            if ((b instanceof SessionMdxTarget) || (b instanceof AbstractC2064aYn)) {
                return b.i();
            }
            return false;
        }
        return false;
    }

    public boolean s() {
        AbstractC2065aYo<?> b = b();
        if (b != null) {
            if ((b instanceof SessionMdxTarget) || (b instanceof AbstractC2064aYn)) {
                return b.a();
            }
            return false;
        }
        return false;
    }

    public long m() {
        SessionMdxTarget<?> p = p(this.i.b());
        if (p != null) {
            return p.B().longValue();
        }
        return 0L;
    }

    public C2005aWi k() {
        SessionMdxTarget<?> p = p(this.i.b());
        if (p != null) {
            return p.v();
        }
        return null;
    }

    public C8241dgf.e p() {
        SessionMdxTarget<?> p = p(this.i.b());
        if (p != null) {
            return p.z();
        }
        return null;
    }

    public String o() {
        SessionMdxTarget<?> p = p(this.i.b());
        if (p != null) {
            return p.t();
        }
        return null;
    }

    public boolean n(String str) {
        C2038aXo c2038aXo = this.f;
        if (c2038aXo != null) {
            return c2038aXo.c(str);
        }
        return false;
    }

    public void c() {
        C2027aXd c2027aXd = this.a;
        if (c2027aXd != null) {
            c2027aXd.b();
        }
    }

    public void a() {
        C2027aXd c2027aXd = this.a;
        if (c2027aXd != null) {
            c2027aXd.g();
        }
    }
}
