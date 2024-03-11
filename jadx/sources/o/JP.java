package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class JP extends IT {
    private InterfaceC1242Ud f;
    private final String i;
    private final TaskMode j;

    public JP(C0954Iz<?> c0954Iz, String str, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchSeasons", c0954Iz, interfaceC1757aNc);
        this.i = str;
        this.j = taskMode;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(IE.b(SignupConstants.Field.VIDEOS, this.i, "seasons", "summary"));
        InterfaceC1242Ud e = C0956Jb.e(Collections.singletonList(this.i));
        this.f = e;
        list.add(e);
    }

    @Override // o.IT
    protected boolean y() {
        return this.j == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.IT
    protected boolean u() {
        return this.j == TaskMode.FROM_NETWORK;
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        interfaceC1757aNc.i(this.d.c(this.f), InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.i(Collections.emptyList(), status);
    }
}
