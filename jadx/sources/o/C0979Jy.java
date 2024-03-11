package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.service.falkor.FalkorAgentStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C8143den;

/* renamed from: o.Jy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0979Jy extends IS {
    private final String f;
    private final TaskMode g;
    private final String i;
    private final boolean j;

    public C0979Jy(C0954Iz<?> c0954Iz, IG ig, C0953Iy c0953Iy, String str, String str2, boolean z, boolean z2, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3, boolean z3) {
        super(d(z, str3), c0954Iz, ig, c0953Iy, str, z, interfaceC1757aNc);
        this.i = str;
        this.f = str2;
        this.j = z2;
        this.g = taskMode;
        this.b = z3;
    }

    private static String d(boolean z, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("FetchMovieDetails");
        if (z) {
            str2 = ":prefetch";
        } else if (str == null || str.isEmpty()) {
            str2 = "";
        } else {
            str2 = ":" + str;
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // o.IS, o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        super.d(list);
        C0956Jb.a(list, Collections.singletonList(this.i), C8171dfO.b());
        if (C8168dfL.h(this.f)) {
            list.add(C0956Jb.e(SignupConstants.Field.VIDEOS, this.i, this.f));
        }
        if (this.j) {
            list.add(IE.b(SignupConstants.Field.VIDEOS, this.i, "trickplayBifUrl"));
        }
        if (C8153dex.L()) {
            list.add(IE.b(SignupConstants.Field.VIDEOS, this.i, "recommendedTrailer"));
            list.add(IE.b(SignupConstants.Field.VIDEOS, this.i, "brandAndGenreBadge"));
        }
    }

    @Override // o.IS, o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        String str;
        super.a(interfaceC1757aNc, c1244Uf);
        InterfaceC5238buw interfaceC5238buw = (InterfaceC5238buw) this.d.a(IE.b(SignupConstants.Field.VIDEOS, this.i));
        if (interfaceC5238buw == null || C8168dfL.g(interfaceC5238buw.getId())) {
            StringBuilder sb = new StringBuilder();
            sb.append("SPY-7519: FetchMovieDetailsTask got weird movie id: ");
            if (interfaceC5238buw == null) {
                str = "null";
            } else {
                str = interfaceC5238buw.getId() + " requested Movie id : " + this.i;
            }
            sb.append(str);
            String sb2 = sb.toString();
            InterfaceC1598aHf.a(new C1596aHd(sb2).b(false));
            C1044Mm.d("FetchMovieDetailsTask", sb2);
            interfaceC1757aNc.a((InterfaceC5238buw) null, (Status) InterfaceC1078Nw.ai);
            return;
        }
        if (interfaceC5238buw instanceof C8329diN) {
            d(this.i, ((C8329diN) interfaceC5238buw).aC());
        }
        interfaceC1757aNc.a(interfaceC5238buw, FalkorAgentStatus.c(InterfaceC1078Nw.aJ, s(), k(), q()));
    }

    @Override // o.IS, o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        super.a(interfaceC1757aNc, status);
        interfaceC1757aNc.a((InterfaceC5238buw) null, status);
    }

    @Override // o.IT
    protected boolean y() {
        return this.g == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.IT
    protected boolean u() {
        return this.g == TaskMode.FROM_NETWORK;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        List<C8143den.d> c = super.c();
        if (c == null) {
            c = new ArrayList<>(2);
        }
        if (C8171dfO.b()) {
            c.add(new C8143den.d("includeBookmark", Boolean.TRUE.toString()));
        }
        return c;
    }
}
