package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class eb {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("PackMetadataManager");
    private final bh b;
    private final ed c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eb(bh bhVar, ed edVar) {
        this.b = bhVar;
        this.c = edVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(String str) {
        if (this.b.G(str)) {
            int a2 = this.c.a();
            bh bhVar = this.b;
            File k = bhVar.k(str, a2, bhVar.c(str));
            try {
                if (!k.exists()) {
                    return String.valueOf(a2);
                }
                FileInputStream fileInputStream = new FileInputStream(k);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                String property = properties.getProperty("moduleVersionTag");
                return property == null ? String.valueOf(a2) : property;
            } catch (IOException unused) {
                a.b("Failed to read pack version tag for pack %s", str);
                return "";
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, int i, long j, String str2) {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File k = this.b.k(str, i, j);
        k.getParentFile().mkdirs();
        k.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(k);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }
}
