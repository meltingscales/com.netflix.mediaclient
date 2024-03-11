package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.ExceptionOccurred;

/* loaded from: classes3.dex */
public interface aPV {
    String b();

    boolean c();

    void d();

    /* loaded from: classes3.dex */
    public static final class a {
        public static void c(aPV apv) {
            C8157dfA.e(AbstractApplicationC1040Mh.d(), "disable_widevine");
            Logger.INSTANCE.logEvent(new ExceptionOccurred(Boolean.FALSE, apv.b()));
        }
    }
}
