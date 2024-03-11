package o;

import android.text.TextUtils;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.model.leafs.PostPlayAction;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayItem;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import o.AbstractC5531cAw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.chromium.net.NetError;

/* renamed from: o.czw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7638czw {
    public static final C7638czw d = new C7638czw();

    private C7638czw() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.czw$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private final Map<String, Object> d;

        public final Map<String, Object> b() {
            return this.d;
        }

        public d(String str, String str2, int i, String str3, Integer num, int i2, int i3, String str4) {
            List i4;
            Map<String, Object> d;
            Pair[] pairArr = new Pair[8];
            pairArr[0] = dpD.a(Payload.PARAM_RENO_REQUEST_ID, str);
            pairArr[1] = dpD.a("listId", str2);
            pairArr[2] = dpD.a("trackId", Integer.valueOf(i));
            pairArr[3] = dpD.a("imageKey", str3);
            pairArr[4] = num == null ? null : dpD.a(SignupConstants.Field.VIDEO_ID, num);
            pairArr[5] = dpD.a("row", Integer.valueOf(i2));
            pairArr[6] = dpD.a("rank", Integer.valueOf(i3));
            pairArr[7] = dpD.a("postplayExperienceType", str4);
            i4 = C8569dql.i(pairArr);
            d = dqE.d(i4);
            this.d = d;
        }
    }

    public final TrackingInfo e(PostPlayExperience postPlayExperience) {
        int i;
        String str;
        Integer num;
        int i2;
        int i3;
        int i4;
        String str2;
        Integer num2;
        int i5;
        Map d2;
        Map k;
        Throwable th;
        Map d3;
        Map k2;
        Throwable th2;
        String str3 = null;
        if (postPlayExperience == null) {
            return null;
        }
        String requestId = postPlayExperience.getRequestId();
        String uuid = postPlayExperience.getUuid();
        int i6 = 0;
        List<PostPlayItem> items = postPlayExperience.getItems();
        int i7 = NetError.ERR_HTTPS_PROXY_TUNNEL_RESPONSE_REDIRECT;
        if (items != null && !items.isEmpty()) {
            Integer itemsInitialIndex = postPlayExperience.getItemsInitialIndex();
            if (itemsInitialIndex == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d3 = dqE.d();
                k2 = dqE.k(d3);
                C1596aHd c1596aHd = new C1596aHd("PostPlay initial Index is missing. Setting a default value.", null, null, true, k2, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
                itemsInitialIndex = 0;
            }
            int size = items.size();
            PostPlayItem postPlayItem = null;
            for (int i8 = 0; i8 < size; i8++) {
                if (itemsInitialIndex == null || i8 != itemsInitialIndex.intValue()) {
                    postPlayItem = items.get(i8);
                }
            }
            if (postPlayItem == null) {
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd2 = new C1596aHd("no post play item found in postplay experience.", null, null, true, k, false, false, 96, null);
                ErrorType errorType2 = c1596aHd2.a;
                if (errorType2 != null) {
                    c1596aHd2.e.put("errorType", errorType2.c());
                    String b2 = c1596aHd2.b();
                    if (b2 != null) {
                        c1596aHd2.a(errorType2.c() + " " + b2);
                    }
                }
                if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                    th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                } else if (c1596aHd2.b() != null) {
                    th = new Throwable(c1596aHd2.b());
                } else {
                    th = c1596aHd2.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar2.a();
                if (a2 != null) {
                    a2.e(c1596aHd2, th);
                } else {
                    dVar2.e().b(c1596aHd2, th);
                }
                return null;
            }
            if (postPlayItem.getFirstActionWithTrackId() != null) {
                PostPlayAction firstActionWithTrackId = postPlayItem.getFirstActionWithTrackId();
                C8632dsu.d(firstActionWithTrackId);
                i7 = firstActionWithTrackId.getTrackId();
            }
            if (TextUtils.equals(postPlayExperience.getType(), "nextEpisodeSeamless")) {
                str3 = "NextEpisode_Seamless";
            } else if (postPlayItem.getDisplayArtAsset() != null) {
                str3 = postPlayItem.getDisplayArtAsset().getAssetType();
            }
            i6 = postPlayItem.getVideoId();
            PostPlayAction playActionAtIndex = postPlayItem.getPlayActionAtIndex(0);
            if (playActionAtIndex != null) {
                int listPos = playActionAtIndex.getListPos();
                i4 = playActionAtIndex.getListPos();
                str2 = str3;
                num2 = i6;
                i5 = listPos;
                i2 = i5;
                i3 = i4;
                i = i7;
                num = num2;
                str = str2;
                return CLv2Utils.a(new d(requestId, uuid, i, str, num, i2, i3, postPlayExperience.getType()).b());
            }
        } else if ("liveEventEnd".equals(postPlayExperience.getType())) {
            i = 200117426;
            str = null;
            num = null;
            i2 = 0;
            i3 = 0;
            return CLv2Utils.a(new d(requestId, uuid, i, str, num, i2, i3, postPlayExperience.getType()).b());
        }
        i4 = 0;
        str2 = str3;
        num2 = i6;
        i5 = 0;
        i2 = i5;
        i3 = i4;
        i = i7;
        num = num2;
        str = str2;
        return CLv2Utils.a(new d(requestId, uuid, i, str, num, i2, i3, postPlayExperience.getType()).b());
    }

    public final TrackingInfo d(PostPlayExperience postPlayExperience) {
        String str;
        Integer num;
        int i;
        int i2;
        Map d2;
        Map k;
        Throwable th;
        Map d3;
        Map k2;
        Throwable th2;
        String str2 = null;
        if (postPlayExperience == null) {
            return null;
        }
        String requestId = postPlayExperience.getRequestId();
        String uuid = postPlayExperience.getUuid();
        List<PostPlayItem> items = postPlayExperience.getItems();
        int i3 = NetError.ERR_HTTPS_PROXY_TUNNEL_RESPONSE_REDIRECT;
        if (items != null && !items.isEmpty()) {
            Integer itemsInitialIndex = postPlayExperience.getItemsInitialIndex();
            if (itemsInitialIndex == null) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d3 = dqE.d();
                k2 = dqE.k(d3);
                C1596aHd c1596aHd = new C1596aHd("PostPlay initial Index is missing. Setting a default value.", null, null, true, k2, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
                itemsInitialIndex = 0;
            }
            PostPlayItem postPlayItem = items.get(itemsInitialIndex.intValue());
            if (postPlayItem != null) {
                PostPlayAction firstActionWithTrackId = postPlayItem.getFirstActionWithTrackId();
                if (firstActionWithTrackId != null) {
                    i3 = firstActionWithTrackId.getTrackId();
                }
                if (TextUtils.equals(postPlayExperience.getType(), "nextEpisodeSeamless")) {
                    str2 = "NextEpisode_Seamless";
                } else if (postPlayItem.getLogoAsset() != null) {
                    str2 = postPlayItem.getLogoAsset().getAssetType();
                }
                i2 = postPlayItem.getVideoId();
                num = i2;
                i = i3;
                str = str2;
                return CLv2Utils.a(new d(requestId, uuid, i, str, num, 0, 0, postPlayExperience.getType()).b());
            }
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd2 = new C1596aHd("no post play item found in postplay experience.", null, null, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    c1596aHd2.a(errorType2.c() + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                th = c1596aHd2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar2.a();
            if (a2 != null) {
                a2.e(c1596aHd2, th);
            } else {
                dVar2.e().b(c1596aHd2, th);
            }
        } else if (C8632dsu.c((Object) "liveEventEnd", (Object) postPlayExperience.getType())) {
            str = null;
            num = null;
            i = 200117426;
            return CLv2Utils.a(new d(requestId, uuid, i, str, num, 0, 0, postPlayExperience.getType()).b());
        }
        i2 = 0;
        num = i2;
        i = i3;
        str = str2;
        return CLv2Utils.a(new d(requestId, uuid, i, str, num, 0, 0, postPlayExperience.getType()).b());
    }

    public final TrackingInfo a(AbstractC5531cAw abstractC5531cAw) {
        C8632dsu.c((Object) abstractC5531cAw, "");
        if (abstractC5531cAw instanceof C5529cAu) {
            return a((C5529cAu) abstractC5531cAw);
        }
        if (abstractC5531cAw instanceof AbstractC5531cAw.b) {
            return b((AbstractC5531cAw.b) abstractC5531cAw);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final TrackingInfo a(C5529cAu c5529cAu) {
        TrackingInfo a = CLv2Utils.a(new d(c5529cAu.m(), c5529cAu.k(), c5529cAu.h(), "NextEpisode_Seamless", Integer.valueOf(c5529cAu.n()), 0, 0, "nextEpisodeSeamless").b());
        C8632dsu.a(a, "");
        return a;
    }

    private final TrackingInfo b(AbstractC5531cAw.b bVar) {
        TrackingInfo a = CLv2Utils.a(new d(bVar.c(), bVar.e(), 200117426, null, null, 0, 0, "liveEventEnd").b());
        C8632dsu.a(a, "");
        return a;
    }
}
