package com.netflix.mediaclient.graphqlrepo.transformers;

import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import j$.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import o.C1596aHd;
import o.C2399afX;
import o.C2457agT;
import o.C2458agU;
import o.C2461agX;
import o.C2471agh;
import o.C2519ahc;
import o.C2529ahm;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5178btp;
import o.dqE;
import org.chromium.net.ConnectionSubtype;

/* loaded from: classes3.dex */
public final class GraphQLLoMo implements Parcelable, LoMo {
    private final C2458agU a;
    private final long d;
    private final String e;
    private int h;
    private final String i;
    public static final b b = new b(null);
    public static final Parcelable.Creator<GraphQLLoMo> CREATOR = new Creator();

    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<GraphQLLoMo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final GraphQLLoMo[] newArray(int i) {
            return new GraphQLLoMo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final GraphQLLoMo createFromParcel(Parcel parcel) {
            C8632dsu.c((Object) parcel, "");
            return new GraphQLLoMo((C2458agU) parcel.readValue(GraphQLLoMo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt());
        }
    }

    /* loaded from: classes3.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[LoMoType.values().length];
            try {
                iArr[LoMoType.BEHIND_THE_SCENES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoMoType.BILLBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoMoType.BULK_RATER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoMoType.BULK_RATER_RECOMMENDATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoMoType.COLLECTION_VIDEO_PAGE_EVIDENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LoMoType.COMING_SOON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LoMoType.CONTENT_PREVIEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LoMoType.CONTINUE_WATCHING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LoMoType.DOWNLOADS_FOR_YOU.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LoMoType.FAVORITE_TITLES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LoMoType.FLAT_GENRE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LoMoType.GALLERY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LoMoType.INSTANT_QUEUE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LoMoType.KIDS_FAVORITES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LoMoType.MOST_THUMBED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LoMoType.MY_DOWNLOADS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LoMoType.RECENTLY_WATCHED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[LoMoType.ROAR.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[LoMoType.STANDARD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[LoMoType.TRENDING_NOW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[LoMoType.REMINDERS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[LoMoType.TOP_TEN.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[LoMoType.IP_BASED_GAMES.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[LoMoType.TRAILERS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[LoMoType.MY_GAMES.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[LoMoType.FEED.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[LoMoType.CATEGORIES.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[LoMoType.CHARACTERS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[LoMoType.COLLECTION_PAGE_EVIDENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[LoMoType.DEFAULT_GAMES.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[LoMoType.EDITORIAL_GAMES.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[LoMoType.GAME_FEATURE_EDUCATION.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[LoMoType.GAME_BILLBOARD.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[LoMoType.GAME_IDENTITY.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[LoMoType.GAMES_TRAILERS.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[LoMoType.MY_PROFILES.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[LoMoType.NOTIFICATIONS.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[LoMoType.PEOPLE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[LoMoType.POPULAR_GAMES.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[LoMoType.READY_TO_PLAY.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[LoMoType.RECENTLY_RELEASED_GAMES.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            c = iArr;
        }
    }

    public final String c() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        return this.i;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public void setLengthOverride(int i) {
        this.h = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        parcel.writeValue(this.a);
        parcel.writeString(this.i);
        parcel.writeString(this.e);
        parcel.writeLong(this.d);
        parcel.writeInt(this.h);
    }

    public GraphQLLoMo(C2458agU c2458agU, String str, String str2, long j, int i) {
        C8632dsu.c((Object) c2458agU, "");
        this.a = c2458agU;
        this.i = str;
        this.e = str2;
        this.d = j;
        this.h = i;
    }

    public /* synthetic */ GraphQLLoMo(C2458agU c2458agU, String str, String str2, long j, int i, int i2, C8627dsp c8627dsp) {
        this(c2458agU, str, str2, (i2 & 8) != 0 ? System.currentTimeMillis() : j, (i2 & 16) != 0 ? -1 : i);
    }

    public final C2461agX a() {
        C2458agU.c c = this.a.c();
        C2461agX b2 = c != null ? c.b() : null;
        C8632dsu.d(b2);
        return b2;
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final LoMoType e(C2458agU.c cVar) {
            return c(cVar != null ? cVar.a() : null);
        }

        public final LoMoType c(C2457agT c2457agT) {
            Map d;
            Map k;
            Throwable th;
            if (c2457agT == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Trying to get LoMoType for null LolomoRowData", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                LoMoType a2 = LoMoType.a(null);
                C8632dsu.a(a2, "");
                return a2;
            }
            if (c2457agT.k() == null && c2457agT.G() == null) {
                if (c2457agT.E() != null) {
                    return LoMoType.ROAR;
                }
                return c2457agT.J() != null ? LoMoType.TOP_TEN : c2457agT.h() != null ? LoMoType.CHARACTERS : c2457agT.f() != null ? LoMoType.CONTINUE_WATCHING : c2457agT.c() != null ? LoMoType.BILLBOARD : c2457agT.B() != null ? LoMoType.POPULAR_GAMES : c2457agT.n() != null ? LoMoType.DOWNLOADS_FOR_YOU : c2457agT.w() != null ? LoMoType.KIDS_FAVORITES : c2457agT.g() != null ? LoMoType.COLLECTION_VIDEO_PAGE_EVIDENCE : c2457agT.v() != null ? LoMoType.GALLERY : c2457agT.t() != null ? LoMoType.GAME_BILLBOARD : c2457agT.F() != null ? LoMoType.READY_TO_PLAY : c2457agT.u() != null ? LoMoType.GAMES_TRAILERS : c2457agT.p() != null ? LoMoType.GAME_FEATURE_EDUCATION : c2457agT.s() != null ? LoMoType.GAME_IDENTITY : c2457agT.a() != null ? LoMoType.BULK_RATER : c2457agT.b() != null ? LoMoType.BULK_RATER_RECOMMENDATION : c2457agT.l() != null ? LoMoType.DEFAULT_GAMES : c2457agT.q() != null ? LoMoType.MY_GAMES : c2457agT.r() != null ? LoMoType.EDITORIAL_GAMES : c2457agT.x() != null ? LoMoType.IP_BASED_GAMES : c2457agT.z() != null ? LoMoType.INSTANT_QUEUE : c2457agT.D() != null ? LoMoType.REMINDERS : c2457agT.L() != null ? LoMoType.TRAILERS : c2457agT.d() != null ? LoMoType.BEHIND_THE_SCENES : c2457agT.A() != null ? LoMoType.MY_PROFILES : c2457agT.y() != null ? LoMoType.MY_DOWNLOADS : c2457agT.C() != null ? LoMoType.NOTIFICATIONS : c2457agT.o() != null ? LoMoType.FAVORITE_TITLES : c2457agT.H() != null ? LoMoType.RECENTLY_WATCHED : c2457agT.j() != null ? LoMoType.CATEGORIES : c2457agT.K() != null ? LoMoType.TRENDING_NOW : LoMoType.STANDARD;
            }
            return LoMoType.FEED;
        }
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        return a().a();
    }

    @Override // o.InterfaceC5281bvm
    public String getListId() {
        return a().a();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo, o.InterfaceC5281bvm
    public String getListContext() {
        return a().e();
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        LoMoType e;
        C2458agU.c c = this.a.c();
        return (c == null || (e = b.e(c)) == null) ? InterfaceC5178btp.c.e() : e;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public boolean isRichUITreatment() {
        C2457agT a;
        C2519ahc E;
        C2458agU.c c = this.a.c();
        return !((c == null || (a = c.a()) == null || (E = a.E()) == null) ? false : C8632dsu.c(E.b(), Boolean.FALSE));
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        return a().i();
    }

    @Override // o.InterfaceC5281bvm
    public int getTrackId() {
        Integer g = a().g();
        if (g != null) {
            return g.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5281bvm
    public int getListPos() {
        Integer d2 = this.a.d();
        if (d2 != null) {
            return d2.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5174btl
    public int getLength() {
        C2461agX b2;
        C2461agX.d b3;
        Integer b4;
        int i = this.h;
        if (i > -1) {
            return i;
        }
        C2458agU.c c = this.a.c();
        if (c == null || (b2 = c.b()) == null || (b3 = b2.b()) == null || (b4 = b3.b()) == null) {
            return -1;
        }
        return b4.intValue();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public boolean isVolatile() {
        Integer f = a().f();
        return (f != null && f.intValue() > 0) || C8632dsu.c((Object) a().e(), (Object) LoMoType.BULK_RATER.a());
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public boolean needsRefresh() {
        Instant c = a().c();
        Long valueOf = c != null ? Long.valueOf(c.b()) : null;
        if (valueOf != null) {
            return valueOf.longValue() < System.currentTimeMillis();
        }
        Integer f = a().f();
        Long valueOf2 = f != null ? Long.valueOf(f.intValue()) : null;
        Instant d2 = a().d();
        Long valueOf3 = d2 != null ? Long.valueOf(d2.b()) : null;
        if (valueOf2 != null) {
            return (valueOf3 != null ? valueOf3.longValue() : this.d) + (valueOf2.longValue() * ((long) 1000)) < System.currentTimeMillis();
        }
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public String titleIconId() {
        return a().j();
    }

    @Override // o.InterfaceC5281bvm
    public String getImpressionToken() {
        return getItemImpressionTokenForPosition(0);
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public String getItemImpressionTokenForPosition(int i) {
        C2457agT a;
        C2471agh t;
        C2471agh.a d2;
        List<C2471agh.c> b2;
        Object f;
        C2457agT a2;
        C2399afX m;
        C2529ahm a3;
        C2529ahm.n c;
        List<C2529ahm.e> d3;
        Object f2;
        String e;
        C2458agU.c c2 = this.a.c();
        if (c2 != null && (a2 = c2.a()) != null && (m = a2.m()) != null && (a3 = m.a()) != null && (c = a3.c()) != null && (d3 = c.d()) != null) {
            f2 = C8576dqs.f((List<? extends Object>) d3, i);
            C2529ahm.e eVar = (C2529ahm.e) f2;
            if (eVar != null && (e = eVar.e()) != null) {
                return e;
            }
        }
        C2458agU.c c3 = this.a.c();
        if (c3 != null && (a = c3.a()) != null && (t = a.t()) != null && (d2 = t.d()) != null && (b2 = d2.b()) != null) {
            f = C8576dqs.f((List<? extends Object>) b2, i);
            C2471agh.c cVar = (C2471agh.c) f;
            if (cVar != null) {
                return cVar.a();
            }
        }
        return null;
    }

    @Override // o.InterfaceC5281bvm
    public String getSectionUid() {
        return a().h();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public String getAnnotation(String str) {
        Map d2;
        Map k;
        Throwable th;
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        String str2 = "GraphQL LoMo got call for getAnnotation: listContext=" + getListContext() + ", annotation name=" + str;
        ErrorType errorType = ErrorType.l;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd(str2, null, errorType, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd.a;
        if (errorType2 != null) {
            c1596aHd.e.put("errorType", errorType2.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                c1596aHd.a(errorType2.c() + " " + b2);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th);
            return null;
        }
        dVar.e().b(c1596aHd, th);
        return null;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public void setListPos(int i) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public boolean b() {
        C2458agU.c c = this.a.c();
        LoMoType e = c != null ? b.e(c) : null;
        switch (e == null ? -1 : d.c[e.ordinal()]) {
            case -1:
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case JSONzip.substringLimit /* 40 */:
            case 41:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return true;
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.LoMo
    public boolean d() {
        C2457agT a;
        C2458agU.c c = this.a.c();
        return ((c == null || (a = c.a()) == null) ? null : b.c(a)) == LoMoType.FEED;
    }
}
