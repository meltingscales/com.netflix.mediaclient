package com.netflix.model.leafs;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.ArrayList;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC0951Iw;
import o.InterfaceC0952Ix;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5147btK;
import o.InterfaceC5153btQ;
import o.dqE;

/* loaded from: classes5.dex */
public final class ListOfListOfProfileIconsImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC0951Iw, InterfaceC5147btK {
    private final ArrayList<InterfaceC5153btQ> listOfListOfProfileIcons = new ArrayList<>();

    @Override // o.InterfaceC5147btK
    public ArrayList<InterfaceC5153btQ> getListOfListOfProfileIcons() {
        return this.listOfListOfProfileIcons;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        Map d;
        Map k;
        Throwable th;
        Map d2;
        Map k2;
        Throwable th2;
        C8632dsu.c((Object) jsonElement, "");
        getListOfListOfProfileIcons().clear();
        ListOfProfileIconsImpl.Companion.getLogTag();
        if (!(jsonElement instanceof JsonArray)) {
            if (jsonElement instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) jsonElement;
                if (jsonObject.has("_sentinel") && jsonObject.has("value")) {
                    JsonElement jsonElement2 = jsonObject.get("value");
                    C8632dsu.d(jsonElement2);
                    populate(jsonElement2);
                    return;
                }
                InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
                aVar.a("jsonElem: " + jsonElement);
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                ErrorType errorType = ErrorType.m;
                d2 = dqE.d();
                k2 = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("ListOfListOfProfileIconsImpl: passed argument is not a sentinel.", null, errorType, true, k2, false, false, 96, null);
                ErrorType errorType2 = c1596aHd.a;
                if (errorType2 != null) {
                    c1596aHd.e.put("errorType", errorType2.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType2.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    Throwable th3 = c1596aHd.i;
                    if (th3 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        th2 = th3;
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                    return;
                } else {
                    dVar.e().b(c1596aHd, th2);
                    return;
                }
            }
            InterfaceC1593aHa.a aVar2 = InterfaceC1593aHa.c;
            aVar2.a("jsonElem: " + jsonElement);
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            ErrorType errorType3 = ErrorType.m;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd2 = new C1596aHd("ListOfListOfProfileIconsImpl: passed argument is not an array nor sentinel.", null, errorType3, true, k, false, false, 96, null);
            ErrorType errorType4 = c1596aHd2.a;
            if (errorType4 != null) {
                c1596aHd2.e.put("errorType", errorType4.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    String c2 = errorType4.c();
                    c1596aHd2.a(c2 + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                Throwable th4 = c1596aHd2.i;
                if (th4 == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else {
                    th = th4;
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(c1596aHd2, th);
                return;
            } else {
                dVar2.e().b(c1596aHd2, th);
                return;
            }
        }
        for (JsonElement jsonElement3 : (Iterable) jsonElement) {
            ListOfProfileIconsImpl listOfProfileIconsImpl = new ListOfProfileIconsImpl();
            C8632dsu.d(jsonElement3);
            listOfProfileIconsImpl.populate(jsonElement3);
            getListOfListOfProfileIcons().add(listOfProfileIconsImpl);
        }
    }
}
