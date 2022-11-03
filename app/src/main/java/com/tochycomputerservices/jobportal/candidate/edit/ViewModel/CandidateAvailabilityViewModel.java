package com.tochycomputerservices.jobportal.candidate.edit.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tochycomputerservices.jobportal.candidate.edit.Repositories.CandidateAvailabilityRepository;
import com.tochycomputerservices.jobportal.candidate.edit.models.CandidateAvailabilityList;

public class CandidateAvailabilityViewModel extends ViewModel {
    MutableLiveData<CandidateAvailabilityList> candAvailData;
    CandidateAvailabilityRepository repository;


    public void init(){
        repository = CandidateAvailabilityRepository.getInstance();
        candAvailData = repository.getCandidateAvailability();
    }

    public LiveData<CandidateAvailabilityList> getCandidateAvailability(){
        return candAvailData;
    }
}
