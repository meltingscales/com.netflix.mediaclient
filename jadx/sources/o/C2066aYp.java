package o;

import com.netflix.mediaclient.service.mdx.MdxErrorSubCode;
import com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget;
import o.AbstractC2064aYn;
import o.AbstractC2065aYo;

/* renamed from: o.aYp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2066aYp extends AbstractC2064aYn<C2027aXd> {

    /* renamed from: o.aYp$b */
    /* loaded from: classes3.dex */
    public static class b extends AbstractC2064aYn.e<b, C2027aXd, C2066aYp> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.AbstractC2065aYo.e
        /* renamed from: c */
        public b b() {
            return this;
        }

        @Override // o.AbstractC2065aYo.e
        public /* bridge */ /* synthetic */ AbstractC2065aYo.e b(String str) {
            return super.b(str);
        }

        @Override // o.AbstractC2065aYo.e
        public /* bridge */ /* synthetic */ AbstractC2065aYo.e d(String str) {
            return super.d(str);
        }

        @Override // o.AbstractC2065aYo.e
        public /* bridge */ /* synthetic */ AbstractC2065aYo.e e(String str) {
            return super.e(str);
        }

        public b(String str, String str2, String str3, C2027aXd c2027aXd) {
            super(str, str2, str3, c2027aXd);
        }

        public C2066aYp d() {
            return new C2066aYp(this);
        }
    }

    private C2066aYp(b bVar) {
        super(bVar);
    }

    @Override // o.InterfaceC2070aYt
    public boolean b(boolean z) {
        C1044Mm.a("CafMdxTarget", "CafMdxTarget launchTarget - forceLaunch: %b, name: %s", Boolean.valueOf(z), k());
        this.c = false;
        this.b = z;
        if (a()) {
            C1044Mm.a("CafMdxTarget", "CafMdxTarget launchTarget, already launched");
            this.k.b(this.b);
        } else {
            C1044Mm.a("CafMdxTarget", "CafMdxTarget launchTarget, will launch");
            if (!((AbstractC2064aYn) this).e) {
                ((AbstractC2064aYn) this).e = true;
                ((C2027aXd) this.i).c(t());
            }
        }
        return true;
    }

    @Override // o.AbstractC2064aYn
    public void e(aVX avx) {
        Object[] objArr = new Object[2];
        objArr[0] = t();
        objArr[1] = Boolean.valueOf(avx == null);
        C1044Mm.c("CafMdxTarget", "CafMdxTarget notifyLaunchResult - uuid: %s, success: %b", objArr);
        if (avx == null) {
            if (this.k == null) {
                this.k = ((SessionMdxTarget.b) ((SessionMdxTarget.b) ((SessionMdxTarget.b) new SessionMdxTarget.b(t(), k(), n(), (C2027aXd) this.i, SessionMdxTarget.MsgTransportType.CAST).c(SessionMdxTarget.PairingScheme.REGPAIR_V2).d(d())).b(e())).e(b())).c();
            }
            this.k.b(this.b);
            ((AbstractC2064aYn) this).e = false;
            AbstractC2049aXz o2 = o();
            if (o2 != null) {
                this.k.c(o2);
                return;
            }
            return;
        }
        if (this.b && !this.c) {
            this.c = true;
            MdxErrorSubCode b2 = avx.b();
            int i = AnonymousClass3.a[b2.ordinal()];
            if (i == 1 || i == 2) {
                this.m.b(t(), b2.d(), k(), avx.a());
            } else {
                this.m.b(t(), b2.d(), avx.c(), avx.a());
            }
            SessionMdxTarget sessionMdxTarget = this.k;
            if (sessionMdxTarget != null) {
                sessionMdxTarget.e(avx);
            }
        }
        SessionMdxTarget sessionMdxTarget2 = this.k;
        if (sessionMdxTarget2 != null) {
            sessionMdxTarget2.Q();
            this.k = null;
        }
        ((AbstractC2064aYn) this).e = false;
    }

    /* renamed from: o.aYp$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MdxErrorSubCode.values().length];
            a = iArr;
            try {
                iArr[MdxErrorSubCode.LaunchFailed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MdxErrorSubCode.LaunchTimeout.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
