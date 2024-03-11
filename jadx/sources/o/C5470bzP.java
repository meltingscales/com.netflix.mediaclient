package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import com.netflix.mediaclient.ui.collectphone.impl.collectphone.CollectPhoneFragment;

/* renamed from: o.bzP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5470bzP implements CollectPhone {
    public static final e b = new e(null);

    @Override // com.netflix.mediaclient.ui.collectphone.api.CollectPhone
    @SuppressLint({"CheckResult"})
    public void c(Activity activity, boolean z) {
        C8632dsu.c((Object) activity, "");
        NetflixActivity netflixActivity = activity instanceof NetflixActivity ? (NetflixActivity) activity : null;
        if (netflixActivity == null) {
            return;
        }
        CollectPhoneFragment a = CollectPhoneFragment.e.a(z);
        a.setEnterTransition(new C8353dil(false));
        a.setExitTransition(new C8353dil(false));
        netflixActivity.showFullScreenDialog(a);
    }

    /* renamed from: o.bzP$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("CollectPhoneImpl");
        }
    }
}
