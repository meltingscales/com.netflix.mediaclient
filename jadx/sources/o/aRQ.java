package o;

import com.netflix.mediaclient.service.webclient.model.leafs.ABTestConfig;

/* loaded from: classes.dex */
public abstract class aRQ {
    private ABTestConfig.Cell e = ABTestConfig.Cell.CELL_1;

    public abstract String e();

    public void e(ABTestConfig.Cell cell) {
        this.e = cell;
    }

    public static ABTestConfig.Cell d(String str) {
        aRQ d = aRP.d(str);
        return d != null ? d.e : ABTestConfig.Cell.CELL_1;
    }
}
