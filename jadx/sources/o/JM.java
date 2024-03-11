package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.List;

/* loaded from: classes3.dex */
public class JM extends IQ {
    private final InterfaceC1242Ud a;
    private final InterfaceC1242Ud e;

    public JM(String str, VideoType videoType, boolean z) {
        super("FetchSims");
        InterfaceC1242Ud interfaceC1242Ud;
        Object[] objArr = new Object[5];
        objArr[0] = SignupConstants.Field.VIDEOS;
        objArr[1] = str;
        objArr[2] = z ? "originalSimilars" : "similars";
        objArr[3] = IE.a(23);
        objArr[4] = IE.c("summary", "bookmark");
        this.a = IE.b(objArr);
        if (videoType == VideoType.SHOW) {
            Object[] objArr2 = new Object[7];
            objArr2[0] = SignupConstants.Field.VIDEOS;
            objArr2[1] = str;
            objArr2[2] = z ? "originalSimilars" : "similars";
            objArr2[3] = IE.a(23);
            objArr2[4] = "episodes";
            objArr2[5] = "current";
            objArr2[6] = IE.c("detail", "bookmark");
            interfaceC1242Ud = IE.b(objArr2);
        } else {
            interfaceC1242Ud = null;
        }
        this.e = interfaceC1242Ud;
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        list.add(this.a);
        InterfaceC1242Ud interfaceC1242Ud = this.e;
        if (interfaceC1242Ud != null) {
            list.add(interfaceC1242Ud);
        }
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        List<InterfaceC8366diy> c = iy.d.c(this.a);
        if (c == null) {
            interfaceC1757aNc.l(null, InterfaceC1078Nw.ai);
        } else {
            interfaceC1757aNc.l(c, InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.l(null, status);
    }
}
