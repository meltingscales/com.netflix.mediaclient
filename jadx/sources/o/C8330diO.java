package o;

import com.netflix.model.leafs.SceneSummary;

/* renamed from: o.diO  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8330diO extends AbstractC8316diA {
    public SceneSummary d;

    public C8330diO(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        super(interfaceC1240Ub);
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        str.hashCode();
        if (str.equals("summary")) {
            return this.d;
        }
        throw new IllegalStateException("Can't get node for key: " + str);
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        InterfaceC8322diG b = b(str);
        if (b != null) {
            return b;
        }
        str.hashCode();
        if (str.equals("summary")) {
            SceneSummary sceneSummary = new SceneSummary();
            this.d = sceneSummary;
            return sceneSummary;
        }
        throw new IllegalStateException("Can't handle key: " + str);
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        if ("summary".equals(str)) {
            this.d = (SceneSummary) interfaceC8322diG;
        }
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        d(str, null);
    }

    public int a() {
        SceneSummary sceneSummary = this.d;
        if (sceneSummary == null) {
            return 0;
        }
        return sceneSummary.position;
    }

    public String toString() {
        return "FalkorScene{sceneSummary=" + this.d + '}';
    }
}
