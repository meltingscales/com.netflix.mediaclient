package com.netflix.model.leafs;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.ArrayList;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C1596aHd;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC0951Iw;
import o.InterfaceC0952Ix;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dqE;

/* loaded from: classes5.dex */
public final class LanguageListImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC0951Iw {
    public static final Companion Companion = new Companion(null);
    private final ArrayList<Object> languages = new ArrayList<>();

    public ArrayList<Object> getLanguages() {
        return this.languages;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("LanguageListImpl");
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) jsonElement, "");
        getLanguages().clear();
        Companion.getLogTag();
        if (!(jsonElement instanceof JsonArray)) {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            aVar.a("jsonElem: " + jsonElement);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.m;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("LanguageListImpl: passed argument is not an array", null, errorType, true, k, false, false, 96, null);
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
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        for (JsonElement jsonElement2 : (Iterable) jsonElement) {
            LanguageListItemImpl languageListItemImpl = new LanguageListItemImpl();
            C8632dsu.d(jsonElement2);
            languageListItemImpl.populate(jsonElement2);
            getLanguages().add(languageListItemImpl);
        }
    }
}
