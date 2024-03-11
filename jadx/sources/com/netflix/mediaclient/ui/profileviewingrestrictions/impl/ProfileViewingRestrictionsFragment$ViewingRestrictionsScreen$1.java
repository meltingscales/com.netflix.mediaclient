package com.netflix.mediaclient.ui.profileviewingrestrictions.impl;

import androidx.compose.runtime.State;
import com.netflix.cl.model.AppView;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.cPI;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ ProfileViewingRestrictionsFragment a;
    int d;
    final /* synthetic */ State<ProfileViewingRestrictionsPage> e;

    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ProfileViewingRestrictionsPage.values().length];
            try {
                iArr[ProfileViewingRestrictionsPage.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileViewingRestrictionsPage.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileViewingRestrictionsPage.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$1(State<? extends ProfileViewingRestrictionsPage> state, ProfileViewingRestrictionsFragment profileViewingRestrictionsFragment, InterfaceC8585dra<? super ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = state;
        this.a = profileViewingRestrictionsFragment;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ProfileViewingRestrictionsFragment$ViewingRestrictionsScreen$1(this.e, this.a, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProfileViewingRestrictionsPage a;
        AppView appView;
        cPI cpi;
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            a = ProfileViewingRestrictionsFragment.a(this.e);
            int i = e.a[a.ordinal()];
            if (i == 1) {
                appView = AppView.contentRestrictionSettings;
            } else if (i == 2) {
                appView = AppView.maturitySettings;
            } else {
                appView = i != 3 ? null : AppView.blockedTitles;
            }
            if (appView != null) {
                cpi = this.a.m;
                cpi.d(appView);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
