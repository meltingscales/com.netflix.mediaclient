package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.PlaybackContext;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.List;
import o.C8143den;

/* loaded from: classes3.dex */
public final class JJ extends IQ {
    public static final d e = new d(null);
    private final PlaybackContext a;
    private final PlayLocationType b;
    private final boolean c;
    private final boolean d;
    private final VideoType g;
    private final String i;
    private final boolean j;

    @Override // o.IQ, o.IO
    public boolean a() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JJ(String str, VideoType videoType, PlayLocationType playLocationType, boolean z, boolean z2, PlaybackContext playbackContext, boolean z3) {
        super("FetchPostPlayVideosV2");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) playLocationType, "");
        C8632dsu.c((Object) playbackContext, "");
        this.i = str;
        this.g = videoType;
        this.b = playLocationType;
        this.d = z;
        this.c = z2;
        this.a = playbackContext;
        this.j = z3;
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        Object[] objArr = new Object[3];
        objArr[0] = SignupConstants.Field.VIDEOS;
        objArr[1] = this.i;
        objArr[2] = this.g == VideoType.EPISODE ? "detail" : "summary";
        InterfaceC1242Ud b = IE.b(objArr);
        C8632dsu.a(b, "");
        list.add(b);
        InterfaceC1242Ud b2 = IE.b(SignupConstants.Field.VIDEOS, this.i, "postPlayExperience");
        C8632dsu.a(b2, "");
        InterfaceC1242Ud c = b2.c("experienceData");
        C8632dsu.a(c, "");
        list.add(c);
        InterfaceC1242Ud d2 = b2.d(IE.b("playbackVideos", IE.a(0, 4), IE.a(0, 4), IE.c("detail", "summary")));
        C8632dsu.a(d2, "");
        list.add(d2);
    }

    @Override // o.IQ, o.IO
    public List<C8143den.d> b() {
        List<C8143den.d> b = super.b();
        if (b == null) {
            b = new ArrayList<>();
        }
        b.add(new C8143den.d("ppNewContext", this.b == PlayLocationType.POST_PLAY ? "false" : "true"));
        if (this.j) {
            b.add(new C8143den.d("ppPreview3Supported", "true"));
            b.add(new C8143den.d("postPlayPreviewLimit", 3));
        }
        b.add(new C8143den.d("playbackContext", this.a.name()));
        return b;
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8632dsu.c((Object) iy, "");
        InterfaceC8319diD a = iy.d.a(IE.b(SignupConstants.Field.VIDEOS, this.i, "summary"));
        C8632dsu.d(a);
        InterfaceC5190buA interfaceC5190buA = (InterfaceC5190buA) a;
        if (interfaceC1757aNc != null) {
            interfaceC1757aNc.b(interfaceC5190buA, InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.b((InterfaceC5190buA) null, status);
    }
}
