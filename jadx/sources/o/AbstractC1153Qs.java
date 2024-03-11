package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Map;
import o.AbstractC1153Qs;
import o.C1128Pt;
import o.C8632dsu;

/* renamed from: o.Qs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1153Qs<T> {
    public static final b b = new b(null);
    public static final int e = 8;
    private final QI<T> a;
    private final C1133Py c;
    private final C1140Qf d;

    public final C1133Py a() {
        return this.c;
    }

    public abstract Single<e> b(FragmentActivity fragmentActivity, Shareable<T> shareable, QI<T> qi, int i, int i2);

    public final QI<T> c() {
        return this.a;
    }

    public final C1140Qf d() {
        return this.d;
    }

    public abstract void e(FragmentActivity fragmentActivity, T t);

    public AbstractC1153Qs(C1140Qf c1140Qf, C1133Py c1133Py) {
        C8632dsu.c((Object) c1140Qf, "");
        C8632dsu.c((Object) c1133Py, "");
        this.d = c1140Qf;
        this.c = c1133Py;
        this.a = new c(this);
    }

    /* renamed from: o.Qs$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("Instagram");
        }
    }

    /* renamed from: o.Qs$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final Integer a;
        private final Uri b;
        private final Uri c;
        private final String d;
        private final Integer e;

        public final Uri a() {
            return this.b;
        }

        public final String b() {
            return this.d;
        }

        public final Integer c() {
            return this.e;
        }

        public final Integer d() {
            return this.a;
        }

        public final Uri e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.e, eVar.e) && C8632dsu.c(this.a, eVar.a) && C8632dsu.c((Object) this.d, (Object) eVar.d);
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.c;
            int hashCode = uri == null ? 0 : uri.hashCode();
            Uri uri2 = this.b;
            int hashCode2 = uri2 == null ? 0 : uri2.hashCode();
            Integer num = this.e;
            int hashCode3 = num == null ? 0 : num.hashCode();
            Integer num2 = this.a;
            int hashCode4 = num2 == null ? 0 : num2.hashCode();
            String str = this.d;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            Uri uri = this.c;
            Uri uri2 = this.b;
            Integer num = this.e;
            Integer num2 = this.a;
            String str = this.d;
            return "InstagramStory(backgroundAssetUri=" + uri + ", interactiveAssetUri=" + uri2 + ", topBackgroundColor=" + num + ", bottomBackgroundColor=" + num2 + ", contentUrl=" + str + ")";
        }

        public e(Uri uri, Uri uri2, Integer num, Integer num2, String str) {
            this.c = uri;
            this.b = uri2;
            this.e = num;
            this.a = num2;
            this.d = str;
        }

        public /* synthetic */ e(Uri uri, Uri uri2, Integer num, Integer num2, String str, int i, C8627dsp c8627dsp) {
            this(uri, (i & 2) != 0 ? null : uri2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str);
        }
    }

    /* renamed from: o.Qs$c */
    /* loaded from: classes3.dex */
    public static final class c extends QI<T> {
        final /* synthetic */ AbstractC1153Qs<T> a;
        private CharSequence c;
        private String d = "ShareToInstagramStories";
        private final String g;
        private final String h;

        @Override // o.QI
        public String a() {
            return this.g;
        }

        @Override // o.QI
        public CharSequence b() {
            return this.c;
        }

        @Override // o.QI
        public String d() {
            return this.h;
        }

        @Override // o.QI
        public String e() {
            return this.d;
        }

        c(AbstractC1153Qs<T> abstractC1153Qs) {
            this.a = abstractC1153Qs;
            CharSequence text = ((Context) C1332Xp.b(Context.class)).getText(com.netflix.mediaclient.ui.R.o.lr);
            C8632dsu.a(text, "");
            this.c = text;
            this.g = C1128Pt.b.c().f();
            this.h = "igs";
        }

        @Override // o.QI
        public Single<Intent> d(final FragmentActivity fragmentActivity, Shareable<T> shareable) {
            C8632dsu.c((Object) fragmentActivity, "");
            C8632dsu.c((Object) shareable, "");
            Single<e> b = this.a.b(fragmentActivity, shareable, this, 720, 1280);
            final drM<e, Intent> drm = new drM<e, Intent>() { // from class: com.netflix.mediaclient.android.sharing.impl.targets.Instagram$shareTarget$1$share$1
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final Intent invoke(AbstractC1153Qs.e eVar) {
                    C8632dsu.c((Object) eVar, "");
                    Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
                    FragmentActivity fragmentActivity2 = FragmentActivity.this;
                    AbstractC1153Qs.b bVar = AbstractC1153Qs.b;
                    bVar.getLogTag();
                    Uri e = eVar.e();
                    if (e != null) {
                        intent.setFlags(1);
                        bVar.getLogTag();
                        intent.setDataAndTypeAndNormalize(e, "image/*");
                    }
                    Uri a = eVar.a();
                    if (a != null) {
                        fragmentActivity2.grantUriPermission(C1128Pt.b.c().f(), a, 1);
                        bVar.getLogTag();
                        intent.putExtra("interactive_asset_uri", a);
                    }
                    Integer c = eVar.c();
                    if (c != null) {
                        int intValue = c.intValue();
                        bVar.getLogTag();
                        intent.putExtra("top_background_color", intValue);
                    }
                    Integer d = eVar.d();
                    if (d != null) {
                        int intValue2 = d.intValue();
                        bVar.getLogTag();
                        intent.putExtra("bottom_background_color", intValue2);
                    }
                    String b2 = eVar.b();
                    if (b2 != null) {
                        bVar.getLogTag();
                        intent.putExtra("content_url", b2);
                    }
                    return intent;
                }
            };
            Single map = b.map(new Function() { // from class: o.Qp
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Intent d;
                    d = AbstractC1153Qs.c.d(drM.this, obj);
                    return d;
                }
            });
            C8632dsu.a(map, "");
            return map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Intent d(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return (Intent) drm.invoke(obj);
        }

        @Override // o.QI
        public boolean d(PackageManager packageManager, Map<String, ? extends PackageInfo> map) {
            C8632dsu.c((Object) packageManager, "");
            C8632dsu.c((Object) map, "");
            C1128Pt.b bVar = C1128Pt.b;
            PackageInfo packageInfo = map.get(bVar.c().f());
            if (packageInfo != null && packageInfo.applicationInfo != null) {
                Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
                intent.setDataAndTypeAndNormalize(Uri.parse("content://com.netflix.mediaclient/anything"), "image/*");
                r1 = packageManager.resolveActivity(intent, 0) != null;
                if (r1) {
                    b(C1141Qg.e.d().a(bVar.c().f()));
                }
            }
            return r1;
        }

        @Override // o.QI
        public void d(FragmentActivity fragmentActivity, T t) {
            C8632dsu.c((Object) fragmentActivity, "");
            this.a.e(fragmentActivity, t);
        }
    }
}
