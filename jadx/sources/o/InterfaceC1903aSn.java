package o;

import android.content.Context;
import android.os.Handler;
import com.netflix.android.org.json.JSONObject;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.user.UserAgent;

/* renamed from: o.aSn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1903aSn {
    InterfaceC1905aSp a(Context context, Handler handler, UserAgent userAgent);

    InterfaceC1905aSp a(Context context, StatusCode statusCode);

    InterfaceC1905aSp a(Context context, UserAgent userAgent, JSONObject jSONObject);

    InterfaceC1905aSp b(Context context, StatusCode statusCode);

    InterfaceC1905aSp b(Context context, StatusCode statusCode, Runnable runnable, int i);

    InterfaceC1905aSp c(Context context, StatusCode statusCode);

    InterfaceC1905aSp e(Context context, StatusCode statusCode);
}
