package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.branches.SummarizedList;
import com.netflix.model.leafs.BookmarkImpl;
import com.netflix.model.leafs.KidsCharacter;
import com.netflix.model.leafs.TrackableListSummaryImpl;
import com.netflix.model.leafs.Video;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.diK  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8326diK extends AbstractC8316diA implements InterfaceC5230buo, InterfaceC5160btX {
    private static final Comparator<C8329diN> d = new Comparator<C8329diN>() { // from class: o.diK.3
        @Override // java.util.Comparator
        /* renamed from: d */
        public int compare(C8329diN c8329diN, C8329diN c8329diN2) {
            if (c8329diN.ag() < c8329diN2.ag()) {
                return 1;
            }
            return c8329diN.ag() > c8329diN2.ag() ? -1 : 0;
        }
    };
    public IF a;
    public KidsCharacter.Summary b;
    public SummarizedList<IF, TrackableListSummaryImpl> e;
    private Video.Advisories h;

    @Override // o.InterfaceC5160btX
    public VideoInfo.TimeCodes B() {
        return null;
    }

    @Override // o.InterfaceC5160btX
    public boolean F() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean G() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean M() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean N() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean aU_() {
        return false;
    }

    @Override // o.InterfaceC5160btX
    public CreditMarks ap_() {
        return null;
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        return null;
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        return null;
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        return false;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return false;
    }

    @Override // o.InterfaceC5230buo
    public VideoInfo.KidsSummary w() {
        return this.b;
    }

    public C8326diK(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        super(interfaceC1240Ub);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1895282426:
                if (str.equals("volatileBitmaskedDetails")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1857640538:
                if (str.equals("summary")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1570019120:
                if (str.equals("brandAndGenreBadge")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1551264767:
                if (str.equals("storyImgUrl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1335224239:
                if (str.equals("detail")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1217996834:
                if (str.equals("horzDispUrl")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1136616012:
                if (str.equals("hasWatched")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1074358944:
                if (str.equals("topTenBoxart")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1033785764:
                if (str.equals("maturityRatingInfo")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -938102371:
                if (str.equals("rating")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -648601833:
                if (str.equals("advisories")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -632946216:
                if (str.equals("episodes")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -493460419:
                if (str.equals("percentThumbsUp")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -312704424:
                if (str.equals("recommendedTrailer")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -280837022:
                if (str.equals("watchNext")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -221640198:
                if (str.equals("taglineMessages")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 3552281:
                if (str.equals("tags")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 136285222:
                if (str.equals("offlineAvailable")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 697305376:
                if (str.equals("synopsisDP")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1408187533:
                if (str.equals("titleTreatmentUnbranded")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1926204140:
                if (str.equals("inQueue")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2005378358:
                if (str.equals("bookmark")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case 11:
            case '\f':
            case '\r':
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return IJ.b();
            case 1:
                return this.b;
            case '\n':
                return this.h;
            case 14:
                return this.a;
            case 16:
                return this.e;
            default:
                throw new IllegalStateException("Can't get node for key: " + str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        char c;
        InterfaceC8322diG b = b(str);
        if (b != null) {
            return b;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1895282426:
                if (str.equals("volatileBitmaskedDetails")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1857640538:
                if (str.equals("summary")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1570019120:
                if (str.equals("brandAndGenreBadge")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1551264767:
                if (str.equals("storyImgUrl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1335224239:
                if (str.equals("detail")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1217996834:
                if (str.equals("horzDispUrl")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1136616012:
                if (str.equals("hasWatched")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1033785764:
                if (str.equals("maturityRatingInfo")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -938102371:
                if (str.equals("rating")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -648601833:
                if (str.equals("advisories")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -632946216:
                if (str.equals("episodes")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -280837022:
                if (str.equals("watchNext")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 136285222:
                if (str.equals("offlineAvailable")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1408187533:
                if (str.equals("titleTreatmentUnbranded")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1926204140:
                if (str.equals("inQueue")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2005378358:
                if (str.equals("bookmark")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\n':
            case '\r':
            case 14:
            case 15:
            case 16:
                return IJ.b();
            case 1:
                KidsCharacter.Summary summary = new KidsCharacter.Summary();
                this.b = summary;
                return summary;
            case '\t':
                Video.Advisories advisories = new Video.Advisories();
                this.h = advisories;
                return advisories;
            case 11:
                IF r3 = new IF();
                this.a = r3;
                return r3;
            case '\f':
                SummarizedList<IF, TrackableListSummaryImpl> summarizedList = new SummarizedList<>(C8370djb.n, C8370djb.C);
                this.e = summarizedList;
                return summarizedList;
            default:
                throw new IllegalStateException("Can't create node for key: " + str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1857640538:
                if (str.equals("summary")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -648601833:
                if (str.equals("advisories")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -280837022:
                if (str.equals("watchNext")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.b = (KidsCharacter.Summary) interfaceC8322diG;
        } else if (c == 1) {
            this.h = (Video.Advisories) interfaceC8322diG;
        } else if (c != 2) {
            if (c != 3) {
                return;
            }
            this.e = (SummarizedList) interfaceC8322diG;
        } else if (interfaceC8322diG instanceof IF) {
            this.a = (IF) interfaceC8322diG;
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        d(str, null);
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        KidsCharacter.Summary summary = this.b;
        if (summary == null) {
            return null;
        }
        return summary.getBoxshotUrl();
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        KidsCharacter.Summary summary = this.b;
        if (summary == null) {
            return null;
        }
        return summary.getBoxartId();
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        KidsCharacter.Summary summary = this.b;
        return summary == null ? VideoType.UNKNOWN : summary.getType();
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        KidsCharacter.Summary summary = this.b;
        if (summary == null) {
            return null;
        }
        return summary.getUnifiedEntityId();
    }

    public String O() {
        KidsCharacter.Summary summary = this.b;
        if (summary == null) {
            return null;
        }
        return summary.getId();
    }

    @Override // o.InterfaceC5230buo
    public String i() {
        KidsCharacter.Summary summary = this.b;
        if (summary == null) {
            return null;
        }
        return summary.getTitle();
    }

    @Override // o.InterfaceC5230buo
    public String J() {
        KidsCharacter.Summary summary = this.b;
        if (summary == null) {
            return null;
        }
        return summary.getStoryArtUrl();
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        C8329diN L = L();
        if (L == null) {
            return false;
        }
        return L.d();
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return d();
    }

    @Override // o.InterfaceC5230buo
    public InterfaceC5281bvm y() {
        SummarizedList<IF, TrackableListSummaryImpl> summarizedList = this.e;
        if (summarizedList != null) {
            return summarizedList.b();
        }
        return null;
    }

    @Override // o.InterfaceC5230buo
    public List<InterfaceC5223buh> f() {
        if (C8168dfL.g(O())) {
            C1044Mm.d("FalkorKidsCharacter", "getGallery() kidsCharacterId is null");
            return Collections.EMPTY_LIST;
        }
        List<I> c = cn_().c(C0956Jb.a(O()));
        ArrayList arrayList = new ArrayList(c.size());
        ArrayList arrayList2 = new ArrayList(c.size());
        for (I i : c) {
            if (VideoType.SHOW.equals(i.getType())) {
                arrayList.add(i);
            } else if (VideoType.MOVIE.equals(i.getType())) {
                arrayList2.add(i);
            } else {
                C1044Mm.j("FalkorKidsCharacter", String.format("unexpected videoType=%s in getGallery", i.getType()));
            }
        }
        Comparator<C8329diN> comparator = d;
        Collections.sort(arrayList, comparator);
        Collections.sort(arrayList2, comparator);
        ArrayList arrayList3 = new ArrayList(c.size());
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    private InterfaceC5160btX Q() {
        return L();
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return O();
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        return i();
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        if (L() == null) {
            return null;
        }
        return L().getId();
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        if (L() == null) {
            return null;
        }
        return L().getTitle();
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return L() != null && L().aT();
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        if (S() == null) {
            return 0L;
        }
        return S().getLastModified();
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return C8175dfS.b(S() == null ? 0L : S().getBookmarkPositionMs(), av_(), aJ_());
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        if (S() == null) {
            return 0L;
        }
        return S().getBookmarkPositionMs();
    }

    @Override // o.InterfaceC5160btX
    public String aC_() {
        if (!VideoType.EPISODE.equals(W()) || U() == null) {
            return null;
        }
        return U().aQ();
    }

    @Override // o.InterfaceC5160btX
    public String aO_() {
        if (!VideoType.EPISODE.equals(W()) || U() == null) {
            return null;
        }
        return U().cd_();
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        Video.Detail P = P();
        if (P == null) {
            return -1;
        }
        return P.displayRuntime;
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        Video.Detail P = P();
        if (P == null) {
            return -1;
        }
        return P.runtime;
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        Video.Detail P = P();
        if (P == null) {
            return -1;
        }
        return P.endtime;
    }

    @Override // o.InterfaceC5160btX
    public int aB_() {
        Video.Detail P = P();
        if (P == null) {
            return 0;
        }
        return P.logicalStart;
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        if (!VideoType.EPISODE.equals(W()) || U() == null) {
            return 0;
        }
        return U().aw_();
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        if (!VideoType.EPISODE.equals(W()) || U() == null) {
            return 0;
        }
        return U().x();
    }

    @Override // o.InterfaceC5160btX
    public int an_() {
        Video.Detail P = P();
        if (P == null) {
            return -1;
        }
        return P.autoPlayMaxCount;
    }

    @Override // o.InterfaceC5160btX
    public boolean aV_() {
        Video.Detail P = P();
        return P != null && P.isNextPlayableEpisode;
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        Video.Detail P = P();
        return P != null && P.isPinProtected;
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        Video.Detail P = P();
        return P != null && P.isPreviewProtected;
    }

    @Override // o.InterfaceC5160btX
    public List<Advisory> e() {
        Video.Advisories advisories = this.h;
        return advisories == null ? new ArrayList(0) : advisories.getAdvisoryList();
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        Video.Detail P = P();
        return P != null && P.isAgeProtected;
    }

    private Video.Detail P() {
        C8329diN L = L();
        if (L == null) {
            return null;
        }
        return L.aI();
    }

    @Override // o.InterfaceC5230buo
    /* renamed from: R */
    public C8329diN L() {
        IF r0 = this.a;
        if (r0 == null) {
            return null;
        }
        return (C8329diN) r0.d(cn_(), C8329diN.class);
    }

    private BookmarkImpl S() {
        C8329diN L = L();
        if (L == null) {
            return null;
        }
        return L.e;
    }

    private C8329diN U() {
        C8329diN L = L();
        if (L == null) {
            return null;
        }
        if (L.getType() != VideoType.EPISODE) {
            InterfaceC1598aHf.a(new C1596aHd("Tried to fetch video " + L.toString() + " of type " + L.getType() + " as an EPISODE.").b(ErrorType.m));
            return null;
        }
        return L;
    }

    public String toString() {
        return "FalkorKidsCharacter [getType()=" + getType() + ", getCharacterId()=" + O() + ", getCharacterTitle()=" + i() + "]";
    }

    private VideoType W() {
        C8329diN L = L();
        return L == null ? VideoType.UNKNOWN : L.getType();
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        if (VideoType.EPISODE.equals(W())) {
            return U() == null ? "" : U().aK_();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        return (!VideoType.EPISODE.equals(W()) || U() == null) ? "" : U().aL_();
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        InterfaceC5160btX Q = Q();
        if (Q != null) {
            return Q.isAvailableToPlay();
        }
        return false;
    }
}
