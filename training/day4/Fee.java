package com.trimindtech.training.day4;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Fee {
    public int noofmembers;
   private String groupname ;

    public int getNoofmembers() {
        return noofmembers;
    }

    public void setNoofmembers(int noofmembers) {
        this.noofmembers = noofmembers;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getProjecttitle() {
        return projecttitle;
    }

    public void setProjecttitle(String projecttitle) {
        this.projecttitle = projecttitle;
    }

    public int getFeepermember() {
        return feepermember;
    }

    public void setFeepermember(int feepermember) {
        this.feepermember = feepermember;
    }

    private String projecttitle;

    public Fee(int noofmembers, String groupname, String projecttitle, int feepermember) {
        this.noofmembers = noofmembers;
        this.groupname = groupname;
        this.projecttitle = projecttitle;
        this.feepermember = feepermember;
    }

    private  int feepermember;






    public void calcCollectionPerGroup(){
        double calcCollectionPerGroup =feepermember*noofmembers;
        System.out.println(calcCollectionPerGroup);

    }
    public String toString(){
        return getNoofmembers()+"/n"+getFeepermember()+"/n"+getGroupname()+"/n"+getProjecttitle();
    }


}
