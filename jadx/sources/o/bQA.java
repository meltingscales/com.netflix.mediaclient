package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.cl.model.ProfileSettings;
import com.netflix.cl.model.event.session.ValidateInputRejected;
import com.netflix.cl.model.event.session.action.ActionFailed;
import com.netflix.cl.model.event.session.action.EditProfile;
import com.netflix.cl.model.event.session.action.ValidateInput;
import com.netflix.mediaclient.service.user.UserAgent;

/* loaded from: classes4.dex */
public final class bQA {
    public static final d c = new d(null);
    private ValidateInput a;
    private Long b;
    private Long d;
    private EditProfile e;

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("IdentityCLHelper");
        }
    }

    public final void b(String str) {
        String profileGuid;
        C8632dsu.c((Object) str, "");
        EditProfile editProfile = null;
        if (this.b != null) {
            a(this, null, true, 1, null);
        }
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        InterfaceC5283bvo j = k != null ? k.j() : null;
        ProfileSettings profileSettings = new ProfileSettings(null, null, str, null, null, null, null, null);
        if (j != null && (profileGuid = j.getProfileGuid()) != null) {
            editProfile = new EditProfile(AppView.letsPlayButton, profileGuid, null, profileSettings, null, null);
            this.b = Logger.INSTANCE.startSession(editProfile);
            c.getLogTag();
        }
        this.e = editProfile;
    }

    public static /* synthetic */ void a(bQA bqa, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        bqa.a(str, z);
    }

    public final void a(String str, boolean z) {
        Long l = this.b;
        if (l != null) {
            if (z) {
                Logger.INSTANCE.cancelSession(l);
                c.getLogTag();
            } else if (str == null || str.length() == 0) {
                Logger.INSTANCE.endSession(this.b);
                c.getLogTag();
            } else {
                EditProfile editProfile = this.e;
                if (editProfile != null) {
                    Logger.INSTANCE.endSession(new ActionFailed(editProfile, str));
                    c.getLogTag();
                }
            }
        }
        this.e = null;
        this.b = null;
    }

    public final void b() {
        if (this.d != null) {
            e(this, null, true, 1, null);
        }
        ValidateInput validateInput = new ValidateInput(null, InputKind.publicHandle, null, null, null);
        this.d = Logger.INSTANCE.startSession(validateInput);
        c.getLogTag();
        this.a = validateInput;
    }

    public static /* synthetic */ void e(bQA bqa, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        bqa.b(str, z);
    }

    public final void b(String str, boolean z) {
        Long l = this.d;
        if (l != null) {
            if (z) {
                Logger.INSTANCE.cancelSession(l);
                c.getLogTag();
            } else if (str == null || str.length() == 0) {
                Logger.INSTANCE.endSession(this.d);
                c.getLogTag();
            } else {
                ValidateInput validateInput = this.a;
                if (validateInput != null) {
                    Logger.INSTANCE.endSession(new ValidateInputRejected(validateInput, str));
                    c.getLogTag();
                }
            }
        }
        this.d = null;
        this.a = null;
    }
}
