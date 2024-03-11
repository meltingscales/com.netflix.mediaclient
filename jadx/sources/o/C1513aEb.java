package o;

import com.netflix.mediaclient.graphql.models.type.PlaybackBadge;
import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import com.netflix.mediaclient.graphql.models.type.TitleGroupMemberKind;
import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLInteractiveSummary;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.details.WatchStatus;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.PersonSummary;
import com.netflix.model.leafs.RecommendedTrailer;
import com.netflix.model.leafs.TaglineMessage;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.ContentWarning;
import com.netflix.model.leafs.originals.TagSummary;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import o.C1362Yt;
import o.C2278adI;
import o.C2282adM;
import o.C2290adU;
import o.C2560aiQ;
import o.C8632dsu;
import o.InterfaceC1593aHa;
import org.chromium.net.NetError;

/* renamed from: o.aEb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1513aEb implements InterfaceC5198buI {
    private final C1362Yt.G c;
    private final C1512aEa e;

    /* renamed from: o.aEb$c */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ThumbRating.values().length];
            try {
                iArr[ThumbRating.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThumbRating.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThumbRating.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ThumbRating.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ThumbRating.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            e = iArr;
            int[] iArr2 = new int[VideoType.values().length];
            try {
                iArr2[VideoType.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VideoType.MOVIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            d = iArr2;
        }
    }

    public C1513aEb(C1362Yt.G g, C1512aEa c1512aEa) {
        C8632dsu.c((Object) g, "");
        this.c = g;
        this.e = c1512aEa;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return String.valueOf(this.c.v());
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String u = this.c.u();
        return u == null ? "" : u;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        String A = this.c.A();
        if (C8632dsu.c((Object) A, (Object) C2988aqU.e.c().b())) {
            return VideoType.MOVIE;
        }
        if (C8632dsu.c((Object) A, (Object) C3226auv.e.e().b())) {
            return VideoType.SHOW;
        }
        if (C8632dsu.c((Object) A, (Object) C2879aoR.b.c().b())) {
            return VideoType.EPISODE;
        }
        if (C8632dsu.c((Object) A, (Object) C3215auk.e.e().b())) {
            return VideoType.SEASON;
        }
        if (C8632dsu.c((Object) A, (Object) C3180auA.c.b().b())) {
            return VideoType.SUPPLEMENTAL;
        }
        String A2 = this.c.A();
        throw new IllegalArgumentException("We don't expect different video type here. Gotten: " + A2);
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.c.w();
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isOriginal() {
        return C8632dsu.c(this.c.h(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return C8632dsu.c(this.c.D(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        boolean c2 = C8632dsu.c(this.c.B(), Boolean.TRUE);
        C1362Yt.y l = this.c.l();
        return l != null ? c2 && l.b() != null : c2;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return C8632dsu.c(this.c.G(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        C1362Yt.e d = this.c.d();
        if (d != null) {
            return d.c();
        }
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        C1362Yt.e d = this.c.d();
        if (d != null) {
            return d.e();
        }
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5158btV
    public int getUserThumbRating() {
        ThumbRating s = this.c.s();
        int i = s == null ? -1 : c.e[s.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating.b.e();
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating.c.e();
                    }
                    return com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating.e.e();
                }
                return com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating.a.e();
            }
            return com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating.b.e();
        }
        return com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating.b.e();
    }

    @Override // o.InterfaceC5158btV, com.netflix.model.leafs.PostPlayItem
    public int getMatchPercentage() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5187bty
    public boolean ar() {
        List<PlaybackBadge> o2 = this.c.o();
        if (o2 != null) {
            return o2.contains(PlaybackBadge.n);
        }
        return false;
    }

    @Override // o.InterfaceC5187bty
    public boolean aw() {
        List<PlaybackBadge> o2 = this.c.o();
        if (o2 != null) {
            return o2.contains(PlaybackBadge.f13180o);
        }
        return false;
    }

    @Override // o.InterfaceC5187bty
    public boolean al() {
        List<PlaybackBadge> o2 = this.c.o();
        if (o2 != null) {
            return o2.contains(PlaybackBadge.a);
        }
        return false;
    }

    @Override // o.InterfaceC5187bty
    public boolean ai() {
        List<PlaybackBadge> o2 = this.c.o();
        if (o2 != null) {
            return o2.contains(PlaybackBadge.d);
        }
        return false;
    }

    @Override // o.InterfaceC5187bty
    public boolean av() {
        List<PlaybackBadge> o2 = this.c.o();
        if (o2 != null) {
            return o2.contains(PlaybackBadge.k);
        }
        return false;
    }

    @Override // o.InterfaceC5187bty
    public boolean an() {
        List<PlaybackBadge> o2 = this.c.o();
        if (o2 != null) {
            return o2.contains(PlaybackBadge.h);
        }
        return false;
    }

    @Override // o.InterfaceC5187bty
    public boolean aj() {
        List<PlaybackBadge> o2 = this.c.o();
        if (o2 != null) {
            return o2.contains(PlaybackBadge.e);
        }
        return false;
    }

    @Override // o.InterfaceC5187bty
    public boolean ak() {
        List<PlaybackBadge> o2 = this.c.o();
        if (o2 != null) {
            return o2.contains(PlaybackBadge.f);
        }
        return false;
    }

    @Override // o.InterfaceC5173btk
    public String bM_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5183btu
    public String k() {
        C2278adI.d e = this.c.a().e();
        if (e != null) {
            return e.b();
        }
        return null;
    }

    @Override // o.InterfaceC5198buI
    public int ag() {
        Integer m = this.c.m();
        if (m != null) {
            return m.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5198buI
    public String ab() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public ContextualText e(ContextualText.TextContext textContext) {
        return aDE.e.e(textContext, this.c.j());
    }

    @Override // o.InterfaceC5198buI
    public String R() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String bP_() {
        String d;
        List<PersonSummary> bO_ = bO_();
        if (bO_ != null) {
            d = C8576dqs.d(bO_, null, null, null, 0, null, new drM<PersonSummary, CharSequence>() { // from class: com.netflix.mediaclient.graphqlrepo.transformers.GraphQLDpVideo$getActors$1
                @Override // o.drM
                /* renamed from: a */
                public final CharSequence invoke(PersonSummary personSummary) {
                    C8632dsu.c((Object) personSummary, "");
                    return personSummary.getPersonName();
                }
            }, 31, null);
            return d;
        }
        return null;
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> bO_() {
        C1362Yt.C1363a b = this.c.b();
        return b(b != null ? b.a() : null);
    }

    private final List<PersonSummary> b(C2290adU c2290adU) {
        List<C2290adU.b> b;
        int d;
        List<PersonSummary> n;
        C2290adU.c e;
        C2290adU.c e2;
        C2290adU.c e3;
        if (c2290adU == null || (b = c2290adU.b()) == null) {
            return null;
        }
        d = C8572dqo.d(b, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C2290adU.b bVar : b) {
            int c2 = (bVar == null || (e3 = bVar.e()) == null) ? -1 : e3.c();
            String a = (bVar == null || (e2 = bVar.e()) == null) ? null : e2.a();
            String str = "";
            if (a == null) {
                a = "";
            }
            String d2 = (bVar == null || (e = bVar.e()) == null) ? null : e.d();
            if (d2 != null) {
                str = d2;
            }
            arrayList.add(new C1533aEv(c2, a, str));
        }
        n = C8576dqs.n(arrayList);
        return n;
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> ao_() {
        C1362Yt.h i = this.c.i();
        return b(i != null ? i.b() : null);
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> r() {
        C1362Yt.j g = this.c.g();
        return b(g != null ? g.e() : null);
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> ah() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String v() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public int E() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String Y() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<TaglineMessage> aa() {
        int d;
        List<TaglineMessage> n;
        List<C2560aiQ.c> d2 = this.c.p().d();
        if (d2 != null) {
            d = C8572dqo.d(d2, 10);
            ArrayList arrayList = new ArrayList(d);
            for (C2560aiQ.c cVar : d2) {
                arrayList.add(new aER(cVar));
            }
            n = C8576dqs.n(arrayList);
            return n;
        }
        return null;
    }

    @Override // o.InterfaceC5198buI
    public boolean au() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean F() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean aU_() {
        Boolean C = this.c.C();
        if (C != null) {
            return C.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5198buI
    public boolean ao() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public WatchStatus B_() {
        return C1539aFa.e(this.c.y());
    }

    @Override // o.InterfaceC5198buI
    public boolean am() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean M() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String p() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public boolean ap() {
        return C8632dsu.c(this.c.z(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5198buI
    public boolean aq() {
        return C8632dsu.c(this.c.F(), Boolean.TRUE);
    }

    @Override // o.InterfaceC5198buI
    public String D() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String c() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String m() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5160btX aE_() {
        InterfaceC5160btX l = l();
        if (l == null) {
            InterfaceC5160btX g = g();
            if (g == null) {
                aDH adh = new aDH(this.c);
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                VideoType type = getType();
                String id = getId();
                aVar.a("Video has neither Show nor Movie type, so can't figure out Playable interface: current type is " + type + ", id: " + id);
                return adh;
            }
            return g;
        }
        return l;
    }

    private final InterfaceC5160btX g() {
        C1362Yt.v n = this.c.n();
        if (n != null) {
            return new aDN(this.c, n.c(), n.a());
        }
        return null;
    }

    private final InterfaceC5160btX l() {
        C1362Yt.y l = this.c.l();
        if (l != null) {
            InterfaceC5160btX e = e(l);
            return e == null ? new aDH(this.c) : e;
        }
        return null;
    }

    private final InterfaceC5160btX e(C1362Yt.y yVar) {
        C1362Yt.C1367f b = yVar.b();
        if (b != null) {
            return new aDJ(b, new aDN(this.c, b.a(), b.d()));
        }
        return null;
    }

    @Override // o.InterfaceC5198buI
    public String Z() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String af() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String w() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String ad() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public VideoInfo.Sharing X() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<Advisory> e() {
        List<Advisory> f;
        C2278adI.d e = this.c.a().e();
        if (e != null) {
            f = C8569dql.f(aDD.e.c(e));
            return f;
        }
        return null;
    }

    @Override // o.InterfaceC5198buI
    public InteractiveSummary az_() {
        return new GraphQLInteractiveSummary(this.c.f());
    }

    @Override // o.InterfaceC5198buI
    public boolean as() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public ContentWarning o() {
        C2282adM.a c2 = this.c.c().c();
        if (c2 != null) {
            return new aDC(c2);
        }
        return null;
    }

    @Override // o.InterfaceC5198buI
    public List<TagSummary> ac() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<GenreItem> I() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public List<GenreItem> z() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String q() {
        List<Integer> E = this.c.E();
        if (E != null) {
            if (E.contains(81173845)) {
                return "RYAN_MURPHY";
            }
            if (E.contains(81349039)) {
                return "SHONDALAND";
            }
        }
        return null;
    }

    @Override // o.InterfaceC5198buI
    public VideoInfo.TimeCodes B() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String ae() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5182btt bQ_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public SupplementalMessageType A_() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5198buI
    public String j() {
        C1362Yt.C1366d e = this.c.e();
        if (e == null || !C8632dsu.c(e.d(), Boolean.TRUE)) {
            return null;
        }
        return e.e();
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5198buI K() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5197buH
    public String T() {
        C1362Yt.A q;
        C1362Yt.A q2 = this.c.q();
        if (q2 == null || !C8632dsu.c(q2.a(), Boolean.TRUE) || (q = this.c.q()) == null) {
            return null;
        }
        return q.e();
    }

    @Override // o.InterfaceC5198buI
    public String U() {
        C1362Yt.A q = this.c.q();
        if (q != null) {
            return q.e();
        }
        return null;
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5194buE P() {
        C1362Yt.y l = this.c.l();
        if (l != null) {
            return new aDR(this, l);
        }
        return null;
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5238buw Q() {
        C1362Yt.v n = this.c.n();
        if (n != null) {
            return new aDO(this, n);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = o.C8576dqs.G(r0);
     */
    @Override // o.InterfaceC5201buL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.InterfaceC5196buG J() {
        /*
            r4 = this;
            o.Yt$G r0 = r4.c
            java.util.List r0 = r0.r()
            r1 = 0
            if (r0 == 0) goto L2b
            java.util.List r0 = o.C8570dqm.e(r0)
            if (r0 == 0) goto L2b
            int r2 = r4.h()
            o.aEa r3 = r4.e
            if (r3 == 0) goto L21
            o.Yt$n r3 = r3.e()
            if (r3 == 0) goto L21
            java.lang.String r1 = r3.a()
        L21:
            if (r1 != 0) goto L25
            java.lang.String r1 = ""
        L25:
            o.aDX r3 = new o.aDX
            r3.<init>(r0, r2, r1)
            r1 = r3
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1513aEb.J():o.buG");
    }

    @Override // o.InterfaceC5201buL
    public RecommendedTrailer O() {
        C1362Yt.x k = this.c.k();
        if (k != null) {
            return new aDS(k);
        }
        return null;
    }

    private final int h() {
        int i = c.d[getType().ordinal()];
        if (i != 1) {
            return i != 2 ? NetError.ERR_QUIC_CERT_ROOT_NOT_KNOWN : b(this.e);
        }
        return c(this.e);
    }

    private final int c(C1512aEa c1512aEa) {
        if (c1512aEa != null) {
            if (c1512aEa.d() > 0) {
                return c1512aEa.d();
            }
            if (c1512aEa.c() > 0) {
                return c1512aEa.c();
            }
        }
        return NetError.ERR_QUIC_CERT_ROOT_NOT_KNOWN;
    }

    private final int b(C1512aEa c1512aEa) {
        if (c1512aEa != null) {
            if (c1512aEa.a() > 0) {
                return c1512aEa.a();
            }
            if (c1512aEa.b() > 0) {
                return c1512aEa.b();
            }
        }
        return NetError.ERR_QUIC_CERT_ROOT_NOT_KNOWN;
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5199buJ S() {
        C1362Yt.n e;
        C1362Yt.z t = this.c.t();
        String str = null;
        if (t != null) {
            C1512aEa c1512aEa = this.e;
            int i = c1512aEa != null ? c1512aEa.i() : NetError.ERR_QUIC_CERT_ROOT_NOT_KNOWN;
            C1512aEa c1512aEa2 = this.e;
            if (c1512aEa2 != null && (e = c1512aEa2.e()) != null) {
                str = e.a();
            }
            return new C1516aEe(t, i, str);
        }
        return null;
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5202buM L() {
        Object obj;
        C1362Yt.n e;
        List<C1362Yt.I> x = this.c.x();
        String str = null;
        if (x != null) {
            Iterator<T> it = x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C1362Yt.I i = (C1362Yt.I) obj;
                if (i.a() != TitleGroupMemberKind.b) {
                    if (i.a() == TitleGroupMemberKind.a) {
                        break;
                    }
                } else {
                    break;
                }
            }
            C1362Yt.I i2 = (C1362Yt.I) obj;
            if (i2 != null) {
                C1512aEa c1512aEa = this.e;
                if (c1512aEa != null && (e = c1512aEa.e()) != null) {
                    str = e.a();
                }
                return new aDW(i2, str);
            }
            return null;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C8632dsu.c(C1513aEb.class, obj != null ? obj.getClass() : null)) {
            C8632dsu.d(obj);
            C1513aEb c1513aEb = (C1513aEb) obj;
            return C8632dsu.c(this.c, c1513aEb.c) && C8632dsu.c(this.e, c1513aEb.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        C1512aEa c1512aEa = this.e;
        return (hashCode * 31) + (c1512aEa != null ? c1512aEa.hashCode() : 0);
    }
}
