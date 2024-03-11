package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.netflix.ale.AleCryptoBouncyCastle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@VisibleForTesting
/* loaded from: classes5.dex */
public final class zzap {
    public static zzel<Boolean> zza;
    public static zzel<Long> zzaa;
    public static zzel<Long> zzab;
    public static zzel<Integer> zzac;
    public static zzel<Long> zzad;
    public static zzel<Integer> zzae;
    public static zzel<Integer> zzaf;
    public static zzel<Long> zzag;
    public static zzel<Boolean> zzah;
    public static zzel<String> zzai;
    public static zzel<Long> zzaj;
    public static zzel<Integer> zzak;
    public static zzel<Double> zzal;
    public static zzel<Integer> zzam;
    public static zzel<Boolean> zzan;
    public static zzel<Boolean> zzao;
    public static zzel<Boolean> zzap;
    public static zzel<Boolean> zzaq;
    public static zzel<Boolean> zzar;
    public static zzel<Boolean> zzas;
    public static zzel<Boolean> zzat;
    public static zzel<Boolean> zzau;
    public static zzel<Boolean> zzav;
    public static zzel<Boolean> zzaw;
    public static zzel<Boolean> zzax;
    public static zzel<Boolean> zzay;
    public static zzel<Boolean> zzaz;
    public static zzel<Long> zzb;
    public static zzel<Boolean> zzba;
    public static zzel<Boolean> zzbb;
    public static zzel<Boolean> zzbc;
    public static zzel<Boolean> zzbd;
    public static zzel<Boolean> zzbe;
    public static zzel<Boolean> zzbf;
    public static zzel<Boolean> zzbg;
    public static zzel<Boolean> zzbh;
    public static zzel<Boolean> zzbi;
    public static zzel<Boolean> zzbj;
    public static zzel<Boolean> zzbk;
    public static zzel<Boolean> zzbl;
    public static zzel<Boolean> zzbm;
    public static zzel<Boolean> zzbn;
    public static zzel<Boolean> zzbo;
    public static zzel<Boolean> zzbp;
    public static zzel<Boolean> zzbq;
    public static zzel<Boolean> zzbr;
    public static zzel<Boolean> zzbs;
    public static zzel<Boolean> zzbt;
    public static zzel<Boolean> zzbu;
    public static zzel<Boolean> zzbv;
    public static zzel<Boolean> zzbw;
    public static zzel<Boolean> zzbx;
    public static zzel<Boolean> zzby;
    public static zzel<Boolean> zzbz;
    public static zzel<Long> zzc;
    public static zzel<Boolean> zzca;
    public static zzel<Boolean> zzcb;
    public static zzel<Boolean> zzcc;
    public static zzel<Boolean> zzcd;
    public static zzel<Boolean> zzce;
    public static zzel<Boolean> zzcf;
    public static zzel<Boolean> zzcg;
    public static zzel<Boolean> zzch;
    public static zzel<Boolean> zzci;
    public static zzel<Boolean> zzcj;
    public static zzel<Boolean> zzck;
    public static zzel<Boolean> zzcl;
    public static zzel<Boolean> zzcm;
    public static zzel<Boolean> zzcn;
    public static zzel<Boolean> zzco;
    public static zzel<Boolean> zzcp;
    public static zzel<Boolean> zzcq;
    private static List<zzel<?>> zzcr = Collections.synchronizedList(new ArrayList());
    private static Set<zzel<?>> zzcs = Collections.synchronizedSet(new HashSet());
    private static zzel<Boolean> zzct;
    private static zzel<Boolean> zzcu;
    public static zzel<Long> zzd;
    public static zzel<String> zze;
    public static zzel<String> zzf;
    public static zzel<Integer> zzg;
    public static zzel<Integer> zzh;
    public static zzel<Integer> zzi;
    public static zzel<Integer> zzj;
    public static zzel<Integer> zzk;
    public static zzel<Integer> zzl;
    public static zzel<Integer> zzm;
    public static zzel<Integer> zzn;
    public static zzel<Integer> zzo;
    public static zzel<Integer> zzp;
    public static zzel<String> zzq;
    public static zzel<Long> zzr;
    public static zzel<Long> zzs;
    public static zzel<Long> zzt;
    public static zzel<Long> zzu;
    public static zzel<Long> zzv;
    public static zzel<Long> zzw;
    public static zzel<Long> zzx;
    public static zzel<Long> zzy;
    public static zzel<Long> zzz;

    public static Map<String, String> zza(Context context) {
        com.google.android.gms.internal.measurement.zzbx zza2 = com.google.android.gms.internal.measurement.zzbx.zza(context.getContentResolver(), com.google.android.gms.internal.measurement.zzcm.zza("com.google.android.gms.measurement"));
        return zza2 == null ? Collections.emptyMap() : zza2.zza();
    }

    @VisibleForTesting
    private static <V> zzel<V> zza(String str, V v, V v2, zzej<V> zzejVar) {
        zzel<V> zzelVar = new zzel<>(str, v, v2, zzejVar);
        zzcr.add(zzelVar);
        return zzelVar;
    }

    static {
        Boolean bool = Boolean.TRUE;
        zza = zza("measurement.upload_dsid_enabled", bool, bool, zzas.zza);
        zzb = zza("measurement.ad_id_cache_time", 10000L, 10000L, zzar.zza);
        zzc = zza("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, zzbe.zza);
        zzd = zza("measurement.config.cache_time", 86400000L, 3600000L, zzbn.zza);
        zze = zza("measurement.config.url_scheme", "https", "https", zzca.zza);
        zzf = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", zzcj.zza);
        zzg = zza("measurement.upload.max_bundles", 100, 100, zzcw.zza);
        Integer valueOf = Integer.valueOf((int) AleCryptoBouncyCastle.MAX_RANDOM_BYTES);
        zzh = zza("measurement.upload.max_batch_size", valueOf, valueOf, zzdf.zza);
        zzi = zza("measurement.upload.max_bundle_size", valueOf, valueOf, zzds.zza);
        zzj = zza("measurement.upload.max_events_per_bundle", 1000, 1000, zzeb.zza);
        zzk = zza("measurement.upload.max_events_per_day", 100000, 100000, zzau.zza);
        zzl = zza("measurement.upload.max_error_events_per_day", 1000, 1000, zzat.zza);
        zzm = zza("measurement.upload.max_public_events_per_day", 50000, 50000, zzaw.zza);
        zzn = zza("measurement.upload.max_conversions_per_day", 500, 500, zzav.zza);
        zzo = zza("measurement.upload.max_realtime_events_per_day", 10, 10, zzay.zza);
        zzp = zza("measurement.store.max_stored_events_per_app", 100000, 100000, zzax.zza);
        zzq = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", zzba.zza);
        zzr = zza("measurement.upload.backoff_period", 43200000L, 43200000L, zzaz.zza);
        zzs = zza("measurement.upload.window_interval", 3600000L, 3600000L, zzbc.zza);
        zzt = zza("measurement.upload.interval", 3600000L, 3600000L, zzbb.zza);
        zzu = zza("measurement.upload.realtime_upload_interval", 10000L, 10000L, zzbd.zza);
        zzv = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, zzbg.zza);
        zzw = zza("measurement.upload.minimum_delay", 500L, 500L, zzbf.zza);
        zzx = zza("measurement.alarm_manager.minimum_interval", 60000L, 60000L, zzbi.zza);
        zzy = zza("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, zzbh.zza);
        zzz = zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, zzbk.zza);
        zzaa = zza("measurement.upload.initial_upload_delay_time", 15000L, 15000L, zzbj.zza);
        zzab = zza("measurement.upload.retry_time", 1800000L, 1800000L, zzbm.zza);
        zzac = zza("measurement.upload.retry_count", 6, 6, zzbl.zza);
        zzad = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, zzbo.zza);
        zzae = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, zzbq.zza);
        zzaf = zza("measurement.audience.filter_result_max_count", 200, 200, zzbp.zza);
        zzag = zza("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, zzbs.zza);
        Boolean bool2 = Boolean.FALSE;
        zzah = zza("measurement.test.boolean_flag", bool2, bool2, zzbr.zza);
        zzai = zza("measurement.test.string_flag", "---", "---", zzbu.zza);
        zzaj = zza("measurement.test.long_flag", -1L, -1L, zzbt.zza);
        zzak = zza("measurement.test.int_flag", -2, -2, zzbw.zza);
        Double valueOf2 = Double.valueOf(-3.0d);
        zzal = zza("measurement.test.double_flag", valueOf2, valueOf2, zzbv.zza);
        zzam = zza("measurement.experiment.max_ids", 50, 50, zzby.zza);
        zzan = zza("measurement.validation.internal_limits_internal_event_params", bool2, bool2, zzbx.zza);
        zzao = zza("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", bool2, bool2, zzbz.zza);
        zzap = zza("measurement.client.sessions.session_id_enabled", bool, bool, zzcc.zza);
        zzaq = zza("measurement.service.sessions.session_number_enabled", bool, bool, zzcb.zza);
        zzar = zza("measurement.client.sessions.background_sessions_enabled", bool, bool, zzce.zza);
        zzas = zza("measurement.client.sessions.remove_expired_session_properties_enabled", bool, bool, zzcd.zza);
        zzat = zza("measurement.service.sessions.session_number_backfill_enabled", bool, bool, zzcg.zza);
        zzau = zza("measurement.service.sessions.remove_disabled_session_number", bool, bool, zzcf.zza);
        zzav = zza("measurement.client.sessions.start_session_before_view_screen", bool, bool, zzci.zza);
        zzaw = zza("measurement.client.sessions.check_on_startup", bool, bool, zzch.zza);
        zzax = zza("measurement.collection.firebase_global_collection_flag_enabled", bool, bool, zzck.zza);
        zzay = zza("measurement.collection.efficient_engagement_reporting_enabled", bool2, bool2, zzcm.zza);
        zzaz = zza("measurement.collection.redundant_engagement_removal_enabled", bool2, bool2, zzcl.zza);
        zzba = zza("measurement.personalized_ads_signals_collection_enabled", bool, bool, zzco.zza);
        zzbb = zza("measurement.personalized_ads_property_translation_enabled", bool, bool, zzcn.zza);
        zzbc = zza("measurement.upload.disable_is_uploader", bool, bool, zzcq.zza);
        zzbd = zza("measurement.experiment.enable_experiment_reporting", bool, bool, zzcp.zza);
        zzbe = zza("measurement.collection.log_event_and_bundle_v2", bool, bool, zzcs.zza);
        zzbf = zza("measurement.quality.checksum", bool2, bool2, null);
        zzbg = zza("measurement.module.collection.conditionally_omit_admob_app_id", bool, bool, zzcr.zza);
        zzbh = zza("measurement.sdk.dynamite.use_dynamite2", bool2, bool2, zzcu.zza);
        zzbi = zza("measurement.sdk.dynamite.allow_remote_dynamite", bool2, bool2, zzct.zza);
        zzbj = zza("measurement.sdk.collection.validate_param_names_alphabetical", bool2, bool2, zzcv.zza);
        zzbk = zza("measurement.collection.event_safelist", bool, bool, zzcy.zza);
        zzbl = zza("measurement.service.audience.scoped_filters_v27", bool2, bool2, zzcx.zza);
        zzbm = zza("measurement.service.audience.session_scoped_event_aggregates", bool2, bool2, zzda.zza);
        zzbn = zza("measurement.service.audience.session_scoped_user_engagement", bool2, bool2, zzcz.zza);
        zzbo = zza("measurement.service.audience.scoped_engagement_removal_when_session_expired", bool, bool, zzdc.zza);
        zzbp = zza("measurement.client.audience.scoped_engagement_removal_when_session_expired", bool, bool, zzdb.zza);
        zzbq = zza("measurement.service.audience.remove_disabled_session_scoped_user_engagement", bool2, bool2, zzde.zza);
        zzbr = zza("measurement.service.audience.use_bundle_timestamp_for_property_filters", bool2, bool2, zzdd.zza);
        zzbs = zza("measurement.service.audience.fix_prepending_previous_sequence_timestamp", bool2, bool2, zzdg.zza);
        zzct = zza("measurement.service.audience.invalidate_config_cache_after_app_unisntall", bool2, bool2, zzdi.zza);
        zzbt = zza("measurement.service.audience.fix_skip_audience_with_failed_filters", bool, bool, zzdh.zza);
        zzbu = zza("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool, bool, zzdk.zza);
        zzbv = zza("measurement.app_launch.event_ordering_fix", bool2, bool2, zzdj.zza);
        zzbw = zza("measurement.sdk.collection.last_deep_link_referrer", bool2, bool2, zzdm.zza);
        zzbx = zza("measurement.sdk.collection.last_deep_link_referrer_campaign", bool2, bool2, zzdl.zza);
        zzby = zza("measurement.sdk.collection.last_gclid_from_referrer", bool2, bool2, zzdo.zza);
        zzbz = zza("measurement.sdk.collection.worker_thread_referrer", bool, bool, zzdn.zza);
        zzca = zza("measurement.upload.file_lock_state_check", bool2, bool2, zzdq.zza);
        zzcb = zza("measurement.sampling.calculate_bundle_timestamp_before_sampling", bool, bool, zzdp.zza);
        zzcc = zza("measurement.ga.ga_app_id", bool2, bool2, zzdr.zza);
        zzcd = zza("measurement.lifecycle.app_backgrounded_tracking", bool2, bool2, zzdu.zza);
        zzce = zza("measurement.lifecycle.app_in_background_parameter", bool2, bool2, zzdt.zza);
        zzcf = zza("measurement.integration.disable_firebase_instance_id", bool2, bool2, zzdw.zza);
        zzcg = zza("measurement.lifecycle.app_backgrounded_engagement", bool2, bool2, zzdv.zza);
        zzch = zza("measurement.service.fix_gmp_version", bool2, bool2, zzdy.zza);
        zzci = zza("measurement.collection.service.update_with_analytics_fix", bool2, bool2, zzdx.zza);
        zzcj = zza("measurement.service.disable_install_state_reporting", bool2, bool2, zzea.zza);
        zzck = zza("measurement.service.use_appinfo_modified", bool2, bool2, zzdz.zza);
        zzcu = zza("measurement.upload.dsid_reflection_failure_logging", bool, bool, zzec.zza);
        zzcl = zza("measurement.client.firebase_feature_rollout.v1.enable", bool, bool, zzee.zza);
        zzcm = zza("measurement.client.sessions.check_on_reset_and_enable", bool2, bool2, zzed.zza);
        zzcn = zza("measurement.config.string.always_update_disk_on_set", bool2, bool2, zzeg.zza);
        zzco = zza("measurement.scheduler.task_thread.cleanup_on_exit", bool2, bool2, zzef.zza);
        zzcp = zza("measurement.upload.file_truncate_fix", bool2, bool2, zzei.zza);
        zzcq = zza("measurement.lifecycle.app_background_timestamp_when_backgrounded", bool, bool, zzeh.zza);
    }
}