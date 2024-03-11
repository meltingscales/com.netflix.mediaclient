package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.netflix.android.org.json.zip.JSONzip;
import org.chromium.net.ConnectionSubtype;

/* loaded from: classes5.dex */
public abstract class zzl extends zzc implements zzm {
    public zzl() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzm asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzm) {
            return (zzm) queryLocalInterface;
        }
        return new zzo(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzc
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzn zzpVar;
        zzn zznVar;
        zzn zznVar2 = null;
        zzn zznVar3 = null;
        zzn zznVar4 = null;
        zzs zzsVar = null;
        zzs zzsVar2 = null;
        zzs zzsVar3 = null;
        zzn zznVar5 = null;
        zzn zznVar6 = null;
        zzn zznVar7 = null;
        zzn zznVar8 = null;
        zzn zznVar9 = null;
        zzn zznVar10 = null;
        zzt zztVar = null;
        zzn zznVar11 = null;
        zzn zznVar12 = null;
        zzn zznVar13 = null;
        zzn zznVar14 = null;
        switch (i) {
            case 1:
                initialize(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzv) zzb.zza(parcel, zzv.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) zzb.zza(parcel, Bundle.CREATOR), zzb.zza(parcel), zzb.zza(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzb.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zznVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzn) {
                        zzpVar = (zzn) queryLocalInterface;
                    } else {
                        zzpVar = new zzp(readStrongBinder);
                    }
                    zznVar = zzpVar;
                }
                logEventAndBundle(readString, readString2, bundle, zznVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzb.zza(parcel), parcel.readLong());
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean zza = zzb.zza(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof zzn) {
                        zznVar2 = (zzn) queryLocalInterface2;
                    } else {
                        zznVar2 = new zzp(readStrongBinder2);
                    }
                }
                getUserProperties(readString3, readString4, zza, zznVar2);
                break;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof zzn) {
                        zznVar14 = (zzn) queryLocalInterface3;
                    } else {
                        zznVar14 = new zzp(readStrongBinder3);
                    }
                }
                getMaxUserProperties(readString5, zznVar14);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) zzb.zza(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzb.zza(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof zzn) {
                        zznVar13 = (zzn) queryLocalInterface4;
                    } else {
                        zznVar13 = new zzp(readStrongBinder4);
                    }
                }
                getConditionalUserProperties(readString6, readString7, zznVar13);
                break;
            case 11:
                setMeasurementEnabled(zzb.zza(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof zzn) {
                        zznVar12 = (zzn) queryLocalInterface5;
                    } else {
                        zznVar12 = new zzp(readStrongBinder5);
                    }
                }
                getCurrentScreenName(zznVar12);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof zzn) {
                        zznVar11 = (zzn) queryLocalInterface6;
                    } else {
                        zznVar11 = new zzp(readStrongBinder6);
                    }
                }
                getCurrentScreenClass(zznVar11);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof zzt) {
                        zztVar = (zzt) queryLocalInterface7;
                    } else {
                        zztVar = new zzw(readStrongBinder7);
                    }
                }
                setInstanceIdProvider(zztVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof zzn) {
                        zznVar10 = (zzn) queryLocalInterface8;
                    } else {
                        zznVar10 = new zzp(readStrongBinder8);
                    }
                }
                getCachedAppInstanceId(zznVar10);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof zzn) {
                        zznVar9 = (zzn) queryLocalInterface9;
                    } else {
                        zznVar9 = new zzp(readStrongBinder9);
                    }
                }
                getAppInstanceId(zznVar9);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof zzn) {
                        zznVar8 = (zzn) queryLocalInterface10;
                    } else {
                        zznVar8 = new zzp(readStrongBinder10);
                    }
                }
                getGmpAppId(zznVar8);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof zzn) {
                        zznVar7 = (zzn) queryLocalInterface11;
                    } else {
                        zznVar7 = new zzp(readStrongBinder11);
                    }
                }
                generateEventId(zznVar7);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET /* 27 */:
                onActivityCreated(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (Bundle) zzb.zza(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case ConnectionSubtype.SUBTYPE_WIFI_B /* 28 */:
                onActivityDestroyed(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case ConnectionSubtype.SUBTYPE_WIFI_G /* 29 */:
                onActivityPaused(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case ConnectionSubtype.SUBTYPE_WIFI_N /* 30 */:
                onActivityResumed(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case ConnectionSubtype.SUBTYPE_WIFI_AC /* 31 */:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof zzn) {
                        zznVar6 = (zzn) queryLocalInterface12;
                    } else {
                        zznVar6 = new zzp(readStrongBinder12);
                    }
                }
                onActivitySaveInstanceState(asInterface, zznVar6, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) zzb.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof zzn) {
                        zznVar5 = (zzn) queryLocalInterface13;
                    } else {
                        zznVar5 = new zzp(readStrongBinder13);
                    }
                }
                performAction(bundle2, zznVar5, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof zzs) {
                        zzsVar3 = (zzs) queryLocalInterface14;
                    } else {
                        zzsVar3 = new zzu(readStrongBinder14);
                    }
                }
                setEventInterceptor(zzsVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof zzs) {
                        zzsVar2 = (zzs) queryLocalInterface15;
                    } else {
                        zzsVar2 = new zzu(readStrongBinder15);
                    }
                }
                registerOnMeasurementEventListener(zzsVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof zzs) {
                        zzsVar = (zzs) queryLocalInterface16;
                    } else {
                        zzsVar = new zzu(readStrongBinder16);
                    }
                }
                unregisterOnMeasurementEventListener(zzsVar);
                break;
            case 37:
                initForTests(zzb.zzb(parcel));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof zzn) {
                        zznVar4 = (zzn) queryLocalInterface17;
                    } else {
                        zznVar4 = new zzp(readStrongBinder17);
                    }
                }
                getTestFlag(zznVar4, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(zzb.zza(parcel));
                break;
            case JSONzip.substringLimit /* 40 */:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof zzn) {
                        zznVar3 = (zzn) queryLocalInterface18;
                    } else {
                        zznVar3 = new zzp(readStrongBinder18);
                    }
                }
                isDataCollectionEnabled(zznVar3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
