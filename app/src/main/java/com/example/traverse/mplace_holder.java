package com.example.traverse;

public class mplace_holder {

    String mname;
    String mplacename;
    String mdescription;
    int mimageresourceid;
    int mstars;

    public mplace_holder(String name, String placename, String description, int imageresourceid, int stars){
        mname=name;
        mplacename=placename;
        mdescription=description;
        mimageresourceid=imageresourceid;
        mstars=stars;
    }
    public static final mplace_holder[] places = {
            new mplace_holder("Kempty falls","Mussoorie","Place holder data",R.drawable.kempty_falls,R.drawable.star4),
            new mplace_holder("Road Trip","Mussoorie","Place holder data",R.drawable.road_trip,R.drawable.star5)

    };

    public int getMimageresourceid() {
        return mimageresourceid;
    }

    public int getMstars() {
        return mstars;
    }

    public String getMdescription() {
        return mdescription;
    }

    public String getMname() {
        return mname;
    }

    public String getMplacename() {
        return mplacename;
    }
}
