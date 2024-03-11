package o;

import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.servicemgr.interface_.GameTagRecipe;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.branches.UnsummarizedList;
import com.netflix.model.leafs.Game;
import com.netflix.model.leafs.ListOfTags;
import com.netflix.model.leafs.RecommendedTrailer;
import com.netflix.model.leafs.RecommendedTrailerImpl;
import com.netflix.model.leafs.Video;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.originals.TagSummary;
import java.util.List;

/* renamed from: o.diL  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8327diL extends AbstractC8316diA implements GameDetails {
    public static final e d = new e(null);
    private Game.Summary a;
    private Game.Detail b;
    private Video.Advisories e;
    private RecommendedTrailerImpl f;
    private Video.InQueue g;
    private UnsummarizedList<IH<ListOfTags>> i;

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return true;
    }

    @Override // o.InterfaceC5139btC
    public RecommendedTrailer l() {
        return this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8327diL(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        super(interfaceC1240Ub);
        C8632dsu.c((Object) interfaceC1240Ub, "");
    }

    /* renamed from: o.diL$e */
    /* loaded from: classes5.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("FalkorGame");
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        d(str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r2.equals("titleTreatmentUnbranded") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r2.equals("synopsisDP") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r2.equals("offlineAvailable") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r2.equals("gameAssets") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r2.equals("tags") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
        if (r2.equals("artworkColors") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        if (r2.equals("taglineMessages") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
        if (r2.equals("percentThumbsUp") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
        if (r2.equals("episodes") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
        if (r2.equals("inRemindMeQueue") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ba, code lost:
        if (r2.equals("rating") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
        if (r2.equals("maturityRatingInfo") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cc, code lost:
        if (r2.equals("topTenBoxart") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d5, code lost:
        if (r2.equals("hasWatched") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00de, code lost:
        if (r2.equals("horzDispUrl") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r2.equals("bookmark") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f3, code lost:
        if (r2.equals("storyImgUrl") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fc, code lost:
        if (r2.equals("brandAndGenreBadge") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0111, code lost:
        if (r2.equals("volatileBitmaskedDetails") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0118, code lost:
        return o.IJ.b();
     */
    @Override // o.InterfaceC0943Io
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.InterfaceC8322diG b(java.lang.String r2) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8327diL.b(java.lang.String):o.diG");
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        C8632dsu.c((Object) str, "");
        switch (str.hashCode()) {
            case -1857640538:
                if (str.equals("summary")) {
                    this.a = (Game.Summary) interfaceC8322diG;
                    return;
                }
                return;
            case -1335224239:
                if (str.equals("detail")) {
                    this.b = (Game.Detail) interfaceC8322diG;
                    return;
                }
                return;
            case -648601833:
                if (str.equals("advisories")) {
                    this.e = (Video.Advisories) interfaceC8322diG;
                    return;
                }
                return;
            case -312704424:
                if (str.equals("recommendedTrailer")) {
                    this.f = (RecommendedTrailerImpl) interfaceC8322diG;
                    return;
                }
                return;
            case 637263870:
                if (str.equals("tagsByRecipe")) {
                    this.i = interfaceC8322diG instanceof UnsummarizedList ? (UnsummarizedList) interfaceC8322diG : null;
                    return;
                }
                return;
            case 1926204140:
                if (str.equals("inQueue")) {
                    this.g = interfaceC8322diG instanceof Video.InQueue ? (Video.InQueue) interfaceC8322diG : null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r3.equals("titleTreatmentUnbranded") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r3.equals("synopsisDP") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r3.equals("offlineAvailable") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r3.equals("tags") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r3.equals("taglineMessages") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
        if (r3.equals("percentThumbsUp") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
        if (r3.equals("episodes") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
        if (r3.equals("rating") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cf, code lost:
        if (r3.equals("maturityRatingInfo") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d9, code lost:
        if (r3.equals("topTenBoxart") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
        if (r3.equals("hasWatched") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00eb, code lost:
        if (r3.equals("horzDispUrl") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0108, code lost:
        if (r3.equals("storyImgUrl") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0111, code lost:
        if (r3.equals("brandAndGenreBadge") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012e, code lost:
        if (r3.equals("volatileBitmaskedDetails") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0131, code lost:
        r3 = o.IJ.b();
        o.C8632dsu.a(r3, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0138, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r3.equals("bookmark") == false) goto L65;
     */
    @Override // o.InterfaceC0943Io
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.InterfaceC8322diG e(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8327diL.e(java.lang.String):o.diG");
    }

    @Override // o.InterfaceC5141btE
    public String j() {
        Game.Summary summary = this.a;
        if (summary != null) {
            return summary.getHeroImageUrl();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String G() {
        Game.Summary summary = this.a;
        if (summary != null) {
            return summary.getTitleTreatmentImageUrl();
        }
        return null;
    }

    @Override // o.InterfaceC5185btw
    public String a() {
        Game.Summary summary = this.a;
        if (summary != null) {
            return summary.getGenre();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String B() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String t() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // o.InterfaceC5140btD
    public String k() {
        Game.Summary summary = this.a;
        if (summary != null) {
            return summary.getPackageName();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String z() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String d() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // o.InterfaceC5140btD
    public Integer i() {
        Game.Detail detail = this.b;
        if (detail != null) {
            return detail.getMinAndroidSdkVersion();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public int E() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        Game.Summary summary = this.a;
        if (summary != null) {
            return summary.getBoxshotUrl();
        }
        return null;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        Game.Summary summary = this.a;
        if (summary == null) {
            return "-1";
        }
        C8632dsu.d(summary);
        String str = summary.id;
        C8632dsu.d((Object) str);
        return str;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        Game.Summary summary = this.a;
        if (summary != null) {
            return summary.boxartId;
        }
        return null;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        Game.Summary summary = this.a;
        return summary != null && summary.isAvailableToPlay();
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.GAMES;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        Game.Summary summary = this.a;
        if (summary != null) {
            return summary.getUnifiedEntityId();
        }
        return null;
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        Game.Summary summary = this.a;
        String str = summary != null ? summary.title : null;
        return str == null ? "" : str;
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        Game.Summary summary = this.a;
        return summary != null && summary.isOriginal;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        Game.Summary summary = this.a;
        return summary != null && summary.isAvailableForDownload();
    }

    @Override // o.InterfaceC5146btJ
    public boolean m() {
        Video.InQueue inQueue = this.g;
        if (inQueue != null) {
            return inQueue.inQueue;
        }
        return false;
    }

    @Override // o.InterfaceC5146btJ
    public String g() {
        return getId();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public Integer v() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public Integer x() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String I() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public Integer A() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public List<String> D() {
        Game.Detail detail = this.b;
        if (detail != null) {
            return detail.getModes();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public List<String> c() {
        Game.Detail detail = this.b;
        if (detail != null) {
            return detail.getModes();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public List<String> u() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // o.InterfaceC5185btw
    public List<Advisory> e() {
        List<Advisory> i;
        Video.Advisories advisories = this.e;
        if (advisories == null) {
            i = C8569dql.i();
            return i;
        }
        C8632dsu.d(advisories);
        List<Advisory> advisoryList = advisories.getAdvisoryList();
        C8632dsu.d(advisoryList);
        return advisoryList;
    }

    @Override // o.InterfaceC5185btw
    public String b() {
        Game.Summary summary = this.a;
        if (summary != null) {
            return summary.getCertification();
        }
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public GameDetails.Orientation C() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.GameDetails
    public String q() {
        throw new IllegalStateException("This should never be called, graphql is used".toString());
    }

    @Override // o.InterfaceC5140btD
    public Integer f() {
        Game.Detail detail = this.b;
        if (detail != null) {
            return detail.getMinMemoryGb();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public Integer o() {
        Game.Detail detail = this.b;
        if (detail != null) {
            return detail.getMinNumProcessors();
        }
        return null;
    }

    @Override // o.InterfaceC5140btD
    public String h() {
        Game.Detail detail = this.b;
        if (detail != null) {
            return detail.getAppStoreUrl();
        }
        return null;
    }

    @Override // o.InterfaceC5141btE
    public String n() {
        Game.Detail detail = this.b;
        if (detail != null) {
            return detail.getMotionBillboardVideoId();
        }
        return null;
    }

    @Override // o.InterfaceC5141btE
    public List<TagSummary> e(GameTagRecipe gameTagRecipe) {
        C8632dsu.c((Object) gameTagRecipe, "");
        UnsummarizedList<IH<ListOfTags>> unsummarizedList = this.i;
        IH ih = unsummarizedList != null ? (IH) unsummarizedList.getOrDefault(gameTagRecipe.d(), null) : null;
        if (ih != null) {
            return (ListOfTags) ih.a();
        }
        return null;
    }

    public String toString() {
        String id = getId();
        String unifiedEntityId = getUnifiedEntityId();
        String title = getTitle();
        VideoType type = getType();
        String a = a();
        return "FalkorGame [id=" + id + ", unifiedEntityId=" + unifiedEntityId + ", title=" + title + ", type=" + type + ", genre=" + a + "]";
    }
}
