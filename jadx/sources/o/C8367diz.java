package o;

import com.netflix.falkor.BranchMap;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.branches.FalkorList;
import com.netflix.model.branches.SummarizedList;
import com.netflix.model.leafs.DownloadedForYouDetailsImpl;
import com.netflix.model.leafs.LanguageListImpl;
import com.netflix.model.leafs.ListOfListOfGenres;
import com.netflix.model.leafs.ListOfListOfProfileIconsImpl;
import com.netflix.model.leafs.ListOfMoviesSummaryImpl;
import com.netflix.model.leafs.LoLoMoSummaryImpl;
import com.netflix.model.leafs.NapaPageSummaryImpl;
import com.netflix.model.leafs.SearchSectionSummaryImpl;
import com.netflix.model.leafs.SearchTrackableListSummary;
import com.netflix.model.leafs.social.UserNotificationsListSummary;
import java.io.Flushable;
import java.util.LinkedHashSet;
import java.util.Set;
import org.chromium.net.ConnectionSubtype;

/* renamed from: o.diz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8367diz implements InterfaceC0943Io, Flushable {
    private BranchMap<SummarizedList<C8334diS, SearchTrackableListSummary>> A;
    private BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>> B;
    private IF C;
    private C8331diP D;
    private BranchMap<IF> E;
    private BranchMap<SummarizedList<C8334diS, SearchTrackableListSummary>> F;
    private BranchMap<IF> G;
    private BranchMap<SummarizedList<C8369dja, ListOfMoviesSummaryImpl>> H;
    private BranchMap<SummarizedList<IF, SearchSectionSummaryImpl>> I;
    private BranchMap<C8329diN> N;
    private BranchMap<C8326diK> a;
    private BranchMap<BranchMap<DownloadedForYouDetailsImpl>> b;
    private IH<ListOfListOfGenres> c;
    private IH<ListOfListOfGenres> d;
    private BranchMap<IH<ListOfListOfGenres>> e;
    private BranchMap<C8328diM> f;
    private BranchMap<IF> g;
    private BranchMap<IF> h;
    private BranchMap<C8327diL> i;
    private IH<ListOfListOfGenres> j;
    private BranchMap<FalkorList<C8333diR>> k;
    private BranchMap<IH<LanguageListImpl>> l;
    private IF m;
    private BranchMap<SummarizedList<IF, LoLoMoSummaryImpl>> n;

    /* renamed from: o  reason: collision with root package name */
    private BranchMap<BranchMap<IH<ListOfListOfProfileIconsImpl>>> f13844o;
    private BranchMap<BranchMap<NapaPageSummaryImpl>> p;
    private BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>> q;
    private BranchMap<C8338diW> r;
    private BranchMap<IF> s;
    private BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>> t;
    private InterfaceC1240Ub<? extends InterfaceC0943Io> u;
    private BranchMap<SummarizedList<C8333diR, ListOfMoviesSummaryImpl>> v;
    private BranchMap<C8325diJ> w;
    private BranchMap<C8335diT> x;
    private SummarizedList<IF, UserNotificationsListSummary> y;
    private C8332diQ z;

    public void e(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        this.u = interfaceC1240Ub;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2139710459:
                if (str.equals("peopleVideosList")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1614415542:
                if (str.equals("preQuerySearchV3")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1554643546:
                if (str.equals("notificationsList")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1421901049:
                if (str.equals("upNextFeeds")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249499312:
                if (str.equals("genres")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1097180568:
                if (str.equals("lolomo")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1097180481:
                if (str.equals("lolopi")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1011949963:
                if (str.equals("flatCategories")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -834636875:
                if (str.equals("postPlayExperiences")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -816678056:
                if (str.equals(SignupConstants.Field.VIDEOS)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -710596521:
                if (str.equals("searchPage")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -610057368:
                if (str.equals("newSearch")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -600057108:
                if (str.equals("upNextFeed")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -527518912:
                if (str.equals("napaPages")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -282288683:
                if (str.equals("actionbarCategoryListV2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -17544705:
                if (str.equals("nonMemberVideos")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 16546099:
                if (str.equals("searchPageV2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 20972858:
                if (str.equals("filteredQueue")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 98120385:
                if (str.equals("games")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 102982549:
                if (str.equals("lists")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 347140875:
                if (str.equals("lolomos")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 605938835:
                if (str.equals("napaPageSummary")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 769850586:
                if (str.equals("categoriesList")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 824094417:
                if (str.equals("filteredCategoriesList")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1065679688:
                if (str.equals("searchSuggestionByReference")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1128710875:
                if (str.equals("downloadedForYouList")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1245424234:
                if (str.equals("characters")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1248393096:
                if (str.equals("nesPages")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1272354024:
                if (str.equals("notifications")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1368194385:
                if (str.equals("topCategories")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1385360876:
                if (str.equals("searchByReference")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1473796697:
                if (str.equals("upNextFeedSection")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1518327835:
                if (str.equals("languages")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1702497657:
                if (str.equals("actionbarCategoryList")) {
                    c = '!';
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
                return this.B;
            case 2:
                return this.y;
            case 3:
                return this.I;
            case 4:
                return this.f;
            case 5:
                return this.m;
            case 6:
                return this.f13844o;
            case 7:
                return this.g;
            case '\b':
                return this.x;
            case '\t':
                return this.N;
            case '\n':
                return this.D;
            case 11:
                return this.r;
            case '\f':
                return this.G;
            case '\r':
                return this.q;
            case 14:
                return this.c;
            case 15:
                return this.s;
            case 16:
                return this.z;
            case 17:
                return this.h;
            case 18:
                return this.i;
            case 19:
                return this.k;
            case 20:
                return this.n;
            case 21:
                return this.p;
            case 22:
                return this.j;
            case 23:
                return this.e;
            case 24:
                return this.F;
            case 25:
                return this.b;
            case 26:
                return this.a;
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                return this.t;
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                return this.w;
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                return this.E;
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                return this.A;
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                return this.H;
            case ' ':
                return this.l;
            case '!':
                return this.d;
            default:
                C1044Mm.e("Root", "Could not find key: " + str);
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2139710459:
                if (str.equals("peopleVideosList")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1614415542:
                if (str.equals("preQuerySearchV3")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1554643546:
                if (str.equals("notificationsList")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1421901049:
                if (str.equals("upNextFeeds")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249499312:
                if (str.equals("genres")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1097180568:
                if (str.equals("lolomo")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1097180481:
                if (str.equals("lolopi")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1011949963:
                if (str.equals("flatCategories")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -834636875:
                if (str.equals("postPlayExperiences")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -816678056:
                if (str.equals(SignupConstants.Field.VIDEOS)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -710596521:
                if (str.equals("searchPage")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -610057368:
                if (str.equals("newSearch")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -600057108:
                if (str.equals("upNextFeed")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -527518912:
                if (str.equals("napaPages")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -282288683:
                if (str.equals("actionbarCategoryListV2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -17544705:
                if (str.equals("nonMemberVideos")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 16546099:
                if (str.equals("searchPageV2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 20972858:
                if (str.equals("filteredQueue")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 98120385:
                if (str.equals("games")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 102982549:
                if (str.equals("lists")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 347140875:
                if (str.equals("lolomos")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 605938835:
                if (str.equals("napaPageSummary")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 769850586:
                if (str.equals("categoriesList")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 824094417:
                if (str.equals("filteredCategoriesList")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1065679688:
                if (str.equals("searchSuggestionByReference")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1128710875:
                if (str.equals("downloadedForYouList")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1245424234:
                if (str.equals("characters")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1248393096:
                if (str.equals("nesPages")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1272354024:
                if (str.equals("notifications")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1368194385:
                if (str.equals("topCategories")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1385360876:
                if (str.equals("searchByReference")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1473796697:
                if (str.equals("upNextFeedSection")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1518327835:
                if (str.equals("languages")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1702497657:
                if (str.equals("actionbarCategoryList")) {
                    c = '!';
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
                this.v = (BranchMap) interfaceC8322diG;
                return;
            case 1:
                this.B = (BranchMap) interfaceC8322diG;
                return;
            case 2:
                this.y = (SummarizedList) interfaceC8322diG;
                return;
            case 3:
                this.I = (BranchMap) interfaceC8322diG;
                return;
            case 4:
                this.f = (BranchMap) interfaceC8322diG;
                return;
            case 5:
                this.m = IF.b(interfaceC8322diG);
                return;
            case 6:
                this.f13844o = (BranchMap) interfaceC8322diG;
                return;
            case 7:
                this.g = (BranchMap) interfaceC8322diG;
                return;
            case '\b':
                this.x = (BranchMap) interfaceC8322diG;
                return;
            case '\t':
                this.N = (BranchMap) interfaceC8322diG;
                return;
            case '\n':
                this.D = (C8331diP) interfaceC8322diG;
                return;
            case 11:
                this.r = (BranchMap) interfaceC8322diG;
                return;
            case '\f':
                this.G = (BranchMap) interfaceC8322diG;
                return;
            case '\r':
                this.q = (BranchMap) interfaceC8322diG;
                return;
            case 14:
                this.c = (IH) interfaceC8322diG;
                return;
            case 15:
                this.s = (BranchMap) interfaceC8322diG;
                return;
            case 16:
                this.z = (C8332diQ) interfaceC8322diG;
                return;
            case 17:
                this.h = (BranchMap) interfaceC8322diG;
                return;
            case 18:
                this.i = (BranchMap) interfaceC8322diG;
                return;
            case 19:
                this.k = (BranchMap) interfaceC8322diG;
                return;
            case 20:
                this.n = (BranchMap) interfaceC8322diG;
                return;
            case 21:
                this.p = (BranchMap) interfaceC8322diG;
                return;
            case 22:
                this.j = (IH) interfaceC8322diG;
                return;
            case 23:
                this.e = (BranchMap) interfaceC8322diG;
                return;
            case 24:
                this.F = (BranchMap) interfaceC8322diG;
                return;
            case 25:
                this.b = (BranchMap) interfaceC8322diG;
                return;
            case 26:
                this.a = (BranchMap) interfaceC8322diG;
                return;
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                this.t = (BranchMap) interfaceC8322diG;
                return;
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                this.w = (BranchMap) interfaceC8322diG;
                return;
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                this.E = (BranchMap) interfaceC8322diG;
                return;
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                this.A = (BranchMap) interfaceC8322diG;
                return;
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                this.H = (BranchMap) interfaceC8322diG;
                return;
            case ' ':
                this.l = (BranchMap) interfaceC8322diG;
                return;
            case '!':
                this.d = (IH) interfaceC8322diG;
                return;
            default:
                C1044Mm.e("Root", "Don't know how to set key: " + str);
                return;
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        d(str, null);
    }

    public Set<String> a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.m != null) {
            linkedHashSet.add("lolomo");
        }
        if (this.n != null) {
            linkedHashSet.add("lolomos");
        }
        if (this.f13844o != null) {
            linkedHashSet.add("lolopi");
        }
        if (this.k != null) {
            linkedHashSet.add("lists");
        }
        if (this.v != null) {
            linkedHashSet.add("peopleVideosList");
        }
        if (this.g != null) {
            linkedHashSet.add("flatCategories");
        }
        if (this.j != null) {
            linkedHashSet.add("categoriesList");
        }
        if (this.d != null) {
            linkedHashSet.add("actionbarCategoryList");
        }
        if (this.c != null) {
            linkedHashSet.add("actionbarCategoryListV2");
        }
        if (this.e != null) {
            linkedHashSet.add("filteredCategoriesList");
        }
        if (this.E != null) {
            linkedHashSet.add("topCategories");
        }
        if (this.N != null) {
            linkedHashSet.add(SignupConstants.Field.VIDEOS);
        }
        if (this.f != null) {
            linkedHashSet.add("genres");
        }
        if (this.x != null) {
            linkedHashSet.add("postPlayExperiences");
        }
        if (this.r != null) {
            linkedHashSet.add("newSearch");
        }
        if (this.A != null) {
            linkedHashSet.add("searchByReference");
        }
        if (this.F != null) {
            linkedHashSet.add("searchSuggestionByReference");
        }
        if (this.a != null) {
            linkedHashSet.add("characters");
        }
        if (this.w != null) {
            linkedHashSet.add("notifications");
        }
        if (this.y != null) {
            linkedHashSet.add("notificationsList");
        }
        if (this.s != null) {
            linkedHashSet.add("nonMemberVideos");
        }
        if (this.G != null) {
            linkedHashSet.add("upNextFeed");
        }
        if (this.I != null) {
            linkedHashSet.add("upNextFeeds");
        }
        if (this.H != null) {
            linkedHashSet.add("upNextFeedSection");
        }
        if (this.b != null) {
            linkedHashSet.add("downloadedForYouList");
        }
        if (this.B != null) {
            linkedHashSet.add("preQuerySearchV3");
        }
        if (this.D != null) {
            linkedHashSet.add("searchPage");
        }
        if (this.z != null) {
            linkedHashSet.add("searchPageV2");
        }
        if (this.q != null) {
            linkedHashSet.add("napaPages");
        }
        if (this.t != null) {
            linkedHashSet.add("nesPages");
        }
        if (this.i != null) {
            linkedHashSet.add("games");
        }
        if (this.p != null) {
            linkedHashSet.add("napaPageSummary");
        }
        if (this.l != null) {
            linkedHashSet.add("languages");
        }
        if (this.h != null) {
            linkedHashSet.add("filteredQueue");
        }
        return linkedHashSet;
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
            case -2139710459:
                if (str.equals("peopleVideosList")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1614415542:
                if (str.equals("preQuerySearchV3")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1554643546:
                if (str.equals("notificationsList")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1421901049:
                if (str.equals("upNextFeeds")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249499312:
                if (str.equals("genres")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1097180568:
                if (str.equals("lolomo")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1097180481:
                if (str.equals("lolopi")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1011949963:
                if (str.equals("flatCategories")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -834636875:
                if (str.equals("postPlayExperiences")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -816678056:
                if (str.equals(SignupConstants.Field.VIDEOS)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -710596521:
                if (str.equals("searchPage")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -610057368:
                if (str.equals("newSearch")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -600057108:
                if (str.equals("upNextFeed")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -527518912:
                if (str.equals("napaPages")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -282288683:
                if (str.equals("actionbarCategoryListV2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -17544705:
                if (str.equals("nonMemberVideos")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 16546099:
                if (str.equals("searchPageV2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 20972858:
                if (str.equals("filteredQueue")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 98120385:
                if (str.equals("games")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 102982549:
                if (str.equals("lists")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 347140875:
                if (str.equals("lolomos")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 605938835:
                if (str.equals("napaPageSummary")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 769850586:
                if (str.equals("categoriesList")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 824094417:
                if (str.equals("filteredCategoriesList")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1065679688:
                if (str.equals("searchSuggestionByReference")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1128710875:
                if (str.equals("downloadedForYouList")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1245424234:
                if (str.equals("characters")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1248393096:
                if (str.equals("nesPages")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1272354024:
                if (str.equals("notifications")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1368194385:
                if (str.equals("topCategories")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1385360876:
                if (str.equals("searchByReference")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1473796697:
                if (str.equals("upNextFeedSection")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1518327835:
                if (str.equals("languages")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1702497657:
                if (str.equals("actionbarCategoryList")) {
                    c = '!';
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
                BranchMap<SummarizedList<C8333diR, ListOfMoviesSummaryImpl>> branchMap = new BranchMap<>(C8370djb.y);
                this.v = branchMap;
                return branchMap;
            case 1:
                BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>> branchMap2 = new BranchMap<>(C8370djb.E);
                this.B = branchMap2;
                return branchMap2;
            case 2:
                SummarizedList<IF, UserNotificationsListSummary> g = C8370djb.g(this.u);
                this.y = g;
                return g;
            case 3:
                BranchMap<SummarizedList<IF, SearchSectionSummaryImpl>> branchMap3 = new BranchMap<>(C8370djb.z);
                this.I = branchMap3;
                return branchMap3;
            case 4:
                BranchMap<C8328diM> branchMap4 = new BranchMap<>(C8370djb.d(this.u));
                this.f = branchMap4;
                return branchMap4;
            case 5:
                IF r3 = new IF();
                this.m = r3;
                return r3;
            case 6:
                BranchMap<BranchMap<IH<ListOfListOfProfileIconsImpl>>> branchMap5 = new BranchMap<>(C8370djb.b);
                this.f13844o = branchMap5;
                return branchMap5;
            case 7:
                BranchMap<IF> branchMap6 = new BranchMap<>(C8370djb.n);
                this.g = branchMap6;
                return branchMap6;
            case '\b':
                BranchMap<C8335diT> branchMap7 = new BranchMap<>(C8370djb.n(this.u));
                this.x = branchMap7;
                return branchMap7;
            case '\t':
                BranchMap<C8329diN> branchMap8 = new BranchMap<>(C8370djb.o(this.u));
                this.N = branchMap8;
                return branchMap8;
            case '\n':
                C8331diP c8331diP = new C8331diP(this.u);
                this.D = c8331diP;
                return c8331diP;
            case 11:
                BranchMap<C8338diW> branchMap9 = new BranchMap<>(C8370djb.f13846o);
                this.r = branchMap9;
                return branchMap9;
            case '\f':
                BranchMap<IF> branchMap10 = new BranchMap<>(C8370djb.n);
                this.G = branchMap10;
                return branchMap10;
            case '\r':
                BranchMap<BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>>> branchMap11 = new BranchMap<>(C8370djb.L);
                this.q = branchMap11;
                return branchMap11;
            case 14:
                IH<ListOfListOfGenres> d = IH.d(new ListOfListOfGenres());
                this.c = d;
                return d;
            case 15:
                BranchMap<IF> branchMap12 = new BranchMap<>(C8370djb.n);
                this.s = branchMap12;
                return branchMap12;
            case 16:
                C8332diQ c8332diQ = new C8332diQ(this.u);
                this.z = c8332diQ;
                return c8332diQ;
            case 17:
                BranchMap<IF> branchMap13 = new BranchMap<>(C8370djb.n);
                this.h = branchMap13;
                return branchMap13;
            case 18:
                BranchMap<C8327diL> branchMap14 = new BranchMap<>(C8370djb.c(this.u));
                this.i = branchMap14;
                return branchMap14;
            case 19:
                BranchMap<FalkorList<C8333diR>> branchMap15 = new BranchMap<>(C8370djb.i);
                this.k = branchMap15;
                return branchMap15;
            case 20:
                BranchMap<SummarizedList<IF, LoLoMoSummaryImpl>> branchMap16 = new BranchMap<>(C8370djb.x);
                this.n = branchMap16;
                return branchMap16;
            case 21:
                BranchMap<BranchMap<NapaPageSummaryImpl>> branchMap17 = new BranchMap<>(C8370djb.d);
                this.p = branchMap17;
                return branchMap17;
            case 22:
                IH<ListOfListOfGenres> d2 = IH.d(new ListOfListOfGenres());
                this.j = d2;
                return d2;
            case 23:
                BranchMap<IH<ListOfListOfGenres>> branchMap18 = new BranchMap<>(C8370djb.p);
                this.e = branchMap18;
                return branchMap18;
            case 24:
                BranchMap<SummarizedList<C8334diS, SearchTrackableListSummary>> branchMap19 = new BranchMap<>(C8370djb.v);
                this.F = branchMap19;
                return branchMap19;
            case 25:
                BranchMap<BranchMap<DownloadedForYouDetailsImpl>> branchMap20 = new BranchMap<>(C8370djb.c);
                this.b = branchMap20;
                return branchMap20;
            case 26:
                BranchMap<C8326diK> branchMap21 = new BranchMap<>(C8370djb.h(this.u));
                this.a = branchMap21;
                return branchMap21;
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                BranchMap<SummarizedList<C8337diV, SearchSectionSummaryImpl>> branchMap22 = new BranchMap<>(C8370djb.G);
                this.t = branchMap22;
                return branchMap22;
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                BranchMap<C8325diJ> branchMap23 = new BranchMap<>(C8370djb.f(this.u));
                this.w = branchMap23;
                return branchMap23;
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                BranchMap<IF> branchMap24 = new BranchMap<>(C8370djb.n);
                this.E = branchMap24;
                return branchMap24;
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                BranchMap<SummarizedList<C8334diS, SearchTrackableListSummary>> branchMap25 = new BranchMap<>(C8370djb.v);
                this.A = branchMap25;
                return branchMap25;
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                BranchMap<SummarizedList<C8369dja, ListOfMoviesSummaryImpl>> branchMap26 = new BranchMap<>(C8370djb.l(this.u));
                this.H = branchMap26;
                return branchMap26;
            case ' ':
                BranchMap<IH<LanguageListImpl>> branchMap27 = new BranchMap<>(C8370djb.q);
                this.l = branchMap27;
                return branchMap27;
            case '!':
                IH<ListOfListOfGenres> d3 = IH.d(new ListOfListOfGenres());
                this.d = d3;
                return d3;
            default:
                throw new IllegalArgumentException("Unknown key: " + str);
        }
    }

    public String toString() {
        return "Root{lolomo=" + this.m + ", lolomos=" + this.n + ", lolopi=" + this.f13844o + ", lists=" + this.k + ", flatCategories=" + this.g + ", genreList=" + this.j + ", actionbarCategoryList=" + this.d + ", filteredGenreList=" + this.e + ", topGenres=" + this.E + ", videos=" + this.N + ", genres=" + this.f + ", postPlayExperiences=" + this.x + ", characters=" + this.a + ", newSearch=" + this.r + ", searchPreQuery=" + this.C + ", notifications=" + this.w + ", notificationsList=" + this.y + ", nonMemberVideos=" + this.s + ", upNextFeed=" + this.G + ", downloadedForYou=" + this.b + ", proxy=" + this.u + ", preQuerySearchV3=" + this.B + ", searchPage=" + this.D + ", napaPages=" + this.q + ", nesPages=" + this.t + ", games=" + this.i + ", napaPageSummary" + this.p + '}';
    }

    @Override // java.io.Flushable
    public void flush() {
        for (String str : a()) {
            a(str);
        }
    }
}
