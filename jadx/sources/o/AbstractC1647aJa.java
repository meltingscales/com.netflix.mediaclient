package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.netflix.mediaclient.ngpstore.api.NgpStoreApi;
import com.netflix.mediaclient.ngpstore.impl.storage.cp.NgpContentProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.aJa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1647aJa implements NgpStoreApi {
    private static final int c;
    private static final int d;
    private static final int e;
    private final BlockingQueue<Runnable> a;
    protected final ExecutorService b;

    private String e() {
        return "com.netflix.android.action.ngpdiscover";
    }

    static {
        int min = Math.min(Runtime.getRuntime().availableProcessors(), 32);
        d = min;
        int max = Math.max(min, 2);
        c = max;
        e = Math.min(max * 4, 32);
    }

    public AbstractC1647aJa() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.a = linkedBlockingQueue;
        this.b = new ThreadPoolExecutor(c, e, 60L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    @Override // com.netflix.mediaclient.ngpstore.api.NgpStoreApi
    public List<String> getInstalledPackages(Context context) {
        ProviderInfo providerInfo;
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent();
        intent.setAction(e());
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentContentProviders(intent, 0)) {
            if (resolveInfo != null && (providerInfo = resolveInfo.providerInfo) != null && providerInfo.packageName != null) {
                C1044Mm.a("ngp_storeBase", "installed package found " + resolveInfo.providerInfo.packageName);
                arrayList.add(resolveInfo.providerInfo.packageName);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<Uri> b() {
        aOV d2 = AbstractApplicationC1040Mh.getInstance().i().d();
        List<String> installedPackages = getInstalledPackages(c());
        Collection<String> emptyList = Collections.emptyList();
        if (d2 != null) {
            emptyList = d2.V();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : installedPackages) {
            if (emptyList.contains(str)) {
                C1044Mm.a("ngp_storeBase", "exclude revoked package " + str);
            } else {
                arrayList.add(Uri.parse("content://" + str + NgpContentProvider.CONTENT_PATH));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Context c() {
        return AbstractApplicationC1040Mh.d();
    }
}
