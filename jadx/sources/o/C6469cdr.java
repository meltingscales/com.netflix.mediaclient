package o;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.model.leafs.originals.BillboardAsset;
import io.reactivex.Single;
import java.util.Map;
import kotlin.Pair;
import o.C9646uN;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC6419ccu;

/* renamed from: o.cdr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6469cdr {
    public static final C6469cdr b = new C6469cdr();

    private C6469cdr() {
    }

    public static final int c(Context context, boolean z) {
        if (context != null) {
            if (C8150deu.y(context) && !C8150deu.h()) {
                return b.e(context, z);
            }
            return b.a(context, z);
        }
        return 0;
    }

    private final int e(Context context, boolean z) {
        float d;
        float f;
        int i;
        int i2;
        if (InterfaceC6419ccu.c.b(context)) {
            if (C8171dfO.e()) {
                return InterfaceC6419ccu.c.e.a(context);
            }
            if (z) {
                i = C8657dts.i(InterfaceC6419ccu.c.e.d(context, false), context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.d));
                i2 = C8657dts.i((int) (C8150deu.l(context) * 0.65d), ((int) (i * 1.45d)) - (context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.b) * 2));
                return i2;
            }
            d = InterfaceC6419ccu.c.e.d(context, false);
            f = 1.45f;
        } else {
            d = InterfaceC6419ccu.c.e.d(context, false);
            f = 0.5625f;
        }
        return (int) (d * f);
    }

    private final int a(Context context, boolean z) {
        int i;
        if (z) {
            i = C8657dts.i((int) (C8150deu.l(context) * 0.6f), (int) (InterfaceC6419ccu.c.e.d(context, false) / 1.778f));
            return i;
        }
        return (int) (InterfaceC6419ccu.c.e.d(context, false) / 2.39f);
    }

    public static final Single<C9646uN.e> e(Context context, BillboardAsset billboardAsset) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) billboardAsset, "");
        String url = billboardAsset.getUrl();
        if (url != null) {
            InterfaceC9638uF d = InterfaceC9638uF.a.d(context);
            C9646uN e = C9646uN.d.d((FragmentActivity) C9737vz.e(context, FragmentActivity.class)).e(url);
            Integer width = billboardAsset.getWidth();
            C8632dsu.a(width, "");
            C9646uN a = e.a(width.intValue());
            Integer height = billboardAsset.getHeight();
            C8632dsu.a(height, "");
            return d.d(a.b(height.intValue()).b());
        }
        return null;
    }

    public static final Single<C9646uN.e> a(Context context, BillboardAsset billboardAsset) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) billboardAsset, "");
        String url = billboardAsset.getUrl();
        if (url != null) {
            InterfaceC9638uF d = InterfaceC9638uF.a.d(context);
            C9646uN e = C9646uN.d.d((FragmentActivity) C9737vz.e(context, FragmentActivity.class)).e(url);
            Integer width = billboardAsset.getWidth();
            C8632dsu.a(width, "");
            C9646uN a = e.a(width.intValue());
            Integer height = billboardAsset.getHeight();
            C8632dsu.a(height, "");
            return d.d(a.b(height.intValue()).b());
        }
        return null;
    }

    public static final void d(InterfaceC5180btr interfaceC5180btr) {
        Map c;
        Map k;
        Throwable th;
        InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = dpD.a("null", String.valueOf(interfaceC5180btr == null));
        pairArr[1] = dpD.a(SignupConstants.Field.VIDEO_ID, String.valueOf(interfaceC5180btr != null ? interfaceC5180btr.getId() : null));
        pairArr[2] = dpD.a("type", String.valueOf(interfaceC5180btr != null ? interfaceC5180btr.getType() : null));
        c = dqE.c(pairArr);
        k = dqE.k(c);
        C1596aHd c1596aHd = new C1596aHd("SPY-35014 - Billboard Data missing summary when trying to render billboard", null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                String c2 = errorType.c();
                c1596aHd.a(c2 + " " + b2);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1597aHe c3 = dVar2.c();
        if (c3 != null) {
            c3.d(c1596aHd, th);
        } else {
            dVar2.e().b(c1596aHd, th);
        }
    }
}
