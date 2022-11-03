package com.tochycomputerservices.jobportal.candidate.edit.Repositories;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.tochycomputerservices.jobportal.candidate.edit.models.CandidateAvailabilityList;
import com.tochycomputerservices.jobportal.manager.Nokri_RequestHeaderManager;
import com.tochycomputerservices.jobportal.network.Nokri_ServiceGenerator;
import com.tochycomputerservices.jobportal.rest.RestService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CandidateAvailabilityRepository {
    private static CandidateAvailabilityRepository mInstance;
    public static CandidateAvailabilityRepository getInstance(){
        if (mInstance ==null){
            return new CandidateAvailabilityRepository();
        }
        return mInstance;
    }

    public MutableLiveData<CandidateAvailabilityList> getCandidateAvailability(){

        final MutableLiveData<CandidateAvailabilityList> liveData = new MutableLiveData();

        RestService restService = Nokri_ServiceGenerator.createService(RestService.class);
        Call<CandidateAvailabilityList> call;
        call = restService.getCandidateAvailability(Nokri_RequestHeaderManager.addSocialHeaders());

        call.enqueue(new Callback<CandidateAvailabilityList>() {
            @Override
            public void onResponse(Call<CandidateAvailabilityList> call, Response<CandidateAvailabilityList> response) {
                if (response.isSuccessful()){
                    liveData.setValue(response.body());
                }else{
                    liveData.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<CandidateAvailabilityList> call, Throwable t) {
                Log.e("Throwable" ,t.getMessage());
                liveData.setValue(null);
            }
        });

        return liveData;
    }
}
