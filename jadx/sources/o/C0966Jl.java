package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: o.Jl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0966Jl extends IV {
    private static final List<InterfaceC1242Ud> j = C0956Jb.a();
    private final int f;
    private final int g;
    private final String h;
    private final TaskMode i;

    @Override // o.IT
    protected boolean e(List<InterfaceC1242Ud> list) {
        return true;
    }

    public C0966Jl(C0954Iz<?> c0954Iz, IG ig, String str, TaskMode taskMode, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchEpisodes", c0954Iz, ig, interfaceC1757aNc);
        this.h = str;
        this.i = taskMode;
        this.f = i;
        this.g = i2;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(IE.b(SignupConstants.Field.VIDEOS, this.h, "episodes", IE.a(this.f, this.g), j));
    }

    @Override // o.IT
    protected boolean y() {
        return this.i == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.IT
    protected boolean u() {
        return this.i == TaskMode.FROM_NETWORK;
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        List<InterfaceC5227bul> b = this.d.b(c1244Uf.e);
        if (b != null) {
            for (InterfaceC5227bul interfaceC5227bul : b) {
                if (interfaceC5227bul != null && (interfaceC5227bul instanceof C8329diN)) {
                    C8329diN c8329diN = (C8329diN) interfaceC5227bul;
                    d(c8329diN.aE_().aH_(), c8329diN.aC());
                }
            }
        }
        interfaceC1757aNc.b(b, InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.b(Collections.emptyList(), status);
    }
}
