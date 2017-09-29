package com.wyre.FreeGeo;

/**
 * This class is the model class for the neominatim geocoding api
 * Created by yaakov on 9/24/17.
 */
public class GeoPlace {
    /**
     * This nested class represents the bounding box for minimum and maximum latitude and longitude
     */
    public class BoundingBox{
        private double LatStart;
        private double LatEnd;
        private double LonStart;
        private double LonEnd;

        public double getLatStart() {
            return LatStart;
        }

        public void setLatStart(double latStart) {
            LatStart = latStart;
        }

        public double getLatEnd() {
            return LatEnd;
        }

        public void setLatEnd(double latEnd) {
            LatEnd = latEnd;
        }

        public double getLonStart() {
            return LonStart;
        }

        public void setLonStart(double lonStart) {
            LonStart = lonStart;
        }

        public double getLonEnd() {
            return LonEnd;
        }

        public void setLonEnd(double lonEnd) {
            LonEnd = lonEnd;
        }


    }
    private String mPlace_id;
    private String mLicence;
    private String mOsm_type;
    private String mOsm_id;
    private BoundingBox mBoundingBox;
    private double Lat;
    private double Lon;
    private String mDisplay_name;
    private String mClass;
    private String mType;

    private double mImportance;
    public String getPlace_id() {
        return mPlace_id;
    }

    public void setPlace_id(String place_id) {
        mPlace_id = place_id;
    }

    public String getLicence() {
        return mLicence;
    }

    public void setLicence(String licence) {
        mLicence = licence;
    }

    public String getOsm_type() {
        return mOsm_type;
    }

    public void setOsm_type(String osm_type) {
        mOsm_type = osm_type;
    }

    public String getOsm_id() {
        return mOsm_id;
    }

    public void setOsm_id(String osm_id) {
        mOsm_id = osm_id;
    }

    public BoundingBox getBoundingBox() {
        return mBoundingBox;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        mBoundingBox = boundingBox;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLon() {
        return Lon;
    }

    public void setLon(double lon) {
        Lon = lon;
    }

    public String getDisplay_name() {
        return mDisplay_name;
    }

    public void setDisplay_name(String display_name) {
        mDisplay_name = display_name;
    }

    public String getmClass() {
        return mClass;
    }

    public void setClass(String aClass) {
        mClass = aClass;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public double getImportance() {
        return mImportance;
    }

    public void setImportance(double importance) {
        mImportance = importance;
    }

}
