package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: o.Jj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0964Jj extends IV {
    private final String f;
    private final boolean g;
    private final TaskMode h;
    private final String i;

    public C0964Jj(C0954Iz<?> c0954Iz, IG ig, String str, String str2, boolean z, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3) {
        super(c(str3), c0954Iz, ig, interfaceC1757aNc);
        this.f = str;
        this.i = str2;
        this.g = z;
        this.h = taskMode;
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return "FetchEpisodeDetails";
        }
        return "FetchEpisodeDetails:" + str;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(IE.c("summary", "detail", "bookmark", "offlineAvailable", "rating", "timeCodes", "advisories", "synopsisDP"));
        list.add(IE.b(SignupConstants.Field.VIDEOS, this.f, "watchNext", arrayList));
        if (this.g) {
            arrayList.add("trickplayBifUrl");
        }
        list.add(IE.b(SignupConstants.Field.VIDEOS, this.f, arrayList));
        if (C8168dfL.h(this.i)) {
            list.add(C0956Jb.e(VideoType.EPISODE.getValue(), this.f, this.i));
        }
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        InterfaceC5227bul interfaceC5227bul = (InterfaceC5227bul) this.d.a(IE.b(SignupConstants.Field.VIDEOS, this.f));
        if (interfaceC5227bul != null && (interfaceC5227bul instanceof C8329diN)) {
            d(this.f, ((C8329diN) interfaceC5227bul).aC());
        }
        interfaceC1757aNc.a(interfaceC5227bul, (Status) InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.a((InterfaceC5227bul) null, status);
    }

    @Override // o.IT
    protected boolean y() {
        return this.h == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.IT
    protected boolean u() {
        return this.h == TaskMode.FROM_NETWORK;
    }
}
