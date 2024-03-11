package o;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuProvider;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;
import o.C1026Lt;
import o.C1030Lx;
import o.C6956cnA;

@ActivityScoped
/* renamed from: o.cmU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6923cmU implements MenuProvider {
    private final NetflixActivity a;
    private MenuItem b;
    private C7056cox d;

    @Inject
    public C6923cmU(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.a = (NetflixActivity) C9726vo.d(activity, NetflixActivity.class);
    }

    private final NetflixFrag a() {
        return this.a.getFragmentHelper().c();
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        C8632dsu.c((Object) menu, "");
        C8632dsu.c((Object) menuInflater, "");
        a(menu);
    }

    private final void a(Menu menu) {
        Drawable d = C9737vz.d(this.a, C1026Lt.a.CW, C1030Lx.d.c);
        if (d != null) {
            MenuItem add = menu.add(0, C6956cnA.e.a, 0, C6956cnA.c.d);
            add.setIcon(d).setShowAsActionFlags(2);
            this.b = add;
        }
    }

    public final boolean a(C7056cox c7056cox) {
        NetflixActionBar.b.C0051b h;
        View view;
        C8632dsu.c((Object) c7056cox, "");
        NetflixActionBar netflixActionBar = this.a.getNetflixActionBar();
        if (netflixActionBar != null) {
            this.d = c7056cox;
            MenuItem menuItem = this.b;
            if (menuItem != null) {
                menuItem.setVisible(c7056cox.a());
            }
            if (c7056cox.e()) {
                this.a.getActionBarStateBuilder().e((CharSequence) this.a.getResources().getString(com.netflix.mediaclient.ui.R.o.eu)).b(false).f(false).i(false).e(true).k(true).l(true).h(false);
                h = this.a.getActionBarStateBuilder().b(ContextCompat.getDrawable(this.a, C1026Lt.a.RC)).b(this.a.getResources().getString(C6956cnA.c.e)).c(new ColorDrawable(ContextCompat.getColor(this.a, C1030Lx.d.j))).e((CharSequence) this.a.getResources().getString(C6956cnA.c.k)).l(true).c(ContextCompat.getColor(this.a, C1030Lx.d.b)).b(false).f(false).i(false).k(true).e(true).h(false);
            } else {
                h = this.a.getActionBarStateBuilder().e((CharSequence) this.a.getResources().getString(com.netflix.mediaclient.ui.R.o.eu)).b(false).f(false).i(false).e(true).k(true).l(true).h(false);
            }
            NetflixFrag a = a();
            h.b((a == null || (view = a.getView()) == null) ? Integer.MAX_VALUE : view.getWidth());
            netflixActionBar.c(h.c());
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        NetflixFrag a = a();
        InterfaceC6927cmY interfaceC6927cmY = a instanceof InterfaceC6927cmY ? (InterfaceC6927cmY) a : null;
        if (interfaceC6927cmY != null) {
            interfaceC6927cmY.c(menuItem);
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.MenuProvider
    public void onPrepareMenu(Menu menu) {
        C8632dsu.c((Object) menu, "");
        super.onPrepareMenu(menu);
        MenuItem menuItem = this.b;
        if (menuItem == null) {
            return;
        }
        C7056cox c7056cox = this.d;
        menuItem.setVisible(c7056cox != null && c7056cox.a() && (a() instanceof InterfaceC6927cmY));
    }
}
