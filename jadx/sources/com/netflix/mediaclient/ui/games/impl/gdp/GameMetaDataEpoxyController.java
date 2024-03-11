package com.netflix.mediaclient.ui.games.impl.gdp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C1332Xp;
import o.C1596aHd;
import o.C1781aO;
import o.C3812bLo;
import o.C3814bLq;
import o.C3817bLt;
import o.C3895bOq;
import o.C3973bRn;
import o.C8569dql;
import o.C8632dsu;
import o.C8691duz;
import o.C9726vo;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC1610aHr;
import o.InterfaceC5185btw;
import o.bJX;
import o.bKU;
import o.dqE;

/* loaded from: classes4.dex */
public final class GameMetaDataEpoxyController extends TypedEpoxyController<InterfaceC5185btw> {
    private static int a = 0;
    private static int e = 1;
    private static byte e$ss2$72 = 24;
    private final Context context;

    public final Context getContext() {
        return this.context;
    }

    public GameMetaDataEpoxyController(Context context) {
        C8632dsu.c((Object) context, "");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(InterfaceC5185btw interfaceC5185btw) {
        addMaturityRating(interfaceC5185btw);
        addGenre(interfaceC5185btw);
        bKU bku = new bKU();
        bku.d((CharSequence) "bottom-padding");
        bku.a(Integer.valueOf(this.context.getResources().getDimensionPixelSize(C3895bOq.d.e)));
        add(bku);
    }

    private final void addGenre(InterfaceC5185btw interfaceC5185btw) {
        String str;
        int i = 2 % 2;
        C3812bLo c3812bLo = new C3812bLo();
        c3812bLo.e((CharSequence) "genre-header");
        String string = this.context.getString(C3895bOq.e.V);
        if (string.startsWith("'!#+")) {
            int i2 = e + 31;
            a = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                b(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                int i3 = 47 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                b(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
            int i4 = e + 65;
            a = i4 % 128;
            int i5 = i4 % 2;
        }
        c3812bLo.d((CharSequence) string);
        add(c3812bLo);
        C3817bLt c3817bLt = new C3817bLt();
        c3817bLt.b((CharSequence) "genre-text");
        if (interfaceC5185btw != null) {
            str = interfaceC5185btw.a();
            int i6 = e + 93;
            a = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str = null;
        }
        c3817bLt.c((CharSequence) str);
        add(c3817bLt);
    }

    private final void addMaturityRating(InterfaceC5185btw interfaceC5185btw) {
        Object obj;
        Map k;
        Throwable th;
        boolean g;
        boolean g2;
        int i = 2 % 2;
        C3812bLo c3812bLo = new C3812bLo();
        c3812bLo.e((CharSequence) "maturity-rating-header");
        String string = this.context.getString(C3895bOq.e.X);
        int i2 = 0;
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            b(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        c3812bLo.d((CharSequence) string);
        add(c3812bLo);
        C1781aO c1781aO = new C1781aO();
        c1781aO.b((CharSequence) "game-maturity-rating");
        c1781aO.e(C3895bOq.c.x);
        Advisory advisory = null;
        if (interfaceC5185btw != null) {
            int i3 = a + 97;
            e = i3 % 128;
            int i4 = i3 % 2;
            List<Advisory> e2 = interfaceC5185btw.e();
            if (e2 != null) {
                Iterator<T> it = e2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Advisory) obj) instanceof ContentAdvisory) {
                        break;
                    }
                }
                Advisory advisory2 = (Advisory) obj;
                if (advisory2 != null) {
                    Object c = C9726vo.c(advisory2, ContentAdvisory.class);
                    if (c != null) {
                        ContentAdvisory contentAdvisory = (ContentAdvisory) c;
                        C1332Xp c1332Xp = C1332Xp.b;
                        Drawable b = ((InterfaceC1610aHr) C1332Xp.b(InterfaceC1610aHr.class)).b(contentAdvisory, true);
                        String ratingShortDescription = contentAdvisory.getRatingShortDescription();
                        if (b != null) {
                            bJX bjx = new bJX();
                            bjx.b((CharSequence) "logo");
                            bjx.d(C3895bOq.c.l);
                            bjx.b(b);
                            if (C8632dsu.c((Object) contentAdvisory.getI18nRating(), (Object) ratingShortDescription)) {
                                bjx.d((String) null);
                            } else {
                                bjx.d(contentAdvisory.getI18nRating());
                            }
                            c1781aO.add(bjx);
                            if (ratingShortDescription != null) {
                                g2 = C8691duz.g(ratingShortDescription);
                                if (!g2) {
                                    C3814bLq c3814bLq = new C3814bLq();
                                    c3814bLq.b((CharSequence) ("rating-description-" + interfaceC5185btw.getId()));
                                    c3814bLq.d(C3895bOq.c.f13526o);
                                    c3814bLq.d((CharSequence) ratingShortDescription);
                                    c1781aO.add(c3814bLq);
                                }
                            }
                        } else {
                            bKU bku = new bKU();
                            bku.d((CharSequence) "logo");
                            bku.a((Integer) 0);
                            bku.d((Integer) 0);
                            c1781aO.add(bku);
                            C3814bLq c3814bLq2 = new C3814bLq();
                            c3814bLq2.b((CharSequence) ("certification-" + interfaceC5185btw.getId()));
                            c3814bLq2.d(C3895bOq.c.n);
                            c3814bLq2.d((CharSequence) interfaceC5185btw.b());
                            c1781aO.add(c3814bLq2);
                            if (ratingShortDescription != null) {
                                g = C8691duz.g(ratingShortDescription);
                                if (!g) {
                                    C3814bLq c3814bLq3 = new C3814bLq();
                                    c3814bLq3.b((CharSequence) ("rating-description-" + interfaceC5185btw.getId()));
                                    c3814bLq3.d(C3895bOq.c.f13526o);
                                    c3814bLq3.d((CharSequence) ratingShortDescription);
                                    c1781aO.add(c3814bLq3);
                                }
                            }
                        }
                    } else {
                        InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                        k = dqE.k(new LinkedHashMap());
                        C1596aHd c1596aHd = new C1596aHd(ContentAdvisory.class.getName() + " expected, got " + advisory2.getClass().getName(), null, null, true, k, false, false, 96, null);
                        ErrorType errorType = c1596aHd.a;
                        if (errorType != null) {
                            int i5 = e + 71;
                            a = i5 % 128;
                            int i6 = i5 % 2;
                            c1596aHd.e.put("errorType", errorType.c());
                            String b2 = c1596aHd.b();
                            if (b2 != null) {
                                c1596aHd.a(errorType.c() + " " + b2);
                            }
                        }
                        if (c1596aHd.b() != null && c1596aHd.i != null) {
                            th = new Throwable(c1596aHd.b(), c1596aHd.i);
                        } else if (c1596aHd.b() != null) {
                            th = new Throwable(c1596aHd.b());
                        } else {
                            th = c1596aHd.i;
                            if (th != null) {
                                int i7 = a + 11;
                                e = i7 % 128;
                                if (i7 % 2 == 0) {
                                    advisory.hashCode();
                                    throw null;
                                } else if (th == null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            } else {
                                th = new Throwable("Handled exception with no message");
                            }
                        }
                        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                        InterfaceC1597aHe c2 = dVar2.c();
                        if (c2 != null) {
                            int i8 = a + 55;
                            e = i8 % 128;
                            int i9 = i8 % 2;
                            c2.d(c1596aHd, th);
                        } else {
                            dVar2.e().b(c1596aHd, th);
                        }
                    }
                }
            }
        }
        add(c1781aO);
        if (interfaceC5185btw != null) {
            int i10 = a + 81;
            e = i10 % 128;
            if (i10 % 2 == 0) {
                interfaceC5185btw.e();
                throw null;
            }
            List<Advisory> e3 = interfaceC5185btw.e();
            if (e3 != null) {
                Iterator<T> it2 = e3.iterator();
                int i11 = e + 111;
                a = i11 % 128;
                int i12 = i11 % 2;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i13 = a + 67;
                    e = i13 % 128;
                    if (i13 % 2 == 0) {
                        boolean z = ((Advisory) it2.next()) instanceof ContentAdvisory;
                        advisory.hashCode();
                        throw null;
                    }
                    Object next = it2.next();
                    if (((Advisory) next) instanceof ContentAdvisory) {
                        advisory = next;
                        break;
                    }
                }
                Advisory advisory3 = advisory;
                if (advisory3 != null) {
                    Iterator<T> it3 = C3973bRn.e((ContentAdvisory) advisory3).iterator();
                    while (!(!it3.hasNext())) {
                        Object next2 = it3.next();
                        if (i2 < 0) {
                            C8569dql.h();
                        }
                        C3817bLt c3817bLt = new C3817bLt();
                        c3817bLt.b((CharSequence) ("icon-text-" + i2));
                        c3817bLt.c((CharSequence) ((String) next2));
                        add(c3817bLt);
                        i2++;
                    }
                }
            }
        }
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$72);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
