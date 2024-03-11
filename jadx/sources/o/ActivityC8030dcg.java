package o;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.ui.usermarks.impl.UserMarksFragment;

@aIA
/* renamed from: o.dcg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ActivityC8030dcg extends MO {
    public static final c b = new c(null);

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showMdxInMenu() {
        return false;
    }

    /* renamed from: o.dcg$c */
    /* loaded from: classes5.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("UserMarksActivity");
        }

        public final Intent e(Context context) {
            C8632dsu.c((Object) context, "");
            return new Intent(context, ActivityC8030dcg.class);
        }
    }

    @Override // o.MO
    public Fragment d() {
        return UserMarksFragment.j.d();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.UNKNOWN;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        Fragment h = h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag == null || netflixFrag.y()) {
            return;
        }
        super.performUpAction();
    }
}
