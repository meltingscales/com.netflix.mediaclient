package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.EdgeStack;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public final class aIJ {

    /* loaded from: classes3.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] c;

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
            c = iArr;
        }
    }

    public static final String a(Context context, String str) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        String a = a(context);
        return a + "/" + str;
    }

    public static final String a(Context context) {
        C8632dsu.c((Object) context, "");
        InterfaceC1246Uh r = ((aIL) EntryPointAccessors.fromApplication(context, aIL.class)).r();
        int i = c.c[C1816aPh.b(context).ordinal()];
        if (i == 1 || i == 2) {
            return r.e();
        }
        if (i != 3) {
            if (i == 4) {
                return r.d();
            }
            throw new NoWhenBranchMatchedException();
        }
        return r.b();
    }
}
