package o;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;

/* renamed from: o.ms  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC9296ms extends ContentProvider {
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        e();
        return null;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        e();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        e();
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        e();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        e();
        return 0;
    }

    @SuppressLint({"NewApi"})
    protected final void e() {
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i > 28) {
            return;
        }
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            Context context = getContext();
            if (C8632dsu.c((Object) callingPackage, (Object) (context == null ? null : context.getPackageName()))) {
                return;
            }
        }
        throw new SecurityException("Provider does not allow Uri permissions to be granted");
    }
}
