package com.netflix.model.branches;

import com.netflix.falkor.BranchMap;
import com.netflix.model.leafs.originals.BillboardSummaryImpl;
import o.IN;
import o.InterfaceC8322diG;

/* loaded from: classes5.dex */
public class FalkorBillboardData extends BranchMap<BillboardSummaryImpl> {
    private BillboardSummaryImpl c;

    public FalkorBillboardData(IN<BillboardSummaryImpl> in) {
        super(in);
    }

    @Override // com.netflix.falkor.BranchMap, o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        str.hashCode();
        if (str.equals("billboardSummary")) {
            return this.c;
        }
        throw new IllegalStateException("Can't get node for key: " + str);
    }

    @Override // com.netflix.falkor.BranchMap, o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        InterfaceC8322diG b = b(str);
        if (b != null) {
            return b;
        }
        str.hashCode();
        if (str.equals("billboardSummary")) {
            BillboardSummaryImpl billboardSummaryImpl = new BillboardSummaryImpl();
            this.c = billboardSummaryImpl;
            return billboardSummaryImpl;
        }
        throw new IllegalStateException("Can't create node for key: " + str);
    }

    @Override // com.netflix.falkor.BranchMap, o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        str.hashCode();
        if (str.equals("billboardSummary")) {
            this.c = (BillboardSummaryImpl) interfaceC8322diG;
        }
    }

    @Override // com.netflix.falkor.BranchMap, o.InterfaceC0943Io
    public void a(String str) {
        d(str, null);
    }
}
