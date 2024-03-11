package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class bh {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("AssetPackStorage");
    private static final long b;
    private static final long c;
    private final Context d;
    private final ed e;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        b = timeUnit.toMillis(14L);
        c = timeUnit.toMillis(28L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bh(Context context, ed edVar) {
        this.d = context;
        this.e = edVar;
    }

    private static long H(File file, boolean z) {
        File[] listFiles;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            if (z && file.listFiles().length > 1) {
                a.e("Multiple pack versions found, using highest version code.", new Object[0]);
            }
            try {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e) {
                a.c(e, "Corrupt asset pack directories.", new Object[0]);
            }
            if (arrayList.isEmpty()) {
                return -1L;
            }
            Collections.sort(arrayList);
            return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
        }
        return -1L;
    }

    private final File I(String str) {
        return new File(L(), str);
    }

    private final File J(String str, int i, long j) {
        return new File(j(str, i, j), "merge.tmp");
    }

    private final File K(String str, int i, long j) {
        return new File(new File(new File(M(), str), String.valueOf(i)), String.valueOf(j));
    }

    private final File L() {
        return new File(this.d.getFilesDir(), "assetpacks");
    }

    private final File M() {
        return new File(L(), "_tmp");
    }

    private final List O() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e) {
            a.b("Could not process directory while scanning installed packs. %s", e);
        }
        if (L().exists() && L().listFiles() != null) {
            for (File file : L().listFiles()) {
                if (!file.getCanonicalPath().equals(M().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    private static boolean Q(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= Q(file2);
            }
        }
        if (file.delete()) {
            return z;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(String str, int i, long j, int i2) {
        File J2 = J(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        J2.getParentFile().mkdirs();
        J2.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(J2);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(String str, int i, long j) {
        File[] listFiles;
        File[] listFiles2;
        File I = I(str);
        if (I.exists()) {
            for (File file : I.listFiles()) {
                if (file.getName().equals(String.valueOf(i)) || file.getName().equals("stale.tmp")) {
                    if (file.getName().equals(String.valueOf(i))) {
                        for (File file2 : file.listFiles()) {
                            if (!file2.getName().equals(String.valueOf(j))) {
                                Q(file2);
                            }
                        }
                    }
                } else {
                    Q(file);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(List list) {
        int a2 = this.e.a();
        for (File file : O()) {
            if (!list.contains(file.getName()) && H(file, true) != a2) {
                Q(file);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean E(String str, int i, long j) {
        if (K(str, i, j).exists()) {
            return Q(K(str, i, j));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F(String str, int i, long j) {
        if (h(str, i, j).exists()) {
            return Q(h(str, i, j));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G(String str) {
        try {
            return r(str) != null;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(String str) {
        return (int) H(I(str), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(String str, int i, long j) {
        File J2 = J(str, i, j);
        if (J2.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(J2);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("numberOfMerges") == null) {
                    throw new ck("Merge checkpoint file corrupt.");
                }
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new ck("Merge checkpoint file corrupt.", e);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long c(String str) {
        return H(g(str, (int) H(I(str), true)), true);
    }

    final AssetPackLocation f(String str) {
        String r = r(str);
        if (r == null) {
            return null;
        }
        File file = new File(r, "assets");
        if (!file.isDirectory()) {
            a.b("Failed to find assets directory: %s", file);
            return null;
        }
        return new bm(0, r, file.getCanonicalPath());
    }

    final File g(String str, int i) {
        return new File(I(str), String.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File h(String str, int i, long j) {
        return new File(g(str, i), String.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File i(String str, int i, long j) {
        return new File(h(str, i, j), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File j(String str, int i, long j) {
        return new File(K(str, i, j), "_packs");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File k(String str, int i, long j) {
        return new File(i(str, i, j), "properties.dat");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File l(String str, int i, long j) {
        return new File(new File(K(str, i, j), "_slices"), "_metadata");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File m(String str, int i, long j, String str2) {
        return new File(o(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File n(String str, int i, long j, String str2) {
        return new File(o(str, i, j, str2), "checkpoint.dat");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File o(String str, int i, long j, String str2) {
        return new File(l(str, i, j), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File p(String str, int i, long j, String str2) {
        return new File(new File(new File(K(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File q(String str, int i, long j, String str2) {
        return new File(new File(new File(K(str, i, j), "_slices"), "_verified"), str2);
    }

    final String r(String str) {
        int length;
        File file = new File(L(), str);
        if (!file.exists()) {
            a.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.e.a()));
        if (!file2.exists()) {
            a.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.e.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            a.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.e.a()));
            return null;
        } else if (length > 1) {
            a.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.e.a()));
            return null;
        } else {
            return listFiles[0].getCanonicalPath();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map t() {
        HashMap hashMap = new HashMap();
        for (File file : O()) {
            String name = file.getName();
            int H = (int) H(I(name), true);
            long H2 = H(g(name, H), true);
            if (h(name, H, H2).exists()) {
                hashMap.put(name, Long.valueOf(H2));
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map u() {
        HashMap hashMap = new HashMap();
        for (String str : v().keySet()) {
            hashMap.put(str, Long.valueOf(c(str)));
        }
        return hashMap;
    }

    final Map v() {
        HashMap hashMap = new HashMap();
        try {
            for (File file : O()) {
                AssetPackLocation f = f(file.getName());
                if (f != null) {
                    hashMap.put(file.getName(), f);
                }
            }
        } catch (IOException e) {
            a.b("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z() {
        Q(L());
    }
}
