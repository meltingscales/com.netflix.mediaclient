package o;

import android.content.Context;
import com.netflix.mediaclient.service.pservice.PDiskData;
import com.netflix.partner.card.CardTemplate;

/* loaded from: classes7.dex */
public class dlT {
    public static int d(CardTemplate cardTemplate) {
        return CardTemplate.f == cardTemplate ? 7 : 1;
    }

    public static int e(CardTemplate cardTemplate) {
        return CardTemplate.f == cardTemplate ? 3 : 1;
    }

    public static int a(CardTemplate cardTemplate) {
        return e(cardTemplate);
    }

    public static CardTemplate c(Context context, PDiskData.ListType listType) {
        if (e(context)) {
            return d(context);
        }
        int i = AnonymousClass1.c[listType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return CardTemplate.f;
        }
        return CardTemplate.a;
    }

    /* renamed from: o.dlT$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[PDiskData.ListType.values().length];
            c = iArr;
            try {
                iArr[PDiskData.ListType.STANDARD_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[PDiskData.ListType.STANDARD_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[PDiskData.ListType.CW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[PDiskData.ListType.NON_MEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[PDiskData.ListType.BILLBOARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static CardTemplate b(Context context, CardTemplate cardTemplate) {
        if (e(context)) {
            return d(context);
        }
        return CardTemplate.f.equals(cardTemplate) ? CardTemplate.a : cardTemplate;
    }

    private static boolean e(Context context) {
        return C8168dfL.h(C8157dfA.e(context, "partner_force_template", (String) null));
    }

    private static CardTemplate d(Context context) {
        String e = C8157dfA.e(context, "partner_force_template", (String) null);
        if (Boolean.valueOf(C8157dfA.b(context, "partner_to_Play", false)).booleanValue()) {
            return CardTemplate.a;
        }
        CardTemplate b = CardTemplate.e.b(e);
        CardTemplate cardTemplate = CardTemplate.g;
        if (cardTemplate == b) {
            C8157dfA.a(context, "partner_force_template", (String) null);
        }
        return cardTemplate == b ? CardTemplate.a : b;
    }
}
