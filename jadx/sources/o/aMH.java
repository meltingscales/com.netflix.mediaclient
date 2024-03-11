package o;

import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* loaded from: classes.dex */
public class aMH {

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes.dex */
    interface d {
        InterfaceC1738aMk aD();
    }

    public static InterfaceC1738aMk c() {
        return ((d) EntryPointAccessors.fromApplication(AbstractApplicationC1040Mh.d(), d.class)).aD();
    }
}
