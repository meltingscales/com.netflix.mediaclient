package com.netflix.model.branches;

import com.netflix.falkor.BranchMap;
import o.IN;
import o.InterfaceC8322diG;

/* loaded from: classes5.dex */
public class SummarizedList<T extends InterfaceC8322diG, L extends InterfaceC8322diG> extends BranchMap<T> {
    private final IN<L> b;
    private L e;

    public L b() {
        return this.e;
    }

    public SummarizedList(IN<T> in, IN<L> in2) {
        super(in);
        this.b = in2;
    }

    @Override // com.netflix.falkor.BranchMap, o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        return "summary".equals(str) ? this.e : super.b(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.netflix.falkor.BranchMap, o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        if ("summary".equals(str)) {
            this.e = interfaceC8322diG;
        } else {
            super.d(str, interfaceC8322diG);
        }
    }

    @Override // com.netflix.falkor.BranchMap, o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        InterfaceC8322diG b = b(str);
        if (b == null) {
            if ("summary".equals(str)) {
                L d = this.b.d();
                this.e = d;
                return d;
            }
            return super.e(str);
        }
        return b;
    }
}
