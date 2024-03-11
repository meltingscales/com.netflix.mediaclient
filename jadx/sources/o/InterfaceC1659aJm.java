package o;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.aJm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1659aJm {
    public static final c b = c.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.aJm$e */
    /* loaded from: classes.dex */
    public interface e {
        InterfaceC1659aJm ar();
    }

    boolean a();

    void c(RecyclerView recyclerView, AppView appView, String str);

    InterfaceC1666aJt e(boolean z);

    boolean e();

    /* renamed from: o.aJm$c */
    /* loaded from: classes.dex */
    public static final class c {
        static final /* synthetic */ c c = new c();

        private c() {
        }

        public final InterfaceC1659aJm e() {
            C1332Xp c1332Xp = C1332Xp.b;
            return ((e) EntryPointAccessors.fromApplication((Context) C1332Xp.b(Context.class), e.class)).ar();
        }
    }
}
