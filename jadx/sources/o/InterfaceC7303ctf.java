package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.ViewGroup;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.List;
import o.C7350cuZ;

/* renamed from: o.ctf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7303ctf {
    public static final a c = a.c;
    public static final int b = C7350cuZ.b.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.ctf$b */
    /* loaded from: classes.dex */
    public interface b {
        InterfaceC7303ctf i();
    }

    static InterfaceC7303ctf c(Context context) {
        return c.a(context);
    }

    Intent a(Context context, String str, String str2);

    InterfaceC4209baG a(Activity activity, ViewGroup viewGroup);

    InterfaceC4209baG a(ViewGroup viewGroup);

    InterfaceC7281ctJ a();

    void a(Activity activity);

    void a(Activity activity, ServiceManager serviceManager);

    void a(Context context, String str, InterfaceC7365cuo interfaceC7365cuo);

    boolean a(Activity activity, String str, String str2, Integer num, VideoType videoType);

    boolean a(InterfaceC5206buQ interfaceC5206buQ);

    Dialog b(Context context, DialogInterface.OnClickListener onClickListener, String str);

    C5096bsM b(String str, String str2);

    InterfaceC5206buQ b(String str);

    InterfaceC5298bwC b(Context context);

    InterfaceC5345bwx b(Object obj);

    boolean b(C7460cwd c7460cwd);

    String c(C7460cwd c7460cwd);

    boolean c();

    boolean c(Activity activity);

    boolean c(Activity activity, InterfaceC5151btO interfaceC5151btO);

    boolean c(String str);

    int d(Activity activity, long j);

    Class<? extends Activity> d();

    List<C7461cwe> d(String str);

    InterfaceC5283bvo d(Activity activity, String str);

    InterfaceC7216cry d(ViewGroup viewGroup, boolean z);

    boolean d(InterfaceC5206buQ interfaceC5206buQ);

    Intent e(Context context);

    C7460cwd e(String str);

    void e(Activity activity, int i, String[] strArr, int[] iArr);

    void e(Context context, String str, VideoType videoType, PlayContext playContext);

    void e(String str, C5096bsM c5096bsM);

    boolean e();

    boolean e(InterfaceC5206buQ interfaceC5206buQ);

    /* renamed from: o.ctf$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a c = new a();

        private a() {
        }

        public final InterfaceC7303ctf a(Context context) {
            C8632dsu.c((Object) context, "");
            return ((b) EntryPointAccessors.fromApplication(context, b.class)).i();
        }
    }

    /* renamed from: o.ctf$e */
    /* loaded from: classes.dex */
    public static final class e {
        public static /* synthetic */ boolean d(InterfaceC7303ctf interfaceC7303ctf, Activity activity, String str, String str2, Integer num, VideoType videoType, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    num = null;
                }
                return interfaceC7303ctf.a(activity, str, str2, num, videoType);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showErrorDownloadSheet");
        }
    }
}
