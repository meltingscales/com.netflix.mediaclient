package com.netflix.mediaclient.ngpstore.impl.storage.cp;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import o.C1044Mm;
import o.C1656aJj;

/* loaded from: classes6.dex */
public final class NgpContentProvider extends ContentProvider {
    public static final String CONTENT_PATH = "/ngp/ngpstore";
    private static final String TAG = "nf_ngpStoreReal";
    public static final String COL_NGP_DEVICE_ID_STORE = "ngpdeviceidstore";
    public static final String COL_NGP_SSO_STORE = "ngpssostore";
    public static final String COL_LOGOUT_STORE = "logoutstore";
    public static final String[] matrixColumns = {COL_NGP_DEVICE_ID_STORE, COL_NGP_SSO_STORE, COL_LOGOUT_STORE};

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C1044Mm.a(TAG, "onCreate this=" + hashCode() + " pkg=" + getContext().getPackageName());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return getNgpStoreAsCursor();
    }

    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int, boolean] */
    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        boolean z;
        boolean z2;
        C1044Mm.a(TAG, "update thread=" + Thread.currentThread().getName() + " caller= " + getCallingPackage() + " uri=" + uri.toString());
        ?? r2 = 0;
        if (contentValues != null) {
            String asString = contentValues.getAsString(COL_NGP_DEVICE_ID_STORE);
            z2 = asString != null ? C1656aJj.a(getContext(), asString) : false;
            String asString2 = contentValues.getAsString(COL_NGP_SSO_STORE);
            if (asString2 != null) {
                z2 = C1656aJj.c(getContext(), asString2);
            }
            String asString3 = contentValues.getAsString(COL_LOGOUT_STORE);
            z = asString3 != null ? C1656aJj.e(getContext(), asString3) : false;
        } else {
            z = false;
            z2 = false;
        }
        r2 = (z2 || z) ? 1 : 1;
        C1044Mm.c(TAG, "update thread updateDone %b", Boolean.valueOf((boolean) r2));
        return r2;
    }

    private MatrixCursor getNgpStoreAsCursor() {
        String[] strArr = matrixColumns;
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        Object[] objArr = new Object[strArr.length];
        objArr[0] = C1656aJj.a(getContext());
        objArr[1] = C1656aJj.b(getContext());
        objArr[2] = C1656aJj.e(getContext());
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        C1044Mm.a(TAG, "getType");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        C1044Mm.a(TAG, "insert not  implemented.");
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        C1044Mm.a(TAG, "delete not  implemented.");
        return 0;
    }
}
