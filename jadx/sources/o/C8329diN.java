package o;

import androidx.appcompat.widget.ActivityChooserModel;
import com.fasterxml.jackson.core.JsonFactory;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.falkor.BranchMap;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.branches.SummarizedList;
import com.netflix.model.leafs.ArtworkColorsImpl;
import com.netflix.model.leafs.Bookmark;
import com.netflix.model.leafs.BookmarkImpl;
import com.netflix.model.leafs.BrandAndGenreBadgeImpl;
import com.netflix.model.leafs.BulkRaterImagesImpl;
import com.netflix.model.leafs.ContextualTextImpl;
import com.netflix.model.leafs.GameAssetsImpl;
import com.netflix.model.leafs.HorzBillboardArtImpl;
import com.netflix.model.leafs.InteractiveMomentsImpl;
import com.netflix.model.leafs.LogoBrandedHorizontalImpl;
import com.netflix.model.leafs.MaturityRatingDetailsImpl;
import com.netflix.model.leafs.PersonSummary;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayImpression;
import com.netflix.model.leafs.PrePlayExperience;
import com.netflix.model.leafs.PrePlayExperienceImpl;
import com.netflix.model.leafs.PreviewVideoSummary;
import com.netflix.model.leafs.RecommendedTrailer;
import com.netflix.model.leafs.RecommendedTrailerImpl;
import com.netflix.model.leafs.SharingImpl;
import com.netflix.model.leafs.SummaryImpl;
import com.netflix.model.leafs.TaglineMessage;
import com.netflix.model.leafs.TaglineMessagesImpl;
import com.netflix.model.leafs.TallPanelArtImpl;
import com.netflix.model.leafs.TimeCodesImpl;
import com.netflix.model.leafs.TitleTreatmentImpl;
import com.netflix.model.leafs.TopTenBoxartImpl;
import com.netflix.model.leafs.TrackableListSummary;
import com.netflix.model.leafs.TrackableListSummaryImpl;
import com.netflix.model.leafs.Video;
import com.netflix.model.leafs.VideoInfo;
import com.netflix.model.leafs.VolatileBitmaskedDetailsFalkorLeaf;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.RatingDetails;
import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.originals.BillboardSummary;
import com.netflix.model.leafs.originals.BillboardSummaryImpl;
import com.netflix.model.leafs.originals.ContentWarning;
import com.netflix.model.leafs.originals.TagSummary;
import com.netflix.model.leafs.originals.TallPanelAsset;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.chromium.net.ConnectionSubtype;

/* renamed from: o.diN  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8329diN extends AbstractC8316diA implements InterfaceC8366diy {
    private static final long a;
    private static final long b;
    private static final long d;
    private Video.OfflineAvailable A;
    private Video.People B;
    private SummarizedList<IF, TrackableListSummaryImpl> C;
    private Video.MoodTags D;
    private PostPlayImpression E;
    private IF F;
    private Video.RatingInfo G;
    private PrePlayExperienceImpl H;
    private IF I;

    /* renamed from: J  reason: collision with root package name */
    private BranchMap<C8330diO> f13841J;
    private Video.SearchTitle K;
    private RecommendedTrailerImpl L;
    private Video.RemoveFromCw M;
    private SummarizedList<IF, TrackableListSummaryImpl> N;
    private Video.SupplementalVideos O;
    private C8324diI P;
    private SummaryImpl Q;
    private SharingImpl R;
    private SummarizedList<IF, TrackableListSummaryImpl> S;
    private TimeCodesImpl T;
    private TallPanelAsset U;
    private Video.Tags V;
    private TaglineMessagesImpl W;
    private TallPanelArtImpl X;
    private IF Y;
    private TitleTreatmentImpl Z;
    private TopTenBoxartImpl aa;
    private SummarizedList<IF, TrackableListSummaryImpl> ab;
    private TitleTreatmentImpl ac;
    private SummarizedList<IF, TrackableListSummaryImpl> ad;
    private IF ae;
    private VolatileBitmaskedDetailsFalkorLeaf af;
    private InterfaceC5219bud ag;
    private Video.TrickplayBifUrl ah;
    protected BookmarkImpl e;
    private BulkRaterImagesImpl f;
    private BrandAndGenreBadgeImpl g;
    private Video.Advisories h;
    private ArtworkColorsImpl i;
    private BillboardSummaryImpl j;
    private GameAssetsImpl k;
    private Video.Detail l;
    private final Map<ContextualText.TextContext, ContextualText> m;
    private BranchMap<IF> n;

    /* renamed from: o  reason: collision with root package name */
    private Video.Genres f13842o;
    private C8324diI p;
    private HorzBillboardArtImpl q;
    private Video.InQueue r;
    private InterfaceC5219bud s;
    private Video.HasWatched t;
    private Video.IsRestricted u;
    private InteractiveMomentsImpl v;
    private MaturityRatingDetailsImpl w;
    private Video.InRemindMeQueue x;
    private LogoBrandedHorizontalImpl y;
    private C0948It z;

    private SummaryImpl aS() {
        return this.Q;
    }

    @Override // o.InterfaceC5160btX
    public VideoInfo.TimeCodes B() {
        return this.T;
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5196buG J() {
        return this;
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5202buM L() {
        return this;
    }

    @Override // o.InterfaceC5201buL
    public InterfaceC5199buJ S() {
        return this;
    }

    @Override // o.InterfaceC5198buI
    public VideoInfo.Sharing X() {
        return this.R;
    }

    @Override // o.InterfaceC5216bua
    public VideoInfo.TallPanelArt a() {
        return this.X;
    }

    @Override // o.InterfaceC8366diy
    public Bookmark aC() {
        return this.e;
    }

    @Override // o.InterfaceC5179btq
    public InterfaceC5160btX aE_() {
        return this;
    }

    @Override // o.InterfaceC8366diy
    public InterfaceC5223buh aF() {
        return this.Q;
    }

    @Override // o.InterfaceC5192buC
    public PrePlayExperience aG() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Video.Detail aI() {
        return this.l;
    }

    public Video.RemoveFromCw aM() {
        return this.M;
    }

    protected Video.InQueue aN() {
        return this.r;
    }

    public InterfaceC5188btz aO() {
        return this.Q;
    }

    @Override // o.InterfaceC5241buz
    /* renamed from: aP */
    public VolatileBitmaskedDetailsFalkorLeaf cj_() {
        return this.af;
    }

    @Override // o.InterfaceC5160btX
    public boolean aR_() {
        return false;
    }

    @Override // o.InterfaceC5194buE
    public List<InterfaceC5195buF> at() {
        return null;
    }

    @Override // o.InterfaceC5229bun
    public VideoInfo.GameAssets ay() {
        return this.k;
    }

    @Override // o.InterfaceC5217bub
    public VideoInfo.TopTenBoxart b() {
        return this.aa;
    }

    @Override // o.InterfaceC5142btF
    public VideoInfo.HorzBillboardArt bN_() {
        return this.q;
    }

    @Override // o.InterfaceC5198buI
    public InterfaceC5182btt bQ_() {
        return this.f;
    }

    @Override // o.InterfaceC5236buu
    public InterfaceC5231bup bT_() {
        return null;
    }

    @Override // o.InterfaceC5194buE
    public InterfaceC5231bup bW_() {
        return null;
    }

    @Override // o.InterfaceC5160btX
    public boolean bd_() {
        return this.e != null;
    }

    @Override // o.InterfaceC5195buF
    public List<InterfaceC5227bul> cf_() {
        return null;
    }

    @Override // o.InterfaceC5195buF
    public C5239bux cg_() {
        return null;
    }

    @Override // o.InterfaceC5232buq
    public RecommendedTrailer ci_() {
        return this.L;
    }

    @Override // o.InterfaceC5180btr
    public BillboardSummary f() {
        return this.j;
    }

    @Override // o.InterfaceC5221buf
    public RatingDetails n() {
        return this.w;
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b = timeUnit.toMillis(60L);
        a = timeUnit.toMillis(30L);
        d = TimeUnit.HOURS.toMillis(6L);
    }

    public C8329diN(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        super(interfaceC1240Ub);
        this.m = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1969986255:
                if (str.equals("interactiveMoments")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1895282426:
                if (str.equals("volatileBitmaskedDetails")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1857640538:
                if (str.equals("summary")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1779253289:
                if (str.equals("trickplayBifUrl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1722431145:
                if (str.equals("tallPanel")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1570019120:
                if (str.equals("brandAndGenreBadge")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1551264767:
                if (str.equals("storyImgUrl")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1335224239:
                if (str.equals("detail")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1249499312:
                if (str.equals("genres")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1227534494:
                if (str.equals("removeFromCw")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1217996834:
                if (str.equals("horzDispUrl")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1140051721:
                if (str.equals("topNode")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1136616012:
                if (str.equals("hasWatched")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1074358944:
                if (str.equals("topTenBoxart")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1033785764:
                if (str.equals("maturityRatingInfo")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -991808881:
                if (str.equals("people")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -971889268:
                if (str.equals("tallPanelArt")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -938102371:
                if (str.equals("rating")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -908068505:
                if (str.equals("scenes")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -874351399:
                if (str.equals("originalSimilars")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -763643793:
                if (str.equals("inRemindMeQueue")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -648601833:
                if (str.equals("advisories")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -632946216:
                if (str.equals("episodes")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -549710448:
                if (str.equals("searchTitle")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -502236717:
                if (str.equals("horzBillboardArt")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -493460419:
                if (str.equals("percentThumbsUp")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -312704424:
                if (str.equals("recommendedTrailer")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -305754192:
                if (str.equals("moodTags")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -280837022:
                if (str.equals("watchNext")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -221640198:
                if (str.equals("taglineMessages")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -212452732:
                if (str.equals("artworkColors")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -199843784:
                if (str.equals("bulkRaterImages")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -165471106:
                if (str.equals("postPlayExperience")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 3552281:
                if (str.equals("tags")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 10650969:
                if (str.equals("timeCodes")) {
                    c = JsonFactory.DEFAULT_QUOTE_CHAR;
                    break;
                }
                c = 65535;
                break;
            case 40719645:
                if (str.equals("postPlayImpression")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 111504917:
                if (str.equals("gameAssets")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 136285222:
                if (str.equals("offlineAvailable")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 171558476:
                if (str.equals("titleGroups")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 328150596:
                if (str.equals("prePlayVideo")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 374532047:
                if (str.equals("horizontalPreviewVideoSummary")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 456309057:
                if (str.equals("logoBrandedHoriz")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 479193064:
                if (str.equals("similars")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 562885953:
                if (str.equals("prePlayExperience")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 637263870:
                if (str.equals("tagsByRecipe")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 697305376:
                if (str.equals("synopsisDP")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 700897085:
                if (str.equals("verticalPreviewVideoSummary")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 873989413:
                if (str.equals("isRestricted")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 936901554:
                if (str.equals("defaultTrailer")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 1276055968:
                if (str.equals("trailers")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 1306302720:
                if (str.equals("titleTreatment")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 1408187533:
                if (str.equals("titleTreatmentUnbranded")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 1926204140:
                if (str.equals("inQueue")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 1968370160:
                if (str.equals("seasons")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 2005378358:
                if (str.equals("bookmark")) {
                    c = '6';
                    break;
                }
                c = 65535;
                break;
            case 2054222044:
                if (str.equals("sharing")) {
                    c = '7';
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
                return this.v;
            case 1:
                return this.af;
            case 2:
                return this.Q;
            case 3:
                return this.ah;
            case 4:
                return this.U;
            case 5:
                return this.g;
            case 6:
                return this.P;
            case 7:
                return aI();
            case '\b':
                return this.f13842o;
            case '\t':
                return this.M;
            case '\n':
                return this.p;
            case 11:
                return this.Y;
            case '\f':
                return this.t;
            case '\r':
                return this.aa;
            case 14:
                return this.w;
            case 15:
                return this.B;
            case 16:
                return this.X;
            case 17:
                return this.G;
            case 18:
                return this.f13841J;
            case 19:
                return this.C;
            case 20:
                return this.x;
            case 21:
                return this.h;
            case 22:
                return this.n;
            case 23:
                return this.K;
            case 24:
                return this.q;
            case 25:
                return this.z;
            case 26:
                return this.L;
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                return this.D;
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                return this.ae;
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                return this.W;
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                return this.i;
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                return this.f;
            case ' ':
                return this.F;
            case '!':
                return this.V;
            case '\"':
                return this.T;
            case '#':
                return this.E;
            case '$':
                return this.k;
            case '%':
                return this.A;
            case '&':
                return this.ab;
            case '\'':
                return this.I;
            case JSONzip.substringLimit /* 40 */:
                return this.s;
            case ')':
                return this.y;
            case '*':
                return this.S;
            case '+':
                return this.H;
            case ',':
                return IJ.b();
            case '-':
                return this.m.get(ContextualText.TextContext.b);
            case '.':
                return this.ag;
            case '/':
                return this.u;
            case '0':
                return this.O;
            case '1':
                return this.ad;
            case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                return this.ac;
            case '3':
                return this.Z;
            case '4':
                return this.r;
            case '5':
                return this.N;
            case '6':
                return this.e;
            case '7':
                return this.R;
            default:
                throw new IllegalStateException("Can't get node for key: " + str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        char c;
        InterfaceC8322diG b2 = b(str);
        if (b2 != null) {
            return b2;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1969986255:
                if (str.equals("interactiveMoments")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1895282426:
                if (str.equals("volatileBitmaskedDetails")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1857640538:
                if (str.equals("summary")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1779253289:
                if (str.equals("trickplayBifUrl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1722431145:
                if (str.equals("tallPanel")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1570019120:
                if (str.equals("brandAndGenreBadge")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1551264767:
                if (str.equals("storyImgUrl")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1335224239:
                if (str.equals("detail")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1249499312:
                if (str.equals("genres")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1227534494:
                if (str.equals("removeFromCw")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1217996834:
                if (str.equals("horzDispUrl")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1140051721:
                if (str.equals("topNode")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1136616012:
                if (str.equals("hasWatched")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1074358944:
                if (str.equals("topTenBoxart")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1033785764:
                if (str.equals("maturityRatingInfo")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -991808881:
                if (str.equals("people")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -971889268:
                if (str.equals("tallPanelArt")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -938102371:
                if (str.equals("rating")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -908068505:
                if (str.equals("scenes")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -874351399:
                if (str.equals("originalSimilars")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -763643793:
                if (str.equals("inRemindMeQueue")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -648601833:
                if (str.equals("advisories")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -632946216:
                if (str.equals("episodes")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -549710448:
                if (str.equals("searchTitle")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -502236717:
                if (str.equals("horzBillboardArt")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -493460419:
                if (str.equals("percentThumbsUp")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -312704424:
                if (str.equals("recommendedTrailer")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -305754192:
                if (str.equals("moodTags")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -280837022:
                if (str.equals("watchNext")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -221640198:
                if (str.equals("taglineMessages")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -212452732:
                if (str.equals("artworkColors")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -199843784:
                if (str.equals("bulkRaterImages")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -165471106:
                if (str.equals("postPlayExperience")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 3552281:
                if (str.equals("tags")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 10650969:
                if (str.equals("timeCodes")) {
                    c = JsonFactory.DEFAULT_QUOTE_CHAR;
                    break;
                }
                c = 65535;
                break;
            case 40719645:
                if (str.equals("postPlayImpression")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 111504917:
                if (str.equals("gameAssets")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 136285222:
                if (str.equals("offlineAvailable")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 171558476:
                if (str.equals("titleGroups")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 328150596:
                if (str.equals("prePlayVideo")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 374532047:
                if (str.equals("horizontalPreviewVideoSummary")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 456309057:
                if (str.equals("logoBrandedHoriz")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 479193064:
                if (str.equals("similars")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 562885953:
                if (str.equals("prePlayExperience")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 697305376:
                if (str.equals("synopsisDP")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 700897085:
                if (str.equals("verticalPreviewVideoSummary")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 873989413:
                if (str.equals("isRestricted")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 936901554:
                if (str.equals("defaultTrailer")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 1276055968:
                if (str.equals("trailers")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 1306302720:
                if (str.equals("titleTreatment")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 1408187533:
                if (str.equals("titleTreatmentUnbranded")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 1926204140:
                if (str.equals("inQueue")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 1968370160:
                if (str.equals("seasons")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 2005378358:
                if (str.equals("bookmark")) {
                    c = '5';
                    break;
                }
                c = 65535;
                break;
            case 2054222044:
                if (str.equals("sharing")) {
                    c = '6';
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
                InteractiveMomentsImpl interactiveMomentsImpl = new InteractiveMomentsImpl();
                this.v = interactiveMomentsImpl;
                return interactiveMomentsImpl;
            case 1:
                VolatileBitmaskedDetailsFalkorLeaf volatileBitmaskedDetailsFalkorLeaf = new VolatileBitmaskedDetailsFalkorLeaf();
                this.af = volatileBitmaskedDetailsFalkorLeaf;
                return volatileBitmaskedDetailsFalkorLeaf;
            case 2:
                SummaryImpl summaryImpl = new SummaryImpl();
                this.Q = summaryImpl;
                return summaryImpl;
            case 3:
                Video.TrickplayBifUrl trickplayBifUrl = new Video.TrickplayBifUrl();
                this.ah = trickplayBifUrl;
                return trickplayBifUrl;
            case 4:
                TallPanelAsset tallPanelAsset = new TallPanelAsset();
                this.U = tallPanelAsset;
                return tallPanelAsset;
            case 5:
                BrandAndGenreBadgeImpl brandAndGenreBadgeImpl = new BrandAndGenreBadgeImpl();
                this.g = brandAndGenreBadgeImpl;
                return brandAndGenreBadgeImpl;
            case 6:
                C8324diI c8324diI = new C8324diI();
                this.P = c8324diI;
                return c8324diI;
            case 7:
                Video.Detail detail = new Video.Detail();
                this.l = detail;
                return detail;
            case '\b':
                Video.Genres genres = new Video.Genres();
                this.f13842o = genres;
                return genres;
            case '\t':
                Video.RemoveFromCw removeFromCw = new Video.RemoveFromCw();
                this.M = removeFromCw;
                return removeFromCw;
            case '\n':
                C8324diI c8324diI2 = new C8324diI();
                this.p = c8324diI2;
                return c8324diI2;
            case 11:
                IF r3 = new IF();
                this.Y = r3;
                return r3;
            case '\f':
                Video.HasWatched hasWatched = new Video.HasWatched();
                this.t = hasWatched;
                return hasWatched;
            case '\r':
                TopTenBoxartImpl topTenBoxartImpl = new TopTenBoxartImpl();
                this.aa = topTenBoxartImpl;
                return topTenBoxartImpl;
            case 14:
                MaturityRatingDetailsImpl maturityRatingDetailsImpl = new MaturityRatingDetailsImpl();
                this.w = maturityRatingDetailsImpl;
                return maturityRatingDetailsImpl;
            case 15:
                Video.People people = new Video.People();
                this.B = people;
                return people;
            case 16:
                TallPanelArtImpl tallPanelArtImpl = new TallPanelArtImpl();
                this.X = tallPanelArtImpl;
                return tallPanelArtImpl;
            case 17:
                Video.RatingInfo ratingInfo = new Video.RatingInfo();
                this.G = ratingInfo;
                return ratingInfo;
            case 18:
                BranchMap<C8330diO> branchMap = new BranchMap<>(C8370djb.j(this.c));
                this.f13841J = branchMap;
                return branchMap;
            case 19:
                SummarizedList<IF, TrackableListSummaryImpl> summarizedList = new SummarizedList<>(C8370djb.n, C8370djb.C);
                this.C = summarizedList;
                return summarizedList;
            case 20:
                Video.InRemindMeQueue inRemindMeQueue = new Video.InRemindMeQueue();
                this.x = inRemindMeQueue;
                return inRemindMeQueue;
            case 21:
                Video.Advisories advisories = new Video.Advisories();
                this.h = advisories;
                return advisories;
            case 22:
                BranchMap<IF> branchMap2 = new BranchMap<>(C8370djb.n);
                this.n = branchMap2;
                return branchMap2;
            case 23:
                Video.SearchTitle searchTitle = new Video.SearchTitle();
                this.K = searchTitle;
                return searchTitle;
            case 24:
                HorzBillboardArtImpl horzBillboardArtImpl = new HorzBillboardArtImpl();
                this.q = horzBillboardArtImpl;
                return horzBillboardArtImpl;
            case 25:
                C0948It c0948It = new C0948It();
                this.z = c0948It;
                return c0948It;
            case 26:
                RecommendedTrailerImpl recommendedTrailerImpl = new RecommendedTrailerImpl();
                this.L = recommendedTrailerImpl;
                return recommendedTrailerImpl;
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                Video.MoodTags moodTags = new Video.MoodTags();
                this.D = moodTags;
                return moodTags;
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                IF r32 = new IF();
                this.ae = r32;
                return r32;
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                TaglineMessagesImpl taglineMessagesImpl = new TaglineMessagesImpl();
                this.W = taglineMessagesImpl;
                return taglineMessagesImpl;
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                ArtworkColorsImpl artworkColorsImpl = new ArtworkColorsImpl();
                this.i = artworkColorsImpl;
                return artworkColorsImpl;
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                BulkRaterImagesImpl bulkRaterImagesImpl = new BulkRaterImagesImpl();
                this.f = bulkRaterImagesImpl;
                return bulkRaterImagesImpl;
            case ' ':
                IF r33 = new IF();
                this.F = r33;
                return r33;
            case '!':
                Video.Tags tags = new Video.Tags();
                this.V = tags;
                return tags;
            case '\"':
                TimeCodesImpl timeCodesImpl = new TimeCodesImpl();
                this.T = timeCodesImpl;
                return timeCodesImpl;
            case '#':
                PostPlayImpression postPlayImpression = new PostPlayImpression();
                this.E = postPlayImpression;
                return postPlayImpression;
            case '$':
                GameAssetsImpl gameAssetsImpl = new GameAssetsImpl();
                this.k = gameAssetsImpl;
                return gameAssetsImpl;
            case '%':
                Video.OfflineAvailable offlineAvailable = new Video.OfflineAvailable();
                this.A = offlineAvailable;
                return offlineAvailable;
            case '&':
                SummarizedList<IF, TrackableListSummaryImpl> summarizedList2 = new SummarizedList<>(C8370djb.n, C8370djb.C);
                this.ab = summarizedList2;
                return summarizedList2;
            case '\'':
                IF r34 = new IF();
                this.I = r34;
                return r34;
            case JSONzip.substringLimit /* 40 */:
                PreviewVideoSummary previewVideoSummary = new PreviewVideoSummary();
                this.s = previewVideoSummary;
                return previewVideoSummary;
            case ')':
                LogoBrandedHorizontalImpl logoBrandedHorizontalImpl = new LogoBrandedHorizontalImpl();
                this.y = logoBrandedHorizontalImpl;
                return logoBrandedHorizontalImpl;
            case '*':
                SummarizedList<IF, TrackableListSummaryImpl> summarizedList3 = new SummarizedList<>(C8370djb.n, C8370djb.C);
                this.S = summarizedList3;
                return summarizedList3;
            case '+':
                PrePlayExperienceImpl prePlayExperienceImpl = new PrePlayExperienceImpl();
                this.H = prePlayExperienceImpl;
                return prePlayExperienceImpl;
            case ',':
                ContextualTextImpl contextualTextImpl = new ContextualTextImpl();
                this.m.put(ContextualText.TextContext.b, contextualTextImpl);
                return contextualTextImpl;
            case '-':
                PreviewVideoSummary previewVideoSummary2 = new PreviewVideoSummary();
                this.ag = previewVideoSummary2;
                return previewVideoSummary2;
            case '.':
                Video.IsRestricted isRestricted = new Video.IsRestricted();
                this.u = isRestricted;
                return isRestricted;
            case '/':
                Video.SupplementalVideos supplementalVideos = new Video.SupplementalVideos();
                this.O = supplementalVideos;
                return supplementalVideos;
            case '0':
                SummarizedList<IF, TrackableListSummaryImpl> summarizedList4 = new SummarizedList<>(C8370djb.n, C8370djb.C);
                this.ad = summarizedList4;
                return summarizedList4;
            case '1':
                TitleTreatmentImpl titleTreatmentImpl = new TitleTreatmentImpl();
                this.ac = titleTreatmentImpl;
                return titleTreatmentImpl;
            case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                TitleTreatmentImpl titleTreatmentImpl2 = new TitleTreatmentImpl();
                this.Z = titleTreatmentImpl2;
                return titleTreatmentImpl2;
            case '3':
                Video.InQueue inQueue = new Video.InQueue();
                this.r = inQueue;
                return inQueue;
            case '4':
                SummarizedList<IF, TrackableListSummaryImpl> summarizedList5 = new SummarizedList<>(C8370djb.n, C8370djb.C);
                this.N = summarizedList5;
                return summarizedList5;
            case '5':
                BookmarkImpl bookmarkImpl = new BookmarkImpl();
                this.e = bookmarkImpl;
                return bookmarkImpl;
            case '6':
                SharingImpl sharingImpl = new SharingImpl();
                this.R = sharingImpl;
                return sharingImpl;
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
            case -1969986255:
                if (str.equals("interactiveMoments")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1895282426:
                if (str.equals("volatileBitmaskedDetails")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1857640538:
                if (str.equals("summary")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1779253289:
                if (str.equals("trickplayBifUrl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1722431145:
                if (str.equals("tallPanel")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1570019120:
                if (str.equals("brandAndGenreBadge")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1551264767:
                if (str.equals("storyImgUrl")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1335224239:
                if (str.equals("detail")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1249499312:
                if (str.equals("genres")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1227534494:
                if (str.equals("removeFromCw")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1217996834:
                if (str.equals("horzDispUrl")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1140051721:
                if (str.equals("topNode")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1136616012:
                if (str.equals("hasWatched")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1113967769:
                if (str.equals("billboardSummary")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1074358944:
                if (str.equals("topTenBoxart")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1033785764:
                if (str.equals("maturityRatingInfo")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -991808881:
                if (str.equals("people")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -971889268:
                if (str.equals("tallPanelArt")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -938102371:
                if (str.equals("rating")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -908068505:
                if (str.equals("scenes")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -874351399:
                if (str.equals("originalSimilars")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -763643793:
                if (str.equals("inRemindMeQueue")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -648601833:
                if (str.equals("advisories")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -632946216:
                if (str.equals("episodes")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -549710448:
                if (str.equals("searchTitle")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -502236717:
                if (str.equals("horzBillboardArt")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -493460419:
                if (str.equals("percentThumbsUp")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case -312704424:
                if (str.equals("recommendedTrailer")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -305754192:
                if (str.equals("moodTags")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case -280837022:
                if (str.equals("watchNext")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -221640198:
                if (str.equals("taglineMessages")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -212452732:
                if (str.equals("artworkColors")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -199843784:
                if (str.equals("bulkRaterImages")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -165471106:
                if (str.equals("postPlayExperience")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 3552281:
                if (str.equals("tags")) {
                    c = JsonFactory.DEFAULT_QUOTE_CHAR;
                    break;
                }
                c = 65535;
                break;
            case 10650969:
                if (str.equals("timeCodes")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 111504917:
                if (str.equals("gameAssets")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 136285222:
                if (str.equals("offlineAvailable")) {
                    c = '%';
                    break;
                }
                c = 65535;
                break;
            case 171558476:
                if (str.equals("titleGroups")) {
                    c = '&';
                    break;
                }
                c = 65535;
                break;
            case 328150596:
                if (str.equals("prePlayVideo")) {
                    c = '\'';
                    break;
                }
                c = 65535;
                break;
            case 374532047:
                if (str.equals("horizontalPreviewVideoSummary")) {
                    c = '(';
                    break;
                }
                c = 65535;
                break;
            case 456309057:
                if (str.equals("logoBrandedHoriz")) {
                    c = ')';
                    break;
                }
                c = 65535;
                break;
            case 479193064:
                if (str.equals("similars")) {
                    c = '*';
                    break;
                }
                c = 65535;
                break;
            case 562885953:
                if (str.equals("prePlayExperience")) {
                    c = '+';
                    break;
                }
                c = 65535;
                break;
            case 697305376:
                if (str.equals("synopsisDP")) {
                    c = ',';
                    break;
                }
                c = 65535;
                break;
            case 700897085:
                if (str.equals("verticalPreviewVideoSummary")) {
                    c = '-';
                    break;
                }
                c = 65535;
                break;
            case 873989413:
                if (str.equals("isRestricted")) {
                    c = '.';
                    break;
                }
                c = 65535;
                break;
            case 936901554:
                if (str.equals("defaultTrailer")) {
                    c = '/';
                    break;
                }
                c = 65535;
                break;
            case 1306302720:
                if (str.equals("titleTreatment")) {
                    c = '0';
                    break;
                }
                c = 65535;
                break;
            case 1408187533:
                if (str.equals("titleTreatmentUnbranded")) {
                    c = '1';
                    break;
                }
                c = 65535;
                break;
            case 1926204140:
                if (str.equals("inQueue")) {
                    c = '2';
                    break;
                }
                c = 65535;
                break;
            case 1968370160:
                if (str.equals("seasons")) {
                    c = '3';
                    break;
                }
                c = 65535;
                break;
            case 2005378358:
                if (str.equals("bookmark")) {
                    c = '4';
                    break;
                }
                c = 65535;
                break;
            case 2054222044:
                if (str.equals("sharing")) {
                    c = '5';
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
                this.v = (InteractiveMomentsImpl) interfaceC8322diG;
                return;
            case 1:
                this.af = (VolatileBitmaskedDetailsFalkorLeaf) interfaceC8322diG;
                return;
            case 2:
                this.Q = (SummaryImpl) interfaceC8322diG;
                return;
            case 3:
                this.ah = (Video.TrickplayBifUrl) interfaceC8322diG;
                return;
            case 4:
                this.U = (TallPanelAsset) interfaceC8322diG;
                return;
            case 5:
                this.g = (BrandAndGenreBadgeImpl) interfaceC8322diG;
                return;
            case 6:
                this.P = (C8324diI) interfaceC8322diG;
                return;
            case 7:
                this.l = (Video.Detail) interfaceC8322diG;
                return;
            case '\b':
                this.f13842o = (Video.Genres) interfaceC8322diG;
                return;
            case '\t':
                this.M = (Video.RemoveFromCw) interfaceC8322diG;
                return;
            case '\n':
                this.p = (C8324diI) interfaceC8322diG;
                return;
            case 11:
                this.Y = IF.b(interfaceC8322diG);
                return;
            case '\f':
                this.t = (Video.HasWatched) interfaceC8322diG;
                return;
            case '\r':
                this.j = (BillboardSummaryImpl) interfaceC8322diG;
                return;
            case 14:
                this.aa = (TopTenBoxartImpl) interfaceC8322diG;
                return;
            case 15:
                this.w = (MaturityRatingDetailsImpl) interfaceC8322diG;
                return;
            case 16:
                this.B = (Video.People) interfaceC8322diG;
                return;
            case 17:
                this.X = (TallPanelArtImpl) interfaceC8322diG;
                return;
            case 18:
                this.G = (Video.RatingInfo) interfaceC8322diG;
                return;
            case 19:
                this.f13841J = (BranchMap) interfaceC8322diG;
                return;
            case 20:
                this.C = (SummarizedList) interfaceC8322diG;
                return;
            case 21:
                this.x = (Video.InRemindMeQueue) interfaceC8322diG;
                return;
            case 22:
                this.h = (Video.Advisories) interfaceC8322diG;
                return;
            case 23:
                this.n = (BranchMap) interfaceC8322diG;
                return;
            case 24:
                this.K = (Video.SearchTitle) interfaceC8322diG;
                return;
            case 25:
                this.q = (HorzBillboardArtImpl) interfaceC8322diG;
                return;
            case 26:
                this.z = (C0948It) interfaceC8322diG;
                return;
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                this.L = (RecommendedTrailerImpl) interfaceC8322diG;
                return;
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                this.D = (Video.MoodTags) interfaceC8322diG;
                return;
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                this.ae = IF.b(interfaceC8322diG);
                return;
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                this.W = (TaglineMessagesImpl) interfaceC8322diG;
                return;
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                this.i = (ArtworkColorsImpl) interfaceC8322diG;
                return;
            case ' ':
                this.f = (BulkRaterImagesImpl) interfaceC8322diG;
                return;
            case '!':
                this.F = IF.b(interfaceC8322diG);
                return;
            case '\"':
                this.V = (Video.Tags) interfaceC8322diG;
                return;
            case '#':
                this.T = (TimeCodesImpl) interfaceC8322diG;
                return;
            case '$':
                this.k = (GameAssetsImpl) interfaceC8322diG;
                return;
            case '%':
                this.A = (Video.OfflineAvailable) interfaceC8322diG;
                return;
            case '&':
                this.ab = (SummarizedList) interfaceC8322diG;
                return;
            case '\'':
                this.I = IF.b(interfaceC8322diG);
                return;
            case JSONzip.substringLimit /* 40 */:
                this.s = (InterfaceC5219bud) interfaceC8322diG;
                return;
            case ')':
                this.y = (LogoBrandedHorizontalImpl) interfaceC8322diG;
                return;
            case '*':
                this.S = (SummarizedList) interfaceC8322diG;
                return;
            case '+':
                this.H = (PrePlayExperienceImpl) interfaceC8322diG;
                return;
            case ',':
                this.m.put(ContextualText.TextContext.b, (ContextualTextImpl) interfaceC8322diG);
                return;
            case '-':
                this.ag = (InterfaceC5219bud) interfaceC8322diG;
                return;
            case '.':
                if (interfaceC8322diG instanceof IJ) {
                    return;
                }
                this.u = (Video.IsRestricted) interfaceC8322diG;
                return;
            case '/':
                this.O = (Video.SupplementalVideos) interfaceC8322diG;
                return;
            case '0':
                this.ac = (TitleTreatmentImpl) interfaceC8322diG;
                return;
            case '1':
                this.Z = (TitleTreatmentImpl) interfaceC8322diG;
                return;
            case ActivityChooserModel.DEFAULT_HISTORY_MAX_LENGTH /* 50 */:
                this.r = (Video.InQueue) interfaceC8322diG;
                return;
            case '3':
                this.N = (SummarizedList) interfaceC8322diG;
                return;
            case '4':
                this.e = (BookmarkImpl) interfaceC8322diG;
                return;
            case '5':
                this.R = (SharingImpl) interfaceC8322diG;
                return;
            default:
                return;
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        d(str, (InterfaceC8322diG) null);
    }

    @Override // o.InterfaceC5198buI
    public boolean au() {
        BranchMap<IF> branchMap;
        long currentTimeMillis = System.currentTimeMillis();
        long aK = aK();
        if (aK <= 0 || aK >= currentTimeMillis) {
            long j = currentTimeMillis - b;
            BookmarkImpl bookmarkImpl = this.e;
            boolean z = bookmarkImpl != null && bookmarkImpl.needsRefresh(j);
            Video.InQueue inQueue = this.r;
            boolean z2 = inQueue != null && inQueue.needsRefresh(j);
            Video.RatingInfo ratingInfo = this.G;
            boolean z3 = ratingInfo != null && ratingInfo.needsRefresh(j);
            ContextualText contextualText = this.m.get(ContextualText.TextContext.b);
            boolean z4 = contextualText != null && contextualText.needsRefresh(j);
            boolean b2 = b(currentTimeMillis - a);
            C0948It c0948It = this.z;
            boolean z5 = c0948It != null && c0948It.needsRefresh(j);
            C1044Mm.c("FalkorVideo", "shouldRefreshVolatileData bookmark=%b, queue=%b, rating=%b topTenNeeds=%b synopsisNeeds=%b percentThumbsUpNeeds=%b", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(b2), Boolean.valueOf(z4), Boolean.valueOf(z5));
            boolean z6 = z || z2 || z3 || b2 || z4 || z5;
            if (!z6 && getType() == VideoType.SHOW && (branchMap = this.n) != null && !branchMap.isEmpty()) {
                InterfaceC8322diG b3 = this.n.b("current");
                SummarizedList<IF, TrackableListSummaryImpl> summarizedList = this.N;
                if (summarizedList == null || (b3 instanceof IH) || (summarizedList.b("current") instanceof IH)) {
                    return true;
                }
                if (b3 instanceof IF) {
                    long j2 = currentTimeMillis - d;
                    boolean needsRefresh = ((IF) b3).needsRefresh(j2);
                    boolean z7 = this.N.b() != null && this.N.b().needsRefresh(j2);
                    C1044Mm.c("FalkorVideo", "shouldRefreshVolatileData currentEpisode=%b, seasonCount=%b", Boolean.valueOf(needsRefresh), Boolean.valueOf(z7));
                    return needsRefresh || z7;
                }
            }
            return z6;
        }
        return true;
    }

    private boolean b(long j) {
        Video.Detail detail = this.l;
        if (detail != null) {
            boolean z = detail.supplementalMessageType == SupplementalMessageType.j;
            TopTenBoxartImpl topTenBoxartImpl = this.aa;
            boolean z2 = (topTenBoxartImpl == null || topTenBoxartImpl.getUrl() == null) ? false : true;
            return z ? this.l.needsRefresh(j) || !z2 : z2;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("FalkorVideo [id=");
        sb.append(getId());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", type=");
        sb.append(getType());
        sb.append(", year=");
        sb.append(ag());
        if (VideoType.MOVIE.equals(getType())) {
            str = "";
        } else {
            str = ", currentEpisodeId=" + bU_();
        }
        sb.append(str);
        sb.append(", bk=");
        sb.append(aq_());
        sb.append("]");
        return sb.toString();
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        SummaryImpl summaryImpl = this.Q;
        if (summaryImpl != null) {
            return summaryImpl.getId();
        }
        Video.Detail detail = this.l;
        return detail != null ? detail.id : "-1";
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String str;
        SummaryImpl summaryImpl = this.Q;
        if (summaryImpl == null || summaryImpl.getTitle() == null) {
            Video.Detail detail = this.l;
            if (detail == null || (str = detail.title) == null) {
                return null;
            }
            return str;
        }
        return this.Q.getTitle();
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        SummaryImpl summaryImpl = this.Q;
        if (summaryImpl == null) {
            return null;
        }
        return summaryImpl.getBoxshotUrl();
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        SummaryImpl summaryImpl = this.Q;
        if (summaryImpl == null) {
            return null;
        }
        return summaryImpl.getBoxartId();
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        String str;
        SummaryImpl summaryImpl = this.Q;
        if (summaryImpl == null || summaryImpl.getType() == null) {
            Video.Detail detail = this.l;
            if (detail != null && (str = detail.type) != null) {
                return VideoType.create(str);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SPY-19129: video id: ");
            sb.append(getId());
            sb.append("; isSummaryNull=");
            boolean z = true;
            sb.append(this.Q == null);
            sb.append("; isDetailNull=");
            sb.append(this.l == null);
            sb.append("; isDetailTypeNull=");
            Video.Detail detail2 = this.l;
            if (detail2 != null && detail2.type != null) {
                z = false;
            }
            sb.append(z);
            InterfaceC1593aHa.b(sb.toString());
            return null;
        }
        return this.Q.getType();
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        SummaryImpl summaryImpl = this.Q;
        if (summaryImpl != null) {
            return summaryImpl.unifiedEntityId;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean aT() {
        Video.Detail detail = this.l;
        return detail != null && detail.isEpisode;
    }

    @Override // o.InterfaceC5173btk
    public String bM_() {
        Video.SearchTitle searchTitle = this.K;
        if (searchTitle != null) {
            return searchTitle.horzDispUrl;
        }
        Video.Detail detail = this.l;
        if (detail != null) {
            return detail.horzDispUrl;
        }
        return null;
    }

    @Override // o.InterfaceC5179btq
    public String w() {
        Video.Detail detail;
        String str;
        if ((!VideoType.EPISODE.equals(getType()) && !VideoType.MOVIE.equals(getType())) || (detail = this.l) == null || (str = detail.interestingUrl) == null) {
            Video.Detail aR = aR();
            if (aR != null) {
                return aR.interestingUrl;
            }
            return null;
        }
        return str;
    }

    @Override // o.InterfaceC5227bul
    public String ca_() {
        Video.Detail detail;
        String str;
        if (!VideoType.EPISODE.equals(getType()) || (detail = this.l) == null || (str = detail.interestingSmallUrl) == null) {
            Video.Detail aR = aR();
            if (aR != null) {
                return aR.interestingSmallUrl;
            }
            return null;
        }
        return str;
    }

    @Override // o.InterfaceC5198buI
    public String ad() {
        Video.Detail detail = this.l;
        if (detail != null) {
            return detail.verticalInterestingUrl;
        }
        return null;
    }

    @Override // o.InterfaceC5176btn
    public String aH_() {
        Video.Detail detail;
        if (VideoType.MOVIE.equals(getType())) {
            return getId();
        }
        if (VideoType.EPISODE.equals(getType()) && (detail = this.l) != null) {
            return detail.id;
        }
        if (VideoType.SHOW.equals(getType())) {
            return bU_();
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public String aI_() {
        Video.Detail detail;
        if (VideoType.MOVIE.equals(getType())) {
            return getTitle();
        }
        if (VideoType.EPISODE.equals(getType()) && (detail = this.l) != null) {
            return detail.title;
        }
        if (VideoType.SHOW.equals(getType())) {
            return C_();
        }
        return null;
    }

    @Override // o.InterfaceC5176btn
    public boolean isPlayable() {
        SummaryImpl summaryImpl = this.Q;
        if (summaryImpl != null) {
            return summaryImpl.isPlayable();
        }
        return true;
    }

    @Override // o.InterfaceC5176btn
    public boolean aY_() {
        return VideoType.EPISODE.equals(getType()) || aR() != null;
    }

    @Override // o.InterfaceC5160btX
    public long aG_() {
        BookmarkImpl bookmarkImpl;
        BookmarkImpl bookmarkImpl2 = this.e;
        long lastModified = bookmarkImpl2 != null ? bookmarkImpl2.getLastModified() : -1L;
        return (i() == null || aR() == null || (bookmarkImpl = (BookmarkImpl) aU().b("bookmark")) == null) ? lastModified : bookmarkImpl.getLastModified();
    }

    @Override // o.InterfaceC5160btX
    public long aF_() {
        return C8175dfS.b(aq_(), av_(), aJ_());
    }

    @Override // o.InterfaceC5160btX
    public long aq_() {
        BookmarkImpl bookmarkImpl;
        BookmarkImpl bookmarkImpl2 = this.e;
        long bookmarkPositionMs = bookmarkImpl2 != null ? bookmarkImpl2.getBookmarkPositionMs() : -1L;
        C8329diN aU = aU();
        return (aU == null || (bookmarkImpl = (BookmarkImpl) aU.b("bookmark")) == null) ? bookmarkPositionMs : bookmarkImpl.getBookmarkPositionMs();
    }

    public void d(long j, long j2) {
        if (this.e == null) {
            this.e = new BookmarkImpl();
        }
        this.e.setBookmarkPositionMs(j);
        this.e.setLastModified(j2);
    }

    @Override // o.InterfaceC5198buI
    public String p() {
        Video.SupplementalVideos supplementalVideos = this.O;
        if (supplementalVideos == null) {
            return null;
        }
        return supplementalVideos.defaultTrailer;
    }

    @Override // o.InterfaceC5160btX
    public String aC_() {
        if (VideoType.MOVIE.equals(getType())) {
            return null;
        }
        if (VideoType.EPISODE.equals(getType())) {
            return aQ();
        }
        return getTitle();
    }

    @Override // o.InterfaceC5160btX
    public String aO_() {
        if (VideoType.EPISODE.equals(getType()) || VideoType.SEASON.equals(getType())) {
            return cd_();
        }
        return getId();
    }

    @Override // o.InterfaceC5160btX
    public int g() {
        Video.Detail aR = getType() == VideoType.SHOW ? aR() : aI();
        if (aR != null) {
            return aR.displayRuntime;
        }
        SummaryImpl aS = aS();
        if (aS != null) {
            return aS.displayRuntime;
        }
        return -1;
    }

    @Override // o.InterfaceC5160btX
    public int aJ_() {
        Video.Detail aR = getType() == VideoType.SHOW ? aR() : aI();
        if (aR != null) {
            return aR.runtime;
        }
        return -1;
    }

    @Override // o.InterfaceC5160btX
    public int av_() {
        Video.Detail aR = getType() == VideoType.SHOW ? aR() : aI();
        if (aR != null) {
            int i = aR.endtime;
            return i > 0 ? i : aR.runtime;
        }
        SummaryImpl aS = aS();
        if (aS != null) {
            return aS.displayRuntime;
        }
        return 0;
    }

    @Override // o.InterfaceC5160btX
    public int aB_() {
        Video.Detail aI = aI();
        if (aI == null) {
            return 0;
        }
        return aI.logicalStart;
    }

    @Override // o.InterfaceC5160btX
    public int aw_() {
        if (VideoType.EPISODE.equals(getType())) {
            Video.Detail detail = this.l;
            if (detail == null) {
                return -1;
            }
            return detail.episodeNumber;
        }
        Video.Detail aR = aR();
        if (aR == null) {
            return -1;
        }
        return aR.episodeNumber;
    }

    @Override // o.InterfaceC5160btX
    public int x() {
        if (VideoType.SEASON.equals(getType()) || VideoType.EPISODE.equals(getType())) {
            Video.Detail detail = this.l;
            if (detail == null) {
                return -1;
            }
            return detail.seasonNumber;
        }
        Video.Detail aR = aR();
        if (aR == null) {
            return -1;
        }
        return aR.seasonNumber;
    }

    @Override // o.InterfaceC5195buF
    public String ch_() {
        if (VideoType.SEASON.equals(getType()) || VideoType.EPISODE.equals(getType())) {
            Video.Detail detail = this.l;
            if (detail == null) {
                return null;
            }
            return detail.seasonNumLabel;
        }
        Video.Detail aR = aR();
        if (aR == null) {
            return null;
        }
        return aR.seasonNumLabel;
    }

    @Override // o.InterfaceC5227bul
    public String cc_() {
        if (!VideoType.EPISODE.equals(getType())) {
            if (aR() != null) {
                return aR().seasonId;
            }
            return null;
        }
        Video.Detail detail = this.l;
        if (detail == null) {
            return null;
        }
        return detail.seasonId;
    }

    @Override // o.InterfaceC5227bul
    public String cd_() {
        if (!VideoType.EPISODE.equals(getType()) && !VideoType.SEASON.equals(getType())) {
            if (aR() != null) {
                return aR().showId;
            }
            return null;
        }
        Video.Detail detail = this.l;
        if (detail == null) {
            return null;
        }
        return detail.showId;
    }

    public String aQ() {
        Video.Detail detail;
        if (VideoType.EPISODE.equals(getType()) && (detail = this.l) != null) {
            return detail.showTitle;
        }
        if (aR() != null) {
            return aR().showTitle;
        }
        return null;
    }

    @Override // o.InterfaceC5227bul
    public String bZ_() {
        Video.Detail detail;
        if (VideoType.EPISODE.equals(getType()) && (detail = this.l) != null) {
            return detail.restUrl;
        }
        if (aR() != null) {
            return aR().restUrl;
        }
        return null;
    }

    @Override // o.InterfaceC5227bul
    public String cb_() {
        Video.Detail detail;
        if (VideoType.EPISODE.equals(getType()) && (detail = this.l) != null) {
            return detail.nextEpisodeId;
        }
        if (aR() != null) {
            return aR().nextEpisodeId;
        }
        return null;
    }

    @Override // o.InterfaceC5227bul
    public String bY_() {
        Video.Detail detail;
        if (VideoType.EPISODE.equals(getType()) && (detail = this.l) != null) {
            return detail.availabilityDateMsg;
        }
        if (aR() != null) {
            return aR().availabilityDateMsg;
        }
        return null;
    }

    @Override // o.InterfaceC5160btX
    public int an_() {
        Video.Detail aI = aI();
        if (aI == null) {
            return -1;
        }
        return aI.autoPlayMaxCount;
    }

    @Override // o.InterfaceC5160btX
    public boolean aV_() {
        Video.Detail detail;
        if (VideoType.SHOW.equals(getType())) {
            Video.Detail aR = aR();
            return aR != null && aR.isNextPlayableEpisode;
        } else if (!VideoType.EPISODE.equals(getType()) || (detail = this.l) == null) {
            return false;
        } else {
            return detail.isNextPlayableEpisode;
        }
    }

    @Override // o.InterfaceC5160btX
    public boolean aX_() {
        if (VideoType.MOVIE.equals(getType()) || VideoType.EPISODE.equals(getType())) {
            Video.Detail aI = aI();
            return aI != null && aI.isPinProtected;
        }
        Video.Detail aR = aR();
        return aR != null && aR.isPinProtected;
    }

    @Override // o.InterfaceC5160btX
    public boolean H() {
        if (VideoType.MOVIE.equals(getType()) || VideoType.EPISODE.equals(getType())) {
            Video.Detail aI = aI();
            return aI != null && aI.isPreviewProtected;
        }
        Video.Detail aR = aR();
        return aR != null && aR.isPreviewProtected;
    }

    @Override // o.InterfaceC5160btX
    public boolean aS_() {
        Video.Detail aI = aI();
        return aI != null && aI.isAgeProtected;
    }

    private Video.Detail aR() {
        C8329diN aU = aU();
        if (aU == null) {
            return null;
        }
        return aU.aI();
    }

    private C8329diN aU() {
        IF b2;
        BranchMap<IF> branchMap = this.n;
        if (branchMap == null || (b2 = IF.b(branchMap.b("current"))) == null) {
            return null;
        }
        return (C8329diN) b2.d(cn_(), C8329diN.class);
    }

    @Override // o.InterfaceC8366diy, o.InterfaceC5241buz
    /* renamed from: aE */
    public InterfaceC8366diy i() {
        return aU();
    }

    @Override // o.InterfaceC8366diy
    public InterfaceC8366diy b(float f) {
        int g;
        C8329diN aU = aU();
        return (aU == null || (g = aU.g()) <= 0 || ((float) TimeUnit.MILLISECONDS.toSeconds(aU.aq_())) / ((float) g) <= f || !aU.aV_()) ? aU : (C8329diN) cn_().b(IE.b(SignupConstants.Field.VIDEOS, aU.cb_(), "detail"));
    }

    @Override // o.InterfaceC5198buI
    public int ag() {
        Video.Detail aI = aI();
        int i = aI == null ? 0 : aI.year;
        if (i <= 0) {
            Video.SearchTitle searchTitle = this.K;
            return searchTitle != null ? searchTitle.releaseYear : 0;
        }
        return i;
    }

    @Override // o.InterfaceC5198buI
    public String U() {
        Video.Detail aI = aI();
        if (aI == null) {
            return null;
        }
        return aI.storyImgUrl;
    }

    @Override // o.InterfaceC5197buH
    public String T() {
        Video.Detail aI = aI();
        if (aI == null || !aI.storyImgAvailable) {
            return null;
        }
        return aI.storyImgUrl;
    }

    @Override // o.InterfaceC5198buI
    public String ab() {
        Video.Detail aI = aI();
        if (aI == null) {
            return null;
        }
        return aI.synopsis;
    }

    @Override // o.InterfaceC5198buI
    public ContextualText e(ContextualText.TextContext textContext) {
        ContextualText contextualText = this.m.get(textContext);
        if (contextualText == null) {
            if (textContext.e() != null) {
                contextualText = this.m.get(textContext.e());
            }
            if (contextualText == null) {
                InterfaceC1598aHf.a(new C1596aHd("contextualSynopsis is null").b(ErrorType.m));
            }
        }
        return (contextualText == null || C8168dfL.g(contextualText.text())) ? new ContextualText() { // from class: o.diN.3
            @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
            public String evidenceKey() {
                return null;
            }

            @Override // o.InterfaceC8323diH
            public long getTimestamp() {
                return 0L;
            }

            @Override // o.InterfaceC8321diF
            public boolean needsRefresh(long j) {
                return false;
            }

            @Override // o.InterfaceC8321diF
            public void setExpires(Long l) {
            }

            @Override // o.InterfaceC8323diH
            public void setTimestamp(long j) {
            }

            @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
            public String text() {
                return C8329diN.this.ab();
            }
        } : contextualText;
    }

    @Override // o.InterfaceC5198buI
    public String j() {
        BrandAndGenreBadgeImpl brandAndGenreBadgeImpl = this.g;
        if (brandAndGenreBadgeImpl != null) {
            return brandAndGenreBadgeImpl.getUrl();
        }
        return null;
    }

    @Override // o.InterfaceC5198buI, o.InterfaceC5183btu
    public String k() {
        Video.Detail aI = aI();
        String str = aI == null ? null : aI.certification;
        if (C8168dfL.g(str)) {
            Video.SearchTitle searchTitle = this.K;
            return searchTitle != null ? searchTitle.certification : null;
        }
        return str;
    }

    @Override // o.InterfaceC5198buI
    public int E() {
        Video.Detail aI = aI();
        if (aI == null) {
            return -1;
        }
        return aI.maturityLevel;
    }

    public long aK() {
        Video.Detail aI = aI();
        if (aI == null) {
            return -1L;
        }
        return aI.contentChangeDate;
    }

    @Override // o.InterfaceC5160btX
    public List<Advisory> e() {
        Video.Advisories advisories = this.h;
        return advisories == null ? new ArrayList(0) : advisories.getAdvisoryList();
    }

    @Override // o.InterfaceC5198buI
    public String Y() {
        Video.Detail aI = aI();
        if (aI == null) {
            return null;
        }
        return aI.supplementalMessage;
    }

    @Override // o.InterfaceC5198buI
    public List<TaglineMessage> aa() {
        TaglineMessagesImpl taglineMessagesImpl = this.W;
        return taglineMessagesImpl == null ? new ArrayList(0) : taglineMessagesImpl.getTaglineMessages();
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        Video.Detail aI = aI();
        if (aI != null) {
            return aI.isOriginal;
        }
        Video.SearchTitle searchTitle = this.K;
        if (searchTitle != null) {
            return searchTitle.isOriginal;
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public boolean F() {
        Video.Detail aI = aI();
        return aI != null && aI.isNSRE;
    }

    @Override // o.InterfaceC5160btX
    public boolean aU_() {
        Video.Detail aI = aI();
        return aI != null && aI.episodeNumberHidden;
    }

    @Override // o.InterfaceC5176btn
    public boolean d() {
        Video.OfflineAvailable offlineAvailable = this.A;
        return offlineAvailable != null && offlineAvailable.isAvailableOffline();
    }

    @Override // o.InterfaceC5198buI
    public boolean ao() {
        Video.HasWatched hasWatched = this.t;
        return hasWatched != null && hasWatched.hasWatched;
    }

    @Override // o.InterfaceC5198buI
    public String ae() {
        LogoBrandedHorizontalImpl logoBrandedHorizontalImpl = this.y;
        if (logoBrandedHorizontalImpl == null) {
            return null;
        }
        return logoBrandedHorizontalImpl.getUrl();
    }

    @Override // o.InterfaceC5160btX
    public InteractiveSummary az_() {
        Video.Detail detail = this.l;
        if (detail != null) {
            return detail.interactiveSummary;
        }
        return null;
    }

    @Override // o.InterfaceC5198buI
    public boolean as() {
        Video.Detail detail = this.l;
        return detail != null && detail.supportsInteractiveExperiences;
    }

    @Override // o.InterfaceC5160btX
    public Integer ay_() {
        BookmarkImpl bookmarkImpl;
        C8329diN aU = aU();
        if (aU == null || (bookmarkImpl = (BookmarkImpl) aU.b("bookmark")) == null) {
            BookmarkImpl bookmarkImpl2 = this.e;
            if (bookmarkImpl2 != null) {
                return bookmarkImpl2.getInteractiveProgress();
            }
            return null;
        }
        return bookmarkImpl.getInteractiveProgress();
    }

    @Override // o.InterfaceC5198buI
    public ContentWarning o() {
        Video.Detail aI = aI();
        if (aI == null) {
            return null;
        }
        return aI.getContentWarning();
    }

    @Override // o.InterfaceC5198buI
    public boolean am() {
        Video.Detail aI = aI();
        return aI != null && aI.hasTrailers;
    }

    @Override // o.InterfaceC5160btX
    public boolean M() {
        Video.Detail aI = aI();
        return aI != null && aI.isSupplementalVideo;
    }

    @Override // o.InterfaceC5160btX
    public boolean N() {
        if (VideoType.SHOW.equals(getType())) {
            return aR() != null && aR().supportsPrePlay;
        }
        Video.Detail detail = this.l;
        return detail != null && detail.supportsPrePlay;
    }

    @Override // o.InterfaceC5198buI
    public String R() {
        Video.Detail detail = this.l;
        if (detail == null) {
            return null;
        }
        return detail.quality;
    }

    @Override // o.InterfaceC5198buI
    public String bP_() {
        Video.Detail detail = this.l;
        if (detail == null) {
            return null;
        }
        return detail.actors;
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> bO_() {
        Video.People people = this.B;
        if (people == null) {
            return null;
        }
        return people.getActors();
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> ao_() {
        Video.People people = this.B;
        if (people == null) {
            return null;
        }
        return people.getCreators();
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> r() {
        Video.People people = this.B;
        if (people == null) {
            return null;
        }
        return people.getDirectors();
    }

    @Override // o.InterfaceC5198buI
    public List<PersonSummary> ah() {
        Video.People people = this.B;
        if (people == null) {
            return null;
        }
        return people.getWriters();
    }

    @Override // o.InterfaceC5198buI
    public String v() {
        Video.Detail detail = this.l;
        if (detail == null) {
            return null;
        }
        return detail.genres;
    }

    @Override // o.InterfaceC5198buI
    public List<GenreItem> z() {
        Video.Genres genres = this.f13842o;
        if (genres == null) {
            return null;
        }
        return genres.getGenres();
    }

    @Override // o.InterfaceC5157btU
    public int getUserThumbRating() {
        Video.RatingInfo ratingInfo = this.G;
        if (ratingInfo == null) {
            return 0;
        }
        return ratingInfo.userThumbRating;
    }

    @Override // o.InterfaceC5158btV, com.netflix.model.leafs.PostPlayItem
    public int getMatchPercentage() {
        Video.RatingInfo ratingInfo = this.G;
        if (ratingInfo == null) {
            return -1;
        }
        return ratingInfo.matchPercentage;
    }

    @Override // o.InterfaceC5198buI
    public boolean ap() {
        Video.InQueue inQueue = this.r;
        return inQueue != null && inQueue.inQueue;
    }

    @Override // o.InterfaceC5198buI
    public boolean aq() {
        Video.InRemindMeQueue inRemindMeQueue = this.x;
        return inRemindMeQueue != null && inRemindMeQueue.inRemindMeQueue;
    }

    @Override // o.InterfaceC5198buI
    public String D() {
        Video.Detail aI = aI();
        if (aI == null) {
            return null;
        }
        return aI.mdxVertUrl;
    }

    @Override // o.InterfaceC5198buI
    public String c() {
        Video.TrickplayBifUrl trickplayBifUrl = this.ah;
        if (trickplayBifUrl == null) {
            return null;
        }
        return trickplayBifUrl.getUrl();
    }

    @Override // o.InterfaceC5198buI
    public String m() {
        Video.Detail aI = aI();
        if (aI == null) {
            return null;
        }
        return aI.restUrl;
    }

    @Override // o.InterfaceC5187bty
    public boolean ar() {
        Video.Detail aI = aI();
        return aI != null && aI.isHdAvailable;
    }

    @Override // o.InterfaceC5187bty
    public boolean aw() {
        Video.Detail aI = aI();
        return aI != null && aI.isUhdAvailable;
    }

    @Override // o.InterfaceC5187bty
    public boolean al() {
        Video.Detail aI = aI();
        return aI != null && aI.is5dot1Available;
    }

    @Override // o.InterfaceC5187bty
    public boolean ai() {
        Video.Detail aI = aI();
        return aI != null && aI.isSpatialAudioAvailable;
    }

    @Override // o.InterfaceC5187bty
    public boolean av() {
        Video.Detail aI = aI();
        return aI != null && aI.isHdr10Avaiable;
    }

    @Override // o.InterfaceC5187bty
    public boolean an() {
        Video.Detail aI = aI();
        return aI != null && aI.isDolbyVisionAvailable;
    }

    @Override // o.InterfaceC5187bty
    public boolean aj() {
        Video.Detail aI = aI();
        return aI != null && aI.hasAssistiveAudio;
    }

    @Override // o.InterfaceC5187bty
    public boolean ak() {
        Video.Detail aI = aI();
        return aI != null && aI.hasClosedCaption;
    }

    @Override // o.InterfaceC5196buG
    public List<InterfaceC5223buh> bR_() {
        return cn_().c(C0956Jb.c(getId(), false));
    }

    @Override // o.InterfaceC5199buJ
    public List<InterfaceC5240buy> bS_() {
        return cn_().c(C0956Jb.d(getId()));
    }

    @Override // o.InterfaceC5196buG
    public TrackableListSummary h() {
        return aV();
    }

    @Override // o.InterfaceC5199buJ
    public TrackableListSummary l() {
        return aY();
    }

    private TrackableListSummaryImpl aV() {
        SummarizedList<IF, TrackableListSummaryImpl> summarizedList = this.S;
        if (summarizedList == null) {
            return null;
        }
        return (TrackableListSummaryImpl) summarizedList.b("summary");
    }

    private TrackableListSummaryImpl aY() {
        SummarizedList<IF, TrackableListSummaryImpl> summarizedList = this.ad;
        if (summarizedList == null) {
            return null;
        }
        return (TrackableListSummaryImpl) summarizedList.b("summary");
    }

    @Override // o.InterfaceC5194buE
    public String W() {
        String str;
        Video.Detail aI = aI();
        return (aI == null || (str = aI.seasonNumLabel) == null) ? "" : str;
    }

    @Override // o.InterfaceC5194buE
    public String t() {
        Video.Detail aI = aI();
        if (aI == null) {
            return null;
        }
        return aI.directors;
    }

    @Override // o.InterfaceC5194buE
    public int bX_() {
        return C8168dfL.d(t());
    }

    @Override // o.InterfaceC5194buE
    public int D_() {
        Video.Detail aI = aI();
        if (aI == null) {
            return -1;
        }
        return aI.episodeCount;
    }

    @Override // o.InterfaceC5194buE
    public int u() {
        Video.Detail aR = aR();
        if (aR == null) {
            return -1;
        }
        return aR.episodeNumber;
    }

    @Override // o.InterfaceC5194buE
    public String bU_() {
        Video.Detail detail;
        if (VideoType.EPISODE.equals(getType()) && (detail = this.l) != null) {
            return detail.id;
        }
        Video.Detail aR = aR();
        if (aR == null) {
            return null;
        }
        return aR.id;
    }

    @Override // o.InterfaceC5179btq
    public String C_() {
        Video.Detail detail;
        if (VideoType.EPISODE.equals(getType()) && (detail = this.l) != null) {
            return detail.title;
        }
        Video.Detail aR = aR();
        if (aR == null) {
            return null;
        }
        return aR.title;
    }

    @Override // o.InterfaceC5194buE
    public ContextualText d(ContextualText.TextContext textContext) {
        C8329diN aU = aU();
        if (aU == null) {
            return null;
        }
        return aU.e(textContext);
    }

    @Override // o.InterfaceC5194buE
    public int bV_() {
        Video.Detail aR = aR();
        if (aR == null) {
            return -1;
        }
        return aR.seasonNumber;
    }

    @Override // o.InterfaceC5194buE
    public InterfaceC5195buF A() {
        if (getType() == VideoType.SHOW) {
            InterfaceC8322diG b2 = cn_().b(IE.b(SignupConstants.Field.VIDEOS, getId(), "seasons", "current", "detail"));
            if (b2 instanceof C8329diN) {
                return (C8329diN) b2;
            }
        }
        return null;
    }

    @Override // o.InterfaceC5191buB
    public String ce_() {
        Video.Detail aI = aI();
        if (aI != null) {
            return aI.newBadge;
        }
        return null;
    }

    @Override // o.InterfaceC5194buE
    public int V() {
        SummarizedList<IF, TrackableListSummaryImpl> summarizedList;
        TrackableListSummaryImpl b2;
        if (getType() != VideoType.SHOW || (summarizedList = this.N) == null || (b2 = summarizedList.b()) == null) {
            return 0;
        }
        return b2.getLength();
    }

    @Override // o.InterfaceC5198buI
    public String Z() {
        Video.Detail detail = this.l;
        if (detail != null) {
            return detail.titleUrl;
        }
        return null;
    }

    @Override // o.InterfaceC5198buI
    public String af() {
        Video.Detail detail = this.l;
        if (detail == null) {
            return null;
        }
        return detail.titleLogoUrl;
    }

    @Override // o.InterfaceC5190buA
    public List<InterfaceC5191buB> aB() {
        if (c(SignupConstants.Field.VIDEOS)) {
            return null;
        }
        return this.c.c(IE.b(getType().getValue(), getId(), "postPlayExperience", IE.a(2), "videoRef", "summary"));
    }

    @Override // o.InterfaceC5190buA
    public PostPlayExperience aA() {
        if (this.F == null || getId() == null) {
            return null;
        }
        List<I> c = this.c.c(IE.b("postPlayExperiences", getId(), "experienceData"));
        if (c.size() != 0) {
            return (PostPlayExperience) c.get(0);
        }
        return null;
    }

    private boolean c(String str) {
        if (getId() == null) {
            d(str, "video ID");
            return true;
        } else if (getType() == null) {
            d(str, "video type");
            return true;
        } else {
            return false;
        }
    }

    private void d(String str, String str2) {
        String str3 = "SPY-7478 - Can't get post play " + str + " because " + str2 + " is null - getType=" + getType() + ",getId=" + getId() + ",getCurrentEpisodeId=" + bU_();
        C1044Mm.j("FalkorVideo", str3);
        InterfaceC1598aHf.a(new C1596aHd(str3).b(ErrorType.m));
    }

    @Override // o.InterfaceC5160btX
    public boolean isAvailableToPlay() {
        SummaryImpl summaryImpl = this.Q;
        if (summaryImpl != null) {
            return summaryImpl.isAvailableToPlay;
        }
        Video.SearchTitle searchTitle = this.K;
        if (searchTitle != null) {
            return searchTitle.isAvailableToPlay;
        }
        return false;
    }

    @Override // o.InterfaceC5160btX
    public String aK_() {
        String str;
        Video.Detail aI = VideoType.EPISODE == getType() ? aI() : aR();
        return (aI == null || (str = aI.abbrSeqLabel) == null) ? "" : str;
    }

    @Override // o.InterfaceC5160btX
    public String aL_() {
        String str;
        Video.Detail aI = VideoType.EPISODE == getType() ? aI() : aR();
        return (aI == null || (str = aI.longSeqLabel) == null) ? "" : str;
    }

    @Override // o.InterfaceC5160btX
    public CreditMarks ap_() {
        Video.Detail aI = aI();
        if (aI == null) {
            return null;
        }
        return aI.creditMarks;
    }

    @Override // o.InterfaceC8366diy, o.InterfaceC5198buI
    /* renamed from: aD */
    public InterfaceC8366diy K() {
        C8329diN aU;
        IF r0 = this.ae;
        if (r0 != null) {
            return (InterfaceC8366diy) r0.d(cn_(), C8329diN.class);
        }
        if (getType() != VideoType.SHOW || (aU = aU()) == null) {
            return null;
        }
        return aU.K();
    }

    @Override // o.InterfaceC8366diy
    public InterfaceC8366diy aH() {
        IF r0 = this.Y;
        if (r0 != null) {
            return (InterfaceC8366diy) r0.d(cn_(), C8329diN.class);
        }
        return null;
    }

    @Override // o.InterfaceC8366diy
    public GameDetails aJ() {
        IF r0 = this.Y;
        if (r0 != null) {
            return (GameDetails) r0.d(cn_(), C8327diL.class);
        }
        return null;
    }

    @Override // o.InterfaceC8366diy
    public Boolean aL() {
        Video.IsRestricted isRestricted = this.u;
        if (isRestricted == null) {
            return null;
        }
        return Boolean.valueOf(isRestricted.isRestricted);
    }

    @Override // o.InterfaceC5150btN
    public InteractiveMoments az() {
        InteractiveMomentsImpl interactiveMomentsImpl = this.v;
        if (interactiveMomentsImpl == null) {
            return null;
        }
        return interactiveMomentsImpl.getInteractiveMoments();
    }

    @Override // o.InterfaceC5198buI
    public List<TagSummary> ac() {
        Video.Tags tags = this.V;
        if (tags != null) {
            return tags.getTags();
        }
        return null;
    }

    @Override // o.InterfaceC5198buI
    public List<GenreItem> I() {
        Video.MoodTags moodTags = this.D;
        if (moodTags != null) {
            return moodTags.getTags();
        }
        return null;
    }

    @Override // o.InterfaceC5198buI
    public String q() {
        String str;
        Video.Detail detail = this.l;
        if (detail == null || (str = detail.creatorHome) == null) {
            return null;
        }
        return str;
    }

    @Override // o.InterfaceC5160btX
    public boolean G() {
        Video.Detail detail = this.l;
        return detail != null && detail.isNonSerializedTv;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawSynopsis() {
        SummaryImpl aS = aS();
        if (aS == null) {
            return null;
        }
        return aS.synopsis;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawYear() {
        SummaryImpl aS = aS();
        if (aS == null) {
            return null;
        }
        return aS.year;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawCertificationValue() {
        SummaryImpl aS = aS();
        if (aS == null) {
            return null;
        }
        return aS.certificationValue;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawCertificationLevel() {
        SummaryImpl aS = aS();
        if (aS == null) {
            return null;
        }
        return aS.certificationLevel;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawCertificationBoardId() {
        SummaryImpl aS = aS();
        if (aS == null) {
            return null;
        }
        return aS.certificationBoardId;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawCertificationRatingId() {
        SummaryImpl aS = aS();
        if (aS == null) {
            return null;
        }
        return aS.certificationRatingId;
    }

    @Override // o.InterfaceC5193buD
    public String getQuickDrawSeasonNumLabel() {
        SummaryImpl aS = aS();
        if (aS == null) {
            return null;
        }
        return aS.seasonNumLabel;
    }

    @Override // o.InterfaceC5193buD
    public int getQuickDrawRuntime() {
        SummaryImpl aS = aS();
        if (aS == null) {
            return 0;
        }
        return aS.displayRuntime;
    }

    @Override // o.InterfaceC5193buD
    public boolean getQuickDrawInQueue() {
        Video.InQueue aN = aN();
        if (aN != null) {
            return aN.inQueue;
        }
        SummaryImpl aS = aS();
        return aS != null && aS.inQueue;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        if (d()) {
            if (getType() == VideoType.SHOW) {
                C8329diN aU = aU();
                return aU != null && aU.isAvailableForDownload();
            }
            return true;
        }
        SummaryImpl aS = aS();
        return aS != null && aS.isAvailableForDownload();
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        RecommendedTrailerImpl recommendedTrailerImpl = this.L;
        if (recommendedTrailerImpl != null) {
            return recommendedTrailerImpl.getSupplementalVideoMerchComputeId();
        }
        return null;
    }

    @Override // o.InterfaceC5180btr
    public SupplementalMessageType A_() {
        Video.Detail aI = aI();
        if (aI == null) {
            return SupplementalMessageType.l;
        }
        return aI.supplementalMessageType;
    }

    @Override // o.InterfaceC5202buM
    public TrackableListSummary ck_() {
        SummarizedList<IF, TrackableListSummaryImpl> summarizedList = this.ab;
        if (summarizedList == null) {
            return null;
        }
        return (TrackableListSummary) summarizedList.b("summary");
    }

    @Override // o.InterfaceC5202buM
    public List<InterfaceC5223buh> cl_() {
        TrackableListSummary ck_ = ck_();
        if (ck_ == null || ck_.getLength() == 0) {
            return null;
        }
        return cn_().c(C0956Jb.c(Collections.singletonList(getId()), 0, ck_.getLength() - 1));
    }

    @Override // o.InterfaceC5152btP
    public Float ax() {
        C0948It c0948It = this.z;
        if (c0948It != null) {
            return c0948It.a();
        }
        return null;
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5194buE P() {
        if (getType() == VideoType.SHOW) {
            return this;
        }
        return null;
    }

    @Override // o.InterfaceC5200buK
    public InterfaceC5238buw Q() {
        if (getType() == VideoType.MOVIE) {
            return this;
        }
        return null;
    }

    @Override // o.InterfaceC5201buL
    public RecommendedTrailer O() {
        return ci_();
    }
}
