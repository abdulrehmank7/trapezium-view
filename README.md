# Trapezium-View
[![](https://jitpack.io/v/blessedCode07/trapezium-view.svg)](https://jitpack.io/#blessedCode07/trapezium-view)
<br>
Easily add Trapezium view in your layout.

<img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/Screenshot_20201129-120311.png" width="30%" height="30%"> <img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/Screenshot_20201129-120523.png" width="30%" height="30%"> 

## Including in your project

#### build.gradle

```gradle

dependencies {

    implementation 'com.github.blessedCode07:trapezium-view:1.0'
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
    
<img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/Group%203.png" width="40%" height="40%">

* ### Orientation
<img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/Group%2011.png" width="30%" height="30%"> <img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/Group%2012.png" width="30%" height="30%">


<img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/Group%2013.png" width="30%" height="30%"> <img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/Group%2014.png" width="30%" height="30%">


<img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/Group%2015.png" width="30%" height="30%"> <img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/Group%2016.png" width="30%" height="30%">


<img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/Group%2017.png" width="30%" height="30%"> <img src="https://github.com/blessedCode07/trapezium-view/blob/master/screens/Group%2018.png" width="30%" height="30%">


## Find this library useful? :heart:

Support it by :star: for this repository.
