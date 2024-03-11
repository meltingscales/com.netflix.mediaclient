package o;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import io.reactivex.Single;
import java.util.Map;
import java.util.concurrent.Callable;
import o.C1141Qg;

/* renamed from: o.Ql  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1146Ql<T> extends QI<T> {
    private CharSequence a;
    private String c;
    private final String d;
    private final String g;
    private final String h;
    private boolean i;

    @Override // o.QI
    public String a() {
        return this.g;
    }

    public void b(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        this.a = charSequence;
    }

    @Override // o.QI
    public String d() {
        return this.d;
    }

    @Override // o.QI
    public String e() {
        return this.c;
    }

    public C1146Ql(C1128Pt c1128Pt) {
        C8632dsu.c((Object) c1128Pt, "");
        String f = c1128Pt.f();
        this.h = f;
        this.c = f;
        this.a = "";
        this.g = c1128Pt.f();
        this.d = c1128Pt.g();
    }

    @Override // o.QI
    public CharSequence b() {
        if (this.i) {
            return this.a;
        }
        throw new IllegalStateException("Must call validate and get true before using");
    }

    @Override // o.QI
    public boolean d(PackageManager packageManager, Map<String, ? extends PackageInfo> map) {
        C8632dsu.c((Object) packageManager, "");
        C8632dsu.c((Object) map, "");
        if (map.get(this.h) != null) {
            C1141Qg.d dVar = C1141Qg.e;
            String d = dVar.d().d(this.h);
            if (C8168dfL.h(d)) {
                C8632dsu.d((Object) d);
                b(d);
                b(dVar.d().a(this.h));
                this.i = true;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.QI
    public Single<Intent> d(final FragmentActivity fragmentActivity, final Shareable<T> shareable) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) shareable, "");
        Single<Intent> fromCallable = Single.fromCallable(new Callable() { // from class: o.Qk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Intent c;
                c = C1146Ql.c(C1146Ql.this, shareable, fragmentActivity);
                return c;
            }
        });
        C8632dsu.a(fromCallable, "");
        return fromCallable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent c(C1146Ql c1146Ql, Shareable shareable, FragmentActivity fragmentActivity) {
        C8632dsu.c((Object) c1146Ql, "");
        C8632dsu.c((Object) shareable, "");
        C8632dsu.c((Object) fragmentActivity, "");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage(c1146Ql.h);
        CharSequence c = shareable.c(c1146Ql);
        if (c != null) {
            intent.putExtra("android.intent.extra.SUBJECT", c);
        }
        intent.putExtra("android.intent.extra.TEXT", shareable.b(C1588aGw.a(fragmentActivity), c1146Ql));
        intent.setType("text/plain");
        return intent;
    }
}
