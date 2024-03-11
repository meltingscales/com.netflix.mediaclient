package com.netflix.falkor;

import java.util.HashMap;
import java.util.Map;
import o.C0949Iu;
import o.IF;
import o.II;
import o.IJ;
import o.IN;
import o.InterfaceC0943Io;
import o.InterfaceC8322diG;

/* loaded from: classes.dex */
public class BranchMap<T extends InterfaceC8322diG> extends HashMap<String, T> implements InterfaceC0943Io, II {
    private final IN<T> a;
    private Map<String, InterfaceC8322diG> c;
    private C0949Iu<IF> e;

    @Override // o.II
    public C0949Iu<IF> cm_() {
        return this.e;
    }

    @Override // o.II
    public void e(C0949Iu<IF> c0949Iu) {
        this.e = c0949Iu;
    }

    public BranchMap(IN<T> in) {
        this.a = in;
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        Map<String, InterfaceC8322diG> map;
        InterfaceC8322diG interfaceC8322diG = (InterfaceC8322diG) get(str);
        return (interfaceC8322diG != null || (map = this.c) == null) ? interfaceC8322diG : map.get(str);
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        if ((interfaceC8322diG instanceof Exception) || (interfaceC8322diG instanceof IJ)) {
            if (this.c == null) {
                this.c = new HashMap();
            }
            this.c.put(str, interfaceC8322diG);
            if (containsKey(str)) {
                super.remove(str);
                return;
            }
            return;
        }
        put(str, interfaceC8322diG);
        Map<String, InterfaceC8322diG> map = this.c;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this.c.remove(str);
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        super.remove(str);
        Map<String, InterfaceC8322diG> map = this.c;
        if (map != null) {
            map.remove(str);
        }
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        InterfaceC8322diG interfaceC8322diG = (InterfaceC8322diG) get(str);
        if (interfaceC8322diG == null) {
            T d = this.a.d();
            put(str, d);
            return d;
        }
        return interfaceC8322diG;
    }
}
