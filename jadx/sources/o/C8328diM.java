package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.GenreItemImpl;

/* renamed from: o.diM  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8328diM extends AbstractC8316diA implements InterfaceC5223buh, InterfaceC5143btG {
    public static final b d = new b(null);
    private GenreItemImpl a;

    @Override // o.InterfaceC5143btG
    public GenreItem a() {
        return this.a;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return false;
    }

    /* renamed from: o.diM$b */
    /* loaded from: classes5.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("FalkorGenreBranch");
        }
    }

    public C8328diM(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        super(interfaceC1240Ub);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r3.equals("offlineAvailable") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r3.equals("recommendedTrailer") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r3.equals("episodes") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r3.equals("rating") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        if (r3.equals("topTenBoxart") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        if (r3.equals("hasWatched") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
        if (r3.equals("detail") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
        if (r3.equals("brandAndGenreBadge") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
        if (r3.equals("volatileBitmaskedDetails") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
        return o.IJ.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r3.equals("bookmark") != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r3.equals("inQueue") != false) goto L5;
     */
    @Override // o.InterfaceC0943Io
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.InterfaceC8322diG b(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r3, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1895282426: goto L74;
                case -1857640538: goto L69;
                case -1570019120: goto L60;
                case -1335224239: goto L57;
                case -1136616012: goto L4e;
                case -1074358944: goto L45;
                case -938102371: goto L3c;
                case -632946216: goto L33;
                case -312704424: goto L2a;
                case 136285222: goto L21;
                case 1926204140: goto L18;
                case 2005378358: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L81
        Le:
            java.lang.String r0 = "bookmark"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
            goto L7c
        L18:
            java.lang.String r0 = "inQueue"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
            goto L7c
        L21:
            java.lang.String r0 = "offlineAvailable"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
            goto L7c
        L2a:
            java.lang.String r0 = "recommendedTrailer"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
            goto L7c
        L33:
            java.lang.String r0 = "episodes"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
            goto L7c
        L3c:
            java.lang.String r0 = "rating"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
            goto L7c
        L45:
            java.lang.String r0 = "topTenBoxart"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
            goto L7c
        L4e:
            java.lang.String r0 = "hasWatched"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
            goto L7c
        L57:
            java.lang.String r0 = "detail"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
            goto L7c
        L60:
            java.lang.String r0 = "brandAndGenreBadge"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
            goto L7c
        L69:
            java.lang.String r0 = "summary"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
            com.netflix.model.leafs.GenreItemImpl r3 = r2.a
            return r3
        L74:
            java.lang.String r0 = "volatileBitmaskedDetails"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L81
        L7c:
            o.IJ r3 = o.IJ.b()
            return r3
        L81:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't get node for key: "
            r0.append(r1)
            r0.append(r3)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8328diM.b(java.lang.String):o.diG");
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        C8632dsu.c((Object) str, "");
        InterfaceC8322diG b2 = b(str);
        if (b2 != null) {
            return b2;
        }
        if (C8632dsu.c((Object) str, (Object) "summary")) {
            GenreItemImpl genreItemImpl = new GenreItemImpl();
            this.a = genreItemImpl;
            return genreItemImpl;
        }
        throw new IllegalStateException("Can't create node for key: " + str);
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        C8632dsu.c((Object) str, "");
        if (C8632dsu.c((Object) str, (Object) "summary")) {
            this.a = (GenreItemImpl) interfaceC8322diG;
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        d(str, null);
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        String id;
        GenreItemImpl genreItemImpl = this.a;
        return (genreItemImpl == null || (id = genreItemImpl.getId()) == null) ? "-1" : id;
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        GenreItemImpl genreItemImpl = this.a;
        if (genreItemImpl != null) {
            return genreItemImpl.getTitle();
        }
        return null;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.CATEGORY;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        GenreItemImpl genreItemImpl = this.a;
        if (genreItemImpl != null) {
            return genreItemImpl.getUnifiedEntityId();
        }
        return null;
    }

    public String toString() {
        GenreItemImpl genreItemImpl = this.a;
        return "FalkorGenreBranch [summary=" + genreItemImpl + "]";
    }
}
