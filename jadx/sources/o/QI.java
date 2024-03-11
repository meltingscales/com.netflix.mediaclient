package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.FragmentActivity;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import o.QI;

/* loaded from: classes3.dex */
public abstract class QI<T> {
    public static final a b = new a(null);
    public static final int e = 8;
    private BitmapDrawable c;
    private HawkinsIcon d;

    public abstract String a();

    public abstract CharSequence b();

    public final void b(BitmapDrawable bitmapDrawable) {
        this.c = bitmapDrawable;
    }

    public final void b(HawkinsIcon hawkinsIcon) {
        this.d = hawkinsIcon;
    }

    public final BitmapDrawable c() {
        return this.c;
    }

    public abstract Single<Intent> d(FragmentActivity fragmentActivity, Shareable<T> shareable);

    public abstract String d();

    public void d(FragmentActivity fragmentActivity, T t) {
        C8632dsu.c((Object) fragmentActivity, "");
    }

    public abstract boolean d(PackageManager packageManager, Map<String, ? extends PackageInfo> map);

    public abstract String e();

    public final HawkinsIcon g() {
        return this.d;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final <T> Observable<List<QI<T>>> a(final Context context, final List<? extends QI<T>> list) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) list, "");
            Observable<List<QI<T>>> fromCallable = Observable.fromCallable(new Callable() { // from class: o.QL
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List c;
                    c = QI.a.c(context, list);
                    return c;
                }
            });
            C8632dsu.a(fromCallable, "");
            return fromCallable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List c(Context context, List list) {
            int d;
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) list, "");
            PackageManager packageManager = context.getPackageManager();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            C8632dsu.a(installedPackages, "");
            d = C8572dqo.d(installedPackages, 10);
            ArrayList arrayList = new ArrayList(d);
            for (PackageInfo packageInfo : installedPackages) {
                if (packageInfo.applicationInfo.enabled) {
                    String str = packageInfo.packageName;
                    C8632dsu.a(str, "");
                    C8632dsu.d(packageInfo);
                    linkedHashMap.put(str, packageInfo);
                }
                arrayList.add(dpR.c);
            }
            ArrayList arrayList2 = new ArrayList();
            for (T t : list) {
                C8632dsu.d(packageManager);
                if (((QI) t).d(packageManager, linkedHashMap)) {
                    arrayList2.add(t);
                }
            }
            return arrayList2;
        }
    }
}
