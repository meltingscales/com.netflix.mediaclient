package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.List;
import o.C8143den;

@Deprecated
/* loaded from: classes3.dex */
public class JC extends IT {
    private final PlayLocationType f;
    private final String i;
    private final VideoType j;

    public JC(C0954Iz<?> c0954Iz, String str, VideoType videoType, PlayLocationType playLocationType, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchPostPlayVideos", c0954Iz, interfaceC1757aNc);
        this.i = str;
        this.j = videoType;
        this.f = playLocationType;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        Object[] objArr = new Object[3];
        objArr[0] = SignupConstants.Field.VIDEOS;
        objArr[1] = this.i;
        objArr[2] = this.j == VideoType.EPISODE ? "detail" : "summary";
        list.add(IE.b(objArr));
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, this.i, "postPlayExperience");
        list.add(b.c("experienceData"));
        list.add(b.d(IE.b("playbackVideos", IE.a(0, 4), IE.a(0, 4), IE.c("detail", "summary"))));
        this.d.c(IE.b(SignupConstants.Field.VIDEOS, this.i, "postPlayExperience"), IE.b("postPlayExperiences", this.i, "experienceData"), IE.b("postPlayExperiences", this.i, "playbackVideos"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new C8143den.d("ppNewContext", this.f.equals(PlayLocationType.POST_PLAY) ? "false" : "true"));
        return arrayList;
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        interfaceC1757aNc.b((InterfaceC5190buA) this.d.a(IE.b(SignupConstants.Field.VIDEOS, this.i, "summary")), InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.b((InterfaceC5190buA) null, status);
    }
}
