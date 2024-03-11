package com.netflix.partner.card;

import o.C8600drp;
import o.C8627dsp;
import o.C8691duz;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CardTemplate {
    public static final d e;
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final /* synthetic */ CardTemplate[] i;
    private final String j;
    public static final CardTemplate a = new CardTemplate("HERO_SINGLE", 0, "HeroSingle");
    public static final CardTemplate f = new CardTemplate("ONE_PLUS_TWO", 1, "OnePlusTwo");
    public static final CardTemplate c = new CardTemplate("FULLBLEED_32", 2, "FullBleed_32");
    public static final CardTemplate b = new CardTemplate("FULLBLEED_33", 3, "FullBleed_33");
    public static final CardTemplate d = new CardTemplate("FULLBLEED_34", 4, "FullBleed_34");
    public static final CardTemplate g = new CardTemplate("UNKNOWN", 5, "");

    private static final /* synthetic */ CardTemplate[] d() {
        return new CardTemplate[]{a, f, c, b, d, g};
    }

    public static CardTemplate valueOf(String str) {
        return (CardTemplate) Enum.valueOf(CardTemplate.class, str);
    }

    public static CardTemplate[] values() {
        return (CardTemplate[]) i.clone();
    }

    public final String e() {
        return this.j;
    }

    private CardTemplate(String str, int i2, String str2) {
        this.j = str2;
    }

    static {
        CardTemplate[] d2 = d();
        i = d2;
        h = C8600drp.e(d2);
        e = new d(null);
    }

    /* loaded from: classes7.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final CardTemplate b(String str) {
            CardTemplate[] values;
            boolean a;
            for (CardTemplate cardTemplate : CardTemplate.values()) {
                a = C8691duz.a(cardTemplate.e(), str, true);
                if (a) {
                    return cardTemplate;
                }
            }
            return CardTemplate.g;
        }
    }
}
