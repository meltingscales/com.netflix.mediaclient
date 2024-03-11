package o;

import com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cor  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7050cor implements MembersInjector<MyListFragmentTab> {
    private final Provider<InterfaceC1573aGh> a;
    private final Provider<C6923cmU> c;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(MyListFragmentTab myListFragmentTab) {
        C1092Oj.e(myListFragmentTab, this.a);
        c(myListFragmentTab, this.c.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.mylist.impl.tab.MyListFragmentTab.myListEditMenuProvider")
    public static void c(MyListFragmentTab myListFragmentTab, C6923cmU c6923cmU) {
        myListFragmentTab.myListEditMenuProvider = c6923cmU;
    }
}
