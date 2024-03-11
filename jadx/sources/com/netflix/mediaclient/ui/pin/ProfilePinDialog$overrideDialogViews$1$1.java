package com.netflix.mediaclient.ui.pin;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.pin.ProfilePinDialog$overrideDialogViews$1$1;
import kotlin.jvm.internal.Lambda;
import o.C3983bRx;
import o.C7432cwB;
import o.C8632dsu;
import o.InterfaceC5283bvo;
import o.drX;

/* loaded from: classes4.dex */
public final class ProfilePinDialog$overrideDialogViews$1$1 extends Lambda implements drX<InterfaceC5283bvo, NetflixActivity, Boolean> {
    final /* synthetic */ C7432cwB e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePinDialog$overrideDialogViews$1$1(C7432cwB c7432cwB) {
        super(2);
        this.e = c7432cwB;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Boolean invoke(InterfaceC5283bvo interfaceC5283bvo, NetflixActivity netflixActivity) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        C8632dsu.c((Object) netflixActivity, "");
        this.e.d = true;
        this.e.b(false);
        C7432cwB c7432cwB = this.e;
        c7432cwB.a(true, c7432cwB.getString(R.o.jt));
        C3983bRx c3983bRx = new C3983bRx(netflixActivity);
        String str = "profiles/lock/" + interfaceC5283bvo.getProfileGuid();
        final C7432cwB c7432cwB2 = this.e;
        return Boolean.valueOf(C3983bRx.e(c3983bRx, str, false, new C3983bRx.c() { // from class: o.cwz
            @Override // o.C3983bRx.c
            public final void c(boolean z) {
                ProfilePinDialog$overrideDialogViews$1$1.e(C7432cwB.this, z);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C7432cwB c7432cwB, boolean z) {
        C8632dsu.c((Object) c7432cwB, "");
        if (z) {
            c7432cwB.e = true;
        }
        if (!c7432cwB.isAdded() || z) {
            return;
        }
        c7432cwB.a(false);
    }
}
