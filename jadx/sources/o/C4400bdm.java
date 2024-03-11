package o;

import android.content.Context;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyContentPlaygraph;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_PlaybackConfig;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestFlavor;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamingCodecPrefData;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.util.ConnectivityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.bdm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4400bdm extends ManifestRequestParamBuilderBase {
    public static final e n = new e(null);
    private String k;
    private final String l;

    /* renamed from: o  reason: collision with root package name */
    public String[] f13572o;
    private boolean[] p;
    private C4419beE[] q;
    private String r;
    private String[] s;
    private String[] t;
    private boolean[] v;
    private String[] y;

    public final C4400bdm a(boolean[] zArr) {
        C8632dsu.c((Object) zArr, "");
        this.p = zArr;
        return this;
    }

    public final void a(String str) {
        this.k = str;
    }

    public final C4400bdm b(String str) {
        this.r = str;
        return this;
    }

    public C4400bdm c(boolean[] zArr) {
        C8632dsu.c((Object) zArr, "");
        this.v = zArr;
        return this;
    }

    public final C4400bdm d(C4419beE[] c4419beEArr) {
        C8632dsu.c((Object) c4419beEArr, "");
        this.q = c4419beEArr;
        return this;
    }

    public final void f(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        this.f13572o = strArr;
    }

    public final C4400bdm h(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        this.t = strArr;
        return this;
    }

    public final C4400bdm i(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        this.s = strArr;
        return this;
    }

    public final C4400bdm j(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        this.y = strArr;
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4400bdm(Context context, C4394bdg c4394bdg, ConnectivityUtils.NetType netType, String str) {
        super(context, c4394bdg, netType);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c4394bdg, "");
        C8632dsu.c((Object) str, "");
        this.l = str;
    }

    /* renamed from: o.bdm$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("StreamingManifestParamBuilder2");
        }
    }

    public final String[] B() {
        String[] strArr = this.f13572o;
        if (strArr != null) {
            return strArr;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public String d() {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            int length = j().length;
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = new JSONObject();
                boolean[] zArr = this.p;
                Object[] objArr = null;
                if (zArr == null) {
                    C8632dsu.d("");
                    zArr = null;
                }
                e(jSONObject2, zArr[i]);
                a(jSONObject2, j()[i]);
                String[] strArr = this.s;
                if (strArr == null) {
                    C8632dsu.d("");
                    strArr = null;
                }
                String str = strArr[i];
                String[] strArr2 = this.y;
                if (strArr2 == null) {
                    C8632dsu.d("");
                    strArr2 = null;
                }
                String str2 = strArr2[i];
                String[] strArr3 = this.t;
                if (strArr3 == null) {
                    C8632dsu.d("");
                    strArr3 = null;
                }
                c(jSONObject2, str, str2, strArr3[i]);
                g(jSONObject2);
                boolean[] zArr2 = this.p;
                if (zArr2 == null) {
                    C8632dsu.d("");
                    zArr2 = null;
                }
                jSONObject2.put("isBranching", zArr2[i]);
                boolean[] zArr3 = this.v;
                if (zArr3 == null) {
                    C8632dsu.d("");
                    zArr3 = null;
                }
                if (zArr3[i]) {
                    boolean[] zArr4 = this.p;
                    if (zArr4 == null) {
                        C8632dsu.d("");
                        zArr4 = null;
                    }
                    if (!zArr4[i]) {
                        jSONObject2.put("maxSupportedLanguages", -1);
                        jSONObject2.put("supportsPartialHydration", true);
                    }
                } else {
                    jSONObject2.put("maxSupportedLanguages", 2);
                }
                if (f().length > i && C8168dfL.h(f()[i])) {
                    jSONObject2.put("auxiliaryManifestToken", f()[i]);
                }
                String[] strArr4 = this.t;
                if (strArr4 == null) {
                    C8632dsu.d("");
                    strArr4 = null;
                }
                if (strArr4.length > i) {
                    String[] strArr5 = this.t;
                    if (strArr5 == null) {
                        C8632dsu.d("");
                        strArr5 = null;
                    }
                    if (C8168dfL.h(strArr5[i])) {
                        Object[] objArr2 = this.t;
                        if (objArr2 == null) {
                            C8632dsu.d("");
                        } else {
                            objArr = objArr2;
                        }
                        jSONObject2.put("originalPlaybackContextId", objArr[i]);
                    }
                }
                jSONObject2.putOpt("adBreakToken", this.k);
                jSONArray.put(jSONObject2);
            }
            a(jSONObject);
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        String jSONObject3 = jSONObject.toString();
        C8632dsu.a(jSONObject3, "");
        return jSONObject3;
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public void f(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        if (this.m.v()) {
            return;
        }
        jSONObject.put("isNonMember", true);
        jSONObject.put("preferredTextLocale", this.m.d());
    }

    private final void e(JSONObject jSONObject, boolean z) {
        JSONArray a = a();
        a(a, !z);
        e(a);
        d(a);
        if (H()) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", "primary");
            jSONObject2.put("profiles", a);
            jSONArray.put(jSONObject2);
            jSONObject.put("profileGroups", jSONArray);
        } else {
            jSONObject.put("profiles", a);
        }
        jSONObject.putOpt(SignupConstants.Field.PIN, this.r);
        jSONObject.put("cellularCap", this.l);
        AseConfig aseConfig = this.d;
        if (aseConfig != null && aseConfig.br()) {
            jSONObject.put("requestSegmentVmaf", true);
        }
        b(jSONObject);
        f(jSONObject);
        j(jSONObject);
        if (z) {
            return;
        }
        h(jSONObject);
    }

    public final void j(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        if (H()) {
            C4419beE[] c4419beEArr = this.q;
            if (c4419beEArr == null) {
                C8632dsu.d("");
                c4419beEArr = null;
            }
            C4419beE c4419beE = c4419beEArr[0];
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("xid", B()[0]);
            jSONObject.put("challenges", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("primary", jSONArray);
            jSONObject3.put("challengeBase64", c4419beE.e);
            jSONObject3.put("drmSessionId", c4419beE.c);
            jSONObject3.put("clientTime", c4419beE.d / 1000);
            if (this.a == ManifestRequestFlavor.STANDARD) {
                jSONObject.put("licenseType", "standard");
            } else {
                jSONObject.put("licenseType", "limited");
            }
        }
    }

    private final boolean H() {
        C4419beE[] c4419beEArr = this.q;
        C4419beE[] c4419beEArr2 = null;
        if (c4419beEArr == null) {
            C8632dsu.d("");
            c4419beEArr = null;
        }
        if (!(c4419beEArr.length == 0)) {
            C4419beE[] c4419beEArr3 = this.q;
            if (c4419beEArr3 == null) {
                C8632dsu.d("");
            } else {
                c4419beEArr2 = c4419beEArr3;
            }
            if (c4419beEArr2[0] != null && (this.a != ManifestRequestFlavor.STANDARD || B().length != 0)) {
                return true;
            }
        }
        return false;
    }

    private final void a(JSONObject jSONObject, String str) {
        jSONObject.put("viewableId", str);
    }

    private final void h(JSONObject jSONObject) {
        ConfigFastPropertyContentPlaygraph.b bVar = ConfigFastPropertyContentPlaygraph.Companion;
        if (bVar.a()) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("start");
            jSONObject.put("contentPlaygraph", jSONArray);
            if (bVar.b()) {
                jSONObject.put("supportsAuxiliaryManifestDeduplication", true);
            }
        }
    }

    private final void g(JSONObject jSONObject) {
        if (Config_FastProperty_PlaybackConfig.requestLive() && y()) {
            jSONObject.put("liveMetadataFormat", "INDEXED_SEGMENT_TEMPLATE");
        }
    }

    private final void c(JSONObject jSONObject, String str, String str2, String str3) {
        if (C8168dfL.h(str)) {
            jSONObject.put("requiredAudioTrackId", str);
        }
        if (C8168dfL.h(str2)) {
            jSONObject.put("requiredTextTrackId", str2);
        }
        if (str3 != null) {
            jSONObject.put("originalPlaybackContextId", str3);
        }
    }

    public final C4400bdm n(String[] strArr) {
        C8632dsu.c((Object) strArr, "");
        f(strArr);
        return this;
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public boolean r() {
        StreamingCodecPrefData U = this.e.U();
        return U != null && U.isVP9HWCodecEnabled();
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public boolean m() {
        StreamingCodecPrefData U = this.e.U();
        return U != null && U.isAVCHighCodecEnabled();
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public boolean l() {
        StreamingCodecPrefData U = this.e.U();
        return U != null && U.isAVCHighCodecForceEnabled();
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public boolean p() {
        StreamingCodecPrefData U = this.e.U();
        return U != null && U.isXHEAACCodecEnabled();
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public IPlayer.PlaybackType g() {
        return IPlayer.PlaybackType.StreamingPlayback;
    }
}
