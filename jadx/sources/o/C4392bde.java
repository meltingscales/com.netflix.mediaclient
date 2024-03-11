package o;

import android.content.Context;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase;
import com.netflix.mediaclient.service.player.bladerunnerclient.ManifestType;
import com.netflix.mediaclient.service.webclient.model.leafs.OfflineCodecPrefData;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadVideoQuality;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.bde  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4392bde extends ManifestRequestParamBuilderBase {
    public static final d k = new d(null);
    private String l;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private String f13571o;
    private DownloadVideoQuality r;

    public final C4392bde b(DownloadVideoQuality downloadVideoQuality) {
        this.r = downloadVideoQuality;
        return this;
    }

    public final C4392bde b(String str, String str2) {
        this.n = str;
        this.l = str2;
        return this;
    }

    public final C4392bde d(String str) {
        this.f13571o = str;
        return this;
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public boolean e() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4392bde(Context context, C4394bdg c4394bdg, ConnectivityUtils.NetType netType) {
        super(context, c4394bdg, netType);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c4394bdg, "");
    }

    /* renamed from: o.bde$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("OfflineManifestParamBuilder");
        }
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public String d() {
        String[] j;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : j()) {
                JSONObject jSONObject2 = new JSONObject();
                e(jSONObject2);
                d(jSONObject2, str);
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
    public void a(JSONArray jSONArray, boolean z) {
        C8632dsu.c((Object) jSONArray, "");
        super.a(jSONArray, z);
        if (C4373bdL.c() && this.e.ax()) {
            getLogTag();
            jSONArray.put("ddplus-5.1hq-dash");
        }
    }

    private final void d(JSONObject jSONObject, String str) {
        jSONObject.put("viewableId", str);
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public boolean C() {
        return C8171dfO.d();
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public void f(JSONObject jSONObject) {
        Map d2;
        Map k2;
        Throwable th;
        C8632dsu.c((Object) jSONObject, "");
        jSONObject.put("type", ManifestType.OFFLINE.c());
        jSONObject.put("downloadQuality", this.r);
        String str = this.n;
        if (str == null || this.l == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str2 = "OfflineManifestRequestParamBuilder::setSpecialProperties: Oxid= " + str + ", Dxid= " + this.l;
            d2 = dqE.d();
            k2 = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(str2, null, null, true, k2, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
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
        String str3 = this.n;
        if (str3 != null) {
            jSONObject.put("oxid", str3);
        }
        String str4 = this.l;
        if (str4 != null) {
            jSONObject.put("dxid", str4);
        }
        jSONObject.put("liteDevice", C8171dfO.d());
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public JSONArray a() {
        if (C8168dfL.h(this.f13571o)) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.f13571o);
            c(jSONArray);
            return jSONArray;
        }
        return super.a();
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public boolean r() {
        OfflineCodecPrefData F = this.e.F();
        return F != null && F.isVP9HWCodecEnabled();
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public boolean p() {
        OfflineCodecPrefData F = this.e.F();
        return F != null && F.isXHEAACCodecEnabled();
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public boolean m() {
        OfflineCodecPrefData F = this.e.F();
        return F != null && F.isAVCHighCodecEnabled();
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public boolean l() {
        OfflineCodecPrefData F = this.e.F();
        return F != null && F.isAVCHighCodecForceEnabled();
    }

    @Override // com.netflix.mediaclient.service.player.bladerunnerclient.ManifestRequestParamBuilderBase
    public IPlayer.PlaybackType g() {
        return IPlayer.PlaybackType.OfflinePlayback;
    }
}
