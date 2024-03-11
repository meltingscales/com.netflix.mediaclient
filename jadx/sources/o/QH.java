package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.mediaclient.android.sharing.impl.ShareReceiver;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import io.reactivex.Single;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class QH<T> extends QI<T> {
    public static final b a = new b(null);
    public static final int c = 8;
    private CharSequence d;
    private String f;
    private final String g;
    private final String h;

    public QH() {
        this(null, 1, null);
    }

    @Override // o.QI
    public String a() {
        return this.g;
    }

    @Override // o.QI
    public CharSequence b() {
        return this.d;
    }

    @Override // o.QI
    public String d() {
        return this.h;
    }

    @Override // o.QI
    public boolean d(PackageManager packageManager, Map<String, ? extends PackageInfo> map) {
        C8632dsu.c((Object) packageManager, "");
        C8632dsu.c((Object) map, "");
        return true;
    }

    @Override // o.QI
    public String e() {
        return this.f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ QH(java.lang.CharSequence r1, int r2, o.C8627dsp r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L17
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r1 = o.C1332Xp.b(r1)
            android.content.Context r1 = (android.content.Context) r1
            int r2 = com.netflix.mediaclient.ui.R.o.ly
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = ""
            o.C8632dsu.a(r1, r2)
        L17:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.QH.<init>(java.lang.CharSequence, int, o.dsp):void");
    }

    public QH(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        this.d = charSequence;
        this.f = "moreOptions";
        this.g = "more";
        this.h = "more";
        b(HawkinsIcon.C0291gb.e);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    @Override // o.QI
    public Single<Intent> d(final FragmentActivity fragmentActivity, final Shareable<T> shareable) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) shareable, "");
        Single<Intent> fromCallable = Single.fromCallable(new Callable() { // from class: o.QM
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Intent a2;
                a2 = QH.a(FragmentActivity.this, shareable, this);
                return a2;
            }
        });
        C8632dsu.a(fromCallable, "");
        return fromCallable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(FragmentActivity fragmentActivity, Shareable shareable, QH qh) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) shareable, "");
        C8632dsu.c((Object) qh, "");
        Intent intent = new Intent("android.intent.action.SEND");
        CharSequence c2 = shareable.c(qh);
        if (c2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", c2);
        }
        intent.putExtra("android.intent.extra.TEXT", shareable.b(C1588aGw.a(fragmentActivity), qh));
        intent.setType("text/plain");
        String string = fragmentActivity.getResources().getString(com.netflix.mediaclient.ui.R.o.lz);
        C8632dsu.a(string, "");
        Intent putExtra = new Intent(fragmentActivity, ShareReceiver.class).putExtra("com.netflix.mediaclient.android.sharing.impl.SHARE_URL", shareable.d(C1588aGw.a(fragmentActivity), qh));
        C8632dsu.a(putExtra, "");
        return Intent.createChooser(intent, string, PendingIntent.getBroadcast(fragmentActivity, 0, putExtra, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 134217728).getIntentSender());
    }
}
