package com.netflix.mediaclient.ui.collectphone.impl.collectphone;

import android.content.Context;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.AbstractC3498bAb;
import o.AbstractC5475bzU;
import o.C3497bAa;
import o.C3502bAf;
import o.C8632dsu;
import o.C8927fu;
import o.C9935zP;
import o.InterfaceC8639dta;
import o.bJF;
import o.bJH;
import o.dpR;
import o.dsA;
import o.dsS;
import o.dsW;
import o.dtC;

/* loaded from: classes4.dex */
public final class CollectPhoneEpoxyController extends Typed2EpoxyController<C3497bAa.e, C3502bAf.c> {
    static final /* synthetic */ dtC<Object>[] $$delegatedProperties = {dsA.b(new MutablePropertyReference1Impl(CollectPhoneEpoxyController.class, "currentScreen", "getCurrentScreen()Lcom/netflix/mediaclient/ui/collectphone/impl/collectphone/CollectPhoneScreen;", 0))};
    private final Context context;
    private final InterfaceC8639dta currentScreen$delegate;
    private final C9935zP eventBusFactory;

    public final C9935zP getEventBusFactory() {
        return this.eventBusFactory;
    }

    public CollectPhoneEpoxyController(Context context, C9935zP c9935zP) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c9935zP, "");
        this.context = context;
        this.eventBusFactory = c9935zP;
        dsW dsw = dsW.a;
        this.currentScreen$delegate = new c(new AbstractC3498bAb.b(c9935zP), this);
    }

    public final AbstractC3498bAb getCurrentScreen() {
        return (AbstractC3498bAb) this.currentScreen$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final void setCurrentScreen(AbstractC3498bAb abstractC3498bAb) {
        C8632dsu.c((Object) abstractC3498bAb, "");
        this.currentScreen$delegate.setValue(this, $$delegatedProperties[0], abstractC3498bAb);
    }

    /* loaded from: classes4.dex */
    public static final class c extends dsS<AbstractC3498bAb> {
        final /* synthetic */ CollectPhoneEpoxyController d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, CollectPhoneEpoxyController collectPhoneEpoxyController) {
            super(obj);
            this.d = collectPhoneEpoxyController;
        }

        @Override // o.dsS
        public void afterChange(dtC<?> dtc, AbstractC3498bAb abstractC3498bAb, AbstractC3498bAb abstractC3498bAb2) {
            C8632dsu.c((Object) dtc, "");
            AbstractC3498bAb abstractC3498bAb3 = abstractC3498bAb2;
            AbstractC3498bAb abstractC3498bAb4 = abstractC3498bAb;
            if (C8632dsu.c(abstractC3498bAb4, abstractC3498bAb3)) {
                return;
            }
            this.d.getEventBusFactory().b(AbstractC5475bzU.class, new AbstractC5475bzU.i(abstractC3498bAb4, abstractC3498bAb3));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public void buildModels(C3497bAa.e eVar, C3502bAf.c cVar) {
        if (eVar == null || cVar == null) {
            return;
        }
        if (eVar.d() instanceof C8927fu) {
            showError(((C8927fu) eVar.d()).b());
        } else if (eVar.b() instanceof C8927fu) {
            showError(((C8927fu) eVar.b()).b());
        } else if (eVar.h() && (getCurrentScreen() instanceof AbstractC3498bAb.b)) {
            setCurrentScreen(new AbstractC3498bAb.c(this.eventBusFactory));
        } else if (!eVar.h() && (getCurrentScreen() instanceof AbstractC3498bAb.c)) {
            setCurrentScreen(new AbstractC3498bAb.b(this.eventBusFactory));
        } else if (cVar.d() instanceof C8927fu) {
            showError(((C8927fu) cVar.d()).b());
        } else if (cVar.j()) {
            this.eventBusFactory.b(AbstractC5475bzU.class, AbstractC5475bzU.e.c);
        }
        AbstractC3498bAb currentScreen = getCurrentScreen();
        if (currentScreen instanceof AbstractC3498bAb.b) {
            bJH.c((bJF) currentScreen, this, this.context, eVar);
        } else if (currentScreen instanceof AbstractC3498bAb.c) {
            bJH.c((bJF) currentScreen, this, this.context, cVar);
        } else if (currentScreen instanceof AbstractC3498bAb.e) {
            bJH.c((bJF) currentScreen, this, this.context, dpR.c);
        }
    }

    private final void showError(Throwable th) {
        if (!(th instanceof CollectPhone.Error.InvalidPhoneNumber)) {
            if (!(th instanceof CollectPhone.Error.ExpiredSmsCode)) {
                if (!(th instanceof CollectPhone.Error.InvalidSmsCode)) {
                    if (th instanceof CollectPhone.Error.ThrottlingFailure) {
                        setCurrentScreen(new AbstractC3498bAb.e(this.eventBusFactory));
                        return;
                    } else {
                        setCurrentScreen(new AbstractC3498bAb.e(this.eventBusFactory));
                        return;
                    }
                }
                this.eventBusFactory.b(AbstractC5475bzU.class, AbstractC5475bzU.j.b);
                return;
            }
            this.eventBusFactory.b(AbstractC5475bzU.class, AbstractC5475bzU.f.b);
            return;
        }
        this.eventBusFactory.b(AbstractC5475bzU.class, AbstractC5475bzU.d.e);
    }
}
