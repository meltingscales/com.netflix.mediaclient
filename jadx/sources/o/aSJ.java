package o;

import android.os.Bundle;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes6.dex */
public final class aSJ {
    public static final aSJ a = new aSJ();

    private aSJ() {
    }

    public final Bundle b(WorkerParameters workerParameters, String str) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) workerParameters, "");
        C8632dsu.c((Object) str, "");
        Data inputData = workerParameters.getInputData();
        C8632dsu.a(inputData, "");
        Map<String, Object> keyValueMap = inputData.getKeyValueMap();
        C8632dsu.a(keyValueMap, "");
        Map<String, String> hashMap = new HashMap<>();
        for (String str2 : keyValueMap.keySet()) {
            Object obj = keyValueMap.get(str2);
            if (obj instanceof String) {
                C8632dsu.d((Object) str2);
                hashMap.put(str2, obj);
            } else {
                String str3 = "Key " + str2 + " is not String, but " + obj + "!";
                C1044Mm.d(str, str3);
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd(str3, null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
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
        }
        return e(hashMap);
    }

    public final Bundle e(Map<String, String> map) {
        C8632dsu.c((Object) map, "");
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, String.valueOf(map.get(str)));
        }
        return bundle;
    }

    public final Data d(Map<String, String> map) {
        C8632dsu.c((Object) map, "");
        Data build = new Data.Builder().putAll(map).build();
        C8632dsu.a(build, "");
        return build;
    }
}
