package org.chromium.base;

import java.util.Locale;
import org.chromium.build.annotations.DoNotInline;

/* loaded from: classes5.dex */
public class Log {
    private static boolean isDebug() {
        return true;
    }

    private static String formatLog(String str, Throwable th, Object... objArr) {
        return objArr != null ? ((th != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr) : str;
    }

    public static String normalizeTag(String str) {
        return "cr_" + str;
    }

    public static boolean isLoggable(String str, int i) {
        isDebug();
        if (i <= 4) {
            return false;
        }
        return android.util.Log.isLoggable(str, i);
    }

    public static void i(String str, String str2, Object... objArr) {
        Throwable throwableToLog = getThrowableToLog(objArr);
        String formatLog = formatLog(str2, throwableToLog, objArr);
        String normalizeTag = normalizeTag(str);
        if (throwableToLog != null) {
            android.util.Log.i(normalizeTag, formatLog, throwableToLog);
        } else {
            android.util.Log.i(normalizeTag, formatLog);
        }
    }

    public static void i(String str, String str2) {
        android.util.Log.i(normalizeTag(str), str2);
    }

    @DoNotInline
    public static void i(String str, String str2, Object obj) {
        i(str, str2, obj);
    }

    @DoNotInline
    public static void i(String str, String str2, Object obj, Object obj2) {
        i(str, str2, obj, obj2);
    }

    public static void w(String str, String str2, Object... objArr) {
        Throwable throwableToLog = getThrowableToLog(objArr);
        String formatLog = formatLog(str2, throwableToLog, objArr);
        String normalizeTag = normalizeTag(str);
        if (throwableToLog != null) {
            android.util.Log.w(normalizeTag, formatLog, throwableToLog);
        } else {
            android.util.Log.w(normalizeTag, formatLog);
        }
    }

    public static void w(String str, String str2) {
        android.util.Log.w(normalizeTag(str), str2);
    }

    public static void w(String str, String str2, Throwable th) {
        android.util.Log.w(normalizeTag(str), str2, th);
    }

    @DoNotInline
    public static void w(String str, String str2, Object obj) {
        w(str, str2, obj);
    }

    @DoNotInline
    public static void w(String str, String str2, Object obj, Object obj2) {
        w(str, str2, obj, obj2);
    }

    public static void e(String str, String str2, Object... objArr) {
        Throwable throwableToLog = getThrowableToLog(objArr);
        String formatLog = formatLog(str2, throwableToLog, objArr);
        String normalizeTag = normalizeTag(str);
        if (throwableToLog != null) {
            android.util.Log.e(normalizeTag, formatLog, throwableToLog);
        } else {
            android.util.Log.e(normalizeTag, formatLog);
        }
    }

    public static void e(String str, String str2) {
        android.util.Log.e(normalizeTag(str), str2);
    }

    public static void e(String str, String str2, Throwable th) {
        android.util.Log.e(normalizeTag(str), str2, th);
    }

    @DoNotInline
    public static void e(String str, String str2, Object obj) {
        e(str, str2, obj);
    }

    @DoNotInline
    public static void e(String str, String str2, Object obj, Object obj2) {
        e(str, str2, obj, obj2);
    }

    public static String getStackTraceString(Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    private static Throwable getThrowableToLog(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }
}
