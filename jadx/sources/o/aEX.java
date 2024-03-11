package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;

/* loaded from: classes3.dex */
public class aEX implements InterfaceC5223buh {
    public static final e a = new e(null);
    private final String c;
    private final String d;
    private final C2630ajh e;

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return this.c;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        return this.d;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    public aEX(C2630ajh c2630ajh, String str, String str2) {
        C8632dsu.c((Object) c2630ajh, "");
        this.e = c2630ajh;
        this.d = str;
        this.c = str2;
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final VideoType c(String str) {
            C8632dsu.c((Object) str, "");
            return C8632dsu.c((Object) str, (Object) C2988aqU.e.c().b()) ? VideoType.MOVIE : C8632dsu.c((Object) str, (Object) C3226auv.e.e().b()) ? VideoType.SHOW : C8632dsu.c((Object) str, (Object) C2879aoR.b.c().b()) ? VideoType.EPISODE : C8632dsu.c((Object) str, (Object) C3215auk.e.e().b()) ? VideoType.SEASON : C8632dsu.c((Object) str, (Object) C3180auA.c.b().b()) ? VideoType.SUPPLEMENTAL : C8632dsu.c((Object) str, (Object) C2942apb.d.c().b()) ? VideoType.GAMES : VideoType.UNKNOWN;
        }

        public final VideoType e(C2630ajh c2630ajh) {
            C8632dsu.c((Object) c2630ajh, "");
            return c(c2630ajh.h());
        }
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return String.valueOf(this.e.e());
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String c = this.e.c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return a.e(this.e);
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.e.b();
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        Boolean d = this.e.d();
        if (d != null) {
            return d.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        Boolean i = this.e.i();
        if (i != null) {
            return i.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        Boolean f = this.e.f();
        if (f != null) {
            return f.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        Boolean g = this.e.g();
        if (g != null) {
            return g.booleanValue();
        }
        return true;
    }
}
