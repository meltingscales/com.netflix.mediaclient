package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.commanderinfra.api.util.PlaybackControlKey;
import com.netflix.mediaclient.commanderinfra.api.util.PlaybackKey;
import com.netflix.mediaclient.commanderinfra.impl.logging.CommanderFlexEventType;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: o.Xl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1328Xl extends C1045Mp {
    public static final C1328Xl b = new C1328Xl();

    /* renamed from: o.Xl$a */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[PlaybackKey.values().length];
            try {
                iArr[PlaybackKey.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaybackKey.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlaybackKey.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlaybackKey.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlaybackKey.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlaybackKey.c.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PlaybackKey.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            c = iArr;
            int[] iArr2 = new int[PlaybackControlKey.values().length];
            try {
                iArr2[PlaybackControlKey.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PlaybackControlKey.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            e = iArr2;
        }
    }

    private C1328Xl() {
        super("PlaybackKeyUtil");
    }

    public final void a(PlaybackKey playbackKey) {
        CommanderFlexEventType commanderFlexEventType;
        UD c1264Uz;
        C8632dsu.c((Object) playbackKey, "");
        C1306Wp.d.getLogTag();
        switch (a.c[playbackKey.ordinal()]) {
            case 1:
                commanderFlexEventType = CommanderFlexEventType.l;
                c1264Uz = new C1264Uz();
                break;
            case 2:
                commanderFlexEventType = CommanderFlexEventType.y;
                c1264Uz = new C1256Ur();
                break;
            case 3:
                commanderFlexEventType = CommanderFlexEventType.A;
                c1264Uz = new C1259Uu();
                break;
            case 4:
                commanderFlexEventType = CommanderFlexEventType.u;
                c1264Uz = new C1263Uy();
                break;
            case 5:
                commanderFlexEventType = CommanderFlexEventType.E;
                c1264Uz = new C1260Uv();
                break;
            case 6:
                commanderFlexEventType = CommanderFlexEventType.q;
                c1264Uz = new C1261Uw();
                break;
            case 7:
                commanderFlexEventType = CommanderFlexEventType.F;
                c1264Uz = new C1262Ux();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        WL.d(WL.d, C1322Xf.e.b(), commanderFlexEventType, null, 4, null);
        C1329Xm.c.d(c1264Uz);
    }

    public final void b(PlaybackControlKey playbackControlKey) {
        C8632dsu.c((Object) playbackControlKey, "");
        C1306Wp.d.getLogTag();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = a.e[playbackControlKey.ordinal()];
        if (i == 1) {
            linkedHashMap.put(SignupConstants.Error.DEBUG_INFO_ACTION, "Play");
            C1329Xm.c.j();
        } else if (i == 2) {
            linkedHashMap.put(SignupConstants.Error.DEBUG_INFO_ACTION, "Pause");
            C1329Xm.c.i();
        }
        WL.d.e(C1322Xf.e.b(), CommanderFlexEventType.D, linkedHashMap);
    }
}
