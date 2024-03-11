package com.netflix.mediaclient.ui.search;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o.C8150deu;
import o.InterfaceC1598aHf;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SearchUtils {
    private static SearchExperience c;
    private static final SparseArray<SparseIntArray> d = new SparseArray<>(2);
    private static final SparseArray<SparseIntArray> a = new SparseArray<>(2);

    /* loaded from: classes4.dex */
    public enum SearchExperience {
        PHONE,
        TABLET
    }

    static {
        d(C8150deu.h() ? SearchExperience.TABLET : SearchExperience.PHONE);
    }

    public static String b(Context context) {
        String string = context.getSharedPreferences("com.netflix.android.search", 0).getString("sessionId", "");
        if (string.isEmpty()) {
            String uuid = UUID.randomUUID().toString();
            context.getSharedPreferences("com.netflix.android.search", 0).edit().putString("sessionId", uuid).apply();
            return uuid;
        }
        return string;
    }

    public static String e(Context context) {
        String uuid = UUID.randomUUID().toString();
        context.getSharedPreferences("com.netflix.android.search", 0).edit().putString("sessionId", uuid).apply();
        return uuid;
    }

    public static void d(SearchExperience searchExperience) {
        if (searchExperience != c) {
            c = searchExperience;
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.search.SearchUtils$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SearchExperience.values().length];
            c = iArr;
            try {
                iArr[SearchExperience.TABLET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static void f() {
        if (AnonymousClass1.c[c.ordinal()] == 1) {
            j();
            i();
            return;
        }
        h();
        g();
    }

    public static long d() {
        return System.currentTimeMillis() + TimeUnit.HOURS.toMillis(4L);
    }

    public static void a(Bundle bundle) {
        if (ConfigFastPropertyFeatureControlConfig.Companion.p()) {
            bundle.putLong("instance_state_timestamp", d());
        }
    }

    public static boolean e(Bundle bundle) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = bundle.getLong("instance_state_timestamp", 0L);
        return j > 0 && currentTimeMillis > j;
    }

    private static void g() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray.put(1, 2);
        sparseIntArray2.put(1, 1);
        sparseIntArray.put(2, 3);
        sparseIntArray2.put(2, 1);
        sparseIntArray.put(3, 4);
        sparseIntArray2.put(3, 1);
        sparseIntArray.put(4, 4);
        sparseIntArray2.put(4, 1);
        a.put(1, sparseIntArray);
        d.put(1, sparseIntArray2);
    }

    private static void h() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray.put(1, 3);
        sparseIntArray2.put(1, 1);
        sparseIntArray.put(2, 4);
        sparseIntArray2.put(2, 1);
        sparseIntArray.put(3, 5);
        sparseIntArray2.put(3, 1);
        sparseIntArray.put(4, 6);
        sparseIntArray2.put(4, 1);
        a.put(2, sparseIntArray);
        d.put(2, sparseIntArray2);
    }

    private static void i() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray.put(1, 3);
        sparseIntArray2.put(1, 3);
        sparseIntArray.put(2, 2);
        sparseIntArray2.put(2, 3);
        sparseIntArray.put(3, 2);
        sparseIntArray2.put(3, 3);
        sparseIntArray.put(4, 3);
        sparseIntArray2.put(4, 3);
        a.put(1, sparseIntArray);
        d.put(1, sparseIntArray2);
    }

    private static void j() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray.put(1, 2);
        sparseIntArray2.put(1, 1);
        sparseIntArray.put(2, 3);
        sparseIntArray2.put(2, 1);
        sparseIntArray.put(3, 3);
        sparseIntArray2.put(3, 1);
        sparseIntArray.put(4, 3);
        sparseIntArray2.put(4, 1);
        a.put(2, sparseIntArray);
        d.put(2, sparseIntArray2);
    }

    public static int a() {
        return BrowseExperience.a() ? R.o.ga : R.o.fX;
    }

    public static int e() {
        return BrowseExperience.a() ? R.o.gf : R.o.gb;
    }

    public static int c() {
        return BrowseExperience.a() ? R.o.eI : R.o.eE;
    }

    public static int b() {
        return BrowseExperience.a() ? R.o.eD : R.o.eC;
    }

    public static void a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str);
            jSONObject.put("reason", str2);
            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
        } catch (JSONException unused) {
            InterfaceC1598aHf.a("json exception happened in debug Logging tag: " + str + " reason: " + str2);
        }
    }
}
