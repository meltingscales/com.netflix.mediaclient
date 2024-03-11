package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC0951Iw;
import o.InterfaceC0952Ix;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dqE;

/* loaded from: classes5.dex */
public final class FalkorStringPrimitive extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC0951Iw {
    private String falkorStringPrimitive;

    public final String getFalkorStringPrimitive() {
        return this.falkorStringPrimitive;
    }

    public final void setFalkorStringPrimitive(String str) {
        C8632dsu.c((Object) str, "");
        this.falkorStringPrimitive = str;
    }

    public FalkorStringPrimitive(String str) {
        C8632dsu.c((Object) str, "");
        this.falkorStringPrimitive = str;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        Map d;
        Map k;
        Throwable th;
        String str = "";
        C8632dsu.c((Object) jsonElement, "");
        if (!jsonElement.isJsonPrimitive()) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.m;
            String str2 = "Failed to parse element for FalkorStringPrimitive: " + jsonElement;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str2, null, errorType, false, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType2.c() + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        } else {
            str = jsonElement.getAsString();
            C8632dsu.d((Object) str);
        }
        this.falkorStringPrimitive = str;
    }

    public String toString() {
        String str = this.falkorStringPrimitive;
        return "[FalkorStringPrimitive= " + str + "]";
    }
}
