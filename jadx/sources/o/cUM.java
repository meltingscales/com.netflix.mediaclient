package o;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;

@aIA
/* loaded from: classes4.dex */
public class cUM extends MO {
    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean canApplyBrowseExperience() {
        return true;
    }

    @Override // o.MO
    public int j() {
        return com.netflix.mediaclient.ui.R.i.Y;
    }

    public static Intent c(Context context) {
        return new Intent(context, c());
    }

    public static Class<?> c() {
        return NetflixApplication.getInstance().M() ? cUN.class : cUM.class;
    }

    @Override // o.MO
    public Fragment d() {
        return new cUI();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.openSourceLicenses;
    }
}
