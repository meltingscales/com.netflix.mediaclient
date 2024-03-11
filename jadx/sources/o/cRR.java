package o;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.ui.search.napa.SearchSuggestionOnNapaFragment;

@aIA
/* loaded from: classes4.dex */
public class cRR extends MO {
    public static final d c = new d(null);

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // o.MO, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // o.MO
    public Fragment d() {
        SearchSuggestionOnNapaFragment.d dVar = SearchSuggestionOnNapaFragment.b;
        Intent intent = getIntent();
        C8632dsu.a(intent, "");
        return dVar.a(intent);
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.searchSuggestionTitleResults;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void onConfigureActionBarState(NetflixActionBar.b.C0051b c0051b) {
        C8632dsu.c((Object) c0051b, "");
        String stringExtra = getIntent().getStringExtra("Title");
        if (C8168dfL.g(stringExtra)) {
            return;
        }
        c0051b.e((CharSequence) stringExtra).l(true);
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final Class<?> c() {
            return NetflixApplication.getInstance().M() ? cRI.class : cRR.class;
        }
    }
}
