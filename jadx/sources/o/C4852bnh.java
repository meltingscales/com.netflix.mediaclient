package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.CurrentNetworkInfo;
import java.util.List;

/* renamed from: o.bnh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4852bnh extends BaseEventJson {
    @SerializedName("netspec")
    protected CurrentNetworkInfo.NetSpec U;
    @SerializedName("mnc")
    protected Integer V;
    @SerializedName("metered")
    protected CurrentNetworkInfo.MeteredState W;
    @SerializedName("nettype")
    protected CurrentNetworkInfo.NetType X;
    @SerializedName("carrier")
    protected String a;
    @SerializedName("capabilities")
    protected List<String> c;
    @SerializedName("mcc")
    protected Integer e;

    protected C4852bnh() {
    }

    public C4852bnh(String str, String str2, String str3, String str4, String str5) {
        super("networksel", str, str2, str3, str4, str5);
    }

    public C4852bnh c(CurrentNetworkInfo currentNetworkInfo) {
        this.a = currentNetworkInfo.e();
        this.e = currentNetworkInfo.b();
        this.V = currentNetworkInfo.h();
        this.X = currentNetworkInfo.j();
        this.U = currentNetworkInfo.f();
        this.W = currentNetworkInfo.g();
        this.c = currentNetworkInfo.a();
        return this;
    }
}
