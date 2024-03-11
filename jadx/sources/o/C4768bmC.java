package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import o.C4770bmE;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bmC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4768bmC extends JSONObject {
    public final e c;
    private final c d;
    public static final a e = new a(null);
    private static final String a = "nf_pds_event";

    public final c a() {
        return this.d;
    }

    public /* synthetic */ C4768bmC(c cVar, String str, C4726bju c4726bju, long j, C4817bmz c4817bmz, String str2, String str3, String str4, C4770bmE.a aVar, C4320bcL c4320bcL, String str5, Long l, String str6, C4809bmr c4809bmr, C4805bmn c4805bmn, int i, C8627dsp c8627dsp) {
        this(cVar, str, c4726bju, j, c4817bmz, str2, str3, str4, aVar, c4320bcL, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : l, (i & 4096) != 0 ? null : str6, c4809bmr, c4805bmn);
    }

    public C4768bmC(c cVar, String str, C4726bju c4726bju, long j, C4817bmz c4817bmz, String str2, String str3, String str4, C4770bmE.a aVar, C4320bcL c4320bcL, String str5, Long l, String str6, C4809bmr c4809bmr, C4805bmn c4805bmn) {
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) c4726bju, "");
        C8632dsu.c((Object) c4817bmz, "");
        C8632dsu.c((Object) aVar, "");
        this.d = cVar;
        e eVar = new e(cVar, str, c4726bju, j, c4817bmz, e.c(str2, str3, str4), aVar, c4320bcL, str5, l, str6, c4809bmr, c4805bmn);
        this.c = eVar;
        put("version", 2);
        put(SignupConstants.Field.URL, c4726bju.b());
        put("params", eVar);
    }

    /* renamed from: o.bmC$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final boolean f;
        private final String h;
        private final boolean i;
        public static final C0108c c = new C0108c(null);
        private static final c a = new c("start", true, false, 4, null);
        private static final c j = new c("stop", false, true, 2, null);
        private static final c d = new c("adStop", false, true, 2, null);
        private static final c e = new c("splice", false, false, 6, null);
        private static final c b = new c("keepAlive", false, false, 6, null);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.h, (Object) cVar.h) && this.f == cVar.f && this.i == cVar.i;
            }
            return false;
        }

        public final String h() {
            return this.h;
        }

        public int hashCode() {
            return (((this.h.hashCode() * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.i);
        }

        public final boolean i() {
            return this.i;
        }

        public String toString() {
            String str = this.h;
            boolean z = this.f;
            boolean z2 = this.i;
            return "Type(jsonValue=" + str + ", isStartOfSession=" + z + ", isEndOfSession=" + z2 + ")";
        }

        /* renamed from: o.bmC$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0108c {
            public /* synthetic */ C0108c(C8627dsp c8627dsp) {
                this();
            }

            private C0108c() {
            }

            public final c e() {
                return c.a;
            }

            public final c d() {
                return c.j;
            }

            public final c c() {
                return c.d;
            }

            public final c a() {
                return c.e;
            }

            public final c b() {
                return c.b;
            }
        }

        public c(String str, boolean z, boolean z2) {
            C8632dsu.c((Object) str, "");
            this.h = str;
            this.f = z;
            this.i = z2;
        }

        public /* synthetic */ c(String str, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }
    }

    /* renamed from: o.bmC$e */
    /* loaded from: classes3.dex */
    public static final class e extends JSONObject {
        public e(c cVar, String str, C4726bju c4726bju, long j, C4817bmz c4817bmz, String str2, C4770bmE.a aVar, C4320bcL c4320bcL, String str3, Long l, String str4, C4809bmr c4809bmr, C4805bmn c4805bmn) {
            C8632dsu.c((Object) cVar, "");
            C8632dsu.c((Object) c4726bju, "");
            C8632dsu.c((Object) c4817bmz, "");
            C8632dsu.c((Object) aVar, "");
            put("event", cVar.h());
            put("xid", str);
            put("clientTime", System.currentTimeMillis());
            put("position", c4817bmz.d());
            put("sessionStartTime", j);
            put("trackId", c4320bcL != null ? Integer.valueOf(c4320bcL.b()) : null);
            put("sectionUID", c4320bcL != null ? c4320bcL.a() : null);
            put("sessionParams", c4320bcL != null ? c4320bcL.d() : null);
            put("mediaId", str2);
            put("oxid", c4726bju.h);
            put("dxid", c4726bju.c);
            put("cachedcontent", c4726bju.l());
            put("livecontent", c4726bju.dynamic || c4726bju.o());
            put("persistentlicense", false);
            put("adEventToken", str3);
            put("adBreakLocationMs", l);
            put("mainManifestPlaybackContextId", str4);
            put("playTimes", aVar);
            if (cVar.i()) {
                put("sessionEndTime", System.currentTimeMillis());
            }
            if (c4809bmr != null) {
                if (c4805bmn != null && c4805bmn.b() && ConfigFastPropertyFeatureControlConfig.Companion.e()) {
                    String a = C4768bmC.e.a();
                    C1044Mm.a(a, "collecting thirdPartyAdVerificationMetadata for " + c4805bmn);
                    put("thirdPartyAdVerificationMetadata", c4809bmr.a(cVar.h(), c4817bmz, c4805bmn));
                    return;
                }
                String a2 = C4768bmC.e.a();
                C1044Mm.a(a2, "can't do 3p verification for " + c4805bmn);
            }
        }

        public final void a(boolean z) {
            try {
                put("persistentlicense", z);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: o.bmC$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final String a() {
            return C4768bmC.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str, String str2, String str3) {
            if (str == null && str2 == null && str3 == null) {
                return null;
            }
            return str + "|" + str2 + "|" + str3;
        }
    }
}
