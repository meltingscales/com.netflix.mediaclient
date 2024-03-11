package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: o.bJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3743bJ {
    private static int h = 0;
    private static int j = 1;
    public static final byte[] c = {29, 93, -79, 30, -24, -24, -8, 7, -6, 61, -77, -16, -6, -13, 77, -77, -16, -10, 75};
    public static final int d = 145;
    private static final Map<String, C6796ck<C3658bG>> e = new HashMap();
    private static final Set<InterfaceC6902cm> b = new HashSet();
    private static final byte[] a = {80, 75, 3, 4};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r6 = r6 * 3
            int r6 = 80 - r6
            int r7 = r7 * 2
            int r0 = 16 - r7
            byte[] r1 = o.C3743bJ.c
            byte[] r0 = new byte[r0]
            int r7 = 15 - r7
            r2 = -1
            if (r1 != 0) goto L16
            r6 = r5
            r3 = r7
            goto L2d
        L16:
            r4 = r6
            r6 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L29:
            int r6 = r6 + 1
            r3 = r1[r6]
        L2d:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-7)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3743bJ.f(byte, int, byte, java.lang.Object[]):void");
    }

    public static C6796ck<C3658bG> b(Context context, String str) {
        return a(context, str, "url_" + str);
    }

    public static C6796ck<C3658bG> a(final Context context, final String str, final String str2) {
        return d(str2, new Callable() { // from class: o.bH
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6849cl i;
                i = C3743bJ.i(context, str, str2);
                return i;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C6849cl i(Context context, String str, String str2) {
        C6849cl<C3658bG> a2 = C3550bC.c(context).a(context, str, str2);
        if (str2 != null && a2.b() != null) {
            C8262dh.a().b(str2, a2.b());
        }
        return a2;
    }

    public static C6796ck<C3658bG> c(Context context, String str) {
        return c(context, str, "asset_" + str);
    }

    public static C6796ck<C3658bG> c(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return d(str2, new Callable() { // from class: o.bM
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6849cl e2;
                e2 = C3743bJ.e(applicationContext, str, str2);
                return e2;
            }
        });
    }

    public static C6849cl<C3658bG> a(Context context, String str) {
        return e(context, str, "asset_" + str);
    }

    public static C6849cl<C3658bG> e(Context context, String str, String str2) {
        int i = 2 % 2;
        Object obj = null;
        try {
            if (((Boolean) String.class.getMethod("endsWith", String.class).invoke(str, ".zip")).booleanValue() || ((Boolean) String.class.getMethod("endsWith", String.class).invoke(str, ".lottie")).booleanValue()) {
                Object[] objArr = {context.getAssets(), str};
                Object obj2 = C9571sB.s.get(-59237389);
                if (obj2 == null) {
                    obj2 = ((Class) C9571sB.a(4, 0, (char) 0)).getMethod("a", AssetManager.class, String.class);
                    C9571sB.s.put(-59237389, obj2);
                }
                return d(context, new ZipInputStream((InputStream) ((Method) obj2).invoke(null, objArr)), str2);
            }
            Object[] objArr2 = {context.getAssets(), str};
            Object obj3 = C9571sB.s.get(-59237389);
            if (obj3 == null) {
                obj3 = ((Class) C9571sB.a(4, 0, (char) 0)).getMethod("a", AssetManager.class, String.class);
                C9571sB.s.put(-59237389, obj3);
            }
            C6849cl<C3658bG> a2 = a((InputStream) ((Method) obj3).invoke(null, objArr2), str2);
            int i2 = h + 57;
            j = i2 % 128;
            if (i2 % 2 != 0) {
                return a2;
            }
            obj.hashCode();
            throw null;
        } catch (IOException e2) {
            C6849cl<C3658bG> c6849cl = new C6849cl<>(e2);
            int i3 = h + 51;
            j = i3 % 128;
            if (i3 % 2 != 0) {
                return c6849cl;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static C6796ck<C3658bG> a(Context context, int i) {
        return e(context, i, b(context, i));
    }

    public static C6796ck<C3658bG> e(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return d(str, new Callable() { // from class: o.bF
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6849cl a2;
                a2 = C3743bJ.a(weakReference, applicationContext, i, str);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C6849cl a(WeakReference weakReference, Context context, int i, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return d(context, i, str);
    }

    public static C6849cl<C3658bG> d(Context context, int i) {
        return d(context, i, b(context, i));
    }

    public static C6849cl<C3658bG> d(Context context, int i, String str) {
        try {
            InterfaceC7871dIn e2 = dIw.e(dIw.a(context.getResources().openRawResource(i)));
            if (e(e2).booleanValue()) {
                return d(context, new ZipInputStream(e2.n()), str);
            }
            return a(e2.n(), str);
        } catch (Resources.NotFoundException e3) {
            return new C6849cl<>(e3);
        }
    }

    private static String b(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(e(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    private static boolean e(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static C6796ck<C3658bG> e(final InputStream inputStream, final String str) {
        return d(str, new Callable() { // from class: o.bN
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6849cl a2;
                a2 = C3743bJ.a(inputStream, str);
                return a2;
            }
        });
    }

    public static C6849cl<C3658bG> a(InputStream inputStream, String str) {
        return b(inputStream, str, true);
    }

    private static C6849cl<C3658bG> b(InputStream inputStream, String str, boolean z) {
        try {
            return c(JsonReader.a(dIw.e(dIw.a(inputStream))), str);
        } finally {
            if (z) {
                C8914fh.b(inputStream);
            }
        }
    }

    public static C6796ck<C3658bG> a(final JsonReader jsonReader, final String str) {
        return d(str, new Callable() { // from class: o.bI
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6849cl c2;
                c2 = C3743bJ.c(JsonReader.this, str);
                return c2;
            }
        });
    }

    public static C6849cl<C3658bG> c(JsonReader jsonReader, String str) {
        return e(jsonReader, str, true);
    }

    private static C6849cl<C3658bG> e(JsonReader jsonReader, String str, boolean z) {
        try {
            try {
                C3658bG c2 = C8831eD.c(jsonReader);
                if (str != null) {
                    C8262dh.a().b(str, c2);
                }
                C6849cl<C3658bG> c6849cl = new C6849cl<>(c2);
                if (z) {
                    C8914fh.b(jsonReader);
                }
                return c6849cl;
            } catch (Exception e2) {
                C6849cl<C3658bG> c6849cl2 = new C6849cl<>(e2);
                if (z) {
                    C8914fh.b(jsonReader);
                }
                return c6849cl2;
            }
        } catch (Throwable th) {
            if (z) {
                C8914fh.b(jsonReader);
            }
            throw th;
        }
    }

    public static C6849cl<C3658bG> d(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return e(context, zipInputStream, str);
        } finally {
            C8914fh.b(zipInputStream);
        }
    }

    private static C6849cl<C3658bG> e(Context context, ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C3658bG c3658bG = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    c3658bG = e(JsonReader.a(dIw.e(dIw.a(zipInputStream))), (String) null, false).b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        if (!name.contains(".ttf") && !name.contains(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        String[] split = name.split("/");
                        String str2 = split[split.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Typeface createFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            C8909fc.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                        }
                        hashMap2.put(str3, createFromFile);
                    }
                    String[] split2 = name.split("/");
                    hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c3658bG == null) {
                return new C6849cl<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C6478ce c2 = c(c3658bG, (String) entry.getKey());
                if (c2 != null) {
                    c2.b(C8914fh.d((Bitmap) entry.getValue(), c2.c(), c2.a()));
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z = false;
                for (C8315di c8315di : c3658bG.j().values()) {
                    if (c8315di.e().equals(entry2.getKey())) {
                        c8315di.c((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    Object[] objArr = new Object[1];
                    f(b2, b3, b3, objArr);
                    sb.append((String) objArr[0]);
                    sb.append((String) entry2.getKey());
                    sb.append(" however it was not found in the animation.");
                    C8909fc.b(sb.toString());
                }
            }
            if (hashMap.isEmpty()) {
                for (Map.Entry<String, C6478ce> entry3 : c3658bG.g().entrySet()) {
                    C6478ce value = entry3.getValue();
                    if (value == null) {
                        return null;
                    }
                    String e2 = value.e();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (e2.startsWith("data:") && e2.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(e2.substring(e2.indexOf(44) + 1), 0);
                            value.b(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                        } catch (IllegalArgumentException e3) {
                            C8909fc.a("data URL did not have correct base64 format.", e3);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, C6478ce> entry4 : c3658bG.g().entrySet()) {
                if (entry4.getValue().b() == null) {
                    return new C6849cl<>(new IllegalStateException("There is no image for " + entry4.getValue().e()));
                }
            }
            if (str != null) {
                C8262dh.a().b(str, c3658bG);
            }
            return new C6849cl<>(c3658bG);
        } catch (IOException e4) {
            return new C6849cl<>(e4);
        }
    }

    private static Boolean e(InterfaceC7871dIn interfaceC7871dIn) {
        try {
            InterfaceC7871dIn k = interfaceC7871dIn.k();
            for (byte b2 : a) {
                if (k.l() != b2) {
                    return Boolean.FALSE;
                }
            }
            k.close();
            return Boolean.TRUE;
        } catch (Exception e2) {
            C8909fc.c("Failed to check zip file header", e2);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    private static C6478ce c(C3658bG c3658bG, String str) {
        for (C6478ce c6478ce : c3658bG.g().values()) {
            if (c6478ce.e().equals(str)) {
                return c6478ce;
            }
        }
        return null;
    }

    private static C6796ck<C3658bG> d(final String str, Callable<C6849cl<C3658bG>> callable) {
        final C3658bG e2 = str == null ? null : C8262dh.a().e(str);
        if (e2 != null) {
            return new C6796ck<>(new Callable() { // from class: o.bO
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C6849cl e3;
                    e3 = C3743bJ.e(C3658bG.this);
                    return e3;
                }
            });
        }
        if (str != null) {
            Map<String, C6796ck<C3658bG>> map = e;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C6796ck<C3658bG> c6796ck = new C6796ck<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c6796ck.c(new InterfaceC6690ci() { // from class: o.bK
                @Override // o.InterfaceC6690ci
                public final void a(Object obj) {
                    C3743bJ.a(str, atomicBoolean, (C3658bG) obj);
                }
            });
            c6796ck.d(new InterfaceC6690ci() { // from class: o.bL
                @Override // o.InterfaceC6690ci
                public final void a(Object obj) {
                    C3743bJ.a(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, C6796ck<C3658bG>> map2 = e;
                map2.put(str, c6796ck);
                if (map2.size() == 1) {
                    b(false);
                }
            }
        }
        return c6796ck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C6849cl e(C3658bG c3658bG) {
        return new C6849cl(c3658bG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, AtomicBoolean atomicBoolean, C3658bG c3658bG) {
        Map<String, C6796ck<C3658bG>> map = e;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map<String, C6796ck<C3658bG>> map = e;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            b(true);
        }
    }

    private static void b(boolean z) {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((InterfaceC6902cm) arrayList.get(i)).d(z);
        }
    }
}
