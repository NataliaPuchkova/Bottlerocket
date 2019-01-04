# Bottlerocket

## Requirements
- You have information on videos for a show, a list of images associated with a show, and a list of video ads associated with a show all considered "assets".
- Each asset has an ID, a name, a type indicator, a URL, and an expiration date.
- Videos have a field that indicates if it is a movie, a full episode or a clip.
- Image assets can be represented by a base asset.
- Ad assets include a field for a product description.
- Containers describe a collection of assets.
- Containers can be considered a "show" with information that includes an ID, name, description, and assets.

## Development

This application is built with the following:
- java 11.0.1 2018-10-16 LTS (used javac / java utilities)
- library: Apache Commons Lang 3.8.1

## Assumption

###### Tools
Goal: create application with the mimimum functionality enougth for the task (no additional things)
- No use additional framework/libs (except Apache Commons Lang for hashcode/equals building)
- No use additional building tools (only javac and java)
- No use EDI 
- No create tests - no in the requirements 

###### Requirement

- Asset is an abstraction class which describe an characteristics and beheivor of assets
- Videos has two extra types (expiration date and indicator represents either movie, full episode or clip indicator).
- Video ads has one extra type (product description), video ad is a video + extra field.
- Containers contains list of videos, images and video ads.
- Containers are created by ContainerFactory class, which has a list of containers
- Main class shows an example of container creation (at least one container with each types of assets)
- Application prints into standard console using System.out.print metho (uses print method and interface Printable).
- A show contains an id, name, description each containers in the container list and list of assets. Id is integer. 

###### Environement
- Java is installed (8 version is minimum)
- Classpath is set up to the lib directory as well like that 
```
export CLASSPATH=%CLASSPATH:<Path to lib directory>
```
## Next level of abstractions:

- The application may be created using Spring boot as REST API which will return data about containers as json format built with gradle with list of tests: unit tests + integration test with boundery checking, date working, particular Exception creation. We can put this app in the container and it will be real container with information about videos 

** Will create if you need it.**

## Building
```
cd <folder with the project>
javac -d bin -cp ".:lib/commons-lang3-3.8.1.jar:assets/*" Main.java
cd bin
java Main
```
## Result
Result is output into standard console.
```
Container id:1, name:Show 1, description:Wonderful show, Assets:
Video: id=1, name=Movie 1, url=url1, expirationDate=01/01/2012, type=Clip
Video: id=2, name=Movie 3, url=url2, expirationDate=01/10/2012, type=Full episode
Image: id=3, name=Image 1, url=url3, expirationDate=01/20/2012
Image: id=4, name=Image 2, url=url4, expirationDate=01/02/2012
Ad: id=5, name=Ad 1, url=url5, expirationDate=03/09/2012, Clip, productDescription=description 1
Ad: id=6, name=Ad 2, url=url6, expirationDate=, Full episode, productDescription=description 2
-----------------------------
```
