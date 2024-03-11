package o;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.netflix.hawkins.consumer.tokens.Token;
import com.netflix.mediaclient.service.configuration.EdgeStack;
import o.AbstractC3813bLp;
import o.ActivityC6188cXc;
import o.C5855cKw;

/* renamed from: o.cLz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5885cLz {
    public static final void d(InterfaceC2023aX interfaceC2023aX, final InterfaceC5181bts interfaceC5181bts, final Activity activity) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5181bts, "");
        C8632dsu.c((Object) activity, "");
        final GradientDrawable b = b(interfaceC5181bts.b(), interfaceC5181bts.d());
        C3814bLq c3814bLq = new C3814bLq();
        String id = interfaceC5181bts.getId();
        c3814bLq.b((CharSequence) ("discover-more-text-" + id));
        c3814bLq.d((CharSequence) activity.getResources().getString(C5855cKw.i.b));
        c3814bLq.d(C5855cKw.c.b);
        c3814bLq.d(new InterfaceC4467bf() { // from class: o.cLA
            @Override // o.InterfaceC4467bf
            public final void c(AbstractC3073as abstractC3073as, Object obj, int i) {
                C5885cLz.d(b, (C3814bLq) abstractC3073as, (AbstractC3813bLp.c) obj, i);
            }
        });
        c3814bLq.a(new View.OnClickListener() { // from class: o.cLy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5885cLz.c(InterfaceC5181bts.this, activity, view);
            }
        });
        interfaceC2023aX.add(c3814bLq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(GradientDrawable gradientDrawable, C3814bLq c3814bLq, AbstractC3813bLp.c cVar, int i) {
        C8632dsu.c((Object) gradientDrawable, "");
        C9702vQ.d(cVar.b(), 0, true, false, 5, null);
        cVar.b().setBackground(gradientDrawable);
        LD.e(cVar.b(), Token.Typography.C0681aa.e, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC5181bts interfaceC5181bts, Activity activity, View view) {
        C8632dsu.c((Object) interfaceC5181bts, "");
        C8632dsu.c((Object) activity, "");
        d(interfaceC5181bts, activity);
    }

    public static final void d(InterfaceC5181bts interfaceC5181bts, Activity activity) {
        C8632dsu.c((Object) interfaceC5181bts, "");
        C8632dsu.c((Object) activity, "");
        String a = a(interfaceC5181bts.a());
        ActivityC6188cXc.d dVar = ActivityC6188cXc.d;
        dVar.e(a);
        activity.startActivity(dVar.a(activity, a, null, null, true));
    }

    private static final String a(String str) {
        String b = C1814aPf.b(EdgeStack.PROD);
        return b + "/tudum" + str + "?netflixsource=android&inapp=true";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x000c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.graphics.drawable.GradientDrawable b(java.lang.String r1, java.lang.String r2) {
        /*
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == 0) goto L9
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.IllegalArgumentException -> L9
            goto La
        L9:
            r1 = r0
        La:
            if (r2 == 0) goto L10
            int r0 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.IllegalArgumentException -> L10
        L10:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int[] r1 = new int[]{r1, r0}
            r2.setColors(r1)
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r2.setOrientation(r1)
            r1 = 0
            r2.setGradientType(r1)
            r2.setShape(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5885cLz.b(java.lang.String, java.lang.String):android.graphics.drawable.GradientDrawable");
    }
}
