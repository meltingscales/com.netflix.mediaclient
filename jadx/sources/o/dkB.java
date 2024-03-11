package o;

import com.netflix.msl.MslException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.MslMessageException;
import com.netflix.msl.util.MslContext;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.AbstractC8411dkp;
import o.dkG;

/* loaded from: classes5.dex */
public class dkB {
    private static final byte[] p = new byte[0];
    protected boolean a;
    protected boolean b;
    protected C8421dkz c;
    protected boolean d;
    protected AbstractC8411dkp.d e;
    protected dkO f;
    protected final Set<AbstractC8412dkq> g;
    protected long h;
    protected boolean i;
    protected dkO j;
    protected final Set<dkQ> k;
    protected dkU l;
    protected boolean m;
    protected final Set<dkQ> n;

    /* renamed from: o  reason: collision with root package name */
    protected AbstractC8424dlb f13852o;
    protected dkU s;
    private final MslContext t;

    public dkB a(AbstractC8424dlb abstractC8424dlb) {
        this.f13852o = abstractC8424dlb;
        return this;
    }

    public dkB a(boolean z) {
        this.b = z;
        if (z) {
            this.i = false;
            this.m = true;
        }
        return this;
    }

    public AbstractC8411dkp.d a() {
        return this.e;
    }

    public dkB b(boolean z) {
        this.d = z;
        return this;
    }

    public dkB c(boolean z) {
        this.a = z;
        return this;
    }

    public dkO c() {
        return this.j;
    }

    public dkB d(boolean z) {
        this.m = z;
        if (!z) {
            this.b = false;
        }
        return this;
    }

    public dkU d() {
        return this.l;
    }

    public dkB e(boolean z) {
        this.i = z;
        if (z) {
            this.b = false;
        }
        return this;
    }

    public boolean f() {
        return this.m;
    }

    public dkU g() {
        return this.s;
    }

    public boolean h() {
        return this.i;
    }

    public static long c(long j) {
        int i;
        if (j >= 0 && j <= 9007199254740992L) {
            if (i == 0) {
                return 0L;
            }
            return 1 + j;
        }
        throw new MslInternalException("Message ID " + j + " is outside the valid range.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public dkB(MslContext mslContext) {
        this.i = false;
        this.d = false;
        this.a = false;
        this.m = false;
        this.b = false;
        this.g = new HashSet();
        this.f13852o = null;
        this.s = null;
        this.n = new HashSet();
        this.f = null;
        this.l = null;
        this.k = new HashSet();
        this.t = mslContext;
    }

    public dkB(MslContext mslContext, dkO dko, dkU dku, long j) {
        this.i = false;
        this.d = false;
        this.a = false;
        this.m = false;
        this.b = false;
        this.g = new HashSet();
        this.f13852o = null;
        this.s = null;
        this.n = new HashSet();
        this.f = null;
        this.l = null;
        this.k = new HashSet();
        this.t = mslContext;
        if (j < 0 || j > 9007199254740992L) {
            throw new MslInternalException("Message ID " + j + " is outside the valid range.");
        }
        a(mslContext, j, mslContext.c(), dko, dku, null, null, null, null, null);
    }

    public dkB(MslContext mslContext, dkO dko, dkU dku) {
        this(mslContext, dko, dku, C8434dll.a(mslContext));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(MslContext mslContext, long j, C8421dkz c8421dkz, dkO dko, dkU dku, Set<dkQ> set, dkO dko2, dkU dku2, Set<dkQ> set2, AbstractC8411dkp.d dVar) {
        if (!mslContext.g() && (dko2 != null || dku2 != null)) {
            throw new MslInternalException("Cannot set peer master token or peer user ID token when not in peer-to-peer mode.");
        }
        this.h = j;
        this.c = c8421dkz;
        this.j = dko;
        this.s = dku;
        this.e = dVar;
        if (dVar != null && !mslContext.g()) {
            dko = dVar.b.c();
        }
        this.n.addAll(mslContext.h().e(dko, dku));
        if (set != null) {
            for (dkQ dkq : set) {
                if (dkq.c() && !dkq.c(dko)) {
                    C8373dje c8373dje = C8373dje.bA;
                    throw new MslMessageException(c8373dje, "st " + dkq + "; mt " + dko).e(dko);
                } else if (dkq.f() && !dkq.b(dku)) {
                    C8373dje c8373dje2 = C8373dje.bK;
                    throw new MslMessageException(c8373dje2, "st " + dkq + "; uit " + dku).e(dko).b(dku);
                } else {
                    this.n.add(dkq);
                }
            }
        }
        if (mslContext.g()) {
            this.f = dko2;
            this.l = dku2;
            this.k.addAll(mslContext.h().e(dVar != null ? dVar.b.c() : dko2, dku2));
            if (set2 != null) {
                for (dkQ dkq2 : set2) {
                    if (dkq2.c() && !dkq2.c(dko2)) {
                        C8373dje c8373dje3 = C8373dje.bA;
                        throw new MslMessageException(c8373dje3, "st " + dkq2 + "; mt " + dko2).e(dko2);
                    } else if (dkq2.f() && !dkq2.b(dku2)) {
                        C8373dje c8373dje4 = C8373dje.bK;
                        throw new MslMessageException(c8373dje4, "st " + dkq2 + "; uit " + dku2).e(dko2).b(dku2);
                    } else {
                        this.k.add(dkq2);
                    }
                }
            }
        }
    }

    public boolean j() {
        return this.j != null || this.t.a((MslContext.ReauthCode) null).a().d();
    }

    public boolean i() {
        return this.j != null || !(this.t.g() || this.e == null) || this.t.a((MslContext.ReauthCode) null).a().d();
    }

    public boolean n() {
        return this.j != null || this.t.a((MslContext.ReauthCode) null).a().a();
    }

    public boolean m() {
        return this.j != null || !(this.t.g() || this.e == null) || this.t.a((MslContext.ReauthCode) null).a().a();
    }

    public dkG b() {
        Long l;
        AbstractC8411dkp.d dVar = this.e;
        AbstractC8420dky abstractC8420dky = dVar != null ? dVar.b : null;
        if (!this.i) {
            l = null;
        } else if (this.j == null) {
            throw new MslMessageException(C8373dje.bg);
        } else {
            l = Long.valueOf(this.t.h().c(this.j));
        }
        dkG.a aVar = new dkG.a(this.h, l, this.m, this.b, this.c, this.g, abstractC8420dky, this.f13852o, this.s, this.n);
        dkG.e eVar = new dkG.e(this.f, this.l, this.k);
        MslContext mslContext = this.t;
        return b(mslContext, mslContext.a((MslContext.ReauthCode) null), this.j, aVar, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
        if (r9.a(r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected o.dkG b(com.netflix.msl.util.MslContext r7, o.djG r8, o.dkO r9, o.dkG.a r10, o.dkG.e r11) {
        /*
            r6 = this;
            if (r9 != 0) goto L3
            goto L21
        L3:
            boolean r0 = r6.d
            if (r0 == 0) goto L23
            boolean r0 = r6.a
            if (r0 != 0) goto Lc
            goto L21
        Lc:
            java.util.Date r0 = r7.m()
            if (r0 == 0) goto L15
            r9.a(r0)
        L15:
            boolean r1 = r6.m
            if (r1 == 0) goto L23
            if (r0 == 0) goto L21
            boolean r0 = r9.a(r0)
            if (r0 == 0) goto L23
        L21:
            r2 = r8
            goto L25
        L23:
            r8 = 0
            goto L21
        L25:
            o.dkG r8 = new o.dkG
            r0 = r8
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dkB.b(com.netflix.msl.util.MslContext, o.djG, o.dkO, o.dkG$a, o.dkG$e):o.dkG");
    }

    public void c(dkO dko, dkU dku) {
        if (dku != null && !dku.d(dko)) {
            throw new MslInternalException("User ID token must be bound to master token.");
        }
        if (this.e != null && !this.t.g()) {
            throw new MslInternalException("Attempt to set message builder master token when key exchange data exists as a trusted network server.");
        }
        try {
            Set<dkQ> e = this.t.h().e(dko, dku);
            Iterator<dkQ> it = this.n.iterator();
            while (it.hasNext()) {
                dkQ next = it.next();
                if ((next.f() && !next.b(dku)) || (next.c() && !next.c(dko))) {
                    it.remove();
                }
            }
            for (dkQ dkq : e) {
                d(dkq.d(), dkq.c(), dkq.f());
                this.n.add(dkq);
            }
            this.j = dko;
            this.s = dku;
            if (dku != null) {
                this.f13852o = null;
            }
        } catch (MslException e2) {
            throw new MslInternalException("Invalid master token and user ID token combination despite checking above.", e2);
        }
    }

    public void c(dkR dkr) {
        dkO dko;
        if ((!this.t.g() && this.s != null) || (this.t.g() && this.l != null)) {
            throw new MslInternalException("User ID token or peer user ID token already exists for the remote user.");
        }
        AbstractC8411dkp.d dVar = this.e;
        if (dVar != null) {
            dko = dVar.b.c();
        } else {
            dko = !this.t.g() ? this.j : this.f;
        }
        if (dko == null) {
            throw new MslInternalException("User ID token or peer user ID token cannot be created because no corresponding master token exists.");
        }
        dkU c = this.t.i().c(this.t, dkr, dko);
        if (this.t.g()) {
            this.l = c;
            return;
        }
        this.s = c;
        this.f13852o = null;
    }

    public dkB e(AbstractC8412dkq abstractC8412dkq) {
        this.g.add(abstractC8412dkq);
        return this;
    }

    public dkB d(String str, boolean z, boolean z2) {
        Iterator<dkQ> it = this.n.iterator();
        while (it.hasNext()) {
            dkQ next = it.next();
            if (next.d().equals(str) && next.c() == z && next.f() == z2) {
                it.remove();
            }
        }
        return this;
    }

    public Set<dkQ> e() {
        return Collections.unmodifiableSet(this.n);
    }

    public void e(dkO dko, dkU dku) {
        if (!this.t.g()) {
            throw new MslInternalException("Cannot set peer master token or peer user ID token when not in peer-to-peer mode.");
        }
        if (dku != null && dko == null) {
            throw new MslInternalException("Peer master token cannot be null when setting peer user ID token.");
        }
        if (dku != null && !dku.d(dko)) {
            C8373dje c8373dje = C8373dje.cW;
            throw new MslMessageException(c8373dje, "uit " + dku + "; mt " + dko).e(dko).b(dku);
        }
        try {
            Set<dkQ> e = this.t.h().e(dko, dku);
            Iterator<dkQ> it = this.k.iterator();
            while (it.hasNext()) {
                dkQ next = it.next();
                if ((next.f() && !next.b(dku)) || (next.c() && !next.c(dko))) {
                    it.remove();
                }
            }
            for (dkQ dkq : e) {
                c(dkq.d(), dkq.c(), dkq.f());
                this.k.add(dkq);
            }
            this.l = dku;
            this.f = dko;
        } catch (MslException e2) {
            throw new MslInternalException("Invalid peer master token and user ID token combination despite proper check.", e2);
        }
    }

    public dkB c(String str, boolean z, boolean z2) {
        Iterator<dkQ> it = this.k.iterator();
        while (it.hasNext()) {
            dkQ next = it.next();
            if (next.d().equals(str) && next.c() == z && next.f() == z2) {
                it.remove();
            }
        }
        return this;
    }
}
