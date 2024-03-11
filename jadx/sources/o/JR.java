package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.List;

/* loaded from: classes3.dex */
public final class JR extends AbstractC0985Ke<InterfaceC8366diy> {
    private final String a;
    private final String d;
    private final VideoType e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JR(String str, VideoType videoType, String str2, TaskMode taskMode, boolean z) {
        super("FetchVideoDetailsGenericTask", taskMode, z);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) taskMode, "");
        this.a = str;
        this.e = videoType;
        this.d = str2;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        List e;
        C8632dsu.c((Object) list, "");
        boolean b = C8171dfO.b();
        e = C8566dqi.e(this.a);
        C0956Jb.a(list, e, b);
        String str = this.d;
        if (str != null && str.length() != 0) {
            InterfaceC1242Ud e2 = C0956Jb.e(SignupConstants.Field.VIDEOS, this.a, this.d);
            C8632dsu.a(e2, "");
            list.add(e2);
        }
        if (C8153dex.L()) {
            InterfaceC1242Ud b2 = IE.b(SignupConstants.Field.VIDEOS, this.a, "recommendedTrailer");
            C8632dsu.a(b2, "");
            list.add(b2);
            InterfaceC1242Ud b3 = IE.b(SignupConstants.Field.VIDEOS, this.a, "brandAndGenreBadge");
            C8632dsu.a(b3, "");
            list.add(b3);
        }
        if (this.e == VideoType.SHOW) {
            InterfaceC1242Ud b4 = IE.b(SignupConstants.Field.VIDEOS, this.a, "episodes", "current", C0956Jb.a());
            C8632dsu.a(b4, "");
            list.add(b4);
            InterfaceC1242Ud b5 = IE.b(SignupConstants.Field.VIDEOS, this.a, "seasons", "current", "detail");
            C8632dsu.a(b5, "");
            list.add(b5);
            InterfaceC1242Ud b6 = IE.b(SignupConstants.Field.VIDEOS, this.a, "episodes", "current", "watchNext", C0956Jb.h());
            C8632dsu.a(b6, "");
            list.add(b6);
        }
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: c */
    public InterfaceC8366diy e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b = interfaceC1240Ub.b(IE.b(SignupConstants.Field.VIDEOS, this.a));
        if (b instanceof InterfaceC8366diy) {
            return (InterfaceC8366diy) b;
        }
        return null;
    }
}
