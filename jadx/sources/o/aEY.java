package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.SubtitlePreference;
import com.netflix.mediaclient.servicemgr.interface_.user.ProfileType;
import java.util.List;
import java.util.Map;
import o.C2567aiX;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aEY implements InterfaceC5283bvo {
    public static final b e = new b(null);
    private final boolean c;
    private final C2567aiX d;

    public aEY(C2567aiX c2567aiX, boolean z) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) c2567aiX, "");
        this.d = c2567aiX;
        this.c = z;
        if (c2567aiX.h() == null || c2567aiX.e().length() == 0 || C8632dsu.c((Object) c2567aiX.e(), (Object) "invalid_guid")) {
            InterfaceC1593aHa.c.a("profile=" + c2567aiX);
            String str = c2567aiX.h() != null ? "bad guid" : "null name";
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str2 = "SPY-36570: GraphQLUserProfile " + str;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str2, null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
        }
        String i = c2567aiX.i();
        if (i == null || i.length() <= 20) {
            return;
        }
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String i2 = c2567aiX.i();
        C2567aiX.b b3 = c2567aiX.b();
        aVar.a("lang=" + i2 + ", avatar=" + (b3 != null ? b3.d() : null));
    }

    public /* synthetic */ aEY(C2567aiX c2567aiX, boolean z, int i, C8627dsp c8627dsp) {
        this(c2567aiX, (i & 2) != 0 ? false : z);
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("GraphQLUserProfile");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[Catch: JSONException -> 0x01f1, TRY_ENTER, TryCatch #0 {JSONException -> 0x01f1, blocks: (B:4:0x0005, B:7:0x000c, B:9:0x0017, B:19:0x0078, B:22:0x009e, B:24:0x00ad, B:28:0x00bc, B:30:0x00c4, B:31:0x00df, B:33:0x00e5, B:35:0x00f5, B:37:0x00fd, B:38:0x0101, B:40:0x011c, B:42:0x0189, B:44:0x01a0, B:46:0x01a8, B:48:0x01b3, B:13:0x0026, B:15:0x0033, B:17:0x003a, B:18:0x0047, B:8:0x0012), top: B:51:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0189 A[Catch: JSONException -> 0x01f1, TryCatch #0 {JSONException -> 0x01f1, blocks: (B:4:0x0005, B:7:0x000c, B:9:0x0017, B:19:0x0078, B:22:0x009e, B:24:0x00ad, B:28:0x00bc, B:30:0x00c4, B:31:0x00df, B:33:0x00e5, B:35:0x00f5, B:37:0x00fd, B:38:0x0101, B:40:0x011c, B:42:0x0189, B:44:0x01a0, B:46:0x01a8, B:48:0x01b3, B:13:0x0026, B:15:0x0033, B:17:0x003a, B:18:0x0047, B:8:0x0012), top: B:51:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01a8 A[Catch: JSONException -> 0x01f1, TryCatch #0 {JSONException -> 0x01f1, blocks: (B:4:0x0005, B:7:0x000c, B:9:0x0017, B:19:0x0078, B:22:0x009e, B:24:0x00ad, B:28:0x00bc, B:30:0x00c4, B:31:0x00df, B:33:0x00e5, B:35:0x00f5, B:37:0x00fd, B:38:0x0101, B:40:0x011c, B:42:0x0189, B:44:0x01a0, B:46:0x01a8, B:48:0x01b3, B:13:0x0026, B:15:0x0033, B:17:0x003a, B:18:0x0047, B:8:0x0012), top: B:51:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.aEY c(java.lang.String r37) {
            /*
                Method dump skipped, instructions count: 498
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aEY.b.c(java.lang.String):o.aEY");
        }
    }

    @Override // o.InterfaceC5283bvo
    public boolean isProfileValid() {
        String avatarUrl;
        boolean g;
        String languagesInCsv;
        boolean g2;
        if (isProfileGuidValid() && (avatarUrl = getAvatarUrl()) != null) {
            g = C8691duz.g(avatarUrl);
            if (!g && (languagesInCsv = getLanguagesInCsv()) != null) {
                g2 = C8691duz.g(languagesInCsv);
                if (!g2 && this.d.d() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isProfileGuidValid() {
        return this.d.e().length() > 0 && !C8632dsu.c((Object) this.d.e(), (Object) "invalid_guid");
    }

    @Override // o.InterfaceC5283bvo
    public String getProfileGuid() {
        return this.d.e();
    }

    @Override // o.InterfaceC5283bvo
    public String getProfileName() {
        String h = this.d.h();
        return h == null ? "" : h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = o.C8566dqi.e(r0);
     */
    @Override // o.InterfaceC5283bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<java.lang.String> getLanguagesList() {
        /*
            r1 = this;
            java.lang.String r0 = r1.getLanguagesInCsv()
            if (r0 == 0) goto Lc
            java.util.List r0 = o.C8570dqm.c(r0)
            if (r0 != 0) goto L10
        Lc:
            java.util.List r0 = o.C8570dqm.c()
        L10:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aEY.getLanguagesList():java.util.List");
    }

    @Override // o.InterfaceC5283bvo
    public String getLanguagesInCsv() {
        Object f;
        String i = this.d.i();
        if (i == null) {
            List<C2567aiX.f> l = this.d.l();
            if (l != null) {
                f = C8576dqs.f((List<? extends Object>) l, 0);
                C2567aiX.f fVar = (C2567aiX.f) f;
                if (fVar != null) {
                    return fVar.c();
                }
            }
            return null;
        }
        return i;
    }

    @Override // o.InterfaceC5283bvo
    public String[] getLanguages() {
        String languagesInCsv = getLanguagesInCsv();
        return languagesInCsv != null ? new String[]{languagesInCsv} : new String[0];
    }

    @Override // o.InterfaceC5283bvo
    public String getProfileEmail() {
        C2567aiX.h j = this.d.j();
        if (j != null) {
            return j.c();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = o.C8576dqs.G(r0);
     */
    @Override // o.InterfaceC5283bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<java.lang.String> getSecondaryLanguages() {
        /*
            r1 = this;
            o.aiX r0 = r1.d
            java.util.List r0 = r0.f()
            if (r0 == 0) goto Le
            java.util.List r0 = o.C8570dqm.e(r0)
            if (r0 != 0) goto L12
        Le:
            java.util.List r0 = o.C8570dqm.c()
        L12:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aEY.getSecondaryLanguages():java.util.List");
    }

    @Override // o.InterfaceC5283bvo
    public String getAvatarUrl() {
        C2567aiX.b b2 = this.d.b();
        if (b2 != null) {
            return b2.a();
        }
        return null;
    }

    @Override // o.InterfaceC5283bvo
    public String getAvatarKey() {
        C2567aiX.b b2 = this.d.b();
        if (b2 != null) {
            return b2.d();
        }
        return null;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isPrimaryProfile() {
        Boolean n = this.d.n();
        if (n != null) {
            return n.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isDefaultKidsProfile() {
        Boolean m = this.d.m();
        if (m != null) {
            return m.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5283bvo
    public ProfileType getProfileType() {
        return C8632dsu.c(this.d.p(), Boolean.TRUE) ? ProfileType.JFK : ProfileType.STANDARD;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isKidsProfile() {
        Boolean p = this.d.p();
        if (p != null) {
            return p.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isAutoPlayEnabled() {
        Boolean o2 = this.d.o();
        if (o2 != null) {
            return o2.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isProfileLocked() {
        Boolean t = this.d.t();
        if (t != null) {
            return t.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isProfileCreationLocked() {
        Boolean r = this.d.r();
        if (r != null) {
            return r.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5283bvo
    public String getProfileLockPin() {
        return this.d.c();
    }

    @Override // o.InterfaceC5283bvo
    public int getMaturityValue() {
        Integer d;
        C2567aiX.e d2 = this.d.d();
        if (d2 == null || (d = d2.d()) == null) {
            return 0;
        }
        return d.intValue();
    }

    @Override // o.InterfaceC5283bvo
    public List<String> getMaturityLabels() {
        List<String> a;
        List<String> G;
        C2567aiX.e d = this.d.d();
        if (d == null || (a = d.a()) == null) {
            return null;
        }
        G = C8576dqs.G(a);
        return G;
    }

    @Override // o.InterfaceC5283bvo
    public boolean isMaturityLowest() {
        Boolean c;
        C2567aiX.e d = this.d.d();
        if (d == null || (c = d.c()) == null) {
            return false;
        }
        return c.booleanValue();
    }

    @Override // o.InterfaceC5283bvo
    public boolean isMaturityHighest() {
        Boolean e2;
        C2567aiX.e d = this.d.d();
        if (d == null || (e2 = d.e()) == null) {
            return false;
        }
        return e2.booleanValue();
    }

    @Override // o.InterfaceC5283bvo
    public boolean disableVideoMerchAutoPlay() {
        Boolean s = this.d.s();
        return !(s != null ? s.booleanValue() : false);
    }

    @Override // o.InterfaceC5283bvo
    public boolean hasTitleRestrictions() {
        C2567aiX.a a;
        List<C2567aiX.c> a2;
        return this.c || (a = this.d.a()) == null || (a2 = a.a()) == null || !a2.isEmpty();
    }

    @Override // o.InterfaceC5283bvo
    public InterfaceC5284bvp getSubtitlePreference() {
        C2567aiX.i g = this.d.g();
        if (g != null) {
            return new aEL(g);
        }
        return null;
    }

    @Override // o.InterfaceC5283bvo
    public JSONObject toJsonObject() {
        Object d;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("profileId", getProfileGuid());
        jSONObject.put(SignupConstants.Field.PROFILE_NAME, getProfileName());
        jSONObject.put(SignupConstants.Field.EMAIL, getProfileEmail());
        jSONObject.put("isPrimaryProfile", isPrimaryProfile());
        jSONObject.put("isDefaultKidsProfile", isDefaultKidsProfile());
        jSONObject.put("autoPlayOn", isAutoPlayEnabled());
        jSONObject.put("experienceType", getProfileType().toString());
        jSONObject.put("avatarUrl", getAvatarUrl());
        jSONObject.put("avatarKey", getAvatarKey());
        jSONObject.put("languages", getLanguagesInCsv());
        d = C8576dqs.d(getSecondaryLanguages(), ",", null, null, 0, null, null, 62, null);
        jSONObject.put(SignupConstants.Field.SECONDARY_LANGUAGES, d);
        jSONObject.put("isProfileLocked", isProfileLocked());
        jSONObject.put("profileLockPin", getProfileLockPin());
        jSONObject.put("isProfileCreationLocked", isProfileCreationLocked());
        jSONObject.put("disableVideoMerchAutoPlay", disableVideoMerchAutoPlay());
        jSONObject.put("hasTitleRestrictions", hasTitleRestrictions());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("level", getMaturityValue());
        jSONObject2.put("isLowest", isMaturityLowest());
        jSONObject2.put("isHighest", isMaturityHighest());
        List<String> maturityLabels = getMaturityLabels();
        if (maturityLabels != null) {
            JSONArray jSONArray = new JSONArray();
            for (String str : maturityLabels) {
                jSONArray.put(str);
            }
            jSONObject2.put("label", jSONArray);
        }
        jSONObject.put("maturity", jSONObject2);
        if (getSubtitlePreference() != null) {
            jSONObject.put(SubtitlePreference.FIELD_SUBTITLE_OVERRIDE, String.valueOf(getSubtitlePreference()));
        }
        return jSONObject;
    }

    private final String b(String str) {
        return (str == null || str.length() == 0) ? "empty" : "exists";
    }

    @Override // o.InterfaceC5283bvo
    public String toLoggingString() {
        Object d;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("profileId", getProfileGuid());
        jSONObject.put(SignupConstants.Field.PROFILE_NAME, b(getProfileName()));
        jSONObject.put(SignupConstants.Field.EMAIL, b(getProfileEmail()));
        jSONObject.put("isPrimaryProfile", isPrimaryProfile());
        jSONObject.put("isDefaultKidsProfile", isDefaultKidsProfile());
        jSONObject.put("autoPlayOn", isAutoPlayEnabled());
        jSONObject.put("experienceType", getProfileType().toString());
        jSONObject.put("avatarUrl", b(getAvatarUrl()));
        jSONObject.put("avatarKey", getAvatarKey());
        jSONObject.put("languages", getLanguagesInCsv());
        d = C8576dqs.d(getSecondaryLanguages(), ",", null, null, 0, null, null, 62, null);
        jSONObject.put(SignupConstants.Field.SECONDARY_LANGUAGES, d);
        jSONObject.put("disableVideoMerchAutoPlay", disableVideoMerchAutoPlay());
        jSONObject.put("hasTitleRestrictions", hasTitleRestrictions());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("level", getMaturityValue());
        jSONObject2.put("isLowest", isMaturityLowest());
        jSONObject2.put("isHighest", isMaturityHighest());
        List<String> maturityLabels = getMaturityLabels();
        if (maturityLabels != null) {
            JSONArray jSONArray = new JSONArray();
            for (String str : maturityLabels) {
                jSONArray.put(str);
            }
            jSONObject2.put("label", jSONArray);
        }
        jSONObject.put("maturity", jSONObject2);
        return "GraphQL:" + jSONObject;
    }
}
