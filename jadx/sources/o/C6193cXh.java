package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.google.android.material.snackbar.Snackbar;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaCta;
import com.netflix.mediaclient.ui.ums.UserMessageAreaView;
import java.util.Iterator;
import java.util.List;
import o.C8632dsu;
import o.C9834xU;

/* renamed from: o.cXh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6193cXh extends C1045Mp {
    public static final C6193cXh a = new C6193cXh();

    private C6193cXh() {
        super("UmaUtils");
    }

    public static final boolean d(Context context, UmaAlert umaAlert) {
        List<UmaAlert.Device> blockedDevicesList;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) umaAlert, "");
        return a(umaAlert) ? !C8150deu.h() && C8205dfw.e.c(context).e("com.whatsapp") : (C8150deu.h() && (blockedDevicesList = umaAlert.blockedDevicesList()) != null && blockedDevicesList.contains(UmaAlert.Device.TABLET)) ? false : true;
    }

    public static final boolean a(Context context, UmaAlert umaAlert) {
        C8632dsu.c((Object) context, "");
        return (umaAlert == null || umaAlert.isConsumed() || umaAlert.isStale() || !umaAlert.blocking() || !d(context, umaAlert)) ? false : true;
    }

    private static final boolean a(UmaAlert umaAlert) {
        List<UmaCta> ctas = umaAlert.ctas();
        if (ctas != null && !ctas.isEmpty()) {
            for (UmaCta umaCta : ctas) {
                if (C8632dsu.c((Object) umaCta.action(), (Object) UmaCta.ACTION_CONNECT_TO_WHATSAPP)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void d(Activity activity, final String str) {
        Window window;
        View decorView;
        C8632dsu.c((Object) str, "");
        C9726vo.d((activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(com.netflix.mediaclient.ui.R.g.aG), activity != null ? activity.findViewById(com.netflix.mediaclient.ui.R.g.V) : null, new drX<View, View, Snackbar>() { // from class: com.netflix.mediaclient.ui.ums.UmaUtils$showMultiMonthOfferSuccessSnackBar$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            /* renamed from: e */
            public final Snackbar invoke(View view, View view2) {
                C8632dsu.c((Object) view, "");
                C8632dsu.c((Object) view2, "");
                Snackbar make = Snackbar.make(view, str, 0);
                make.getView().setBackgroundResource(C9834xU.c.d);
                make.setAnchorView(view2);
                make.show();
                return make;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(UserMessageAreaView userMessageAreaView, UmaAlert umaAlert) {
        List<UmaCta> headerCtas;
        C8632dsu.c((Object) userMessageAreaView, "");
        UmaCta umaCta = null;
        if (umaAlert != null && (headerCtas = umaAlert.headerCtas()) != null) {
            Iterator<T> it = headerCtas.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((UmaCta) next).ctaType() == UmaCta.CtaType.CLOSE) {
                    umaCta = next;
                    break;
                }
            }
            umaCta = umaCta;
        }
        View findViewById = userMessageAreaView.findViewById(com.netflix.mediaclient.ui.R.g.av);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(umaCta != null ? 0 : 8);
        if (umaCta != null) {
            findViewById.setOnClickListener(userMessageAreaView.e(umaCta));
        }
    }
}
