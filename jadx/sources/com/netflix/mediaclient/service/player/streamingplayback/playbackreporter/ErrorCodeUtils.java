package com.netflix.mediaclient.service.player.streamingplayback.playbackreporter;

import android.media.MediaCodec;
import android.text.TextUtils;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import com.netflix.android.volley.ServerError;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.drm.NfDrmException;
import o.C1044Mm;
import o.C4974bpx;
import o.C9587sU;
import o.InterfaceC4413bdz;
import org.chromium.net.NetworkException;

/* loaded from: classes4.dex */
public class ErrorCodeUtils {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a = 1;
    private static int b;
    private static int b$s55$172;
    private static final d[] e;

    /* loaded from: classes4.dex */
    public enum TransactionType {
        Authorization,
        License
    }

    static void a() {
        b$s55$172 = -1407015348;
    }

    private static final String c(int i) {
        int i2 = 2 % 2;
        int i3 = a;
        int i4 = i3 + 97;
        b = i4 % 128;
        int i5 = i4 % 2;
        switch (i) {
            case -1:
                return "INVALID";
            case 0:
                return "IDLE";
            case 1:
                return "WAITING_FOR_STALLED_SOCKET_POOL";
            case 2:
                return "WAITING_FOR_AVAILABLE_SOCKET";
            case 3:
                return "WAITING_FOR_DELEGATE";
            case 4:
                return "WAITING_FOR_CACHE";
            case 5:
                int i6 = i3 + 123;
                b = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 6 / 0;
                }
                return "DOWNLOADING_PROXY_SCRIPT";
            case 6:
                return "RESOLVING_PROXY_FOR_URL";
            case 7:
                return "RESOLVING_HOST_IN_PROXY_SCRIPT";
            case 8:
                return "ESTABLISHING_PROXY_TUNNEL";
            case 9:
                return "RESOLVING_HOST";
            case 10:
                return "CONNECTING";
            case 11:
                return "SSL_HANDSHAKE";
            case 12:
                return "SENDING_REQUEST";
            case 13:
                return "WAITING_FOR_RESPONSE";
            case 14:
                return "READING_RESPONSE";
            default:
                return "UNKNOWN";
        }
    }

    static {
        a();
        e = new d[]{new d(MediaCodec.CodecException.class, MediaCodecRenderer.class, "releaseCodec", "5.13.4", "DevicePlaybackError.ReleaseCodec"), new d(MediaCodec.CodecException.class, MediaCodecRenderer.class, "flushCodec", "5.13.5", "DevicePlaybackError.FlushCodec")};
        int i = a + 117;
        b = i % 128;
        int i2 = i % 2;
    }

    public static boolean b(C4974bpx c4974bpx) {
        int i = 2 % 2;
        int i2 = a + 19;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean equals = "DevicePlaybackError.Crypto.Unsupported".equals(c4974bpx.i);
        int i4 = a + 83;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return equals;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:?, code lost:
        return d(com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils.TransactionType.e, ((com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.drm.NetflixDrmException) r11.getCause()).a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0191, code lost:
        if ((r11.getCause() instanceof com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.drm.NetflixDrmException) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019a, code lost:
        if ((r11.getCause() instanceof com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.drm.NetflixDrmException) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ae, code lost:
        r1.d = o.C1044Mm.d(r11);
        r1.c = r11.toString();
        r1.a = "2.0";
        r1.i = "NccpLicenseFailed.UnknownError";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.C4974bpx b(androidx.media3.common.PlaybackException r11) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils.b(androidx.media3.common.PlaybackException):o.bpx");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
        if (r2 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
        if (r2 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
        r6.a = "3.1.-57";
        r6.i = "StreamingFailure.Network.sockettimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
        r6.a = "3.1.-171";
        r6.i = "StreamingFailure.Network.connectiontimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(o.C4974bpx r6, java.io.IOException r7) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils.b(o.bpx, java.io.IOException):void");
    }

    private static C4974bpx a(Status status, C4974bpx c4974bpx) {
        int i = 2 % 2;
        int i2 = b + 105;
        a = i2 % 128;
        int i3 = i2 % 2;
        if (status instanceof InterfaceC4413bdz) {
            InterfaceC4413bdz interfaceC4413bdz = (InterfaceC4413bdz) status;
            c4974bpx.j = interfaceC4413bdz.s();
            String t = interfaceC4413bdz.t();
            c4974bpx.d = interfaceC4413bdz.r();
            c4974bpx.f = interfaceC4413bdz.p();
            if (!TextUtils.isEmpty(interfaceC4413bdz.q())) {
                c4974bpx.b = interfaceC4413bdz.q();
                c4974bpx.a += ".50." + interfaceC4413bdz.q();
                c4974bpx.i += "." + interfaceC4413bdz.u() + "." + interfaceC4413bdz.q();
                c4974bpx.g = interfaceC4413bdz.x();
            } else {
                int m = interfaceC4413bdz.m();
                if (m != 1) {
                    if (m != 2) {
                        int i4 = a;
                        int i5 = i4 + 121;
                        b = i5 % 128;
                        int i6 = i5 % 2;
                        if (m == 3) {
                            c4974bpx.a += ".10." + t;
                            c4974bpx.i += ".ErrorMessage." + t;
                            c4974bpx.g = interfaceC4413bdz.x();
                        } else if (m != 5) {
                            int i7 = i4 + 19;
                            b = i7 % 128;
                            int i8 = i7 % 2;
                            if (m != 14) {
                                int i9 = i4 + 41;
                                b = i9 % 128;
                                if (i9 % 2 == 0 ? m == 8 : m == 114) {
                                    c4974bpx.a += ".11." + t;
                                    c4974bpx.i += ".InvalidDeviceCredentials." + t;
                                } else if (m == 9) {
                                    c4974bpx.a += ".12." + t;
                                    c4974bpx.i += ".UnsupportedSoftwareVersion." + t;
                                } else {
                                    c4974bpx.a += ".3." + t;
                                    c4974bpx.i += ".Nccp." + t;
                                }
                            } else {
                                c4974bpx.a += ".17";
                                c4974bpx.i += ".RegistrationRequired";
                            }
                        } else {
                            c4974bpx.a += ".9." + t;
                            c4974bpx.i += ".RetryExceeded." + t;
                        }
                    } else {
                        c4974bpx.a += ".9." + t;
                        c4974bpx.i += ".RetryExceeded." + t;
                    }
                } else if (t.equalsIgnoreCase("1009")) {
                    c4974bpx.a += ".5." + t;
                    c4974bpx.i += ".ProtocolVersionIncorrect." + t;
                } else {
                    c4974bpx.a += ".8";
                    c4974bpx.i += ".NoAction";
                    int i10 = a + 45;
                    b = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
        }
        return c4974bpx;
    }

    private static C4974bpx a(Status status, Status.ErrorGroup errorGroup, C4974bpx c4974bpx) {
        NetworkException networkException;
        int i = 2 % 2;
        if (errorGroup == Status.ErrorGroup.NetworkError) {
            c4974bpx.a += ".1";
            c4974bpx.i += ".Network";
            int i2 = a + 73;
            b = i2 % 128;
            int i3 = i2 % 2;
        } else {
            c4974bpx.a += ".2";
            c4974bpx.i += ".Http";
            int i4 = a + 51;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        Throwable e2 = status.e();
        if (e2 instanceof NetworkException) {
            StringBuilder sb = new StringBuilder();
            sb.append(c4974bpx.a);
            sb.append(".");
            sb.append(((NetworkException) e2).getErrorCode());
            c4974bpx.a = sb.toString();
            c4974bpx.i += "." + d(networkException);
        } else if (e2 instanceof ServerError) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c4974bpx.a);
            sb2.append(".");
            ServerError serverError = (ServerError) e2;
            sb2.append(serverError.b.e);
            c4974bpx.a = sb2.toString();
            c4974bpx.i += "." + serverError.b.e;
            c4974bpx.c = String.valueOf(serverError.b.c);
            int i6 = a + 65;
            b = i6 % 128;
            int i7 = i6 % 2;
        }
        return c4974bpx;
    }

    private static C4974bpx e(Status status, C4974bpx c4974bpx) {
        String th;
        int i = 2 % 2;
        if (status.e() != null) {
            c4974bpx.d = C1044Mm.d(status.e());
        }
        switch (AnonymousClass1.a[status.c().ordinal()]) {
            case 1:
                c4974bpx.a += ".111";
                c4974bpx.i += ".DrmError.ProvideKeyResponse";
                break;
            case 2:
                c4974bpx.a += ".112";
                c4974bpx.i += ".DrmError.GetKeyRequest";
                break;
            case 3:
                c4974bpx.a += ".113";
                c4974bpx.i += ".DrmError.CDMGenericError";
                break;
            case 4:
                c4974bpx.a += ".114";
                c4974bpx.i += ".DrmError.CDMKeySetEmpty";
                break;
            case 5:
                c4974bpx.a += ".115";
                c4974bpx.i += ".DrmError.CDMResourceBusy";
                int i2 = a + 65;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 4;
                    break;
                }
                break;
            case 6:
                c4974bpx.a += ".116";
                c4974bpx.i += ".DrmError.CDMLicenseEmpty";
                break;
            case 7:
                c4974bpx.a += ".117";
                c4974bpx.i += ".DrmError.CDMNotProvisioned";
                break;
            case 8:
                c4974bpx.a += ".118";
                c4974bpx.i += ".DrmError.CDMException";
                break;
            case 9:
                c4974bpx.a += ".119";
                c4974bpx.i += ".DrmError.RestoreFailed";
                break;
            default:
                c4974bpx.a += ".100";
                c4974bpx.i += ".DrmError";
                break;
        }
        if (status.e() == null) {
            int i4 = a + 33;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 4;
            }
            th = "";
        } else {
            th = status.e().toString();
        }
        c4974bpx.c = th;
        return c4974bpx;
    }

    private static C4974bpx b(Status status, C4974bpx c4974bpx) {
        String th;
        int i = 2 % 2;
        c4974bpx.a += ".20";
        c4974bpx.i += ".MslError";
        if (status.e() == null) {
            int i2 = a + 15;
            b = i2 % 128;
            int i3 = i2 % 2;
            th = "";
        } else {
            th = status.e().toString();
            int i4 = a + 17;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        c4974bpx.c = th;
        int i6 = b + 21;
        a = i6 % 128;
        int i7 = i6 % 2;
        return c4974bpx;
    }

    private static C4974bpx d(Status status, C4974bpx c4974bpx) {
        String th;
        int i = 2 % 2;
        int i2 = a + 109;
        b = i2 % 128;
        String str = null;
        if (i2 % 2 != 0) {
            boolean z = status.e() instanceof NfDrmException;
            throw null;
        }
        if (status.e() instanceof NfDrmException) {
            c4974bpx.a += "102";
            c4974bpx.i += ".DrmSessionException";
        } else {
            c4974bpx.a += ".0";
            c4974bpx.i += ".UnknownError";
            int i3 = a + 21;
            b = i3 % 128;
            int i4 = i3 % 2;
        }
        if (status.e() != null) {
            th = status.e().toString();
            int i5 = a + 29;
            b = i5 % 128;
            int i6 = i5 % 2;
        } else {
            th = "";
        }
        c4974bpx.c = th;
        if (status.c() == null) {
            int i7 = b + 87;
            a = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        } else {
            str = Integer.toString(status.c().getValue());
        }
        c4974bpx.e = str;
        return c4974bpx;
    }

    private static C4974bpx c(Status status, C4974bpx c4974bpx) {
        String num;
        int i = 2 % 2;
        if (status.c() == StatusCode.MANIFEST_PARSE_ERROR) {
            c4974bpx.a += ".201";
            c4974bpx.i += ".ParseError";
        } else {
            c4974bpx.a += ".200";
            c4974bpx.i += ".MissingStatus";
            if (status.c() == null) {
                int i2 = a + 123;
                b = i2 % 128;
                int i3 = i2 % 2;
                num = null;
            } else {
                num = Integer.toString(status.c().getValue());
            }
            c4974bpx.e = num;
        }
        if (status.e() != null) {
            int i4 = b + 43;
            a = i4 % 128;
            int i5 = i4 % 2;
            c4974bpx.c = status.e().toString();
            c4974bpx.d = C1044Mm.d(status.e());
        }
        return c4974bpx;
    }

    private static C4974bpx a(TransactionType transactionType, C4974bpx c4974bpx) {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 43;
        a = i3 % 128;
        if (i3 % 2 != 0 ? (i = AnonymousClass1.d[transactionType.ordinal()]) == 1 : (i = AnonymousClass1.d[transactionType.ordinal()]) == 1) {
            Object[] objArr = new Object[1];
            f(131, false, 1, 1, new char[]{0}, objArr);
            c4974bpx.a = ((String) objArr[0]).intern();
            c4974bpx.i = "NccpAuthorizationFailed";
        } else if (i != 2) {
            int i4 = b + 51;
            a = i4 % 128;
            int i5 = i4 % 2;
        } else {
            c4974bpx.a = "2";
            c4974bpx.i = "NccpLicenseFailed";
        }
        return c4974bpx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[Status.ErrorGroup.values().length];
            e = iArr;
            try {
                iArr[Status.ErrorGroup.PlayApiError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[Status.ErrorGroup.NetworkError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[Status.ErrorGroup.HttpError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[Status.ErrorGroup.DrmError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[Status.ErrorGroup.MslError.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[TransactionType.values().length];
            d = iArr2;
            try {
                iArr2[TransactionType.Authorization.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[TransactionType.License.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[StatusCode.values().length];
            a = iArr3;
            try {
                iArr3[StatusCode.DRM_FAILURE_MEDIADRM_PROVIDE_KEY_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[StatusCode.DRM_FAILURE_MEDIADRM_GET_KEY_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[StatusCode.DRM_FAILURE_CDM_GENERIC_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[StatusCode.DRM_FAILURE_CDM_KEY_SET_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[StatusCode.DRM_FAILURE_CDM_RESOURCE_BUSY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[StatusCode.DRM_FAILURE_CDM_LICENSE_EMPTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[StatusCode.DRM_FAILURE_CDM_NOT_PROVISIONED.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[StatusCode.DRM_FAILURE_CDM_EXCEPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[StatusCode.DRM_FAILURE_MEDIADRM_KEYS_RESTORE_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    private static C4974bpx d(TransactionType transactionType, Status status) {
        int i = 2 % 2;
        C4974bpx c4974bpx = new C4974bpx();
        c4974bpx.h = status;
        a(transactionType, c4974bpx);
        c4974bpx.c = status.b();
        Status.ErrorGroup d2 = status.d();
        if (d2 != null) {
            int i2 = AnonymousClass1.e[d2.ordinal()];
            if (i2 == 1) {
                a(status, c4974bpx);
            } else {
                int i3 = a;
                int i4 = i3 + 95;
                b = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 2) {
                    int i6 = i3 + 89;
                    b = i6 % 128;
                    int i7 = i6 % 2;
                    if (i2 != 3) {
                        int i8 = i3 + 15;
                        b = i8 % 128;
                        if (i8 % 2 == 0 ? i2 == 4 : i2 == 4) {
                            e(status, c4974bpx);
                        } else if (i2 != 5) {
                            int i9 = i3 + 83;
                            b = i9 % 128;
                            if (i9 % 2 != 0) {
                                c(status, c4974bpx);
                                throw null;
                            }
                            c(status, c4974bpx);
                        } else {
                            b(status, c4974bpx);
                            int i10 = b + 1;
                            a = i10 % 128;
                            int i11 = i10 % 2;
                        }
                    }
                }
                a(status, d2, c4974bpx);
            }
        } else {
            d(status, c4974bpx);
        }
        return c4974bpx;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String d(org.chromium.net.NetworkException r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils.a
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils.b = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1a
            int r1 = r3.getErrorCode()
            r2 = 68
            int r2 = r2 / 0
            switch(r1) {
                case 1: goto L65;
                case 2: goto L62;
                case 3: goto L5f;
                case 4: goto L53;
                case 5: goto L50;
                case 6: goto L4d;
                case 7: goto L4a;
                case 8: goto L47;
                case 9: goto L44;
                case 10: goto L41;
                case 11: goto L22;
                default: goto L19;
            }
        L19:
            goto L68
        L1a:
            int r1 = r3.getErrorCode()
            switch(r1) {
                case 1: goto L65;
                case 2: goto L62;
                case 3: goto L5f;
                case 4: goto L53;
                case 5: goto L50;
                case 6: goto L4d;
                case 7: goto L4a;
                case 8: goto L47;
                case 9: goto L44;
                case 10: goto L41;
                case 11: goto L22;
                default: goto L21;
            }
        L21:
            goto L68
        L22:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OTHER."
            r1.append(r2)
            int r3 = r3.getCronetInternalErrorCode()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r1 = com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils.b
            int r1 = r1 + 1
            int r2 = r1 % 128
            com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils.a = r2
            int r1 = r1 % r0
            return r3
        L41:
            java.lang.String r3 = "QUIC_PROTOCOL_FAILED"
            return r3
        L44:
            java.lang.String r3 = "ADDRESS_UNREACHABLE"
            return r3
        L47:
            java.lang.String r3 = "CONNECTION_RESET"
            return r3
        L4a:
            java.lang.String r3 = "CONNECTION_REFUSED"
            return r3
        L4d:
            java.lang.String r3 = "CONNECTION_TIMED_OUT"
            return r3
        L50:
            java.lang.String r3 = "CONNECTION_CLOSED"
            return r3
        L53:
            int r3 = com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils.b
            int r3 = r3 + 103
            int r1 = r3 % 128
            com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils.a = r1
            int r3 = r3 % r0
            java.lang.String r3 = "TIMED_OUT"
            return r3
        L5f:
            java.lang.String r3 = "NETWORK_CHANGED"
            return r3
        L62:
            java.lang.String r3 = "INTERNET_DISCONNECTED"
            return r3
        L65:
            java.lang.String r3 = "HOSTNAME_NOT_RESOLVED"
            return r3
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UNKNOWN."
            r0.append(r1)
            int r3 = r3.getCronetInternalErrorCode()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils.d(org.chromium.net.NetworkException):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d {
        private final String a;
        private final Class b;
        private final Class<? extends Exception> c;
        private final String d;
        private final String e;

        public d(Class<? extends Exception> cls, Class cls2, String str, String str2, String str3) {
            this.c = cls;
            this.b = cls2;
            this.e = str;
            this.a = str2;
            this.d = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e(Exception exc) {
            if (this.c.isInstance(exc)) {
                StackTraceElement[] stackTrace = exc.getStackTrace();
                for (int i = 0; i < stackTrace.length; i++) {
                    if (this.b.getName().equals(stackTrace[i].getClassName()) && this.e.equals(stackTrace[i].getMethodName())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }

    private static d d(Exception exc) {
        int i = 2 % 2;
        d[] dVarArr = e;
        int length = dVarArr.length;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= length) {
                return null;
            }
            int i3 = b + 9;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                dVarArr[i2].e(exc);
                throw null;
            }
            d dVar = dVarArr[i2];
            if (dVar.e(exc)) {
                int i4 = b + 51;
                a = i4 % 128;
                if (i4 % 2 != 0) {
                    return dVar;
                }
                obj.hashCode();
                throw null;
            }
            i2++;
        }
    }

    private static void f(int i, boolean z, int i2, int i3, char[] cArr, Object[] objArr) {
        int i4 = 2 % 2;
        C9587sU c9587sU = new C9587sU();
        char[] cArr2 = new char[i3];
        c9587sU.e = 0;
        int i5 = $10 + 71;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (c9587sU.e < i3) {
            int i7 = $10 + 37;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            c9587sU.b = cArr[c9587sU.e];
            cArr2[c9587sU.e] = (char) (c9587sU.b + i);
            int i9 = c9587sU.e;
            cArr2[i9] = (char) (cArr2[i9] - ((int) (b$s55$172 ^ 4056316384523757086L)));
            c9587sU.e++;
        }
        if (i2 > 0) {
            c9587sU.a = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - c9587sU.a, c9587sU.a);
            System.arraycopy(cArr3, c9587sU.a, cArr2, 0, i3 - c9587sU.a);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            c9587sU.e = 0;
            while (c9587sU.e < i3) {
                cArr4[c9587sU.e] = cArr2[(i3 - c9587sU.e) - 1];
                c9587sU.e++;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
