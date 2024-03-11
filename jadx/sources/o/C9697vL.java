package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.vL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9697vL {
    private static final Map<String, Integer> a = new LinkedHashMap();

    public static final void b(SearchView searchView, long j, boolean z) {
        ImageView a2;
        C8632dsu.c((Object) searchView, "");
        ImageView d = d(searchView);
        if (d != null) {
            d.animate().alpha(0.0f).setDuration(j).start();
        }
        EditText c = c(searchView);
        if (c != null) {
            c.animate().alpha(0.0f).setDuration(j).start();
        }
        if (!z || (a2 = a(searchView)) == null) {
            return;
        }
        a2.animate().alpha(0.0f).setDuration(j).start();
    }

    public static final void c(SearchView searchView, int i) {
        C8632dsu.c((Object) searchView, "");
        EditText e = e(searchView);
        if (e == null) {
            return;
        }
        e.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
    }

    public static final void d(SearchView searchView, int i) {
        C8632dsu.c((Object) searchView, "");
        ColorStateList valueOf = ColorStateList.valueOf(i);
        ImageView d = d(searchView);
        if (d != null) {
            d.setImageTintList(valueOf);
        }
        ImageView a2 = a(searchView);
        if (a2 != null) {
            a2.setImageTintList(valueOf);
        }
        ImageView b = b(searchView);
        if (b != null) {
            b.setImageTintList(valueOf);
        }
        EditText c = c(searchView);
        if (c != null) {
            c.setHintTextColor(i);
        }
    }

    public static final void b(SearchView searchView, int i) {
        C8632dsu.c((Object) searchView, "");
        EditText c = c(searchView);
        if (c != null) {
            c.setTextColor(i);
        }
    }

    public static final void a(SearchView searchView, Activity activity) {
        C8632dsu.c((Object) searchView, "");
        C8632dsu.c((Object) activity, "");
        Object systemService = activity.getSystemService("search");
        C8632dsu.d(systemService);
        searchView.setSearchableInfo(((SearchManager) systemService).getSearchableInfo(activity.getComponentName()));
    }

    public static final EditText e(SearchView searchView) {
        C8632dsu.c((Object) searchView, "");
        Context context = searchView.getContext();
        C8632dsu.a(context, "");
        return (EditText) searchView.findViewById(c(context, "android:id/search_src_text"));
    }

    public static final ImageView a(SearchView searchView) {
        C8632dsu.c((Object) searchView, "");
        Context context = searchView.getContext();
        C8632dsu.a(context, "");
        return (ImageView) searchView.findViewById(c(context, "android:id/search_mag_icon"));
    }

    public static final ImageView d(SearchView searchView) {
        C8632dsu.c((Object) searchView, "");
        Context context = searchView.getContext();
        C8632dsu.a(context, "");
        return (ImageView) searchView.findViewById(c(context, "android:id/search_voice_btn"));
    }

    public static final ImageView b(SearchView searchView) {
        C8632dsu.c((Object) searchView, "");
        Context context = searchView.getContext();
        C8632dsu.a(context, "");
        return (ImageView) searchView.findViewById(c(context, "android:id/search_close_btn"));
    }

    public static final EditText c(SearchView searchView) {
        C8632dsu.c((Object) searchView, "");
        Context context = searchView.getContext();
        C8632dsu.a(context, "");
        return (EditText) searchView.findViewById(c(context, "android:id/search_src_text"));
    }

    @SuppressLint({"DiscouragedApi"})
    private static final int c(Context context, String str) {
        int e;
        Map d;
        Map k;
        Throwable th;
        Integer num = a.get(str);
        if (num != null) {
            return num.intValue();
        }
        try {
            Result.c cVar = Result.e;
            e = Result.e(Integer.valueOf(context.getResources().getIdentifier(str, null, null)));
        } catch (Throwable th2) {
            Result.c cVar2 = Result.e;
            e = Result.e(C8556dpz.a(th2));
        }
        Throwable d2 = Result.d(e);
        if (d2 != null) {
            InterfaceC1598aHf.c cVar3 = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Failed to get Identifier by name from searchView", d2, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        if (Result.h(e)) {
            a.put(str, Integer.valueOf(((Number) e).intValue()));
        }
        if (Result.a(e)) {
            e = -1;
        }
        return ((Number) e).intValue();
    }
}
