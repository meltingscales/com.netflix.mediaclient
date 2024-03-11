package com.google.android.gms.cast;

import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class CastStatusCodes extends CommonStatusCodes {
    public static String getStatusCodeString(int i) {
        if (i >= -999 && i <= 999) {
            return i != 0 ? i != 7 ? i != 14 ? i != 15 ? CommonStatusCodes.getStatusCodeString(i) : "TIMEOUT" : "INTERRUPTED" : "NETWORK_ERROR" : "SUCCESS";
        } else if (i >= 2000 && i <= 2099) {
            if (i != 2015) {
                switch (i) {
                    case 2000:
                        return "AUTHENTICATION_FAILED";
                    case 2001:
                        return "INVALID_REQUEST";
                    case 2002:
                        return "CANCELED";
                    case 2003:
                        return "NOT_ALLOWED";
                    case 2004:
                        return "APPLICATION_NOT_FOUND";
                    case 2005:
                        return "APPLICATION_NOT_RUNNING";
                    case 2006:
                        return "MESSAGE_TOO_LARGE";
                    case 2007:
                        return "MESSAGE_SEND_BUFFER_TOO_FULL";
                    default:
                        return String.format(Locale.ROOT, "%s %d", "Common cast status code", Integer.valueOf(i));
                }
            }
            return "TCP_PROBER_FAIL_TO_VERIFY_DEVICE";
        } else if (i < 2100 || i > 2109) {
            if (i < 2105 || i > 2169) {
                if (i < 2200 || i > 2219) {
                    if (i < 2250 || i > 2289) {
                        if (i < 2300 || i > 2309) {
                            if (i < 2310 || i > 2319) {
                                if (i < 2350 || i > 2359) {
                                    if (i < 2400 || i > 2419) {
                                        if (i < 2450 || i > 2469) {
                                            if (i < 2470 || i > 2479) {
                                                if (i < 2490 || i > 2499) {
                                                    return String.format(Locale.ROOT, "Unknown cast status code %d", Integer.valueOf(i));
                                                }
                                                return String.format(Locale.ROOT, "%s %d", "Cast media loading status code", Integer.valueOf(i));
                                            }
                                            return String.format(Locale.ROOT, "%s %d", "Cast application status code", Integer.valueOf(i));
                                        }
                                        return String.format(Locale.ROOT, "%s %d", "Cast nearby casting status code", Integer.valueOf(i));
                                    }
                                    return String.format(Locale.ROOT, "%s %d", "Cast relay casting status code", Integer.valueOf(i));
                                }
                                return String.format(Locale.ROOT, "%s %d", "Cast multizone device status code", Integer.valueOf(i));
                            }
                            return String.format(Locale.ROOT, "%s %d", "Endpoint switch status code", Integer.valueOf(i));
                        }
                        return String.format(Locale.ROOT, "%s %d", "Cast service status code", Integer.valueOf(i));
                    }
                    return String.format(Locale.ROOT, "%s %d", "Cast socket status code", Integer.valueOf(i));
                }
                return String.format(Locale.ROOT, "%s %d", "Cast remote display status code", Integer.valueOf(i));
            }
            return String.format(Locale.ROOT, "%s %d", "Cast session status code", Integer.valueOf(i));
        } else {
            return String.format(Locale.ROOT, "%s %d", "Media control channel status code", Integer.valueOf(i));
        }
    }
}
