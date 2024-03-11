package o;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

@SuppressLint({"LogNotNetflixLog"})
/* renamed from: o.Mm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044Mm {
    public static int a(String str) {
        return 0;
    }

    public static int a(String str, String str2) {
        return 0;
    }

    public static int a(String str, String str2, Object... objArr) {
        return 0;
    }

    public static int a(String str, Throwable th, String str2) {
        return 0;
    }

    public static int a(String str, Throwable th, String str2, Object... objArr) {
        return 0;
    }

    public static void a(String str, String str2, byte[] bArr) {
    }

    public static int b(String str, String str2) {
        return 0;
    }

    public static int b(String str, String str2, Object... objArr) {
        return 0;
    }

    public static int b(String str, Throwable th, String str2, Object... objArr) {
        return 0;
    }

    public static void b(String str, Intent intent) {
    }

    public static int c(String str, String str2, Object... objArr) {
        return 0;
    }

    public static int c(String str, Throwable th, String str2, Object... objArr) {
        return 0;
    }

    public static void c(String str, Intent intent) {
    }

    public static void c(String str, String str2) {
    }

    public static int d(String str, String str2) {
        return 0;
    }

    public static int d(String str, String str2, Object... objArr) {
        return 0;
    }

    public static int e(String str, String str2) {
        return 0;
    }

    public static int e(String str, String str2, Throwable th) {
        return 0;
    }

    public static int e(String str, String str2, Object... objArr) {
        return 0;
    }

    public static int e(String str, Throwable th) {
        return 0;
    }

    public static int e(String str, Throwable th, String str2, Object... objArr) {
        return 0;
    }

    public static int j(String str, String str2) {
        return 0;
    }

    public static int j(String str, String str2, Object... objArr) {
        return 0;
    }

    public static void a(String str, Exception exc) {
        b(str, exc, "Exception msg: " + exc.getMessage(), new Object[0]);
    }

    public static String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void b(String str, String str2, Intent intent) {
        e(str, str2);
        c(str, intent);
    }

    public static String d(Throwable th) {
        return th == null ? "" : Log.getStackTraceString(th);
    }
}
