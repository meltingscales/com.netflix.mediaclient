package o;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.ui.home.HomeActivity;
import java.nio.charset.StandardCharsets;

@InterfaceC1631aIl
/* renamed from: o.cOx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ActivityC5963cOx extends MO {
    private static int a = 1;
    private static int d;
    public static final a e;
    private static byte e$ss2$102;

    static {
        c();
        e = new a(null);
    }

    static void c() {
        e$ss2$102 = (byte) 24;
    }

    @Override // o.MO, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean showNoNetworkOverlayIfNeeded() {
        return true;
    }

    /* renamed from: o.cOx$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("OriginalProfileIconsActivity");
        }

        public final Intent b(Context context, String str, boolean z, boolean z2) {
            C8632dsu.c((Object) context, "");
            Intent intent = new Intent(context, b());
            intent.putExtra("EXTRA_ORIGINAL_ICONS_PROFILE_ID", str);
            intent.putExtra("EXTRA_ORIGINAL_ICONS_IS_KIDS", z);
            intent.putExtra("EXTRA_ORIGINAL_ICONS_DEEPLINK", z2);
            return intent;
        }

        private final Class<? extends ActivityC5963cOx> b() {
            return NetflixApplication.getInstance().M() ? cOF.class : ActivityC5963cOx.class;
        }
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean handleBackPressed() {
        if (getIntent().getBooleanExtra("EXTRA_ORIGINAL_ICONS_DEEPLINK", false)) {
            startActivity(HomeActivity.b((Context) this, getUiScreen(), false));
        }
        return super.handleBackPressed();
    }

    @Override // o.MO
    public Fragment d() {
        return new cOD();
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.editProfileAvatar;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public void performUpAction() {
        setResult(0);
        finish();
    }

    @Override // o.MO, com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean updateActionBar() {
        int i = 2 % 2;
        String string = getString(com.netflix.mediaclient.ui.R.o.ko);
        if (string.startsWith("'!#+")) {
            int i2 = a + 99;
            d = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = new Object[1];
                k(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            } else {
                String substring = string.substring(4);
                Object[] objArr2 = new Object[1];
                k(substring, objArr2);
                ((String) objArr2[0]).intern();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        C8632dsu.a(string, "");
        setTitle(string);
        NetflixActionBar netflixActionBar = getNetflixActionBar();
        if (netflixActionBar != null) {
            netflixActionBar.c(getActionBarStateBuilder().e((CharSequence) string).l(true).b(false).c());
            return true;
        }
        int i3 = a + 9;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
        return false;
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$102);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
