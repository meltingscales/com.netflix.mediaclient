package o;

import com.netflix.android.org.json.HTTP;

/* renamed from: o.aXz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2049aXz extends aXC {
    private String e;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2049aXz(String str) {
        super(str);
        this.e = "sessionAction=appMessage\r\n";
        b("appAction", str);
    }

    private void b(String str, String str2) {
        this.e += str + "=" + str2 + HTTP.CRLF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(String str, String str2) {
        this.e += "appBody." + str + "=" + str2 + HTTP.CRLF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, boolean z) {
        this.e += "appBody." + str + "=" + String.valueOf(z) + HTTP.CRLF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, int i) {
        this.e += "appBody." + str + "=" + String.valueOf(i) + HTTP.CRLF;
    }

    public String d(int i) {
        return this.e + "sessionId=" + String.valueOf(i) + HTTP.CRLF;
    }
}
