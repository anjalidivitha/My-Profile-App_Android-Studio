# My Profile App_Android Studio

This Mobile Application was built as a fun exercise to brush my Android Studio skills.

The application is curated in 3 screens, 'My profile screen' , 'Work Experience' and 'Education' screen.

`AndroidManifest.xml` holds the root of the project source set. It includes app's package name which matches with the code's namespace and all the activities and code entities location involved in the project.

## My profile Screen
This would be the home screen of the app which includes basic information of a person. 

It will display his/her square picture, name, email ID, contact number, an 'Education' button and a 'Work Experience' button. 

`MainActivity.kt` triggers `homescreen.xml` and holds all the functionalities of both the buttons `education.kt`, `work.kt` and the picture `profile_photo.kt`



<p align="center">
<img src="https://user-images.githubusercontent.com/42372406/87569610-014f3500-c6e5-11ea-803d-b3f353a5b047.jpeg" width="200" height="400">
</p>


## Education Screen
`education.kt` acts as an instance and triggers `activity_education.xml` when education button is clicked to display contents on education screen.

`activity_education.xml` includes the layout and other dimensional parameters.


<p align="center">
<img src="https://user-images.githubusercontent.com/42372406/87572530-51c89180-c6e9-11ea-87dc-9a4e2bd32ca5.jpeg" width="200" height="400">
</p>

## Work Experience Screen
Similar to Education screen, `work.kt` triggers `activity_work.xml` when work experience button is clicked to display the contents on work experience screen.

`activity_work.xml` includes the layout and other dimensional parameters.



<p align="center">
<img src="https://user-images.githubusercontent.com/42372406/87572881-ca2f5280-c6e9-11ea-98bb-894372c89ad2.jpeg" width="200" height="400">
</p>

## Enlarging the Profile Photo
To view the square picture on full-screen mode, `profile_photo.kt` triggers `activity_profile_photo.xml` to enlarge the picture.


<p align="center">
<img src="https://user-images.githubusercontent.com/42372406/87573282-4de93f00-c6ea-11ea-9758-f9532fb3fb75.jpeg" width="200" height="400">
</p>

## Others
- `colors.xml` resource carries a hexadecimal color value.
- `strings.xml` is capable of applying styling markup and formatting strings.
- `styles.xml` defines and formats look for a UI.
- `v24-ic_launcher_foreground.xml` is responsible for the foreground color mix.
- `ic_launcher_background.xml` sets the background color of the UI.
