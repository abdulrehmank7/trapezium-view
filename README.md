# Trapezium-View
[![](https://jitpack.io/v/abdulrehmank7/trapezium-view.svg)](https://jitpack.io/#abdulrehmank7/trapezium-view)
<br>
Easily add Trapezium view in your layout.

<img src="https://github.com/abdulrehmank7/trapezium-view/blob/master/screens/Web%201280%20%E2%80%93%201.png" width="90%" height="90%">

## Including in your project

#### build.gradle

```gradle

dependencies {
	        
    implementation 'com.github.abdulrehmank7:trapezium-view:1.0'

}

```

### Add it in your root build.gradle at the end of repositories:

```gradle

allprojects {

  repositories {
    ...
    maven { url 'https://jitpack.io' }
    }
}

```

### Use Trapezium-View in your project

Easily can use `Trapezium-View` with different orientation.<br>


```gradle

 <com.arkapp.trapeziumview.TrapeziumCustomView
        android:id="@+id/trapeziumCustomView"
        android:layout_width="match_parent"
        android:layout_height="350dp"
        android:layout_margin="16dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:shapeColor="@color/teal_200"
        app:edgeRadius="18"
        app:slopeLength="88"
        app:slopeType="bottomRight" />

```

* ### Configure Parameters using xml attributes:

    <table>
    <th>Attribute Name</th>
    <th>Default Value</th>
    <th>Description</th>
    <tr>
        <td> app:shapeColor="@color/green"</td>
        <td>Red</td>
        <td>Set the bacground color of the trapezium.</td>
    </tr>
    <tr>
        <td>app:edgeRadius="8"</td>
        <td>8dp</td>
        <td>Radius of the edges of the trapezium.</td>
    </tr>
    <tr>
        <td>app:slopeLength="88"</td>
        <td>58dp</td>
        <td>The length of the trapezium slope.</td>
    </tr>
    <tr>
        <td>app:slopeType="bottomRight"</td>
        <td>bottomRight</td>
        <td>Orientation of trapezium slope (topRight, topLeft, bottomRight, bottomLeft etc.)</td>
    </tr>
    </table>
    
<img src="https://github.com/abdulrehmank7/trapezium-view/blob/master/screens/trapazium1.png" width="40%" height="40%">

* ### Orientation
<img src="https://github.com/abdulrehmank7/trapezium-view/blob/master/screens/trapazium2.png" width="50%" height="50%">


<img src="https://github.com/abdulrehmank7/trapezium-view/blob/master/screens/trapazium3.png" width="50%" height="50%">


<img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/trapazium4.png" width="50%" height="50%">


<img src="https://github.com/abdulrehmank7/trapezium-view/blob/master/screens/trapazium5.png" width="50%" height="50%">


## Find this library useful? :heart:

Support it by :star: for this repository.
</br></br>
<a href="https://www.buymeacoffee.com/arkapp" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;" ></a>
