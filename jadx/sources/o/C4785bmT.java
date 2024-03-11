package o;

import androidx.media3.common.Format;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import java.lang.reflect.Method;

/* renamed from: o.bmT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4785bmT extends BaseEventJson {
    @SerializedName("bw")
    protected Integer U;
    @SerializedName("lbw")
    protected Integer V;
    @SerializedName("adlid")
    protected String W;
    @SerializedName("adlidold")
    protected String X;
    @SerializedName("vdlidold")
    protected String Y;
    protected transient int Z;
    @SerializedName("adaptationPlan")
    protected e a;
    @SerializedName("vbitrateold")
    protected Integer aa;
    @SerializedName("vbitrate")
    protected Integer ab;
    @SerializedName("vdlid")
    protected String ac;
    @SerializedName("vmafold")
    protected Integer ad;
    @SerializedName("vmaf")
    protected Integer af;
    @SerializedName("abitrate")
    protected Integer c;
    @SerializedName("abitrateold")
    protected Integer e;

    protected C4785bmT() {
    }

    public C4785bmT(int i, String str, String str2, String str3, String str4, String str5) {
        super(i == 2 ? "chgstrm" : "achgstrm", str, str2, str3, str4, str5);
        this.Z = i;
    }

    /* renamed from: o.bmT$e */
    /* loaded from: classes3.dex */
    class e {
        @SerializedName("bufferLevelDeltaScore")
        Float a;
        @SerializedName("planScore")
        Float b;
        @SerializedName("avgVMAFScore")
        Float c;
        @SerializedName("highStreamWindowEnd")
        Long d;
        @SerializedName("lowStreamWindowEnd")
        Long e;
        @SerializedName("switchPlan")
        int[] f;
        @SerializedName("segVMAFPNDDownScore")
        Float g;
        @SerializedName("segVMAFPNDUpScore")
        Float h;
        @SerializedName("rebufferProbabilityScore")
        Float j;

        e(Object obj) {
            try {
                Object obj2 = C4755bkv.q.get(-395795086);
                if (obj2 == null) {
                    obj2 = ((Class) C4755bkv.b((char) 15182, 7, 2504)).getMethod("d", null);
                    C4755bkv.q.put(-395795086, obj2);
                }
                this.a = Float.valueOf(((Float) ((Method) obj2).invoke(obj, null)).floatValue());
                try {
                    Object obj3 = C4755bkv.q.get(-395796047);
                    if (obj3 == null) {
                        obj3 = ((Class) C4755bkv.b((char) 15182, 7, 2504)).getMethod("c", null);
                        C4755bkv.q.put(-395796047, obj3);
                    }
                    this.c = Float.valueOf(((Float) ((Method) obj3).invoke(obj, null)).floatValue());
                    try {
                        Object obj4 = C4755bkv.q.get(-395788359);
                        if (obj4 == null) {
                            obj4 = ((Class) C4755bkv.b((char) 15182, 7, 2504)).getMethod("k", null);
                            C4755bkv.q.put(-395788359, obj4);
                        }
                        this.h = Float.valueOf(((Float) ((Method) obj4).invoke(obj, null)).floatValue());
                        try {
                            Object obj5 = C4755bkv.q.get(-395789320);
                            if (obj5 == null) {
                                obj5 = ((Class) C4755bkv.b((char) 15182, 7, 2504)).getMethod("j", null);
                                C4755bkv.q.put(-395789320, obj5);
                            }
                            this.g = Float.valueOf(((Float) ((Method) obj5).invoke(obj, null)).floatValue());
                            try {
                                Object obj6 = C4755bkv.q.get(-395791242);
                                if (obj6 == null) {
                                    obj6 = ((Class) C4755bkv.b((char) 15182, 7, 2504)).getMethod("h", null);
                                    C4755bkv.q.put(-395791242, obj6);
                                }
                                this.j = Float.valueOf(((Float) ((Method) obj6).invoke(obj, null)).floatValue());
                                try {
                                    Object obj7 = C4755bkv.q.get(-395790281);
                                    if (obj7 == null) {
                                        obj7 = ((Class) C4755bkv.b((char) 15182, 7, 2504)).getMethod("i", null);
                                        C4755bkv.q.put(-395790281, obj7);
                                    }
                                    this.b = Float.valueOf(((Float) ((Method) obj7).invoke(obj, null)).floatValue());
                                    try {
                                        Object obj8 = C4755bkv.q.get(-395797008);
                                        if (obj8 == null) {
                                            obj8 = ((Class) C4755bkv.b((char) 15182, 7, 2504)).getMethod("b", null);
                                            C4755bkv.q.put(-395797008, obj8);
                                        }
                                        this.d = Long.valueOf(((Long) ((Method) obj8).invoke(obj, null)).longValue());
                                        try {
                                            Object obj9 = C4755bkv.q.get(-395794125);
                                            if (obj9 == null) {
                                                obj9 = ((Class) C4755bkv.b((char) 15182, 7, 2504)).getMethod("e", null);
                                                C4755bkv.q.put(-395794125, obj9);
                                            }
                                            this.e = Long.valueOf(((Long) ((Method) obj9).invoke(obj, null)).longValue());
                                            try {
                                                Object obj10 = C4755bkv.q.get(-395792203);
                                                if (obj10 == null) {
                                                    obj10 = ((Class) C4755bkv.b((char) 15182, 7, 2504)).getMethod("g", null);
                                                    C4755bkv.q.put(-395792203, obj10);
                                                }
                                                this.f = (int[]) ((Method) obj10).invoke(obj, null);
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause == null) {
                                                    throw th;
                                                }
                                                throw cause;
                                            }
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 == null) {
                                                throw th2;
                                            }
                                            throw cause2;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 == null) {
                                            throw th3;
                                        }
                                        throw cause3;
                                    }
                                } catch (Throwable th4) {
                                    Throwable cause4 = th4.getCause();
                                    if (cause4 == null) {
                                        throw th4;
                                    }
                                    throw cause4;
                                }
                            } catch (Throwable th5) {
                                Throwable cause5 = th5.getCause();
                                if (cause5 == null) {
                                    throw th5;
                                }
                                throw cause5;
                            }
                        } catch (Throwable th6) {
                            Throwable cause6 = th6.getCause();
                            if (cause6 == null) {
                                throw th6;
                            }
                            throw cause6;
                        }
                    } catch (Throwable th7) {
                        Throwable cause7 = th7.getCause();
                        if (cause7 == null) {
                            throw th7;
                        }
                        throw cause7;
                    }
                } catch (Throwable th8) {
                    Throwable cause8 = th8.getCause();
                    if (cause8 == null) {
                        throw th8;
                    }
                    throw cause8;
                }
            } catch (Throwable th9) {
                Throwable cause9 = th9.getCause();
                if (cause9 == null) {
                    throw th9;
                }
                throw cause9;
            }
        }
    }

    public C4785bmT d$528f036b(Object obj) {
        if (obj != null) {
            this.a = new e(obj);
        }
        return this;
    }

    public C4785bmT c(Format format) {
        if (this.Z == 1) {
            this.X = format.id;
            this.e = Integer.valueOf(format.bitrate / 1000);
        } else {
            this.Y = format.id;
            this.aa = Integer.valueOf(format.bitrate / 1000);
            this.ad = Integer.valueOf(C4584bhK.d(format));
        }
        return this;
    }

    public C4785bmT d(Format format) {
        if (this.Z == 1) {
            this.W = format.id;
            this.c = Integer.valueOf(format.bitrate / 1000);
        } else {
            this.ac = format.id;
            this.ab = Integer.valueOf(format.bitrate / 1000);
            this.af = Integer.valueOf(C4584bhK.d(format));
        }
        return this;
    }

    public C4785bmT a(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }

    public C4785bmT a(int i) {
        this.U = Integer.valueOf(i);
        this.V = Integer.valueOf(i);
        return this;
    }

    public C4785bmT a(long j) {
        c(j);
        return this;
    }
}
