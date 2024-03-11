package o;

import com.netflix.dial.DialDevice;
import com.netflix.mediaclient.service.mdx.MdxErrorSubCode;
import com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget;
import com.netflix.ssdp.SsdpDevice;
import com.netflix.upnp.UpnpDevice;
import o.AbstractC2064aYn;
import o.AbstractC2065aYo;

/* renamed from: o.aYq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2067aYq extends AbstractC2064aYn<C2038aXo> {
    private DialDevice p;
    private boolean q;
    private C1999aWc r;

    public void e(SessionMdxTarget sessionMdxTarget) {
        this.k = sessionMdxTarget;
    }

    public DialDevice p() {
        return this.p;
    }

    public void r() {
        this.q = true;
    }

    public boolean s() {
        return this.q;
    }

    /* renamed from: o.aYq$e */
    /* loaded from: classes3.dex */
    public static class e extends AbstractC2064aYn.e<e, C2038aXo, C2067aYq> {
        private final DialDevice e;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.AbstractC2065aYo.e
        /* renamed from: a */
        public e b() {
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

        public e(DialDevice dialDevice, C2038aXo c2038aXo) {
            super(dialDevice.h().k().i(), dialDevice.h().c(), dialDevice.h().k().e(), c2038aXo);
            this.e = dialDevice;
        }

        public C2067aYq e() {
            return new C2067aYq(this);
        }
    }

    private C2067aYq(e eVar) {
        super(eVar);
        this.p = eVar.e;
    }

    @Override // o.AbstractC2065aYo
    public boolean a(String str) {
        if (super.t().equals(str)) {
            return true;
        }
        SessionMdxTarget sessionMdxTarget = this.k;
        return sessionMdxTarget != null && sessionMdxTarget.t().equals(str);
    }

    @Override // o.InterfaceC2070aYt
    public boolean b(boolean z) {
        return d(z, null);
    }

    public boolean d(boolean z, C1999aWc c1999aWc) {
        this.c = false;
        this.b = z;
        if (a()) {
            C1044Mm.a("DialMdxTarget", "launchTarget, already launched");
            this.k.b(this.b, c1999aWc);
        } else if (!((AbstractC2064aYn) this).e) {
            C1044Mm.a("DialMdxTarget", "launchTarget, will launch");
            ((AbstractC2064aYn) this).e = true;
            this.r = c1999aWc;
            ((C2038aXo) this.i).e(t());
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    @Override // o.AbstractC2064aYn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.aVX r19) {
        /*
            r18 = this;
            r0 = r18
            r10 = r19
            r14 = 0
            if (r10 == 0) goto Ld7
            boolean r1 = r0.b
            if (r1 == 0) goto Lc9
            boolean r1 = r0.c
            if (r1 != 0) goto Lc9
            r1 = 1
            r0.c = r1
            com.netflix.mediaclient.service.mdx.MdxErrorSubCode r2 = r19.b()
            o.aWc r3 = r0.r
            if (r3 == 0) goto L36
            com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum r4 = com.netflix.mediaclient.service.mdx.MdxLoginPolicyEnum.LoginOnly
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L36
            o.aVJ r1 = r0.m
            java.lang.String r2 = r18.t()
            com.netflix.mediaclient.service.mdx.MdxErrorSubCode r3 = com.netflix.mediaclient.service.mdx.MdxErrorSubCode.RemoteLoginOnlyFailed
            int r3 = r3.d()
            java.lang.String r4 = r18.k()
            r1.b(r2, r3, r4, r14)
            goto L6e
        L36:
            int[] r3 = o.C2067aYq.AnonymousClass3.a
            int r4 = r2.ordinal()
            r3 = r3[r4]
            if (r3 == r1) goto L59
            r1 = 2
            if (r3 == r1) goto L59
            o.aVJ r1 = r0.m
            java.lang.String r3 = r18.t()
            int r2 = r2.d()
            java.lang.String r4 = r19.c()
            java.lang.String r5 = r19.a()
            r1.b(r3, r2, r4, r5)
            goto L6e
        L59:
            o.aVJ r1 = r0.m
            java.lang.String r3 = r18.t()
            int r2 = r2.d()
            java.lang.String r4 = r18.k()
            java.lang.String r5 = r19.a()
            r1.b(r3, r2, r4, r5)
        L6e:
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget r1 = r0.k
            if (r1 == 0) goto L76
            r1.e(r10)
            goto Lc9
        L76:
            o.aWP r1 = r0.g
            com.netflix.mediaclient.service.mdx.logging.connection.MdxConnectionLogblobLogger r1 = r1.e()
            com.netflix.mediaclient.service.mdx.logging.MdxTargetType r2 = com.netflix.mediaclient.service.mdx.logging.MdxTargetType.Nrdp
            java.lang.String r3 = r18.n()
            java.lang.String r4 = r18.t()
            java.lang.String r5 = r18.k()
            com.netflix.dial.DialDevice r6 = r18.p()
            com.netflix.upnp.UpnpDevice r6 = r6.h()
            java.lang.String r7 = r6.i()
            com.netflix.dial.DialDevice r6 = r18.p()
            com.netflix.upnp.UpnpDevice r6 = r6.h()
            java.lang.String r8 = r6.g()
            com.netflix.dial.DialDevice r6 = r18.p()
            com.netflix.upnp.UpnpDevice r6 = r6.h()
            java.lang.String r9 = r6.f()
            com.netflix.dial.DialDevice r6 = r18.p()
            boolean r13 = r6.g()
            boolean r12 = r0.q
            r6 = 0
            r11 = 0
            r16 = 0
            r10 = r19
            r17 = r12
            r12 = r16
            r15 = r14
            r14 = r17
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lca
        Lc9:
            r15 = r14
        Lca:
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget r1 = r0.k
            if (r1 == 0) goto Lf6
            r1.Q()
            r0.k = r15
            r1 = 0
            r0.a = r1
            goto Lf6
        Ld7:
            r15 = r14
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget r1 = r0.k
            if (r1 != 0) goto Le4
            java.lang.String r1 = "DialMdxTarget"
            java.lang.String r2 = "launch successful, but no session target. BUG!!!"
            o.C1044Mm.j(r1, r2)
            goto Lf6
        Le4:
            boolean r2 = r0.b
            o.aWc r3 = r0.r
            r1.b(r2, r3)
            o.aXz r1 = r18.o()
            if (r1 == 0) goto Lf6
            com.netflix.mediaclient.service.mdx.protocol.target.SessionMdxTarget r2 = r0.k
            r2.c(r1)
        Lf6:
            r0.r = r15
            r1 = 0
            r0.e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2067aYq.e(o.aVX):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aYq$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
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

    public void c(DialDevice dialDevice) {
        UpnpDevice h = dialDevice.h();
        SsdpDevice k = h.k();
        super.a(k.e(), h.c(), h.i(), h.g(), h.f());
        SessionMdxTarget sessionMdxTarget = this.k;
        if (sessionMdxTarget != null) {
            sessionMdxTarget.d(k);
        }
        this.p = dialDevice;
    }
}
