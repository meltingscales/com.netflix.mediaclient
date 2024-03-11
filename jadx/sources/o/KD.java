package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.List;

/* loaded from: classes3.dex */
public final class KD extends AbstractC0985Ke<InterfaceC8366diy> {
    private final String a;
    private final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KD(String str, boolean z) {
        super("VideoVolatileNodes", TaskMode.FROM_NETWORK, false, 4, null);
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.d = z;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        C0956Jb.d(list, this.a, this.d);
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: b */
    public InterfaceC8366diy e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b = interfaceC1240Ub.b(IE.b(SignupConstants.Field.VIDEOS, this.a));
        if (b instanceof InterfaceC8366diy) {
            return (InterfaceC8366diy) b;
        }
        return null;
    }
}
