package o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.model.survey.Survey;

@aIA
/* loaded from: classes4.dex */
public class cVF extends MO {
    public static final a b = new a(null);

    public static final void a(Activity activity, Survey survey) {
        b.c(activity, survey);
    }

    public static final boolean c(NetflixActivity netflixActivity) {
        return b.a(netflixActivity);
    }

    @Override // o.MO, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldAttachToolbar() {
        return false;
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Survey survey = (Survey) getIntent().getParcelableExtra("extra_survey");
        if (survey == null || survey.e() == 0 || survey.c() == null) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.MO
    /* renamed from: c */
    public cVK d() {
        return cVK.b.b((Survey) getIntent().getParcelableExtra("extra_survey"));
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.survey;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        private final Class<? extends cVF> d() {
            return NetflixApplication.getInstance().M() ? cVI.class : cVF.class;
        }

        public final boolean a(NetflixActivity netflixActivity) {
            C8632dsu.c((Object) netflixActivity, "");
            return !C8126deW.a();
        }

        public final void c(Activity activity, Survey survey) {
            C8632dsu.c((Object) activity, "");
            C8632dsu.c((Object) survey, "");
            Intent putExtra = new Intent(activity, d()).addFlags(131072).putExtra("extra_survey", survey);
            C8632dsu.a(putExtra, "");
            activity.startActivity(putExtra);
        }
    }
}
