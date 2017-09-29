# FreeGeo

A easy to use and free Geo Coding Library for java

## Getting Started

To get started, use the build JAR option in IDEA to generate a jar file and then add that jar file as a dependancy to your project


### Using FreeGeo

In Order to use FreeGeo:

1.Add the following import to your class file

```
import com.wyre.FreeGeo.*;
```

2.Instantiate the FreeGeo class passing in a string containing the location you want to Geo Code
(make sure to either catch the IOException, or throw it)

```
FreeGeo myGeo = new FreeGeo("Kings Highway");
```

3.Use the getPlaces() method to get a ArrayList of GeoPlaces, these are the result from your query and you can acsess all the properties to get the results

```
myGeo.getPlaces();
```

## Built With

* [Neominatim](https://nominatim.openstreetmap.org/) - The Nominatim Geo Coding Service

## Authors

*GreatJack

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
