package com.wyre.FreeGeo;


import com.google.gson.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class is used to instantiate and set up the Api and Receive an Array list containg GeoPlace
 * Created by yaakov on 9/24/17.
 */
public class FreeGeo {
    private ArrayList<GeoPlace> GeoPlaces = new ArrayList<>();

    /**
     * This method is used to retreive the ArrayList of Geo Places
     * @return List Of GeoPlaces
     */
    public ArrayList<GeoPlace> getPlaces(){
    return GeoPlaces;
}
    /**
     * @param LocationQuery The Address of the location that you would like to GeoCode, this can be a house, street, city etc
     */
    public FreeGeo(String LocationQuery) throws IOException {
        //esacape the spaces to prevent errors
        LocationQuery = LocationQuery.replace(" ", "%20");
        URL url = new URL("https://nominatim.openstreetmap.org/search.php?q=" + LocationQuery + "&format=json");
        //read the data from the url and put it into the json string
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String json = "";
        String line = "";
        while ((line = reader.readLine()) != null) {
            json = json + line;
        }
        reader.close();
        //use gson to parse the Json
        Gson gson = new Gson();
        JsonArray places = (JsonArray) new JsonParser().parse(json);
        for (JsonElement obj : places) {
            JsonObject place = obj.getAsJsonObject();
            //extract the properties from the place object and store it as a object in a GeoPlace
            GeoPlace geoPlace = new GeoPlace();
            geoPlace.setPlace_id(place.get("place_id").toString());
            geoPlace.setLicence(place.get("licence").toString());
            geoPlace.setOsm_type(place.get("osm_type").toString());
            geoPlace.setOsm_id(place.get("osm_id").toString());
            JsonArray arr = place.get("boundingbox").getAsJsonArray();
            //create the bounding box inner class and fill it with the values from the json Array
            GeoPlace.BoundingBox box = geoPlace.new BoundingBox();
            box.setLatStart(Double.valueOf(arr.get(0).toString().replace("\"","")));
            box.setLatEnd(Double.valueOf(arr.get(1).toString().replace("\"","")));
            box.setLonStart(Double.valueOf(arr.get(2).toString().replace("\"","")));
            box.setLonEnd(Double.valueOf(arr.get(3).toString().replace("\"","")));
            //set the bounding box as the box for the GeoPlace
            geoPlace.setBoundingBox(box);
            geoPlace.setLat(Double.valueOf(place.get("lat").toString().replace("\"","")));
            geoPlace.setLon(Double.valueOf(place.get("lon").toString().replace("\"","")));
            geoPlace.setDisplay_name(place.get("display_name").toString());
            geoPlace.setClass(place.get("class").toString());
            geoPlace.setType(place.get("type").toString());
            geoPlace.setImportance(Double.parseDouble(place.get("importance").toString()));
//add the geoPlace to the array
            GeoPlaces.add(geoPlace);
        }

    }

    public ArrayList<GeoPlace> getGeoPlaces() {
        return GeoPlaces;
    }

    public void setGeoPlaces(ArrayList<GeoPlace> geoPlaces) {
        GeoPlaces = geoPlaces;
    }


}
