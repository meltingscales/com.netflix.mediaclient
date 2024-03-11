package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import android.content.DialogInterface;
import androidx.compose.runtime.State;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment;
import com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$3$1;
import kotlin.jvm.internal.Lambda;
import o.C8632dsu;
import o.InterfaceC5283bvo;
import o.cOX;
import o.cPN;
import o.dpR;
import o.drO;

/* loaded from: classes4.dex */
public final class ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$3$1 extends Lambda implements drO<dpR> {
    final /* synthetic */ State<ProfileViewingRestrictionsPage> a;
    final /* synthetic */ State<Integer> b;
    final /* synthetic */ ProfileViewingRestrictionsFragment d;
    final /* synthetic */ State<Boolean> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$3$1(ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment, State<? extends ProfileViewingRestrictionsPage> state, State<Integer> state2, State<Boolean> state3) {
        super(0);
        this.d = profileViewingRestrictionsFragment;
        this.a = state;
        this.b = state2;
        this.e = state3;
    }

    @Override // o.drO
    public /* synthetic */ dpR invoke() {
        d();
        return dpR.c;
    }

    public final void d() {
        ProfileViewingRestrictionsPage a;
        cPN M;
        Integer b;
        InterfaceC5283bvo interfaceC5283bvo;
        cPN M2;
        a = ProfileViewingRestrictionsFragment.a(this.a);
        if (a == ProfileViewingRestrictionsPage.e) {
            b = ProfileViewingRestrictionsFragment.b(this.b);
            if (b != null) {
                final ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment = this.d;
                final State<Boolean> state = this.e;
                final int intValue = b.intValue();
                interfaceC5283bvo = profileViewingRestrictionsFragment.f13316o;
                Integer valueOf = interfaceC5283bvo != null ? Integer.valueOf(interfaceC5283bvo.getMaturityValue()) : null;
                if (valueOf != null && intValue == valueOf.intValue()) {
                    M2 = profileViewingRestrictionsFragment.M();
                    M2.b(ProfileViewingRestrictionsPage.c);
                    return;
                }
                cOX b2 = cOX.d.b(new DialogInterface.OnClickListener() { // from class: o.cPD
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$3$1.a(ProfileViewingRestrictionsFragment.this, intValue, state, dialogInterface, i);
                    }
                });
                NetflixActivity bj_ = profileViewingRestrictionsFragment.bj_();
                if (bj_ != null) {
                    bj_.showDialog(b2);
                    return;
                }
                return;
            }
            return;
        }
        M = this.d.M();
        M.b(ProfileViewingRestrictionsPage.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment, int i, State state, DialogInterface dialogInterface, int i2) {
        boolean j;
        C8632dsu.c((Object) profileViewingRestrictionsFragment, "");
        C8632dsu.c((Object) state, "");
        if (i2 == -1) {
            j = ProfileViewingRestrictionsFragment.j(state);
            profileViewingRestrictionsFragment.b(i, j);
            return;
        }
        dialogInterface.dismiss();
    }
}
