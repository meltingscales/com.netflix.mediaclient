package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.service.pushnotification.MessageData;
import com.netflix.mediaclient.servicemgr.BillboardInteractionType;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.List;
import java.util.Map;

/* renamed from: o.bsr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5127bsr {
    InterfaceC1240Ub<?> a();

    void a(int i, int i2);

    void a(LoMo loMo, int i, int i2, int i3, int i4);

    void a(VideoType videoType, String str, String str2, int i, int i2);

    void a(String str, int i, int i2);

    void a(String str, VideoType videoType);

    void a(String str, String str2, int i, int i2);

    void a(String str, String str2, boolean z, int i, int i2, String str3);

    void a(boolean z, String str);

    void a(boolean z, boolean z2, boolean z3, MessageData messageData);

    void b();

    void b(String str, int i, int i2);

    void b(String str, VideoType videoType, int i, int i2, int i3, int i4);

    void b(String str, VideoType videoType, PlayLocationType playLocationType, int i, int i2);

    void b(String str, String str2, boolean z, TaskMode taskMode, int i, int i2, String str3, Boolean bool);

    void b(IO io2, int i, int i2);

    void c();

    void c(String str, int i, int i2);

    void c(String str, int i, int i2, int i3, int i4);

    void c(String str, int i, int i2, boolean z, boolean z2, int i3, int i4);

    void c(String str, long j);

    void c(String str, TaskMode taskMode, boolean z, int i, int i2);

    void c(String str, VideoType videoType, int i, String str2, String str3, int i2, int i3);

    void c(String str, VideoType videoType, String str2, String str3, int i, int i2);

    void c(String str, String str2, int i, int i2, String str3);

    void c(String str, String str2, String str3, String str4);

    void c(String str, String str2, boolean z, TaskMode taskMode, int i, int i2, String str3, Boolean bool);

    void c(String str, boolean z, int i, int i2);

    void c(InterfaceC5223buh interfaceC5223buh, BillboardInteractionType billboardInteractionType, Map<String, String> map);

    @Deprecated
    String d();

    void d(int i, int i2, String str, int i3, int i4, String str2);

    void d(int i, int i2, String str, LoMo loMo, int i3, int i4);

    void d(LoMo loMo, int i, int i2, boolean z, boolean z2, int i3, int i4);

    void d(String str, int i, int i2);

    void d(String str, TaskMode taskMode, int i, int i2);

    void e(String str, int i, int i2);

    void e(String str, int i, int i2, int i3, int i4);

    void e(String str, TaskMode taskMode, int i, int i2);

    void e(String str, TaskMode taskMode, int i, int i2, int i3, int i4);

    void e(String str, VideoType videoType);

    void e(List<String> list, int i, int i2);
}
