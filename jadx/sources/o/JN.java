package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.service.falkor.FalkorAgentStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C8143den;

/* loaded from: classes3.dex */
public class JN extends IS {
    private final boolean f;
    private InterfaceC1242Ud g;
    private final boolean h;
    private final String i;
    private final String j;
    private final TaskMode m;

    @Override // o.IT
    protected boolean e(List<InterfaceC1242Ud> list) {
        return true;
    }

    public JN(C0954Iz<?> c0954Iz, IG ig, C0953Iy c0953Iy, String str, String str2, boolean z, boolean z2, boolean z3, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc, String str3, boolean z4) {
        super(b(z3, str3), c0954Iz, ig, c0953Iy, str, z3, interfaceC1757aNc);
        this.i = str;
        this.j = str2;
        this.h = z;
        this.f = z2;
        this.m = taskMode;
        this.b = z4;
    }

    private static String b(boolean z, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("FetchShowDetails");
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
        List singletonList = Collections.singletonList(this.i);
        C0956Jb.b(list, singletonList, this.j, this.h, this.f, C8153dex.b(), C8171dfO.b(), C8153dex.L(), C8153dex.L(), false);
        this.g = C0956Jb.e(singletonList);
    }

    @Override // o.IS, o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        super.a(interfaceC1757aNc, c1244Uf);
        InterfaceC5194buE interfaceC5194buE = (InterfaceC5194buE) this.d.a(IE.b(SignupConstants.Field.VIDEOS, this.i));
        if (this.h) {
            interfaceC1757aNc.e(interfaceC5194buE, this.d.c(this.g), FalkorAgentStatus.c(InterfaceC1078Nw.aJ, s(), k(), q()));
        } else {
            interfaceC1757aNc.c(interfaceC5194buE, FalkorAgentStatus.c(InterfaceC1078Nw.aJ, s(), k(), q()));
        }
    }

    @Override // o.IS, o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        super.a(interfaceC1757aNc, status);
        if (this.h) {
            interfaceC1757aNc.e(null, null, status);
        } else {
            interfaceC1757aNc.c((InterfaceC5194buE) null, status);
        }
    }

    @Override // o.IT
    protected boolean y() {
        return this.m == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.IT
    protected boolean u() {
        return this.m == TaskMode.FROM_NETWORK;
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
