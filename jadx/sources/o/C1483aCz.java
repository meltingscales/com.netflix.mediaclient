package o;

import com.netflix.mediaclient.service.configuration.EdgeStack;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import java.net.URL;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;

@Singleton
/* renamed from: o.aCz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1483aCz implements InterfaceC1475aCr {

    /* renamed from: o.aCz$a */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EdgeStack.values().length];
            try {
                iArr[EdgeStack.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EdgeStack.TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EdgeStack.STAGING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EdgeStack.PROD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr;
        }
    }

    @Override // o.InterfaceC1475aCr
    public String c() {
        URL e;
        aOV d = AbstractApplicationC1040Mh.getInstance().i().d();
        if (d != null) {
            ApiEndpointRegistry j = d.j();
            String externalForm = (j == null || (e = j.e()) == null) ? null : e.toExternalForm();
            if (externalForm != null && externalForm.length() > 0) {
                return externalForm;
            }
        }
        return d();
    }

    private final String d() {
        String str;
        AbstractApplicationC1040Mh abstractApplicationC1040Mh = AbstractApplicationC1040Mh.getInstance();
        C8632dsu.a(abstractApplicationC1040Mh, "");
        int i = a.b[C1816aPh.b(abstractApplicationC1040Mh).ordinal()];
        if (i == 1) {
            str = "android.int.cloud.netflix.com";
        } else if (i == 2) {
            str = "android.test.cloud.netflix.com";
        } else if (i == 3) {
            str = "android.staging.cloud.netflix.com";
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "android.prod.cloud.netflix.com";
        }
        return "https://" + str + "/graphql";
    }
}
