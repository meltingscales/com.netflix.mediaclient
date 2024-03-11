package o;

/* loaded from: classes3.dex */
public abstract class aUE extends AbstractC1968aUz {
    protected abstract String R();

    @Override // com.netflix.android.volley.Request
    public String a() {
        return "application/json";
    }

    @Override // com.netflix.android.volley.Request
    public String m() {
        return a();
    }

    @Override // com.netflix.android.volley.Request
    public byte[] l() {
        return Q_();
    }

    @Override // com.netflix.android.volley.Request
    public byte[] Q_() {
        try {
            return R().getBytes("UTF-8");
        } catch (Exception e) {
            C1044Mm.e(L(), "Failed to create body of client logging request", e);
            return null;
        }
    }

    @Override // o.AbstractC1968aUz
    public String P() {
        return ((AbstractC1968aUz) this).a.d("/ichnaea/log");
    }
}
