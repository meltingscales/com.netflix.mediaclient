package o;

import com.netflix.android.volley.Request;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public interface aHJ {
    public static final Executor e = Executors.newFixedThreadPool(4);

    int a();

    aHF a(String str, Request.Priority priority, Map<String, String> map, Object obj, List<Object> list);

    C9865xz a(InterfaceC9854xo interfaceC9854xo, InterfaceC9857xr interfaceC9857xr, int i, boolean z, String str);

    int c();

    @Deprecated
    HttpURLConnection c(URL url);

    int e();
}
