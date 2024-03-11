package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.BillboardInteractionType;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.List;
import java.util.Map;

/* renamed from: o.bsp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5125bsp {
    @Deprecated
    LoMo a(String str);

    void a();

    void a(String str, VideoType videoType);

    boolean a(int i, int i2, String str, LoMo loMo, InterfaceC5094bsK interfaceC5094bsK);

    boolean a(LoMo loMo, int i, int i2, InterfaceC5094bsK interfaceC5094bsK);

    boolean a(VideoType videoType, String str, String str2, InterfaceC5094bsK interfaceC5094bsK);

    boolean a(String str, VideoType videoType, PlayLocationType playLocationType, InterfaceC5094bsK interfaceC5094bsK);

    boolean a(String str, InterfaceC5094bsK interfaceC5094bsK);

    boolean a(InterfaceC5094bsK interfaceC5094bsK);

    void b(IO io2, InterfaceC5094bsK interfaceC5094bsK);

    boolean b(LoMo loMo, int i, int i2, boolean z, boolean z2, InterfaceC5094bsK interfaceC5094bsK);

    boolean b(String str, int i, int i2, InterfaceC5094bsK interfaceC5094bsK);

    boolean b(String str, TaskMode taskMode, int i, int i2, InterfaceC5094bsK interfaceC5094bsK);

    boolean b(String str, TaskMode taskMode, InterfaceC5094bsK interfaceC5094bsK);

    boolean b(String str, TaskMode taskMode, boolean z, InterfaceC5094bsK interfaceC5094bsK);

    boolean b(String str, String str2, InterfaceC5094bsK interfaceC5094bsK, String str3);

    boolean b(String str, InterfaceC5094bsK interfaceC5094bsK);

    void c(String str, String str2, String str3, String str4);

    void c(String str, InterfaceC5094bsK interfaceC5094bsK);

    void c(List<String> list, InterfaceC5094bsK interfaceC5094bsK);

    void c(boolean z);

    boolean c(String str, int i, int i2, InterfaceC5094bsK interfaceC5094bsK);

    boolean c(String str, int i, int i2, boolean z, boolean z2, InterfaceC5094bsK interfaceC5094bsK);

    boolean c(String str, VideoType videoType, String str2, String str3, InterfaceC5094bsK interfaceC5094bsK);

    void d(boolean z);

    boolean d();

    boolean d(int i, int i2, String str, InterfaceC5094bsK interfaceC5094bsK, String str2);

    boolean d(String str, VideoType videoType, int i, int i2, InterfaceC5094bsK interfaceC5094bsK);

    boolean d(String str, String str2, InterfaceC5094bsK interfaceC5094bsK);

    boolean d(String str, String str2, boolean z, TaskMode taskMode, InterfaceC5094bsK interfaceC5094bsK, String str3, Boolean bool);

    boolean d(String str, InterfaceC5094bsK interfaceC5094bsK);

    void e(String str, InterfaceC5094bsK interfaceC5094bsK);

    void e(InterfaceC5223buh interfaceC5223buh, BillboardInteractionType billboardInteractionType, Map<String, String> map);

    boolean e(String str, TaskMode taskMode, InterfaceC5094bsK interfaceC5094bsK);

    boolean e(String str, VideoType videoType, int i, String str2, String str3, InterfaceC5094bsK interfaceC5094bsK);

    boolean e(String str, String str2, boolean z, TaskMode taskMode, InterfaceC5094bsK interfaceC5094bsK, String str3, Boolean bool);

    boolean e(String str, String str2, boolean z, InterfaceC5094bsK interfaceC5094bsK, String str3);

    boolean e(String str, boolean z, InterfaceC5094bsK interfaceC5094bsK);
}
