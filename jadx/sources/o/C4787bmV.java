package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import o.InterfaceC4660bih;

/* renamed from: o.bmV  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C4787bmV extends BaseEventJson {
    @SerializedName("mediatype")
    protected String U;
    @SerializedName("loclv")
    protected int V;
    @SerializedName("locrank")
    protected int W;
    @SerializedName("locid")
    protected String X;
    @SerializedName("oldcdnid")
    protected Integer Y;
    @SerializedName("selcdnbw")
    protected Integer Z;
    @SerializedName("cdnrank")
    protected Integer a;
    @SerializedName("selreason")
    protected String aa;
    @SerializedName("pricdnid")
    protected Integer ab;
    @SerializedName("cdnbwdata")
    protected a[] ac;
    @SerializedName("selcdnid")
    protected Integer ad;
    @SerializedName("selcdnrtt")
    protected Integer af;
    @SerializedName("testreason")
    protected String ag;
    @SerializedName("streamid")
    protected String ah;
    @SerializedName("cdninfo")
    protected e[] c;
    @SerializedName("fastselthreshold")
    protected Integer e;

    protected C4787bmV() {
    }

    public C4787bmV(String str, String str2, String str3, String str4, String str5) {
        super("cdnsel", str, str2, str3, str4, str5);
    }

    public C4787bmV a(long j) {
        c(j);
        return this;
    }

    public C4787bmV e(InterfaceC4660bih.e eVar) {
        if (eVar != null) {
            this.Y = Integer.valueOf(eVar.m);
        }
        return this;
    }

    public C4787bmV a(InterfaceC4660bih.e eVar) {
        this.e = Integer.valueOf(eVar.a);
        this.ab = Integer.valueOf(eVar.g);
        this.Z = Integer.valueOf(eVar.n);
        this.ad = Integer.valueOf(eVar.m);
        this.af = Integer.valueOf(eVar.k);
        this.aa = eVar.l;
        this.ag = eVar.r;
        this.U = eVar.j;
        this.X = eVar.e;
        this.V = eVar.f;
        this.W = eVar.i;
        this.ah = eVar.q;
        this.a = Integer.valueOf(eVar.d);
        InterfaceC4660bih.c[] cVarArr = eVar.b;
        int i = 0;
        if (cVarArr != null) {
            this.ac = new a[cVarArr.length];
            int length = cVarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                this.ac[i3] = a.e(cVarArr[i2]);
                i2++;
                i3++;
            }
        }
        InterfaceC4660bih.d[] dVarArr = eVar.c;
        if (dVarArr != null) {
            this.c = new e[dVarArr.length];
            int length2 = dVarArr.length;
            int i4 = 0;
            while (i < length2) {
                this.c[i4] = e.c(dVarArr[i]);
                i++;
                i4++;
            }
        }
        return this;
    }

    /* renamed from: o.bmV$e */
    /* loaded from: classes6.dex */
    protected static class e {
        @SerializedName("level")
        protected Integer a;
        @SerializedName("duration")
        public long b;
        @SerializedName(SignupConstants.Field.LANG_ID)
        protected int c;
        @SerializedName("cdnrank")
        public int d;
        @SerializedName("locid")
        protected String e;
        @SerializedName("rk")
        protected Integer f;
        @SerializedName("nm")
        protected String g;
        @SerializedName("wt")
        protected Integer i;
        @SerializedName("lowg")
        protected boolean j;

        protected e() {
        }

        public static e c(InterfaceC4660bih.d dVar) {
            e eVar = new e();
            eVar.c = dVar.b;
            eVar.g = dVar.j;
            eVar.f = Integer.valueOf(dVar.i);
            eVar.i = Integer.valueOf(dVar.n);
            eVar.e = dVar.f;
            eVar.a = Integer.valueOf(dVar.e);
            eVar.j = dVar.g;
            eVar.b = dVar.c;
            eVar.d = dVar.d;
            return eVar;
        }
    }

    /* renamed from: o.bmV$a */
    /* loaded from: classes6.dex */
    protected static class a {
        @SerializedName("rtt")
        protected Integer a;
        @SerializedName(SignupConstants.Field.LANG_ID)
        protected String b;
        @SerializedName("locid")
        protected String c;
        @SerializedName("bw")
        protected Integer d;
        @SerializedName("ip")
        protected String e;

        protected a() {
        }

        public static a e(InterfaceC4660bih.c cVar) {
            a aVar = new a();
            aVar.b = cVar.b;
            aVar.c = cVar.d;
            aVar.e = cVar.e;
            aVar.a = Integer.valueOf(cVar.c);
            aVar.d = Integer.valueOf(cVar.a);
            return aVar;
        }
    }
}
