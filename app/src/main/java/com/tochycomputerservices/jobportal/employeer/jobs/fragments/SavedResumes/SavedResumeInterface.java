package com.tochycomputerservices.jobportal.employeer.jobs.fragments.SavedResumes;

public interface SavedResumeInterface {
    void onDelete(String id,int position);
    void onView(String id);
    void onDownload(String url);
}
