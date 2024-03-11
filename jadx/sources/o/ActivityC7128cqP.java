package o;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsActivity;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONObject;

/* renamed from: o.cqP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ActivityC7128cqP extends MultiTitleNotificationsActivity {
    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void initToolbar() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        Map d;
        Map k;
        Throwable th;
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        C8632dsu.a(decorView, "");
        if (decorView.getLayoutParams() instanceof WindowManager.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = decorView.getLayoutParams();
            C8632dsu.d(layoutParams);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            layoutParams2.gravity = 17;
            layoutParams2.dimAmount = 0.85f;
            layoutParams2.flags = 2;
        } else if (decorView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams3 = decorView.getLayoutParams();
            C8632dsu.d(layoutParams3);
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 17;
        } else {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = "MultiTitleNotificationsTabletActivity unexpected class " + decorView.getLayoutParams().getClass().getSimpleName();
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    @Override // com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsActivity, o.MO
    public Fragment d() {
        return new C7130cqR();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        if (motionEvent.getAction() == 0) {
            super.b(new TrackingInfo() { // from class: o.cqS
                @Override // com.netflix.cl.model.JsonSerializer
                public final JSONObject toJSONObject() {
                    JSONObject t;
                    t = ActivityC7128cqP.t();
                    return t;
                }
            });
            finish();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject t() {
        return new JSONObject().put("actionType", "dismiss");
    }
}
