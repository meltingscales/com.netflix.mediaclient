package o;

import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;

/* loaded from: classes3.dex */
public interface VH {
    VX a();

    void a(ConnectionState connectionState);

    ConnectionState b();

    void b(InterfaceC5283bvo interfaceC5283bvo);

    void c();

    InterfaceC8822dzv<ConnectionState> d();

    InterfaceC8822dzv<VX> e();

    void e(VX vx, boolean z, String str);

    boolean f();

    /* loaded from: classes3.dex */
    public static final class d {
        public static /* synthetic */ void e(VH vh, VX vx, boolean z, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setConnectedTargetDevice");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            vh.e(vx, z, str);
        }
    }
}
