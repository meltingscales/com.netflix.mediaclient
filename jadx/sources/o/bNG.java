package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.MagicPathUiType;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathFragment;

@InterfaceC1639aIt
/* loaded from: classes4.dex */
public final class bNG extends MO {
    public static final e a = new e(null);

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldAttachToolbar() {
        return false;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("GameControllerActivity");
        }

        public final Intent c(Context context, MagicPathUiType magicPathUiType, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) magicPathUiType, "");
            C8632dsu.c((Object) str, "");
            Intent intent = new Intent(context, bNG.class);
            intent.putExtra("EXTRA_MAGIC_PATH_UI_TYPE", magicPathUiType.name());
            intent.putExtra("EXTRA_BEACON_CODE", str);
            return intent;
        }
    }

    @Override // android.app.Activity
    public void overridePendingTransition(int i, int i2) {
        super.overridePendingTransition(0, 0);
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase, o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null) {
            finish();
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        C8632dsu.c((Object) intent, "");
        super.onNewIntent(intent);
        if (intent.getExtras() == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("EXTRA_BEACON_CODE");
        String stringExtra2 = intent.getStringExtra("EXTRA_MAGIC_PATH_UI_TYPE");
        if (stringExtra2 == null) {
            stringExtra2 = "FULL_SCREEN";
        }
        MagicPathUiType valueOf = MagicPathUiType.valueOf(stringExtra2);
        Fragment h = h();
        C8632dsu.d(h);
        MagicPathFragment magicPathFragment = (MagicPathFragment) h;
        magicPathFragment.c(valueOf);
        if (stringExtra != null) {
            magicPathFragment.a(stringExtra);
        }
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        Fragment h = h();
        NetflixFrag netflixFrag = h instanceof NetflixFrag ? (NetflixFrag) h : null;
        if (netflixFrag != null) {
            return netflixFrag.bh_();
        }
        return null;
    }

    @Override // o.MO
    public Fragment d() {
        MagicPathFragment.c cVar = MagicPathFragment.a;
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            C8632dsu.a(extras, "");
            return cVar.d(extras);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
