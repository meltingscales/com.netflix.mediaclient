package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.List;

/* loaded from: classes3.dex */
public class JZ extends IQ {
    private final String b;

    public JZ(VideoType videoType, String str) {
        super("FetchVideoShareInfoTask");
        C1044Mm.e("FetchVideoShareInfoTaskTask", "FetchVideoShareInfoTask videoType: " + videoType + " videoId: " + str);
        this.b = str;
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        list.add(IE.b(SignupConstants.Field.VIDEOS, this.b, "sharing"));
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        String str;
        InterfaceC5198buI interfaceC5198buI = (InterfaceC5198buI) iy.d.a(IE.b(SignupConstants.Field.VIDEOS, this.b));
        if (interfaceC5198buI == null || C8168dfL.g(interfaceC5198buI.getId())) {
            StringBuilder sb = new StringBuilder();
            sb.append("SPY-7519: FetchVideoShareInfoTask got weird video id: ");
            if (interfaceC5198buI == null) {
                str = "null";
            } else {
                str = interfaceC5198buI.getId() + " requested video id : " + this.b;
            }
            sb.append(str);
            String sb2 = sb.toString();
            InterfaceC1598aHf.a(new C1596aHd(sb2).b(false));
            C1044Mm.d("FetchVideoShareInfoTaskTask", sb2);
            interfaceC1757aNc.a((InterfaceC5198buI) null, InterfaceC1078Nw.ai);
            return;
        }
        interfaceC1757aNc.a(interfaceC5198buI, InterfaceC1078Nw.aJ);
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.a((InterfaceC5198buI) null, status);
    }
}
