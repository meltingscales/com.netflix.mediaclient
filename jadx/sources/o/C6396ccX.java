package o;

import android.text.TextUtils;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import java.util.List;

/* renamed from: o.ccX  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6396ccX implements InterfaceC6394ccV {
    private final List<Integer> a;
    private final String b;

    public C6396ccX(String str, List<Integer> list) {
        this.b = str;
        this.a = list;
    }

    @Override // o.InterfaceC6394ccV
    public boolean d(InterfaceC5125bsp interfaceC5125bsp, String str, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        if (TextUtils.isEmpty(str)) {
            return interfaceC5125bsp.c(this.b, i, i2, interfaceC5094bsK);
        }
        return interfaceC5125bsp.b(str, i, i2, interfaceC5094bsK);
    }

    @Override // o.InterfaceC6394ccV
    public void d(InterfaceC5125bsp interfaceC5125bsp, String str, String str2, String str3, String str4) {
        interfaceC5125bsp.c(str2, str, str3, str4);
    }

    @Override // o.InterfaceC6394ccV
    public boolean a(InterfaceC5125bsp interfaceC5125bsp, LoMo loMo, int i, int i2, boolean z, boolean z2, InterfaceC5094bsK interfaceC5094bsK) {
        return interfaceC5125bsp.b(loMo, i, i2, z, z2, interfaceC5094bsK);
    }

    @Override // o.InterfaceC6394ccV
    public int c(boolean z) {
        return C8153dex.e(z);
    }
}
