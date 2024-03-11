package o;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.bcj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4344bcj {
    private static C4344bcj a;
    private static Gson c;
    @SerializedName("errormap")
    protected Map<String, Integer> b;
    @SerializedName("errorCount")
    public int e;

    public static C4344bcj a() {
        return a;
    }

    public int c() {
        return this.e;
    }

    public static C4344bcj d() {
        if (a == null) {
            c = C8118deO.a();
            String e = C8157dfA.e((Context) C1332Xp.b(Context.class), "device_error_info", (String) null);
            C1044Mm.c("DevicePlaybackErrorInfo", "restore persisted Data %s .", e);
            if (C8168dfL.h(e)) {
                try {
                    a = (C4344bcj) c.fromJson(e, (Class<Object>) C4344bcj.class);
                } catch (JsonSyntaxException e2) {
                    C1044Mm.j("DevicePlaybackErrorInfo", "has JsonSyntaxException %s .", e2);
                }
            }
            if (a == null) {
                a = new C4344bcj();
            }
        }
        return a;
    }

    private C4344bcj() {
    }

    public void b(String str) {
        synchronized (this) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            Integer num = this.b.get(str);
            if (num == null) {
                num = 0;
            }
            this.e++;
            this.b.put(str, Integer.valueOf(num.intValue() + 1));
            f();
        }
    }

    public void b() {
        synchronized (this) {
            if (this.e != 0) {
                e();
            }
            this.b = null;
            this.e = 0;
        }
    }

    private void f() {
        synchronized (this) {
            String json = c.toJson(this);
            C8157dfA.a((Context) C1332Xp.b(Context.class), "device_error_info", json);
            C1044Mm.c("DevicePlaybackErrorInfo", "save deviceErrorMap data %s .", json);
        }
    }

    private void e() {
        synchronized (this) {
            C8157dfA.e((Context) C1332Xp.b(Context.class), "device_error_info");
        }
    }
}
