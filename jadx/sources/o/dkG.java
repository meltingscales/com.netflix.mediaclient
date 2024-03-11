package o;

import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.MslMasterTokenException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class dkG extends dkC {
    protected final AbstractC8393djy a;
    protected final djG c;
    protected final C8401dkf d;
    protected final dkO e;
    private final Set<AbstractC8412dkq> f;
    private final C8421dkz g;
    private final boolean i;
    private final AbstractC8420dky j;
    private final Set<dkQ> k;
    private final dkU l;
    private final dkO m;
    private final long n;

    /* renamed from: o  reason: collision with root package name */
    private final Long f13854o;
    private final dkR p;
    private final boolean q;
    private final Long r;
    private final Set<dkQ> s;
    private final AbstractC8424dlb t;
    private final dkU u;
    protected final Map<C8404dki, byte[]> b = new HashMap();
    protected final Map<C8404dki, C8401dkf> h = new HashMap();

    public dkO a() {
        return this.e;
    }

    public AbstractC8420dky b() {
        return this.j;
    }

    public djG c() {
        return this.c;
    }

    public Set<AbstractC8412dkq> d() {
        return this.f;
    }

    public AbstractC8393djy e() {
        return this.a;
    }

    public long f() {
        return this.n;
    }

    public C8421dkz g() {
        return this.g;
    }

    public Set<dkQ> h() {
        return this.k;
    }

    public dkO i() {
        return this.m;
    }

    public Long j() {
        return this.f13854o;
    }

    public dkU l() {
        return this.l;
    }

    public Set<dkQ> m() {
        return this.s;
    }

    public dkR n() {
        return this.p;
    }

    public AbstractC8424dlb o() {
        return this.t;
    }

    public dkU r() {
        return this.u;
    }

    public boolean s() {
        return this.q;
    }

    public boolean t() {
        return this.i;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public final boolean a;
        public final long b;
        public final AbstractC8420dky c;
        public final C8421dkz d;
        public final Set<AbstractC8412dkq> e;
        public final Set<dkQ> f;
        public final boolean g;
        public final AbstractC8424dlb h;
        public final Long i;
        public final dkU j;

        public a(long j, Long l, boolean z, boolean z2, C8421dkz c8421dkz, Set<AbstractC8412dkq> set, AbstractC8420dky abstractC8420dky, AbstractC8424dlb abstractC8424dlb, dkU dku, Set<dkQ> set2) {
            this.b = j;
            this.i = l;
            this.g = z;
            this.a = z2;
            this.d = c8421dkz;
            this.e = set;
            this.c = abstractC8420dky;
            this.h = abstractC8424dlb;
            this.j = dku;
            this.f = set2;
        }
    }

    /* loaded from: classes5.dex */
    public static class e {
        public final dkU a;
        public final Set<dkQ> b;
        public final dkO c;

        public e(dkO dko, dkU dku, Set<dkQ> set) {
            this.c = dko;
            this.a = dku;
            this.b = set;
        }
    }

    public dkG(MslContext mslContext, djG djg, dkO dko, a aVar, e eVar) {
        String str;
        dkO dko2;
        dkU dku;
        dkU dku2;
        long j = aVar.b;
        if (j < 0 || j > 9007199254740992L) {
            throw new MslInternalException("Message ID " + aVar.b + " is out of range.");
        } else if (djg == null && dko == null) {
            throw new MslInternalException("Message entity authentication data or master token must be provided.");
        } else {
            if (dko == null && !djg.a().d() && aVar.h != null) {
                throw new MslInternalException("User authentication data cannot be included if the message is not encrypted.");
            }
            if (dko != null) {
                str = mslContext.a((MslContext.ReauthCode) null).d();
                if (str == null) {
                    str = "";
                }
            } else {
                str = null;
            }
            this.c = djg;
            this.e = dko;
            this.f13854o = aVar.i;
            this.q = aVar.g;
            this.i = aVar.a;
            this.g = aVar.d;
            this.r = Long.valueOf(mslContext.f() / 1000);
            this.n = aVar.b;
            Set set = aVar.e;
            this.f = Collections.unmodifiableSet(set == null ? new HashSet() : set);
            AbstractC8420dky abstractC8420dky = aVar.c;
            this.j = abstractC8420dky;
            this.t = aVar.h;
            dkU dku3 = aVar.j;
            this.u = dku3;
            Set set2 = aVar.f;
            Set<dkQ> unmodifiableSet = Collections.unmodifiableSet(set2 == null ? new HashSet() : set2);
            this.s = unmodifiableSet;
            if (mslContext.g()) {
                this.m = eVar.c;
                this.l = eVar.a;
                Set set3 = eVar.b;
                this.k = Collections.unmodifiableSet(set3 == null ? new HashSet() : set3);
            } else {
                this.m = null;
                this.l = null;
                this.k = Collections.emptySet();
            }
            if (abstractC8420dky == null) {
                dko2 = this.m;
            } else if (!mslContext.g()) {
                dko = abstractC8420dky.c();
                dko2 = this.m;
            } else {
                dko2 = abstractC8420dky.c();
            }
            if (dku3 != null && (dko == null || !dku3.d(dko))) {
                throw new MslInternalException("User ID token must be bound to a master token.");
            }
            dkU dku4 = this.l;
            if (dku4 != null && (dko2 == null || !dku4.d(dko2))) {
                throw new MslInternalException("Peer user ID token must be bound to a peer master token.");
            }
            if (dku3 != null) {
                this.p = dku3.e();
            } else {
                this.p = null;
            }
            for (dkQ dkq : unmodifiableSet) {
                if (dkq.c() && (dko == null || !dkq.c(dko))) {
                    throw new MslInternalException("Master token bound service tokens must be bound to the provided master token.");
                }
                if (dkq.f() && ((dku2 = this.u) == null || !dkq.b(dku2))) {
                    throw new MslInternalException("User ID token bound service tokens must be bound to the provided user ID token.");
                }
            }
            for (dkQ dkq2 : this.k) {
                if (dkq2.c() && (dko2 == null || !dkq2.c(dko2))) {
                    throw new MslInternalException("Master token bound peer service tokens must be bound to the provided peer master token.");
                }
                if (dkq2.f() && ((dku = this.l) == null || !dkq2.b(dku))) {
                    throw new MslInternalException("User ID token bound peer service tokens must be bound to the provided peer user ID token.");
                }
            }
            try {
                AbstractC8399dkd e2 = mslContext.e();
                C8401dkf e3 = e2.e();
                this.d = e3;
                if (str != null) {
                    e3.e("sender", str);
                }
                e3.e("timestamp", this.r);
                e3.e("messageid", Long.valueOf(this.n));
                e3.e("nonreplayable", Boolean.valueOf(this.f13854o != null));
                Long l = this.f13854o;
                if (l != null) {
                    e3.e("nonreplayableid", l);
                }
                e3.e("renewable", Boolean.valueOf(this.q));
                e3.e("handshake", Boolean.valueOf(this.i));
                C8421dkz c8421dkz = this.g;
                if (c8421dkz != null) {
                    e3.e("capabilities", c8421dkz);
                }
                C8421dkz c8421dkz2 = this.g;
                C8404dki b = e2.b(c8421dkz2 != null ? c8421dkz2.d() : null);
                if (this.f.size() > 0) {
                    e3.e("keyrequestdata", C8403dkh.a(e2, b, this.f));
                }
                AbstractC8420dky abstractC8420dky2 = this.j;
                if (abstractC8420dky2 != null) {
                    e3.e("keyresponsedata", abstractC8420dky2);
                }
                AbstractC8424dlb abstractC8424dlb = this.t;
                if (abstractC8424dlb != null) {
                    e3.e("userauthdata", abstractC8424dlb);
                }
                dkU dku5 = this.u;
                if (dku5 != null) {
                    e3.e("useridtoken", dku5);
                }
                if (this.s.size() > 0) {
                    e3.e("servicetokens", C8403dkh.a(e2, b, this.s));
                }
                dkO dko3 = this.m;
                if (dko3 != null) {
                    e3.e("peermastertoken", dko3);
                }
                dkU dku6 = this.l;
                if (dku6 != null) {
                    e3.e("peeruseridtoken", dku6);
                }
                if (this.k.size() > 0) {
                    e3.e("peerservicetokens", C8403dkh.a(e2, b, this.k));
                }
                if (this.e != null) {
                    AbstractC8393djy d = mslContext.h().d(this.e);
                    if (d != null) {
                        this.a = d;
                        return;
                    } else if (!this.e.f() || !this.e.g()) {
                        throw new MslMasterTokenException(C8373dje.aK, this.e).b(this.u).a(this.t).a(this.n);
                    } else {
                        this.a = new djB(mslContext, this.e);
                        return;
                    }
                }
                try {
                    djI a2 = this.c.a();
                    djK d2 = mslContext.d(a2);
                    if (d2 == null) {
                        throw new MslEntityAuthException(C8373dje.p, a2.c());
                    }
                    this.a = d2.e(mslContext, this.c);
                } catch (MslCryptoException e4) {
                    e4.d(this.c);
                    e4.b(this.u);
                    e4.a(this.t);
                    e4.a(this.n);
                    throw e4;
                } catch (MslEntityAuthException e5) {
                    e5.d(this.c);
                    e5.b(this.u);
                    e5.a(this.t);
                    e5.a(this.n);
                    throw e5;
                }
            } catch (MslEncoderException e6) {
                throw new MslEncodingException(C8373dje.bc, "headerdata", e6).e(this.e).d(this.c).b(this.l).a(this.t).a(this.n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        r20 = "keyrequestdata";
        r15 = r32.h().d(r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
        if (r15 != null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r35.f() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r35.g() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        r31.a = new o.djB(r32, r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new com.netflix.msl.MslMasterTokenException(o.C8373dje.aK, r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
        r31.a = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        r21 = "capabilities";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.netflix.msl.MslEntityAuthException] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.netflix.msl.MslCryptoException] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable, com.netflix.msl.MslEntityAuthException] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, com.netflix.msl.MslCryptoException] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.netflix.msl.MslEntityAuthException] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.netflix.msl.MslCryptoException] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o.dkO] */
    /* JADX WARN: Type inference failed for: r3v4, types: [o.dkO] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o.djG] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v4, types: [o.djG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dkG(com.netflix.msl.util.MslContext r32, byte[] r33, o.djG r34, o.dkO r35, byte[] r36, java.util.Map<java.lang.String, o.AbstractC8393djy> r37) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dkG.<init>(com.netflix.msl.util.MslContext, byte[], o.djG, o.dkO, byte[], java.util.Map):void");
    }

    public Date k() {
        if (this.r != null) {
            return new Date(this.r.longValue() * 1000);
        }
        return null;
    }

    @Override // o.InterfaceC8400dke
    public byte[] c(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if (this.b.containsKey(c8404dki)) {
            return this.b.get(c8404dki);
        }
        byte[] c = abstractC8399dkd.c(b(abstractC8399dkd, c8404dki), c8404dki);
        this.b.put(c8404dki, c);
        return c;
    }

    @Override // o.InterfaceC8400dke
    public C8401dkf b(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if (this.h.containsKey(c8404dki)) {
            return this.h.get(c8404dki);
        }
        try {
            byte[] a2 = this.a.a(abstractC8399dkd.c(this.d, c8404dki), abstractC8399dkd, c8404dki);
            try {
                byte[] b = this.a.b(a2, abstractC8399dkd, c8404dki);
                C8401dkf e2 = abstractC8399dkd.e();
                dkO dko = this.e;
                if (dko != null) {
                    e2.e("mastertoken", dko);
                }
                djG djg = this.c;
                if (djg != null) {
                    e2.e("entityauthdata", djg);
                }
                e2.e("headerdata", (Object) a2);
                e2.e("signature", (Object) b);
                this.h.put(c8404dki, e2);
                return e2;
            } catch (MslCryptoException e3) {
                throw new MslEncoderException("Error signging the header data.", e3);
            }
        } catch (MslCryptoException e4) {
            throw new MslEncoderException("Error encrypting the header data.", e4);
        }
    }

    public boolean equals(Object obj) {
        djG djg;
        Long l;
        Long l2;
        C8421dkz c8421dkz;
        AbstractC8420dky abstractC8420dky;
        AbstractC8424dlb abstractC8424dlb;
        dkU dku;
        dkO dko;
        dkU dku2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof dkG) {
            dkG dkg = (dkG) obj;
            dkO dko2 = this.e;
            return ((dko2 != null && dko2.equals(dkg.e)) || ((djg = this.c) != null && djg.equals(dkg.c))) && (((l = this.r) != null && l.equals(dkg.r)) || (this.r == null && dkg.r == null)) && this.n == dkg.n && ((((l2 = this.f13854o) != null && l2.equals(dkg.f13854o)) || (this.f13854o == null && dkg.f13854o == null)) && this.q == dkg.q && this.i == dkg.i && ((((c8421dkz = this.g) != null && c8421dkz.equals(dkg.g)) || this.g == dkg.g) && this.f.equals(dkg.f) && ((((abstractC8420dky = this.j) != null && abstractC8420dky.equals(dkg.j)) || this.j == dkg.j) && ((((abstractC8424dlb = this.t) != null && abstractC8424dlb.equals(dkg.t)) || this.t == dkg.t) && ((((dku = this.u) != null && dku.equals(dkg.u)) || this.u == dkg.u) && this.s.equals(dkg.s) && ((((dko = this.m) != null && dko.equals(dkg.m)) || this.m == dkg.m) && ((((dku2 = this.l) != null && dku2.equals(dkg.l)) || this.l == dkg.l) && this.k.equals(dkg.k))))))));
        }
        return false;
    }

    public int hashCode() {
        dkO dko = this.e;
        int hashCode = dko != null ? dko.hashCode() : this.c.hashCode();
        Long l = this.r;
        int hashCode2 = l != null ? l.hashCode() : 0;
        int hashCode3 = Long.valueOf(this.n).hashCode();
        Long l2 = this.f13854o;
        int hashCode4 = l2 != null ? l2.hashCode() : 0;
        int hashCode5 = Boolean.valueOf(this.q).hashCode();
        int hashCode6 = Boolean.valueOf(this.i).hashCode();
        C8421dkz c8421dkz = this.g;
        int hashCode7 = c8421dkz != null ? c8421dkz.hashCode() : 0;
        int hashCode8 = this.f.hashCode();
        AbstractC8420dky abstractC8420dky = this.j;
        int hashCode9 = abstractC8420dky != null ? abstractC8420dky.hashCode() : 0;
        AbstractC8424dlb abstractC8424dlb = this.t;
        int hashCode10 = abstractC8424dlb != null ? abstractC8424dlb.hashCode() : 0;
        dkU dku = this.u;
        int hashCode11 = dku != null ? dku.hashCode() : 0;
        int hashCode12 = this.s.hashCode();
        dkO dko2 = this.m;
        int hashCode13 = dko2 != null ? dko2.hashCode() : 0;
        dkU dku2 = this.l;
        return (((((((((((((hashCode ^ hashCode2) ^ hashCode3) ^ hashCode4) ^ hashCode5) ^ hashCode6) ^ hashCode7) ^ hashCode8) ^ hashCode9) ^ hashCode10) ^ hashCode11) ^ hashCode12) ^ hashCode13) ^ (dku2 != null ? dku2.hashCode() : 0)) ^ this.k.hashCode();
    }
}
