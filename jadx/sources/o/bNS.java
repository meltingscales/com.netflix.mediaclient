package o;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import java.util.List;

/* loaded from: classes4.dex */
public interface bNS {
    boolean b(Integer num, Integer num2, Integer num3);

    void c(TrackingInfoHolder trackingInfoHolder, bNK bnk);

    void d(bNK bnk);

    List<String> e();

    boolean e(String str);

    boolean e(InterfaceC5140btD interfaceC5140btD);

    /* loaded from: classes4.dex */
    public static final class a {
        public static boolean b(bNS bns, InterfaceC5140btD interfaceC5140btD) {
            C8632dsu.c((Object) interfaceC5140btD, "");
            return bns.b(interfaceC5140btD.i(), interfaceC5140btD.f(), interfaceC5140btD.o());
        }
    }
}
