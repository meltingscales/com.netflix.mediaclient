package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes4.dex */
public abstract class bIM extends AbstractC3336ax<c> {
    private InterfaceC5198buI b;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.Z;
    }

    public final void d(InterfaceC5198buI interfaceC5198buI) {
        this.b = interfaceC5198buI;
    }

    public final InterfaceC5198buI i() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    public void e(c cVar) {
        List<Advisory> e;
        Object x;
        String i18nAdvisories;
        C8632dsu.c((Object) cVar, "");
        InterfaceC5198buI interfaceC5198buI = this.b;
        if (interfaceC5198buI == null || (e = interfaceC5198buI.e()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : e) {
            if (obj instanceof ContentAdvisory) {
                arrayList.add(obj);
            }
        }
        x = C8576dqs.x(arrayList);
        ContentAdvisory contentAdvisory = (ContentAdvisory) x;
        if (contentAdvisory != null && contentAdvisory.getBoard() != null && contentAdvisory.getRatingIconValue() != null) {
            C1332Xp c1332Xp = C1332Xp.b;
            Context context = cVar.r().getContext();
            C8632dsu.a(context, "");
            View b = ((InterfaceC1610aHr) C1332Xp.b(InterfaceC1610aHr.class)).b(context, contentAdvisory, true);
            if (b != null) {
                cVar.d().setVisibility(0);
                cVar.a().setVisibility(8);
                cVar.b().setVisibility(8);
                cVar.d().removeAllViews();
                cVar.d().addView(b);
                return;
            }
            cVar.d().setVisibility(8);
            cVar.a().setVisibility(8);
            cVar.b().setVisibility(8);
            return;
        }
        cVar.d().setVisibility(8);
        cVar.a().setVisibility(0);
        cVar.a().setText(contentAdvisory != null ? contentAdvisory.getRatingIconValue() : null);
        if (contentAdvisory != null && (i18nAdvisories = contentAdvisory.getI18nAdvisories()) != null) {
            C8632dsu.d((Object) i18nAdvisories);
            if (i18nAdvisories.length() > 0) {
                cVar.b().setVisibility(0);
                cVar.b().setText(contentAdvisory.getI18nAdvisories());
                return;
            }
        }
        cVar.b().setVisibility(8);
    }

    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(c.class, "textCertification", "getTextCertification()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "advisoryContainer", "getAdvisoryContainer()Landroid/view/ViewGroup;", 0)), dsA.c(new PropertyReference1Impl(c.class, "advisoryDetails", "getAdvisoryDetails()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        public static final int b = 8;
        private final dsZ c = bIF.d(this, com.netflix.mediaclient.ui.R.g.gm, false, 2, null);
        private final dsZ d = bIF.d(this, com.netflix.mediaclient.ui.R.g.i, false, 2, null);
        private final dsZ a = bIF.d(this, com.netflix.mediaclient.ui.R.g.h, false, 2, null);

        public final C1204Sr a() {
            return (C1204Sr) this.c.getValue(this, e[0]);
        }

        public final ViewGroup d() {
            return (ViewGroup) this.d.getValue(this, e[1]);
        }

        public final C1204Sr b() {
            return (C1204Sr) this.a.getValue(this, e[2]);
        }
    }
}
