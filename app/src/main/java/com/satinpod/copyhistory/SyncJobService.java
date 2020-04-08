package com.satinpod.copyhistory;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.util.Log;


/**
 * @author Ravishankar Ahirwar
 * @since 13/03/2018
 */
@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class SyncJobService extends JobService {

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.v(MyUtil.PACKAGE_NAME, "Start Clean up...");
        return Storage.getInstance(this).cleanUpAndRequestBackup();
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
