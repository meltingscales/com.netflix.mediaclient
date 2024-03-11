package o;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Map;
import o.C1128Pt;
import o.C1141Qg;
import o.C8632dsu;
import o.C9726vo;
import o.QJ;
import o.drX;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class QJ<T> {
    private final C1133Py e;
    private final QI<T> i;
    private final C1140Qf j;
    public static final b a = new b(null);
    public static final int d = 8;
    private static final Uri c = Uri.parse("snapchat://creativekit/camera/1");
    private static final Uri b = Uri.parse("snapchat://creativekit/preview/1");

    public abstract Single<c> a(FragmentActivity fragmentActivity, Shareable<T> shareable, QI<T> qi, int i, int i2);

    public abstract void b(FragmentActivity fragmentActivity, T t);

    public final C1133Py c() {
        return this.e;
    }

    public final C1140Qf d() {
        return this.j;
    }

    public final QI<T> e() {
        return this.i;
    }

    public QJ(C1140Qf c1140Qf, C1133Py c1133Py) {
        C8632dsu.c((Object) c1140Qf, "");
        C8632dsu.c((Object) c1133Py, "");
        this.j = c1140Qf;
        this.e = c1133Py;
        this.i = new e(this);
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("Snapchat");
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private final a a;
        private final String c;
        private final Uri d;
        private final Uri e;

        public c() {
            this(null, null, null, null, 15, null);
        }

        public final a a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final Uri c() {
            return this.d;
        }

        public final Uri d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.d, cVar.d) && C8632dsu.c(this.e, cVar.e) && C8632dsu.c(this.a, cVar.a) && C8632dsu.c((Object) this.c, (Object) cVar.c);
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.d;
            int hashCode = uri == null ? 0 : uri.hashCode();
            Uri uri2 = this.e;
            int hashCode2 = uri2 == null ? 0 : uri2.hashCode();
            a aVar = this.a;
            int hashCode3 = aVar == null ? 0 : aVar.hashCode();
            String str = this.c;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            Uri uri = this.d;
            Uri uri2 = this.e;
            a aVar = this.a;
            String str = this.c;
            return "SnapchatStory(backgroundAssetUri=" + uri + ", stickerAssetUri=" + uri2 + ", stickerImageInfo=" + aVar + ", contentUrl=" + str + ")";
        }

        public c(Uri uri, Uri uri2, a aVar, String str) {
            this.d = uri;
            this.e = uri2;
            this.a = aVar;
            this.c = str;
        }

        public /* synthetic */ c(Uri uri, Uri uri2, a aVar, String str, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? null : uri, (i & 2) != 0 ? null : uri2, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage(C1128Pt.b.a().f());
        intent.setDataAndType(b, "image/*");
        intent.putExtra("CLIENT_ID", "bf76174f-ae0f-4f8f-a3ab-dec7512bee83");
        return intent;
    }

    public final String b(String str) {
        C8632dsu.c((Object) str, "");
        String uri = Uri.parse(str).buildUpon().appendQueryParameter("preventIntent", "true").build().toString();
        C8632dsu.a(uri, "");
        return uri;
    }

    /* loaded from: classes3.dex */
    public static final class e extends QI<T> {
        final /* synthetic */ QJ<T> c;
        private CharSequence a = "";
        private String d = "ShareToSnapchat";
        private final String g = C1128Pt.b.a().f();
        private final String h = "snc";

        @Override // o.QI
        public String a() {
            return this.g;
        }

        public void a(CharSequence charSequence) {
            C8632dsu.c((Object) charSequence, "");
            this.a = charSequence;
        }

        @Override // o.QI
        public CharSequence b() {
            return this.a;
        }

        @Override // o.QI
        public String d() {
            return this.h;
        }

        @Override // o.QI
        public String e() {
            return this.d;
        }

        e(QJ<T> qj) {
            this.c = qj;
        }

        @Override // o.QI
        public Single<Intent> d(final FragmentActivity fragmentActivity, Shareable<T> shareable) {
            C8632dsu.c((Object) fragmentActivity, "");
            C8632dsu.c((Object) shareable, "");
            Single<c> a = this.c.a(fragmentActivity, shareable, this, C8150deu.o(fragmentActivity), C8150deu.m(fragmentActivity));
            final QJ<T> qj = this.c;
            final drM<c, Intent> drm = new drM<c, Intent>() { // from class: com.netflix.mediaclient.android.sharing.impl.targets.Snapchat$shareTarget$1$share$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: a */
                public final Intent invoke(QJ.c cVar) {
                    C8632dsu.c((Object) cVar, "");
                    final Intent a2 = qj.a();
                    final FragmentActivity fragmentActivity2 = fragmentActivity;
                    QJ.b bVar = QJ.a;
                    bVar.getLogTag();
                    Uri c = cVar.c();
                    if (c != null) {
                        bVar.getLogTag();
                        fragmentActivity2.grantUriPermission(C1128Pt.b.a().f(), c, 1);
                        a2.putExtra("android.intent.extra.STREAM", c);
                    }
                    C9726vo.d(cVar.d(), cVar.a(), new drX<Uri, QJ.a, Intent>() { // from class: com.netflix.mediaclient.android.sharing.impl.targets.Snapchat$shareTarget$1$share$1$1$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // o.drX
                        /* renamed from: e */
                        public final Intent invoke(Uri uri, QJ.a aVar) {
                            C8632dsu.c((Object) uri, "");
                            C8632dsu.c((Object) aVar, "");
                            FragmentActivity.this.grantUriPermission(C1128Pt.b.a().f(), uri, 1);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("uri", uri);
                            jSONObject.put(InteractiveAnimation.ANIMATION_TYPE.WIDTH, aVar.e());
                            jSONObject.put(InteractiveAnimation.ANIMATION_TYPE.HEIGHT, aVar.b());
                            jSONObject.put("posX", Float.valueOf(aVar.d()));
                            jSONObject.put("posY", Float.valueOf(aVar.a()));
                            jSONObject.put(InteractiveAnimation.ANIMATION_TYPE.ROTATION, 0);
                            String jSONObject2 = jSONObject.toString();
                            C8632dsu.a(jSONObject2, "");
                            QJ.a.getLogTag();
                            return a2.putExtra("sticker", jSONObject2);
                        }
                    });
                    String b = cVar.b();
                    if (b != null) {
                        bVar.getLogTag();
                        a2.putExtra("attachmentUrl", b);
                    }
                    return a2;
                }
            };
            Single map = a.map(new Function() { // from class: o.QK
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Intent e;
                    e = QJ.e.e(drM.this, obj);
                    return e;
                }
            });
            C8632dsu.a(map, "");
            return map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Intent e(drM drm, Object obj) {
            C8632dsu.c((Object) drm, "");
            C8632dsu.c(obj, "");
            return (Intent) drm.invoke(obj);
        }

        @Override // o.QI
        public boolean d(PackageManager packageManager, Map<String, ? extends PackageInfo> map) {
            C8632dsu.c((Object) packageManager, "");
            C8632dsu.c((Object) map, "");
            C1128Pt.b bVar = C1128Pt.b;
            PackageInfo packageInfo = map.get(bVar.a().f());
            if (packageInfo != null && packageInfo.applicationInfo != null && packageManager.resolveActivity(this.c.a(), 0) != null) {
                C1141Qg.d dVar = C1141Qg.e;
                String d = dVar.d().d(bVar.a().f());
                if (d != null) {
                    a(d);
                    b(dVar.d().a(bVar.a().f()));
                    return true;
                }
            }
            return false;
        }

        @Override // o.QI
        public void d(FragmentActivity fragmentActivity, T t) {
            C8632dsu.c((Object) fragmentActivity, "");
            this.c.b(fragmentActivity, t);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        private final int a;
        private final float b;
        private final float c;
        private final int d;

        public final float a() {
            return this.b;
        }

        public final int b() {
            return this.d;
        }

        public final float d() {
            return this.c;
        }

        public final int e() {
            return this.a;
        }

        public a(int i, int i2, float f, float f2) {
            this.a = i;
            this.d = i2;
            this.c = f;
            this.b = f2;
        }
    }
}
