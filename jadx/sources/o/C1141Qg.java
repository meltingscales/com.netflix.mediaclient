package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import o.C1141Qg;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC9854xo;
import o.dpR;
import org.json.JSONObject;

/* renamed from: o.Qg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1141Qg {
    private final Context a;
    private final String b;
    private Disposable c;
    private final PublishSubject<dpR> f;
    private final File g;
    private final C9823xJ h;
    private boolean i;
    private final File j;
    private final String l;

    /* renamed from: o  reason: collision with root package name */
    private final HashMap<String, HashMap<String, b>> f13391o;
    public static final d e = new d(null);
    public static final int d = 8;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.Qg$c */
    /* loaded from: classes3.dex */
    public interface c {
        C1141Qg s();
    }

    /* renamed from: o.Qg$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("AppInfoCache");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C1141Qg c1141Qg, String str) {
            C8632dsu.c((Object) c1141Qg, "");
            C8632dsu.c((Object) str, "");
            String g = c1141Qg.g(str);
            if (g != null) {
                c1141Qg.b(str, g);
            }
        }

        public final C1141Qg d() {
            C1332Xp c1332Xp = C1332Xp.b;
            return ((c) EntryPointAccessors.fromApplication((Context) C1332Xp.b(Context.class), c.class)).s();
        }

        public final void a(final C1141Qg c1141Qg, final String str) {
            C8632dsu.c((Object) c1141Qg, "");
            C8632dsu.c((Object) str, "");
            getLogTag();
            Schedulers.io().scheduleDirect(new Runnable() { // from class: o.Qm
                @Override // java.lang.Runnable
                public final void run() {
                    C1141Qg.d.d(C1141Qg.this, str);
                }
            }, 20L, TimeUnit.SECONDS);
        }
    }

    @Inject
    public C1141Qg(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.a = context;
        String str = context.getCacheDir().getPath() + "/appInfo";
        this.b = str;
        File file = new File(str, "diskCache");
        this.j = file;
        PublishSubject<dpR> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.f = create;
        this.f13391o = new HashMap<>();
        String locale = Resources.getSystem().getConfiguration().locale.toString();
        C8632dsu.a(locale, "");
        this.l = locale;
        this.h = new C9823xJ(file, 5242880);
        this.g = new File(str, "data.json");
    }

    public final boolean a() {
        boolean z;
        Map d2;
        Map k;
        Throwable th;
        synchronized (this) {
            if (!this.i) {
                System.currentTimeMillis();
                try {
                    new File(this.b).mkdirs();
                    if (!this.g.exists()) {
                        this.g.createNewFile();
                    }
                    Map<String, HashMap<String, b>> e2 = e();
                    if (e2 != null) {
                        c(e2);
                    }
                    this.h.d();
                    Disposable disposable = this.c;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Observable<dpR> observeOn = this.f.debounce(1L, TimeUnit.SECONDS, Schedulers.io()).observeOn(Schedulers.io());
                    final drM<dpR, dpR> drm = new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.targets.AppInfoCache$initialize$2
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(dpR dpr) {
                            b(dpr);
                            return dpR.c;
                        }

                        public final void b(dpR dpr) {
                            C1141Qg.this.d();
                        }
                    };
                    this.c = observeOn.subscribe(new Consumer() { // from class: o.Qj
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C1141Qg.e(drM.this, obj);
                        }
                    });
                    this.i = true;
                } catch (IOException e3) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("Error restoring AppInfoCache from disk", e3, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b2);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th = new Throwable(c1596aHd.b());
                    } else {
                        th = c1596aHd.i;
                        if (th == null) {
                            th = new Throwable("Handled exception with no message");
                        } else if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
                e.getLogTag();
            }
            z = this.i;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final BitmapDrawable a(String str) {
        BitmapDrawable c2;
        synchronized (this) {
            C8632dsu.c((Object) str, "");
            if (!a() || (c2 = c(str)) == null) {
                Drawable b2 = b(str);
                if (b2 != null) {
                    Bitmap b3 = b(b2);
                    if (this.i) {
                        e(str, b3);
                    }
                    return new BitmapDrawable(this.a.getResources(), b3);
                }
                return null;
            }
            return c2;
        }
    }

    public final void b(String str, String str2) {
        synchronized (this) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            if (this.f13391o.get(this.l) == null) {
                this.f13391o.put(this.l, new HashMap<>());
            }
            HashMap<String, b> hashMap = this.f13391o.get(this.l);
            if (hashMap != null) {
                hashMap.put(str, new b(str2, System.currentTimeMillis()));
            }
            c();
        }
    }

    public final String g(String str) {
        C8632dsu.c((Object) str, "");
        e.getLogTag();
        PackageManager packageManager = this.a.getPackageManager();
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
        if (applicationInfo != null) {
            return packageManager.getApplicationLabel(applicationInfo).toString();
        }
        return null;
    }

    public final void e(String str, Bitmap bitmap) {
        synchronized (this) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) bitmap, "");
            a();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            e.getLogTag();
            C9823xJ c9823xJ = this.h;
            InterfaceC9854xo.d dVar = new InterfaceC9854xo.d();
            dVar.c = byteArrayOutputStream.toByteArray();
            dVar.g = System.currentTimeMillis();
            dpR dpr = dpR.c;
            c9823xJ.e(str, dVar);
        }
    }

    public final BitmapDrawable c(String str) {
        C8632dsu.c((Object) str, "");
        a();
        d dVar = e;
        dVar.getLogTag();
        InterfaceC9854xo.d e2 = e(str);
        if (e2 == null || e2.c == null) {
            return null;
        }
        dVar.getLogTag();
        if (System.currentTimeMillis() > e2.g + 1209600000) {
            j(str);
        }
        Resources resources = this.a.getResources();
        byte[] bArr = e2.c;
        return new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public final InterfaceC9854xo.d e(String str) {
        C8632dsu.c((Object) str, "");
        return this.h.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1141Qg c1141Qg, String str) {
        C8632dsu.c((Object) c1141Qg, "");
        C8632dsu.c((Object) str, "");
        Drawable b2 = c1141Qg.b(str);
        if (b2 != null) {
            c1141Qg.e(str, c1141Qg.b(b2));
        }
    }

    private final Bitmap b(Drawable drawable) {
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.C);
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        C8632dsu.a(createBitmap, "");
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final Drawable b(String str) {
        C8632dsu.c((Object) str, "");
        PackageManager packageManager = this.a.getPackageManager();
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
        if (applicationInfo != null) {
            return packageManager.getApplicationIcon(applicationInfo);
        }
        return null;
    }

    public final Map<String, HashMap<String, b>> e() {
        InputStreamReader inputStreamReader;
        String e2;
        try {
            File file = this.g;
            inputStreamReader = new InputStreamReader(new FileInputStream(file), C8674dui.i);
            e2 = drJ.e(inputStreamReader);
        } catch (Throwable unused) {
            this.g.delete();
            this.g.createNewFile();
        }
        if (!TextUtils.isEmpty(e2)) {
            Map<String, HashMap<String, b>> d2 = d(new JSONObject(e2));
            C8608drx.a(inputStreamReader, null);
            return d2;
        }
        dpR dpr = dpR.c;
        C8608drx.a(inputStreamReader, null);
        return null;
    }

    public final JSONObject b(HashMap<String, HashMap<String, b>> hashMap) {
        C8632dsu.c((Object) hashMap, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, HashMap<String, b>> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObject2 = new JSONObject();
            HashMap<String, b> value = entry.getValue();
            ArrayList arrayList = new ArrayList(value.size());
            for (Map.Entry<String, b> entry2 : value.entrySet()) {
                arrayList.add(jSONObject2.put(entry2.getKey(), entry2.getValue().a()));
            }
            dpR dpr = dpR.c;
            jSONObject.put(key, jSONObject2);
        }
        return jSONObject;
    }

    public final Map<String, HashMap<String, b>> d(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        C8632dsu.a(keys, "");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            HashMap hashMap2 = new HashMap();
            C8632dsu.d((Object) str);
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Iterator keys2 = jSONObject2.keys();
            C8632dsu.a(keys2, "");
            while (keys2.hasNext()) {
                String str2 = (String) keys2.next();
                C8632dsu.d((Object) str2);
                JSONObject jSONObject3 = jSONObject2.getJSONObject(str2);
                C8632dsu.a(jSONObject3, "");
                hashMap2.put(str2, new b(jSONObject3));
            }
            hashMap.put(str, hashMap2);
        }
        return hashMap;
    }

    public final void c(Map<String, ? extends HashMap<String, b>> map) {
        synchronized (this) {
            C8632dsu.c((Object) map, "");
            this.f13391o.clear();
            for (Map.Entry<String, ? extends HashMap<String, b>> entry : map.entrySet()) {
                this.f13391o.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: o.Qg$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final d b = new d(null);
        private final String a;
        private final long c;

        public final String b() {
            return this.a;
        }

        public final long c() {
            return this.c;
        }

        /* renamed from: o.Qg$b$d */
        /* loaded from: classes3.dex */
        public static final class d {
            public /* synthetic */ d(C8627dsp c8627dsp) {
                this();
            }

            private d() {
            }
        }

        public b(String str, long j) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = j;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(org.json.JSONObject r5) {
            /*
                r4 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r5, r0)
                java.lang.String r1 = "value"
                java.lang.String r1 = r5.getString(r1)
                o.C8632dsu.a(r1, r0)
                java.lang.String r0 = "time"
                long r2 = r5.getLong(r0)
                r4.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1141Qg.b.<init>(org.json.JSONObject):void");
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", this.a);
            jSONObject.put("time", this.c);
            return jSONObject;
        }
    }

    public final String d(String str) {
        synchronized (this) {
            C8632dsu.c((Object) str, "");
            d dVar = e;
            dVar.getLogTag();
            if (a()) {
                HashMap<String, b> hashMap = this.f13391o.get(this.l);
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.f13391o.put(this.l, hashMap);
                }
                b bVar = hashMap.get(str);
                if (bVar != null) {
                    if (System.currentTimeMillis() > bVar.c() + 1209600000) {
                        dVar.a(this, str);
                    }
                    return bVar.b();
                }
                String g = g(str);
                if (g != null) {
                    b(str, g);
                }
                b bVar2 = hashMap.get(str);
                return bVar2 != null ? bVar2.b() : null;
            }
            return g(str);
        }
    }

    private final void j(final String str) {
        e.getLogTag();
        Schedulers.io().scheduleDirect(new Runnable() { // from class: o.Qn
            @Override // java.lang.Runnable
            public final void run() {
                C1141Qg.c(C1141Qg.this, str);
            }
        }, 20L, TimeUnit.SECONDS);
    }

    public final void c() {
        e.getLogTag();
        this.f.onNext(dpR.c);
    }

    public final void d() {
        synchronized (this) {
            e.getLogTag();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.g), C8674dui.i);
            PrintWriter printWriter = new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
            printWriter.print(b(this.f13391o).toString(3));
            dpR dpr = dpR.c;
            C8608drx.a(printWriter, null);
        }
    }
}
