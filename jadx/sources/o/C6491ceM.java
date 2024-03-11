package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.mdx.CastSheetDialogFrag;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/* renamed from: o.ceM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6491ceM {
    private static int e = 0;
    private static byte e$ss2$65 = 24;
    private static int g = 1;
    private final Handler a;
    private final NetflixActivity b;
    private final boolean c;
    private final e d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ceM$e */
    /* loaded from: classes4.dex */
    public interface e {
        Drawable a(Drawable drawable);

        void c(boolean z);

        void e(boolean z);
    }

    /* renamed from: o.ceM$c */
    /* loaded from: classes4.dex */
    static final class c extends ActionProvider {
        private boolean e;

        @Override // androidx.core.view.ActionProvider
        public boolean isVisible() {
            return this.e;
        }

        @Override // androidx.core.view.ActionProvider
        public View onCreateActionView() {
            return null;
        }

        @Override // androidx.core.view.ActionProvider
        public boolean overridesItemVisibility() {
            return true;
        }

        public c(Context context) {
            super(context);
            this.e = true;
        }

        public void d(boolean z) {
            if (z != this.e) {
                this.e = z;
                refreshVisibility();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ceM$a */
    /* loaded from: classes4.dex */
    public class a implements e {
        private static int a = 1;
        private static int e = 0;
        private static byte e$ss2$64 = 24;
        private final MenuItem b;
        private final c c;

        a(NetflixActivity netflixActivity, Menu menu, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            int i = com.netflix.mediaclient.ui.R.g.a;
            String string = netflixActivity.getString(com.netflix.mediaclient.ui.R.o.gk);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                f(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                int i2 = e + 17;
                a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            }
            MenuItem add = menu.add(0, i, 2, string);
            this.b = add;
            add.setShowAsAction(1);
            add.setOnMenuItemClickListener(onMenuItemClickListener);
            c cVar = new c(netflixActivity);
            this.c = cVar;
            MenuItemCompat.setActionProvider(add, cVar);
            int i4 = a + 23;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 70 / 0;
            }
        }

        @Override // o.C6491ceM.e
        public Drawable a(Drawable drawable) {
            this.b.setIcon(drawable);
            return this.b.getIcon();
        }

        @Override // o.C6491ceM.e
        public void e(boolean z) {
            this.b.setEnabled(z);
        }

        @Override // o.C6491ceM.e
        public void c(boolean z) {
            this.c.d(z);
        }

        private static void f(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$64);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }

    public static void c(NetflixActivity netflixActivity, Menu menu) {
        new C6491ceM(netflixActivity, menu);
    }

    private C6491ceM(final NetflixActivity netflixActivity, Menu menu) {
        C1044Mm.b("CastMenu", "creating");
        Objects.requireNonNull(netflixActivity);
        this.b = netflixActivity;
        Objects.requireNonNull(menu);
        this.c = BrowseExperience.c(netflixActivity, com.netflix.mediaclient.ui.R.a.a);
        InterfaceC6580cfw requireMdxTargetCallback = netflixActivity.requireMdxTargetCallback();
        this.a = new Handler();
        requireMdxTargetCallback.d(this);
        this.d = new a(netflixActivity, menu, new MenuItem.OnMenuItemClickListener() { // from class: o.ceM.4
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (C8076ddZ.g(netflixActivity)) {
                    netflixActivity.showDeviceSheet();
                    return true;
                } else if (C8129deZ.b(netflixActivity)) {
                    C8129deZ.d(netflixActivity);
                    return true;
                } else {
                    C6498ceT.c();
                    return netflixActivity.showFullScreenDialog(new CastSheetDialogFrag());
                }
            }
        });
        c(requireMdxTargetCallback.g());
        b();
    }

    void c(boolean z) {
        C1044Mm.d("CastMenu", "Setting cast menu item enabled %b: ", Boolean.valueOf(z));
        this.d.e(z);
    }

    void b() {
        int i = 2 % 2;
        if (!this.b.shouldAddCastToMenu()) {
            int i2 = g + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            e = i2 % 128;
            int i3 = i2 % 2;
            C1044Mm.j("CastMenu", "Service manager or mdx are null");
            this.d.c(false);
            return;
        }
        NetflixActivity netflixActivity = this.b;
        Drawable drawable = ContextCompat.getDrawable(netflixActivity, C8076ddZ.d(netflixActivity, this.c));
        if (drawable != null) {
            int i4 = g + 31;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                C8076ddZ.h(this.b);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (C8076ddZ.h(this.b)) {
                drawable.setTint(-1);
                ((a) this.d).b.setTitle(C8076ddZ.b((Activity) this.b));
                int i5 = g + 59;
                e = i5 % 128;
                int i6 = i5 % 2;
            } else if (C8153dex.l()) {
                MenuItem menuItem = ((a) this.d).b;
                String string = this.b.getString(com.netflix.mediaclient.ui.R.o.gk);
                if (!(!string.startsWith("'!#+"))) {
                    int i7 = g + 121;
                    e = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr = new Object[1];
                    f(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                }
                menuItem.setTitle(string);
            }
            Drawable a2 = this.d.a(drawable);
            if (a2 instanceof AnimationDrawable) {
                b((AnimationDrawable) a2);
                int i9 = e + 39;
                g = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    private void b(final AnimationDrawable animationDrawable) {
        this.a.post(new Runnable() { // from class: o.ceM.5
            @Override // java.lang.Runnable
            public void run() {
                animationDrawable.start();
            }
        });
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$65);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
