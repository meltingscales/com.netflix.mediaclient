package o;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.service.player.common.BrightnessPreferenceUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import o.C4781bmP;
import o.C8632dsu;

/* renamed from: o.bmP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4781bmP {
    @SuppressLint({"StaticFieldLeak"})
    private static C4781bmP a;
    public static final b d = new b(null);
    private int b;
    private final Context c;
    private final ContentObserver e;
    private int h;
    private final List<WeakReference<d>> i;
    private boolean j;

    /* renamed from: o.bmP$d */
    /* loaded from: classes3.dex */
    public interface d {
        void b(int i, int i2, String str, int i3, int i4, boolean z);
    }

    public static final C4781bmP c(Context context) {
        C4781bmP e2;
        synchronized (C4781bmP.class) {
            e2 = d.e(context);
        }
        return e2;
    }

    public C4781bmP(Context context) {
        C8632dsu.c((Object) context, "");
        this.c = context;
        this.i = new ArrayList();
        this.b = -1;
        this.h = JSONzip.end;
        this.e = new a(new Handler());
    }

    /* renamed from: o.bmP$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private int a;
        private boolean b;
        private int c;
        private final int d;
        private int e;
        private String f;

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.c;
        }

        public final int c() {
            return this.d;
        }

        public final int d() {
            return this.e;
        }

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.c == eVar.c && this.d == eVar.d && C8632dsu.c((Object) this.f, (Object) eVar.f) && this.a == eVar.a && this.e == eVar.e && this.b == eVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.c) * 31) + Integer.hashCode(this.d)) * 31) + this.f.hashCode()) * 31) + Integer.hashCode(this.a)) * 31) + Integer.hashCode(this.e)) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            int i = this.c;
            int i2 = this.d;
            String str = this.f;
            int i3 = this.a;
            int i4 = this.e;
            boolean z = this.b;
            return "BrightnessContext(newBrightnessValue=" + i + ", playerBrightness=" + i2 + ", source=" + str + ", effectiveBrightnessValue=" + i3 + ", maxLuminance=" + i4 + ", isAdaptiveBrightnessEnabled=" + z + ")";
        }

        public e(int i, int i2, String str, int i3, int i4, boolean z) {
            C8632dsu.c((Object) str, "");
            this.c = i;
            this.d = i2;
            this.f = str;
            this.a = i3;
            this.e = i4;
            this.b = z;
        }
    }

    /* renamed from: o.bmP$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("BrightnessChangeObserver");
        }

        public final C4781bmP e(Context context) {
            C4781bmP c4781bmP;
            synchronized (this) {
                C8632dsu.c((Object) context, "");
                if (C4781bmP.a == null) {
                    C4781bmP.a = new C4781bmP(context);
                }
                c4781bmP = C4781bmP.a;
            }
            return c4781bmP;
        }
    }

    /* renamed from: o.bmP$a */
    /* loaded from: classes3.dex */
    public static final class a extends ContentObserver {
        private final String d;
        private final String e;

        a(Handler handler) {
            super(handler);
            this.d = "settings";
            this.e = "self";
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            String str = z ? this.e : this.d;
            e d = C4781bmP.this.d(null, str, null);
            if (d.b() == C4781bmP.this.b && d.a() == C4781bmP.this.b) {
                return;
            }
            C4781bmP.this.a(d.b(), C4781bmP.this.b, str, d.a(), d.d(), d.e());
        }
    }

    public final e d(Integer num, String str, InterfaceC4525bgE interfaceC4525bgE) {
        int b2 = b();
        int intValue = num != null ? num.intValue() : a();
        int i = -1;
        int b3 = interfaceC4525bgE != null ? b(interfaceC4525bgE) : -1;
        int i2 = b3 >= 0 ? b3 : intValue;
        if (b2 > 0 && i2 <= this.h) {
            i = (((int) ((Math.log(i2) * 19.811d) - 9.411d)) * b2) / 100;
        }
        int i3 = i;
        if (str == null) {
            str = "";
        }
        return new e(intValue, b3, str, i3, b2, C8054ddD.n(this.c));
    }

    public final int a() {
        ContentResolver contentResolver = this.c.getContentResolver();
        if (contentResolver != null) {
            return Settings.System.getInt(contentResolver, "screen_brightness", -1);
        }
        return -1;
    }

    private final int b(InterfaceC4525bgE interfaceC4525bgE) {
        BrightnessPreferenceUtil.Format format = BrightnessPreferenceUtil.Format.c;
        if ((interfaceC4525bgE != null ? interfaceC4525bgE.V() : null) != null && (interfaceC4525bgE.V().isDolbyVisionProfile() || interfaceC4525bgE.V().isHDR10Profile())) {
            format = BrightnessPreferenceUtil.Format.a;
        }
        return BrightnessPreferenceUtil.b.c(format, this.c);
    }

    private final int b() {
        return (int) C8054ddD.j(this.c);
    }

    public final void c(d dVar) {
        synchronized (this) {
            C8632dsu.c((Object) dVar, "");
            this.i.add(new WeakReference<>(dVar));
            if (!this.j) {
                d.getLogTag();
                try {
                    ContentResolver contentResolver = this.c.getContentResolver();
                    if (contentResolver != null) {
                        contentResolver.registerContentObserver(Settings.System.getUriFor("screen_brightness"), true, this.e);
                    }
                    this.j = true;
                } catch (Exception unused) {
                }
                this.b = a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }

    public final void a(final d dVar) {
        synchronized (this) {
            C8632dsu.c((Object) dVar, "");
            List<WeakReference<d>> list = this.i;
            final drM<WeakReference<d>, Boolean> drm = new drM<WeakReference<d>, Boolean>() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BrightnessChangeObserver$removeListener$1
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: b */
                public final Boolean invoke(WeakReference<C4781bmP.d> weakReference) {
                    C8632dsu.c((Object) weakReference, "");
                    C4781bmP.d dVar2 = weakReference.get();
                    return Boolean.valueOf(dVar2 == null || dVar2 == C4781bmP.d.this);
                }
            };
            list.removeIf(new Predicate() { // from class: o.bmQ
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean d2;
                    d2 = C4781bmP.d(drM.this, obj);
                    return d2;
                }
            });
            if (this.i.isEmpty() && this.j) {
                d.getLogTag();
                try {
                    ContentResolver contentResolver = this.c.getContentResolver();
                    if (contentResolver != null) {
                        contentResolver.unregisterContentObserver(this.e);
                    }
                } catch (Exception unused) {
                    d.getLogTag();
                }
                this.j = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, int i2, String str, int i3, int i4, boolean z) {
        synchronized (this) {
            if (i != i2 || i2 == -1) {
                d.getLogTag();
                Iterator<T> it = this.i.iterator();
                while (it.hasNext()) {
                    d dVar = (d) ((WeakReference) it.next()).get();
                    if (dVar != null) {
                        dVar.b(i2, i, str, i3, i4, z);
                    }
                }
                this.b = i;
            }
        }
    }
}
