package o;

import android.text.Html;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aNO extends C1045Mp {
    public static final aNO d = new aNO();

    private aNO() {
        super("nf_cdx_received_message_util");
    }

    public final boolean b(JSONObject jSONObject, String str) {
        C8632dsu.c((Object) jSONObject, "");
        C8632dsu.c((Object) str, "");
        String optString = jSONObject.optString("targetEsn");
        if (optString == null || optString.length() == 0) {
            return true;
        }
        if (!C8632dsu.c((Object) str, (Object) optString)) {
            if (C8632dsu.c((Object) Html.escapeHtml(str), (Object) optString)) {
                getLogTag();
                return true;
            }
            return false;
        }
        getLogTag();
        return true;
    }

    public final void e(JSONObject jSONObject, String str) {
        Throwable th;
        C8632dsu.c((Object) jSONObject, "");
        C8632dsu.c((Object) str, "");
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        C1596aHd e = new C1596aHd("Received wrong targetEsn", null, null, false, null, false, false, 126, null).b(false).b(ErrorType.a).e("message", jSONObject.toString()).e("target", str);
        ErrorType errorType = e.a;
        if (errorType != null) {
            e.e.put("errorType", errorType.c());
            String b = e.b();
            if (b != null) {
                String c = errorType.c();
                e.a(c + " " + b);
            }
        }
        if (e.b() != null && e.i != null) {
            th = new Throwable(e.b(), e.i);
        } else if (e.b() != null) {
            th = new Throwable(e.b());
        } else {
            th = e.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(e, th);
        } else {
            dVar.e().b(e, th);
        }
    }
}
