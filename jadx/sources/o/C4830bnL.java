package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import o.InterfaceC4660bih;

/* renamed from: o.bnL  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C4830bnL extends BaseEventJson {
    @SerializedName("locations")
    private e[] U;
    @SerializedName("oldserver")
    private String V;
    @SerializedName("mediatype")
    private String W;
    @SerializedName("server")
    private String X;
    @SerializedName("reason")
    private String Y;
    @SerializedName("loclv")
    private int a;
    @SerializedName("serverRegistrationTime")
    private Long ab;
    @SerializedName("streamid")
    private String ac;
    @SerializedName("locrank")
    private int c;
    @SerializedName("locid")
    private String e;

    protected C4830bnL() {
    }

    public C4830bnL(String str, String str2, String str3, String str4, String str5) {
        super("serversel", str, str2, str3, str4, str5);
    }

    public C4830bnL d(long j) {
        c(j);
        return this;
    }

    public C4830bnL b(InterfaceC4660bih.h hVar) {
        this.V = hVar.i;
        this.X = hVar.j;
        this.Y = hVar.g;
        this.W = hVar.e;
        this.a = hVar.a;
        this.c = hVar.b;
        this.e = hVar.c;
        this.U = new e[hVar.d.length];
        this.ac = hVar.f;
        int i = 0;
        while (true) {
            InterfaceC4660bih.g[] gVarArr = hVar.d;
            if (i < gVarArr.length) {
                this.U[i] = new e(gVarArr[i]);
                i++;
            } else {
                this.ab = Long.valueOf(hVar.h);
                return this;
            }
        }
    }

    /* renamed from: o.bnL$e */
    /* loaded from: classes6.dex */
    protected static class e {
        @SerializedName(UmaAlert.ICON_ERROR)
        private String a;
        @SerializedName("probed")
        private Boolean b;
        @SerializedName("servers")
        private b[] d;
        @SerializedName(SignupConstants.Error.DEBUG_FIELD_KEY)
        private String e;

        public e(InterfaceC4660bih.g gVar) {
            this.e = gVar.d;
            this.d = new b[gVar.a.length];
            this.a = gVar.b;
            this.b = Boolean.valueOf(gVar.c);
            int i = 0;
            while (true) {
                InterfaceC4660bih.i[] iVarArr = gVar.a;
                if (i >= iVarArr.length) {
                    return;
                }
                this.d[i] = new b(iVarArr[i]);
                i++;
            }
        }
    }

    /* renamed from: o.bnL$b */
    /* loaded from: classes6.dex */
    protected static class b {
        @SerializedName("pesids")
        private String[] a;
        @SerializedName("cdnid")
        private String c;
        @SerializedName("serveruse")
        private d[] e;

        public b(InterfaceC4660bih.i iVar) {
            this.c = iVar.a;
            this.e = new d[iVar.e.length];
            this.a = iVar.c;
            int i = 0;
            while (true) {
                InterfaceC4660bih.n[] nVarArr = iVar.e;
                if (i >= nVarArr.length) {
                    return;
                }
                this.e[i] = new d(nVarArr[i]);
                i++;
            }
        }
    }

    /* renamed from: o.bnL$d */
    /* loaded from: classes6.dex */
    protected static class d {
        @SerializedName("reason")
        private String a;
        @SerializedName("bitrate")
        private int b;
        @SerializedName("dur")
        private int c;
        @SerializedName("conf")
        private float d;
        @SerializedName("time")
        private long e;
        @SerializedName("tp")
        private int j;

        public d(InterfaceC4660bih.n nVar) {
            this.e = nVar.e;
            this.a = nVar.a;
            this.c = nVar.b;
            this.j = nVar.i;
            this.d = nVar.d;
            this.b = nVar.c;
        }
    }
}
