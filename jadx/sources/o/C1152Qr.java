package o;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import io.reactivex.Single;
import java.util.Map;
import java.util.concurrent.Callable;
import o.C9834xU;

/* renamed from: o.Qr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1152Qr<T> extends QI<T> {
    private final boolean a;
    private String g;
    private String h;
    private CharSequence i;
    private final String j;
    public static final c d = new c(null);
    public static final int c = 8;

    public C1152Qr() {
        this(false, 1, null);
    }

    @Override // o.QI
    public String a() {
        return this.j;
    }

    @Override // o.QI
    public CharSequence b() {
        return this.i;
    }

    @Override // o.QI
    public String d() {
        return this.g;
    }

    @Override // o.QI
    public boolean d(PackageManager packageManager, Map<String, ? extends PackageInfo> map) {
        C8632dsu.c((Object) packageManager, "");
        C8632dsu.c((Object) map, "");
        return true;
    }

    @Override // o.QI
    public String e() {
        return this.h;
    }

    public C1152Qr(boolean z) {
        this.a = z;
        this.h = "copyToClipboard";
        String string = ((Context) C1332Xp.b(Context.class)).getString(com.netflix.mediaclient.ui.R.o.ln);
        C8632dsu.a(string, "");
        this.i = string;
        this.j = "copy";
        this.g = "cp";
        b(HawkinsIcon.bQ.d);
    }

    public /* synthetic */ C1152Qr(boolean z, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z);
    }

    /* renamed from: o.Qr$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.QI
    public Single<Intent> d(final FragmentActivity fragmentActivity, final Shareable<T> shareable) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) shareable, "");
        Single<Intent> fromCallable = Single.fromCallable(new Callable() { // from class: o.Qq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Intent c2;
                c2 = C1152Qr.c(FragmentActivity.this, this, shareable);
                return c2;
            }
        });
        C8632dsu.a(fromCallable, "");
        return fromCallable;
    }

    private final CharSequence a(bEY bey, Shareable<T> shareable) {
        if (this.a) {
            return shareable.d(bey, this);
        }
        return shareable.b(bey, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent c(FragmentActivity fragmentActivity, C1152Qr c1152Qr, Shareable shareable) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) c1152Qr, "");
        C8632dsu.c((Object) shareable, "");
        ClipboardManager clipboardManager = (ClipboardManager) ContextCompat.getSystemService(fragmentActivity, ClipboardManager.class);
        if (clipboardManager != null) {
            ClipData newPlainText = ClipData.newPlainText("simple text", c1152Qr.a(C1588aGw.a(fragmentActivity), shareable));
            ClipDescription description = newPlainText.getDescription();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", false);
            description.setExtras(persistableBundle);
            clipboardManager.setPrimaryClip(newPlainText);
            C8054ddD.c(fragmentActivity, C9834xU.h.i, 0);
        }
        return InterfaceC1126Pr.d.a();
    }
}
