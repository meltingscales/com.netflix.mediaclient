package com.netflix.mediaclient.service.player.bladerunnerclient;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.media.VideoResolutionRange;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyC4PlayerControls;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlaybackConfig;
import com.netflix.mediaclient.service.player.StreamProfileType;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C1045Mp;
import o.C1332Xp;
import o.C1613aHu;
import o.C4330bcV;
import o.C4369bdH;
import o.C4370bdI;
import o.C4373bdL;
import o.C4392bde;
import o.C4394bdg;
import o.C4618bhs;
import o.C8054ddD;
import o.C8060ddJ;
import o.C8171dfO;
import o.C8189dfg;
import o.C8572dqo;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5132bsw;
import o.InterfaceC5283bvo;
import o.InterfaceC8598drn;
import o.aOV;
import o.aQF;
import o.aQK;
import o.aRA;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class ManifestRequestParamBuilderBase extends C1045Mp {
    public static final c c;
    private static boolean k;
    private static boolean l;
    private static boolean n;

    /* renamed from: o  reason: collision with root package name */
    private static boolean f13209o;
    private static boolean p;
    private static boolean q;
    private static ProfileLevel r;
    private static boolean s;
    private static boolean t;
    private static boolean u;
    private final VideoResolutionRange A;
    private String D;
    public ManifestRequestFlavor a;
    protected String[] b;
    public final AseConfig d;
    public final aOV e;
    protected String[] f;
    protected String[] g;
    protected String[] h;
    protected String i;
    protected Boolean[] j;
    public UserAgent m;
    private boolean v;
    private boolean w;
    private boolean x;
    private final Context y;
    private final ConnectivityUtils.NetType z;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ProfileLevel.values().length];
            try {
                iArr[ProfileLevel.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileLevel.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            c = iArr;
        }
    }

    private final boolean F() {
        return false;
    }

    public static final boolean h(boolean z) {
        return c.c(z);
    }

    protected boolean C() {
        return false;
    }

    public String b() {
        return "licensedManifest";
    }

    public final ManifestRequestParamBuilderBase c(String str) {
        this.D = str;
        return this;
    }

    protected final void c(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        this.b = strArr;
    }

    public final ManifestRequestParamBuilderBase d(ManifestRequestFlavor manifestRequestFlavor) {
        this.a = manifestRequestFlavor;
        return this;
    }

    public abstract String d();

    protected final void d(Boolean[] boolArr) {
        C8632dsu.c((Object) boolArr, "");
        this.j = boolArr;
    }

    protected final void d(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        this.h = strArr;
    }

    protected final void e(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        this.g = strArr;
    }

    protected abstract void f(JSONObject jSONObject);

    protected abstract IPlayer.PlaybackType g();

    protected final void g(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        this.f = strArr;
    }

    protected final void i(JSONObject jSONObject) {
    }

    public final ManifestRequestParamBuilderBase k(boolean z) {
        this.w = z;
        return this;
    }

    public final ManifestRequestParamBuilderBase l(boolean z) {
        this.x = z;
        return this;
    }

    protected abstract boolean l();

    protected abstract boolean m();

    protected abstract boolean p();

    protected abstract boolean r();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManifestRequestParamBuilderBase(Context context, C4394bdg c4394bdg, ConnectivityUtils.NetType netType) {
        super("ManifestRequestParamBuilderBase");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c4394bdg, "");
        this.y = context;
        this.z = netType;
        aOV aov = c4394bdg.b;
        C8632dsu.a(aov, "");
        this.e = aov;
        UserAgent userAgent = c4394bdg.c;
        C8632dsu.a(userAgent, "");
        this.m = userAgent;
        this.i = "v2";
        this.v = O();
        VideoResolutionRange ab = aov.ab();
        C8632dsu.a(ab, "");
        this.A = ab;
        this.d = C4618bhs.a.b(StreamProfileType.i, "Default");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class ProfileLevel {
        private static final /* synthetic */ ProfileLevel[] a;
        private static final /* synthetic */ InterfaceC8598drn b;
        public static final ProfileLevel d = new ProfileLevel("level_40", 0);
        public static final ProfileLevel c = new ProfileLevel("level_41", 1);
        public static final ProfileLevel e = new ProfileLevel("level_50", 2);

        private static final /* synthetic */ ProfileLevel[] c() {
            return new ProfileLevel[]{d, c, e};
        }

        public static ProfileLevel valueOf(String str) {
            return (ProfileLevel) Enum.valueOf(ProfileLevel.class, str);
        }

        public static ProfileLevel[] values() {
            return (ProfileLevel[]) a.clone();
        }

        private ProfileLevel(String str, int i) {
        }

        static {
            ProfileLevel[] c2 = c();
            a = c2;
            b = C8600drp.e(c2);
        }
    }

    public final String[] j() {
        String[] strArr = this.h;
        if (strArr != null) {
            return strArr;
        }
        C8632dsu.d("");
        return null;
    }

    public final String[] f() {
        String[] strArr = this.b;
        if (strArr != null) {
            return strArr;
        }
        C8632dsu.d("");
        return null;
    }

    private final boolean O() {
        return C8189dfg.c(this.e);
    }

    private final boolean I() {
        return Config_FastProperty_PlaybackConfig.enableLiveHevcOnCapableDevices();
    }

    public final ManifestRequestParamBuilderBase b(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        d(strArr);
        if (this.v) {
            C1044Mm.e("nf_manifest_param", "HD content is enabled for device, check if we have override if InApp Widevine is used.");
            this.v = f(strArr);
        } else {
            C1044Mm.e("nf_manifest_param", "Device is limited to SD, not need to check if InApp Widevine is used to play.");
        }
        return this;
    }

    public final ManifestRequestParamBuilderBase c(String[] strArr, String[] strArr2, Boolean[] boolArr) {
        C8632dsu.c((Object) strArr, "");
        C8632dsu.c((Object) strArr2, "");
        C8632dsu.c((Object) boolArr, "");
        e(strArr);
        g(strArr2);
        d(boolArr);
        return this;
    }

    public final ManifestRequestParamBuilderBase a(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        c(strArr);
        return this;
    }

    private final String B() {
        String b = b();
        return "/" + b;
    }

    public final boolean i() {
        return this.A.getMaxHeight() >= 720 && this.v;
    }

    public final boolean c() {
        return this.A.getMaxHeight() >= 1080 && this.v;
    }

    public final void c(JSONArray jSONArray) {
        C8632dsu.c((Object) jSONArray, "");
        jSONArray.put("none-h264mpl30-dash");
        jSONArray.put("playready-h264mpl30-dash");
        if (this.v) {
            if (i()) {
                jSONArray.put("playready-h264mpl31-dash");
                jSONArray.put("none-h264mpl31-dash");
            }
            if (c()) {
                jSONArray.put("playready-h264mpl40-dash");
                jSONArray.put("none-h264mpl40-dash");
                if (r == ProfileLevel.e) {
                    jSONArray.put("playready-h264mpl50-dash");
                }
            }
        }
    }

    private final void h(JSONArray jSONArray) {
        C1044Mm.e("nf_manifest_param", "add AVC High Proflies");
        jSONArray.put("playready-h264hpl22-dash");
        jSONArray.put("h264hpl22-dash-playready-live");
        jSONArray.put("playready-h264hpl30-dash");
        jSONArray.put("h264hpl30-dash-playready-live");
        jSONArray.put("h264hpl31-dash-playready-live");
        if (this.v) {
            if (i()) {
                jSONArray.put("playready-h264hpl31-dash");
                jSONArray.put("h264hpl31-dash-playready-live");
                getLogTag();
            }
            if (c()) {
                jSONArray.put("playready-h264hpl40-dash");
                jSONArray.put("h264hpl40-dash-playready-live");
                getLogTag();
            }
            if (r == ProfileLevel.e) {
                jSONArray.put("playready-h264hpl50-dash");
            }
        }
    }

    private final void g(JSONArray jSONArray) {
        jSONArray.put("hevc-main10-L30-dash-cenc-live");
        if (this.v && C4369bdH.g()) {
            if (i()) {
                jSONArray.put("hevc-main10-L31-dash-cenc-live");
            }
            if (c()) {
                jSONArray.put("hevc-main10-L40-dash-cenc-live");
            }
            int i = d.c[r.ordinal()];
            if (i == 1) {
                jSONArray.put("hevc-main10-L50-dash-cenc-live");
                jSONArray.put("hevc-main10-L41-dash-cenc-live");
            } else if (i != 2) {
            } else {
                jSONArray.put("hevc-main10-L41-dash-cenc-live");
            }
        }
    }

    private final void i(JSONArray jSONArray) {
        jSONArray.put("hevc-main10-L30-dash-cenc");
        jSONArray.put("hevc-main10-L30-dash-cenc-prk-do");
        if (this.v && C4369bdH.g()) {
            if (i()) {
                jSONArray.put("hevc-main10-L31-dash-cenc");
                jSONArray.put("hevc-main10-L31-dash-cenc-prk");
                jSONArray.put("hevc-main10-L31-dash-cenc-prk-do");
            }
            if (c()) {
                jSONArray.put("hevc-main10-L40-dash-cenc");
                jSONArray.put("hevc-main10-L40-dash-cenc-prk");
                jSONArray.put("hevc-main10-L40-dash-cenc-prk-do");
            }
            int i = d.c[r.ordinal()];
            if (i == 1) {
                jSONArray.put("hevc-main10-L50-dash-cenc-prk");
                jSONArray.put("hevc-main10-L50-dash-cenc-prk-do");
                jSONArray.put("hevc-main10-L41-dash-cenc-prk");
                jSONArray.put("hevc-main10-L41-dash-cenc-prk-do");
            } else if (i == 2) {
                jSONArray.put("hevc-main10-L41-dash-cenc-prk");
                jSONArray.put("hevc-main10-L41-dash-cenc-prk-do");
            }
        }
        getLogTag();
    }

    private final void m(JSONArray jSONArray) {
        jSONArray.put("vp9-profile0-L21-dash-cenc");
        jSONArray.put("vp9-profile0-L30-dash-cenc");
        if (this.v && C4369bdH.j()) {
            if (i()) {
                jSONArray.put("vp9-profile0-L31-dash-cenc");
                getLogTag();
            }
            if (c()) {
                jSONArray.put("vp9-profile0-L40-dash-cenc");
                getLogTag();
            }
            if (r == ProfileLevel.e) {
                jSONArray.put("vp9-profile0-L50-dash-cenc");
            }
        }
        getLogTag();
    }

    private final void f(JSONArray jSONArray) {
        if (L()) {
            return;
        }
        jSONArray.put("hevc-hdr-main10-L30-dash-cenc-prk");
        jSONArray.put("hevc-hdr-main10-L30-dash-cenc-prk-do");
        if (I()) {
            jSONArray.put("hevc-hdr-main10-L30-dash-cenc-live");
        }
        if (this.v) {
            if (i()) {
                jSONArray.put("hevc-hdr-main10-L31-dash-cenc-prk");
                jSONArray.put("hevc-hdr-main10-L31-dash-cenc-prk-do");
                if (I()) {
                    jSONArray.put("hevc-hdr-main10-L31-dash-cenc-live");
                }
            }
            if (c()) {
                jSONArray.put("hevc-hdr-main10-L40-dash-cenc-prk");
                jSONArray.put("hevc-hdr-main10-L40-dash-cenc-prk-do");
                if (I()) {
                    jSONArray.put("hevc-hdr-main10-L40-dash-cenc-live");
                }
            }
            int i = d.c[r.ordinal()];
            if (i == 1) {
                jSONArray.put("hevc-hdr-main10-L50-dash-cenc-prk");
                jSONArray.put("hevc-hdr-main10-L50-dash-cenc-prk-do");
                jSONArray.put("hevc-hdr-main10-L41-dash-cenc-prk");
                jSONArray.put("hevc-hdr-main10-L41-dash-cenc-prk-do");
                if (I()) {
                    jSONArray.put("hevc-hdr-main10-L50-dash-cenc-live");
                    jSONArray.put("hevc-hdr-main10-L41-dash-cenc-live");
                }
            } else if (i == 2) {
                jSONArray.put("hevc-hdr-main10-L41-dash-cenc-prk");
                jSONArray.put("hevc-hdr-main10-L41-dash-cenc-prk-do");
                if (I()) {
                    jSONArray.put("hevc-hdr-main10-L41-dash-cenc-live");
                }
            }
        }
        getLogTag();
    }

    private final void j(JSONArray jSONArray) {
        if (L()) {
            return;
        }
        jSONArray.put("hevc-dv5-main10-L30-dash-cenc-prk");
        jSONArray.put("hevc-dv5-main10-L30-dash-cenc-prk-do");
        if (this.v) {
            if (i()) {
                jSONArray.put("hevc-dv5-main10-L31-dash-cenc-prk");
                jSONArray.put("hevc-dv5-main10-L31-dash-cenc-prk-do");
            }
            if (c()) {
                jSONArray.put("hevc-dv5-main10-L40-dash-cenc-prk");
                jSONArray.put("hevc-dv5-main10-L40-dash-cenc-prk-do");
            }
            int i = d.c[r.ordinal()];
            if (i == 1) {
                jSONArray.put("hevc-dv5-main10-L50-dash-cenc-prk");
                jSONArray.put("hevc-dv5-main10-L50-dash-cenc-prk-do");
                jSONArray.put("hevc-dv5-main10-L41-dash-cenc-prk");
                jSONArray.put("hevc-dv5-main10-L41-dash-cenc-prk-do");
            } else if (i == 2) {
                jSONArray.put("hevc-dv5-main10-L41-dash-cenc-prk");
                jSONArray.put("hevc-dv5-main10-L41-dash-cenc-prk-do");
            }
        }
        getLogTag();
    }

    private final void a(JSONArray jSONArray) {
        jSONArray.put("av1-main-L20-dash-cbcs-prk");
        jSONArray.put("av1-main-L21-dash-cbcs-prk");
        jSONArray.put("av1-main-L30-dash-cbcs-prk");
        if (this.v) {
            if (i()) {
                jSONArray.put("av1-main-L31-dash-cbcs-prk");
            }
            if (c()) {
                jSONArray.put("av1-main-L40-dash-cbcs-prk");
            }
            int i = d.c[r.ordinal()];
            if (i == 1) {
                jSONArray.put("av1-main-L50-dash-cbcs-prk");
                jSONArray.put("av1-main-L41-dash-cbcs-prk");
            } else if (i != 2) {
            } else {
                jSONArray.put("av1-main-L41-dash-cbcs-prk");
            }
        }
    }

    private final void b(JSONArray jSONArray) {
        jSONArray.put("av1-hdr10plus-main-L30-dash-cbcs-prk");
        if (this.v) {
            if (i()) {
                jSONArray.put("av1-hdr10plus-main-L31-dash-cbcs-prk");
            }
            if (c()) {
                jSONArray.put("av1-hdr10plus-main-L40-dash-cbcs-prk");
            }
            int i = d.c[r.ordinal()];
            if (i == 1) {
                jSONArray.put("av1-hdr10plus-main-L50-dash-cbcs-prk");
                jSONArray.put("av1-hdr10plus-main-L41-dash-cbcs-prk");
            } else if (i != 2) {
            } else {
                jSONArray.put("av1-hdr10plus-main-L41-dash-cbcs-prk");
            }
        }
    }

    public void a(JSONArray jSONArray, boolean z) {
        C8632dsu.c((Object) jSONArray, "");
        jSONArray.put("heaac-2-dash");
        if (C4370bdI.d() && p()) {
            jSONArray.put("xheaac-dash");
        }
        if (!this.x && z) {
            boolean an = this.e.an();
            if (this.e.ak()) {
                jSONArray.put("ddplus-2.0-dash");
            }
            if (an) {
                jSONArray.put("ddplus-5.1-dash");
            }
            if (K()) {
                jSONArray.put("ddplus-5.1hq-dash");
            }
        }
    }

    private final boolean K() {
        boolean al = this.e.al();
        if (C8054ddD.i() && al && C8060ddJ.e.c()) {
            return true;
        }
        return aQF.d.d() && C4373bdL.c();
    }

    public void e(JSONArray jSONArray) {
        C8632dsu.c((Object) jSONArray, "");
        jSONArray.put("imsc1.1").put("nflx-cmisc");
    }

    public final void d(JSONArray jSONArray) {
        C8632dsu.c((Object) jSONArray, "");
        if (C8171dfO.b()) {
            jSONArray.put("BIF240");
        } else {
            jSONArray.put("BIF320");
        }
    }

    private final void j(JSONObject jSONObject) {
        jSONObject.putOpt("osName", "android");
        jSONObject.putOpt("osVersion", String.valueOf(C8054ddD.c()));
        jSONObject.putOpt("application", "samurai");
        jSONObject.putOpt("clientVersion", this.D);
        jSONObject.putOpt("uiVersion", this.D);
        jSONObject.putOpt("uiPlatform", "android");
        jSONObject.putOpt("player", this instanceof C4392bde ? "offline" : "streaming");
        jSONObject.putOpt("hardware", this.e.l());
    }

    public final void b(JSONObject jSONObject) {
        int d2;
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put("manifestVersion", this.i);
        jSONObject.put("method", b());
        ManifestRequestFlavor manifestRequestFlavor = this.a;
        if (manifestRequestFlavor != null) {
            C8632dsu.d(manifestRequestFlavor);
            jSONObject.put("flavor", manifestRequestFlavor.e());
        }
        jSONObject.put("useHttpsStreams", true);
        jSONObject.put("drmType", "widevine");
        jSONObject.put("supportsWatermark", true);
        jSONObject.put("supportsPreReleasePin", true);
        if (b(this.d)) {
            jSONObject.put("desiredVmaf", "phone_plus_lts");
        }
        jSONObject.put("requestEligibleABTests", true);
        jSONObject.put("supportsUnequalizedDownloadables", true);
        if (G()) {
            jSONObject.put("prefersClosedCaptions", true);
        }
        if (AccessibilityUtils.a(this.y) || (C8054ddD.i() && AccessibilityUtils.e(this.y))) {
            jSONObject.put("preferAssistiveAudio", true);
        }
        if (ConfigFastPropertyC4PlayerControls.Companion.e()) {
            jSONObject.put("supportsAdBreakHydration", true);
        }
        C4330bcV.e eVar = C4330bcV.d;
        if (eVar.b()) {
            jSONObject.putOpt("rdidOsOptedOut", eVar.e().e());
            List<C4330bcV.d> b = eVar.e().b();
            if (b != null) {
                JSONArray jSONArray = new JSONArray();
                d2 = C8572dqo.d(b, 10);
                ArrayList arrayList = new ArrayList(d2);
                for (C4330bcV.d dVar : b) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("consentId", dVar.d());
                    jSONObject2.put("displayedAt", dVar.b());
                    jSONObject2.put("isDenied", dVar.c());
                    arrayList.add(jSONArray.put(jSONObject2));
                }
                jSONObject.putOpt("rdidConsentOptOuts", jSONArray);
            }
        }
        ConnectivityUtils.c(jSONObject, this.z);
        j(jSONObject);
        i(jSONObject);
    }

    private final boolean G() {
        Object systemService = this.y.getSystemService("captioning");
        C8632dsu.d(systemService);
        return ((CaptioningManager) systemService).isEnabled();
    }

    public final boolean b(AseConfig aseConfig) {
        boolean F = F();
        if (this.e.r() == DeviceCategory.PHONE) {
            if (d(aseConfig) || C()) {
                return true;
            }
            return F;
        }
        return F;
    }

    private final boolean d(AseConfig aseConfig) {
        return aseConfig != null && aseConfig.bZ();
    }

    private final void g(JSONObject jSONObject) {
        JSONArray a = a();
        a(a, true);
        e(a);
        d(a);
        jSONObject.put("profiles", a);
    }

    public final void e(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        g(jSONObject);
        b(jSONObject);
        f(jSONObject);
    }

    protected final void c(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        JSONObject jSONObject2 = new JSONObject();
        if (d(jSONObject2)) {
            jSONObject.put("common", jSONObject2);
        }
    }

    public final void a(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put("version", 2);
        jSONObject.put(SignupConstants.Field.URL, B());
        if (this.m.v()) {
            InterfaceC5283bvo j = this.m.j();
            C8632dsu.d(j);
            String[] languages = j.getLanguages();
            jSONObject.put("languages", new JSONArray((Collection) Arrays.asList(Arrays.copyOf(languages, languages.length))));
        } else {
            jSONObject.put("languages", new JSONArray((Collection) Arrays.asList(this.m.d())));
        }
        c(jSONObject);
    }

    public final boolean D() {
        return !this.x && r() && q();
    }

    public final boolean y() {
        return l() || (m() && n());
    }

    public final boolean z() {
        return I() && (x() || v() || A());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r0 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (M() == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A() {
        /*
            r4 = this;
            boolean r0 = r4.e()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L43
            o.aRA$c r0 = o.aRA.e
            boolean r0 = r0.a()
            if (r0 == 0) goto L1b
            boolean r0 = r4.w
            if (r0 == 0) goto L41
            boolean r0 = r4.M()
            if (r0 == 0) goto L43
            goto L41
        L1b:
            com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AllowHevc$d r0 = com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_AllowHevc.Companion
            boolean r0 = r0.b()
            if (r0 == 0) goto L28
            boolean r0 = r4.M()
            goto L3f
        L28:
            o.aQB$c r0 = o.aQB.d
            boolean r0 = r0.a()
            if (r0 == 0) goto L35
            boolean r0 = r4.M()
            goto L3f
        L35:
            boolean r0 = r4.J()
            if (r0 == 0) goto L43
            boolean r0 = r4.M()
        L3f:
            if (r0 == 0) goto L43
        L41:
            r0 = r1
            goto L44
        L43:
            r0 = r2
        L44:
            boolean r3 = r4.x
            if (r3 != 0) goto L51
            boolean r3 = r4.t()
            if (r3 == 0) goto L51
            if (r0 == 0) goto L51
            goto L52
        L51:
            r1 = r2
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase.A():boolean");
    }

    public final boolean x() {
        return !this.x && M() && s();
    }

    public final boolean v() {
        return !this.x && N() && k();
    }

    public final boolean u() {
        return !this.x && H() && (aQK.d.a() || this.v) && o();
    }

    public final boolean w() {
        return !this.x && E() && h();
    }

    public JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        if (D()) {
            m(jSONArray);
        }
        if (y()) {
            h(jSONArray);
        }
        c(jSONArray);
        if (A()) {
            i(jSONArray);
        }
        if (z()) {
            g(jSONArray);
        }
        if (x()) {
            f(jSONArray);
        }
        if (v()) {
            j(jSONArray);
        }
        if (u()) {
            a(jSONArray);
        }
        if (w()) {
            b(jSONArray);
        }
        return jSONArray;
    }

    private final boolean L() {
        return this.z == ConnectivityUtils.NetType.mobile && C1613aHu.i(AbstractApplicationC1040Mh.d());
    }

    protected boolean e() {
        return aRA.e.a();
    }

    private final boolean H() {
        return this.e.af();
    }

    private final boolean E() {
        return this.e.ae();
    }

    public final boolean q() {
        return c.d(this.v);
    }

    private final boolean J() {
        return this.e.ah();
    }

    public final boolean t() {
        return (this.v && C4369bdH.g()) || (this.w && C4369bdH.b());
    }

    public final boolean n() {
        return c.c(this.v);
    }

    private final boolean M() {
        return this.e.ar();
    }

    public final boolean s() {
        return this.v && C4369bdH.e() && C8054ddD.f(AbstractApplicationC1040Mh.d());
    }

    private final boolean N() {
        return this.e.ap();
    }

    public final boolean k() {
        return this.v && C4369bdH.d() && C8054ddD.h(AbstractApplicationC1040Mh.d());
    }

    public final boolean o() {
        return (this.v && C4369bdH.i()) || (this.w && C4369bdH.a());
    }

    public final boolean h() {
        return ((this.v && C4369bdH.h()) || (this.w && C4369bdH.a())) && C8054ddD.i(AbstractApplicationC1040Mh.d());
    }

    protected final boolean d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        InterfaceC5132bsw interfaceC5132bsw = (InterfaceC5132bsw) C1332Xp.b(InterfaceC5132bsw.class);
        if (interfaceC5132bsw.b()) {
            C1044Mm.j("nf_manifest_param", "CAD service token is disabled by configuration or we did not received CAD ST after too many attempts.");
            return false;
        } else if (interfaceC5132bsw.d()) {
            C1044Mm.e("nf_manifest_param", "CAD service token is present, no further action is needed");
            return false;
        } else if (interfaceC5132bsw.e()) {
            C1044Mm.e("nf_manifest_param", "CAD request is already pending, no further action is needed");
            return false;
        } else {
            C1044Mm.j("nf_manifest_param", "CAD service token is NOT present, create a challenge and send it as part of manifest request.");
            jSONObject.put("challenge", interfaceC5132bsw.c());
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final boolean d(boolean z) {
            return (z && C4369bdH.j()) || C4369bdH.n();
        }

        public final boolean c(boolean z) {
            if (z) {
                return C4369bdH.f() && C4369bdH.l();
            }
            return C4369bdH.o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e() {
            ManifestRequestParamBuilderBase.f13209o = false;
            ManifestRequestParamBuilderBase.t = false;
            ManifestRequestParamBuilderBase.s = false;
            ManifestRequestParamBuilderBase.u = false;
            ManifestRequestParamBuilderBase.l = false;
            ManifestRequestParamBuilderBase.p = false;
            ManifestRequestParamBuilderBase.n = false;
            ManifestRequestParamBuilderBase.k = false;
            ManifestRequestParamBuilderBase.q = false;
        }
    }

    static {
        c cVar = new c(null);
        c = cVar;
        r = ProfileLevel.d;
        cVar.e();
    }

    private final boolean f(String[] strArr) {
        boolean z = this.v;
        if (z) {
            if (strArr == null || strArr.length == 0) {
                return z;
            }
            for (String str : strArr) {
                if (!C8189dfg.e(str, g(), this.e)) {
                    return false;
                }
            }
            getLogTag();
            return true;
        }
        getLogTag();
        return false;
    }
}
