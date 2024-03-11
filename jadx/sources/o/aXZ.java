package o;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aXZ extends AbstractC2063aYm {
    private static String a = "transactionId";
    private static String d = "errorCode";
    private static String e = "errorDesc";
    private String f;
    private String i;
    private String j;

    public aXZ(JSONObject jSONObject) {
        super("MESSAGE_IGNORED");
        this.j = jSONObject.getString(a);
        this.i = jSONObject.getString(d);
        this.f = C8123deT.a(jSONObject, e, (String) null);
    }
}
