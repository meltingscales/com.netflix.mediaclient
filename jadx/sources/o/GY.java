package o;

import android.content.Context;
import com.google.gson.Gson;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.aRM;

/* loaded from: classes3.dex */
public final class GY {
    private static final C0916Hn b = new C0916Hn("falcor_cache", true, false);
    private static boolean e;

    public static final InterfaceC0908Hf c(Context context, Gson gson) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) gson, "");
        long freeSpace = context.getFilesDir().getFreeSpace();
        if (freeSpace >= 104857600) {
            return new C0917Ho(context, gson, b);
        }
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        aVar.a("Falcor: openFalcorDiskCache skipped, free space = " + freeSpace);
        return C0910Hh.e;
    }

    public static final void d(Context context) {
        C8632dsu.c((Object) context, "");
        e = b(context);
    }

    public static final boolean b(final Context context) {
        List c2;
        String d;
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) context, "");
        String e2 = C8157dfA.e(context, "falcorDiskcacheDataVersionCodeV2", "0");
        Collection<aRM> d3 = C1818aPj.d(context);
        C8632dsu.a(d3, "");
        c2 = C8576dqs.c((Iterable) d3, (Comparator) new c());
        d = C8576dqs.d(c2, ",", null, null, 0, null, new drM<aRM, CharSequence>() { // from class: com.netflix.falcor.android.util.FalcorDiskCacheProvider$deleteDatabaseIfWrongVersionCode$abConfigs$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final CharSequence invoke(aRM arm) {
                String d4 = arm.d();
                int cellId = arm.c(context).getCellId();
                return d4 + ":" + cellId;
            }
        }, 30, null);
        String str = C8055ddE.c(context) + "-" + d;
        if (C8632dsu.c((Object) e2, (Object) str)) {
            return false;
        }
        boolean exists = context.getDatabasePath("falcor_cache").exists();
        if (!context.deleteDatabase("falcor_cache") && exists) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.m;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Cannot delete Falcor Sqlite DiskCache DB", null, errorType, false, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType2.c() + " " + b2);
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
                return true;
            }
            dVar.e().b(c1596aHd, th);
            return true;
        }
        C1044Mm.e("FalcorDiskCache", "setting db version " + str);
        C8157dfA.a(context, "falcorDiskcacheDataVersionCodeV2", str);
        return true;
    }

    /* loaded from: classes3.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((aRM) t).d(), ((aRM) t2).d());
            return compareValues;
        }
    }
}
