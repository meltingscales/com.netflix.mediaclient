package o;

import android.view.Menu;
import android.view.MenuItem;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.command.SearchCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.ui.search.SearchActivity;

/* loaded from: classes4.dex */
public class cRA {
    public static MenuItem a(NetflixActivity netflixActivity, Menu menu) {
        return menu.add(0, com.netflix.mediaclient.ui.R.g.b, 3, com.netflix.mediaclient.ui.R.o.li).setIcon(com.netflix.mediaclient.ui.R.e.ad).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o.cRx
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean d;
                d = cRA.d(menuItem);
                return d;
            }
        }).setIntent(SearchActivity.c(netflixActivity)).setShowAsActionFlags(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(MenuItem menuItem) {
        CLv2Utils cLv2Utils = CLv2Utils.INSTANCE;
        AppView appView = AppView.searchTab;
        cLv2Utils.d(appView, CommandValue.SearchCommand, null, new Focus(appView, null), new SearchCommand(), true, null);
        return false;
    }
}
