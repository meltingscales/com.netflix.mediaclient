package o;

import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Js  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0973Js extends IT {
    private final TaskMode g;
    private final InterfaceC1242Ud h;

    public C0973Js(C0954Iz<?> c0954Iz, String str, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchGenreList", c0954Iz, interfaceC1757aNc);
        this.h = IE.b(str);
        this.g = taskMode;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(this.h);
    }

    @Override // o.IT
    public Request.Priority b() {
        return Request.Priority.NORMAL;
    }

    @Override // o.IT
    protected boolean y() {
        return this.g == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.IT
    protected boolean u() {
        return this.g == TaskMode.FROM_NETWORK;
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        InterfaceC8322diG b = this.d.b(this.h);
        if (b instanceof IH) {
            interfaceC1757aNc.j(new ArrayList((List) ((IH) b).a()), InterfaceC1078Nw.aJ);
        } else {
            interfaceC1757aNc.j(Collections.emptyList(), InterfaceC1078Nw.ai);
        }
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.j(Collections.emptyList(), status);
    }
}
