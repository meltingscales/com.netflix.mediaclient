package o;

import com.netflix.model.leafs.social.UserNotificationSummary;

/* renamed from: o.diJ  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8325diJ extends AbstractC8316diA {
    public UserNotificationSummary b;

    public C8325diJ(InterfaceC1240Ub<? extends InterfaceC0943Io> interfaceC1240Ub) {
        super(interfaceC1240Ub);
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG b(String str) {
        str.hashCode();
        if (str.equals("summary")) {
            return this.b;
        }
        throw new IllegalStateException("Can't get node for key: " + str);
    }

    @Override // o.InterfaceC0943Io
    public InterfaceC8322diG e(String str) {
        InterfaceC8322diG b = b(str);
        if (b != null) {
            return b;
        }
        str.hashCode();
        if (str.equals("summary")) {
            C8320diE.e();
            UserNotificationSummary create = UserNotificationSummary.create();
            this.b = create;
            return create;
        }
        throw new IllegalStateException("Can't handle key: " + str);
    }

    @Override // o.InterfaceC0943Io
    public void d(String str, InterfaceC8322diG interfaceC8322diG) {
        if ("summary".equals(str)) {
            this.b = (UserNotificationSummary) interfaceC8322diG;
            return;
        }
        throw new IllegalStateException("Can't set key: " + str);
    }

    @Override // o.InterfaceC0943Io
    public void a(String str) {
        d(str, null);
    }

    public boolean a() {
        UserNotificationSummary userNotificationSummary = this.b;
        return userNotificationSummary != null && userNotificationSummary.isValid();
    }
}
