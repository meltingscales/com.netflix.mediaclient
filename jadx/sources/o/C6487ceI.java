package o;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag;

/* renamed from: o.ceI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6487ceI extends View$OnClickListenerC1217Te {
    public static final c b = new c(null);
    public static final int d = 8;
    private final NetflixActivity c;
    private final boolean e;
    private final bDG f;
    private final bDT g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6487ceI(NetflixActivity netflixActivity, bDG bdg, bDT bdt, boolean z) {
        super(netflixActivity, bdg);
        C8632dsu.c((Object) bdg, "");
        C8632dsu.c((Object) bdt, "");
        this.c = netflixActivity;
        this.f = bdg;
        this.g = bdt;
        this.e = z;
    }

    /* renamed from: o.ceI$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("QuickDrawVideoDetailsClickListener");
        }
    }

    @Override // o.View$OnClickListenerC1217Te, android.view.View.OnClickListener
    public void onClick(View view) {
        NetflixActivity netflixActivity;
        C8632dsu.c((Object) view, "");
        if (this.e && (netflixActivity = (NetflixActivity) C8054ddD.a(view.getContext(), NetflixActivity.class)) != null) {
            View currentFocus = netflixActivity.getCurrentFocus();
            EditText editText = currentFocus instanceof EditText ? (EditText) currentFocus : null;
            if (editText != null) {
                C8150deu.b(netflixActivity, editText);
                view.getParent().requestLayout();
            }
        }
        Object tag = view.getTag(com.netflix.mediaclient.ui.R.g.gS);
        if (tag == null) {
            return;
        }
        C8632dsu.a(this.f.y_(), "");
        b.getLogTag();
        CLv2Utils.INSTANCE.b(new Focus(AppView.boxArt, e()), (Command) new ViewDetailsCommand(), false);
        d((InterfaceC8366diy) tag);
    }

    public void d(final InterfaceC8366diy interfaceC8366diy) {
        Handler handler;
        C8632dsu.c((Object) interfaceC8366diy, "");
        NetflixActivity netflixActivity = this.c;
        if (netflixActivity == null || (handler = netflixActivity.getHandler()) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: o.ceN
            @Override // java.lang.Runnable
            public final void run() {
                C6487ceI.c(C6487ceI.this, interfaceC8366diy);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C6487ceI c6487ceI, InterfaceC8366diy interfaceC8366diy) {
        C8632dsu.c((Object) c6487ceI, "");
        C8632dsu.c((Object) interfaceC8366diy, "");
        QuickDrawDialogFrag.d dVar = QuickDrawDialogFrag.e;
        NetflixActivity netflixActivity = c6487ceI.c;
        String id = interfaceC8366diy.getId();
        C8632dsu.a(id, "");
        TrackingInfoHolder d2 = c6487ceI.g.d();
        C8632dsu.a(d2, "");
        QuickDrawDialogFrag.d.a(dVar, netflixActivity, id, d2, false, null, 24, null);
    }
}
