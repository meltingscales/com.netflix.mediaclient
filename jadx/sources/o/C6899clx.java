package o;

import androidx.lifecycle.ViewModel;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* renamed from: o.clx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6899clx extends ViewModel {
    private String a;
    private String b;
    private boolean c;
    private String d;
    private String g;
    private String i;
    private boolean e = true;
    private final List<C6861clL> h = new ArrayList();

    private final void j() {
        this.e = false;
    }

    public final List<C6861clL> a() {
        return this.h;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.a;
    }

    public final boolean f() {
        return this.c;
    }

    public final boolean g() {
        return this.e;
    }

    public final String h() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r3.size() == 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        r1 = o.C8576dqs.G(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        r1 = o.C8576dqs.c((java.lang.Iterable) r1, (java.util.Comparator) new o.C6899clx.a());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert r20) {
        /*
            r19 = this;
            r0 = r19
            if (r20 == 0) goto Lc1
            java.util.List<o.clL> r1 = r0.h
            r1.clear()
            com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOffer r1 = r20.multiMonthOffer()
            r2 = 0
            if (r1 == 0) goto L15
            com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData r1 = r1.viewData()
            goto L16
        L15:
            r1 = r2
        L16:
            if (r1 == 0) goto Lbc
            java.lang.String r3 = r1.vlvURL()
            r0.g = r3
            java.lang.String r3 = r1.labelVariantId()
            r0.i = r3
            java.lang.String r3 = r1.dismissCtaId()
            r0.a = r3
            java.lang.String r3 = r1.buyCtaId()
            r0.d = r3
            java.lang.String r3 = r1.buyCtaAction()
            r0.b = r3
            java.util.List r3 = r1.offerChoices()
            if (r3 == 0) goto L44
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L44
            goto L45
        L44:
            r4 = 0
        L45:
            r0.c = r4
            java.util.List r1 = r1.offerChoices()
            if (r1 == 0) goto Lbc
            java.util.List r1 = o.C8570dqm.e(r1)
            if (r1 == 0) goto Lbc
            o.clx$a r3 = new o.clx$a
            r3.<init>()
            java.util.List r1 = o.C8570dqm.b(r1, r3)
            if (r1 == 0) goto Lbc
            java.util.Iterator r1 = r1.iterator()
        L62:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lba
            java.lang.Object r2 = r1.next()
            com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice r2 = (com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice) r2
            java.util.List<o.clL> r3 = r0.h
            int r4 = r2.planId()
            long r5 = r2.offerId()
            int r7 = r2.discountDuration()
            java.lang.String r8 = r2.discountDurationType()
            java.lang.String r13 = java.lang.String.valueOf(r8)
            int r8 = r2.discountPercentage()
            java.lang.String r9 = r2.fullPriceFormatted()
            java.lang.String r15 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r2.offerPriceFormatted()
            java.lang.String r16 = java.lang.String.valueOf(r9)
            boolean r17 = r2.isBestOffer()
            boolean r18 = r2.isSelected()
            o.clL r2 = new o.clL
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r12 = java.lang.String.valueOf(r7)
            java.lang.String r14 = java.lang.String.valueOf(r8)
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.add(r2)
            goto L62
        Lba:
            o.dpR r2 = o.dpR.c
        Lbc:
            if (r2 != 0) goto Lc1
            r19.j()
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6899clx.b(com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert):void");
    }

    /* renamed from: o.clx$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((UmaMultiMonthOfferChoice) t2).discountPercentage()), Integer.valueOf(((UmaMultiMonthOfferChoice) t).discountPercentage()));
            return compareValues;
        }
    }
}
